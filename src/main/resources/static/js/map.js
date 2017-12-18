//定义全局变量
var map = new AMap.Map('container', {
    resizeEnable: true,
    center: [108.88, 34.34],
    zoom: 15
});
var objLIn ;		//选中需要删除的线段
var objMarker;		//选中需要删除的marker标记


//初始方法的加载
function onload(){
    //后台回去最新数据
    var url ="../MapController/ajaxGetAll.do";
    $.ajax({
        type:"POST",
        url:url,
        dataType:"html",
        success:function(date){
            console.log(date);
        },error:function(){
            alert("系统出错了！");
        }
    });
    var data_info =
        [
            {
                "oid":"qwerty",
                "startx_axis": "104.06",
                "starty_axis": "30.57",
                "startcityName": "cd",
                "startcityName_zh": "成都",
                "passx_axis": "114.27",
                "passy_axis": "30.58",
                "passcityName": "wh",
                "startimgName":"cd",
                "passcityName_zh": "武汉",
                "direction": "cd-wh",
                "DeviceNam": "OSL6200",
                "deviceInfo": "OSL6200的相关一些信息，后续扩展"
            }, {
            "oid":"qwesdf",
            "startx_axis": "108.88",
            "starty_axis": "34.34",
            "startcityName": "xa",
            "startcityName_zh": "西安",
            "startimgName":"xa",
            "passx_axis": "114.49",
            "passy_axis": "38.01",
            "passcityName": "sjz",
            "passcityName_zh": "石家庄",
            "direction": "xa-sjz",
            "DeviceNam": "OSL6200",
            "deviceInfo": "OSL6200的相关一些信息，后续扩展"
        },{
            "oid":"qwengf",
            "startx_axis": "114.27",
            "starty_axis": "30.58",
            "startcityName": "wh",
            "startcityName_zh": "武汉",
            "startimgName":"wh",
            "passx_axis": "108.88",
            "passy_axis": "34.34",
            "passcityName": "xa",
            "passcityName_zh": "西安",
            "direction": "wh-xa",
            "DeviceNam": "OSL6200",
            "deviceInfo": "OSL6200的相关一些信息，后续扩展"
        },{
            "oid":"qwenltrg",
            "startx_axis": "114.27",
            "starty_axis": "30.58",
            "startcityName": "wh",
            "startcityName_zh": "武汉",
            "startimgName":"wh",
            "passx_axis": "113.42",
            "passy_axis": "34.44",
            "passcityName": "zz",
            "passcityName_zh": "郑州",
            "direction": "wh-xa",
            "DeviceNam": "OSL6200",
            "deviceInfo": "OSL6200的相关一些信息，后续扩展"
        }

        ];

    var lines =[];//所有线段关系的坐标及城市城市名
    var point = [];
    var pointCity =[];//所有标记点坐标及对应城市名
    for (var i = 0; i < data_info.length; i++) {
        var startpoint = new AMap.LngLat(data_info[i].startx_axis, data_info[i].starty_axis);//起始城市坐标
        var endpoint = new AMap.LngLat(data_info[i].passx_axis, data_info[i].passy_axis);
        var saxis ={"X":data_info[i].startx_axis,"Y":data_info[i].starty_axis};
        var yaxis ={"X":data_info[i].passx_axis,"Y":data_info[i].passy_axis};
        point.push(saxis);
        point.push(yaxis);
        var ponitp1 ={"point":saxis,"cityName":data_info[i].startcityName};
        var ponitp2 ={"point":yaxis,"cityName":data_info[i].passcityName};
        pointCity.push(ponitp1);
        pointCity.push(ponitp2);
        var line ={
            "oid":data_info[i].oid,
            "start":{
                "startcityName": data_info[i].startcityName,
                "startcityName_zh":data_info[i].startcityName_zh,
                "start_axis":{"x":data_info[i].startx_axis,"y":data_info[i].starty_axis},
                "deviceInfo":data_info[i].deviceInfo
            } ,
            "pass":{
                "passcityName": data_info[i].passcityName,
                "passcityName_zh":data_info[i].passcityName_zh,
                "pass_axis":{"x":data_info[i].passx_axis,"y":data_info[i].passy_axis},
                "deviceInfo":data_info[i].deviceInfo
            }
        };
        lines.push(line);
    }

    /*标记坐标及坐标点名称*/
    var pointAll = [];
    var hash = {};
    for (var i = 0; i < pointCity.length; i++) {
        var str = JSON.stringify(pointCity[i].point);
        if (!hash[str]) {
            pointAll.push(pointCity[i]);
            hash[str] = true;
        }
    }
    /*对应坐标点城市绑定数据*/
    var dataInfo =[];
    for (var i = 0; i < pointAll.length; i++) {
        var cityName = pointAll[i].cityName;
        for (var j = 0; j < lines.length; j++) {
            var startCity = lines[j].start.startcityName;
            var passCity = lines[j].pass.passcityName;
            if (cityName == startCity || cityName == passCity) { //cd
                var cityin ={"cityName":cityName,"axis":pointAll[i].point,"info":lines[j]}
                dataInfo.push(cityin);
            }
        }
    }
    /*画线段区域*/
    var polylineArr =[];
    var lineArr = [];
    for (var i = 0; i < lines.length; i++) {
        var lineArr = [];
        var startAxis = lines[i].start.start_axis;
        var passsAxis = lines[i].pass.pass_axis;
        var startpoint = new AMap.LngLat(startAxis.x, startAxis.y);
        var passpoint = new AMap.LngLat(passsAxis.x, passsAxis.y);
        lineArr.push(startpoint);
        lineArr.push(passpoint);
        var polyline = new AMap.Polyline({
            path : lineArr, //设置线路径
            strokeColor : "#3366FF", //线颜色
            strokeOpacity : 1, //线透明度
            strokeWeight : 8, //线宽
            strokeStyle : "solid", //线样式
            strokeDasharray : [ 10, 6 ], //补充线样式
            showDir : true//显示线上的箭头
        });
        polyline.setMap(map);
        polyline.on('click', removepolyline);
        polylineArr.push(polyline);
    }




    function removepolyline(e) {
        var path =e.target.getPath();
        objLIn = e.target;
        openInfo(path);
    }

    var promptInfo = new AMap.InfoWindow({	//删除提示信息
        isCustom : true, //使用自定义窗体
        offset : new AMap.Pixel(16, -45)
    });

    //在指定位置打开默认信息窗体
    function openInfo(path){
        var X_axis = (path[0].getLng()+path[1].getLng())/2;
        var Y_axis = (path[0].getLat()+path[1].getLat())/2;
        //构建信息窗体中显示的内容
        var info2 = [];
        info2.push("<div style=\"padding:3px 12px 6px 20px;\"><span style=\"display: block;\"><b>删除提示：</b></span>");
        info2.push("<span style=\"display: block;\">是否要删除该线路？</span>");
        info2.push("<div><input id =\"deleteLine\" value =\"0\" type =\"hidden\"><span class=\"editSpan\" style =\"margin-top: 8px;margin-left: 0%;\" onclick=\"isdelet()\">确定</span><span class=\"editSpan\" style =\"margin-top: -20px;margin-left: 59%;\" onclick = \"closePromt()\">关闭</span></div></div>");
        promptInfo = new AMap.InfoWindow({
            content:info2.join("<br/>")  //使用默认信息窗体框样式，显示信息内容
        });
        promptInfo.open(map,new AMap.LngLat(X_axis,Y_axis));
    }

    /*自定义显示窗体*/
    var infoWindow = new AMap.InfoWindow({
        isCustom : true, //使用自定义窗体
        offset : new AMap.Pixel(16, -45)
    });

    /*画点标记*/
    var markerAll = [];
    var showInfo = [];
    var showdata = [];
    for (var i = 0; i < pointAll.length; i++) {
        var image = '../img/mapimg/' + pointAll[i].cityName + '.png';
// 				 		var image = '../img/mapimg/mark.png';
        var markerPoint = new AMap.LngLat(pointAll[i].point.X,
            pointAll[i].point.Y);
        var marker = new AMap.Marker({ //起始城市标记
            map : map,
// 				icon : image,
            position : markerPoint,
            offset : new AMap.Pixel(-12, -36)
            //draggable:true, //是否可拖动
        });
        var title = '<span style="font-size:16px;color:#000000;">设备信息</span>';
        var showEdit = [];
        for (var j = 0; j < dataInfo.length; j++) {
            if (pointAll[i].cityName == dataInfo[j].cityName) {
                showEdit.push("<form action=\"\" method=\"post\" id=\"dataFrom_"+dataInfo[j].info.oid+"\" name=\"dataFrom\">"
                    + "<div style=\" border:1px solid #DDF3FF;margin-top:5px;\">"
                    + "<table id=\"editCityTb\" style=\"width:98%;margin-top:5px;\" class=\"editCityTb\">"
                    + "<tr>"
                    + "<td  class=\"\">"
                    + "<span id=\"startCity\" style=\"font-size:13px;\">"
                    + "<input type=\"checkbox\" name=\"ischecked\"  value=\""+dataInfo[j].info.oid+"\">起始城市:"
                    + "</span></td>"
                    + "<td class=\"inputCity\">"
                    + "<input type=\"text\" id=\"editStartCityBtn\"  name=\"editStartCityBtn\" value =\""+dataInfo[j].info.start.startcityName_zh+"\"/></td>"
                    + "<td  class=\"\">"
                    + "<span id=\"endCity\" style=\"font-size:13px;\">途径城市:"
                    + "</span></td>"
                    + "<td class=\"inputCity\">"
                    + "<input type=\"text\" id=\"editPassCityBtn\" name=\"editPassCityBtn\" value=\""+dataInfo[j].info.pass.passcityName_zh+"\"/></td>"
                    + "</tr>"
                    + "</table>"//city编辑区
                    + "<span style=\"font-size:13px;margin-top:5px;\">设备信息说明:</span>"
                    + "<div class =\"editDeviceIf\">"
                    + "<div><font color=\"#93979A\">起始城市:\""
                    + dataInfo[j].info.start.deviceInfo
                    + "\"</font></div>"
                    + "<div><font color=\"#93979A\">途径城市:\""
                    + dataInfo[j].info.start.deviceInfo
                    + "\"</font></div></div></div></form>");
            }
        }
        showEdit.push("<div><span class=\"editSpan editSpan_style\"  onclick=\"editInfo()\">编辑</span>"
            + "<span class=\"editSpan close_Style\" onclick = \"deleteInfo()\">删除</span></div></div>");
        marker.content = createInfoWindow(title, showEdit);
        marker.on('click', markerClick); //左键点击 markerClick 方法名
        marker.on('rightclick', rightclick);//右键点击
        marker.emit('click', {
            target : marker
        });
        if (i == pointAll.length - 1) {
            closeInfoWindow();	//关闭最后一个窗体
        }
    }

    function markerClick(e) {
        infoWindow.setContent(e.target.content);
        objMarker = e.target;
        infoWindow.open(map, e.target.getPosition());//打开信息窗口
        var objCheck = document.getElementsByName("ischecked");//当窗口再次被打开的时候，默认为不被选中
        for (k in objCheck) {
            if (objCheck[k].checked)
                objCheck[k].checked=false;
        }
    }

    map.setFitView();

    //构建自定义信息窗体
    function createInfoWindow(title, showEdit) {
        var info = document.createElement("div");
        info.className = "info";
        info.id = "info";
        info.style.width = "130%";
        info.style.height = "100%";

        //可以通过下面的方式修改自定义窗体的宽高
        // 定义顶部标题
        var top = document.createElement("div");
        var titleD = document.createElement("div");
        var closeX = document.createElement("img");
        top.className = "info-top";
        titleD.innerHTML = title;
        closeX.src = "../img/close.png";
        closeX.onclick = closeInfoWindow;

        top.appendChild(titleD);
        top.appendChild(closeX);
        info.appendChild(top);

        // 定义中部内容
        var middle = document.createElement("div");
        middle.className = "info-middle";
        middle.style.backgroundColor = 'white';
        middle.style.border = "1px solid #CAEDFF";
        //
        var editCity = document.createElement("div");//修改城市
        editCity.className = "editCity";
        editCity.innerHTML = getStrByArr(showEdit); //展示修改城市的多个table

        middle.appendChild(editCity);
        info.appendChild(middle);

        // 定义底部内容
        var bottom = document.createElement("div");
        bottom.className = "info-bottom";
        bottom.style.position = 'relative';
        bottom.style.top = '0px';
        bottom.style.margin = '0 auto';
        var sharp = document.createElement("img");
        sharp.src = "../img/sharp.png";
        bottom.appendChild(sharp);
        info.appendChild(bottom);
        return info;
    }
    //关闭信息窗体
    function closeInfoWindow() {
        map.clearInfoWindow();
    }

    //右键窗体
    var contextMenu = new AMap.ContextMenu(); //创建右键
    contextMenu.addItem("放大一级", function() {
        map.zoomIn();
    }, 0);
    //右键缩小
    contextMenu.addItem("缩小一级", function() {
        map.zoomOut();
    }, 1);
    function rightclick(e) {
        contextMenu.open(map, e.lnglat);//打开右键窗体
    }

}
//删除两点之间的连线
function isdelet(){
    objLIn.hide();
    var path =objLIn.getPath();
// 	console.log(path);
    /*将坐标传到后台*/
//		$.ajax({
//			type : "POST",
//			url : url,
//			dataType : "html",
//			async : true,
//			data : path,//(该数据需要拆分)
//			success : function(date) {
//				onload();
//			},
//			error : function() {
//				alert("系统出错了！");
//			}
//		});
    map.clearInfoWindow();
}
//关闭删除提示信息窗体
function closePromt() {
    map.clearInfoWindow();
}

//编辑按钮方法
function editInfo() {
    var check_val =getCheckbox();
    if(isflag(check_val)){
        var url = "../CommtentController/ajaxEditInfo.do";
        transmitData(url,check_val);
        alert("编辑");
        map.clearInfoWindow();
    }
}

//删除按钮方法
function deleteInfo() {
    var objCheck = document.getElementsByName("ischecked");
    var check_val =getCheckbox();
    if(isflag(check_val)){
        var url = "../CommtentController/ajaxEditInfo.do";
        transmitData(url,check_val);
        var deleteMarker = objMarker;
        if(objCheck.length==check_val.length){	//当选中该城市所以信息删除时
            deleteMarker.setMap(null); //但所有的信息被删除后，删除该点标记
            console.log(deleteMarker);
        }
        map.clearInfoWindow();
    }
}
//校验是否被选中
function isflag(check_val){
    if(check_val.length==0){
        alert("没选中");
        return false;
    }else{
        return true;
    }
}

/*得到checkbox被选中*/
function getCheckbox(){
    var obj = document.getElementsByName("ischecked");
    check_val = [];
    for (k in obj) {
        if (obj[k].checked)
            check_val.push(obj[k].value);
    }
    return check_val;
}

/*ajax将得到的数据传送给后台*/
function transmitData(url,check_val){
    for (var i = 0; i < check_val.length; i++) {
        $.ajax({
            type : "POST",
            url : url,
            dataType : "html",
            async : true,
// 			data : $('#dataFrom_' + check_val[i]).serialize(),
            success : function(date) {
// 				onload();//重新刷新页面
            },error : function() {
                alert("系统出错了！");
            }
        });
    }
}

/*将得到的数组转成字符串，目地去掉数组中的,*/
function getStrByArr(dataArr) {
    var dataStr = "";
    for (var i = 0; i < dataArr.length; i++) {
        dataStr += dataArr[i];
    }
    return dataStr;
}

/*登录方法*/
function login() {
    alert("登录");
}
/*添加方法区*/
function addInfo() {
    $("#container").css({
        "width" : "50%",
        "margin-right" : "1%",
        "height" : "78%",
        "margin-top" : "5%"
    });
    $("#addbtn").hide();
    $("#leftdiv").show();
}
function closeAdd() {
    $("#container").css({
        "width" : "99%",
        "height" : "80%"
    });
    $("#leftdiv").hide();
    $("#addbtn").show();
}
function addDateInfo() {
    alert("添加成功");
}
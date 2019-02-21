//判断用户名不能为空
function isNullName(){
	//获得用户名文本框中的value值
	var context=document.getElementById("ousername").value;
	var objMsg=document.getElementById("msg1");
	//判断是否为空
	if(context==""||context==null){
		objMsg.innerHTML="收货人不能为空";
		return false;
	}else{
		objMsg.innerHTML="";
		return true;
	}
}
function isNullOaddress(){
	//获得用户名文本框中的value值
	var context=document.getElementById("oaddress").value;
	var objMsg=document.getElementById("msg2");//获得id为msg1页面的元素
	//判断是否为空
	if(context==""||context==null){
		objMsg.innerHTML="地址不能为空";
		return false;
	}else{
		objMsg.innerHTML="";
		return true;
	}
}
function isNullOphone(){
	//获得用户名文本框中的value值
	var context=document.getElementById("ophone").value;
	var objMsg=document.getElementById("msg3");//获得id为msg1页面的元素
	//判断是否为空
	if(context==""||context==null){
		objMsg.innerHTML="电话不能为空";
		return false;
	}else{
		objMsg.innerHTML="";
		return true;
	}
}

function isSubmit(){
	System.out.println("++++++++=");
	if(isNullName()==false||isNullOaddress()==false||isNullOphone()==false){
		return false;
	}else{
		return true;
	}
}

var Utils = {};
Utils.addEvent = function(el, type, func) {
	if (document.addEventListener) {
		el.addEventListener(type, func, false);
	} else if (document.attachEvent) {
		el.attachEvent('on' + type, func);
	}
};
Utils.addEvent(window, 'load', function() {
	var region1 = document.getElementById("region1");
	var region2 = document.getElementById("region2");
	var region3 = document.getElementById("region3");
	for ( var i = 0; i < arrCity.length; i++) {
		region1.options[i] = new Option(arrCity[i].name, arrCity[i].name);
	}
	region2.options[0] = new Option("请选择", "请选择");
	region3.options[0] = new Option("请选择", "请选择");
	region3.style.display = "none";
	Utils.addEvent(region1, 'change', function() {
		var region1_obj = arrCity[region1.selectedIndex];
		var region2_arr = region1_obj.sub;
		region2.options.length = 0;
		region3.options.length = 0;
		region3.style.display = "none";
		for ( var i = 0; i < region2_arr.length; i++) {
			region2.options[i] = new Option(region2_arr[i].name, region2_arr[i].name);
		}
	});
	Utils.addEvent(region2, 'change', function() {
		var region1_obj = arrCity[region1.selectedIndex];
		var region2_obj = region1_obj.sub[region2.selectedIndex];
		var region3_arr = region2_obj.sub;
		if (region2_obj.type == 0) {
			region3.options.length = 0;
			region3.style.display = "inline";
			for ( var i = 0; i < region3_arr.length; i++) {
				region3.options[i] = new Option(region3_arr[i].name, region3_arr[i].name);
			}
		} else {
			region3.style.display = "none";
		}
	});
});
function isNullAid(){
	var context=document.getElementById("aid").value;
	var objMsg=document.getElementById("msg1");
	if(context==""||context==null){
		objMsg.innerHTML="用户名不能为空";
		return false;
	}else{
		objMsg.innerHTML="";
		return true;
	}
}
function isNullPass(){
	var context=document.getElementById("apass").value;
	var objMsg=document.getElementById("msg2");
	if(context==""||context==null){
		objMsg.innerHTML="密码不能为空";
		return false;
	}else{
		objMsg.innerHTML="";
		return true;
	}
}
function isSameAid(){
	if(isNullAid()==true){
		var context=document.getElementById("aid").value;
		var str="aid="+context;
		var url="AjaxAddAidServlet";
		var data=sendData(url,str);
		
		if(data==0){
			document.getElementById("msg1").innerHTML="用户名已存在";
			return false;
		}else{
			document.getElementById("msg1").innerHTML="用户名可用";
			return true;
		}
	}
}
function isNull(id){
	var context=document.getElementById(id).value;
	var objMsg=document.getElementById("msg"+id);
	if(context==""||context==null){
		objMsg.innerHTML="此项不能为空!!";
		return false;
	}else{
		objMsg.innerHTML="";
		return true;
	}
}

function isSubmit(){
	if(isNullAid()==false||isNullPass()==false||isSameAid()==false||isNull()==flase){
		return false;
	}else{
		return true;
	}
	
}


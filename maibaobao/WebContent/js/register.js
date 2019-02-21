	window.onload=function()
	{
		/*实例化城市级联*/
		var m_jilian=new jilian('m_prov','m_city');
		var p_jilian=new jilian('p_prov','p_city');
		
		m_jilian.init();
		p_jilian.init();
	
		/**/
		document.getElementById("m_prov").onchange=m_jilian.fillcity;
		document.getElementById("p_prov").onchange=p_jilian.fillcity;
		
		/*选项卡事件*/
		document.getElementById("type1").onclick=select1;
		document.getElementById("type2").onclick=select2;
		
		document.getElementById("type1").onmouseover=over1;
		document.getElementById("type2").onmouseover=over2;
		
		document.getElementById("type1").onmouseout=out1;
		document.getElementById("type2").onmouseout=out2;
		
		/*密码宽度验证*/
		document.getElementById("m_password").onkeyup=m_passwordweight;
		document.getElementById("p_password").onkeyup=p_passwordweight;
	
		
		
		/*文本框的事件*/
		document.getElementById("m_mail").onfocus=m_mailfocus;
		document.getElementById("m_password").onfocus=m_passwordfocus;
		document.getElementById("m_name").onfocus=m_namefocus;
		
		document.getElementById("p_phone").onfocus=p_phonefocus;
		document.getElementById("p_password").onfocus=p_passwordfocus;
		document.getElementById("p_name").onfocus=p_namefocus;
		
		
		
		document.getElementById("m_mail").onblur=m_mailblur;
		document.getElementById("m_password").onblur=m_passwordblur;
		document.getElementById("m_name").onblur=m_nameblur;
		
		document.getElementById("p_phone").onblur=p_phoneblur;
		document.getElementById("p_password").onblur=p_passwordblur;
		document.getElementById("p_name").onblur=p_nameblur;
		
	
		
//		document.getElementById("m_submit").onmouseover=m_submouseover;
//		document.getElementById("p_submit").onmouseover=p_submouseover;
//	
//		document.getElementById("m_submit").onmouseout=m_submouseout;
//		document.getElementById("p_submit").onmouseout=p_submouseout;
	
		/*登录*/
//		document.getElementById("login").onclick=showlogin;
//		document.getElementById("login1").onclick=hidelogin;
//		
//		document.getElementById("login1").onclick=login;
//		document.getElementById("login1").onclick=yanzheng
//		document.getElementById("username").onfocus=huoqu1;
//		document.getElementById("password").onfocus=huoqu2;
//		document.getElementById("ex").onclick=ex;
//		document.getElementById("m_submit").onclick=denglu;
//		document.getElementById("p_submit").onclick=denglu;
		
	}

// JavaScript Document
var selected=1;
/*三个选项卡被选择的状态*/
function select1()
{
	
	if(selected==1)
	{
		return;
	}
	else
	{
		document.getElementById("type2").className="type2_3";
		document.getElementById("type1").className="type1_1";
		
		document.getElementById("form1").style.display="block";
		document.getElementById("form2").style.display="none";
		
		selected=1;
	}
}
function select2()
{
	
	if(selected==2)
	{
		return;
	}
	else
	{
		
		document.getElementById("type2").className="type2_1";
		document.getElementById("type1").className="type1_3";
		
		document.getElementById("form1").style.display="none";
		document.getElementById("form2").style.display="block";
		
		selected=2;
	}
}



/*三个选项卡鼠标经过切换class*/
function over1()
{
	if(selected!=1)
	{
		document.getElementById("type1").className="type1_2";
	}
}
function over2()
{
	if(selected!=2)
	{
		document.getElementById("type2").className="type2_2";
	}
}


/*三个选项卡鼠标离开切换class*/
function out1()
{
	if(selected!=1)
	{
		document.getElementById("type1").className="type1_3";
	}
}
function out2()
{
	if(selected!=2)
	{
		document.getElementById("type2").className="type2_3";
	}
}


/*密码宽度判定函数*/
function passwordweight(id,wid)
{
	var a=document.getElementById(id).value;
	var b=document.getElementById(wid);
	if(a==null||a.length==0)
	{
		b.className="w";
	}
	if(a.length>6)
	{
		b.className="w1"
	}
	if(a.length>10)
	{
		b.className="w2"
	}
	if(a.length>15)
	{
		b.className="w3"
	}
}

/*三个密码框调用判定密码长度*/
function m_passwordweight()
{
	document.getElementById('m_passwordmessage').style.display="none";
	document.getElementById('m_passwordweight').style.display="block";
	passwordweight('m_password','m_passwordweight');
}
function p_passwordweight()
{
	document.getElementById('p_passwordmessage').style.display="none";
	document.getElementById('p_passwordweight').style.display="block";
	passwordweight('p_password','p_passwordweight');
}




function showmessage(message,id)
{
 	var opt=document.getElementById(id);
	opt.className="message";
	opt.innerHTML=message;
}
function showwrong(message,id)
{
	var opt=document.getElementById(id);
	opt.className="wrong";
	opt.innerHTML=message;
}
function showright(id)
{
	var opt=document.getElementById(id);
	opt.style.display="block";
	opt.className="right";
	opt.innerHTML="";
}


/*点击出消息的效果*/
/*参数1id 要显示的信息的控件的ID*/
/*参数2要将信息放置的位置*/
function onfocus(id,message)
{
	var opt=document.getElementById(id);
	opt.className="inp1";
	if(message=="")
	{
		return;
	}
	showmessage(message,(id+"message"));
	
}

function onblur(id)
{
	var opt=document.getElementById(id);
	opt.className="inp";
}
/*邮箱验证*/
function mailValue(id)
{
	if(!bitian(id))
	{
		return false;
	}
	var str=document.getElementById(id).value;
	var myReg = /^[-_A-Za-z0-9]+@([_A-Za-z0-9]+\.)+[A-Za-z0-9]{2,3}$/; 
	return myReg.test(str);
}
/*密码验证*/
function passwordValue(id)
{
	var s=document.getElementById(id).value;
	var regu = "^[0-9a-zA-Z]+$"; 

	var re = new RegExp(regu); 
	if (re.test(s)&&s.length>6) 
	{ 
		
		return true;
		
	}
	else
	{ 
		return false;
	}
	
}
/*重复密码验证*/
//function repasswordValue(rid,id)
//{
//	if(!bitian(rid))
//	{
//		return false;
//	}
//    var a=document.getElementById(rid).value;
//	var b=document.getElementById(id).value;
//	if(a==b)
//	{
//		return true;
//	}
//	else
//	{
//		return false;
//	}
//	
//}
/*必填项验证*/
function bitian(id)
{
	var a=document.getElementById(id).value;
	
	if(a==null||a=="")
	{
		return false;
	}
	else
	{
		return true;
	}
}
/*电话验证*/
function phoneValue(id)
{
	if(!bitian(id))
	{
		return false;
	}
	var s=document.getElementById(id).value;
	var regu =/^[1][3][0-9]{9}$/; 
	var re = new RegExp(regu); 
	if (re.test(s)) 
	{ 
		return true; 
	}
	else
	{ 
		return false; 
	} 
}
/*姓名验证*/
function nameValue(id)
{
	var s=document.getElementById(id).value;
	var regu = "^[0-9a-zA-Z\u4e00-\u9fa5]+$"; 
	var re = new RegExp(regu); 
	if (re.test(s)) 
	{ 
		return true; 
	}
	else
	{ 
		return false; 
	} 
}

/*提示信息以及错误信息*/
function messages()
{
	this.mailMessage="请输入您常用的邮箱";
	this.nameMessage="请输入您的昵称";
	this.passwordMessage="密码由6-18位字符组成";
	this.phoneMessage="请填写您真实的手机号";

	this.mailWrong="邮箱格式错误";
	this.nameWrong="请输入昵称";
	this.passwordWrong="密码格式有误";
	this.phoneWrong="手机号格式错误";

	
}
function checkAll1(){
	if (passwordweight(m_password,0)==false) return false;
	if(mailValue(m_mail)==false) return false;
	if(passwordValue(m_password)==false) return false;
	if(messages()==false) return false;
	if(nameValue(m_name)==false) return false;

	if(bitian(id)==false) return false;
	
}
function checkAll2(){
	if (passwordweight(p_password,0)==false) return false;
	
	if(passwordValue(m_password)==false) return false;
	if(messages()==false) return false;
	if(nameValue(m_name)==false) return false;
	if(phoneValue(p_phone)==false) return false;
	if(bitian(id)==false) return false;
	
}
var msg=new messages();

/*各种文本框获得焦点的事件*/
function m_mailfocus()
{
	onfocus('m_mail',msg.mailMessage);
}
function m_passwordfocus()
{
	document.getElementById('m_passwordmessage').style.display="block";
	document.getElementById('m_passwordweight').style.display="none";
	onfocus('m_password',msg.passwordMessage);
}
function m_namefocus()
{
	
	onfocus('m_name',msg.nameMessage);
}
function p_phonefocus()
{
	onfocus('p_phone',msg.phoneMessage);
}
function p_passwordfocus()
{
	document.getElementById('p_passwordmessage').style.display="block";
	document.getElementById('p_passwordweight').style.display="none";
	onfocus('p_password',msg.passwordMessage);
}
function p_namefocus()
{
	onfocus('p_name',msg.nameMessage);
}



/*各种文本框失去焦点的函数。*/

function m_nameblur()
{
	if(nameValue('m_name'))
	{
		showright('m_namemessage');
	}
	else
	{
		showwrong(msg.nameWrong,'m_namemessage');
	}
	onblur('m_name');
}
function m_mailblur()
{
	if(mailValue('m_mail'))
	{
		showright('m_mailmessage');
	}
	else
	{
		showwrong(msg.mailWrong,'m_mailmessage');
	}
	onblur('m_mail');
}
function m_passwordblur()
{
	if(passwordValue('m_password'))
	{
		showright('m_passwordmessage');
	}
	else
	{
		showwrong(msg.passwordWrong,'m_passwordmessage');
	}
	document.getElementById('m_passwordmessage').style.display="block";
	document.getElementById('m_passwordweight').style.display="none";
	onblur('m_password');
}

function p_phoneblur()
{
	if(phoneValue('p_phone'))
	{
		showright('p_phonemessage');
	}
	else
	{
		showwrong(msg.phoneWrong,'p_phonemessage');
	}
	onblur('p_phone');
}
function p_passwordblur()
{
	if(passwordValue('p_password'))
	{
		showright('p_passwordmessage');
	}
	else
	{
		showwrong(msg.passwordWrong,'p_passwordmessage');
	}
	document.getElementById('p_passwordmessage').style.display="block";
	document.getElementById('p_passwordweight').style.display="none";
	onblur('p_password');
}
function p_nameblur()
{
	if(nameValue('p_name'))
	{
		showright('p_namemessage');
	}
	else
	{
		showwrong(msg.nameWrong,'p_namemessage');
	}
	onblur('p_name');
}

/*提交按钮鼠标的各种事件*/
//function m_submouseover()
//{
//	submouseover('m_submit');
//}
//function p_submouseover()
//{
//	submouseover('p_submit');
//}
//function s_submouseover()
//{
//	submouseover('s_submit');
//}
//function m_submouseout()
//{
//	submouseout('m_submit');
//}
//function p_submouseout()
//{
//	submouseout('p_submit');
//}



/*快捷登录的显示与隐藏*/
//function showlogin()
//{
//	document.getElementById("div1").style.display="block";
//	document.getElementById("div2").style.display="block";
//}
//function hidelogin()
//{
//	document.getElementById("div1").style.display="none";
//	document.getElementById("div2").style.display="none";
//}
//function huoqu1(){
//	namef=document.getElementById("username")
//	namef.value=""
//	namef.style.color="black"
//	
//}
//function huoqu2(){
//	passf=document.getElementById("password")
//	passf.value=""
//	passf.style.color="black"
//	
//}
//
//	function yanzheng(){
//	namen=document.getElementById("username").value
//	passwordn=document.getElementById("password").value
//	if(namen==""){document.getElementById("nktishi").style.display="block"
//				   document.getElementById("login1").disabled=true
//				   setTimeout('document.getElementById("login1").disabled=false',2500);
//				  }
//	else{document.getElementById("nktishi").style.display="none"}
//	if(passwordn==""){document.getElementById("mmtishi").style.display="block"
//				   document.getElementById("login1").disabled=true
//				   setTimeout('document.getElementById("login1").disabled=false',2500);
//				  }
//	else{document.getElementById("mmtishi").style.display="none"}
//	if(namen!=""&&passwordn!=""){
//		yanzheng2();
//	}
//}
//function yanzheng2(){
//		if(namen=="stagza@hotmail.com"&&passwordn=="890125"){
//		location="mysitetop.html"
//	}
//	else{
//		document.getElementById("tishi").style.display="block"
//	 	setTimeout('document.getElementById("tishi").style.display="none"',2500);
//		document.getElementById("login1").disabled=true
//	    setTimeout('document.getElementById("login1").disabled=false',2500);
//		}
//}
//
//function ex(){
//	document.getElementById("div1").style.display="none";
//	document.getElementById("div2").style.display="none";
//	
//}
/*function denglu(){
	ema=document.getElementById("m_mail").value;
	pass=document.getElementById("password").value;
	nicheng=document.getElementById("m_name").value;
	yanzheng=document.getElementById("m_yzm").value;
	if(ema!=""&&pass!=""&&nicheng!=""){
		document.getElementById("m_submit").disabled=true;
		setTimeout('document.getElementById("m_submit").disabled=false',2500);
		document.getElementById("x").style.display="block";
		setTimeout('document.getElementById("x").style.display="none"',2500);
	}
	
}*/

/*********************************************/
//function login(){
//	location="mysitetop.html"
//}

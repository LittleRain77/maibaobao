// JavaScript Document
function getByClass(oParent, sClass)
{
 var aEle=oParent.getElementsByTagName('*');
 var aTmp=[];
 var i=0;
 
 for(i=0;i<aEle.length;i++)
 {
  if(aEle[i].className==sClass)
  {
   aTmp.push(aEle[i]);
  }
 }
 
 return aTmp;
}
window.onload=function ()
{
 var oDiv=document.getElementById('div1');
 var oMark=getByClass(oDiv, 'mark')[0];
 var oFloat=getByClass(oDiv, 'float_layer')[0];
 var oBig=getByClass(oDiv, 'big_pic')[0];
 var oSmall=getByClass(oDiv, 'small_pic')[0];
 var oImg=oBig.getElementsByTagName('img')[0];
 
 oMark.onmouseover=function ()
 {
  oFloat.style.display='block';
  oBig.style.display='block';
 };
 
 oMark.onmouseout=function ()
 {
  oFloat.style.display='none';
  oBig.style.display='none';
 };
 
 oMark.onmousemove=function (ev)
 {
  var oEvent=ev||event;
  
  var l=oEvent.clientX-oDiv.offsetLeft-oSmall.offsetLeft-oFloat.offsetWidth/2;
  var t=oEvent.clientY-oDiv.offsetTop-oSmall.offsetTop-oFloat.offsetHeight/2;
  
  if(l<0)
  {
   l=0;
  }
  else if(l>oMark.offsetWidth-oFloat.offsetWidth)
  {
   l=oMark.offsetWidth-oFloat.offsetWidth;
  }
  
  if(t<0)
  {
   t=0;
  }
  else if(t>oMark.offsetHeight-oFloat.offsetHeight)
  {
   t=oMark.offsetHeight-oFloat.offsetHeight;
  }
  
  oFloat.style.left=l+'px';
  oFloat.style.top=t+'px';
  
  var percentX=l/(oMark.offsetWidth-oFloat.offsetWidth);
  var percentY=t/(oMark.offsetHeight-oFloat.offsetHeight);
  
  oImg.style.left=-percentX*(oImg.offsetWidth-oBig.offsetWidth)+'px';
  oImg.style.top=-percentY*(oImg.offsetHeight-oBig.offsetHeight)+'px';
 };
};

function blogtextfocus(){
	if(document.getElementById("blogtext").value == "你正在做什么？"){
	document.getElementById("blogtext").value="";
	document.getElementById("blogtext").style.color="#000000";
	}
}
//微博文本失去焦点
function blogtextblur(){
	if(document.getElementById("blogtext").value == ""){
	document.getElementById("blogtext").value="你正在做什么？";
	document.getElementById("blogtext").style.color="#999999";
	}	
}

function checkLength(obj){
	var num=140;
	var pd=0;
   var ts=document.getElementById('tishi');
   var tav = document.getElementById("blogtext").value;
   var reg = /[^\x00-\xff]/gm;
   var newta = tav.replace(reg,"**");//将中文认为是两个字，返回2
   var str=newta.value;
   var n=Math.ceil(newta.length/2); //调用方法
   pd=num-n;
   if((num-n)>0){
    ts.innerHTML='您还可以输入'+(num-n)+'个字';
   }else{
    ts.innerHTML='<font color="red">您已经超出'+(n-num)+'个字</font>';
   }
   return  pd;
  }
  
  
  //提交时，验证字数是否符合字数标准
  //档子数过多时提示
   function submittext(){
   var c=document.getElementById('blogtext');
   var i=1;
   var pd=checkLength(c)
   if(pd<=0 || c.value==''){
    var t=setInterval(function(){
     i++;
     if(c.style.background=='pink'){
      c.style.background='white';
     }else{
      c.style.background='pink';
     }
     if(i>4){
      clearInterval(t);
     }
    },200)
   }else{
    document.form.submit();
   }

  }

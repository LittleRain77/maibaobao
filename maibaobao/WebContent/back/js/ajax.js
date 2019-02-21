var httpRequest;
function getHttpRequest(){
	try{
  	  httpRequest=new window.ActiveXObject("Microsoft.XMLHTTP");
    }catch(ex){
  	  try{
  	       httpRequest=new XMLHttpRequest();
        }catch(ex){
          try{
  	        httpRequest=new window.ActiveXObject("Msxml2.XMLHTTP");
          }catch(ex){
  	           httpRequest=new null;
          }
       }
    }
}
function sendData(url,datas){
	var reData;
	getHttpRequest();
	 //如果变量不为空，则可进行ajax数据传输
    if(httpRequest!=null){
  	  httpRequest.open("post",url,false);//以异步通讯方式，get提交方式，连接到demo
  	  //设置头部信息，说明编码方式
  	  httpRequest.setRequestHeader('Content-type','application/x-www-form-urlencoded');
  	  //根据请求的不同状态处理结果，调用onreadystatechange函数
  	  httpRequest.onreadystatechange=function(){
  		  if(httpRequest.readyState==4&&httpRequest.status==200){
  			  //请求成功，并数据接收成功
  			  //接收最后数据
  		       reData=httpRequest.responseText;
  			  
  		  }
  	  }
  	  httpRequest.send(datas);
    }
    return reData;
}
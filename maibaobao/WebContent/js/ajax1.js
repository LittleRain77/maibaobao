var httpRequest;//声明一个变量，用来存放XMLHttpRequest类型的对象
//定义一个给全局变量赋值的函数
function getHttpRequest(){
	//给变量赋值
	try {
		httpRequest = new window.ActiveXObject("Microsoft.XMLHTTP");
	} catch (ex) {
		try {
			httpRequest = new XMLHttpRequest();
		} catch (ex) {
			try {
				httpRequest = new window.ActiveXObject("Msxm12.XMLHTTP");
			} catch (eRx) {
				httpRequest = null;
			}
		}
	}
}
//定义一个函数，用来发送信息，并接收返回数据
function sendData(url,datas){
	
	var reData;
	//调用赋值函数
	getHttpRequest();
	//如果变量非空，则进行ajax的数据传输
	if (httpRequest!= null) {
		httpRequest.open("post", url, false);//以异步通讯方式，get提交方式，连接到demo位置
		//post提交必须设置请求对象的头部信息，说明编码方式
		httpRequest.setRequestHeader('Content-type','application/x-www-form-urlencoded');
		//根据请求不同的状态处理结果，请求状态变化自动调用eadystatechang
		httpRequest.onreadystatechange = function()
		{
			if (httpRequest.readyState == 4 && httpRequest.status == 200) {
				//请求成功，并且数据也接收成功
				//接收最后的数据
				reData=httpRequest.responseText;
				
			}
		}
		httpRequest.send(datas);
	}
	return reData;
}
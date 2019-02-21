﻿
/*
下面是全部省份和城市的定义数组
*/
var p =new Array();
p[0] = "北京";
p[1] = "上海";
p[2] = "天津";
p[3] = "重庆";
p[4] = "河北";
p[5] = "山西";
p[6] = "内蒙古";
p[7] = "辽宁";
p[8] = "吉林";
p[9] = "黑龙江";
p[10] = "江苏";
p[11] = "浙江";
p[12] = "安徽";
p[13] = "福建";
p[14] = "江西";
p[15] = "山东";
p[16] = "河南";
p[17] = "湖北";
p[18] = "湖南";
p[19] = "广东";
p[20] = "广西";
p[21] = "海南";
p[22] = "四川";
p[23] = "贵州";
p[24] = "云南";
p[25] = "西藏";
p[26] = "陕西";
p[27] = "甘肃";
p[28] = "宁夏";
p[29] = "青海";
p[30] = "新疆";
p[31] = "香港";
p[32] = "澳门";
p[33] = "台湾";

var c =new Array();
c[0] =new Array("东城","西城","崇文","宣武","朝阳","丰台","石景山","海淀","门头沟","房山","通州","顺义","昌平","大兴","平谷","怀柔","密云","延庆");
c[1] =new Array("黄浦","卢湾","徐汇","长宁","静安","普陀","闸北","虹口","杨浦","闵行","宝山","嘉定","浦东","金山","松江","青浦","南汇","奉贤","崇明");
c[2] =new Array("和平","东丽","河东","西青","河西","津南","南开","北辰","河北","武清","红挢","塘沽","汉沽","大港","宁河","静海","宝坻","蓟县");
c[3] =new Array("万州","涪陵","渝中","大渡口","江北","沙坪坝","九龙坡","南岸","北碚","万盛","双挢","渝北","巴南","黔江","长寿","綦江","潼南","铜梁","大足","荣昌","壁山","梁平","城口","丰都","垫江","武隆","忠县","开县","云阳","奉节","巫山","巫溪","石柱","秀山","酉阳","彭水","江津","合川","永川","南川");
c[4] =new Array("石家庄","邯郸","邢台","保定","张家口","承德","廊坊","唐山","秦皇岛","沧州","衡水");
c[5] =new Array("太原","大同","阳泉","长治","晋城","朔州","吕梁","忻州","晋中","临汾","运城");
c[6] =new Array("呼和浩特","包头","乌海","赤峰","呼伦贝尔盟","阿拉善盟","哲里木盟","兴安盟","乌兰察布盟","锡林郭勒盟","巴彦淖尔盟","伊克昭盟");
c[7] =new Array("沈阳","大连","鞍山","抚顺","本溪","丹东","锦州","营口","阜新","辽阳","盘锦","铁岭","朝阳","葫芦岛");
c[8] =new Array("长春","吉林","四平","辽源","通化","白山","松原","白城","延边");
c[9] =new Array("哈尔滨","齐齐哈尔","牡丹江","佳木斯","大庆","绥化","鹤岗","鸡西","黑河","双鸭山","伊春","七台河","大兴安岭");
c[10] =new Array("南京","镇江","苏州","南通","扬州","盐城","徐州","连云港","常州","无锡","宿迁","泰州","淮安");
c[11] =new Array("杭州","宁波","温州","嘉兴","湖州","绍兴","金华","衢州","舟山","台州","丽水");
c[12] =new Array("合肥","芜湖","蚌埠","马鞍山","淮北","铜陵","安庆","黄山","滁州","宿州","池州","淮南","巢湖","阜阳","六安","宣城","亳州");
c[13] =new Array("福州","厦门","莆田","三明","泉州","漳州","南平","龙岩","宁德");
c[14] =new Array("南昌市","景德镇","九江","鹰潭","萍乡","新馀","赣州","吉安","宜春","抚州","上饶");
c[15] =new Array("济南","青岛","淄博","枣庄","东营","烟台","潍坊","济宁","泰安","威海","日照","莱芜","临沂","德州","聊城","滨州","菏泽");
c[16] =new Array("郑州","开封","洛阳","平顶山","安阳","鹤壁","新乡","焦作","濮阳","许昌","漯河","三门峡","南阳","商丘","信阳","周口","驻马店","济源");
c[17] =new Array("武汉","宜昌","荆州","襄樊","黄石","荆门","黄冈","十堰","恩施","潜江","天门","仙桃","随州","咸宁","孝感","鄂州");
c[18] =new Array("长沙","常德","株洲","湘潭","衡阳","岳阳","邵阳","益阳","娄底","怀化","郴州","永州","湘西","张家界 ");
c[19] =new Array("广州","深圳","珠海","汕头","东莞","中山","佛山","韶关","江门","湛江","茂名","肇庆","惠州","梅州","汕尾","河源","阳江","清远","潮州","揭阳","云浮");
c[20] =new Array("南宁","柳州","桂林","梧州","北海","防城港","钦州","贵港","玉林","南宁地区","柳州地区","贺州","百色","河池");
c[21] =new Array("海口","三亚");
c[22] =new Array("成都","绵阳","德阳","自贡","攀枝花","广元","内江","乐山","南充","宜宾","广安","达川","雅安","眉山","甘孜","凉山","泸州");
c[23] =new Array("贵阳","六盘水","遵义","安顺","铜仁","黔西南","毕节","黔东南","黔南");
c[24] =new Array("昆明","大理","曲靖","玉溪","昭通","楚雄","红河","文山","思茅","西双版纳","保山","德宏","丽江","怒江","迪庆","临沧");
c[25] =new Array("拉萨","日喀则","山南","林芝","昌都","阿里","那曲");
c[26] =new Array("西安","宝鸡","咸阳","铜川","渭南","延安","榆林","汉中","安康","商洛");
c[27] =new Array("兰州","嘉峪关","金昌","白银","天水","酒泉","张掖","武威","定西","陇南","平凉","庆阳","临夏","甘南");
c[28] =new Array("银川","石嘴山","吴忠","固原");
c[29] =new Array("西宁","海东","海南","海北","黄南","玉树","果洛","海西");
c[30] =new Array("乌鲁木齐","石河子","克拉玛依","伊犁","巴音郭勒","昌吉","克孜勒苏柯尔克孜","博尔塔拉","吐鲁番","哈密","喀什","和田","阿克苏 ");
c[31] =new Array("香港特别行政区 ");
c[32] =new Array("澳门特别行政区 ");
c[33] =new Array("台北","高雄","台中","台南","屏东","南投","云林","新竹","彰化","苗栗","嘉义","花莲","桃园","宜兰","基隆","台东","金门","马祖","澎湖");

///*
//* 将省份添加到slect中去
//*/
//
//function set_pro_select1(so) {
/////alert(123);
//    for (var i = 0, n = p.length; i < n; i++ ) {
//        var opt = document.createElement('option');
//        opt.text = p[i];
//        opt.value = i;
//        // 有些浏览器不支持 options 属性的 add 方法，
//        // 但支持 DOM 的 appendChild 方法（比如：Konqueror）
//        if (so.options.add) {
//            so.options.add(opt);
//        }
//        else {
//            so.appendChild(opt);
//        }
//    }
//}
//
///*
//*将对应的城市添加到第二个select中去
//*/
//function set_city_select1(so,pid){
//for(var i = 0,n = c[pid].length;i < n;i++){
//        var opt=document.createElement('option');
//opt.text = c[pid][i];
//opt.value = i;
//
//if (so.options.add) {
//            so.options.add(opt);
//        }
//        else {
//            so.appendChild(opt);
//        }
//}
//}
//
///*
//*清除城市select中的内容
//*/
//function clear_select(so) {
//    for (var i = so.options.length - 1; i > -1; i--) {
//        // 有些浏览器不支持 options 属性的 remove 方法，
//        // 但支持 DOM 的 removeChild 方法（比如：Konqueror）
//        if (so.options.remove) {
//            so.options.remove(i);
//        }
//        else {
//            so.removeChild(so.options[i]);
//        }
//    }
//}
//
///*
//*改变省份
//*/
//function change_province(pid) {
//    set_city_select(pid);
//}
//function change_province(){
//	var pid=document.getElementById('prov').value;
//	set_city_select(pid);
//}
//
///*
//   用来初始化省份的菜单
//*/
//function init(){
//var so=document.getElementById('prov');
//    set_pro_select1(so);
//change_province(0);
//}
//
//function set_city_select(pid){
//var so = document.getElementById('city');
//clear_select(so);
//set_city_select1(so,pid);
//}
function jilian(prov,city)
{
	this.prov=prov;
	this.city=city;
	this.fillprov=fillprov;
	this.fillcity=fillcity;
	this.init=init;
	function init()
	{
		fillprov();
		fillcity();
	}
	function fillprov()
	{
		var so=document.getElementById(prov);
		for (var i = 0, n = p.length; i < n; i++ ) {
			var opt = document.createElement('option');
			opt.text = p[i];
			opt.value = i;
			// 有些浏览器不支持 options 属性的 add 方法，
			// 但支持 DOM 的 appendChild 方法（比如：Konqueror）
			if (so.options.add) {
				so.options.add(opt);
			}
			else {
				so.appendChild(opt);
			}
		}
	}
	
	function fillcity()
	{
		var pid=document.getElementById(prov).value;
		var so=document.getElementById(city);
		for (var i = so.options.length - 1; i > -1; i--) {
			// 有些浏览器不支持 options 属性的 remove 方法，
			// 但支持 DOM 的 removeChild 方法（比如：Konqueror）
			if (so.options.remove) {
				so.options.remove(i);
			}
			else {
				so.removeChild(so.options[i]);
			}
		}
		for(var i = 0,n = c[pid].length;i < n;i++){
			var opt=document.createElement('option');
		opt.text = c[pid][i];
		opt.value = i;
		
		if (so.options.add) {
					so.options.add(opt);
				}
				else {
					so.appendChild(opt);
				}
		}
	}
	
	
}

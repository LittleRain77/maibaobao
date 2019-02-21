package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smallapple.mbb.biz.GoodsBiz;
import com.smallapple.mbb.biz.inter.GoodsBizInter;
import com.smallapple.mbb.vo.Car;
import com.smallapple.mbb.vo.Goods;

/**
 * ���빺�ﳵ��Servlet
 */
public class CarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ��ȡ����	
		HttpSession session=request.getSession();
		//׼�������Ʒ�ĳ�
		Map<Object,Car> map=null;//������map����
		//��session���map����
		map=(Map<Object,Car>)session.getAttribute("cars");
		//���û��mapʵ�����򴴽�
		if(map==null){
			map=new HashMap<Object,Car>();
			
		}
		//��ǰ̨��ȡ��Ʒ��idֵ
		String gid=request.getParameter("gid");
		//�жϹ��ﳵ���Ƿ����ͬһ��Ʒ�������������Ŀ��һ�������ڣ����½���Ŀ��ӵ����ﳵ
		if(map.containsKey(gid)){
			//����
			//�ӹ��ﳵ�����Ʒ��item
			map.get(gid).addNumber();
		}else{
			//��biz������Ʒ��ȫ����Ϣ
			Goods goods=null;
			//����biz�㣬��goods��ֵ
			GoodsBizInter biz=new GoodsBiz();
			goods=biz.search(gid);
			//�������ﳵ��
			Car car=new Car(goods,1);
			//�����ﳵ����뵽���ﳵ��
			map.put(gid,car);
		}
		float totalPrice=0;
		for(Car car2:map.values()){
			  totalPrice += car2.getTotalPrice();
			}
			session.setAttribute("totalPrice", totalPrice);
		//�����ﳵ�Żص�session��
		session.setAttribute("cars",map);
		//��ת�����ﳵ��ʾ��ҳ��
		response.sendRedirect("shopping_cart.jsp");
		
	}

}

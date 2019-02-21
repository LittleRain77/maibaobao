package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.smallapple.mbb.biz.OrdersBiz;
import com.smallapple.mbb.biz.inter.OrdersBizInter;
import com.smallapple.mbb.vo.Car;
import com.smallapple.mbb.vo.Orders;
import com.smallapple.mbb.vo.User;

/**
 * Servlet implementation class OrdersServlet
 */
public class OrdersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrdersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		//��ö�������Ϣ�������ţ������ݣ���¼�û���ʱ��
		Orders or=new Orders();
		//���ö����ţ��Ե�ǰϵͳʱ��ĺ�����Ϊ������
		Date dt=new Date();
		SimpleDateFormat sdf2=new SimpleDateFormat("hhmmss");
		String time=sdf2.format(dt);
		or.setOid(time);
		//�ջ���ַ
		or.setOaddress(request.getParameter("oaddress"));
		//�ջ���
		or.setOusername(request.getParameter("ousername"));
		//�绰
		or.setOphone(request.getParameter("ophone"));
		//����ķ�ʽ
		or.setOpaymenttype(request.getParameter("opaymenttype"));
		//�����û���id
		User us=(User)session.getAttribute("user");
		//us.setUid(request.getParameter("uid"));
		or.setUid(us.getUid());
		
		//��ָ����ʽת��ϵͳʱ��
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		or.setOtime(sdf.format(dt));
		//���ö���״̬
		or.setOstatus("δ����");
		//������Ʒ�б�
		Map<Object,Car> map=(Map<Object,Car>)session.getAttribute("cars");
		or.setList(map.values());
		//��or����OrderBiz���̴���
		OrdersBizInter biz=new OrdersBiz();
		boolean flag=biz.addOrder(or);
		//��ת���������ҳ��
		if(flag){
			response.sendRedirect("submit_success.jsp");
		}else{
			response.sendRedirect("information.jsp");
		}
	}

}

package com.smallapple.mbb.dbutil;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {
	//�������Ʋ���ָ��Cookie��ֵ
		public static String findCookiebyName(String name, HttpServletRequest request){
			
			//��ȡȫ����cookie
			Cookie[] cookies = request.getCookies();
			
			if(cookies!=null){
				
				//����ȫ����cookie
				for(Cookie cookie : cookies){
					
					//����name�鳭value
					if(name.equals(cookie.getName())){
						  String v=cookie.getValue();
						return v; 
					}
				}
			}
			
			return null;
				
		}
		
		//��ӳ־û�Cookie
		public static void addCookie(String name, String value, int days, HttpServletResponse response){
		
			Cookie cookie = new Cookie(name, value);
			cookie.setMaxAge(days * 24 * 3600);
			response.addCookie(cookie);
			
		}
		
		//ɾ��ָ�����Ƶ�Cookie
		public static void deleteCookie(String name, HttpServletResponse response){
			
			Cookie cookie = new Cookie(name, "");
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}

}

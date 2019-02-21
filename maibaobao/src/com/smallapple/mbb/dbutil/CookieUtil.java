package com.smallapple.mbb.dbutil;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {
	//根据名称查找指定Cookie的值
		public static String findCookiebyName(String name, HttpServletRequest request){
			
			//获取全部的cookie
			Cookie[] cookies = request.getCookies();
			
			if(cookies!=null){
				
				//遍历全部的cookie
				for(Cookie cookie : cookies){
					
					//根据name查抄value
					if(name.equals(cookie.getName())){
						  String v=cookie.getValue();
						return v; 
					}
				}
			}
			
			return null;
				
		}
		
		//添加持久化Cookie
		public static void addCookie(String name, String value, int days, HttpServletResponse response){
		
			Cookie cookie = new Cookie(name, value);
			cookie.setMaxAge(days * 24 * 3600);
			response.addCookie(cookie);
			
		}
		
		//删除指定名称的Cookie
		public static void deleteCookie(String name, HttpServletResponse response){
			
			Cookie cookie = new Cookie(name, "");
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}

}

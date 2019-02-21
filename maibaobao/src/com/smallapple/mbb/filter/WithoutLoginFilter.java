package com.smallapple.mbb.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.UserLoginBiz;
import com.smallapple.mbb.biz.inter.UserLoginBizInter;

/**
 * ÃâµÇÂ½¹ýÂËÆ÷
 */
public class WithoutLoginFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public WithoutLoginFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest HttpRequest = (HttpServletRequest) request;
		if (HttpRequest.getSession().getAttribute("user") == null) {
			Cookie[] cookies = HttpRequest.getCookies();
			UserLoginBizInter biz = new UserLoginBiz();
			String uname = null;
			String upass = null;
			if (cookies != null && !"".equals(cookies)) {
				for (Cookie cookie : cookies) {
					if ("user".equals(cookie.getName())) {
						uname = cookie.getValue();
						if (uname.indexOf('!') > 0) {
							uname = uname.substring(0, uname.indexOf('!'));
							upass = cookie.getValue();
							upass = upass.substring(upass.indexOf('!') + 1,
									upass.indexOf('?'));
							if (biz.login(uname, upass) != null
									&& !"".equals(biz.login(uname, upass))) {
								HttpRequest.getSession().setAttribute("user",
										biz.login(uname, upass));

							}
						}
					}
				}
			}
		}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

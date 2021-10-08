package com.boot.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
 
@Component
public class LoggerInterceptor implements HandlerInterceptor {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public boolean preHandle(HttpServletRequest request, 
								HttpServletResponse response, 
								Object handler) throws Exception {
		
		logger.info("==================== BEGIN ====================");
		logger.info("Request URI ===> " + request.getRequestURI());
		
		String id = (String)request.getSession().getAttribute("id");
		logger.info("id===> " + id);
		
		if(id==null) {
//			response.sendRedirect("/adminUserLogin");
		}
		
		
		return true;
	}
	
	//controller 처리 이후 이벤트 작동
	@Override
	public void postHandle(HttpServletRequest request, 
					        HttpServletResponse response, 
					        Object handler, 
					        ModelAndView modelAndView) throws Exception {
		logger.info("==================== END ======================");
	}
	
	//view 처리 이후 이벤트 작동
	@Override
	public void afterCompletion(HttpServletRequest request, 
						        HttpServletResponse response, 
						        Object handler,
						        Exception ex) throws Exception { 
		logger.info("==================== VIEW END ======================");
	
	}
}

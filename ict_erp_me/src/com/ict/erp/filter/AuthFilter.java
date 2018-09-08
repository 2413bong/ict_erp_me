package com.ict.erp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.filters.SetCharacterEncodingFilter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AuthFilter implements Filter {
	private Log log = LogFactory.getLog(this.getClass());

    public AuthFilter() {
    	
    }

	public void destroy() {
		
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest hsr = (HttpServletRequest)request;
		HttpSession hs= hsr.getSession();
		log.trace(hsr.getRequestURI());
		log.debug(hsr.getRequestURI());
		log.info(hsr.getRequestURI());
		log.warn(hsr.getRequestURI());
		log.error(hsr.getRequestURI());
		log.fatal(hsr.getRequestURI());
		
		if(hs.getAttribute("user")==null) {
			System.out.println("너 권한 없음");
		}
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {

		
	}

}

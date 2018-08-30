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

public class AuthFilter implements Filter {

    public AuthFilter() {
    	
    }

	public void destroy() {
		
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest hsr = (HttpServletRequest)request;
		HttpSession hs= hsr.getSession();
		if(hs.getAttribute("user")==null) {
			System.out.println("너 권한 없음");
		}
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {

		
	}

}

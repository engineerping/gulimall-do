//*
// * Copyright (c) 2016-2019 人人开源 All rights reserved.
// *
// * https://www.renren.io
// *
// * 版权所有，侵权必究！
//
//package com.atguigu.common.xss;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//
///**
// * XSS过滤，（这个类使用来放置 XSS 攻击的在后面的课中删掉了，因为使用 spring security 替换掉了）
// *
// * @author Mark sunlightcs@gmail.com
// *
// * This class is copied from
// * renren-fast/src/main/java/io/renren/common/xss
// */
//public class XssFilter implements Filter {
//
//	@Override
//	public void init(FilterConfig config) throws ServletException {
//	}
//
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//            throws IOException, ServletException {
//		XssHttpServletRequestWrapper xssRequest = new XssHttpServletRequestWrapper(
//				(HttpServletRequest) request);
//		chain.doFilter(xssRequest, response);
//	}
//
//	@Override
//	public void destroy() {
//	}
//
//}
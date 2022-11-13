package com.maple.mvc.servlet;

import org.springframework.web.servlet.HttpServletBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 杨锋
 * @date 2022/11/13 19:42
 * desc:
 */

public class HelloServlet extends HttpServletBean {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("hello world");
		super.doGet(req, resp);
	}
}

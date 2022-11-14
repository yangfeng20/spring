package com.maple.mvc;

import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import java.io.File;

public class AppTomcat {
	// 端口号
	private static int port = 8080;


	public static void main(String[] args) {
		start();
	}

	private static void start() {
		try {
			// TODO Auto-generated method stub
			// 创建Tomcat服务器
			Tomcat tomcat = new Tomcat();
			// 设置端口号
			tomcat.setPort(port);
			tomcat.getHost().setAutoDeploy(false);

			// 创建Context上下文
			// 读取项目路径
			StandardContext ctx = (StandardContext) tomcat.addWebapp("/", new File("spring-test/out/production/resources").getAbsolutePath());
			// 禁止重新载入
			ctx.setReloadable(false);

			// class文件读取地址
			File additionWebInfClasses = new File("target/classes");
			// 创建WebRoot
			WebResourceRoot resources = new StandardRoot(ctx);
			// tomcat内部读取Class执行
			resources.addPreResources(
					new DirResourceSet(resources, "/WEB-INF/classes", additionWebInfClasses.getAbsolutePath(), "/"));


			tomcat.start();
			System.out.println("tomcat启动成功...");


			// 服务阻塞等待
			tomcat.getServer().await();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("tomcat启动失败...");
		}
	}

}

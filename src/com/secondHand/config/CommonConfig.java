package com.secondHand.config;


import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.secondHand.controller.AdminController;
import com.secondHand.controller.ApiController;
import com.secondHand.controller.DownloadController;
import com.secondHand.controller.IndexController;
import com.secondHand.model.Admin;
import com.secondHand.model.Classify;
import com.secondHand.model.Goods;
import com.secondHand.model.Users;

public class CommonConfig extends JFinalConfig{
	
	//数据库连接
	private String localhost = "jdbc:mysql://127.0.0.1/SecondHand";
	private String root = "root";
	private String pwd = "1995";
	
	/**
	 * 配置常量
	 */
	public void configConstant(Constants me) {
		me.setDevMode(true);  //开发模式
	}
	
	/**
	 * 配置路由
	 */
	public void configRoute(Routes me) {
		
		me.add("/", IndexController.class);  //主页
		me.add("/admin", AdminController.class);  //后台
		me.add("/api", ApiController.class);  //api接口
		me.add("/download", DownloadController.class);  //下载
	}
	
	/**
	 * 配置插件
	 */
	public void configPlugin(Plugins me) {
		
		// 配置C3p0数据库连接池插件
		C3p0Plugin c3p0Plugin = new C3p0Plugin(localhost, root, pwd);
		me.add(c3p0Plugin);
		
		// 配置ActiveRecord插件
		ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0Plugin);
		me.add(arp);
		
		//数据库到类的映射
		arp.addMapping("admin", Admin.class);  //管理员表
		arp.addMapping("goods", Goods.class); //商品表
		arp.addMapping("classify", Classify.class);  //商品分类表
		arp.addMapping("users", Users.class); //用户表
		
	}
	
	/**
	 * 配置全局拦截器
	 */
	public void configInterceptor(Interceptors me) {
		
	}
	
	/**
	 * 配置处理器
	 */
	public void configHandler(Handlers me) {
		
	}
	
	/**
	 * 此 main 方法可以启动项目
	 */
	public static void main(String[] args) {
		JFinal.start("WebRoot", 8008, "/", 5);
	}
}

package com.secondHand.controller;

import com.jfinal.core.Controller;

public class DownloadController extends Controller{

	
	public void index() {
		render("download.html");
	}
	
	
	//返回app文件
	public void app() {
		
		renderFile("");
	}
}

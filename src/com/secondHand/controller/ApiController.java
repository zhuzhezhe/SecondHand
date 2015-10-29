package com.secondHand.controller;

import java.util.List;

import com.jfinal.core.Controller;
import com.secondHand.model.Goods;
import com.secondHand.model.Users;


/**
 * @author zhuzhezhe
 * api控制器，返回JSON数据
 *
 */
public class ApiController extends Controller{

	//get: 返回总的api列表
	public void index() {
		
		renderJson("{\"age\":18}");
		
	}
	
	
	
}

package com.secondHand.controller;

import com.jfinal.core.Controller;
import com.secondHand.model.Classify;
import com.secondHand.model.Goods;

public class ApiClassifyController extends Controller{

	/*
	 * classify相关的api
	 */
	
	//get: ../api/classify/id  ——获取某个分类下的所有商品
	public void index() {
		String sql = "select * from goods where classify_id=?";
		setAttr("classify", Goods.me.find(sql,getParaToInt()));
		renderJson();
	}
	
	//get: ../api/classify/all  获取所有分类信息
	public void all() {
		String sql = "select * from classify";
		setAttr("classify", Classify.me.find(sql));
		renderJson();
	}
}

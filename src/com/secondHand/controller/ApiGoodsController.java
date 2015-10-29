package com.secondHand.controller;

import com.jfinal.core.Controller;
import com.secondHand.model.Goods;

public class ApiGoodsController extends Controller{
	
	/*
	 * goods相关的api
	 */
	
	//get: ../api/goods/id  ——获取某个商品信息
	public void index() {
		setAttr("goods", Goods.me.findById(getParaToInt()));
		renderJson();
	}
	
	//get:  ../api/goods/corrent_list 获取最新发布的商品
	public void current_list() {
		String sql= "select * from goods where create_time = now"; //修改
		setAttr("current_list", Goods.me.find(sql));
		renderJson();
	}
	//post:  ../api/goods/add  发布一件商品
	public void add() {
		getModel(Goods.class).save();
	}
	
	//put:  ../api/goods/update 更新商品信息
	public void update() {
		getModel(Goods.class).update();
	}
	
	//delete:  ../api/goods/delete  删除某件商品
	public void delete() {
		Goods.me.deleteById(getParaToInt());
	}
}

package com.secondHand.controller;

import java.util.List;

import org.eclipse.jetty.server.Authentication.User;

import com.jfinal.core.Controller;
import com.secondHand.model.Goods;
import com.secondHand.model.Users;

public class ApiUsersController extends Controller{
	
	/*
	 * users相关的api
	 */
	
	
	//get:  ../api/users  ——获取某个用户信息
	public void index() {
		
		setAttr("users", Users.me.findById(getParaToInt()));
		renderJson();
	}
	
	//get: ../api/users/all  ——获取所有用户信息
	public void all() {
		List<Users> users = Users.me.find("select * from users");
		setAttr("users", users);
		renderJson();
	}
	//get:  ../api/users/sale  获取某个用户发布的所有商品
	public void sale() {
		String sql = "select * from goods where users_id=?";
		List<Goods> users_goods = Goods.me.find(sql, getParaToInt());
		setAttr("users_goods", users_goods);
		renderJson();
	}
	
	//post: ../api/users/add  ——添加一条用户信息
	public void add() {
		getModel(Users.class).save();
	}
	
	//post: ../api/users/buy
	public void buy() {
		
	}
	
	//delete: ../api/users/delete  删除一条用户信息
	public void delete() {
		Users.me.findById(getParaToInt()).delete();
		renderJson("{\"msg\":\"删除成功\"}");
	}
}

package com.ekunt.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {

	//ģ������ʱ��ģ�ͱ����Լ�new
	private User user = new User();

	
	public String add(){
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		return SUCCESS;
	}

	@Override
	public User getModel() {
		return user;
	}
}

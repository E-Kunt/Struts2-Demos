package com.ekunt.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Action1 extends ActionSupport {

	private Map request;
	private Map session;
	private Map application;
	
	/**
	 * ��ʽ1��ʹ��ActionContext����ȡMap�͵�WEBԪ�� ��������Struts,�����ã�
	 */
	public Action1() {
		request = (Map) ActionContext.getContext().get("request");
		session = ActionContext.getContext().getSession();
		application = ActionContext.getContext().getApplication();
	}
	
	@Override
	public String execute() throws Exception {
		request.put("rr", "rr");
		session.put("ss", "ss");
		application.put("aa", "aa");
		return SUCCESS;
	}
}

package com.ekunt.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ��ʽ2���̳�RequestAware,SessionAware,ApplicationAware�ӿڣ���ȡMap�͵�WEBԪ�� 
 * ��������IOC[���Ʒ�ת]��DI[����ע��],ʵ�ʿ�����������һ�ַ�������ס������
 */
public class Action2 extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {

	private Map<String, Object> request;
	private Map<String, Object> session;
	private Map<String, Object> application;
	

	@Override
	public String execute() throws Exception {
		request.put("rr", "rr");
		session.put("ss", "ss");
		application.put("aa", "aa");
		return SUCCESS;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	
}

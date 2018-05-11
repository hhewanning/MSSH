package com.huayi.action;

import org.apache.log4j.Logger;

public class CommonAction {
	private static final Logger LOGGER = Logger.getLogger(UserAction.class);
	private String page;
	public String goPage(){
		return "";
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
}

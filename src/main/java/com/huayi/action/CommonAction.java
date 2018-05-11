package com.huayi.action;

import org.apache.log4j.Logger;

public class CommonAction {
	private static final Logger LOGGER = Logger.getLogger(UserAction.class);
	public String goMainPage(){
		LOGGER.info("去adminjsps/admin/main.jsp页面");
		return "success";
	}
}

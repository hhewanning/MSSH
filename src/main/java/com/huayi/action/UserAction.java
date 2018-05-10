package com.huayi.action;

import java.util.Date;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.huayi.model.User;
import com.huayi.service.IUserService;

public class UserAction {
	private static final Logger LOGGER = Logger.getLogger(UserAction.class);
	@Autowired
	private IUserService userService;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String reg() {
		LOGGER.info("Info:调用接口 [userAction reg]成功");
		user.setId(UUID.randomUUID().toString());
		user.setRegtime(new Date());
		if (null==user.getPassword()||"".equals(user.getPassword().trim())) {
			LOGGER.error("逻辑错误:password不能为空");
			ServletActionContext.getContext().getSession().put("msg", "注册失败了");
			return "error";
		}
		try {
			userService.addUser(user);
			ServletActionContext.getContext().getSession().put("user", user);
			ServletActionContext.getContext().getSession().put("msg", "注册成功了，可以去登陆了");
			LOGGER.info("Info:用户 ["+user.getUsername()+"]注册成功");
			return "success";

		} catch (Exception e) {
			LOGGER.error("注册失败了" +e.getMessage(),e);
			e.printStackTrace();
			ServletActionContext.getContext().getSession().put("msg", "注册失败了");
			return "error";
		}
	}
}
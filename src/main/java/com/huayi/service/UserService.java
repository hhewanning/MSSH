package com.huayi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huayi.dao.UserDaoI;
import com.huayi.model.User;

@Service("userService")
@Transactional
public class UserService  implements IUserService// 之前这里写错成了UserServiceImpl，谢谢wangdianyong的提醒，此处已做修改
{
	// 自动注入dao
	@Autowired
	private UserDaoI<User> userDao;
	@Override
	public void addUser(User user) {
		userDao.save(user);
//		这里的事务灵的一匹
//		int a = 0;
//		int b = 1;
//		int c = b/a;
	}

}
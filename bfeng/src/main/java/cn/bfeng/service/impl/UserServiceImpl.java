package cn.bfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bfeng.dao.UserDao;
import cn.bfeng.entity.User;
import cn.bfeng.service.UserService;
import cn.bfeng.util.Pager;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public Pager<User> getUserPager(int pageNo, int pageSize) {
		return userDao.getUserPager(pageNo, pageSize);
	}

}

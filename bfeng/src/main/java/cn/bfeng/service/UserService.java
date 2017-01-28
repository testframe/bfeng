package cn.bfeng.service;

import cn.bfeng.entity.User;
import cn.bfeng.util.Pager;

public interface UserService extends BaseService<User> {

	public Pager<User> getUserPager(int pageNo, int pageSize);
	
}

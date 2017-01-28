package cn.bfeng.dao;

import cn.bfeng.entity.User;
import cn.bfeng.util.Pager;

public interface UserDao extends BaseDao<User> {

	public Pager<User> getUserPager(int pageNo, int pageSize);
}

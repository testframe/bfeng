package cn.bfeng.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.bfeng.entity.User;
import cn.bfeng.util.Pager;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@Override
	public Pager<User> getUserPager(int pageNo, int pageSize) {
		String hql = "from User where id>:id and role=:role";
		Map<String, Object> values = new HashMap<String, Object>();
		values.put("id", 1);
		values.put("role", 1);
		return super.selectPageByHql(pageNo, pageSize, hql, values);
	}

}

package cn.bfeng.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import cn.bfeng.dao.UserDao;
import cn.bfeng.entity.User;
import cn.bfeng.util.UserInfo;

public class CustomUserDetailServiceImpl implements UserDetailsService {

	@Autowired
	private UserDao userDao;

	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
		User user = userDao.getUniqueResult("username", username);
		UserInfo userInfo = new UserInfo(user.getUsername(), user.getPassword(), true, true, true, true,
				getAuthorities(user.getRole()));
		userInfo.setSalt("1");
		return userInfo;
	}

	/**
	 * 获取用户权限
	 * 
	 * @param access
	 * @return
	 */
	public Collection<GrantedAuthority> getAuthorities(Integer role) {
		List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>(2);
		// 通用权限
		authList.add(new SimpleGrantedAuthority("ROLE_USER"));
		// 管理权限
		if (role.compareTo(2) == 0) {
			authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		}
		return authList;
	}

}

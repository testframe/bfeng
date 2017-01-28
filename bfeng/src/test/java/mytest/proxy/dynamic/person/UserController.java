package mytest.proxy.dynamic.person;

import java.lang.reflect.Proxy;

public class UserController {

	public static void main(String[] args) {
		UserDao dao = (UserDao) Proxy.newProxyInstance(UserDaoImpl.class.getClassLoader(),
				UserDaoImpl.class.getInterfaces(), new UserHandler(new UserDaoImpl()));
		dao.say();
	}

}

package mytest.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		RealSubject rs = new RealSubject();
		InvocationHandler ds = new DynamicSubject(rs);
		Class<?> clazz = rs.getClass();
		Subject subject = (Subject) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), ds);
		subject.request();
	}

}

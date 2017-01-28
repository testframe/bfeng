package mytest.proxy.dynamic.person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserHandler implements InvocationHandler {

	private Object object;

	public UserHandler(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before");
		Object result = method.invoke(object, args);
		System.out.println("after");
		return result;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

}

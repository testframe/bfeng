package mytest.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject implements InvocationHandler {

	private Object sub;

	public DynamicSubject() {

	}

	public DynamicSubject(Object obj) {
		sub = obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before calling " + method);
		method.invoke(sub, args);
		System.out.println("after calling " + method);
		return null;
	}

	public Object getSub() {
		return sub;
	}

	public void setSub(Object sub) {
		this.sub = sub;
	}

}

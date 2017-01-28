package mytest.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestReflect {

	public static void main(String[] args) throws Exception {
		System.out.println("Method1:获取包名");
		TestReflect testReflect = new TestReflect();
		System.out.println(testReflect.getClass().getName());
		
		System.out.println("----------------------");
		
		System.out.println("Method2:调用类A方法，实现1");
		// Class<?> clazz = Class.forName("mytest.reflect.A");
		Class<?> clazz = A.class;
		Object o = clazz.newInstance();
		Method method = clazz.getMethod("sayHello", String.class);
		for (int i = 0; i < 5; i++) {
			method.invoke(o, Integer.toString(i));
		}
		
		System.out.println("----------------------");
		
		System.out.println("Method2:调用类A方法，实现2");
		for(int i=0;i<3;i++){
			method.invoke(clazz.newInstance(), Integer.toString(i));
		}

		System.out.println("----------------------");
		
		System.out.println("Method3:获取类B所有属性及类型，权限");
		Class<?> clazz2 = B.class;
		Field[] field = clazz2.getDeclaredFields();
		for (int i = 0; i < field.length; i++) {
			int mo = field[i].getModifiers();
			String priv = Modifier.toString(mo);
			Class<?> type = field[i].getType();
			System.out.println(priv + " " + type.getName() + " " + field[i].getName() + ";");
		}
	}

}

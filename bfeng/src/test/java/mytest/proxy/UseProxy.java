package mytest.proxy;

public class UseProxy {

	public static void main(String[] args) {
		RealSubject real = new RealSubject();
		Subject sub = new ProxySubject(real);
		sub.request();
	}

}

package mytest.proxy;

public class ProxySubject extends Subject {

	private Subject realSubject;

	public ProxySubject(Subject realSubject) {
		this.realSubject = realSubject;
	}

	public void request() {
		preRequest();
		realSubject.request();
		postRequest();
	}

	private void postRequest() {
		System.out.println("postRequest");
	}

	private void preRequest() {
		System.out.println("preRequest");
	}

	public Subject getRealSubject() {
		return realSubject;
	}

	public void setRealSubject(Subject realSubject) {
		this.realSubject = realSubject;
	}

}

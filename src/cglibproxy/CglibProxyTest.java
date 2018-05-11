package cglibproxy;

public class CglibProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CglibProxy cglibProxy = new CglibProxy();
		Hello hello =new Hello();
		Hello helloProxy=(Hello) cglibProxy.getProxy(hello);
		helloProxy.sayHello();

	}

}

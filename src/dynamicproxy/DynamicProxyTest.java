package dynamicproxy;

public class DynamicProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DynamicProxy dynamicProxy = new DynamicProxy();
		Hello hello = new HelloImpl();
		Hello helloProxy = (Hello) dynamicProxy.getProxy(hello);
		helloProxy.sayHello();
		

	}

}

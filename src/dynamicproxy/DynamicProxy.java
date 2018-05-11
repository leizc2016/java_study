package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * 
 * @author LeiZhicheng
 * 
 * @date：2017-3-30
 */
public class DynamicProxy implements InvocationHandler {

	private Object target;

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	public Object getProxy(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("开始调用方法：" + method.getName());
		Object result = method.invoke(target, args);
		System.out.println("获得结果为：" + result);
		return result;
	}

}

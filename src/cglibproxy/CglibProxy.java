package cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	
	private Object target;

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}
	
	public Object getProxy(Object target)
	{
		this.target = target;
		Enhancer proxy = new Enhancer();
		proxy.setClassLoader(target.getClass().getClassLoader());
		proxy.setSuperclass(target.getClass());
		proxy.setCallback(this);
		
		return proxy.create();
	}

	@Override
	public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		
		System.out.println("开始调用方法：" + method.getName());
		Object result = methodProxy.invoke(this.target, args);
		System.out.println("获得结果为：" + result);
		return result;
	}

}

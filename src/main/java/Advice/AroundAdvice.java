package Advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import Bean.Publish;

public class AroundAdvice implements MethodInterceptor{
	private Publish publish;
	
	public Publish getPublish() {
		return publish;
	}

	public void setPublish(Publish publish) {
		this.publish = publish;
	}

	public Object invoke(MethodInvocation mi) throws Throwable {
		publish.before();
		Object proceed = mi.proceed();
		publish.after();
		return proceed;
	}

}

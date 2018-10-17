package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	//here we add related advices for logging
	
	@Before("execution(public void addAccount())")
	public void beforeAddAccountService() {
		
		System.out.println("\n =====>> Executing @Before advice on addAccount() method");
		
	}
	
}
	
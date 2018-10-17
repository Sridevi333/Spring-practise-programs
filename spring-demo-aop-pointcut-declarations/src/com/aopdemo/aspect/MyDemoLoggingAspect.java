package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// here we add related advices for logging

	@Pointcut("execution(* com.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {
	}

	@Before("forDaoPackage()")
	public void beforeAddAccountService() {

		System.out.println("\n =====>> Executing @Before advice on addAccount() method");

	}

	@Before("forDaoPackage()")
	public void performApiAnalytics() {

		System.out.println("\n =====>> Perform API Analytics");

	}

}

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
	private void forDaoPackage() {}
	
	
	//pointcut for getter methods
	@Pointcut("execution(* com.aopdemo.dao.*.get*(..))")
	private void getter() {}
	
	
	//pointcut for setter methods
	@Pointcut("execution(* com.aopdemo.dao.*.set*(..))")
	private void setter() {}
	
	
	//pointcut to include package and exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageNoGetterSetter() {}
	

	@Before("forDaoPackageNoGetterSetter()")
	public void beforeAddAccountService() {

		System.out.println("\n =====>> Executing @Before advice on addAccount() method");

	}

	@Before("forDaoPackageNoGetterSetter()")
	public void performApiAnalytics() {

		System.out.println("\n =====>> Perform API Analytics");

	}

}

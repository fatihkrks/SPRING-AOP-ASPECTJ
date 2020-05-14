package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
		@Before("execution(* customer.CustomerDAO.addCustomer(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("logBefore is running !");
		System.out.println("hijacked : " +joinPoint.getSignature().getName());
		System.out.println("******");
	}
		
//		@After("execution(* customer.CustomerDAO.addCustomerReturnValue(..))")
//		public void logAfter(JoinPoint joinPoint) {
//			System.out.println("logAfter is running");
//		}
		
		@AfterReturning(pointcut = "execution(* customer.CustomerDAO.addCustomerReturnValue(..))",returning = "result" )
		public void logAfterReturn(Object result) {
			System.out.println("logAfterReturn" + result);
		}
}

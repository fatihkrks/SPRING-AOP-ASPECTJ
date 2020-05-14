package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import customer.CustomerDAO;


public class TestAspect {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			"Spring-Customer.xml");

	// get CustomerService bean
	CustomerDAO customer = context.getBean(CustomerDAO.class);
//customer.addCustomer();
	//	customer.addCustomerReturnValue();
	customer.addCustomerReturnValue();
}
}

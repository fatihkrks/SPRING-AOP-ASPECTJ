package customer;

public interface CustomerDAO {
	void addCustomer();
	String addCustomerReturnValue();
	void addCustomerThrowException() throws Exception;
	void addCustomerAround(String name);
}

package vn.techmaster.cleancode;

public interface Customer {
	float getTotalCost(float CallCost, float SmsCost);

	void getTotal(CustomerType customer, float CallCost, float SmsCost) throws Exception;
}

package vn.techmaster.cleancode;

public class MonthlyStatement implements Customer {
	public float total;

	@Override
	public void getTotal(CustomerType customer, float CallCost, float SmsCost) throws Exception {
		switch (customer) {
		case PayAsYouGo:
			total = getTotalCost(CallCost, SmsCost);
			break;
		case Unlimited:
			total = 54.90f;
			break;
		default:
			throw new Exception("The current customer type is not supported");
		}
	}

	@Override
	public float getTotalCost(float CallCost, float SmsCost) {
		return (0.12f * CallCost) + (0.12f * SmsCost);
	}
}

package vn.techmaster.cleancode;

public class Main {

	public static void main(String[] args) throws Exception {
		MonthlyStatement ms = new MonthlyStatement();
		ms.getTotal(CustomerType.PayAsYouGo, 200, 500);
		System.out.println(ms.total);
	}
}

package vn.techmaster.payroll.repo;

import java.io.IOException;
import java.util.List;

import vn.techmaster.payroll.model.Employee;

public interface IEmployee {
	/**
	 * Lấy danh sách employee từ CSV
	 * @return list Employee
	 */
	List<Employee> getEmployeeFromCSV() throws IOException;
	
	/**
	 * Lấy danh sách employee từ Excel
	 * @return list Employee
	 */
	List<Employee> getEmployeeFromExcel(String excelFilePath) throws IOException;
	
}

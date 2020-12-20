package vn.techmaster.payroll.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import vn.techmaster.payroll.model.Employee;
import vn.techmaster.payroll.services.EmployeeServies;

@RestController
public class HomeController {

	@Autowired
	private EmployeeServies employeeServies;
	
	private static final Logger LOG = Logger.getLogger(HomeController.class);
	
	@ResponseBody
	@GetMapping(value = "/employee", produces = MediaType.TEXT_HTML_VALUE)
	public String getEmployees() {
		StringBuilder sb = new StringBuilder();
		try {
			List<Employee> emp = employeeServies.getEmployeeFromCSV();
			emp.forEach((value) -> {
				System.out.println(value);
				sb.append(value + "<br>");
			});
		} catch (IOException e) {
			LOG.error(e);
		}
		return sb.toString();
	}
	
	@ResponseBody
	@GetMapping(value = "/age-employee", produces = MediaType.TEXT_HTML_VALUE)
	public String getAgeEmployees() {
		StringBuilder sb = new StringBuilder();
		LocalDate now = LocalDate.now(); //gets localDate
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		try {
			List<Employee> emp = employeeServies.getEmployeeFromCSV();
			emp.forEach((value) -> {
				Period diff = Period.between(LocalDate.parse(value.getStartdate(), formatter), now);
				sb.append(value.getName() + "&nbsp;&nbsp;&nbsp;&nbsp;" + "Age=" + value.getAge() + "&nbsp;&nbsp;&nbsp;&nbsp;"+ "Age working= " +diff.getYears() + " Year " + diff.getMonths() + " Month" + "<br>");
			});
		} catch (IOException e) {
			LOG.error(e);
		}
		return sb.toString();
	}
	
	@ResponseBody
	@GetMapping(value = "/cal-salary", produces = MediaType.TEXT_HTML_VALUE)
	public String getCalSalary() {
		StringBuilder sb = new StringBuilder();
		LocalDate now = LocalDate.now(); //gets localDate
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		try {
			List<Employee> emp = employeeServies.getEmployeeFromCSV();
			emp.forEach((value) -> {
				Period diff = Period.between(LocalDate.parse(value.getStartdate(), formatter), now);
				sb.append(value.getName() + "&nbsp;&nbsp;&nbsp;&nbsp;" + "Current Salary = " + (value.getSalary() * diff.getYears() * 0.06 + value.getSalary()) + "<br>");
			});
		} catch (IOException e) {
			LOG.error(e);
		}
		return sb.toString();
	}
}

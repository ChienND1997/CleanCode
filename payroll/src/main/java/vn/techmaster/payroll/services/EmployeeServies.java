package vn.techmaster.payroll.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import vn.techmaster.payroll.model.Employee;
import vn.techmaster.payroll.repo.IEmployee;
import vn.techmaster.payroll.util.PathResource;

@Service
public class EmployeeServies implements IEmployee {

	/**
	 * lấy danh sách employee CSV implement repository IEmployee
	 */
	@Override
	public List<Employee> getEmployeeFromCSV() throws IOException {
		try {
			File file = ResourceUtils.getFile("classpath:" + PathResource.PATH_EMPLOYEE);

			CsvSchema schema = CsvSchema.emptySchema().withHeader(); // Dòng đầu tiên sử dụng làm Header

			List<Employee> emp = new ArrayList<>();
			MappingIterator<Employee> empIterator = new CsvMapper().readerFor(Employee.class).with(schema)
					.readValues(file);

			while (empIterator.hasNext()) {
				Employee current = empIterator.next();
				emp.add(current);
			}
			return emp;
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			throw e;
		}
	}

	/**
	 * lấy danh sách employee Excel implement repository IEmployee
	 */
	@Override
	public List<Employee> getEmployeeFromExcel(String excelFilePath) throws IOException {
		// to do
		return null;
	}
}

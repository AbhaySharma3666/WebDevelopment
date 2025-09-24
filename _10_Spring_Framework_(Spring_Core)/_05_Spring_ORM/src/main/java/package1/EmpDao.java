package package1;



import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class EmpDao {
	private HibernateTemplate hibTemplate;

	public HibernateTemplate getHibTemplate() {
		return hibTemplate;
	}

	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}
	
	@Transactional
	public int insert(Employee employee) {
		Integer i = (Integer)this.hibTemplate.save(employee);
		return i;
	}
	
	// single data fetch
	public Employee getSingleData (int Emp_id) {
		Employee employee = this.hibTemplate.get(Employee.class, Emp_id);
		return employee;
	}
	
	// all data fetch
	public List<Employee> getAllData(){
		List<Employee> loadAll = this.hibTemplate.loadAll(Employee.class);
		return loadAll;
	}
	
	// delete data
	@Transactional
	public void deleteEmp (int Emp_id) {
		Employee deleteEmp = this.hibTemplate.get(Employee.class, Emp_id);
		this.hibTemplate.delete(deleteEmp);
	}
}

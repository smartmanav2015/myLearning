public class Employee implements Cloneable {

	private int empoyeeId;
	private String employeeName;
	private Department department;

	public Employee(int id, String name, Department dept) {
		this.empoyeeId = id;
		this.employeeName = name;
		this.department = dept;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		Department depat = new Department(department.getId(), department.getName());
		Employee e = new Employee(empoyeeId, employeeName, depat);
		return e;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empoyeeId=" + empoyeeId + ", employeeName="
				+ employeeName + ", department=" + department + "]";
	}

	public static void main (String args[]) throws CloneNotSupportedException{
		
		Department d = new Department(2, "IT");
		Employee e = new Employee(1, "aakash", d);
		
		System.out.println(e.toString());
		Employee e2 = (Employee) e.clone();
		e2.setEmployeeName("saxena");
		e2.getDepartment().setName("FINANCE");
		System.out.println(e2.toString());
		System.out.println(e.toString());
	}

	/**
	 * @return the empoyeeId
	 */
	public int getEmpoyeeId() {
		return empoyeeId;
	}

	/**
	 * @param empoyeeId the empoyeeId to set
	 */
	public void setEmpoyeeId(int empoyeeId) {
		this.empoyeeId = empoyeeId;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
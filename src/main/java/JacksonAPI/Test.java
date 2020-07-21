package JacksonAPI;

public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpNo(201);
		emp.setName("rama");
		emp.setSalary(20000);
		
		// json to java
		String jsonEmployee = jsonUtil.convertJavaToJson(emp);

		System.out.println(jsonEmployee);
		
		// here you want see the salary is not converted to json because of jsonignore annotations in employee class
		
		// Java to Json 
		Employee emp1 = jsonUtil.convertjsonToJava(jsonEmployee, Employee.class);
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());
		System.out.println(emp1.getEmpNo());
		
		// here you want see the salary is not converted to jav because of jsonignore annotations in employee class
	}

}

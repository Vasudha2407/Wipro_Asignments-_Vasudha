package day3;

public  class employee {
	private String name;
	private double salary;
	public employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		if(salary>0) {
			this.salary=salary;
		}
		else {
			System.out.println("invalid salary");
		}
	}
	public String getName() {
		return name;
	}

}

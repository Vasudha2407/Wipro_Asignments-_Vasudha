package day02;

public class for_q1 {
	public static void main(String[] args) {
		 double[] salaries = {30000, 35000, 40000, 45000, 50000,
                 55000, 60000, 65000, 70000, 75000};
		 for(int i=0;i<=salaries.length;) {
			 salaries[i] = salaries[i] + (salaries[i] * 0.10);
		 }
		 System.out.println("updated salaries:");
		 for(int i=0;i<=salaries.length;) {
			 System.out.println("employee"+(i+1)+":"+(int)salaries[i]);
		 }
		 
		 
	}

}

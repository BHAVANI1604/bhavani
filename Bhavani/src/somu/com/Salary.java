package somu.com;

public class Salary {

	public static void main(String[] args) {
		int basicsalary=40000;
		int jansalary=40000;
		int febsalary=(40000/28)*18;
		
		int march=basicsalary+3000;
		int salary_hike=3000;
		int bonus=basicsalary/10;
		System.out.println("bonus for 10 days:"+bonus);
		int april=basicsalary+salary_hike+bonus;
		System.out.println("Jan salary:"+jansalary);
		System.out.println("Feb Salary:"+febsalary);
		System.out.println("march Salary:"+march);
		System.out.println("April month Salary:"+april);
		

	}

}

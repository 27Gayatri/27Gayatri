package lang.java;

public class Company {
int salary;
  void setsalary(int fulltime,int overtime)
{
	salary=fulltime+overtime;
	
}
  void getsalary()
{
	System.out.println("salary is"+salary);
	
}
public static void main(String args[])
{
	Company comp=new Company();
	comp.setsalary(50000, 40000);
	comp.getsalary();
}
}

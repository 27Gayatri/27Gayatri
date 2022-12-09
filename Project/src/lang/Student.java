package lang;
public class Student {
public interface Sports
{
 float w=6.0f;
 void puywt();
}
	int rn;
	void getno(int n)
	{
		rn=n;
	}
	void putno()
	{
		System.out.println("rollno is :" +rn);
	}
	 class Test extends Student 
	 {
		 float part1,part2;
   void getmark(float m1, float m2)
   {
			 part1=m1;
			 part2=m2;
		 }
   void  putmark()
   {
	   System.out.println("marks is obtained");
	   System.out.println("M1 is:"+part1);
	   System.out.println("m2 is :"+part2);
   }
	 }
	 class Result extends Test implements Sports //interface is implement 
{
	float total ;
	public void putwt()
	{
		System.out.println("SportWt:" );
	}
	void display()
	{
		total=part1+part2;
		putno();
		putmark();
		putwt();
		System.out.println("Total SCore:"+total);
}
	public void puywt() {
		// TODO Auto-generated method stub
		
	}
}
    class Data{
	
    public void main(String args[]) {
		// TODO Auto-generated method	
Result t2= new Result();
     t2.getno(22);
     t2.getmark(30.4f,33);
     t2.display();
}}}
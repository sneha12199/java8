package Day5;

public class Employee {
int eid;
String ename;
double sal;
int dept;
String job;



void display()
{
	System.out.println(eid);
	System.out.println(ename);

	System.out.println(sal);

	System.out.println(dept);

	System.out.println(job);

}
public static void main(String[] args) {
	Employee emp1=new Employee();
	emp1.eid=101;
	emp1.ename="Sona";
	emp1.sal=78000.00;
	emp1.dept=01;
	emp1.job="Manager";
	emp1.display();
	
			
}
}



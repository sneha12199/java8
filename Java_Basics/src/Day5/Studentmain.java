package Day5;

public class Studentmain {
	public static void main(String[] args) {
		Student	stu1=new Student();
		
		//assign values by using reference variable
//		stu1.sid=10;
//		stu1.sname="sneha";
//		stu1.grade='A';
		stu1.getvalues(10, "Sona",'S');
//		
//		
		
		//to assign values by using method
		//
		stu1.display();
		
		
	}

}

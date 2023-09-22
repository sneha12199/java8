package Day5;

public class Studentmainclass {
	public static void main(String[] args) {
		Student stu1=new Student();//Assign values by using reference vriable
//		stu1.sid=101;
//		stu1.sname="sneha";
//		stu1.grade='S';
		stu1.getvalues(101, "Sneha", 'S');
		stu1.display();
	}

}

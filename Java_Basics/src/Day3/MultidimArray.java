package Day3;

public class MultidimArray {

	public static void main(String[] args) {
		int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;

		a[1][0]=300;

		a[1][1]=400;
		a[2][0]=500;

		a[2][1]=600;


//		int a[][]= {{100,200},{300,400},{500,600}};//assign the values of array
	
//System.out.println("number of rows is:"+a.length);
//System.out.println("number of column:"+a[0].length);
//for(int i=0;i<a.length;i++)
//{
//	for(int j=0;j<a[i].length;j++)
//	{
//		System.out.println(a[i][j]);
//	}
//}
//	}
//}
//
//enhanced for loop
	for(int r[]:a)
	{
		for(int i:r)
		{
			System.out.println(i);
		}
	}
	}
}
	



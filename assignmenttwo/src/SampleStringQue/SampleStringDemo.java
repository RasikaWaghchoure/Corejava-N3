package SampleStringQue;
import java.util.Scanner;

public class SampleStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String:");
		String str1=sc.nextLine();
		System.out.println("The first String is:"+str1);
		String str2=new String(sc.nextLine());
		System.out.println("the Sceond String:"+str2);
		//String str2=sc.nextLine();
		if(str1.equals(str2)) {
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");
		}
		char c[]= {'h','h','r','t','u'};
		//
		//String 
	}

}

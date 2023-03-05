import java.util.Scanner;
public class bai3_lab2 {
	public static void main(String[] arg)
	{
		String a;
		int b,c;
		Scanner sc=new Scanner(System.in);
		a=	sc.nextLine();
		System.out.print("nam sinh: ");
		b=sc.nextInt();
		c=2022-b;
		if(c<16)
			System.out.println("Ban "+a+" o do tuoi vi thanh nien");
		else if (c>=16 && c<18)
			System.out.println("Ban "+a+" o do tuoi truong thanh");
		else 
			System.out.println("Ban "+a+" da gia");
	}

}

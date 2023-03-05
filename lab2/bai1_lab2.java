package lab2;

import java.util.Scanner;

public class bai1_lab2 {
	public static void main(String[] arg)
	{	int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap a=");
		a=sc.nextInt();
		System.out.print("nhap b=");
		b=sc.nextInt();
		System.out.println("tong " +(a+b));
		System.out.println("tich " +(a-b));
		System.out.println("hieu " +(a*b));
		System.out.println("thuong " +(a/b));
		System.out.println("chia lay du " +(a%b));
		if (a>b)
			System.out.println(a+">"+b);
		if (a<b)
			System.out.println(a+"<"+b);
		if (a==b)
			System.out.println(a+"="+b);
	}

}

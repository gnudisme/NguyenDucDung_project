import java.util.Scanner;
public class bai2_lab2 {
	public static void main(String[] arg) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("nhap a=");
		a=sc.nextInt();
		if (a %2==0) 
			System.out.println(a+ " la so chan");
		else 
			System.out.println(a+ " la so le");
			
	}

}

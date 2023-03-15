
import java.util.Scanner;
public class bai8_lab2 {
	public static void main(String[] arg)
	{	int n;
		double tbc=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.print("nhap n: ");
			n=sc.nextInt();
		}while(n<0);
		int a[]=new int[n];
		for (int i=0;i<n;i++)
		{
			System.out.print("a["+i+"]= ");
			a[i]=sc.nextInt();
			tbc+=a[i];
		}
		System.out.print("Trung binh cong cua mang n:"+(tbc/n));
	}
}

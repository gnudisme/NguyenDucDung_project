package lab3;
import java.util.Scanner;
class sach{
	private String ma, ten, tacgia;
	private int trang, tap, gia;
	private String loai,nxb;
	public void nhapsach(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ma sach: ");
		ma=sc.nextLine();
		System.out.println("Nhap ten sach: ");
		ten=sc.nextLine();
		System.out.println("Nhap ten tac gia: ");
		tacgia=sc.nextLine();
		System.out.println("Nhap so trang: ");
		trang=sc.nextInt();
		System.out.println("Nhap so tap: ");
		tap=sc.nextInt();
		System.out.println("Nhap gia: ");
		gia=sc.nextInt();
		System.out.println("Nhap loai sach: ");
		loai=sc.nextLine();
		System.out.println("Nhap NXB: ");
		nxb=sc.nextLine();
	}
	public void insach() {
		System.out.println("Ma sach: "+ma);
		System.out.println("Ten sach: "+ten);
		System.out.println("Tac gia: "+tacgia);
		System.out.println("So trang: "+trang);
		System.out.println("So tap: "+tap);
		System.out.println("Loai sach: "+loai);
		System.out.println("NXB: "+nxb);
	}
	
}
public class bai1 {
	public static void main(String[] arg) {
		int n;
		sach s[];
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap n:");
		n=sc.nextInt();
		s=new sach[n];
		for (int i=0;i<n;i++)
		{
			s[i]=new sach();
			s[i].nhapsach();
		}
		System.out.println("Sach da nhap: ");
		for (int i=0;i<n;i++)
			s[i].insach();
	}
}

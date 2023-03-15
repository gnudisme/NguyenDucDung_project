
import java.util.Scanner;

public class bai6_lab2 {
    public static void main(String[] args) {
        int n,i;
        long gt=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            gt*=i;
        }
        System.out.println(n+"!= "+gt);
    }
}
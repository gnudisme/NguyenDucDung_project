package lab3;
import java.util.Scanner;

class Diem{
    int x,y,a,b,c;
    float r;
    double cv,dt,p,pi=3.14;
    void Nhapdiem(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap x: ");
        x=sc.nextInt();
        System.out.print("Nhap y: ");
        y=sc.nextInt();
    }
    void Indiem(){
        System.out.println("Diem x: "+x);
        System.out.println("Diem y: "+y);
    } 
}
class Tamgiac extends Diem{
    void Nhaptg(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap a: ");
        a=sc.nextInt();
        System.out.print("Nhap b: ");
        b=sc.nextInt();
        System.out.print("Nhap c: ");
        c=sc.nextInt();
    }
    void Intamgiac(){
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
    }
    void Kiemtra(){
        if((a+b<=c)||(a+c<=b)||(b+c<=a))
            System.out.println("Day khong phai la tam giac");
        else
            System.out.println("Day la tam giac");
        
    }
    void Chuvi(){
        cv=(float)a+b+c;
        System.out.println("Chu vi: "+cv);
    }
    void Dientich(){
        p=cv/2.0f;
        dt=(float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Dien tich: "+dt);
    }}
    class Hinhtron extends Tamgiac{
        Scanner sc=new Scanner(System.in);
        void Nhapht(){
            System.out.print("Nhap r: ");
            r=sc.nextFloat();
        }
        void Inht(){
            System.out.println("Ban kinh la: "+r);
        }
        void Chuvi(){
            cv=(2*r)*pi;
            System.out.println("Chu vi hinh tron la: "+cv);
        }
        void Dientich(){
            dt=r*r*pi;
            System.out.println("Dien tich hinh tron la: "+dt);
        }
    }
 public class bai2{
    public static void main(String[] args) {
        int select;
        Scanner sc=new Scanner(System.in);
        System.out.print("chon 1 trong 3: ");
        select=sc.nextInt();
        switch(select){
        case 1:
        Diem d=new Diem();
        d.Nhapdiem();
        d.Indiem();
        break;
        case 2:
        Tamgiac tg=new Tamgiac();
        tg.Nhaptg();
        tg.Intamgiac();
        tg.Kiemtra();
        tg.Chuvi();
        tg.Dientich();
        break;
        case 3:
        Hinhtron ht=new Hinhtron();
        ht.Nhapht();
        ht.Inht();
        ht.Chuvi();
        ht.Dientich();
        break;
        }
}
}

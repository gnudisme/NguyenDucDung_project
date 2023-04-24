package lab4;

import java.util.Scanner;

abstract class CongNhan {
    protected String hoten;
    protected String diachi;
    protected String loaicongnhan;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diachi = sc.nextLine();
    }

    public abstract void tinhluong();

    public void in() {
        System.out.println("Ho ten: " + hoten);
        System.out.println("Dia chi: " + diachi);
        System.out.println("Loai cong nhan: " + loaicongnhan);
    }
}

class CNKSP extends CongNhan {
    private int sosanpham;

    public CNKSP() {
        loaicongnhan = "CNKSP";
    }

    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so san pham: ");
        sosanpham = sc.nextInt();
    }

    public void tinhluong() {
        double dongia;
        Scanner sc=new Scanner(System.in);
        System.out.print("Don gia: ");
        dongia=sc.nextDouble();
        double luongthang = sosanpham * dongia;
        double thuong = 0;

        if (sosanpham >= 150) {
            thuong = 1500000;
        } else if (sosanpham >= 100) {
            thuong = 1000000;
        }

        luongthang += thuong;

        System.out.println("Luong thang cua CNKSP " + hoten + " la: " + luongthang + " dong.");
    }
}

class CNTCN extends CongNhan {
    private int songaycong;
    private double hesoluong;
    private double luongcoban;

    public CNTCN() {
    	loaicongnhan = "CNTCN";
    }

    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so ngay cong: ");
        songaycong = sc.nextInt();
        System.out.print("Nhap luong co ban: ");
        luongcoban=sc.nextDouble();
    }

    public void tinhluong() {
        double luongthang = luongcoban * songaycong;
        double thuong = 0;

        if (songaycong >= 20) {
            thuong = 1.2 * luongcoban;
        }

        luongthang += thuong;

        System.out.println("Luong thang cua CNTCN " + hoten + " la: " + luongthang + " dong.");
    }
}

public class bai6_lab4 {
    public static void main(String[] args) {
    	CNKSP cn1=new CNKSP();
        CNTCN cn2=new CNTCN();
        int luachon;
        String chon;
        do{
        Scanner sc=new Scanner(System.in);
        System.out.println("\tMENU");
        System.out.println("1.Nhap thong tin cong nhan khoan san pham.");
        System.out.println("2.Xuat thong tin cong nhan khoan san pham.");
        System.out.println("3.Nhap thong tin cong nhan tinh cong nhat.");
        System.out.println("4.Xuat thong tin cong nhan tinh cong nhat.");
        System.out.println("Chon: ");
        luachon=sc.nextInt();
        switch(luachon){
        case 1:
        cn1.nhap();
        break;
        case 2:
        cn1.in();
        cn1.tinhluong();
        break;
        case 3:
        cn2.nhap();
        break;
        case 4:
        cn2.in();
        cn2.tinhluong();
        break;
        default:
         System.out.println("Error.");
        };
        System.out.println("Nhap tiep(yes/no): ");
        sc.nextLine();
        chon=sc.nextLine();
    }while(chon!="yes");     
    }
}

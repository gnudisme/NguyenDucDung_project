package lab4;
import java.util.Scanner;
abstract class Hocvien {
    String hoTen,diaChi,loaiChuongTrinh;
    int loaiUuTien;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten hoc vien: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap dia chi hoc vien: ");
        diaChi = sc.nextLine();
        System.out.print("Nhap loai uu tien (1 hoac 2): ");
        loaiUuTien = sc.nextInt();
        System.out.print("Nhap loai chuong trinh dang ki hoc (Do hoa hoac Lap trinh): ");
        sc.nextLine();
        loaiChuongTrinh = sc.nextLine();
    }

    public abstract void hocPhi();

    public void inThongTin() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Loai uu tien: " + loaiUuTien);
        System.out.println("Loai chuong trinh dang ki hoc: " + loaiChuongTrinh);
    }
}

class HocvienDH extends Hocvien {
    int soBuoi,donGia,hocphi;

    public void hocPhi() {
        int uuTien = 0;
        if (loaiUuTien == 1) {
            uuTien = 1000000;
        } else if (loaiUuTien == 2) {
            uuTien = 500000;
        }
        int hocPhi = soBuoi * donGia - uuTien;
        System.out.println("Hoc phi: " + hocPhi);
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so buoi hoc: ");
        soBuoi = sc.nextInt();
        System.out.print("Nhap gia: ");
        donGia=sc.nextInt();
    }

    public HocvienDH() {
        loaiChuongTrinh = "Do hoa";
    }
}

class HocvienLT extends Hocvien {
    int soBuoi,donGia;

    public void hocPhi() {
        int uuTien = 0;
        if (loaiUuTien == 1) {
            uuTien = 1000000;
        } else if (loaiUuTien == 2) {
            uuTien = 800000;
        }
        int hocPhi = soBuoi * donGia - uuTien;
        System.out.println("Hoc phi: " + hocPhi);
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so buoi hoc: ");
        soBuoi = sc.nextInt();
        System.out.print("Nhap gia: ");
        donGia=sc.nextInt();
    }

    public HocvienLT() {
        loaiChuongTrinh = "Lap trinh";
    }
}
public class bai4_lab4{
	public static void main(String[] args) {
        HocvienDH hvdh=new HocvienDH();
        HocvienLT hvlt=new HocvienLT();
        int luachon;
        String chon;
        do{
        Scanner sc=new Scanner(System.in);
        System.out.println("\tMENU");
        System.out.println("1.Nhap thong tin sinh vien.");
        System.out.println("2.Xuat thong tin sinh vien.");
        System.out.println("Chon: ");
        luachon=sc.nextInt();
        switch(luachon){
        case 1:
        hvdh.nhapThongTin();
        break;
        case 2:
        hvdh.inThongTin();
        hvdh.hocPhi();
        break;
        default:
         System.out.println("Error");
        };
        System.out.println("Nhap tiep(yes/no): ");
        sc.nextLine();
        chon=sc.nextLine();
    }while(chon!="yes");
    }
}


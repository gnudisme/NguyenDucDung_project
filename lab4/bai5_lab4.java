package lab4;
import java.util.Scanner;

abstract class GiangVien{
    String hoTen,diaChi,loaiGiangVien;
    public void nhapThongTin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen=sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi=sc.nextLine();
        System.out.println("Nhap loai giang vien: ");
        loaiGiangVien=sc.nextLine();
    }
    GiangVien(){

    }
    public abstract void tinhLuong();
    public void inThongTin(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Dia chi: "+diaChi);
        System.out.println("Loai giang vien: "+loaiGiangVien);
    }
}
class GVCoHuu extends GiangVien{
    int heSoLuong;
    double luongThang,phuCap,luongCoBan,thamNien;
    GVCoHuu(){

    }
    public void nhapThongTin(){
        System.out.println("\tGIANG VIEN CO HUU");
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao luong co ban: ");
        luongCoBan=sc.nextDouble();
        System.out.println("Nhap vao he so luong:: ");
        heSoLuong=sc.nextInt();
        System.out.println("Nhap vao tham nien: ");
        thamNien=sc.nextDouble();
    }
    public void tinhLuong(){
        if(thamNien<5){
            phuCap=0;        
        }else if(thamNien==5){
            phuCap=0.05*luongCoBan;
        }else{
            phuCap=(thamNien*luongCoBan)/100;
        };
        luongThang=luongCoBan*heSoLuong+phuCap;
        System.out.println("Luong cua giao vien: "+luongThang);
        }
    }
    
class GVThinhGiang extends GiangVien{
    int soTietDay,donGia;
    double luongThang,thuNhap;
    GVThinhGiang(){

    }
    public void nhapThongTin(){
        System.out.println("\tGIANG VIEN THINH GIANG");
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so tiet day: ");
        soTietDay=sc.nextInt();
        System.out.println("Nhap don gia: ");
        donGia=sc.nextInt();
    }
    public void tinhLuong(){
        thuNhap=0.15*soTietDay*donGia;
        luongThang=soTietDay*donGia-thuNhap;
        System.out.println("Luong cua giao vien: "+luongThang);
    }
    
}
class bai5_lab4{
    public static void main(String[] args) {
    		    GVCoHuu gv1 = new GVCoHuu();
    		    GVThinhGiang gv2 = new GVThinhGiang();
    		    System.out.println("Nhap thong tin giao vien co huu: ");
    		    gv1.nhapThongTin();
    		    System.out.println("Thong tin giao vien co huu: ");
    		    gv1.inThongTin();
    		    System.out.println("Nhap thong tin giao vien thinh giang: ");
    		    gv2.nhapThongTin();
    		    System.out.println("Thong tin giao vien thinh giang: ");
    		    gv2.inThongTin();   
    }
}
package lab3;

import java.util.ArrayList;
import java.util.Scanner;
class hanghoa {
    String mahang, tenhang, nhasx;
    double gia;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang: ");
        mahang = sc.nextLine();
        System.out.println("Nhap ten hang: ");
        tenhang = sc.nextLine();
        System.out.println("Nhap nha san xuat: ");
        nhasx = sc.nextLine();
        System.out.println("Nhap gia: ");
        gia = sc.nextDouble();
    }
    public String toString() {
        return("\nMa hang: "+mahang+"\tTen hang: "+tenhang+"\tNha san xuat: "+nhasx+"\tGia: "+gia);
        
    }
}
class hangdienmay extends hanghoa {
    String tg_bao_hanh;
    int dien_ap;
    double cong_suat;
    Scanner sc = new Scanner(System.in);
    public void nhap() {
        super.nhap();
        System.out.println("Thoi gian bao hanh: ");
        tg_bao_hanh = sc.nextLine();
        System.out.println("Dien ap: ");
        dien_ap = sc.nextInt();
        System.out.println("Cong suat: ");
        cong_suat = sc.nextDouble();
    }
    public String toString() {
        return("\nHang dien may\tMa hang: "+mahang+"\tTen hang: "+tenhang+"\tNha san xuat: "+nhasx+"\tGia: "+gia+"\tThoi gian bao hanh: "+(String)tg_bao_hanh +"\tDien ap: "+dien_ap+"\tCong suat: "+cong_suat);
    }
}
class hangThucPham extends hanghoa{
    String ngay_san_xuat, ngay_het_han;
    Scanner sc = new Scanner(System.in);
  
    public void nhap() {
        super.nhap();
        System.out.println("Ngay san xuat: ");
        ngay_het_han = sc.nextLine();
        System.out.println("Ngay het han: ");
        ngay_san_xuat = sc.nextLine();
    }
   
    public String toString() {
        return("\nHang thuc pham\tMa hang: "+mahang+"\tTen hang: "+tenhang+"\tNha san xuat: "+nhasx+"\tGia: "+gia+"\tNgay san xuat: "+ ngay_san_xuat +"\tNgay het han: "+ ngay_het_han);
    }
}
class hangSanhSu extends hanghoa{
    String loai_nguyen_lieu;
    Scanner sc = new Scanner(System.in);
    public void nhap() {
        super.nhap();
        System.out.println("Loai nguyen lieu: ");
        loai_nguyen_lieu = sc.nextLine();
    }

    public String toString() {
        return("\nHang sanh su\tMa hang: "+mahang+"\tTen hang: "+tenhang+"\tNha san xuat: "+nhasx+"\tGia: "+gia+"\tLoai nguyen lieu: "+ loai_nguyen_lieu);
    }
}
public class bai3 {
    public static void main(String[] args) {
        ArrayList<hanghoa> dsHH = new ArrayList<hanghoa>();
        Scanner sc = new Scanner(System.in);
        int lc;
        do{
            System.out.println("\n1. Nhap hang dien may\n2. Nhap hang thuc pham\n3. Nhap hang sanh su\n4. In toan bo danh sach\n0. Thoat");
            System.out.println("Nhap lua chon cua minh: ");
            lc = sc.nextInt();
        switch(lc){
            case 1:
                {
                    hangdienmay dm = new hangdienmay();
                    dm.nhap();
                    dsHH.add(dm);
                    break;
                }
            case 2:
            {
                hangThucPham tp = new hangThucPham();
                tp.nhap();
                dsHH.add(tp);
                break;
            }
            case 3:
            {
                hangSanhSu ss = new hangSanhSu();
                ss.nhap();
                dsHH.add(ss);
                break;
            }
            case 4:
            {
                if(dsHH.size()==0){ 
                    System.out.println("Danh sach rong!"); 
                    break;}
                else 
                    for(hanghoa i : dsHH){
                    System.out.println(i);
                    System.out.println();}
                    break;
            }
            default: {
                System.out.println("Da thoat");
                break;
            }
        }
    }while(lc != 0);
    }
}

package lab4;
class Nguoi
{
	String ten, gioitinh;
	int tuoi;
	public Nguoi() {
	}
	public Nguoi(String ten,int tuoi,String gioitinh)
	{
		this.ten=ten;
		this.tuoi=tuoi;
		this.gioitinh=gioitinh;
	}
	public String getten()
	{
		return ten;
	}
	public void setten(String ten) {
		this.ten=ten;
	}
	public int gettuoi() {
		return tuoi;
	}
	public void settuoi(int tuoi)
	{
		this.tuoi=tuoi;
	}
	public String gioitinh() {
		return gioitinh;
	}
	public void setgioitinh(String gioitinh)
	{
		this.gioitinh=gioitinh;
	}
	public String toString() {
		return ("Ten: "+ten+"\nTuoi: "+tuoi+"\nGioi tinh: "+gioitinh);
	}
}
class Benhvien{
	String ten,diachi,giamdoc;
	public Benhvien(String ten,String diachi,String giamdoc) {
		this.ten=ten;
		this.diachi=diachi;
		this.giamdoc=giamdoc;
	}
	public String setten() {
		return ten;
	}
	public void getten(String ten) {
		this.ten=ten;
	}
	public String setdiachi() {
		return diachi;
	}
	public void setdiachi(String diachi) {
		this.diachi=diachi;
	}
	public String setgiamdoc() {
		return giamdoc;
	}
	public void getgiamdoc(String giamdoc) {
		this.giamdoc=giamdoc;
	}
	public String toString() {
		return ("Ten: "+ten+"\nDia chi:"+diachi+"\nGiam doc: "+giamdoc);
	}
}
class Benhnhan extends Nguoi{
	String tiensu, chandoan;
	Benhvien bv;
	public Benhnhan(String ten,int tuoi,String gioitinh,String tiensu,String chandoan,Benhvien bv) {
		super(ten,tuoi,gioitinh);
		this.tiensu=tiensu;
		this.chandoan=chandoan;
		this.bv=bv;
	}
	public String gettiensu() {
		return tiensu;
	}
	public void settiensu(String tiensu) {
		this.tiensu=tiensu;
	}
	public String setchandoan() {
		return chandoan;
	}
	public void getchandoan() {
		this.chandoan=chandoan;
	}
	public String toString() {
		return (super.toString()+"\nTien su: "+tiensu+"\nChan doan: "+chandoan+bv);
	}
}

public class bai1_lab4 {
	public static void main(String[] arg) {
		Benhvien bv=new Benhvien("Hoa Binh","Hoa Binh","none");
		Benhnhan bn=new Benhnhan("Nguyen Duc Dung", 20 ,"Nam","Khong","Khong",bv);
		System.out.println(bn);
	}
}
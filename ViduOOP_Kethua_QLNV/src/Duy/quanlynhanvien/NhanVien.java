package Duy.quanlynhanvien;

public class NhanVien {
	private String maNV;
	private String hoTen;
	private double luongcoban;
	
	//public NhanVien() {
		
	//}
	//public NhanVien(String ma NhanVien, String tenNhanVien, double luongcoban) {
		//this.maNV= maNhanVien;
		//this.hoTen = tenNhanVien;
		//this.luongcoban = luongcoban;
	//}
	public NhanVien(String maNV, String hoTen, double luongcoban) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luongcoban = luongcoban;
	}
	public NhanVien() {
		super();
	}
	public double tinhluong() {
		return luongcoban;
	}
	@Override
	public String toString() {	
		String chuoixuat="";
		chuoixuat = chuoixuat + "Ma NV: " +  this.maNV;
		chuoixuat = chuoixuat + "\nHo Ten: " +  this.hoTen;
		chuoixuat = chuoixuat + "\nluong co ban: " +  this.luongcoban;
		return chuoixuat;
		//return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongcoban=" + luongcoban + "]";
	}
	public void hienthithongtin() {
		 	System.out.println("Mã NV: " + maNV);
	        System.out.println("Họ tên: " + hoTen);
	        System.out.println("Lương cơ bản: " + luongcoban);
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getLuongcoban() {
		return luongcoban;
	}
	public void setLuongcoban(double luongcoban) {
		this.luongcoban = luongcoban;
	}
	
}

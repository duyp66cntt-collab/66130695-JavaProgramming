package thigk2.phamduy;

public class SinhVien {
	private String maSV;
	private String hoTen;
	private int namSinh;
	private String chuyenNganh; // Thuộc tính thứ 4 tự thêm
	public SinhVien(String maSV, String hoTen, int namSinh, String chuyenNganh) {
		
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.chuyenNganh = chuyenNganh;
	}
	public String getMaSV() {return maSV;}
	public void setMaSV(String maSV) { this.maSV = maSV; }
    public String getHoTen() { return hoTen; }
    public int getNamSinh() { return namSinh; }
	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", chuyenNganh=" + chuyenNganh
				+ "]";
	}
	
	
	
}

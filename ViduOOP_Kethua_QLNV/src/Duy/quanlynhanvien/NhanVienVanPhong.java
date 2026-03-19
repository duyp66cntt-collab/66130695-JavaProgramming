package Duy.quanlynhanvien;

public class NhanVienVanPhong extends NhanVien {
		private double sogiolamthem;
		private double luongthemmoigio;
		public NhanVienVanPhong(String maNV, String hoTen, double luongcoban, double sogiolamthem,
				double luongthemmoigio) {
			super(maNV, hoTen, luongcoban);
			this.sogiolamthem = sogiolamthem;
			this.luongthemmoigio = luongthemmoigio;
		}
		@Override
		public double tinhluong() {
			return super.getLuongcoban() + sogiolamthem*luongthemmoigio;
		}
		@Override
		public void hienthithongtin() {
			super.hienthithongtin();
			System.out.println("so gio lam them: " + sogiolamthem);
	        System.out.println("Lương cho moi gio lam them: " + luongthemmoigio);
	        System.out.println("luong duoc nhan: " + tinhluong());
	}
		@Override
		public String toString() {
			
			String chuoixuat=super.toString();
			chuoixuat = chuoixuat + "\nso gio lam them: " +  sogiolamthem;
			chuoixuat = chuoixuat + "\nLương cho moi gio lam them: " + luongthemmoigio;
			chuoixuat = chuoixuat + "\nluong duoc nhan: " + tinhluong();
			return chuoixuat;
			//return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongcoban=" + luongcoban + "]";
		}
		
	
}

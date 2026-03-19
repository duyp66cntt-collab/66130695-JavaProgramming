package Duy.quanlynhanvien;

public class Run {

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("001", "Pham Duy", 2300000);
		nv1.hienthithongtin();
		System.out.print(nv1.toString());
		NhanVienVanPhong nvVanPhong1= new NhanVienVanPhong("002", "Pham Duy", 2300000, 3, 200000);
		System.out.print(nvVanPhong1.toString());
		//nvVanPhong1.hienthithongtin();
	}

}

package Duy.quanlynhanvien;

public class Run {

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("001", "Pham Duy", 2300000);
		nv1.hienthithongtin();
		System.out.print(nv1.toString());
	}

}

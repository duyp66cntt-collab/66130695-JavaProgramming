package Duy.phuongtiengiaothong;

public class Run {

	public static void main(String[] args) {
		XeMay xemay = new XeMay("Honda", 2024, 50000000, 125, "Tay ga");
		Oto oto = new Oto("Toyota", 2025, 800000000, 5, "Xăng");
		System.out.println("--- Thông tin Xe Máy ---");
        System.out.println("Hãng: " + xemay.hangsanxuat);
        System.out.println("Vận tốc tối đa: " + xemay.layvantoctoida() + " km/h");
        System.out.println("Số chỗ ngồi: " + xemay.laysochongoi());

        System.out.println("\n--- Thông tin Ô Tô ---");
        System.out.println("Hãng: " + oto.hangsanxuat);
        System.out.println("Vận tốc tối đa: " + oto.layvantoctoida() + " km/h");
        System.out.println("Số chỗ ngồi: " + oto.laysochongoi());
        System.out.println("Thuế trước bạ: " + oto.tinhThueTruocBa() + " VNĐ");
	}

}

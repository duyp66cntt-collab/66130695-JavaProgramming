package Duy.hethonghinhoc;

public class Run {

	public static void main(String[] args) {
		Hinhhoc hinh1 = new HinhTron("xanh", 5.0);
		Hinhhoc hinh2 = new HinhVuong("Đỏ", 5.0);
		
		hinh1.hienthithongtin();
		hinh1.phongTo(1.5);
		
		System.out.println("Dien tich moi: " + hinh1.tinhdientich());
		System.out.println("\n---\n");
		
		hinh2.hienthithongtin();
        System.out.println("Đường chéo: " + ((HinhVuong)hinh2).tinhduongcheo());
	}

}

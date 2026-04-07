package Duy.hethonghinhoc;

public class HinhVuong extends Hinhhoc {
	private double canh;

	public HinhVuong(String mausac, double canh) {
		super(mausac);
		this.canh = canh;
	}
	@Override
	public double tinhdientich() {
		return canh * canh;
	}
	@Override
	public double tinhchuvi() {
		return canh*4;
	}
	@Override
    public void phongTo(double tyLe) {
        this.canh *= tyLe;
        System.out.println("Phóng to hình vuông lên " + tyLe + " lần");
    }
	public double tinhduongcheo() {
		return canh * Math.sqrt(2);
	}
}

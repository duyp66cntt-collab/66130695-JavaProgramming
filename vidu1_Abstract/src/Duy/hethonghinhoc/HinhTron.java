package Duy.hethonghinhoc;

public class HinhTron extends Hinhhoc{
	private double bankinh;

	 public HinhTron(String mausac, double bankinh) {
		super(mausac);
		this.bankinh = bankinh;
	 }
	 @Override
	    public double tinhdientich() {
	        return Math.PI * bankinh * bankinh;
	 }
	 @Override
	 public double tinhchuvi() {
		 return 2*Math.PI*bankinh;
	 }
	 @Override
	    public void phongTo(double tyLe) {
	        this.bankinh *= tyLe;
	        System.out.println("Phóng to hình tròn lên " + tyLe + " lần");
	    }
	    
	    
	    public double tinhDuongKinh() {
	        return bankinh * 2;
	    }
	
}

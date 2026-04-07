package Duy.hethonghinhoc;

abstract class Hinhhoc {
   
	protected String mausac;

	public String getMausac() {
		return mausac;
	}

	public void setMausac(String mausac) {
		this.mausac = mausac;
	}

	public Hinhhoc(String mausac) {
		
		this.mausac = mausac;
	}
	public abstract double tinhdientich();
	public abstract double tinhchuvi();
	
	public abstract void phongTo(double tyLe);
	
	public void hienthithongtin() {
		System.out.println("Mau sac: " + mausac);
		System.out.println("Dien tich: " + tinhdientich());
		System.out.println("Chu vi: " + tinhchuvi());
	}
	
}

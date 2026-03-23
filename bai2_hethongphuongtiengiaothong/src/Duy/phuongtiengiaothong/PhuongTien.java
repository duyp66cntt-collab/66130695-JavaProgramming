package Duy.phuongtiengiaothong;

public abstract class PhuongTien {
	protected String hangsanxuat;
	protected int namsanxuat;
	protected double giaban;
	public PhuongTien(String hangsanxuat, int namsanxuat, double giaban) {
		this.hangsanxuat = hangsanxuat;
		this.namsanxuat = namsanxuat;
		this.giaban = giaban;
	}
	public abstract double layvantoctoida();
	public abstract int laysochongoi();
}

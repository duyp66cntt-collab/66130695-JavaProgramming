package Duy.phuongtiengiaothong;

public class XeMay extends PhuongTien {
		private double dungtichxilanh;
		private String loaixe;
		public XeMay(String hangsanxuat, int namsanxuat, double giaban, double dungtichxilanh, String loaixe) {
			super(hangsanxuat, namsanxuat, giaban);
			this.dungtichxilanh = dungtichxilanh;
			this.loaixe = loaixe;
		}
		@Override
		public double layvantoctoida() {
			return 100.0;
		}
		@Override
		public int laysochongoi() {
			return 2;
		}
		
}

package Duy.phuongtiengiaothong;

public class Oto extends PhuongTien {
		private int socho;
		private String kieudongco;
		public Oto(String hangsanxuat, int namsanxuat, double giaban, int socho, String kieudongco) {
			super(hangsanxuat, namsanxuat, giaban);
			this.socho = socho;
			this.kieudongco = kieudongco;
		}
		@Override
	    public double layvantoctoida() {
	        return 200.0; 
	    }

	    @Override
	    public int laysochongoi() {
	        return this.socho;
	    }

	    
	    public double tinhThueTruocBa() {
	        return this.giaban * 0.1;
	    }
	}
		



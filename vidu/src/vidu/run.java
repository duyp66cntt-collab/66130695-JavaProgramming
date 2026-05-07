package vidu;

public class run {

	public static void main(String[] args) {
		Hocsinh hs1 = new Hocsinh("Tran van A", (short)19, "12A");
		System.out.print(hs1.toString());
		
		Hocsinh hs2 = new Hocsinh();
		String tenHS2="duy";
		hs2.setTenHS(tenHS2);
		short tuoiHS2=19;
		hs2.setTuoiHS(tuoiHS2);
		String lopHS2="asd";
		hs2.setLopHS(lopHS2);
		
		System.out.print("ten hoc sinh 2 la : " +hs2.getTenHS());
		
		
	}

}

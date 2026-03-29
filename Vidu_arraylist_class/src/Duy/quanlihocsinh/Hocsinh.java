package Duy.quanlihocsinh;

public class Hocsinh {
	private String tenHS;
	private short tuoiHS;
	private String lopHS;
	
	public Hocsinh() {
		
	}
	

	public Hocsinh(String tenHS, short tuoiHS, String lopHS) {
		super();
		this.tenHS = tenHS;
		this.tuoiHS = tuoiHS;
		this.lopHS = lopHS;
	}


	public String getTenHS() {
		return tenHS;
	}

	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}

	public short getTuoiHS() {
		return tuoiHS;
	}

	public void setTuoiHS(short tuoiHS) {
		this.tuoiHS = tuoiHS;
	}

	public String getLopHS() {
		return lopHS;
	}

	public void setLopHS(String lopHS) {
		this.lopHS = lopHS;
	}


	@Override
	public String toString() {
		String chuoixuat;
		chuoixuat = "\nHo va ten: " + tenHS;
		chuoixuat = chuoixuat +"\nTuoi HS : " + tuoiHS;
		chuoixuat = chuoixuat + "\nLop HS: "  + lopHS;
		return chuoixuat;
		//return "Hocsinh [tenHS=" + tenHS + ", tuoiHS=" + tuoiHS + ", lopHS=" + lopHS + "]";
	}
	
	

	
	
}

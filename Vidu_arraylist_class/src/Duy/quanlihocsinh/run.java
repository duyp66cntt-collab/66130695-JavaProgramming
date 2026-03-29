package Duy.quanlihocsinh;
import java.util.Scanner;
import java.util.ArrayList;
public class run {

	public static void main(String[] args) {
		Hocsinh hs1 = new Hocsinh();
		String tenhs1="Pham Duy";
		hs1.setTenHS(tenhs1);
		short tuoihs1=20;
		hs1.setTuoiHS(tuoihs1);
		String lophs1="12A";
		hs1.setLopHS(lophs1);
			
		Hocsinh hs2= new Hocsinh("Tran van A", (short)19, "12A");
		System.out.println(hs1.toString());
		
		System.out.println("Ten cua HS 2 la: " + hs2.getTenHS());
		System.out.println("Tuoi cua HS 2 la: " + hs2.getTuoiHS());
		System.out.println("lop cua HS 2 la: " + hs2.getLopHS());
		
		Scanner banphim = new Scanner(System.in);
		Hocsinh hs3= new Hocsinh();
		
		
        System.out.print("Nhap ten hoc sinh thu 3: ");
        hs3.setTenHS(banphim.nextLine());
        System.out.print("Nhap tuoi hoc sinh thu 3: ");
        hs3.setTuoiHS(banphim.nextShort());
        banphim.nextLine(); // SỬA LỖI TRÔI LỆNH
        System.out.print("Nhap lop hoc sinh thu 3: ");
        hs3.setLopHS(banphim.nextLine());
       
       
		
		System.out.print(hs3.toString());
		
		ArrayList<Hocsinh> dsHocsinh = new ArrayList<Hocsinh>();
		
		int n = 3;
		for (int i =0; i<n; i++) {
			
			Hocsinh hsi= new Hocsinh();
			
			System.out.print("\nNhap ten hoc sinh thu "+ i + ":");
			String tenhsi=banphim.nextLine();
		    
		    hsi.setTenHS(tenhsi);
			
		    System.out.print("Nhap tuoi hoc sinh thu  " + i + ":");
			Short  tuoihsi= banphim.nextShort();
			hsi.setTuoiHS(tuoihsi);
			banphim.nextLine();
			System.out.print("Nhap lop hoc sinh thu  " + i + ":");
			String lophsi= banphim.nextLine();
			hsi.setLopHS(lophsi);
			
			dsHocsinh.add(hsi);
		}
		
		System.out.println(" Danh sach hien tai ");
		for (int i = 0; i < dsHocsinh.size(); i++) { 
		    System.out.println(dsHocsinh.get(i).toString());
		}
		
		Hocsinh hsthem= new Hocsinh();
		dsHocsinh.add(hsthem);
		for (int i =0; i < n; i++) {
			System.out.println(dsHocsinh.get(i).toString());
		}
		for(int i =0; i<n; i++) {
			Hocsinh hstam= dsHocsinh.get(i);
			if(hstam.getTenHS() != null && hstam.getTenHS().equalsIgnoreCase("Hoa")) {
				
				dsHocsinh.remove(i);
				System.out.println(" Da xoa hoc sinh ten Hoa ");
				break;
			}
			
		}
		
		System.out.println(" Danh sach cuoi cung ");
		for (Hocsinh hs : dsHocsinh) {  
		    System.out.println(hs.toString());
		}
		
		

	}

}

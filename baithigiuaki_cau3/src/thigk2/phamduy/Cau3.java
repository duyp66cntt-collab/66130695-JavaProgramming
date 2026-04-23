package thigk2.phamduy;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Cau3 {

	public static void main(String[] args) {
		ArrayList<Integer> danhSachSo = new ArrayList<>();
		int X = 5;
		boolean timThay = false;
		
		try {
			File myFile = new File("C:\\Users\\206NDN-H21\\Documents\\GitHub\\66130695-JavaProgramming\\baithigiuaki_cau3\\src\\thigk2\\phamduy\\data.txt");
			Scanner reader = new Scanner(myFile);
			
			while(reader.hasNextInt()) {
				int so = reader.nextInt();
				danhSachSo.add(so);
				if(so == X) timThay = true;
			}
			reader.close();
			
			System.out.println("Danh sách số nguyên từ file: ");
			System.out.println(danhSachSo);
			
			if(timThay) {
				System.out.println("=> Tìm thấy giá trị X (\" + X + \") trong danh sách.\"");
	
			}else {
				System.out.println("=> Không tìm thấy giá trị X (" + X + ") trong danh sách.");
			}
		}catch(Exception e) {
			System.out.println("Lỗi: Không tìm thấy file hoặc định dạng file sai.");
		}
		

	}

}

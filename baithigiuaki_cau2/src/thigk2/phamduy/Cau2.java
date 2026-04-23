package thigk2.phamduy;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
public class Cau2 {

	public static void main(String[] args) {
		ArrayList<SinhVien> ds = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		// 1. add 3 sinh viên
        ds.add(new SinhVien("66130695", "Phạm Duy", 2004, "CNTT"));
        ds.add(new SinhVien("66130001", "Nguyễn Văn A", 2007, "Kế toán"));
        ds.add(new SinhVien("66130002", "Trần Thị B", 2002, "Du lịch"));
        
        System.out.println("---Danh sách sinh viên ban đầu ---");
        for (SinhVien sv : ds) System.out.println(sv);
     // 2. Thêm mới 1 sinh viên từ bàn phím
        System.out.println("\nNhập thông tin sinh viên mới:");
        System.out.print("Mã SV: "); String ma = sc.nextLine();
        System.out.print("Họ tên: "); String ten = sc.nextLine();
        System.out.print("Năm sinh: "); int nam = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng thừa
        System.out.print("Chuyên ngành: "); String nganh = sc.nextLine();
        ds.add(new SinhVien(ma, ten, nam, nganh));
        
     // 3. In lại danh sách
        System.out.println("\n--- Danh sách sau khi thêm ---");
        for (SinhVien sv : ds) System.out.println(sv);
     // 4. In sinh viên > 20 tuổi
        int namHienTai = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("\n--- Sinh viên trên 20 tuổi ---");
		for(SinhVien sv : ds){
			if((namHienTai - sv.getNamSinh()) > 20) {
				System.out.println(sv);
			}
		}

	}

}

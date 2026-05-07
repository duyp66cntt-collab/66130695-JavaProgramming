package thigk2.phamduy;
import java.util.Scanner;
public class TinhBMI {

	public static void main(String[] args) {
		// Tạo đối tượng Scanner để đọc dữ liệu
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--- CHƯƠNG TRÌNH TÍNH CHỈ SỐ BMI ---");
		// a. Nhập thông tin từ bàn phím
		System.out.print("Nhập cân nặng của bạn (kg): ");
		double weight = scanner.nextDouble();
		System.out.print("Nhập chiều cao của bạn (m): ");
		double height = scanner.nextDouble();
		// b. Tính toán BMI
        // Công thức: BMI = Cân nặng / (Chiều cao bình phương)
		
		double bmi = weight / Math.pow(height, 2);
		
		// Xuất kết quả với 2 chữ số thập phân
		
		System.out.printf("\nChỉ số BMI của bạn là: %.2f\n", bmi);
		
		 // Kiểm tra tình trạng cơ thể dựa trên kết quả
		        String status;
		        if (bmi < 18.5) {
		            status = "Gầy";
		        } else if (bmi < 25) {
		            status = "Bình thường";
		        } else if (bmi < 30) {
		            status = "Tiền béo phì (Thừa cân)";
		        } else if (bmi < 35) {
		            status = "Béo phì độ I";
		        } else if (bmi < 40) {
		            status = "Béo phì độ II";
		        } else {
		            status = "Béo phì độ III (Bệnh lý)";
		        }

		        System.out.println("Tình trạng cơ thể: " + status);

		        // Đóng scanner
		        scanner.close();
		    }
		
	}



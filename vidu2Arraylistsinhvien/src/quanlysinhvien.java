import java.util.List;

public class quanlysinhvien {
	private List<sinhvien> danhsachSV;
	public quanlysinhvien() {
		danhsachSV = new Arraylist<>();
	}
	//them sinh vien
	public void themsinhvien(sinhvien sv) {
		danhsachSV.add(sv);
		System.out.println("Đã thêm: " + sv.gethoTen());
	}
	//tim sinh vien theo ma
	for (sinhvien sv: danhsachSV) {
		if (sv.getmaSV().equals(maSV)) {
			return sv;
		}
	}
	return null;
}
//tim sinh vien co diem cao nhat
public sinhvien timdiencaonhat() {
	if(danhsachSV.isEmpty()) {
		return null;
	}
}
}
}

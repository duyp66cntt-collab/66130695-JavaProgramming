package listsonguyen;

import java.util.ArrayList;
import java.util.Scanner;

public class runmain {

	public static void main(String[] args) {
		ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();
		Scanner banPhim = new Scanner(System.in);
		for(int i=0;i<10;i++) {
		System.out.print("Moi nhap phan tu thu " + i + ":");
		Integer tam = banPhim.nextInt();
		dsSoNguyen.add(tam);
		}
		System.out.print("Danh sach vua nhap la \n ");
		for(int i=0; i<dsSoNguyen.size();i++) {
			Integer tam = dsSoNguyen.get(i);
			System.out.print(tam + " ");
		}
		int soluongPTchan=0;
		for(int i=0; i<dsSoNguyen.size();i++) {
			Integer tam = dsSoNguyen.get(i);
			if( tam % 2 == 0) soluongPTchan=soluongPTchan+1;
		
	}
		System.out.println(" \n So phan tu chan la: " + soluongPTchan);
		int Tongall=0;
		for(Integer x: dsSoNguyen) {
			Tongall = Tongall +x;
		}
		System.out.println("tong tat ca So phan tu chan la: " + Tongall);
		

}
}

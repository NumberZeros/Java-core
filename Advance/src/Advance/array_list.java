package Advance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class array_list {
	public static void main(String[] arg) {
//		List<Short> number = new ArrayList<>();
//		Scanner sr = new Scanner(System.in);
//		System.out.print("nhap so luong phan tu: ");
//		short n = sr.nextShort();
//		
//		System.out.print("nhap gia tri cua phan tu: ");
//		for(int i=0; i < n; i++) {
//			number.add(sr.nextShort());
//		}
//		// lay ra cac phan tu trong mang
//		for(int i=0; i < number.size(); i++) {
//			System.out.println("gia tri cua phan tu " + i + " co gia tri la " + number.get(i));
//		}
//		
//		//loc ra nhung phan tu trung nhau
//		List<Short> newlist = new  ArrayList<>();
//		for(short e = 0; e < number.size(); e++) {
//			if(!newlist.contains(number.get(e))) newlist.add(number.get(e));
//		}
//		
//		for(short e: newlist) {
//			System.out.println("list moi "+ e);
//		}
		
	// chuong trinh quan ly sinh vien
		List<String> ds = new ArrayList<>();
		boolean loop  = true;
		Scanner sr = new Scanner(System.in);
		while(loop) {
		System.out.println("--- START ---");
		System.out.println("xem danh sach sinh vien an phim 1");
		System.out.println("them  sinh vien an phim 2");
		System.out.println("sua sinh vien an phim 3");
		System.out.println("xoa sinh vien an phim 4");
		System.out.println("thoat an phim 5");
		int keyboard = sr.nextInt();
		if(keyboard == 5) loop = false ;
		switch(keyboard) {
		case 1:
			if(ds.size() < 1 ) System.out.println("Danh Sach Chua Co Sinh Vien");
			else {
				System.out.println("Danh Sach Sinh Vien");
				for(int e = 0; e< ds.size(); e++) {
					System.out.println("id " + e + " ten sinh vien " + ds.get(e));
				}
			}
			break;
		case 2:
			System.out.print("Nhap ten sinh vien ");
			sr.nextLine();
			ds.add(sr.nextLine());
			System.out.println("Danh Sach Sinh Vien");
			for(int e = 0; e< ds.size(); e++) {
				System.out.println("id " + e + " ten sinh vien " + ds.get(e));
			}
			break;
		case 3: 
			System.out.print("Nhap ma sinh vien "); short id = sr.nextShort();
			sr.nextLine();
			System.out.print("Nhap ten sinh vien "); String name = sr.nextLine();
			ds.set(id, name);
			break;
		case 4: 
			System.out.print("Nhap ma sinh vien "); short index = sr.nextShort();
			ds.remove(index);
			break;
		}
	}
		
	}
}

package Advance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class array_list {
	public static void main(String[] arg) {
		List<Short> number = new ArrayList<>();
		Scanner sr = new Scanner(System.in);
		System.out.print("nhap so luong phan tu: ");
		short n = sr.nextShort();
		System.out.print("nhap gia tri cua phan tu: ");
		for(int i=0; i < n; i++) {
			number.add(sr.nextShort());
		}
		
		for(int i=0; i < number.size(); i++) {
			System.out.println("gia tri cua phan tu " + i + " co gia tri la " + number.get(i));
		}
	}
}

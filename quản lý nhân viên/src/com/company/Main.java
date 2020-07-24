package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<NhanVien> listNV = new ArrayList<>();
//        System.out.println("1.them nhan vien");
//        System.out.println("2.sua nhan vien");
//        System.out.println("3.Xem thong tin danh sach nhan vien");
//        System.out.println("0.thoat");
//        int key  = input.nextInt();
        boolean flag = true;
        while (flag){
            System.out.println("1.them nhan vien");
            System.out.println("2.sua nhan vien");
            System.out.println("3.Xem thong tin danh sach nhan vien");
            System.out.println("0.thoat");
            int key  = input.nextInt();
            switch (key){
                case 1: {
                    NhanVien nv = new NhanVien();
                    System.out.print("Ma Nhan vien: ");
                    int id  = input.nextInt();
                    input.nextLine();
                    System.out.println("");
                    System.out.print("Ten Nhan vien: ");
                    String name  = input.nextLine();
                    System.out.println("");
                    System.out.print("Loai Nhan vien: ");
                    short type  = input.nextShort();
                    System.out.println("");
                    System.out.print("Luong co ban Nhan vien: ");
                    int salary  = input.nextInt();
                    System.out.println("");
                    nv.post(id,name,type,salary);
                    listNV.add(nv);
                    break;
                }
                case 3: {
                    for (NhanVien nv: listNV) {
                        nv.getInfo(nv._id, nv.name, nv.type, nv.baseSalary);
                        System.out.println("");
                    }
                }
                case 0: {
                    flag = false;
                    break;
                }
                default:break;
            }
        }
    }
}

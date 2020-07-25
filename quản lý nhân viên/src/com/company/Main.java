package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static void ListNV(List<NhanVien> list){
        for (NhanVien nv: list) {
            nv.getInfo(nv._id, nv.name);
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<NhanVien> listNV = new ArrayList<>();
        boolean flag = true;

        while (flag){
            System.out.println("1.them nhan vien");
            System.out.println("2.Chi tiet nhan vien");
            System.out.println("3.Xem thong tin danh sach nhan vien");
            System.out.println("0.thoat");
            int key  = input.nextInt();
            switch (key){
                case 1: {
                    System.out.println("1.Nhan vien van phong");
                    System.out.println("2.Nhan vien cong nhan");
                    Short type  = input.nextShort();
                    if(type == 1){
                        VanPhong nv = new VanPhong();
                        System.out.print("Ma Nhan vien: ");
                        int id  = input.nextInt();
                        input.nextLine();
                        System.out.println("");
                        System.out.print("Ten Nhan vien: ");
                        String name  = input.nextLine();
                        System.out.println("");
                        System.out.print("Luong co ban Nhan vien: ");
                        int salary  = input.nextInt();
                        System.out.println("");
                        System.out.print("Ngay lam viec: ");
                        int days  = input.nextInt();
                        //insert
                        nv.set_id(id);
                        nv.setName(name);
                        nv.setType(type);
                        nv.setBaseSalary(salary);
                        nv.setDaysWorked(days);
                        System.out.println("");
                        listNV.add(nv);
                    } else {
                        CongNhan nv = new CongNhan();
                        System.out.print("Ma Nhan vien: ");
                        int id  = input.nextInt();
                        input.nextLine();
                        System.out.println("");
                        System.out.print("Ten Nhan vien: ");
                        String name  = input.nextLine();
                        System.out.println("");
                        System.out.print("Luong co ban Nhan vien: ");
                        int salary  = input.nextInt();
                        System.out.println("");
                        System.out.print("So gio lam viec: ");
                        int hours  = input.nextInt();
                        //insert
                        nv.set_id(id);
                        nv.setName(name);
                        nv.setType(type);
                        nv.setBaseSalary(salary);
                        nv.setHoursWorked(hours);
                        System.out.println("");
                        listNV.add(nv);
                    }
                    break;
                }
                case 2:{
                    ListNV(listNV);
                    System.out.println("Nhap ma nhan vien: ");
                        int maNV  = input.nextInt();
                        for(NhanVien item: listNV){
                            if(item._id == maNV){
                                item.getInfo();
                                item.viewSalary();
                            }
                        }
                        break;
                }
                case 3: {
                    ListNV(listNV);
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

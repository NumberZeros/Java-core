package com.company;

public class CongNhan extends NhanVien {
    private int hoursWorked;

    public CongNhan(){
        super();
    }

    public CongNhan(int _id, String name, Short type, int baseSalary, int hoursWorked) {
        super(_id, name, type, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public void viewSalary(){
        try{
            float sum = super.baseSalary + (hoursWorked * 30);
            System.out.println("Luong co the nhan la: "+ sum);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

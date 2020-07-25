package com.company;

public class VanPhong extends NhanVien{
    private int daysWorked;

    public VanPhong(){
        super();
    };

    public VanPhong(int _id, String name, Short type, int baseSalary, int daysWorked) {
        super(_id, name, type, baseSalary);
        this.daysWorked = daysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    @Override
    public void viewSalary(){
        try{
            float percent = daysWorked * 100 / 30;
            float sum = super.baseSalary * percent;
            System.out.println("Luong co the nhan la: "+ sum /100);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
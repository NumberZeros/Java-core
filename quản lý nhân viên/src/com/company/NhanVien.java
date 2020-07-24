package com.company;

public class NhanVien {
    public int  _id;
    public String name;
    public Short type;
    public int baseSalary;

    public NhanVien(){}
    public void post(int _id,String name, Short type, int baseSalary){
        try {
            this._id = _id;
        this.name = name;
        this.type = type;
        this.baseSalary = baseSalary;
        } catch (Exception e){
            System.out.println("phat sinh loi"+ e);
        }
    }

    public void update(String name, Short type, int baseSalary){
        try {
            this._id = _id;
            this.name = name;
            this.type = type;
            this.baseSalary = baseSalary;
        } catch (Exception e){
            System.out.println("phat sinh loi"+ e);
        }
    }
    public void update(String name){
        try {
        this.name = name;
        } catch (Exception e){
            System.out.println("phat sinh loi"+ e);
        }
    }

    public void update(short type){
        try {
        this.type = type;
        } catch (Exception e){
            System.out.println("phat sinh loi"+ e);
        }
    }

    public void update(int baseSalary){
        try {
        this.baseSalary = baseSalary;
        } catch (Exception e){
            System.out.println("phat sinh loi"+ e);
        }
    }

    public void getInfo(int _id,String name, Short type, int baseSalary){
        System.out.println("Ma NV: "+_id);
        System.out.println("Ten NV: "+name);
        System.out.println("type NV: "+ (type ==1 ? "van phong" : "cong nhan") );
        System.out.println("Luong NV: "+baseSalary);
    }
    
}
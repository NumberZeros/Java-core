package com.company;

public abstract class NhanVien {
    public int _id;
    public String name;
    public Short type;
    public int baseSalary;

    public NhanVien() {

    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public NhanVien(int _id, String name, Short type, int baseSalary) {
        super();
        this._id = _id;
        this.name = name;
        this.type = type;
        this.baseSalary = baseSalary;
    }

    public void getInfo(int _id, String name) {
        System.out.println("Ma NV: " + _id);
        System.out.println("Ten NV: " + name);
    }

    public void getInfo() {
        System.out.println("Ten NV: " + this.name);
        System.out.println("type NV: " + (this.type == 1 ? "van phong" : "cong nhan"));
        System.out.println("Luong NV: " + this.baseSalary);
    }

    public abstract void viewSalary();
}
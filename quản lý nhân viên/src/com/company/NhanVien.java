public class NhanVien {
    public int  _id;
    public String name;
    public short type;
    public short baseSalary;

    public NhanVien(){}
    public void post(int _id,String name, Short type, Short baseSalary){
        try {
            this._id = _id;
        this.name = name;
        this.type = type;
        this.baseSalary = baseSalary;
        } catch (Exception e){
            System.out.println("phat sinh loi"+ e);
        }
    }

    public void update(String name, Short type, Short baseSalary){
        try {
            this._id = _id;
        this.name = name;
        this.type = type;
        this.baseSalary = baseSalary;
        } catch (Exception e){
            System.out.println("phat sinh loi"+ e);
        }
    }
    public void updateName(String name){
        try {
        this.name = name;
        } catch (Exception e){
            System.out.println("phat sinh loi"+ e);
        }
    }

    public void updateType(Short type){
        try {
        this.type = type;
        } catch (Exception e){
            System.out.println("phat sinh loi"+ e);
        }
    }

    public void updateBaseSalary(Short baseSalary){
        try {
        this.baseSalary = baseSalary;
        } catch (Exception e){
            System.out.println("phat sinh loi"+ e);
        }
    }
    
}
package opp;

public class child extends parent {
	public child (String name, int age) {
		super(name, age, name);
	}
	public void goToSchool() {
		System.out.println(super.getName()+" nam nay "+ super.getAge()+" dang di hoc");
	}
}

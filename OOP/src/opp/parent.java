package opp;

public class parent {
	private String name;
	private int age;
	private String work;

	//menthod
	public parent(String name, int age, String work) {
		this.name = name;
		this.age = age;
		this.work = work;
	}
	
	public void goToWork() {
		System.out.println("" + name+" nam nay "+ age+" dang di lam tai "+ work);
	}
	
	protected void sleep() {
		System.out.println("kho kho");
	}
	
	/// contructor
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

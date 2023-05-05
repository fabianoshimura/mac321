package exercicio3;

public class Student {
	private String name;
	private int rollNo;
	
	Student (String name, int rollNo) {
		this.setName(name);
		this.setRollNo(rollNo);
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

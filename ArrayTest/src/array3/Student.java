package array3;

public class Student {
	
	int rno;
	String name;
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		if(rno>0) {
			this.rno = rno;
		}else {
			System.out.println("Roll Number value is incorrect");
			rno=0;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + "]";
	}
	
	/*
	 * void toString1() {
	 * 
	 * System.out.println("Roll No is :"+rno); System.out.println("Name is :"+name);
	 * 
	 * }
	 */
	
	
	
}

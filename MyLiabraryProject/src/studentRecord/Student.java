package studentRecord;

public class Student {

	private int rollNo;
    private String name;

    public Student(int id, String name) {
        this.rollNo = id;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Roll Number: " + rollNo + ", Name: " + name;
    }
}

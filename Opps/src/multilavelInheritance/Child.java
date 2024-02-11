package multilavelInheritance;

class Child extends Parent {
	String childName;
    String occupation = "Engineer";
    
    public Child(String name, String parentName, String childName) {
        super(name,parentName);
        this.childName = childName;
    }

    void displayChildData() {
    	System.out.println("\nChild Data:");
        System.out.println("Child's Name: " + childName);
        super.commonFamilyData();
        System.out.println("Occupation: " + occupation);
    }
    
    public static void main(String[] args) {
    	Child obj = new Child("Govind", "Sambhaji", "Sushant");
    	obj.displayGrandParentData();
        obj.displayParentData();
        obj.displayChildData();
    }
}

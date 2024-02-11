package multilavelInheritance;

class Parent extends GrandParent {
	String parentName;
	String education = "Bachelor's";
    
    public Parent(String name, String parentName) {
        super(name);
        this.parentName = parentName;
    }

    void displayParentData() {
    	System.out.println("\nParent Data:");
        System.out.println("Parent's Name: " + parentName);
        super.commonFamilyData();
        System.out.println("Education: " + education);
    }
}
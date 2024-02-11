package multilavelInheritance;

public class GrandParent {
		String name = "Govind";
	    String bloodGroup = "B+";
	    String surname = "Jadhav";
	    String homeTown = "Kolhapur";
	    
	    public GrandParent(String name) {
	        this.name = name;
	    }


	    void displayGrandParentData() {
	        System.out.println("Grand parent Name: " + name);
	        this.commonFamilyData();
	    }
	    
	    void commonFamilyData() {
	    	System.out.println("surname : " + surname);
	        System.out.println("Blood Group : " + bloodGroup);
	        System.out.println("City : "+ homeTown);
	    }
}

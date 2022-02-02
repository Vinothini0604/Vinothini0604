package demo;
class Family{
	String familyName,address;
	Family(){
		familyName="parkavakulam";
		address="southAk";
	}
	
}
  class members extends Family{
	String name;
	members(){
		name="Vinothini";
		
	}
	void show(){
		System.out.println("I am one of the family member ");
		System.out.println("my family name is"+this.familyName+"and Iam from"+this.address);
		
	}
}
public class Inheritance {
     public static void main(String[]args){
    	 members Mb=new members();
    	 Mb.show();	
     }
}

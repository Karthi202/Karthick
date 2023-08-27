package dailypractice;

 abstract class  Employee{
	  private String EmpName;
	  private int Empid;
	  private String Empexperience;	 
 }
     class Fresher extends Employee{
    	 private String EmpName;
    	 private int Empid;
    	 private String Empexperience;
    	 
    	 public String getEmpName() {
    		 return EmpName;
    	 }
    	 public void setEmpName(String EmpName) {
    		 this.EmpName=EmpName;}
    	 public int getEmpid() {
    		 return Empid;
    	 }
    	 public void setEmpid(int Empid) {
    		 this.Empid=Empid;}
    	 public String getEmpexperience() {
    		 return EmpName;
    	 }
    	 public void setEmpexperience(String Empexperience) {
    		 this.Empexperience=Empexperience;}
    	 void display() {
    		 System.out.println(EmpName +" "+ Empid + " " + Empexperience  );
    	 }}
    	 class Intern extends Employee{
        	 private String EmpName;
        	 private int Empid;
        	 private String Empexperience;
        	 
        	 public String getEmpName() {
        		 return EmpName;
        	 }
        	 public void setEmpName(String EmpName) {
        		 this.EmpName=EmpName;}
        	 public int getEmpid() {
        		 return Empid;
        	 }
        	 public void setEmpid(int Empid) {
        		 this.Empid=Empid;}
        	 public String getEmpexperience() {
        		 return EmpName;
        	 }
        	 public void setEmpexperience(String Empexperience) {
        		 this.Empexperience=Empexperience;}
        	 void display1() {
        		 System.out.println(EmpName +" "+ Empid + " " + Empexperience  );
        		 
     }}
        	 class Experience extends Employee{
            	 private String EmpName;
            	 private int Empid;
            	 private String Empexperience;
            	 
            	 public String getEmpName() {
            		 return EmpName;
            	 }
            	 public void setEmpName(String EmpName) {
            		 this.EmpName=EmpName;}
            	 public int getEmpid() {
            		 return Empid;
            	 }
            	 public void setEmpid(int Empid) {
            		 this.Empid=Empid;}
            	 public String getEmpexperience() {
            		 return EmpName;
            	 }
            	 public void setEmpexperience(String Empexperience) {
            		 this.Empexperience=Empexperience;}
            	 void display2() {
            		 System.out.println(EmpName +" "+ Empid + " " + Empexperience  );
    	 }
        	 }
public  class Employee1 {

	public static void main(String[] args) {
		 Fresher f = new Fresher();
		 f.setEmpName("Karthick");
		 f.setEmpid(01);
		 f.setEmpexperience("NoExperience");
		 f.display();
		 
		 Intern i = new Intern();
		 i.setEmpName("Ramesh");
		 i.setEmpid(02);
		 i.setEmpexperience("OneYear");
		 i.display1();
		 
         Experience e = new  Experience();
         e.setEmpName("Kamali");
         e.setEmpid(03);
         e.setEmpexperience("5Years");
         e.display2();
        
         
	}}



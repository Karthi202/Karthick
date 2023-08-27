package dailypractice;
 
   abstract class Person{
	     private String Studentname;
	     private int Studentid; 
	     private String Teachersname;
	     
   }
          class Student1 extends Person{
        	  private String Studentname;
      	       private int Studentid; 
      	     
        	  public String getStudentname() {
			    return Studentname;}
        	  public void setStudentname(String Studentname) {
        		  this.Studentname=Studentname;}
        	  public int getStudentid() {
  			    return Studentid;}
          	  public void setStudentid(int Studentid) {
          		  this.Studentid=Studentid;
              }	
          	  void display() {
          		  System.out.println(Studentname + " " + Studentid);
          	  }
			
          }
  
           class Teacher1 extends Person{
        	   private String Studentname;
        	 private int Studentid; 
             private String Teachersname;
             
             public String getStudentname() {
 			    return Studentname;}
         	  public void setStudentname(String Studentname) {
         		  this.Studentname=Studentname;}
         	  public int getStudentid() {
   			    return Studentid;}
           	  public void setStudentid(int Studentid) {
           		  this.Studentid=Studentid;}
           	 public String getTeachersname() {
    			    return Teachersname;}
            	  public void setTeachersname(String Teachersname) {
            		  this.Teachersname=Teachersname;}
           
           void display1() {
       		  System.out.println(Studentname + " " + Studentid  + " " + Teachersname);
       	  }}
 public class Encapsulation{
	public static void main(String[] args) {
		Student1 se = new Student1();
		
		se.setStudentname("Karthick");
		se.setStudentid(61);
	    se.display();
	
		Teacher1 te = new Teacher1();
		te.setStudentname("Karthick");
		te.setStudentid(61);
		te.setTeachersname("Kausalya mam");
		te.display1();
	}
          }
           




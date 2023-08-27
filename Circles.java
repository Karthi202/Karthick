package dailypractice;

interface Drawable{
         double getarea1();
	     double getvolume1();}

	public class Circles implements Drawable{
		 
		private double radius;
        private double pi;
	 public Circles(double radius,double pi){
        this.radius=radius;
		this.pi=pi;
	 }
		@Override
		public  double getarea1() {
			return pi*radius*radius; 
		}
	
		@Override
		public double getvolume1() {	 
			return 1.33 * pi * radius * radius * radius;  
		}
		 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Circles ci = new Circles(10.0, 3.14);
		  
		 System.out.println("Area of circle is :" + ""  + ci.getarea1());
		 System.out.println("Volume of circle is : " + " " + ci.getvolume1());
	}
	}

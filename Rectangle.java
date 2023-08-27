package dailypractice;

  
	public class Rectangle implements Drawable{
		private double length;
		private double height;
		private double width;
		
		public Rectangle(double length,double breath,double width) {
			this.length=length;
			this.height=breath;
			this.width=width;
		}
		@Override
		public double getarea1() {
			 
			return length*height;
		}

		@Override
		public double getvolume1() {
			 
			return length*height*width;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle re= new Rectangle(5.0, 3.0, 6.0);
		System.out.println("Area of rectangle is :" + ""  + re.getarea1());
	    System.out.println("Volume of rectangle is : " + " " + re.getvolume1());
	}

}

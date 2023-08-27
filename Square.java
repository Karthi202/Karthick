package dailypractice;


public class Square implements Drawable {
 
		private double length;
		 
		 
		
		public Square(double length) {
			this.length=length;
		 
		}
		@Override
		public double getarea1() {
			 
			return length*length;
		}

		@Override
		public double getvolume1() {
			 
			return length*length*length;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = new Square(5);
		System.out.println("Area of Square is :" + ""  + sq.getarea1());
	    System.out.println("Volume of Square is : " + " " + sq.getvolume1());
	}




 

	}



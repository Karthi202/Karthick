package dailypractice;

public class Mathematics {
	
	int a,b;
	public float add(int a,float b) {
		return a+b;
	}
	public float subtract(int a,float b) {
		return a-b;
		
	}
	public float mul(int a,float b) {
		return a*b;
	}
	public float div(int a,float b) {
		return a%b;
	}
	 
	public static void main(String[] args) {
		Mathematics maths = new Mathematics();
		System.out.println(maths.add(10, 5.5f));
		System.out.println(maths.subtract(10, 5.5f));
		System.out.println(maths.mul(10, 5.5f));
		System.out.println(maths.div(10, 5.5f));
		 

	}

}

package Inner;

public class MyOuter {

	public static int a;

	class MyInner {
		private  int b=1;
		public void innerMethod(int c) {
			System.out.println(b);
		}
	}

	/*public static void main(String[] args) {
		MyOuter out =new MyOuter();
		out.a=100;
		MyInner in = new MyInner();
		in.innerMethod();
		

	}*/
}

package fibonacci;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 1;
		int c = a + b;
		System.out.print(a + " ");
		System.out.print(b + " ");
		System.out.print(c + " ");
		
		for (int i = 1; i<=9; i++ ){
			
			a = b;
			b = c;
			c = a + b;
			System.out.print(c + " ");
				
		}
	}
}


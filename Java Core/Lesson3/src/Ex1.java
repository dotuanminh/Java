import java.util.Random;

public class Ex1 {
	public static void main(String[] args) {
		Question1() ; 
		int x= Question2(); 
		System.out.println(x);
		Question3(x);
		Question4(3,2);
	}

	private static void Question4(int i, int j) {
		System.out.println("Thuong la "+ i/j);
		
	}

	private static void Question3(int x) {
		System.out.println(x%100);
		
	}

	private static int Question2() {
		Random random = new Random();
		return random.nextInt(90000)+10000;
	}

	private static void Question1() {
		float luongAccount1 = (float) 5240.5; 
		float luongAccount2 = (float) 10970.055; 
		
		int luonga1 = (int)(luongAccount1) ;
		int luonga2 = (int)(luongAccount2) ;
		System.out.println(luonga1 + "\n" +luonga2);
		
	}
}

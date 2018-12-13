package dummy;

public class Test {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1; i < 4; sum += ++i) { //2+3+4=9
			System.out.println("I guess it works" + i);
		}
		System.out.println(sum);
		sum = 0;
		for(int i = 1; i < 4; sum += i++) {
			System.out.println("I guess it works" + i);
		}
		System.out.println(sum);
	}
}

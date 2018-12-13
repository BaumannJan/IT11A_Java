package aufgaben;

public class EachLoops {
	public static void main(String[] args) {
		iterateArgs(args);
	}
	
	private static void iterateArgs(String[] args) {
		int i = 1;
		for (String arg : args) {
			System.out.println("Eingabe:\t Number " + i + ": " + arg);
			i++;
		}
	}
}

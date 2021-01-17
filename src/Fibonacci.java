import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		System.out.println("Bitte geben Sie die Zahlen ein (Eine Nummer kleiner als 0 beendet das Programm): ");
						
		while (true) {		
			
			int input = scan.nextInt();			
			
			if (input < 0) {
				break;
			}
			
			if(input > 5000) {
				System.out.println("Bitte geben Sie eine Nummer kleiner oder gleich 5000!");
				break;
			}
			
			else {
				numbers.add(input);	
			}
						
		}

		scan.close();
		
		for (int i = 0; i < numbers.size(); i++) {
			
			BigInteger fibNum = getFibonacci(numbers.get(i));
			System.out.println("Die Fibonacci Zahl fuer " + numbers.get(i) + " ist: " + fibNum);
			
		}
		
	}
	
	public static BigInteger getFibonacci(int inputNumber) {
		
		
		
		BigInteger x = BigInteger.ZERO, y = BigInteger.ONE;
		
		if(inputNumber == 0) {
			return BigInteger.ZERO;
		} 
		else if (inputNumber == 1) {
			return BigInteger.ONE;
		}
		
		BigInteger fibNumber = BigInteger.ZERO;
		
		for(int i=2; i <= inputNumber; i++) {
			fibNumber = x.add(y);
			x = y;
			y = fibNumber;
		}
		return fibNumber;
		
	}

}

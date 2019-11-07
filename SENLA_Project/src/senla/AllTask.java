package senla;

public class AllTask {

	public static void main(String[] args) throws Exception {
		
		PrimeNumbers primeNumbers = new PrimeNumbers();
		primeNumbers.checkPrimeNumb();
		
		NumberFibonacci numberFibonacci = new NumberFibonacci();
		numberFibonacci.fibonacci();
		
		LineSegments lineSegments = new LineSegments();
		lineSegments.coordinates();
		
		QCD qcdlcm = new QCD();
		qcdlcm.qcd_lcm();
		
		Palindrom palindrom = new Palindrom();
		palindrom.checkPalindrom();
		
		NumbInTheText numbInTheText = new NumbInTheText();
		numbInTheText.text();
		
	}

}

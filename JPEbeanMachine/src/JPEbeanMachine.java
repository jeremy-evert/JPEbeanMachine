
import java.util.Scanner;

public class JPEbeanMachine {

	public static void main(String[] args) {
		System.out.println("Hello Nadar!");

		// we are going to do Nadar's Plinko game.

		// set up variables
		Scanner input = new Scanner(System.in);


		// ask user how many balls they want

		System.out.print(" How many balls do you want? ");
		int ballCount = input.nextInt();
		System.out.println("The number of balls entered is: " + ballCount);

		// ask user how many bins they want
		System.out.println(" How many bins do you want between 2 and 8? ");
		int binCount = input.nextInt();

		while(binCount <2){
			System.out.println("Please enter a number greater than 2.");
			binCount = input.nextInt();
		}

		System.out.println("The number of bins entered is: " + binCount);



		// Make a custom call to fill all the bins.
		int [] binArray = new int[binCount];

		binArray = FillBinArray(binCount, ballCount, binArray);


		// make a custom function call to tell which bin the ball fell in.
		//int whichBin = binArrayFiller(ballCount,binCount);
		//System.out.println("The ball fell in bin: " + whichBin);

		// make a custom function call to print off the number of balls in each bin.
		
		for(int i = 0; i <binCount; i++){
			System.out.println("The ball count in bin #" + (i+1) + " is: " + binArray[i] + ".");
		}

		// now the code is complete.
		System.out.println("That's all folks.");
	}

	public static int[] FillBinArray(int binCount, int ballCount, int[]binArray){

		for(int ballNumber = 1; ballNumber <= ballCount; ballNumber = ballNumber +1){
			int leftCount = 0;
			int binOfInterest = 0;
			for(int layerCount = 1; layerCount < binCount; layerCount = layerCount + 1){
				double LorRrandNumber = Math.random();
				if(LorRrandNumber<0.5){
					leftCount = leftCount + 1;
				}
			}
			binOfInterest = binCount - leftCount - 1 ;
			System.out.println("bin of interest is: " + binOfInterest);
			System.out.println("Current ball count for this bin is: " + binArray[binOfInterest]);
			binArray[binOfInterest] = binArray[binOfInterest] +1;

		}
		return binArray;



	}

}

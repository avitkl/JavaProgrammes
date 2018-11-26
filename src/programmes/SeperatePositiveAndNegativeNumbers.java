package programmes;

import java.util.ArrayList;

public class SeperatePositiveAndNegativeNumbers {

	public static void main(String[] args) {
		
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(9);
		inputArray.add(4);
		inputArray.add(-3);
		inputArray.add(-2);
		inputArray.add(1);
		inputArray.add(-1);
		inputArray.add(5);
		inputArray.add(7);
		inputArray.add(-9);
		inputArray.add(-5);

		System.out.println("Input ArrayList --> " +inputArray);
		ArrayList<Integer> positiveArray = new ArrayList<Integer>();
		ArrayList<Integer> negativeArray = new ArrayList<Integer>();
		
		for(int input:inputArray)
		{
			if(input > 0)
			{
				positiveArray.add(input);
			}
			else if(input <0)
			{
				negativeArray.add(input);
			}
		}
		
		ArrayList<Integer> resultArray = new ArrayList<Integer>(positiveArray);
		resultArray.addAll(negativeArray);
		
		System.out.println("Result ArrayList --> " +resultArray);
	}
	
}

import java.util.*;

public class Pairwise{
	
	public static void main (String[] args) {

			if (args.length >= 2)
			{
				for (int i = 0; i < args.length; i++)
				{
					System.out.print(args[i] + " ");
				}
				System.out.println();
				
				int numArgs = args.length;
				generateTable(0, numArgs, new int[numArgs]);
			}
				
			if (args.length <= 1){
				System.out.println("Please enter at least two paramenters!");
				System.exit(0);
			}
		
	}
	
	
	private static void generateTable(int index, int numArgs, int[] current) {
		
		if(index == numArgs) { 
			
			for(int i = 0; i < numArgs; i++) {
				System.out.print(current[i] + "      ");
			}
			System.out.println();
			
		} else {
			
			for(int i = 0; i < 2; i++) {
				current[index] = i;
            generateTable(index + 1, numArgs, current);
			}
		}
	}
	

	
}


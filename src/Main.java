import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int WinIfSwitching = 0;
		int WinIfStaying = 0;
		int Trial = 100;
		Random Num = new Random();
		
		for(int i = 0; i < Trial; i++){
			int[] Doors = {0,0,0};
			int Prize = Num.nextInt(3);
			Doors[Prize] = 1;
			int PlayerChoice = Num.nextInt(3);
			int DoorsToBeOpened;
			
			do{
				DoorsToBeOpened = Num.nextInt(3);
			}while(Doors[DoorsToBeOpened] == 1 || DoorsToBeOpened == PlayerChoice);
 
			if(PlayerChoice == Prize) { WinIfStaying++; }
			
			if(PlayerChoice != Prize) { WinIfSwitching++; }
			
		}
		System.out.println("Win by Switching " + WinIfSwitching + "/" + Trial + " times.");
		System.out.println("Win by Staying   " + WinIfStaying + "/" + Trial  + " times.");
		 
	}
}
		

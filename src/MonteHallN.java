import java.util.Random;

/*
 * Monte Hall Problem Revisited
 * 
 * Joshua Goldstein, Iwan Siauw, Orlando Calle
 * 
 * The goal of this assignment is to find the probability of winning the game after 1000 and 10000 trials using n doors.
 * As a result, the probability of winning by switching is approximately n-1/n and the probability of winning 
 * by staying is approximately 1/n. Therefore, it is best to switch your door since the probability of winning by switching is higher.
 * This is especially true if n (the number of doors) is large. The more doors you have, the more likely you will win by switching. 
 */
public class MonteHallN {

    public static void main(String[] args) {
    
        int winIfSwitching = 0;
        int winIfStaying = 0;
        Random num = new Random();
        
        int trial = 1000; //ENTER NUMBER OF TRIALS HERE
        
        int numOfDoors = 100; //ENTER NUMBER OF DOORS HERE

        for(int i = 0; i < trial; i++){
            
            int[] doors = new int[numOfDoors];
            int prize = num.nextInt(numOfDoors);
            doors[prize] = 1;
            int playerChoice = num.nextInt(numOfDoors);
            int doorsToBeOpened;
            
            do{
                doorsToBeOpened = num.nextInt(numOfDoors);
            } while(doors[doorsToBeOpened] == 1 || doorsToBeOpened == playerChoice);

            if(playerChoice == prize) winIfStaying++;
            if(playerChoice != prize) winIfSwitching++;
        }
        System.out.println("Number of doors: "+numOfDoors);
        System.out.println("After " + trial + " trials,");
        System.out.println("The probability of winning by switching is " + winIfSwitching + "/" + trial);
        System.out.println("The probability of winning by staying is " + winIfStaying + "/" + trial);
    }
}

/**
 * Running Trials Author: Gurparveen Kaur Chaha and Carolyn Yao
 * Does this compile or finish running within 5 seconds? Y/N
 * yes
 */

public class RunningTrials {
    // Do not change the parameters!
    public int runTrialsRecur(int possibleSpeeds, int weeks) {
        //decalre and initilaise the minTets to 0
        int minTests = 0;
        // Your code here
        boolean flag = false;
       
        //check if number of possible speed is 1
        if (possibleSpeeds == 1) {
            //then return  minTest as 1
            return minTests = 1;  
        }
        //check if weeks are 0
        if (weeks == 0) {
             //then return minTest as 1
            return minTests = 1;
        }
        //increment mintest by 1
        minTests++;
        if (flag) {
            //calling the function itself
            runTrialsRecur(possibleSpeeds - 1, weeks - 1);
        } else {
             //calling the function itself
            runTrialsRecur(possibleSpeeds - 1, weeks);
        }
        //return calculated minTest
        return minTests;
    }

 
    // Do not change the parameters!
    public int runTrialsBottomUp(int possibleSpeeds, int weeks) {
        int minTests = 0;
        // Your code here
        //get array size
        int arrSize=possibleSpeeds + 1;
        //craete an array to store test speed
        int[] testSpeedArray = new int[arrSize];
        //initialise teh first element of array as 1
        testSpeedArray[0] = 1;
        //loop to get all test possible speeds
        for (int indx = 1; indx< possibleSpeeds; indx++) {
            testSpeedArray[indx] = testSpeedArray[indx - 1] + 1;
        }
        //get minimum number of tests
        minTests = testSpeedArray[possibleSpeeds - 1];
        //return minimum number of tests
        return minTests;        
    }

    // Optional:
    // Pick whatever parameters you want to, just make sure to return an int.
    public int runTrialsMemoized() {
        int minTests = 0;
       
        // Your optional code here
        return minTests;

    }

    public static void main(String args[]) {
       
        RunningTrials running = new RunningTrials();
        // Do not touch the below lines of code, your output will automatically be formatted
        int minTrials1Recur = running.runTrialsRecur(12, 5);
        int minTrials1Bottom = running.runTrialsBottomUp(12, 5);
        int minTrials2Recur = running.runTrialsRecur(20, 8);
        int minTrials2Bottom = running.runTrialsBottomUp(20, 8);
        System.out.println("12 speeds, 5 weeks: " + minTrials1Recur + " " + minTrials1Bottom);
        System.out.println("20 speeds, 8 weeks: " + minTrials2Recur + " " + minTrials2Bottom);
    }
}

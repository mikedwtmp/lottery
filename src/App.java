import java.util.*;
import java.util.Random;


public class App {
    public static void main(String[] args) throws Exception {
        //declarations:
        int firstNum, secondNum, thirdNum, userFirstNum, userSecondNum, userThirdNum;
        int awardOne = 10; int awardTwo = 100; int awardThreeUnordered = 1000;
        int awardThreeOrdered = 1000000;
        int winCount = 0;
        int max_no = 9;
        int userAward = 0;

        //get 3 random numbers:
        Random rand  = new Random();
        Scanner scn = new Scanner(System.in);

        firstNum = rand.nextInt(max_no);
        secondNum = rand.nextInt(max_no);
        thirdNum = rand.nextInt(max_no);

        //get users guesses:
        System.out.println("Enter first guess: ");
        userFirstNum = scn.nextInt();
        System.out.println("Enter second guess: ");
        userSecondNum = scn.nextInt();
        System.out.println("Enter third guess: ");
        userThirdNum = scn.nextInt();

        if (firstNum == userFirstNum && secondNum == userSecondNum && thirdNum == userThirdNum) {
            userAward = awardThreeOrdered;
        }
        else {
            if(userFirstNum == firstNum || userFirstNum == secondNum || userFirstNum == thirdNum) {
                ++winCount;
            }
            if(userSecondNum == firstNum || userSecondNum == secondNum || userSecondNum == thirdNum) {
                ++winCount;
            }
            if(userThirdNum == firstNum || userThirdNum == secondNum || userThirdNum == thirdNum) {
                ++winCount;
            }
        }

        switch(winCount) {
            case 0:
                userAward = 0;
                break;
            case 1:
                userAward = awardOne;
                break;
            case 2:
                userAward = awardTwo;
                break;
            case 3:
                userAward = awardThreeUnordered;
                break;
            default:
                //shouldn't happen
                break;
        }

        if(winCount > 0) {
            System.out.println("Congradulations! Your award is $" + userAward);
        }
        else{
            System.out.println("Sorry, you did not win.");
        }


        scn.close();
        
    }
}

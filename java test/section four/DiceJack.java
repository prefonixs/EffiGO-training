import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 numbers between 1 and 6: ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(!areInRange(num1, num2, num3)){
            System.out.println("out of range numbers");
            System.exit(0);
        }

        int sumNum=num1+num2+num3;
        int sumDice=rollDice()+rollDice()+rollDice();

        System.out.println("Your sum: "+sumNum+"\nDice sum: "+sumDice);
        if(userWon(sumNum, sumDice)){
            System.out.println("\nCongratulations, you won!");
        }else{
            System.out.println("\nBetter luck next time :(");
        }
    }

    public static int rollDice() {
        return (int) (Math.random() * 6 + 1);
    }

    public static boolean areInRange(int num1, int num2, int num3) {
        return ((num1 > 0 && num1 < 7) && (num2 > 0 && num2 < 7) && (num3 > 0 && num3 < 7));
    }

    public static boolean userWon(int sumNum,int sumDice){
        return (sumNum>sumDice && (sumNum-sumDice)<3);
    }
}

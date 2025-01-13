import java.util.Arrays;

public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.5).
        int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=randomNumber();
        }

        System.out.print("Here are the scores: ");
        for (int i : arr) {
            System.out.print(i+" ");
            highScore=highScore<i?i:highScore;
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
        
    }    
    public static int randomNumber(){
        return (int)(Math.random()*50000);
    }

}

public class Receipt {
    public static void main(String[] args) {

        String[] apples={"Gala", "Granny Smith", "Macintosh"};
        double[] prices={1.99, 1.49, 1.29};

        System.out.println("Here's your receipt:\n");
        for (int i = 0; i < prices.length; i++) {
            System.out.println("\t"+apples[i]+": $"+prices[i]); 
        }
        
        // See instructions on Learn the Part (Workbook 6.8)
        
        // System.out.println("\t<apple i >: $<price i >"); // to be used in for loop.
    }
}

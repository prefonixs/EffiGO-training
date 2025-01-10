public class DocComments {
    public static void main(String[] args) {
        
    }
    /**
     * Function name: greet
     * 
     * Inside the function:
     *  1. prints: 'Hi'
     */
    public static void greet(){
        System.out.println("Hi");
    }

    /**
     * Function name: prntText
     * @param name (String)
     * @param age (String)
     * 
     * Inside the function:
     *  1. prints the name and age
     */
    public static void printText(String name,String age){
        System.out.println("Hi, I'm "+name+" and I'm "+age+" years old.");
    }

    /**
     * Funtion name: calculateArea
     * @param length (double)
     * @param width (double)
     * @return      (double)
     * 
     * Inside the function:
     *  1. returns area
     */
    public static double calculateArea(double length,double width){
        return length*width;
    }
}

public class ReturnValues {
    public static void main(String[] args) {
        double area=calculateArea(1.2, 2.3);
        printArea(1.2, 2.3, area);

        String frenchExplanation=explainArea("French");
        System.out.println(frenchExplanation);
    }

    public static double calculateArea(double length, double width) {
        if(length<0 || width<0){
            System.out.println("INVALID DIMENSIONS");
            System.exit(0);
        }
        return length*width;
    }

    public static String explainArea(String language){
        switch (language) {
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish":
                return "area es igual a largo * ancho";
            default:
                return "Language not available";
        }
    }
    public static void printArea(double length,double width,double area){
        System.out.println("A reactangle of length "+length+", width "+width+" has area "+area);
    }
}

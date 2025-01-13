import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};

        // int[] arr2=arr1;

        // int[] arr2=new int[arr1.length];
        // for (int i = 0; i < arr2.length; i++) {
        //     arr2[i]=arr1[i];
        // }

        int[] arr2=Arrays.copyOf(arr1, arr1.length);

        arr2[2]=7;
        System.out.println("arr1: "+Arrays.toString(arr1));
        System.out.println("arr1: "+Arrays.toString(arr2));

    }
}

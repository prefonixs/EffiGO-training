import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Color;

public class ImageToGrayscale {

    public static void main(String[] args) throws Exception {
        File inputFile = new File("beach.png"); // Input file
        File outputFile = new File("beach_grayscale.png"); // Output file

        try {
            BufferedImage image = ImageIO.read(inputFile);
            long startTime=System.currentTimeMillis();
            convertToGrayscaleConcurrently(image,4);
            long endTime=System.currentTimeMillis();
            long timeTaken=endTime-startTime;

            System.out.println("Time taken: "+timeTaken+" miliseconds");

            ImageIO.write(image, "png", outputFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    private static void convertToGrayscaleConcurrently(BufferedImage image, int numberOfThreads) throws InterruptedException {
        int heightPerThread=image.getHeight()/numberOfThreads;
        GrayscaleConverterThread[] threads=new GrayscaleConverterThread[numberOfThreads];
        for (int i = 0; i < threads.length; i++) {
            int startY =i*heightPerThread;
            int endY=startY+heightPerThread;
            threads[i]=new GrayscaleConverterThread(image, startY, endY);
            threads[i].start();
        }
        for (GrayscaleConverterThread grayscaleConverterThread : threads) {
            grayscaleConverterThread.join();
        }
    }


}

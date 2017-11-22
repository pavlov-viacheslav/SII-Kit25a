package ua.khpi.kit.pavlov.sii01.utility;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author JR_Rider
 * @date 11.10.2017.
 */

public class ImageWorker {

    private BufferedImage img;
    private String imageName;
    private String resultString;

   
    public ImageWorker(String imageName) {
        this.imageName = imageName;
        resultString = new String();
        loadImage();
    }


    private int getPixelData(int x, int y) {
        int argb = img.getRGB(x, y);

        int rgb[] = new int[]{
                (argb >> 16) & 0xff, //red
                (argb >> 8) & 0xff, //green
                (argb) & 0xff  //blue
        };

        if (rgb[0] == 255 && rgb[1] == 255 && rgb[2] == 255)
            return 0;
        else
            return 1;
    }

    private void loadImage() {
        try {
            img = ImageIO.read(new File(imageName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getResultString() {
        if (resultString.isEmpty())
            getImageData();
        return resultString;
    }

    private void getImageData() {
        for (int j = 0; j < img.getHeight(); j++) {
            for (int i = 0; i < img.getWidth(); i++) {
                resultString += "" + getPixelData(i, j);
            }
        }
    }

    public void print() {
        if (resultString.isEmpty())
            getImageData();
        for (int j = 0; j < img.getHeight(); j++) {
            for (int i = 0; i < img.getWidth(); i++) {
                if (resultString.charAt(j * img.getWidth() + i) == '0')
                    System.out.print(" ");
                else System.out.print(1);
            }
            System.out.print("\n");
        }

    }

}




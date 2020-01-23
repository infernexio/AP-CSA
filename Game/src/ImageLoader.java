import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
* @author - Sohail Shaik
* @Date - Dec 26,2019
* @Assignment - ImageLoader
*/
public class ImageLoader {
	
	public static BufferedImage loadImage(String path) {
		 try {
			return ImageIO.read(ImageLoader.class.getResource(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		} 
		 return null;
	} 
}

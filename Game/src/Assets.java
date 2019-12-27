import java.awt.image.BufferedImage;

/**
* @author - Sohail Shaik
* @Date - Dec 26,2019
* @Assignment - Assets
*/
public class Assets {
	
	public static BufferedImage  player, dirt, grass, stone, tree;
	
	public static  void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
		player = sheet.crop(0, 0, 25, 28);
		stone = sheet.crop(28, 0, 30, 30);
		grass = sheet.crop(60, 0, 28, 28);
		dirt = sheet.crop(96, 0, 32, 32);
		tree= sheet.crop(91, 32, 32, 30);
		
	}

}

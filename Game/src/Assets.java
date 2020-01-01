import java.awt.image.BufferedImage;

/**
 * @author - Sohail Shaik
 * @Date - Dec 26,2019
 * @Assignment - Assets
 */
public class Assets {

	public static BufferedImage  player, dirt, grass, stone, tree;

	public static  void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheetright.png"));
		player = sheet.crop(0, 0, 32, 32);
		stone = sheet.crop(32, 0, 32, 32);
		grass = sheet.crop(64, 0, 32, 32);
		dirt = sheet.crop(96, 0, 32, 32);
		tree= sheet.crop(0, 32, 32, 32);

	}

}

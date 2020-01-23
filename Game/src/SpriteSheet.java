import java.awt.image.BufferedImage;

/**
* @author - Sohail Shaik
* @Date - Dec 26,2019
* @Assignment - SpriteSheet
*/
public class SpriteSheet {
	private BufferedImage sheet;
	
	public SpriteSheet(BufferedImage sheet) {
		this.sheet = sheet;  
	}
	
	public BufferedImage crop(int x, int y, int width, int height) {
		return sheet.getSubimage(x, y, width, height);
	}

}

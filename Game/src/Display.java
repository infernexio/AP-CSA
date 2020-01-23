import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

/**
* @author - Sohail Shaik
* @Date - Dec 25,2019
* @Assignment - Display
*/
public class Display {
	private JFrame frame;
	private Canvas canvas;
	private String title;
	private int width;
	private int height;
	
	/**
	 * set the initial state of the object
	 * @param title - title of the JFrame
	 * @param width - with of the JFrame window
	 * @param height - height of the JFrame window
	 */
	public Display (String title , int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;

		createDisplay();
	}
	
	/**
	 *initializes the JFrame object
	 */
	private void createDisplay() {
		frame = new JFrame(title);
		frame.setSize(width, height);
		//alowes to close with x at the top right corner
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//dosen't let user resize the window
		frame.setResizable(false);
		//makes it showup in the center
		frame.setLocationRelativeTo(null);
		//show up on screen
		frame.setVisible(true);
		
		canvas = new Canvas();
		//makes sure it stayst eh size we make it 
		canvas.setPreferredSize(new Dimension(width,height));
		canvas.setMaximumSize(new Dimension(width,height));
		canvas.setMinimumSize(new Dimension(width,height));
		canvas.setFocusable(false);
		
		//add the canvas to the JFrame
		frame.add(canvas);
		//allows the Jframe to always see the canvas at all time
		frame.pack();
	}
	
	public Canvas getCanvas() {
		return canvas;
	}
	
	public JFrame getFrame() {
		return frame;
	}

}

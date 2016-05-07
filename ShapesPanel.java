/*  
 * Jitesh Yadav
 * jay43@drexel.edu
 * CS530 04/30/2016 Assignment [#1] Program [#1]

*/

import javax.swing.*;
import java.awt.*;

public class ShapesPanel extends JPanel{

	/**
	 * for painting the graphics
	 */
	private static final long serialVersionUID = 1L;
	public ShapesPanel(){
		
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i=0; i < MyShapes.shapes.size(); i++ ){
			((Graphics2D)g).setColor(MyShapes.strokeColor.get(i));
			((Graphics2D)g).draw(MyShapes.shapes.get(i));
			((Graphics2D) g).setColor(MyShapes.fillColor.get(i));
			((Graphics2D)g).fill(MyShapes.shapes.get(i));
		}
	}
}

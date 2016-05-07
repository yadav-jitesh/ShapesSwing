/*  
 * Jitesh Yadav
 * jay43@drexel.edu
 * CS530 04/30/2016 Assignment [#1] Program [#1]

*/
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.LinkedList;
public class MyShapes {
	//for storing information of shapes, fill color and stroke color
	public static LinkedList<Shape> shapes = new LinkedList<Shape>();
    public static LinkedList<Color> fillColor = new LinkedList<Color>();
    public static LinkedList<Color> strokeColor = new LinkedList<Color>();
    public static LinkedList<Polygon> pol = new LinkedList<Polygon>();
	    public static int currentIndex;
	    
	    public JPanel canvas;
	    public static void main (String [] args){
	    	showEventDemo();
	    }
	    
	    public static void initialize(JFrame frame){
	    	Container contentPane = frame.getContentPane();
	        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS)); 
	        TitledBorder title = BorderFactory.createTitledBorder("Graphics Panel");
	        JPanel graphicsPanel = new JPanel();
	        graphicsPanel.setBorder(title);
	        graphicsPanel.setPreferredSize(new Dimension(510, 523));
	        graphicsPanel.setLayout(new BorderLayout());
	        ShapesPanel canvas = new ShapesPanel();
	        canvas.setPreferredSize(new Dimension(500,500));
	        graphicsPanel.add(canvas);
	        graphicsPanel.setVisible(true);

	        MainList mainList = new MainList(frame);
	        title = BorderFactory.createTitledBorder("List of all Shapes");
	        mainList.setBorder(title);
	        mainList.setPreferredSize(new Dimension(300, 523));
	        frame.add(mainList);
	        frame.add(graphicsPanel);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    	
	    }
	    public static void showEventDemo(){
	    	JFrame frame = new JFrame("MyShapes");
	        frame.setSize(850,600);
	        frame.setResizable(false);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        initialize(frame);
	        frame.setVisible(true);
	    }
	    
}


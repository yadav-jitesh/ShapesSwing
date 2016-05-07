/*  
 * Jitesh Yadav
 * jay43@drexel.edu
 * CS530 04/30/2016 Assignment [#1] Program [#1]

*/

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;


public class TabbedPane extends JDialog implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String[] strokeColor = {"None", "Magenta", "Cyan", "Orange", "Pink", "Gray"};
	private static String[] fillColor = {"None", "Magenta", "Cyan", "Orange", "Pink", "Gray"};
	// Defining different components for the tabbedPane
	JPanel panelfirst = new JPanel();
	JPanel panelsecond = new JPanel();
	JPanel panelthree = new JPanel();
	JPanel panelfour = new JPanel();
	JPanel panelfive = new JPanel();
	
	JButton firstLabel = new JButton("Ok");
	JButton firstButton = new JButton("Cancel");
	JButton secondLabel = new JButton("Ok");
	JButton SecondButton = new JButton("Cancel");
	
	JButton threeLabel = new JButton("Ok");
	JButton thirdButton = new JButton("Cancel");
	JButton fourLabel = new JButton("Ok");
	JButton fourButton = new JButton("Cancel");
	JButton fiveLabel = new JButton("Ok");
	JButton fiveButton = new JButton("Cancel");
	JTextField RectCenterX = new JTextField();
	JTextField RectCenterY = new JTextField();
	JTextField Length = new JTextField();
	JTextField Breadth = new JTextField();
	JTextField circlex = new JTextField();
	JTextField circley = new JTextField();
	JTextField radius = new JTextField();
	JTextField sxPos = new JTextField();
	JTextField syPos = new JTextField();
	JTextField exPos = new JTextField();
	JTextField eyPos = new JTextField();
	JTextField pent_xval = new JTextField();
	JTextField pent_yval =new JTextField();
	JTextField pent_sval = new JTextField();
	JTextField oct_xval = new JTextField();
	JTextField oct_yval = new JTextField();
	JTextField oct_sval = new JTextField();
	
	JLabel le = new JLabel("Length");
	JLabel br = new JLabel("Breadth");
	JLabel RectCx = new JLabel("Center X");
	JLabel RectCy = new JLabel("Center Y");
	JLabel cx = new JLabel("X position for circle");
	JLabel cy = new JLabel ("Y position for circle");
	JLabel rad = new JLabel("Radius");
	JLabel stX = new JLabel("Start X:");
	JLabel stY = new JLabel("Start Y:");
	JLabel enX = new JLabel("End X:");
	JLabel enY = new JLabel("End Y:");
	JLabel pent_xlabel= new JLabel("Center X pos:");
	JLabel pent_ylabel= new JLabel("Center Y pos:");
	JLabel pent_slabel= new JLabel("Size:");
	JLabel oct_xlabel= new JLabel("Center X pos:");
	JLabel oct_ylabel= new JLabel("Center Y pos:");
	JLabel oct_slabel= new JLabel("Size:");
	JLabel rect_strokename= new JLabel("Stroke Style");
	JLabel rect_fillname = new JLabel("Fill Style");
	JLabel line_strokename= new JLabel("Stroke Style");
	JLabel fillnameR = new JLabel("Fill Style");
	JLabel circle_fillname =new JLabel("Fill Style");
	JLabel circle_strokename= new JLabel("Stroke Style");
	JLabel pent_strokename = new JLabel("Stroke Style");
	JLabel pent_fillname = new JLabel("Fill Style");
	JLabel oct_strokename = new JLabel("Stroke Style");
	JLabel oct_fillname = new JLabel("Fill Style");
	JComboBox rect_stroke = new JComboBox(strokeColor);
	JComboBox rect_fill = new JComboBox(fillColor);
	JComboBox line_stroke = new JComboBox(strokeColor);
	JComboBox circle_fill = new JComboBox(fillColor);
	JComboBox circle_stroke = new JComboBox(strokeColor);
	JComboBox pent_fill = new JComboBox(fillColor);
	JComboBox pent_stroke = new JComboBox(strokeColor);
	JComboBox oct_fill = new JComboBox(fillColor);
	JComboBox oct_stroke = new JComboBox(strokeColor);
	JTabbedPane tabp = new JTabbedPane();
	// for selecting color based on the selection from JComboBox
	private Color selectColor(String text){
		Color color = null;
		if(text == "None"){
			color = Color.WHITE;
		}
		else if(text=="Magenta"){
				color= Color.MAGENTA;
			}
		else if (text=="Cyan"){
					color = Color.CYAN;
		}
		else if (text=="Orange"){
			color=Color.ORANGE;
		}
		else if (text=="Pink"){
			color = Color.PINK;
		}
		else if(text== "Gray"){
			color = Color.GRAY;
		}
	return color;
	}
	public TabbedPane(){
		//panel one - rectangle's component
	panelfirst.add(le);
	Length.setPreferredSize(new Dimension(100,24));
	panelfirst.add(Length);
	panelfirst.add(br);
	Breadth.setPreferredSize(new Dimension (100, 24));
	panelfirst.add(Breadth);
	panelfirst.add(RectCx);
	RectCenterX.setPreferredSize(new Dimension (100,24));
	panelfirst.add(RectCenterX);
	panelfirst.add(RectCy);
	RectCenterY.setPreferredSize(new Dimension(100,24));
	panelfirst.add(RectCenterY);
	panelfirst.add(rect_strokename);
	panelfirst.add(rect_stroke);
	panelfirst.add(rect_fillname);
	panelfirst.add(rect_fill);
	panelfirst.add(firstLabel);
	firstLabel.addActionListener(this);
	panelfirst.add(firstButton);
	firstButton.addActionListener(this);
	
	//Panel 2 - circle's component added here
	panelsecond.add(cx);
	circlex.setPreferredSize(new Dimension(100,24));
	panelsecond.add(circlex);
	panelsecond.add(cy);
	circley.setPreferredSize(new Dimension(100,24));
	panelsecond.add(circley);
	panelsecond.add(rad);
	radius.setPreferredSize(new Dimension(100,24));
	panelsecond.add(radius);
	panelsecond.add(circle_strokename);
	panelsecond.add(circle_stroke);
	panelsecond.add(circle_fillname);
	panelsecond.add(circle_fill);
	panelsecond.add(secondLabel);
	secondLabel.addActionListener(this);
	panelsecond.add(SecondButton);
	SecondButton.addActionListener(this);
	
	//panel three -Line's Component added here
	panelthree.add(stX);
	panelthree.add(sxPos);
	sxPos.setPreferredSize(new Dimension(100,24));
	panelthree.add(stY);
	panelthree.add(syPos);
	syPos.setPreferredSize(new Dimension(100,24));
	panelthree.add(enX);
	panelthree.add(exPos);
	exPos.setPreferredSize(new Dimension(100,24));
	panelthree.add(enY);
	panelthree.add(eyPos);
	eyPos.setPreferredSize(new Dimension(100,24));
	panelthree.add(line_strokename);
	panelthree.add(line_stroke);
/*	panelthree.add(fillname);
	panelthree.add(fill); */
	panelthree.add(threeLabel);
	threeLabel.addActionListener(this);
	panelthree.add(thirdButton);
	thirdButton.addActionListener(this);
	
	//Panel four - Pentagon's component added here
	panelfour.add(pent_xlabel);
	panelfour.add(pent_xval);
	pent_xval.setPreferredSize(new Dimension(100,24));
	panelfour.add(pent_ylabel);
	panelfour.add(pent_yval);
	pent_yval.setPreferredSize(new Dimension(100,24));
	panelfour.add(pent_slabel);
	panelfour.add(pent_sval);
	pent_sval.setPreferredSize(new Dimension(100,24));
	panelfour.add(pent_strokename);
	panelfour.add(pent_stroke);
	panelfour.add(pent_fillname);
	panelfour.add(pent_fill);
	panelfour.add(fourLabel);
	panelfour.add(fourButton);
	fourButton.addActionListener(this);
	
	//Panel -five Octogon's component added here
	panelfive.add(oct_xlabel);
	panelfive.add(oct_xval);
	oct_xval.setPreferredSize(new Dimension(100,24));
	panelfive.add(oct_ylabel);
	panelfive.add(oct_yval);
	oct_yval.setPreferredSize(new Dimension(100,24));
	panelfive.add(oct_slabel);
	panelfive.add(oct_sval);
	oct_sval.setPreferredSize(new Dimension(100,24));
	panelfive.add(oct_strokename);
	panelfive.add(oct_stroke);
	panelfive.add(oct_fillname);
	panelfive.add(oct_fill);
	panelfive.add(fiveLabel);
	panelfive.add(fiveButton);
	fiveButton.addActionListener(this);
	
	tabp.add("Rectangle", panelfirst);
	tabp.add("Circle", panelsecond);
	tabp.add("Line", panelthree);
	tabp.add("Pentagon", panelfour);
	tabp.add("Octagon", panelfive);
	
	add(tabp);
	
	}
	public static void main(String[] args){
	 TabbedPane tp = new TabbedPane();
	 
	 tp.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	 tp.setSize(600,400);
	 tp.setVisible(true);
	 tp.setModal(true);
	 
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==firstButton){
			TabbedPane.this.setVisible(false);
			TabbedPane.this.dispatchEvent(new WindowEvent(TabbedPane.this, WindowEvent.WINDOW_CLOSING));
		}
		else if (ae.getSource()==SecondButton){
			TabbedPane.this.setVisible(false);
			TabbedPane.this.dispatchEvent(new WindowEvent(TabbedPane.this, WindowEvent.WINDOW_CLOSING));
		}
		else if(ae.getSource()==thirdButton){
			TabbedPane.this.setVisible(false);
			TabbedPane.this.dispatchEvent(new WindowEvent(TabbedPane.this, WindowEvent.WINDOW_CLOSING));
		}
		else if(ae.getSource()==fourButton){
			TabbedPane.this.setVisible(false);
			TabbedPane.this.dispatchEvent(new WindowEvent(TabbedPane.this, WindowEvent.WINDOW_CLOSING));
		}
		else if (ae.getSource()==fiveButton){
			TabbedPane.this.setVisible(false);
			TabbedPane.this.dispatchEvent(new WindowEvent(TabbedPane.this, WindowEvent.WINDOW_CLOSING));
		}
		else if (ae.getSource()==firstLabel){
			if(Length.getText().equals("") || Breadth.getText().equals("") ||

                    RectCenterX.getText().equals("")|| RectCenterY.getText().equals(""))
				JOptionPane.showMessageDialog(Length,  "Fields will not be blank"); 
			else {
				int tempX = Integer.parseInt(RectCenterX.getText());
				int tempY = Integer.parseInt(RectCenterY.getText());
				int LenX = Integer.parseInt(Length.getText());
				int BreY = Integer.parseInt(Breadth.getText());
				Color rectStrokeColor = selectColor(rect_stroke.getSelectedItem().toString());
				Color rectFillColor = selectColor(rect_fill.getSelectedItem().toString());
				Rectangle Rect = new Rectangle(tempX- (LenX/2), tempY- (BreY/2),LenX, BreY );
				MyShapes.shapes.add(Rect);
				MyShapes.strokeColor.add(rectStrokeColor);
				MyShapes.fillColor.add(rectFillColor);
				MyShapes.showEventDemo();
				dispose();
			}
		}
		else if(ae.getSource()==secondLabel){
			if(circlex.getText().equals("") || circley.getText().equals("") ||

                    radius.getText().equals(""))
				JOptionPane.showMessageDialog(circlex,  "Fields will not be blank"); 
		 else {
			int tempx = Integer.parseInt(circlex.getText());
			int tempy = Integer.parseInt(circley.getText());
			int temprad = Integer.parseInt(radius.getText());
			Color circleStrokeColor = selectColor(circle_stroke.getSelectedItem().toString());
			Color circleFillColor= selectColor(circle_fill.getSelectedItem().toString());
			Ellipse2D elipse = new Ellipse2D.Double(tempx, tempy , temprad, temprad);
			MyShapes.shapes.add(elipse);
			MyShapes.strokeColor.add(circleStrokeColor);
			MyShapes.fillColor.add(circleFillColor);
			MyShapes.showEventDemo();
			dispose();
		}
		}
		else if(ae.getSource()== threeLabel){
			if(sxPos.getText().equals("") || syPos.getText().equals("") ||

                    exPos.getText().equals("")|| eyPos.getText().equals(""))
				JOptionPane.showMessageDialog(sxPos,  "Fields will not be blank");
			else {
				int sX = Integer.parseInt(sxPos.getText());
                int sY = Integer.parseInt(syPos.getText());
                int eX = Integer.parseInt(exPos.getText());
                int eY = Integer.parseInt(eyPos.getText());
                Color color = selectColor(line_stroke.getSelectedItem().toString());
                Line2D line = new Line2D.Double(sX, sY, eX, eY);
                MyShapes.shapes.add(line);
                MyShapes.strokeColor.add(color);
                MyShapes.fillColor.add(color);
                MyShapes.showEventDemo();
                dispose();
			}
		}
		else if(ae.getSource()== fourLabel){
			if(pent_xval.getText().equals("") || pent_yval.getText().equals("") ||

                    pent_sval.getText().equals(""))
				JOptionPane.showMessageDialog(pent_xval,  "Fields will not be blank");
			else{
			int px = Integer.parseInt(pent_xval.getText());
			int py = Integer.parseInt(pent_yval.getText());
			int ps = Integer.parseInt(pent_sval.getText());
			//int[] x = {px,px/ps,px/ps,px,px};
			//int [] y = {py, py/ps, py/ps, py, py};
			//int s= 5;
			Color pentagonStrokeColor = selectColor(pent_stroke.getSelectedItem().toString());
			Color pentagonFillColor= selectColor(pent_fill.getSelectedItem().toString());
			Polygon penta = new Polygon();
			for (int i = 0; i < 5; i++){
			      penta.addPoint((int) 
			      (px + ps * Math.cos(i * 2 * Math.PI / 5)),
			      (int) (py + ps * Math.sin(i * 2 * Math.PI / 5)));
			}
			MyShapes.shapes.add(penta);
			MyShapes.strokeColor.add(pentagonStrokeColor);
			MyShapes.fillColor.add(pentagonFillColor);
			MyShapes.showEventDemo();
			dispose();
			}
		}
		else if(ae.getSource()==fiveLabel){
			if(oct_xval.getText().equals("") || oct_yval.getText().equals("") ||

                    oct_sval.getText().equals(""))
				JOptionPane.showMessageDialog(oct_xval,  "Fields will not be blank");
			else {
				int ox = Integer.parseInt(oct_xval.getText());
				int oy = Integer.parseInt(oct_yval.getText());
				int os = Integer.parseInt(oct_sval.getText());
				//int[] a ={ox, ox/os,ox, os/ox,ox,ox/os,ox,os/ox};
				//int[] b = {oy, oy/os,oy, os/oy,oy,oy,os/oy,oy};
				//int s =8;
				Color octagonStrokeColor = selectColor(oct_stroke.getSelectedItem().toString());
				Color octagonFillColor= selectColor(oct_fill.getSelectedItem().toString());
				Polygon octa = new Polygon();
				for (int i = 0; i < 8; i++){
				      octa.addPoint((int) 
				      (ox + os * Math.cos(i * 2 * Math.PI / 8)),
				      (int) (oy + os * Math.sin(i * 2 * Math.PI / 8)));
				}
				MyShapes.shapes.add(octa);
				MyShapes.strokeColor.add(octagonStrokeColor);
				MyShapes.fillColor.add(octagonFillColor);
				MyShapes.showEventDemo();
				dispose();
			}
		}
	
}
	 
}

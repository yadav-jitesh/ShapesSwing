/*  
 * Jitesh Yadav
 * jay43@drexel.edu
 * CS530 04/30/2016 Assignment [#1] Program [#1]
*/

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.Polygon;

public class MainList extends JPanel{

    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * Declaration of objects for passing the parameters from tabbed pane
	 **/
	 
	private Shape elipse =new Ellipse2D.Double();
    private Rectangle sampleRectangle = new Rectangle();
    private Shape sampleLine = new Line2D.Double();
   private Polygon pent = new Polygon();
   private Polygon oct = new Polygon();
    private JPanel buttonPanel;         
    private JList list;                    
    public MainList(JFrame parent){
      
        DefaultListModel model = new DefaultListModel();    // Adding values in JList via Default List Model
        for (int i=0; i<MyShapes.shapes.size(); i++){
            Shape current = MyShapes.shapes.get(i);
            StringBuilder itemNum = new StringBuilder();
            if (sampleLine.getClass() == current.getClass()){   //Checking for class and then displaying on the JLiSt
            	itemNum.append("ShapeNumber:"+i+"-"+"Line" );
            }
          if (sampleRectangle.getClass() == current.getClass()){
            
        	itemNum.append("Shape Number:"+i+"-"+"Rectangle");  
          }
            if(elipse.getClass()==current.getClass()){
            	
            	itemNum.append("Shape Number:"+i+"-"+"Circle");
            }
            if(pent.getClass()==current.getClass()){
            	itemNum.append("Shape Number:"+i+"-"+"Pentagon:");
            }
            if(oct.getClass()==current.getClass()){
            	itemNum.append("Shape Number:"+i+"-"+"Octagon:");
            }
            model.addElement(itemNum);
        }
// list setup on the panel
        list = new JList(model);
        list.setVisibleRowCount(10);
        list.setSelectedIndex(0);
        list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                MyShapes.currentIndex = list.getSelectedIndex();
            }
        });

        JScrollPane pane = new JScrollPane(list);
        pane.setPreferredSize(new Dimension(275, 300));
        Border compound = BorderFactory.createCompoundBorder(new EmptyBorder(20,0,10,0), new LineBorder(Color.lightGray));
        pane.setBorder(compound);
        this.add(pane);
        buildButtonPanel();
        this.add(buttonPanel);
        this.add(Box.createRigidArea(new Dimension(500,100)));
        setLayout(new FlowLayout());
        this.setSize(100,300);

    }   
    private void buildButtonPanel(){
        buttonPanel = new JPanel();      
//adding three buttons add, change  and remove to the panel
      JButton  addButton = new JButton("Add");
      JButton  changeButton = new JButton("Change");
      JButton removeButton = new JButton("Remove");
        if (MyShapes.shapes.size() > 0){
            changeButton.setEnabled(true);
            removeButton.setEnabled(true);
        } else {
            changeButton.setEnabled(false);
            removeButton.setEnabled(false);
        }

        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {  //Listner for addButton
                TabbedPane tp = new TabbedPane();
                tp.show();
                tp.setSize(700, 200);
            }
        });
        changeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	MyShapes.shapes.remove(MyShapes.currentIndex);  //Listner for changeButton
                MyShapes.currentIndex = 0;
                MyShapes.showEventDemo();
                TabbedPane tp = new TabbedPane();
                tp.show();
                tp.setSize(700,200);
            }
        });
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyShapes.shapes.remove(MyShapes.currentIndex);  //Listner for removeButton
                MyShapes.currentIndex = 0;
                MyShapes.showEventDemo();
            }
        });
        buttonPanel.add(addButton);
        buttonPanel.add(changeButton);
        buttonPanel.add(removeButton);
    }

}

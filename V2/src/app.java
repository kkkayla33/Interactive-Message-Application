import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class app extends JFrame{

	// frame 
    // static JFrame frame; 
    private JPanel backPanel, showPanel, titlePanel, controlPanel, textControlPanel,
            bgControlPanel, shapeButtonPanel, otherbgPanel;
    // elements
    private JLabel lbText,lbSize,lbStyle,lbColor,lbShape,lbBack,lbWidth,lbHeight,lbTitle;
    private JTextField tfText,tfWidth,tfHeight; 
    private JComboBox cbSize,cbStyle,cbColor,cbShape,cbBack;
    private JSpinner widthSpinner, heightSpinner;
    private JSplitPane js;
 
    // attributes
    private String Text;
    private String Width;
    private String Height;
    private String Size;
    private String Style;
    private String SColor;
    private String Shape;
    private String Back;
    
  
    public app() {
    	// constructor
    	
    	// view
    	// create a new frame 
    	// frame = new JFrame("Message Application"); 
    	super("app");
    	 
        // create a panel 
        
        // GroupLayout layout = new GroupLayout(p1);
    	
//        setLayout(new BorderLayout());
//        p1 = new JPanel(new GridLayout(8,1));
        setLocationRelativeTo(null);
        backPanel = new JPanel();
        showPanel = new JPanel();
        titlePanel = new JPanel();
        controlPanel = new JPanel();
        textControlPanel = new JPanel();
        bgControlPanel = new JPanel();
        shapeButtonPanel = new JPanel();
        otherbgPanel = new JPanel();
        
        getContentPane().add(backPanel, BorderLayout.CENTER);
        backPanel.setPreferredSize(new Dimension(800, 450));

        backPanel.add(titlePanel,BorderLayout.NORTH);  //top
		titlePanel.setPreferredSize(new Dimension(700, 50));
        
        backPanel.add(controlPanel,BorderLayout.WEST);  //left editing area
        controlPanel.setPreferredSize(new Dimension(400, 400));

        
        controlPanel.add(textControlPanel,BorderLayout.NORTH);   //left top
        textControlPanel.setPreferredSize(new Dimension(350, 200));
	        
	        
        controlPanel.add(bgControlPanel,BorderLayout.CENTER);  //left bottom
        bgControlPanel.setPreferredSize(new Dimension(350, 170));

        bgControlPanel.add(otherbgPanel,BorderLayout.NORTH);  //left bottom
        otherbgPanel.setPreferredSize(new Dimension(348, 100));

        bgControlPanel.add(shapeButtonPanel,BorderLayout.CENTER);  //left bottom
        shapeButtonPanel.setPreferredSize(new Dimension(348, 40));
	        
	    backPanel.add(showPanel,BorderLayout.CENTER);  //right screen
	    showPanel.setPreferredSize(new Dimension(300, 400));

        backPanel.setBackground(Color.gray);
        showPanel.setBackground(Color.white);
        titlePanel.setBackground(Color.white);
        controlPanel.setBackground(Color.white);
        textControlPanel.setBackground(Color.white);
        textControlPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        bgControlPanel.setBackground(Color.white);
        bgControlPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        shapeButtonPanel.setBackground(Color.white);
        otherbgPanel.setBackground(Color.white);
        
        backPanel.setBorder(new LineBorder(new Color(0,0,0)));
        showPanel.setBorder(new LineBorder(new Color(0,0,0)));

        // create elements 
        lbTitle = new JLabel("Customize your own message application!");
        lbText = new JLabel("Text Input:"); 
        tfText = new JTextField(15);
        lbSize = new JLabel("Font Size:");
        lbSize.setBounds(22, 7, 36, 30);
        
        String sSize[] = {"10","11","12","13","14","15" };
        cbSize = new JComboBox(sSize);
        cbSize.setBounds(22, 40, 36, 30);
        
        lbStyle = new JLabel("Font Style:"); 
        
        String sStyle[] = {"Regular","Bold","Italic","Bold Italic" };
        cbStyle = new JComboBox(sStyle);
        
        JButton boldButton = new JButton("B");
		boldButton.setFont(new Font("serif", Font.BOLD,14));
		boldButton.setBounds(27, 297, 49, 22);

		JButton italicButton = new JButton("I");
		italicButton.setFont(new Font("serif", Font.ITALIC,14));
		italicButton.setBounds(76, 297, 49, 22);

		JButton boldItalicButton = new JButton("BI");
		boldItalicButton.setFont(new Font("serif", Font.BOLD+Font.ITALIC,14));
		boldItalicButton.setBounds(125, 297, 49, 22);
        
        
        lbColor = new JLabel("Font Color:");
        // lbColor.setBounds(1, 20, 49, 22);
        
        String sColor[] = {"black", "blue", "cyan","dark gray", "gray","green", "light gray", "magenta", "orange", "pink", "red", "white", "yellow"};
        cbColor = new JComboBox(sColor);
        
        lbShape = new JLabel("Shape:"); 
        lbShape.setBounds(1, 70, 49, 22);

        String sShape[] = {" ","Oval","Rectangle","Rounded" };
        cbShape = new JComboBox(sShape);
        
        ImageIcon rectIcon = new ImageIcon(getClass().getResource(
                "/Image/Square.png"));
        JButton rectButton = new JButton(rectIcon);
        rectButton.setBounds(27, 70, 49, 22);
        
        ImageIcon roundRectIcon = new ImageIcon(getClass().getResource(
                "/Image/Rounded.png"));
        JButton roundRectButton = new JButton(roundRectIcon);
        roundRectButton.setBounds(76, 70, 49, 22);
        
        ImageIcon ovalIcon = new ImageIcon(getClass().getResource(
                "/Image/Oval.png"));
        JButton ovalButton = new JButton(ovalIcon);
        ovalButton.setBounds(125, 70, 49, 22);
              
              
        lbWidth = new JLabel("Shape Width: (0-300)");
        lbWidth.setBounds(1, 20, 49, 22);
        // sWidth[] = {"300","250","200","150"};
        tfWidth = new JTextField(5);
        // widthSpinner = new JSpinner(new SpinnerNumberModel(Width,10,300,10));
        // widthSpinner.setBounds(27, 116, 65, 22);

        lbHeight = new JLabel("Shape Height: (0-400)");
        // heightSpinner = new JSpinner(new SpinnerNumberModel(Height,10,250,10));
        // heightSpinner.setBounds(100, 116, 65, 22);

        tfHeight = new JTextField(5);

        lbBack = new JLabel("Background Color:"); 

        String sBack[] = {"white","black", "blue", "cyan","dark gray", "gray","green", "light gray", "magenta", "orange", "pink", "red",  "yellow"};
        cbBack = new JComboBox(sBack);
  
        // set texts 
        tfText.setText("input your message here");
        tfWidth.setText("200");
        tfHeight.setText("100");
        
      //add element to panel
        titlePanel.add(lbTitle);
        // textControlPanel.setBounds(0,0,);
        textControlPanel.add(lbText);
        textControlPanel.add(tfText);
        textControlPanel.add(lbSize);
        textControlPanel.add(cbSize);
        textControlPanel.add(lbStyle);
        textControlPanel.add(cbStyle);
        textControlPanel.add(lbColor);
        textControlPanel.add(cbColor);
        GridLayout twoColumnLayout = new GridLayout(0,2);

        textControlPanel.setLayout(twoColumnLayout);


        //set background

        // bgControlPanel.add(cbShape);
        otherbgPanel.add(lbWidth);
        otherbgPanel.add(tfWidth);
        // otherbgPanel.add(widthSpinner);
        otherbgPanel.add(lbHeight);
        otherbgPanel.add(tfHeight);
        // otherbgPanel.add(heightSpinner);
        otherbgPanel.add(lbBack);
        otherbgPanel.add(cbBack);
        otherbgPanel.setLayout(twoColumnLayout);
        shapeButtonPanel.add(lbShape);
        shapeButtonPanel.add(rectButton);
        shapeButtonPanel.add(roundRectButton);
        shapeButtonPanel.add(ovalButton);

        
        setTitle("Message Application");
        setSize(800, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false); 

            
        //add listener
        ActionHandler action = new ActionHandler();
        tfText.addActionListener(action);
        tfWidth.addActionListener(action);
        tfHeight.addActionListener(action);
        cbSize.addActionListener(action);
        cbStyle.addActionListener(action);
        cbColor.addActionListener(action);
        cbShape.addActionListener(action);
        cbBack.addActionListener(action);
        
        rectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Shape = "Rectangle";
				Text = tfText.getText();
                Width = tfWidth.getText();
                Height = tfHeight.getText();
	    	    Size = cbSize.getSelectedItem().toString();
	    	    Style = cbStyle.getSelectedItem().toString();
	    	    SColor = cbColor.getSelectedItem().toString();
	    	    Back = cbBack.getSelectedItem().toString();

//                int w = (int) widthSpinner.getValue();
//                int h =(int)heightSpinner.getValue();

//                if(w > 0) {
//                    Width = w;}
//                else {
//                    JOptionPane.showMessageDialog(null, "Your name is missing!", "Error", JOptionPane.ERROR_MESSAGE);
//                    return;
//                }
//                if(h > 0) {
//                    Height = h;}
//                else {
//                    JOptionPane.showMessageDialog(null, "Your name is missing!", "Error", JOptionPane.ERROR_MESSAGE);
//                    return;
//                }
				output output = new output(Text,Width,Height,Size,Style,SColor,Shape,Back, showPanel);
			}
		});
		
		roundRectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shape = "Rounded";
				Text = tfText.getText();
                Width = tfWidth.getText();
                Height = tfHeight.getText();
//                Width = (int)widthSpinner.getValue();
//                Height =(int)heightSpinner.getValue();
	    	    Size = cbSize.getSelectedItem().toString();
	    	    Style = cbStyle.getSelectedItem().toString();
	    	    SColor = cbColor.getSelectedItem().toString();
	    	    Back = cbBack.getSelectedItem().toString();
				output output = new output(Text,Width,Height,Size,Style,SColor,Shape,Back, showPanel);
			}
		});
		
		ovalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shape = "Oval";
				Text = tfText.getText();
                Width = tfWidth.getText();
                Height = tfHeight.getText();
	    	    Size = cbSize.getSelectedItem().toString();
	    	    Style = cbStyle.getSelectedItem().toString();
	    	    SColor = cbColor.getSelectedItem().toString();
	    	    Back = cbBack.getSelectedItem().toString();
				output output = new output(Text,Width,Height,Size,Style,SColor,Shape,Back, showPanel);
			}
		});

    	
    	}
  
	    private class ActionHandler implements ActionListener{
	
	    	  @Override
	    	  public void actionPerformed(ActionEvent e) {
	    		  Text = tfText.getText();
                  Width = tfWidth.getText();
                  Height = tfHeight.getText();
	    	      Size = cbSize.getSelectedItem().toString();
	    	      Style = cbStyle.getSelectedItem().toString();
	    	      SColor = cbColor.getSelectedItem().toString();
	    	      Shape = cbShape.getSelectedItem().toString();
	    	      Back = cbBack.getSelectedItem().toString();
			   
	    	      output output = new output(Text,Width,Height,Size,Style,SColor,Shape,Back, showPanel);
	    	  }
	
	
	    }

	  //main class
	  public static void main(String[] args) 
	  { 
		  app app=new app();
	    	      
	  } 

}

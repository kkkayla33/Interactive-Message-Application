import javax.swing.*;
import java.awt.*;

public class outputForm extends JFrame {
	private String getText;
    private String getFontColor;
    private String getFontStyle;
    private int getFontSize;
    private String getBackColor;
    private int getWidth;
    private int getHeight;
    private String getShape;
    private int textWidth;

    public outputForm(String Text,String FontColor,String FontStyle,String FontSize,String BackColor,String Width,String Height,String Shape) {
    	getText = Text;
    	getFontColor = FontColor.toLowerCase();
    	getFontStyle = FontStyle.toLowerCase();
    	getFontSize = Integer.parseInt(FontSize);
    	getBackColor = BackColor.toLowerCase();
    	getWidth = Integer.parseInt(Width);
    	getHeight = Integer.parseInt(Height);
    	getShape = Shape.toLowerCase();
    	
    	

        JPanel jPanel;
        jPanel = new JPanel() {

            public void paint(Graphics g) {

            	//text&shape
            	FontMetrics fm=g.getFontMetrics();
                textWidth = fm.stringWidth(getText);
                
                if(textWidth>getWidth) {
              	  g.setColor(Color.red);
              	  setBackground(Color.white);     
              	  g.setFont(new Font("Bold", Font.BOLD, 18));         
              	  g.drawString("The message is over loaded!", getWidth/2, getHeight/2);
                }
                else {
                	if(getFontColor.equals("black"))
                        g.setColor(Color.black);
                    else if(getFontColor.equals("blue"))
                        g.setColor(Color.blue);
                    else if(getFontColor.equals("cyan"))
                        g.setColor(Color.cyan);
                    else if(getFontColor.equals("dark gray"))
                        g.setColor(Color.darkGray);
                    else if(getFontColor.equals("gray"))
                        g.setColor(Color.gray);
                    else if(getFontColor.equals("green"))
                        g.setColor(Color.green);
                    else if(getFontColor.equals("light gray"))
                        g.setColor(Color.lightGray);
                    else if(getFontColor.equals("magenta"))
                        g.setColor(Color.magenta);
                    else if(getFontColor.equals("orange"))
                        g.setColor(Color.orange);
                    else if(getFontColor.equals("pink"))
                        g.setColor(Color.pink);
                    else if(getFontColor.equals("red"))
                        g.setColor(Color.red);
                    else if(getFontColor.equals("white"))
                        g.setColor(Color.white);
                    else if(getFontColor.equals("yellow"))
                        g.setColor(Color.yellow);
                	
                	if (getFontStyle.equals("bold"))
                        g.setFont(new Font("bold", Font.BOLD, getFontSize));
                    else if (getFontStyle.equals("italic"))
                        g.setFont(new Font("italic", Font.ITALIC, getFontSize));
                    else if (getFontStyle.equals("bold italic"))
                        g.setFont(new Font("bold italic", Font.BOLD + Font.ITALIC, getFontSize));
                    else
                        g.setFont(new Font("plain", Font.PLAIN, getFontSize));
                	
                	g.drawString(getText, (500-getWidth)/2+(getWidth-textWidth)/2, (300-getHeight)/2 + getHeight/2);
                
                   if (Shape.equals("oval")){
                       g.drawOval((500-getWidth)/2, (300-getHeight)/2, getWidth, getHeight);}
                   else if (Shape.equals("rectangle")){
                       g.drawRect((500-getWidth)/2, (300-getHeight)/2, getWidth, getHeight);}
                   else if(Shape.equals("rounded")) {
                   	   g.drawRoundRect((500-getWidth)/2, (300-getHeight)/2, getWidth, getHeight, getWidth/2, getHeight/2);
                   }
                   
                      	
                }

            }
            
        };
			        //background
			        
			        JFrame frame = new JFrame("Output");
			        frame.add(jPanel);
			        frame.setContentPane(jPanel);
			        frame.setSize(500, 300);
			        frame.setVisible(true);
			        
			        if(getBackColor.equals("black"))
			     	   frame.setBackground(Color.black);
			        else if(getBackColor.equals("blue"))
			     	   frame.setBackground(Color.blue);
			        else if(getBackColor.equals("cyan"))
			     	   frame.setBackground(Color.cyan);
			        else if(getBackColor.equals("dark gray"))
			     	   frame.setBackground(Color.darkGray);
			        else if(getBackColor.equals("gray"))
			     	   frame.setBackground(Color.gray);
			        else if(getBackColor.equals("green"))
			     	   frame.setBackground(Color.green);
			        else if(getBackColor.equals("light gray"))
			     	   frame.setBackground(Color.lightGray);
			        else if(getBackColor.equals("magenta"))
			     	   frame.setBackground(Color.magenta);
			        else if(getBackColor.equals("orange"))
			     	   frame.setBackground(Color.orange);
			        else if(getBackColor.equals("pink"))
			     	   frame.setBackground(Color.pink);
			        else if(getBackColor.equals("red"))
			     	   frame.setBackground(Color.red);
			        else if(getBackColor.equals("white"))
			     	   frame.setBackground(Color.white);
			        else if(getBackColor.equals("yellow"))
			     	   frame.setBackground(Color.yellow);
        
    }

}


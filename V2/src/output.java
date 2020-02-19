import javax.swing.*;
import java.awt.*;

public class output extends JPanel{
	private String getText;
	private int getWidth;
	private int getHeight;
	private int getSize;
	private String getStyle;
	private String getColor;
	private String getShape;
	private String getBack;
	private int textWidth;
	
	public output(String Text, String Width, String Height,String Size,String Style,String SColor,String Shape,String Back,JPanel panel2) {
		getText = Text;
		getWidth = Integer.parseInt(Width);
		getHeight = Integer.parseInt(Height);
		getSize = Integer.parseInt(Size);
		getStyle = Style;
		getColor = SColor;
		getShape = Shape;
		getBack = Back;
		
		Graphics g = panel2.getGraphics();

        	//text&shape
        	FontMetrics fm=g.getFontMetrics();
            textWidth = fm.stringWidth(getText);
            
            if(textWidth>getWidth) {
          	  g.setColor(Color.red);
          	
          	  getText = "The message is over loaded!";
          	  getShape = " ";
            }
            else {
                if(getBack.equals("black"))
                    g.setColor(Color.black);
                else if(getBack.equals("blue"))
                	g.setColor(Color.blue);
                else if(getBack.equals("cyan"))
                	g.setColor(Color.cyan);
                else if(getBack.equals("dark gray"))
                	g.setColor(Color.darkGray);
                else if(getBack.equals("gray"))
                	g.setColor(Color.gray);
                else if(getBack.equals("green"))
                	g.setColor(Color.green);
                else if(getBack.equals("light gray"))
             	    g.setColor(Color.lightGray);
                else if(getBack.equals("magenta"))
                	g.setColor(Color.magenta);
                else if(getBack.equals("orange"))
                	g.setColor(Color.orange);
                else if(getBack.equals("pink"))
                	g.setColor(Color.pink);
                else if(getBack.equals("red"))
                	g.setColor(Color.red);
                else if(getBack.equals("white"))
                	g.setColor(Color.white);
                else if(getBack.equals("yellow"))
                	g.setColor(Color.yellow);
                
                   	
             }
            	g.fillRect(0, 0, 10000, 10000);
	
            	if(getColor.equals("black"))
                    g.setColor(Color.black);
                else if(getColor.equals("blue"))
                    g.setColor(Color.blue);
                else if(getColor.equals("cyan"))
                    g.setColor(Color.cyan);
                else if(getColor.equals("dark gray"))
                    g.setColor(Color.darkGray);
                else if(getColor.equals("gray"))
                    g.setColor(Color.gray);
                else if(getColor.equals("green"))
                    g.setColor(Color.green);
                else if(getColor.equals("light gray"))
                    g.setColor(Color.lightGray);
                else if(getColor.equals("magenta"))
                    g.setColor(Color.magenta);
                else if(getColor.equals("orange"))
                    g.setColor(Color.orange);
                else if(getColor.equals("pink"))
                    g.setColor(Color.pink);
                else if(getColor.equals("red"))
                    g.setColor(Color.red);
                else if(getColor.equals("white"))
                    g.setColor(Color.white);
                else if(getColor.equals("yellow"))
                    g.setColor(Color.yellow);
            	
            	if (getStyle.equals("Bold"))
                    g.setFont(new Font("bold", Font.BOLD, getSize));
                else if (getStyle.equals("Italic"))
                    g.setFont(new Font("italic", Font.ITALIC, getSize));
                else if (getStyle.equals("Bold Italic"))
                    g.setFont(new Font("bold italic", Font.BOLD + Font.ITALIC, getSize));
                else
                    g.setFont(new Font("plain", Font.PLAIN, getSize));
            	   	
               if (getShape.equals("Oval")){
                   g.drawOval((300-getWidth)/2, (400-getHeight)/2, getWidth, getHeight);}
               else if (getShape.equals("Rectangle")){
                   g.drawRect((300-getWidth)/2, (400-getHeight)/2, getWidth, getHeight);}
               else if(getShape.equals("Rounded")) {
               	   g.drawRoundRect((300-getWidth)/2, (400-getHeight)/2, getWidth, getHeight, getWidth/2, getHeight/2);
               }
               
               g.drawString(getText, 300/2-textWidth/2, 400/2);
               
       
		
	}
	

}

import javax.swing.*;
import java.awt.*;

public class messageApplication {
private String Text;
private String FontColor;
private String FontStyle;
private String FontSize;
private String BackColor;
private String Width;
private String Height;
private String Shape;

	
	public messageApplication() {
		// Author: Zijing Gao, zig13@pitt.edu
	
		//input text
		Text = JOptionPane.showInputDialog("Input Message");
		if(Text.length() == 0) {
			JOptionPane.showMessageDialog(null,"Please enter the message");
		}else {	//input font style
			JTextField tfFontColor = new JTextField();
			JTextField tfFontStyle = new JTextField();
			JTextField tfFontSize = new JTextField();
			
			
			Object[] fontForm = {
				"Customize your Font Style :D",
				"                            ",
				"Font Color:", tfFontColor,
				"(black, blue, cyan, dark gray, gray, green, light gray, magenta, orange, pink, red, white, yellow)",
			    "Font Style:", tfFontStyle,
			    "(Regular, Bold, Italic or Bold Italic)",
			    "Font Size:", tfFontSize
			};
	
			int optionFont = JOptionPane.showConfirmDialog(null, fontForm, "Message Application", JOptionPane.OK_CANCEL_OPTION);
			if (optionFont != JOptionPane.OK_OPTION) {
			    System.out.println("Customize Canceled");
			} 
			else {
				FontColor= tfFontColor.getText();
				FontStyle= tfFontStyle.getText();
				FontSize= tfFontSize.getText();
				if(FontColor.length() == 0 ||FontStyle.length() == 0 || FontSize.length() == 0) {
					JOptionPane.showMessageDialog(null,"Please enter all attributes");
				}
				if(checkColor(FontColor) == false || checkFontStyle(FontStyle)==false) {
					JOptionPane.showMessageDialog(null,"Please enter valid attributes");					
				}
				else {
					//input background style
					JTextField tfBackColor = new JTextField();
					JTextField tfWidth = new JTextField();
					JTextField tfHeight = new JTextField();
					JTextField tfShape = new JTextField();
					
					
					Object[] BackgroundForm = {
						"Customize your Background Style :D",
						"BackColor:", tfBackColor,
						"(black, blue, cyan, dark gray, gray, green, light gray, magenta, orange, pink, red, white, yellow)",
						"Width:", tfWidth,
						"Height:", tfHeight,
						"Shape:", tfShape,
						"(Oval, Rectangle or Rounded)"
					};
			
					int optionShape = JOptionPane.showConfirmDialog(null, BackgroundForm, "Message Application", JOptionPane.OK_CANCEL_OPTION);
					if (optionShape != JOptionPane.OK_OPTION) {
					    System.out.println("Customize Canceled");
					} 
					else {
						BackColor= tfBackColor.getText();
						Width= tfWidth.getText();
						Height= tfHeight.getText();
						Shape= tfShape.getText();
						if(BackColor.length() == 0 ||Width.length() == 0 || Height.length() == 0||Shape.length() == 0) {
							JOptionPane.showMessageDialog(null,"Please enter all attributes");
						}
						if(checkColor(BackColor) == false || checkShape(Shape)==false) {
							JOptionPane.showMessageDialog(null,"Please enter valid attributes");					
						}
						else {
								outputForm output = new outputForm(Text,FontColor,FontStyle,FontSize,BackColor,Width,Height,Shape);
							}
			
						}
					}
				}
		     }
	      }
		
		private boolean checkFontStyle(String FontStyle) {
			if(FontStyle.toLowerCase().equals("bold")||FontStyle.toLowerCase().equals("bold italic")||FontStyle.toLowerCase().equals("italic")||FontStyle.toLowerCase().equals("regular")) {
				return true;
			}else{
			// TODO Auto-generated method stub
			return false;}
		}
		private boolean checkColor(String Color) {
			// TODO Auto-generated method stub
			if(Color.toLowerCase().equals("red")||Color.toLowerCase().equals("blue")||Color.toLowerCase().equals("green")||Color.toLowerCase().equals("black")||Color.toLowerCase().equals("cyan")||Color.toLowerCase().equals("dark gray")
					||Color.toLowerCase().equals("gray")||Color.toLowerCase().equals("light gray")||Color.toLowerCase().equals("magenta")||Color.toLowerCase().equals("orange")||Color.toLowerCase().equals("pink")||
					Color.toLowerCase().equals("white")||Color.toLowerCase().equals("yellow")) {
				return true;
			}else{
			return false;}
		}

		
		private boolean checkShape(String Shape) {
			if(Shape.toLowerCase().equals("oval")) {
				return true;
			}else if(Shape.toLowerCase().equals("rectangle")) {
				return true;
			}else if(Shape.toLowerCase().equals("rounded")) {
				return true;
			}else {
			return false;}
		}
		public static void main(String[] args) {
		
			messageApplication input = new messageApplication();
		}

}

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Random extends JFrame{
	
	JLabel [] label = new JLabel[10];
	String [] name = {"1","2","3","4","5","6","7","8","9","10"};
	
	public Random() {
		setTitle("1-100까지 무작위로 숫자 나타내기");
		setSize(500,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.green);
		
		for(int i = 0; i<label.length; i++) {
			label[i] = new JLabel(name[i]);
		}
 
		for(int i=0; i<label.length; i++) {
   
			int x = (int)(Math.random()*500);
			int y = (int)(Math.random()*200);
   
			label[i].setLocation(x,y);
			label[i].setSize(20,20);
			c.add(label[i]);
		}
		
		
	}
}
public class RandomNumber {

	public static void main(String[] args) {
		
		Random r = new Random();
		

	}

}

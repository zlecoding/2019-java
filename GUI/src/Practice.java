import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Practice extends JFrame {
	
	private String [] name = {"김00", "강00", "박00", "이00", "최00", "한00"};
	private String [] age = {"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
	private String [] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	private JComboBox<String> nc = new JComboBox<String>(name); //콤보박스 생성
	private JComboBox<String> ac = new JComboBox<String>(age); 
	private JComboBox<String> nbc = new JComboBox<String>(number); 
	String a;
	int b;
	int d;
	
	public Practice() {
		setTitle ("건준 컴퓨터 학원");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(nc);
		c.add(ac);
		c.add(nbc);
		
		JLabel label = new JLabel("()님의 나이는 ()살이고 숫자()을(를) 좋아합니다.");
		c.add(label);
		
		JLabel result = new JLabel ("사용자의 합격여부입니다.");
		c.add(result);
		
		JButton button = new JButton("합격여부 확인");
		c.add(button);
		
	
		nc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					
				JComboBox<String> nbox = (JComboBox<String>)e.getSource();
				int index = nbox.getSelectedIndex();
				
				if(index == 0) {
					a="김00";
				} else if(index ==1) {
					a= "강00";
				}else if(index ==2) {
					a="박00";
				}else if(index ==3) {
					a="이00";
				}else if(index ==4) {
					a="최00";
				} else {
					a="한00";
				}
				
			}
			
		});
		
		
		ac.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JComboBox<String> nbox = (JComboBox<String>)e.getSource();
				int index = nbox.getSelectedIndex();
				
				if(index == 0) {
					b =20;
				} else if(index ==1) {
					b=21;
				}else if(index ==2) {
					b=22;
				}else if(index ==3) {
					b=23;
				}else if(index ==4) {
					b=24;
				} else if(index == 5) {
					b=25;
				} else if(index == 6) {
					b=26;
				}else if(index == 7) {
					b=27;
				}else if(index == 8) {
					b=28;
				}else if(index == 9) {
					b=29;
				}else {
					b=30;
				}
				
			}
			
		});
		
		nbc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JComboBox<String> nbox = (JComboBox<String>)e.getSource();
				int index = nbox.getSelectedIndex();
				
				if(index == 0) {
					d = 0;
				} else if(index ==1) {
					d=1;
				}else if(index ==2) {
					d=2;
				}else if(index ==3) {
					d=3;
				}else if(index ==4) {
					d=4;
				} else if(index == 5) {
					d=5;
				} else if(index == 6) {
					d=6;
				}else if(index == 7) {
					d=7;
				}else if(index == 8) {
					d=8;
				}else if(index == 9) {
					d=9;
				}else if(index == 10) {
					d=10;
				}else {
					d=11;
				}
				
			}
			
		});
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				label.setText("("+a+")님의 나이는" +"("+b+")살이고 숫자 ("+d+")을(를) 좋아합니다.");
				
				if(b >24 && d>5)
					result.setText("합격하셨습니다.");
				else 
					result.setText("불합격하셨습니다.");
				
			}
			
		});
		
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		 new Practice();

	}

}

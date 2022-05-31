import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculater implements ActionListener {
	
	JFrame frame;
	JButton[] button = new JButton[5];
	JPanel panel;
	JTextField textfield1;
	JTextField textfield2;
	JLabel label;
	JMenu menu1;
	JMenuItem item1;
	JMenuBar menubar;
	JMenu menu2;
	JMenuItem item2;
	JMenuItem item3;
	
	
	
	
	Calculater() {
		
		
		item3 = new JMenuItem("EXIT");
		menubar = new JMenuBar();
		menu1 = new JMenu("File");
		item1 = new JMenuItem("Layout");
		item2 = new JMenuItem("About");
		menu2 = new JMenu("Help");
		menu2.add(item2);
		menu1.add(item1);
		menu1.add(item3);
		item2.addActionListener(this);
		item3.addActionListener(this);
		
		menubar.add(menu1);
		menubar.add(menu2);
		item1.addActionListener(this);
		
		
		textfield1 = new JTextField();
		textfield2 = new JTextField();
		
		
		textfield1.setFont(new Font("MyFont",Font.BOLD,50));
		textfield1.setText("First Number");
		textfield1.setBackground(Color.BLACK);
		textfield2.setFont(new Font("MyFont",Font.BOLD,50));
		textfield2.setText("Second Number");
		textfield2.setBackground(Color.BLACK);
		label = new JLabel();
		label.setFont(new Font("MyFont",Font.BOLD,25));
		label.setText("Answer");
		
		panel = new JPanel();
		panel.setSize(440,500);
		
		frame = new JFrame("Calculater");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setJMenuBar(menubar);
		
		for(int x=0;x<5;x++) {
			 button[x] = new JButton();
			 button[x].addActionListener(this);
			 panel.add(button[x]);
			 button[x].setFont(new Font("MyFont",Font.BOLD,30));
			 }
		
		button[0].setText("Multiply");
		button[1].setText("Divide");
		button[2].setText("Add");
		button[3].setText("Substract");
		button[4].setText("Reset");
		
		
		
		panel.add(textfield1);
		panel.add(textfield2);
		panel.add(label);
		
		
		frame.add(panel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==item3) {
			frame.dispose();
			System.out.println("Thank You!");
		}
		
		if(e.getSource()==item2) {
			JLabel about1 = new JLabel("Made By Sreyank Bose");
			JLabel about2 = new JLabel("Version 1.0");
			JLabel about3 = new JLabel("Name: Calculater");
			
			
			JFrame frame = new JFrame("About Panel");
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setSize(500,500);
			frame.setLocationRelativeTo(null);
			frame.setLayout(new GridLayout(10,10));
			
			frame.add(about1);
			frame.add(about2);
			frame.add(about3);
			
			frame.setVisible(true);
		}
		
		if(e.getSource()==item1) {
			JFrame frame = new JFrame("Layout Panel");
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setSize(500,500);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			frame.setLayout(new FlowLayout());
			
			JButton layout1 = new JButton("Black");
			JButton layout2 = new JButton("White (Default)");
			JButton layout3 = new JButton("Gray");
			
			for(int i=0;i<5;i++) {
				
				frame.add(layout3);
				frame.add(layout2);
				frame.add(layout1);
				
				layout1.setFocusable(false);
				layout2.setFocusable(false);
				layout3.setFocusable(false);
				
				layout1.addActionListener(this);
				layout2.addActionListener(this);
				layout3.addActionListener(this);
				
				
				
				
				if(e.getSource()==layout1) {
					
					
					
					
					
				}
			
		
		
		try {
			if(e.getSource()==button[0]) {
				
				double x = Double.parseDouble(textfield1.getText());
				double y = Double.parseDouble(textfield2.getText());
				
				
				label.setText("Answer = "+ (int) (x * y));
			}

			else if(e.getSource()==button[1]) {
				
				double x = Double.parseDouble(textfield1.getText());
				double y = Double.parseDouble(textfield2.getText());
				
				label.setText("Answer = "+(int) (x / y));
			}

			else if(e.getSource()==button[2]) {
	
	
				double x = Double.parseDouble(textfield1.getText());
				double y = Double.parseDouble(textfield2.getText());
	
				label.setText("Answer = "+ (int) (x + y));
}

			else if (e.getSource()==button[3]) {
	
	
				double x = Double.parseDouble(textfield1.getText());
				double y = Double.parseDouble(textfield2.getText());
				
				label.setText("Answer = "+(int) (x - y));
				}
			else if(e.getSource()==button[4]) {
				
				textfield1.setText("First Number");
				textfield2.setText("Second Number");
				label.setText("Answer");
}
		}
		
		
		catch(Exception x) {
			System.out.println("You Arw Not Supposed to do the wrong thing");
		}
		

	
			
		
		}
	}
		
	}

	
}


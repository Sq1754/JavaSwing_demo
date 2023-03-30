import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javafx.scene.paint.Color;
public class Swing_Demo  {
	   public Swing_Demo()   {
		    JFrame jf = new JFrame("Swing Frame");

//Button
		    JButton b = new JButton("Click");
		    b.setBounds(30, 50, 100, 30);
		    jf.add(b);
		    
//Label
		    JLabel l = new JLabel("Enter ");
		    l.setBounds(70, 80, 100, 30);
		    jf.add(l);
		    
		    JLabel l2 = new JLabel("");
		    l2.setBounds(30, 320, 300, 30);
		    jf.add(l2);
		    
		    JLabel l3 = new JLabel("Password:");
		    l3.setBounds(30, 350, 100, 30);
		    jf.add(l3);
		    
		    
//TextField
		    JTextField tf = new JTextField(" ");
		    tf.setBounds(130, 80, 100, 30);
		    jf.add(tf);
		    
//TEXTAREA
		    JTextArea ta = new JTextArea();
		    ta.setBounds(30, 110, 200, 200);
		    jf.add(ta);
		    
//PasswordField
		    JPasswordField pass = new JPasswordField();
		    pass.setBounds(140, 350, 100, 30);
		    jf.add(pass);
		    
//Radio button
		    JRadioButton r = new JRadioButton("Male");
		    JRadioButton r2 = new JRadioButton("Female");
		    r.setBounds(140, 400, 70, 25);
		    r2.setBounds(140, 445, 70, 25);
		    jf.add(r);
		    jf.add(r2);
		    
// ComboBox
		    
		    String city[]= {"Agra","Mumbai","Delhi","Hyderabad"};
		    JComboBox box = new JComboBox(city);
		    box.setBounds(300, 50, 70, 30);
		    jf.add(box);
		    
		    
		    
// ActionListner
		    b.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		l.setText("Done");
		    		tf.setText("Welcome");
		    		tf.setBackground(java.awt.Color.BLACK);
		    		tf.setForeground(java.awt.Color.YELLOW);
		    		
		    		String txt = ta.getText();
		    		String word[] = txt.split(" ");
		    		l2.setText("Total characters: "+txt.length()+" Total Words: "+word.length);
		    		
		    		l3.setText(pass.getText());
		    		
		    		if(r.isSelected()) {
		    			JOptionPane.showMessageDialog(jf, r,"You are male", 2);
		    			
		    			r2.setSelected(false);
		    		}else if(r2.isSelected()) {
		    			JOptionPane.showMessageDialog(jf, r2,"You are Female", 1);
		    			r.setSelected(false);
		    			
		    		}
		    	}
		    });
		    
		    
//Frame properties
		    jf.setLayout(null);
		    jf.setSize(500,500);
		    jf.setVisible(true);
	// for activating close button
		    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
	   }
	   
    public static void main(String[]sq) {
    	
    	new Swing_Demo();
    }

	
}

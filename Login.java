package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	
	JButton login, signUp, clear;
	JTextField cardTextField;
	JPasswordField pinTextField;
	
	Login(){
		
		setTitle("Dee-Jay Bank");
		
		setLayout(null);
		
		ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		Image i2 = il.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		label.setBounds(110, 10, 100, 100);
		add(label);
		
		JLabel text = new JLabel("Welcome to ATM");
		text.setFont(new Font("Osward", Font.BOLD, 38));
		text.setBounds(240, 40, 400, 40);
		add(text);
		
		JLabel cardNo = new JLabel("Card No. :");
		cardNo.setFont(new Font("Raleway", Font.BOLD, 28));
		cardNo.setBounds(150, 150, 150, 30);
		add(cardNo);
		
		cardTextField = new JTextField();
		cardTextField.setBounds(300, 150, 250, 30);
		cardTextField.setFont(new Font("Arial", Font.BOLD, 18));
		add(cardTextField);
		
		JLabel pin = new JLabel("Pin :");
		pin.setFont(new Font("Raleway", Font.BOLD, 28));
		pin.setBounds(225, 200, 100, 30);
		add(pin);
		
		pinTextField = new JPasswordField();
		pinTextField.setBounds(300, 200, 250, 30);
		cardTextField.setFont(new Font("Arial", Font.BOLD, 18));
		add(pinTextField);
		
		login = new JButton("SIGN IN");
		login.setBounds(300, 240, 120, 30);
		login.addActionListener(this);
		add(login);
		
		clear = new JButton("CLEAR");
		clear.setBounds(430, 240, 120, 30);
		clear.addActionListener(this);
		add(clear);
		
		signUp = new JButton("SIGN UP");
		signUp.setBounds(430, 300, 120, 30);
		signUp.addActionListener(this);
		add(signUp);
		
		getContentPane().setBackground(Color.white);
		
		setSize(800, 480);
		setVisible(true);
		setLocation(350, 200);
	}
	
	public static void main(String[] args) {
		
		new Login();
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource() == clear) {
			cardTextField.setText("");
			pinTextField.setText("");
			
		}
		else if(ae.getSource() == login) {
			Conn conn = new Conn();
			String cardnumber = cardTextField.getText();
			String pinnumber = pinTextField.getText();
			
			String query = "Select * From login_details where card_number = '" +  cardnumber
			 + "' and pin = '" + pinnumber + "'  ;";
			
			try {
				ResultSet rs = conn.s.executeQuery(query);
				if(rs.next()) {
					setVisible(false);
					new Transaction(pinnumber).setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect Card No. or Pin");
				}
				
			}catch (Exception e) {
				
			}
					
		}
		else if(ae.getSource() == signUp) {
			
			setVisible(false);
			new SignUpOne().setVisible(true);
			
		}
		
	}

}

package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Deposit extends JFrame implements ActionListener {
	
	JTextField amount;
	JButton Deposit, back;
	
	String pinnumber;
	
	Deposit(String pinnumber){
		
		this.pinnumber = pinnumber;
		
		setLayout(null);
		
		ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = il.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel text = new JLabel("Enter the amount you want to deposit.");
		text.setFont(new Font("System", Font.PLAIN , 18));		
		text.setBounds(185, 340, 700, 35);
		text.setForeground(Color.WHITE);
		image.add(text);
		
		amount = new JTextField();
		amount.setBounds(230, 400, 200, 25);
		amount.setFont(new Font("Arial", Font.PLAIN, 14));
		add(amount);
		
		Deposit = new JButton("Deposit");
		Deposit.setBounds(350, 445, 80, 25);
		Deposit.addActionListener(this);
		image.add(Deposit);
		
		back = new JButton("Back");
		back.setBounds(350, 480, 80, 25);
		back.addActionListener(this);
		image.add(back);
		
		setSize(900, 900);
		setLocation(300, 0);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Deposit("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == Deposit) {
			String number = amount.getText();
			Date date = new Date();
			
			if(number.equals("")) {
				JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit.");
			else {
				Conn conn = new Conn();
				String query = ""
			}
		}
		else if(e.getSource() == back) {
			setVisible(false);
			new Transaction(pinnumber).setVisible(true);
		}
		
	}
}

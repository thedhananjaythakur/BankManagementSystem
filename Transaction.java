package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Transaction extends JFrame implements ActionListener{
	
	JButton Deposit, Cash, fastCash, pinChange, miniStatement, exit, balance;
	
	String pinnumber;
	
	Transaction(String pinnumber){
		
		this.pinnumber = pinnumber;
		
		setLayout(null);
		
		ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = il.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel text = new JLabel("Please select your transaction");
		text.setFont(new Font("System", Font.PLAIN , 22));		
		text.setBounds(190, 300, 700, 35);
		text.setForeground(Color.WHITE);
		image.add(text);
		
		Deposit = new JButton("Deposit");
		Deposit.setBounds(155, 415, 150, 30);
		Deposit.addActionListener(this);
		image.add(Deposit);
		
		Cash = new JButton("Cash Withdrawal");
		Cash.setBounds(365, 415, 150, 30);
		Cash.addActionListener(this);
		image.add(Cash);
		
		fastCash = new JButton("Fast Cash");
		fastCash.setBounds(155, 450, 150, 30);
		fastCash.addActionListener(this);
		image.add(fastCash);
		
		pinChange = new JButton("Pin Change");
		pinChange.setBounds(155, 485, 150, 30);
		pinChange.addActionListener(this);
		image.add(pinChange);
		
		miniStatement = new JButton("Mini Statement");
		miniStatement.setBounds(365, 450, 150, 30);
		miniStatement.addActionListener(this);
		image.add(miniStatement);
		
		balance = new JButton("Balance enquiry");
		balance.setBounds(365, 485, 150, 30);
		balance.addActionListener(this);
		image.add(balance);
		
		exit = new JButton("Exit");
		exit.setBounds(365, 520, 150, 30);
		exit.addActionListener(this);
		image.add(exit);
		
		setSize(900, 900);
		setLocation(300, 0);
		setUndecorated(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Transaction("");
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() ==  exit) {
			System.exit(0);
		}
		else if(e.getSource() == Deposit) {
			setVisible(false);
			new Deposit(pinnumber).setVisible(true);
		}
	}
}

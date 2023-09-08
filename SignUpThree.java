package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SignUpThree extends JFrame implements ActionListener{
	
	JButton cancel, submit;
	
	JRadioButton saving, current, fixed, recurring;
	
	JCheckBox atmCrd, mobileBnk, InternetBnk, EmailSmsAlert
	,ChequeBook, EStatement, agree ;
	
	
	String formno;
			
	public SignUpThree(String formno) {
		
		this.formno = "8055";
		
		setLayout(null);
		setTitle("New Application Form @3");
		

		JLabel formNo = new JLabel("Application form No." + formno );
		formNo.setFont(new Font("Raleway", Font.BOLD, 38));		
		formNo.setBounds(150, 20, 600, 40);
		add(formNo);
		
		JLabel accountDetails = new JLabel("Page 3: Account Details ");
		accountDetails.setFont(new Font("Raleway", Font.BOLD, 20));		
		accountDetails.setBounds(250, 60, 400, 40);
		add(accountDetails);
		
		JLabel accountType = new JLabel("Account Type: ");
		accountType.setFont(new Font("Raleway", Font.PLAIN , 18));		
		accountType.setBounds(150, 130, 250, 25);
		add(accountType);
		
		saving = new JRadioButton("Saving Account");
		saving.setBounds(150, 160, 200, 25);
		saving.setBackground(Color.WHITE);
		add(saving);
		
		current = new JRadioButton("Current Account");
		current.setBounds(350, 160, 200, 25);
		current.setBackground(Color.WHITE);
		add(current);
		
		fixed = new JRadioButton("Fixed Deposit Account");
		fixed.setBounds(150, 190, 200, 25);
		fixed.setBackground(Color.WHITE);
		add(fixed);
		
		recurring = new JRadioButton("Recurring Deposit Account");
		recurring.setBounds(350, 190, 200, 25);
		recurring.setBackground(Color.WHITE);
		add(recurring);
		
		ButtonGroup accountGroup = new ButtonGroup();
		accountGroup.add(saving);
		accountGroup.add(current);
		accountGroup.add(fixed);
		accountGroup.add(recurring);
		
		JLabel cardNo = new JLabel("Card Number");
		cardNo.setFont(new Font("Raleway", Font.PLAIN , 16));		
		cardNo.setBounds(200, 230, 200, 25);
		add(cardNo);
		
		JLabel cardNoNote = new JLabel("Your 16 digit card no.");
		cardNoNote.setFont(new Font("Raleway", Font.PLAIN , 10));		
		cardNoNote.setBounds(200, 245, 200, 25);
		add(cardNoNote);
		
		JLabel number = new JLabel("XXXX-XXXX-XXXX-8055");
		number.setFont(new Font("Raleway", Font.BOLD , 16));		
		number.setBounds(350, 230, 200, 25);
		add(number);
		
		JLabel pin = new JLabel("PIN");
		pin.setFont(new Font("Raleway", Font.PLAIN , 16));		
		pin.setBounds(200, 260, 200, 25);
		add(pin);
		
		JLabel pinNote = new JLabel("Your 6 digit security PIN");
		pinNote.setFont(new Font("Raleway", Font.PLAIN , 10));		
		pinNote.setBounds(200, 275, 200, 25);
		add(pinNote);
		
		JLabel pinNumber = new JLabel("XXXXXX");
		pinNumber.setFont(new Font("Raleway", Font.BOLD , 16));		
		pinNumber.setBounds(350, 260, 200, 25);
		add(pinNumber);
		
		
		
		
		JLabel service = new JLabel("Service Required");
		service.setFont(new Font("Raleway", Font.PLAIN , 18));		
		service.setBounds(150, 300, 200, 25);
		add(service);
		
		atmCrd = new JCheckBox("ATM Card");
		atmCrd.setBounds(150, 330, 150, 25);
		atmCrd.setBackground(Color.WHITE);
		add(atmCrd);
		
		InternetBnk = new JCheckBox("Internet Banking");
		InternetBnk.setBounds(350, 330, 150, 25);
		InternetBnk.setBackground(Color.WHITE);
		add(InternetBnk);
		
		mobileBnk = new JCheckBox("Mobile Banking");
		mobileBnk.setBounds(150, 360, 150, 25);
		mobileBnk.setBackground(Color.WHITE);
		add(mobileBnk);
		
		EmailSmsAlert = new JCheckBox("E-mail & SMS Alert");
		EmailSmsAlert.setBounds(350, 360, 150, 25);
		EmailSmsAlert.setBackground(Color.WHITE);
		add(EmailSmsAlert);
		
		ChequeBook = new JCheckBox("Cheque Book");
		ChequeBook.setBounds(150, 390, 150, 25);
		ChequeBook.setBackground(Color.WHITE);
		add(ChequeBook);
		
		EStatement = new JCheckBox("E-Statement");
		EStatement.setBounds(350, 390, 150, 25);
		EStatement.setBackground(Color.WHITE);
		add(EStatement);

		agree = new JCheckBox("I hereby decalare the above entered details are correct in the best of my knowledge.");
		agree.setBounds(150, 420, 1000, 25);
		agree.setFont(new Font("Raleway", Font.PLAIN , 12));
		agree.setBackground(Color.WHITE);
		add(agree);
		
		submit = new JButton("SUBMIT");
		submit.setBounds(570, 460, 120, 30);
		submit.setBackground(Color.BLUE);
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Raleway", Font.PLAIN, 14));
		submit.addActionListener(this);
		add(submit);
		
		cancel = new JButton("CANCEL");
		cancel.setBounds(440, 460, 120, 30);
		cancel.setBackground(Color.BLUE);
		cancel.setForeground(Color.WHITE);
		cancel.setFont(new Font("Raleway", Font.PLAIN, 14));
		cancel.addActionListener(this);
		add(cancel);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(800, 580);
		setVisible(true);
		setLocation(350, 20);
	}
	
	public static void main(String[] args) {
		new SignUpThree("");
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == submit) {
			String accountType = null;
			
			if(saving.isSelected()) {
				accountType = "Saving Account";
			}
			else if(current.isSelected()) {
				accountType = "Current Account";
			}
			else if(fixed.isSelected()) {
				accountType = "Fixed Deposit Account";
			} 
			else if(recurring.isSelected()) {
				accountType = "Recurring Deposit Account";
			} 
			
			Random random = new Random();
			String cardNumber = "" + Math.abs(random.nextLong() % 90000000L + 5040936000000000L);
			String Pin = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
			
			String facility = "";
			
			if(atmCrd.isSelected())
			{
				facility = facility + " ATM Card";
			}
			if(mobileBnk.isSelected())
			{
				facility = facility + " Mobile Banking";
			}
			if(InternetBnk.isSelected())
			{
				facility = facility + " Internet Banking";
			}
			if(EmailSmsAlert.isSelected())
			{
				facility = facility + " Email & SMS Alert";
			}
			if(ChequeBook.isSelected())
			{
				facility = facility + " Cheque Book";
			}
			
			if(EStatement.isSelected())
			{
				facility = facility + " E-Statement";
			}
		
		try {
			
			if(formno.equals("") ) {
				JOptionPane.showMessageDialog(null, "Mandatory field empty");
			}
			else {
				Conn c = new Conn();
				
				String query = "Insert into Account_Details values ( '" + formno + "', '" + 
						accountType + "', '" + cardNumber + "', '" + Pin + "', '" + facility + "' ) ;";
				c.s.executeUpdate(query);
				
				String query1 = "Insert into Login_Details values ( '" + formno + "', '" + 
				cardNumber + "', '" + Pin + "' ) ;";
				c.s.executeUpdate(query1);
				
				JOptionPane.showMessageDialog(null, "Card Number : " + cardNumber + "\n Pin : "
					+ Pin	);
				
				
			}
			
		} catch (Exception e1) {
			System.out.println(e1);
		}
		
		}
		else {
			setVisible(false);
		}
	}
	
}


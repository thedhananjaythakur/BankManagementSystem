package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SignUpOne extends JFrame implements ActionListener{
	
	JTextField nameTextField, fnameTextField, emailTextField,
	addressTextField, cityTextField, pincodeTextField, stateTextField	;
	
	JButton next;
	
	JRadioButton male, female, Married, Single, Divorced;
	
	JDateChooser dateChooser;
	
	public long random;
	
	public SignUpOne() {
		
		setLayout(null);
		setTitle("New Application Form @1");
		
		Random ran = new Random();
		random = Math.abs((ran.nextLong() % 9000L) + 1000L);
		
		JLabel formNo = new JLabel("Application form No." + random );
		formNo.setFont(new Font("Raleway", Font.BOLD, 38));		
		formNo.setBounds(150, 20, 600, 40);
		add(formNo);
		
		JLabel personalDetails = new JLabel("Page 1: Personal Details ");
		personalDetails.setFont(new Font("Raleway", Font.BOLD, 20));		
		personalDetails.setBounds(250, 60, 400, 40);
		add(personalDetails);
		
		JLabel name = new JLabel("Name");
		name.setFont(new Font("Raleway", Font.BOLD , 18));		
		name.setBounds(150, 130, 100, 25);
		add(name);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(350, 130, 300, 25);
		nameTextField.setFont(new Font("Arial", Font.PLAIN, 14));
		add(nameTextField);
		
		JLabel fname = new JLabel("Father's Name");
		fname.setFont(new Font("Raleway", Font.BOLD , 18));		
		fname.setBounds(150, 160, 200, 25);
		add(fname);
		
		fnameTextField = new JTextField();
		fnameTextField.setBounds(350, 160, 300, 25);
		fnameTextField.setFont(new Font("Arial",Font.PLAIN, 14));
		add(fnameTextField);
		
		JLabel dob = new JLabel("D.O.B");
		dob.setFont(new Font("Raleway", Font.BOLD , 18));		
		dob.setBounds(150, 190, 200, 25);
		add(dob);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(350, 190, 200, 25);
		add(dateChooser);
		
	
		JLabel gender = new JLabel("Gender");
		gender.setFont(new Font("Raleway", Font.BOLD , 18));		
		gender.setBounds(150, 220, 200, 25);
		add(gender);
		
		male = new JRadioButton("Male");
		male.setBounds(350, 220, 60, 25);
		male.setBackground(Color.WHITE);
		add(male);
		
		female = new JRadioButton("Female");
		female.setBounds(420, 220, 100, 25);
		female.setBackground(Color.WHITE);
		add(female);
		
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(male);
		genderGroup.add(female);
	
		JLabel email = new JLabel("E-mail");
		email.setFont(new Font("Raleway", Font.BOLD , 18));		
		email.setBounds(150, 250, 200, 25);
		add(email);
		
		emailTextField = new JTextField();
		emailTextField.setBounds(350, 250, 300, 25);
		emailTextField.setFont(new Font("Arial", Font.PLAIN, 14));
		add(emailTextField);
		
		JLabel Marital = new JLabel("Marital Status");
		Marital.setFont(new Font("Raleway", Font.BOLD , 18));		
		Marital.setBounds(150, 280, 200, 25);
		add(Marital);
		
		Married = new JRadioButton("Married");
		Married.setBounds(350, 280, 80, 25);
		Married.setBackground(Color.WHITE);
		add(Married);
		
		Single = new JRadioButton("Single");
		Single.setBounds(440, 280, 80, 25);
		Single.setBackground(Color.WHITE);
		add(Single);
		
		Divorced = new JRadioButton("Divorced");
		Divorced.setBounds(520, 280, 80, 25);
		Divorced.setBackground(Color.WHITE);
		add(Divorced);
		
		ButtonGroup MaritalGroup = new ButtonGroup();
		MaritalGroup.add(Married);
		MaritalGroup.add(Divorced);
		MaritalGroup.add(Single);
		
		JLabel Address = new JLabel("Address");
		Address.setFont(new Font("Raleway", Font.BOLD , 18));		
		Address.setBounds(150, 310, 200, 25);
		add(Address);
		
		addressTextField = new JTextField();
		addressTextField.setBounds(350, 310, 300, 25);
		addressTextField.setFont(new Font("Arial", Font.PLAIN, 14));
		add(addressTextField);
		
		JLabel City = new JLabel("City");
		City.setFont(new Font("Raleway", Font.BOLD , 18));		
		City.setBounds(150, 340, 200, 25);
		add(City);
		
		cityTextField = new JTextField();
		cityTextField.setBounds(350, 340, 300, 25);
		cityTextField.setFont(new Font("Arial", Font.PLAIN, 14));
		add(cityTextField);
		
		JLabel PinCode = new JLabel("Pin Code");
		PinCode.setFont(new Font("Raleway", Font.BOLD , 18));		
		PinCode.setBounds(150, 370, 200, 25);
		add(PinCode);
		
		pincodeTextField = new JTextField();
		pincodeTextField.setBounds(350, 370, 300, 25);
		pincodeTextField.setFont(new Font("Arial", Font.PLAIN, 14));
		add(pincodeTextField);
		
		JLabel State = new JLabel("State");
		State.setFont(new Font("Raleway", Font.BOLD , 18));		
		State.setBounds(150, 400, 200, 25);
		add(State);
		
		stateTextField = new JTextField();
		stateTextField.setBounds(350, 400, 300, 25);
		stateTextField.setFont(new Font("Arial", Font.PLAIN, 14));
		add(stateTextField);
		
		next = new JButton("Next");
		next.setBounds(570, 440, 80, 30);
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway", Font.PLAIN, 14));
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(800, 580);
		setVisible(true);
		setLocation(350, 20);
	}
	
	public static void main(String[] args) {
		new SignUpOne();
	}

	public void actionPerformed(ActionEvent e) {
		
		String formno = "" + random;
		
		String name = nameTextField.getText();
		
		String fname = fnameTextField.getText();
		
		String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
		
		String gender = null;
		
		if(male.isSelected()) {
			gender = "Male";
		}
		else if(female.isSelected()) {
			gender = "Female";
		}
		
		String email =  emailTextField.getText();
		
		String marital = null;
		
		if(Married.isSelected()) {
			marital = "Married";
		}
		else if(Single.isSelected()) {
			marital = "Single";
		}
		else if(Divorced.isSelected()) {
			marital = "Divorced";
		}
		
		String address = addressTextField.getText();
		
		String city = cityTextField.getText();
		
		String state = stateTextField.getText();
		
		String pincode = pincodeTextField.getText();
		
		try {
			
				Conn c = new Conn();
				
				String query = "Insert Into Signup values ( '" + formno + "', '" + name  + "', '" + fname  +
						"', '" + dob  + "', '" + gender  + "', '" + email  + "', '" + marital  + "', '" + address  + "', '" +
						city  + "', '" + state  + "', '" + pincode + "');" ;
				c.s.executeUpdate(query);
				
				setVisible(false);
				new SignUpTwo(formno).setVisible(true);
			
			
		} catch (Exception e1) {
			System.out.println(e1);
		}
		
	}
}

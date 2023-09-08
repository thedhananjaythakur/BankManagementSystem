package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SignUpTwo extends JFrame implements ActionListener{
	
	JTextField panTextField,addharTextField;
	
	JButton next;
	
	JRadioButton eyes, syes, eno, sno;
	
	JComboBox religionComboBox,categoryComboBox, incomeComboBox,
			educationComboBox, occupationComboBox;
	
	String formno;
			
	public SignUpTwo(String formno) {
		
		this.formno = formno;
		
		setLayout(null);
		setTitle("New Application Form @2");
		

		JLabel formNo = new JLabel("Application form No." + formno );
		formNo.setFont(new Font("Raleway", Font.BOLD, 38));		
		formNo.setBounds(150, 20, 600, 40);
		add(formNo);
		
		JLabel additionalDetails = new JLabel("Page 2: Additionl Details ");
		additionalDetails.setFont(new Font("Raleway", Font.BOLD, 20));		
		additionalDetails.setBounds(250, 60, 400, 40);
		add(additionalDetails);
		
		JLabel religion = new JLabel("Religion");
		religion.setFont(new Font("Raleway", Font.BOLD , 18));		
		religion.setBounds(150, 130, 100, 25);
		add(religion);
		
		String[] valReligion = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
		religionComboBox = new JComboBox(valReligion);
		religionComboBox.setBounds(350, 130, 300, 25);
		religionComboBox.setBackground(Color.WHITE);
		religionComboBox.setFont(new Font("Arial", Font.PLAIN, 14));
		add(religionComboBox);
		
		JLabel category = new JLabel("Category");
		category.setFont(new Font("Raleway", Font.BOLD , 18));		
		category.setBounds(150, 160, 200, 25);
		add(category);
		
		String[] valcategory = {"General", "OBC", "SC", "ST", "Other"};
		categoryComboBox = new JComboBox(valcategory);
		categoryComboBox.setBounds(350, 160, 300, 25);
		categoryComboBox.setBackground(Color.WHITE);
		categoryComboBox.setFont(new Font("Arial", Font.PLAIN, 14));
		add(categoryComboBox);
	
		
		JLabel income = new JLabel("Annual Income");
		income.setFont(new Font("Raleway", Font.BOLD , 18));		
		income.setBounds(150, 190, 200, 25);
		add(income);
		
		String[] valincome = {"Student", "< 2,50,000", "< 5,00,000", "< 9,50,000", "> 9,50,000"};
		incomeComboBox = new JComboBox(valincome);
		incomeComboBox.setBounds(350, 190, 300, 25);
		incomeComboBox.setBackground(Color.WHITE);
		incomeComboBox.setFont(new Font("Arial", Font.PLAIN, 14));
		add(incomeComboBox);
		
	
		JLabel educational = new JLabel("Educational qualification");
		educational.setFont(new Font("Raleway", Font.BOLD , 18));		
		educational.setBounds(150, 220, 200, 25);
		add(educational);
		
		String[] valeducational = {"Diploma", "Graduate", "Post Graduation", "Doctorate", "Other"};
		educationComboBox = new JComboBox(valeducational);
		educationComboBox.setBounds(350, 220, 300, 25);
		educationComboBox.setBackground(Color.WHITE);
		educationComboBox.setFont(new Font("Arial", Font.PLAIN, 14));
		add(educationComboBox);
	
		JLabel occupation = new JLabel("Occupation");
		occupation.setFont(new Font("Raleway", Font.BOLD , 18));		
		occupation.setBounds(150, 250, 200, 25);
		add(occupation);
		
		String[] valoccupation = {"Private", "Government", "Defence", "Business", "Other"};
		occupationComboBox = new JComboBox(valoccupation);
		occupationComboBox.setBounds(350, 250, 300, 25);
		occupationComboBox.setBackground(Color.WHITE);
		occupationComboBox.setFont(new Font("Arial", Font.PLAIN, 14));
		add(occupationComboBox);
		
		JLabel Pan = new JLabel("Pan No.");
		Pan.setFont(new Font("Raleway", Font.BOLD , 18));		
		Pan.setBounds(150, 280, 200, 25);
		add(Pan);
		
		panTextField = new JTextField();
		panTextField.setBounds(350, 280, 300, 25);
		panTextField.setFont(new Font("Arial", Font.PLAIN, 14));
		add(panTextField);
		
		
		
		JLabel addhar = new JLabel("Addhar No.");
		addhar.setFont(new Font("Raleway", Font.BOLD , 18));		
		addhar.setBounds(150, 310, 200, 25);
		add(addhar);
		
		addharTextField = new JTextField();
		addharTextField.setBounds(350, 310, 300, 25);
		addharTextField.setFont(new Font("Arial", Font.PLAIN, 14));
		add(addharTextField);
		
		JLabel senior = new JLabel("Senior Citizen");
		senior.setFont(new Font("Raleway", Font.BOLD , 18));		
		senior.setBounds(150, 340, 200, 25);
		add(senior);
		
		syes = new JRadioButton("Yes");
		syes.setBounds(350, 340, 60, 25);
		syes.setBackground(Color.WHITE);
		add(syes);
		
		sno = new JRadioButton("No");
		sno.setBounds(420, 340, 100, 25);
		sno.setBackground(Color.WHITE);
		add(sno);
		
		ButtonGroup seniorGroup = new ButtonGroup();
		seniorGroup.add(syes);
		seniorGroup.add(sno);
		
		JLabel existing = new JLabel("Existing account");
		existing.setFont(new Font("Raleway", Font.BOLD , 18));		
		existing.setBounds(150, 370, 200, 25);
		add(existing);
		
		eyes = new JRadioButton("Yes");
		eyes.setBounds(350, 370, 60, 25);
		eyes.setBackground(Color.WHITE);
		add(eyes);
		
		eno = new JRadioButton("No");
		eno.setBounds(420, 370, 100, 25);
		eno.setBackground(Color.WHITE);
		add(eno);
		
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(eyes);
		genderGroup.add(eno);
		
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
		new SignUpTwo("");
	}

	public void actionPerformed(ActionEvent e) {
		
		String religion = (String)religionComboBox.getSelectedItem();
		
		String category = (String)categoryComboBox.getSelectedItem();
		
		String income = (String)incomeComboBox.getSelectedItem();
		
		String educational = (String)educationComboBox.getSelectedItem();
		
		String occupation = (String)occupationComboBox.getSelectedItem();
		
		String Pan = panTextField.getText();
		
		String addhar = addharTextField.getText();
		
		String senior = null;
		
		if(syes.isSelected()) {
			senior = "True";
		}
		else if(sno.isSelected()) {
			senior = "False";
		}
		
		String existing = null;
		
		if(eyes.isSelected()) {
			existing = "True";
		}
		else if(eno.isSelected()) {
			existing = "False";
		}
		
		
		try {
			
			if(formno.equals("")) {
				JOptionPane.showMessageDialog(null, "Form no. is mandatory");
			}
			else {
				Conn c = new Conn();
				
				String query = "Insert Into additional_details values ( '" + formno + "', '" +
								religion  + "', '" + category  + "', '" + income  + "', '" + 
								educational  + "', '" + occupation  + "', '" + Pan  + "', '" +
								addhar  + "', '" + senior  + "', '" + existing  + "');" ;
				c.s.executeUpdate(query);
				
				setVisible(false);
				new SignUpThree(formno).setVisible(true);
			}
			
		} catch (Exception e1) {
			System.out.println(e1);
		}
		
	}
}

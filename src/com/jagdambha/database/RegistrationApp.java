package com.jagdambha.database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class RegistrationApp {

	private JFrame frame;
	private JTextField tfName;
	private JTextField tfEmail;
	private JTextField tfMobile;
	private JTextField tfAddress;
	private JPasswordField tfPassword;
	private JButton btnRegister;
	
	private Connection con;
	private PreparedStatement pst;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationApp window = new RegistrationApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegistrationApp() {
		initialize();
		connection();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 677, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 661, 389);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		tfName = new JTextField();
		tfName.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Enter Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		tfName.setToolTipText("Enter Name");
		tfName.setBounds(118, 36, 404, 35);
		mainPanel.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Registration Form");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 641, 14);
		mainPanel.add(lblNewLabel);
		
		tfEmail = new JTextField();
		tfEmail.setToolTipText("Enter Name");
		tfEmail.setColumns(10);
		tfEmail.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Enter Email ID", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		tfEmail.setBounds(118, 82, 404, 35);
		mainPanel.add(tfEmail);
		
		tfMobile = new JTextField();
		tfMobile.setToolTipText("Enter Name");
		tfMobile.setColumns(10);
		tfMobile.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Enter Mobile Number", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		tfMobile.setBounds(118, 128, 404, 35);
		mainPanel.add(tfMobile);
		
		tfAddress = new JTextField();
		tfAddress.setToolTipText("Enter Name");
		tfAddress.setColumns(10);
		tfAddress.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Enter Address", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		tfAddress.setBounds(118, 174, 404, 35);
		mainPanel.add(tfAddress);
		
		tfPassword = new JPasswordField();
		tfPassword.setEchoChar('*');
		tfPassword.setBorder(new TitledBorder(null, "Enter Password", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tfPassword.setBounds(118, 222, 404, 42);
		mainPanel.add(tfPassword);
		
		btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				insertData();
				
			}
		});
		btnRegister.setBounds(271, 280, 89, 23);
		mainPanel.add(btnRegister);
	}

	protected void insertData() {
		String name = tfName.getText().toString().trim();
		String email = tfEmail.getText().toString().trim();
		String mobile = tfMobile.getText().toString().trim();
		String address = tfAddress.getText().toString().trim();
		String password = tfPassword.getText().toString().trim();
		
		//Validation
		if(name.isEmpty()) {
			tfName.requestFocus();
			JOptionPane.showMessageDialog(frame, "Name Required");
			return;
		}
		
		try {
			
			pst = con.prepareStatement("insert into registration(name,email,mobile,address,password) values(?,?,?,?,?)");
			pst.setString(1, name);
			pst.setString(2, email);
			pst.setString(3, mobile);
			pst.setString(4, address);
			pst.setString(5, password);
			
			pst.execute();
			
			JOptionPane.showMessageDialog(frame, "Registred Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void connection() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
			
			JOptionPane.showMessageDialog(frame, "Database Connected...");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}

package com.jagdambha.database;

import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DatabaseConnector extends JFrame {

	private static JPanel contentPane;
	private JTextField tfEmployeeID;
	private JTextField tfName;
	private JTextField tfMobile;
	Connection con;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatabaseConnector frame = new DatabaseConnector();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public DatabaseConnector() throws Exception{
		setTitle("Employee Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 579, 351);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblID = new JLabel("Employee ID");
		lblID.setBounds(113, 60, 98, 27);
		panel.add(lblID);
		
		tfEmployeeID = new JTextField();
		tfEmployeeID.setBounds(221, 63, 205, 20);
		panel.add(tfEmployeeID);
		tfEmployeeID.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(113, 100, 98, 27);
		panel.add(lblName);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(221, 103, 205, 20);
		panel.add(tfName);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setBounds(113, 138, 98, 27);
		panel.add(lblMobile);
		
		tfMobile = new JTextField();
		tfMobile.setColumns(10);
		tfMobile.setBounds(221, 141, 205, 20);
		panel.add(tfMobile);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(contentPane, "Database Connected");
				
				int id = Integer.parseInt(tfEmployeeID.getText());
				String name = tfName.getText();
				String mobile = tfMobile.getText();
				
				String query = "insert into employee values(?,?,?)";
				
				PreparedStatement pst;
				try {
					pst = con.prepareStatement(query);
					pst.setInt(1, id);
					pst.setString(2, name);
					pst.setString(3, mobile);
					pst.executeUpdate();
					
					JOptionPane.showMessageDialog(contentPane, "Data Inserted");
					tfEmployeeID.setText("");
					tfName.setText("");
					tfMobile.setText("");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://www.technocrats.store:3306/technocr_Department","technocr","Shrikant@12345");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(contentPane, "Database Connected");
				
				int id = Integer.parseInt(tfEmployeeID.getText());
				String name = tfName.getText();
				String mobile = tfMobile.getText();
				
				String query = "insert into employee values(?,?,?)";
				
				PreparedStatement pst;
				try {
					pst = con.prepareStatement(query);
					pst.setInt(1, id);
					pst.setString(2, name);
					pst.setString(3, mobile);
					pst.executeUpdate();
					
					JOptionPane.showMessageDialog(contentPane, "Data Inserted");
					tfEmployeeID.setText("");
					tfName.setText("");
					tfMobile.setText("");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnRegister.setBounds(247, 207, 89, 23);
		panel.add(btnRegister);
	}
}

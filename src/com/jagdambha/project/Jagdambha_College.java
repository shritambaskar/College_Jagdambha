package com.jagdambha.project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Jagdambha_College {

	private JFrame frame;
	private JTextField tfName;
	private JTextField tfEmail;
	private JTextField tfMobile;
	private JTextField tfAddress;
	private JPasswordField tfPassword;
	private JTable myTable;
	private JScrollPane scrollPane;
	private JPanel updateData;
	private JPanel deleteData;
	private JPanel showData;
	private JPanel addData;
	private JTabbedPane mainTabbedPane;
	private JPanel tabPanel;
	private JPanel mainPanel;
	private ResultSet rs;
	private JTextField tfUpdateName;
	private JTextField tfUpdateEmail;
	private JTextField tfUpdateMobile;
	private JTextField tfUpdateAddress;
	private JPasswordField tfUpdatePassword;
	private JTextField tfUpdateID;
	private JButton btnUpdate;
	private JTextField tfDelete;
	private JButton btnDelete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jagdambha_College window = new Jagdambha_College();
					window.frame.setVisible(true);
					DBConnection.connection();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Jagdambha_College() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(0, 0, 160));
		mainPanel.setBounds(10, 11, 243, 452);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Jagdambha_College.class.getResource("/img/favicon.png")));
		lblNewLabel.setBounds(10, 11, 223, 185);
		mainPanel.add(lblNewLabel);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DBConnection.closeDatabase();
				System.exit(0);
			}
		});
		btnExit.setBounds(10, 418, 223, 23);
		mainPanel.add(btnExit);
		
		tabPanel = new JPanel();
		tabPanel.setBounds(263, 11, 561, 452);
		frame.getContentPane().add(tabPanel);
		tabPanel.setLayout(null);
		
		mainTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		mainTabbedPane.setBounds(0, 0, 561, 452);
		tabPanel.add(mainTabbedPane);
		
		addData = new JPanel();
		mainTabbedPane.addTab("Add Data", null, addData, null);
		addData.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Registration Form");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(0, 26, 556, 14);
		addData.add(lblNewLabel_1);
		
		tfName = new JTextField();
		tfName.setToolTipText("Enter Name");
		tfName.setColumns(10);
		tfName.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Enter Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		tfName.setBounds(49, 46, 438, 35);
		addData.add(tfName);
		
		tfEmail = new JTextField();
		tfEmail.setToolTipText("Enter Name");
		tfEmail.setColumns(10);
		tfEmail.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Enter Email ID", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		tfEmail.setBounds(49, 92, 438, 35);
		addData.add(tfEmail);
		
		tfMobile = new JTextField();
		tfMobile.setToolTipText("Enter Name");
		tfMobile.setColumns(10);
		tfMobile.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Enter Mobile Number", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		tfMobile.setBounds(49, 138, 438, 35);
		addData.add(tfMobile);
		
		tfAddress = new JTextField();
		tfAddress.setToolTipText("Enter Name");
		tfAddress.setColumns(10);
		tfAddress.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Enter Address", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		tfAddress.setBounds(49, 184, 438, 35);
		addData.add(tfAddress);
		
		tfPassword = new JPasswordField();
		tfPassword.setEchoChar('*');
		tfPassword.setBorder(new TitledBorder(null, "Enter Password", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tfPassword.setBounds(49, 232, 438, 42);
		addData.add(tfPassword);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				insertData();
			}
		});
		btnRegister.setBounds(136, 285, 285, 23);
		addData.add(btnRegister);
		
		showData = new JPanel();
		mainTabbedPane.addTab("Show Data", null, showData, null);
		showData.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 536, 328);
		showData.add(scrollPane);
		
		myTable = new JTable();
		scrollPane.setViewportView(myTable);
		
		JButton btnUpload = new JButton("Load Data");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tableLoad();
			}
		});
		btnUpload.setBounds(233, 365, 89, 23);
		showData.add(btnUpload);
		
		updateData = new JPanel();
		mainTabbedPane.addTab("Update Data", null, updateData, null);
		updateData.setLayout(null);
		
		tfUpdateName = new JTextField();
		tfUpdateName.setToolTipText("Enter Name");
		tfUpdateName.setColumns(10);
		tfUpdateName.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Enter Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		tfUpdateName.setBounds(50, 86, 438, 35);
		updateData.add(tfUpdateName);
		
		tfUpdateEmail = new JTextField();
		tfUpdateEmail.setToolTipText("Enter Name");
		tfUpdateEmail.setColumns(10);
		tfUpdateEmail.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Enter Email ID", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		tfUpdateEmail.setBounds(50, 132, 438, 35);
		updateData.add(tfUpdateEmail);
		
		tfUpdateMobile = new JTextField();
		tfUpdateMobile.setToolTipText("Enter Name");
		tfUpdateMobile.setColumns(10);
		tfUpdateMobile.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Enter Mobile Number", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		tfUpdateMobile.setBounds(50, 178, 438, 35);
		updateData.add(tfUpdateMobile);
		
		tfUpdateAddress = new JTextField();
		tfUpdateAddress.setToolTipText("Enter Name");
		tfUpdateAddress.setColumns(10);
		tfUpdateAddress.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Enter Address", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		tfUpdateAddress.setBounds(50, 224, 438, 35);
		updateData.add(tfUpdateAddress);
		
		tfUpdatePassword = new JPasswordField();
		tfUpdatePassword.setEchoChar('*');
		tfUpdatePassword.setBorder(new TitledBorder(null, "Enter Password", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tfUpdatePassword.setBounds(50, 272, 438, 42);
		updateData.add(tfUpdatePassword);
		
		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				updateData();
				
				
			}
		});
		btnUpdate.setBounds(137, 325, 285, 23);
		updateData.add(btnUpdate);
		
		tfUpdateID = new JTextField();
		tfUpdateID.setBorder(new TitledBorder(null, "Search By ID", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tfUpdateID.setBounds(50, 40, 438, 35);
		updateData.add(tfUpdateID);
		tfUpdateID.setColumns(10);
		
		deleteData = new JPanel();
		mainTabbedPane.addTab("Delete Data", null, deleteData, null);
		deleteData.setLayout(null);
		
		tfDelete = new JTextField();
		tfDelete.setBorder(new TitledBorder(null, "Enter Id to Delete Data", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tfDelete.setBounds(122, 57, 251, 43);
		deleteData.add(tfDelete);
		tfDelete.setColumns(10);
		
		btnDelete = new JButton("Delete Data");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				deleteData();
			}
		});
		btnDelete.setBounds(203, 132, 89, 23);
		deleteData.add(btnDelete);
	}
	protected void deleteData() {
		String id;
		
		id = tfDelete.getText();
		try {
			DBConnection.pst = DBConnection.con.prepareStatement("delete from registration where id=?");
			DBConnection.pst.setString(1, id);
			DBConnection.pst.executeUpdate();
			
			JOptionPane.showMessageDialog(frame, "Record Delete");
			reset();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

	protected void updateData() {
		
		String sid,name,email,mobile,address,password;
		sid = tfUpdateID.getText();
		
		name = tfUpdateName.getText().toString().trim();
		email = tfUpdateEmail.getText().toString().trim();
		mobile = tfUpdateMobile.getText().toString().trim();
		address = tfUpdateAddress.getText().toString().trim();
		password = tfUpdatePassword.getText().toString().trim();
		
		try {
			  DBConnection.pst=DBConnection.con.prepareStatement("update registration set name=?,email=?,mobile=?,address=?,password=? where id=?");
			  DBConnection.pst.setString(1, name);	
			  DBConnection.pst.setString(2, email);
			  DBConnection.pst.setString(3, mobile);
			  DBConnection.pst.setString(4, address);
			  DBConnection.pst.setString(5, password);
			  
			  DBConnection.pst.setString(6, sid);
			  DBConnection.pst.executeUpdate();
			  JOptionPane.showMessageDialog(frame, "Data Update in Database Sucessfully");
			  reset();
			  
		}catch(Exception ae) {
			JOptionPane.showMessageDialog(frame, "Data Update in Database faild");
			
		}
		
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
			
			DBConnection.pst = DBConnection.con.prepareStatement("insert into registration(name,email,mobile,address,password) values(?,?,?,?,?)");
			DBConnection.pst.setString(1, name);
			DBConnection.pst.setString(2, email);
			DBConnection.pst.setString(3, mobile);
			DBConnection.pst.setString(4, address);
			DBConnection.pst.setString(5, password);
			
			DBConnection.pst.execute();
			
			reset();
			
			JOptionPane.showMessageDialog(frame, "Registred Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void reset() {
		tfName.setText("");
		tfEmail.setText("");
		tfMobile.setText("");
		tfAddress.setText("");
		tfPassword.setText("");
		
	}
	
	private void tableLoad() {
		try { 
			DBConnection.pst =DBConnection.con.prepareStatement("select * from registration");
			rs =DBConnection.pst.executeQuery();
			myTable.setModel(DbUtils.resultSetToTableModel(rs));
			
		}catch(Exception e){
		e.printStackTrace();
		}
		
		
	}
}

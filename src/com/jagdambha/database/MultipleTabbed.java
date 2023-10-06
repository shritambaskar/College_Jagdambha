package com.jagdambha.database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Frame;

public class MultipleTabbed {

	private JFrame frmJagdambhaCollegeOf;
	private JPanel tabbedPanel;
	private JPanel mainPanel;
	private JTable table;
	private JPanel panel;
	private JPanel panel_3;
	private JPanel panel_1;
	private JPanel panel_2;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultipleTabbed window = new MultipleTabbed();
					window.frmJagdambhaCollegeOf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MultipleTabbed() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJagdambhaCollegeOf = new JFrame();
		frmJagdambhaCollegeOf.setTitle("Jagdambha College Of Engg.");
		frmJagdambhaCollegeOf.setResizable(false);
		frmJagdambhaCollegeOf.setBounds(100, 100, 889, 560);
		frmJagdambhaCollegeOf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJagdambhaCollegeOf.getContentPane().setLayout(null);
		frmJagdambhaCollegeOf.setLocationRelativeTo(null);
		
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(0, 0, 0));
		mainPanel.setBounds(10, 11, 313, 499);
		frmJagdambhaCollegeOf.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("l");
		lblNewLabel.setIcon(new ImageIcon(MultipleTabbed.class.getResource("/images/favicon.png")));
		lblNewLabel.setBounds(62, 11, 186, 203);
		mainPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Jagdambha College of Enggineering");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Sitka Small", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 235, 293, 60);
		mainPanel.add(lblNewLabel_1);
		
		tabbedPanel = new JPanel();
		tabbedPanel.setBounds(324, 11, 549, 499);
		frmJagdambhaCollegeOf.getContentPane().add(tabbedPanel);
		tabbedPanel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 549, 499);
		tabbedPanel.add(tabbedPane);
		
		panel = new JPanel();
		panel.setVisible(false);
		panel.setBackground(new Color(128, 0, 255));
		tabbedPane.addTab("New tab", null, panel, null);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 0, 0));
		tabbedPane.addTab("New tab", null, panel_3, null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 0));
		tabbedPane.addTab("New tab", null, panel_1, null);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 0, 128));
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 524, 449);
		panel_2.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}

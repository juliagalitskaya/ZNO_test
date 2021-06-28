package zno;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;


public class test {

	private static Vector<v> v = new Vector<v>();
	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public test() throws IOException {
		initialize();
	}

	
	
	private void initialize() throws IOException {
		
		frame = new JFrame();
		frame.setBackground(UIManager.getColor("Button.background"));
		frame.getContentPane().setBackground(UIManager.getColor("InternalFrame.inactiveTitleBackground"));
		frame.setBounds(200, 25, 1216, 925);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Зовнішнє Незалежне Оцінювання");
		lblNewLabel_2.setBounds(430, 12, 404, 26);
		frame.getContentPane().add(lblNewLabel_2);
		JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 721, 1216, 180);
        lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 24));
        lblNewLabel_2.setForeground(new Color(102, 51, 153));
        
		JLabel image = new JLabel(new ImageIcon("/Users/mac/Downloads/imgonline-com-ua-Resize-QefyWtGt74VIS.png"));
		frame.getContentPane().add(image);
		image.setBounds(370, 4, 40, 40);
		
		JLabel image2 = new JLabel(new ImageIcon("/Users/mac/Downloads/imgonline-com-ua-Resize-QefyWtGt74VIS.png"));
		frame.getContentPane().add(image2);
		image2.setBounds(850, 4, 40, 40);
		
		JLabel l1 = new JLabel("№4. Знайдіть добуток коренів рівняння:");
		l1.setBounds(18, 282, 262, 23);
		frame.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("№7. 40+2=...");
		l2.setBounds(813, 382, 117, 16);
		frame.getContentPane().add(l2);
		
        JLabel l3 = new JLabel("№2.  Знайдіть найбільше значення ");
        l3.setBounds(430, 62, 227, 16);
        frame.getContentPane().add(l3);
        
        JLabel lblNewLabel = new JLabel("за 4 секунди. Яку максимальну кількість");
		lblNewLabel.setBounds(18, 80, 262, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("копій можна одержати за 1 хв ?");
		lblNewLabel_1.setBounds(18, 95, 262, 16);
		frame.getContentPane().add(lblNewLabel_1);

        JLabel l4 = new JLabel("№2.  Знайдіть найбільше значення ");
        l4.setBounds(430, 62, 227, 16);
        frame.getContentPane().add(l4);
        
        JLabel lblNewLabel_3 = new JLabel("функції y=-5 log(1/3)*x на відрізку");
        lblNewLabel_3.setBounds(430, 78, 237, 16);
        frame.getContentPane().add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("[1/3;3].");
        lblNewLabel_4.setBounds(430, 95, 61, 16);
        frame.getContentPane().add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("№3. Знайдіть площу бокової поверхності");
        lblNewLabel_5.setBounds(813, 62, 284, 16);
        frame.getContentPane().add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("конуса, твірна якого 17см., висота - 15см.");
        lblNewLabel_6.setBounds(813, 78, 275, 16);
        frame.getContentPane().add(lblNewLabel_6);
        
        JLabel lblNewLabel_7 = new JLabel("Знайдіть S/(PI).");
        lblNewLabel_7.setBounds(813, 95, 209, 16);
        frame.getContentPane().add(lblNewLabel_7);
        
        JLabel lblNewLabel_8 = new JLabel("№6. 3*3=...");
        lblNewLabel_8.setBounds(813, 285, 96, 16);
        frame.getContentPane().add(lblNewLabel_8);
        
		JLabel l1_1 = new JLabel("№1. Копіювальна машина робить 3 копії");
		l1_1.setBounds(18, 62, 262, 23);
		frame.getContentPane().add(l1_1);
		
		JLabel lblx = new JLabel("4/(x-1)-4/(x+1)=1");
		lblx.setBounds(18, 302, 141, 23);
		frame.getContentPane().add(lblx);
		
		
		JLabel lblx_1 = new JLabel("y = x cos x");
		lblx_1.setBounds(430, 302, 141, 23);
		frame.getContentPane().add(lblx_1);
		
		JLabel l1_2 = new JLabel("№5. Знайдіть похідну функції:");
		l1_2.setBounds(430, 282, 262, 23);
		frame.getContentPane().add(l1_2);
		
		
		ButtonGroup g = new ButtonGroup();
		ButtonGroup g2 = new ButtonGroup();
		ButtonGroup g3 = new ButtonGroup();
		ButtonGroup g4 = new ButtonGroup();
		ButtonGroup g5 = new ButtonGroup();
		
		JRadioButton r1 = new JRadioButton("75");
		r1.setBounds(18, 117, 48, 23);
		frame.getContentPane().add(r1);
		g.add(r1);
		
		JRadioButton r2 = new JRadioButton("80");
		r2.setBounds(18, 141, 48, 23);
		frame.getContentPane().add(r2);
		g.add(r2);
		
		JRadioButton r3 = new JRadioButton("60");
		r3.setBounds(18, 165, 48, 23);
		frame.getContentPane().add(r3);
		g.add(r3);
		
		JRadioButton r4 = new JRadioButton("45");
		r4.setBounds(18, 189, 48, 23);
		frame.getContentPane().add(r4);
		g.add(r4);
		
		JRadioButton r5 = new JRadioButton("120");
		r5.setBounds(18, 213, 61, 23);
		frame.getContentPane().add(r5);
		g.add(r5);
		
        JRadioButton r21 = new JRadioButton("1/3");
        r21.setBounds(440, 117, 61, 23);
        frame.getContentPane().add(r21);
		g2.add(r21);
        
        JRadioButton r22 = new JRadioButton("-5");
        r22.setBounds(440, 141, 53, 23);
        frame.getContentPane().add(r22);
		g2.add(r22);
        
        JRadioButton r23 = new JRadioButton("1");
        r23.setBounds(440, 165, 48, 23);
        frame.getContentPane().add(r23);
		g2.add(r23);
        
        JRadioButton r24 = new JRadioButton("5");
        r24.setBounds(440, 189, 40, 23);
        frame.getContentPane().add(r24);
		g2.add(r24);
        
        JRadioButton r25 = new JRadioButton("5/3");
        r25.setBounds(440, 213, 61, 23);
        frame.getContentPane().add(r25);
		g2.add(r25);
        
        JRadioButton r31 = new JRadioButton("1088");
        r31.setBounds(813, 117, 64, 23);
        frame.getContentPane().add(r31);
		g3.add(r31);
        
        JRadioButton r32 = new JRadioButton("2312");
        r32.setBounds(813, 141, 64, 23);
        frame.getContentPane().add(r32);
		g3.add(r32);
        
        JRadioButton r33 = new JRadioButton("136");
        r33.setBounds(813, 165, 61, 23);
        frame.getContentPane().add(r33);
		g3.add(r33);
        
        JRadioButton r34 = new JRadioButton("17");
        r34.setBounds(813, 189, 48, 23);
        frame.getContentPane().add(r34);
		g3.add(r34);
		
        JRadioButton r35 = new JRadioButton("5");
        r35.setBounds(813, 213, 48, 23);
        frame.getContentPane().add(r35);
		g3.add(r35);
		
		JRadioButton r41 = new JRadioButton("1");
		r41.setBounds(18, 328, 48, 23);
		frame.getContentPane().add(r41);
		g4.add(r41);
		
		JRadioButton r42 = new JRadioButton("-4");
		r42.setBounds(18, 352, 61, 23);
		frame.getContentPane().add(r42);
		g4.add(r42);
		
		JRadioButton r43 = new JRadioButton("-9");
		r43.setBounds(18, 376, 53, 23);
		frame.getContentPane().add(r43);
		g4.add(r43);
		
		JRadioButton r44 = new JRadioButton("0");
		r44.setBounds(18, 400, 48, 23);
		frame.getContentPane().add(r44);
		g4.add(r44);
		
		JRadioButton r45 = new JRadioButton("-1");
		r45.setBounds(18, 424, 48, 23);
		frame.getContentPane().add(r45);
		g4.add(r45);
		
		JRadioButton r51 = new JRadioButton("cos x - x sin x");
		r51.setBounds(430, 328, 141, 23);
		frame.getContentPane().add(r51);
		g5.add(r51);
		
		JRadioButton r52 = new JRadioButton("cos x + x sin x");
		r52.setBounds(430, 352, 141, 23);
		frame.getContentPane().add(r52);
		g5.add(r52);
		
		JRadioButton r53 = new JRadioButton("cos x");
		r53.setBounds(430, 376, 98, 23);
		frame.getContentPane().add(r53);
		g5.add(r53);
		
		JRadioButton r54 = new JRadioButton("x - sin x");
		r54.setBounds(430, 400, 98, 23);
		frame.getContentPane().add(r54);
		g5.add(r54);
		
		JRadioButton r55 = new JRadioButton("-1");
		r55.setBounds(430, 424, 98, 23);
		frame.getContentPane().add(r55);
		g5.add(r55);
		
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(813, 410, 130, 26);
		frame.getContentPane().add(textField);

		
		 textField_1 = new JTextField();
		 textField_1.setBackground(Color.WHITE);
	        textField_1.setBounds(813, 317, 130, 26);
	        frame.getContentPane().add(textField_1);
	        textField_1.setColumns(10);
		
		
			JPanel panel1_4 = new JPanel();
			panel1_4.setVisible(false);
			panel1_4.setBackground(Color.GREEN);
			panel1_4.setBounds(18, 189, 98, 23);
			frame.getContentPane().add(panel1_4);
	        
	        JPanel panel2_4 = new JPanel();
	        panel2_4.setVisible(false);
	        panel2_4.setBackground(Color.GREEN);
	        panel2_4.setBounds(440, 189, 98, 23);
	        frame.getContentPane().add(panel2_4);
	        
	        JPanel panel3_3 = new JPanel();
	        panel3_3.setVisible(false);
	        panel3_3.setBackground(Color.GREEN);
	        panel3_3.setBounds(813, 165, 98, 23);
	        frame.getContentPane().add(panel3_3);
	        
			JPanel panel_5 = new JPanel();
			panel_5.setBackground(UIManager.getColor("Button.highlight"));
			panel_5.setBounds(0, -12, 1251, 63);
			frame.getContentPane().add(panel_5);
			
			JPanel panel1_1 = new JPanel();
			panel1_1.setVisible(false);
			panel1_1.setBackground(Color.RED);
			panel1_1.setBounds(18, 117, 98, 23);
			frame.getContentPane().add(panel1_1);
			
			JPanel panel1_2 = new JPanel();
			panel1_2.setVisible(false);
			panel1_2.setBackground(Color.RED);
			panel1_2.setBounds(18, 141, 98, 23);
			frame.getContentPane().add(panel1_2);
			
			JPanel panel1_3 = new JPanel();
			panel1_3.setVisible(false);
			panel1_3.setBackground(Color.RED);
			panel1_3.setBounds(18, 165, 98, 23);
			frame.getContentPane().add(panel1_3);
			
			JPanel panel1_5 = new JPanel();
			panel1_5.setVisible(false);
			panel1_5.setBackground(Color.RED);
			panel1_5.setBounds(18, 213, 98, 23);
			frame.getContentPane().add(panel1_5);
			
			JPanel panel2_1 = new JPanel();
			panel2_1.setVisible(false);
			panel2_1.setBackground(Color.RED);
			panel2_1.setBounds(440, 117, 98, 23);
			frame.getContentPane().add(panel2_1);
			
			JPanel panel2_2 = new JPanel();
			panel2_2.setVisible(false);
			panel2_2.setBackground(Color.RED);
			panel2_2.setBounds(440, 141, 98, 23);
			frame.getContentPane().add(panel2_2);
			
			JPanel panel2_3 = new JPanel();
			panel2_3.setVisible(false);
			panel2_3.setBackground(Color.RED);
			panel2_3.setBounds(440, 165, 98, 23);
			frame.getContentPane().add(panel2_3);
			
			JPanel panel2_5 = new JPanel();
			panel2_5.setVisible(false);
			panel2_5.setBackground(Color.RED);
			panel2_5.setBounds(440, 213, 98, 23);
			frame.getContentPane().add(panel2_5);
			
			JPanel panel3_1 = new JPanel();
			panel3_1.setVisible(false);
			panel3_1.setBackground(Color.RED);
			panel3_1.setBounds(813, 117, 98, 23);
			frame.getContentPane().add(panel3_1);
			
			JPanel panel3_2 = new JPanel();
			panel3_2.setVisible(false);
			panel3_2.setBackground(Color.RED);
			panel3_2.setBounds(813, 141, 98, 23);
			frame.getContentPane().add(panel3_2);
			
			JPanel panel3_5 = new JPanel();
			panel3_5.setVisible(false);
			panel3_5.setBackground(Color.RED);
			panel3_5.setBounds(813, 213, 98, 23);
			frame.getContentPane().add(panel3_5);
			
			JPanel panel3_4 = new JPanel();
			panel3_4.setVisible(false);
			panel3_4.setBackground(Color.RED);
			panel3_4.setBounds(813, 189, 98, 23);
			frame.getContentPane().add(panel3_4);
			
			JPanel panel_4 = new JPanel();
	        panel_4.setVisible(false);
	        panel_4.setBackground(Color.LIGHT_GRAY);
	        panel_4.setBounds(813, 317, 130, 26);
	        frame.getContentPane().add(panel_4);
		    
		    JPanel panel_1 = new JPanel();
		    panel_1.setVisible(false);
			panel_1.setBackground(Color.LIGHT_GRAY);
			panel_1.setBounds(813, 410, 130, 26);
			frame.getContentPane().add(panel_1);
			
			JPanel panel4_4 = new JPanel();
			panel4_4.setVisible(false);
			panel4_4.setBackground(Color.GREEN);
			panel4_4.setBounds(18, 400, 98, 23);
			frame.getContentPane().add(panel4_4);
			
			JPanel panel5_1 = new JPanel();
			panel5_1.setVisible(false);
			panel5_1.setBackground(Color.GREEN);
			panel5_1.setBounds(430, 328, 141, 23);
			frame.getContentPane().add(panel5_1);
			
			JPanel panel4_1 = new JPanel();
			panel4_1.setVisible(false);
			panel4_1.setBackground(Color.RED);
			panel4_1.setBounds(18, 328, 98, 23);
			frame.getContentPane().add(panel4_1);
			
			JPanel panel4_2 = new JPanel();
			panel4_2.setVisible(false);
			panel4_2.setBackground(Color.RED);
			panel4_2.setBounds(18, 352, 98, 23);
			frame.getContentPane().add(panel4_2);
			
			JPanel panel4_3 = new JPanel();
			panel4_3.setVisible(false);
			panel4_3.setBackground(Color.RED);
			panel4_3.setBounds(18, 376, 98, 23);
			frame.getContentPane().add(panel4_3);
			
			JPanel panel4_5 = new JPanel();
			panel4_5.setVisible(false);
			panel4_5.setBackground(Color.RED);
			panel4_5.setBounds(18, 424, 98, 23);
			frame.getContentPane().add(panel4_5);
			
			JPanel panel5_2 = new JPanel();
			panel5_2.setVisible(false);
			panel5_2.setBackground(Color.RED);
			panel5_2.setBounds(430, 352, 141, 23);
			frame.getContentPane().add(panel5_2);
			
			JPanel panel5_3 = new JPanel();
			panel5_3.setVisible(false);
			panel5_3.setBackground(Color.RED);
			panel5_3.setBounds(430, 376, 98, 23);
			frame.getContentPane().add(panel5_3);
			
			JPanel panel5_4 = new JPanel();
			panel5_4.setVisible(false);
			panel5_4.setBackground(Color.RED);
			panel5_4.setBounds(430, 400, 98, 23);
			frame.getContentPane().add(panel5_4);
			
			JPanel panel5_5 = new JPanel();
			panel5_5.setVisible(false);
			panel5_5.setBackground(Color.RED);
			panel5_5.setBounds(430, 424, 98, 23);
			frame.getContentPane().add(panel5_5);
			
	        
		
		JButton b3 = new JButton("check");
		b3.setForeground(UIManager.getColor("Button.darkShadow"));
		b3.setBackground(UIManager.getColor("Button.background"));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(r1.isSelected()) {
					panel1_1.setVisible(true);
				}
				else {
					panel1_1.setVisible(false);
				}
				
				if(r2.isSelected()) {
					panel1_2.setVisible(true);
				}
				else {
					panel1_2.setVisible(false);
				}
				
				if(r3.isSelected()) {
					panel1_3.setVisible(true);
				}
				else {
					panel1_3.setVisible(false);
				}
				
				if(r4.isSelected()) {
					panel1_4.setVisible(true);
				}
				else {
					panel1_4.setVisible(false);
				}
				
				if(r5.isSelected()) {
					panel1_5.setVisible(true);
				}
				else {
					panel1_5.setVisible(false);
				}
				
				
				if(r21.isSelected()) {
					panel2_1.setVisible(true);
				}
				else {
					panel2_1.setVisible(false);
				}
				
				if(r22.isSelected()) {
					panel2_2.setVisible(true);
				}
				else {
					panel2_2.setVisible(false);
				}
				
				if(r23.isSelected()) {
					panel2_3.setVisible(true);
				}
				else {
					panel2_3.setVisible(false);
				}
				
				if(r24.isSelected()) {
					panel2_4.setVisible(true);
				}
				else {
					panel2_4.setVisible(false);
				}
				
				if(r25.isSelected()) {
					panel2_5.setVisible(true);
				}
				else {
					panel2_5.setVisible(false);
				}
				
				
				if(r31.isSelected()) {
					panel3_1.setVisible(true);
				}
				else {
					panel3_1.setVisible(false);
				}
				
				if(r32.isSelected()) {
					panel3_2.setVisible(true);
				}
				else {
					panel3_2.setVisible(false);
				}
				
				if(r33.isSelected()) {
					panel3_3.setVisible(true);
				}
				else {
					panel3_3.setVisible(false);
				}
				
				if(r34.isSelected()) {
					panel3_4.setVisible(true);
				}
				else {
					panel3_4.setVisible(false);
				}
				
				if(r35.isSelected()) {
					panel3_5.setVisible(true);
				}
				else {
					panel3_5.setVisible(false);
				}
				
				
				if(r41.isSelected()) {
					panel4_1.setVisible(true);
				}
				else {
					panel4_1.setVisible(false);
				}
				
				if(r42.isSelected()) {
					panel4_2.setVisible(true);
				}
				else {
					panel4_2.setVisible(false);
				}
				
				if(r43.isSelected()) {
					panel4_3.setVisible(true);
				}
				else {
					panel4_3.setVisible(false);
				}
				
				if(r44.isSelected()) {
					panel4_4.setVisible(true);
				}
				else {
					panel4_4.setVisible(false);
				}
				
				if(r45.isSelected()) {
					panel4_5.setVisible(true);
				}
				else {
					panel4_5.setVisible(false);
				}
				
				if(r51.isSelected()) {
					panel5_1.setVisible(true);
				}
				else {
					panel5_1.setVisible(false);
				}
				
				if(r52.isSelected()) {
					panel5_2.setVisible(true);
				}
				else {
					panel5_2.setVisible(false);
				}
				
				if(r53.isSelected()) {
					panel5_3.setVisible(true);
				}
				else {
					panel5_3.setVisible(false);
				}
				
				if(r54.isSelected()) {
					panel5_4.setVisible(true);
				}
				else {
					panel5_4.setVisible(false);
				}
				
				if(r55.isSelected()) {
					panel5_5.setVisible(true);
				}
				else {
					panel5_5.setVisible(false);
				}
				
				
				if(textField.getText().equals("42")) {
					panel_1.setVisible(true);
					 panel_1.setBackground(Color.GREEN);
	                } else {
	                	panel_1.setVisible(true);
	                	panel_1.setBackground(Color.RED);
	                }
				
				if(textField_1.getText().equals("9")) {
					panel_4.setVisible(true);
					 panel_4.setBackground(Color.GREEN);
	                } else {
	                	panel_4.setVisible(true);
	                	panel_4.setBackground(Color.RED);
	                }
		
				
				v.add(new v((r4.isSelected() ? "+" : "-"),  r24.isSelected() ? "+":"-", r33.isSelected() ? "+":"-", r44.isSelected() ? "+":"-", r51.isSelected() ? "+":"-", textField_1.getText().equals("9") ? "+" : "-", textField.getText().equals("42") ? "+" : "-"));
		
		        for(v m: v)
		            
		        JOptionPane.showMessageDialog(null, v, "Результаты", JOptionPane.PLAIN_MESSAGE);
		        
			}
		});
		b3.setBounds(18, 680, 117, 29);
		frame.getContentPane().add(b3);
		

        
	}
}

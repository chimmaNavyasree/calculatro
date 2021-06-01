import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class calculator {

	private JFrame frame;
	private JTextField textField;

	double first;
	double second;
	double result;
	String operation;
	String answer;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setForeground(new Color(255, 0, 255));
		frame.setBounds(100, 100, 247, 348);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.MAGENTA);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(10, 11, 211, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setForeground(Color.MAGENTA);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn7.setBounds(10, 109, 41, 39);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setForeground(Color.MAGENTA);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setBounds(10, 159, 41, 39);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setForeground(Color.MAGENTA);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setBounds(10, 209, 41, 39);
		frame.getContentPane().add(btn1);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setForeground(Color.MAGENTA);
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnDot.setBackground(Color.LIGHT_GRAY);
		btnDot.setBounds(10, 259, 64, 39);
		frame.getContentPane().add(btnDot);
		
		JButton btnBackspc = new JButton("\uF0E7");
		btnBackspc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspc.setForeground(Color.MAGENTA);
		btnBackspc.setFont(new Font("Wingdings", Font.BOLD, 6));
		btnBackspc.setBackground(Color.LIGHT_GRAY);
		btnBackspc.setBounds(10, 61, 41, 37);
		frame.getContentPane().add(btnBackspc);
		
		JButton btnClr = new JButton("C");
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClr.setForeground(Color.MAGENTA);
		btnClr.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClr.setBackground(Color.LIGHT_GRAY);
		btnClr.setBounds(61, 61, 41, 39);
		frame.getContentPane().add(btnClr);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setForeground(Color.MAGENTA);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setBounds(61, 109, 41, 39);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setForeground(Color.MAGENTA);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setBounds(61, 159, 41, 39);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
				}
		});
		btn2.setForeground(Color.MAGENTA);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setBounds(61, 209, 41, 39);
		frame.getContentPane().add(btn2);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation =="+") {
					result=first+second;
					answer =String.format("%.2f",result);
					textField.setText(answer);
				}

				else if(operation =="-") {
					result=first-second;
					answer =String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation =="*") {
					result=first*second;
					answer =String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation =="/") {
					result=first/second;
					answer =String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation =="%") {
					result=first%second;
					answer =String.format("%.2f",result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setForeground(Color.MAGENTA);
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEqual.setBackground(Color.LIGHT_GRAY);
		btnEqual.setBounds(84, 259, 69, 39);
		frame.getContentPane().add(btnEqual);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setForeground(Color.MAGENTA);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setBounds(112, 209, 41, 39);
		frame.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setForeground(Color.MAGENTA);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.setBounds(112, 159, 41, 39);
		frame.getContentPane().add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setForeground(Color.MAGENTA);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setBounds(112, 109, 41, 39);
		frame.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setForeground(Color.MAGENTA);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.setBounds(112, 60, 41, 39);
		frame.getContentPane().add(btn0);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd.setForeground(Color.MAGENTA);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnAdd.setBackground(Color.LIGHT_GRAY);
		btnAdd.setBounds(163, 61, 58, 39);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setForeground(Color.MAGENTA);
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBackground(Color.LIGHT_GRAY);
		btnSub.setBounds(163, 109, 58, 39);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setForeground(Color.MAGENTA);
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMul.setBackground(Color.LIGHT_GRAY);
		btnMul.setBounds(163, 159, 58, 39);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDiv.setForeground(Color.MAGENTA);
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDiv.setBackground(Color.LIGHT_GRAY);
		btnDiv.setBounds(163, 209, 58, 39);
		frame.getContentPane().add(btnDiv);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnMod.setForeground(Color.MAGENTA);
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMod.setBackground(Color.LIGHT_GRAY);
		btnMod.setBounds(163, 259, 58, 39);
		frame.getContentPane().add(btnMod);
	}
}

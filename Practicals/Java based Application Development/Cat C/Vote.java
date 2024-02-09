import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Vote extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vote frame = new Vote();
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
	public Vote() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 911, 531);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 234, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Name");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel.setBounds(69, 73, 94, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Age");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(69, 125, 94, 14);
		contentPane.add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(186, 71, 197, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(186, 124, 197, 20);
		contentPane.add(t2);
		t2.setColumns(10);
		
		JButton b1 = new JButton("SUBMIT");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    int a=Integer.parseInt(t2.getText());
                    if(a>=18){
                        lblmsg.setText(t1.getText()+"You are eligible for voting");
                    }
                    else{
                        lblmsg.setText(t1.getText()+"You are not eligible for voting");
                    }
			}
		});
		b1.setFont(new Font("Arial", Font.PLAIN, 15));
		b1.setBackground(new Color(255, 255, 255));
		b1.setBounds(74, 204, 110, 23);
		contentPane.add(b1);
		
		JButton b2 = new JButton("Reset");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						t1.setText("");
				        t2.setText("");
								}
				});
				
		b2.setBackground(new Color(255, 255, 255));
		b2.setFont(new Font("Arial", Font.PLAIN, 15));
		b2.setBounds(207, 204, 89, 23);
		contentPane.add(b2);
	}
}

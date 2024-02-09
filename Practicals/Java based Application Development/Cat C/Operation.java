
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Operation extends JFrame {

	private JPanel contentPane;
	private JTextField l1;
	private JTextField l2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	double n1,n2;
	void input() {
		n1=Double.parseDouble(l1.getText());
		n2=Double.parseDouble(l2.getText());
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Operation frame = new Operation();
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
	public Operation() {
		setTitle("2nd _ Cal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		l1 = new JTextField();
		l1.setBounds(186, 30, 132, 20);
		contentPane.add(l1);
		l1.setColumns(10);
		
		l2 = new JTextField();
		l2.setBounds(186, 84, 132, 20);
		contentPane.add(l2);
		l2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter 1st no.");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(32, 30, 114, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter 2nd no.");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(32, 84, 114, 17);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton r2 = new JRadioButton("Sub (-)");
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				JOptionPane.showMessageDialog(r2,"Subtraction is "+(n1-n2));
			}
		});
		buttonGroup.add(r2);
		r2.setBounds(209, 142, 109, 23);
		contentPane.add(r2);
		
		JRadioButton r4 = new JRadioButton("Div (-)");
		r4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				JOptionPane.showMessageDialog(r4,"Division is "+(n1/n2));
			}
		});
		buttonGroup.add(r4);
		r4.setBounds(209, 188, 109, 23);
		contentPane.add(r4);
		
		JRadioButton r1 = new JRadioButton("Add (+)");
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				JOptionPane.showMessageDialog(r1,"Addition is "+(n1+n2));
			}
		});
		buttonGroup.add(r1);
		r1.setBounds(32, 142, 109, 23);
		contentPane.add(r1);
		
		JRadioButton r3 = new JRadioButton("Mul (*)");
		r3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				JOptionPane.showMessageDialog(r3,"Multiplication is "+(n1*n2));
			}
		});
		buttonGroup.add(r3);
		r3.setBounds(32, 188, 109, 23);
		contentPane.add(r3);
	}
}

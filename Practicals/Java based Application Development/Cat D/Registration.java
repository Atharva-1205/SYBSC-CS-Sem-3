import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Registration");
		lblNewLabel.setBounds(268, 11, 117, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setBounds(63, 53, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Address:");
		lblNewLabel_1_1.setBounds(63, 86, 61, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Age:");
		lblNewLabel_1_3.setBounds(63, 158, 46, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Mobile No:");
		lblNewLabel_1_4.setBounds(63, 183, 61, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("User Name:");
		lblNewLabel_1_5.setBounds(63, 217, 74, 14);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Password:");
		lblNewLabel_1_6.setBounds(63, 245, 61, 14);
		contentPane.add(lblNewLabel_1_6);
		
		textField = new JTextField();
		textField.setBounds(166, 50, 139, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(166, 81, 139, 63);
		contentPane.add(textArea);
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 155, 139, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(166, 183, 139, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(166, 214, 139, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(166, 241, 139, 23);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver"); //Loads Driver
					Connection con = DriverManager.getConnection("com.mysql.cj.jdbc.Driver:mysql://localhost:3306/Registration","root","1234");
					String query = "insert into users value(?,?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(query);
					ps.setString(1, textField.getText());
					ps.setString(2, textField_1.getText());
					ps.setString(3, textField_2.getText());
					ps.setString(4, textField_3.getText());
					ps.setString(5, passwordField.getText());
					ps.executeUpdate(); //Important
					JOptionPane.showMessageDialog(btnNewButton, "Registration Done..");
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
			}
		});
		btnNewButton.setBounds(88, 284, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				passwordField.setText("");
			}
		});
		btnNewButton_1.setBounds(216, 284, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}

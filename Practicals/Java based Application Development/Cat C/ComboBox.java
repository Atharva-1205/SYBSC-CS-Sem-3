import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ComboBox extends JFrame {

	private JPanel contentPane;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBox frame = new ComboBox();
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
	
	
	public ComboBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox jc1 = new JComboBox();
		jc1.setBounds(198, 76, 226, 100);
		contentPane.add(jc1);
		
		t1 = new JTextField();
		t1.setText("Add");
		t1.setBounds(143, 45, 86, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JList list = new JList();
		list.setBounds(29, 76, 1, 1);
		contentPane.add(list);
		
		JButton b1 = new JButton(" Add Anything");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jc1.addItem(t1.getText());
				t1.setText("");
			}
		});
		b1.setBounds(0, 92, 89, 23);
		contentPane.add(b1);
	}
}

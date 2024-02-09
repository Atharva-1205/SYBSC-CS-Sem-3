import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pizza extends JFrame {

	private JPanel contentPane;

	JTextField t1;
	JTextArea t2;
	JTextField t3;
	JComboBox t4;
	JList t5;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizza frame = new Pizza();
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
	public Pizza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("User Name : ");
		l1.setBounds(10, 11, 141, 26);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Address : ");
		l2.setBounds(8, 48, 116, 26);
		contentPane.add(l2);
		
		JLabel l3 = new JLabel("Mobile No. : ");
		l3.setBounds(10, 102, 100, 34);
		contentPane.add(l3);
		
		JLabel l4 = new JLabel("Base :");
		l4.setBounds(10, 144, 60, 26);
		contentPane.add(l4);
		
		JLabel l5 = new JLabel("Topping : ");
		l5.setBounds(10, 181, 62, 26);
		contentPane.add(l5);
		
		t1 = new JTextField();
		t1.setBounds(80, 14, 233, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextArea();
		t2.setBounds(80, 49, 261, 52);
		contentPane.add(t2);
		
		t3 = new JTextField();
		t3.setBounds(81, 109, 260, 20);
		contentPane.add(t3);
		t3.setColumns(10);
		
		t4 = new JComboBox();
		t4.setModel(new DefaultComboBoxModel(new String[] {"Select your Pizza Base", "Basic ", "Thick & Chewy", "Thin & Crispy", "Chicago Deep Dish"}));
		t4.setBounds(80, 140, 261, 20);
		contentPane.add(t4);
		
	 t5 = new JList();
		t5.setModel(new AbstractListModel() {
			String[] values = new String[] {"Select your Pizza Toppings", "Pepperoni", "Sausage", "Black Olives", "Mushrooms"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		t5.setBounds(82, 163, 261, 64);
		contentPane.add(t5);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
		        t2.setText("");
				t3.setText("");
				t4.setSelectedIndex(0);
				t5.setSelectedIndex(0);		}
		});
		btnNewButton.setBounds(10, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		
		JButton b3 = new JButton("Order");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg=t1.getText()+"Your details are: \n";
				msg += "Address: "+t2.getText()+"\n Mobile: "+t2.getText();
				msg += "\n pizza Base: "+t4.getSelectedItem();
				String str=" ";
				Object obj[]=t5.getSelectedValues();
				for(int i=0;i<obj.length;i++)
					str+=obj[i]+",";
				msg+="\n Toppings: "+str+"\n Your Order will reach soon......";
				JOptionPane.showMessageDialog(b3,msg);
			}
		});
		b3.setBounds(124, 227, 89, 23);
		contentPane.add(b3);
	}
}

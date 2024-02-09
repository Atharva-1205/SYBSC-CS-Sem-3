import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class IceCream extends JFrame {

	private JPanel contentPane;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IceCream frame = new IceCream();
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
	public IceCream() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				int i=list.getSelectedIndex();
				if(i==1) {
					t1.setText("Price of "+list.getSelectedValue()+" is 20");
					
				}
				
				else if(i==2) {
					t1.setText("Price of "+list.getSelectedValue()+" is 30");
					
				}
				
				else if(i==3 ) {
					t1.setText("Price of "+list.getSelectedValue()+" is 30");
				}
				
				else if(i==4) {
					t1.setText("Price of "+list.getSelectedValue()+" is 40");
				}
			}
		});
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Select your flavour", "Vanilla", "Strawberry", "Chocolate", "Mango"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(34, 11, 214, 142);
		contentPane.add(list);
		
		t1 = new JTextField();
		t1.setEditable(false);
		t1.setBounds(34, 187, 254, 29);
		contentPane.add(t1);
		t1.setColumns(10);
	}
}

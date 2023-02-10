import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class LongExam2 {

	public static void main(String[] args) {

		String languages[] = { "C++", "C#", "Java", "Python" };
		JMenu menu, menu1, menu2;
		JMenuItem i1, i2, i3;
		JTextField textfield1;
		JLabel label1, label2, label3;

		final JLabel label = new JLabel();
		final JComboBox cb = new JComboBox(languages);

		JButton button = new JButton("Submit");
		JRadioButton r1 = new JRadioButton(" Male");
		JRadioButton r2 = new JRadioButton(" Female");
		JFrame f = new JFrame("Long Exam 2");
		JMenuBar mb = new JMenuBar();

		menu = new JMenu("File");
		menu1 = new JMenu("Edit");
		menu2 = new JMenu("Delete");
		textfield1 = new JTextField();
		i1 = new JMenuItem("Menu 1");
		i2 = new JMenuItem("Menu 2");
		i3 = new JMenuItem("Edit 1");

		// Add values
		menu.add(i1);
		menu.add(i2);
		menu1.add(i3);
		mb.add(menu);
		mb.add(menu1);
		mb.add(menu2);

		label3 = new JLabel("Name:");
		label2 = new JLabel("Gender:");
		label1 = new JLabel("Prog. lang.");
		textfield1.setToolTipText("Enter your name!");
		label.setHorizontalAlignment(JLabel.CENTER);

		// Set position and size
		label1.setBounds(50, 160, 80, 20);
		label2.setBounds(50, 120, 80, 20);
		label3.setBounds(50, 80, 80, 20);
		r1.setBounds(120, 110, 120, 20);
		r2.setBounds(120, 130, 120, 20);
		cb.setBounds(120, 160, 80, 20);
		textfield1.setBounds(120, 80, 80, 30);
		label.setSize(400, 100);
		button.setBounds(120, 200, 80, 20);

		// Adds everything to frame
		f.setTitle("Long Exam 2");
		f.add(label1);
		f.add(label2);
		f.add(label3);
		f.add(textfield1);
		f.add(cb);
		f.add(label);
		f.add(button);
		f.setLayout(null);
		f.setSize(350, 350);
		f.setVisible(true);
		f.add(r1);
		f.add(r2);

		f.setJMenuBar(mb);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
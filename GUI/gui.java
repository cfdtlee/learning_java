import javax.swing.*;
import java.awt.*;
import java.util.concurrent.*;
public class gui
{
	public static void main(String[] args) throws Exception
	{
		JFrame frame = new JFrame("Hello World!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,500);
		frame.setVisible(true);

		JLabel label = new JLabel("A label");
		JButton b1 = new JButton("Button1");
		//setLayout(new FlowLayout());
		frame.add(label);
		frame.add(b1);
		TimeUnit.SECONDS.sleep(1);
		label.setText("Hey!");

	}
}



	// String a = JOptionPane.showInputDialog("Enter a");
		// String b = JOptionPane.showInputDialog("Enter b");
		// int a_int = Integer.parseInt(a);
		// int b_int = Integer.parseInt(b);
		// int sum =a_int+b_int;
		// JOptionPane.showMessageDialog(null, "This sum is "+sum, "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
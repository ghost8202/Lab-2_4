package work;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Frame extends JFrame {
	 Frame(){
		//JFrame b = new JFrame();
		
		setTitle("Credential Checking");
		//setSize(250,250);
		//setLocation(500,500);
		setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
		JLabel user = new JLabel("User Name :");
		JTextField tf=new JTextField();
		JLabel pass = new JLabel("Password :");
		JPasswordField pa=new JPasswordField();
		JLabel comm = new JLabel("Comments :");
		JPanel p = new JPanel();
		p.add(user);
		p.add(tf);
		p.add(pass);
		p.add(pa);
		p.add(comm);
		setContentPane(p);
	}

}

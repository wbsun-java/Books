import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GuiJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setTitle("Wenbo Sun".toUpperCase());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setSize(420,420);
		
		ImageIcon image = new ImageIcon("C:\\Users\\wbsun\\eclipse-workspace\\JavaGUI\\src\\IMG_0176.JPG");
		frame.setIconImage(image.getImage());
		
	}

}

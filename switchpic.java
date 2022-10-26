import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class switchpic{
	private static JFrame jf = new JFrame("picture");
	private static JPanel jpu = new JPanel(new BorderLayout());
	private static JPanel jpd = new JPanel(new GridLayout(1,2));
	private static JButton front = new JButton("previous");
	private static JButton next = new JButton("next");
	private static ImageIcon image1 = new ImageIcon("pics/Chain.gif");
	private static ImageIcon image2 = new ImageIcon("pics/japari.jpg");
	private static ImageIcon image3 = new ImageIcon("pics/bof.jpg");
	private static JLabel jlp = new JLabel();
	private static JLabel jlt = new JLabel("japari park");
	private static int current = 2;
	
	public static void main(String args[]) {
		jf.setLayout(new GridLayout(2,1));
		
		image2.setImage(image2.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT ));
		image1.setImage(image1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT ));
		image3.setImage(image3.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT ));
		
		jlp.setIcon(image2);
		jpu.add(jlt,BorderLayout.NORTH);
		jpu.add(jlp,BorderLayout.CENTER);
		
		front.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(current == 1)
				{
					JOptionPane.showMessageDialog(jf,"error");
				}
				else if(current == 2)
				{
					current = 1;
					jlp.setIcon(image1);
					jlt.setText("Chain");
				}
				else
				{
					current = 2;
					jlp.setIcon(image2);
					jlt.setText("japari");
				}
			}
		});
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(current == 1)
				{
					current = 2;
					jlp.setIcon(image2);
					jlt.setText("japari");
				}
				else if(current == 2)
				{
					current = 3;
					jlp.setIcon(image3);
					jlt.setText("bof");
				}
				else
				{
					JOptionPane.showMessageDialog(jf,"error");
				}
			}
		});
		
		jpd.add(front);
		jpd.add(next);
		
		jf.add(jpu);
		jf.add(jpd);
		jf.setSize(400, 600);
  		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		jf.setResizable(false);
  		jf.setVisible(true);
	}
}
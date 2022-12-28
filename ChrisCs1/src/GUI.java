import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame{
	private JPanel panel;
	private JTextField txtCity;
	private JButton button1;
	private JButton button2;
	private ArrayList<Fleet> fleets;
	
	public GUI(ArrayList<Fleet> fleets) {
		this.fleets = fleets;
		
		this.panel = new JPanel();
		this.txtCity = new JTextField();
		this.txtCity.setPreferredSize(new Dimension(150,24));
		
		this.button1 = new JButton("Εμφάνιση Αυτονομίας");
		this.button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for(Fleet f:fleets) {
					if(f.getCity().equals(txtCity.getText())) {
						System.out.println(f.getCity());
						System.out.println(f.totalTaxis());
						System.out.println(f.getTotalAutonomy());
						break;
					}
				}
				
			}
		});
		
		this.button2 = new JButton("Αποθήκευση σε Αρχείο");
		this.button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter fileOut = new FileWriter("dai19223.txt");
					for(Fleet f:fleets) {
						if(f.getCity().equals(txtCity.getText())) {
							fileOut.append(f.getCity() + "\n--------\n");
							for(Taxi t:f.getTaxis()) {
								fileOut.append(t.getName() + ",  " + t.getLicense() + ", " + t.autonomy() + "\n");
								fileOut.append("Total autonomy: " + f.getTotalAutonomy() + "\n--------\n");
							}
							break;
						}
					}
					fileOut.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		panel.add(txtCity);
		panel.add(button1);
		panel.add(button2);
		
		this.setContentPane(panel);
		
		this.setVisible(true);
		this.setSize(300, 200);
		this.setTitle("Taxis");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

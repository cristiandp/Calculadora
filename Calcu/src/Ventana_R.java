import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Ventana_R extends JFrame implements ActionListener {
	JLabel label1,label2;
	JTextField input;
	JButton action;
	double aux=0;
	boolean turno=false;
	public Ventana_R(){
		
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		
		input = new JTextField();
		input.selectAll();
		input.setColumns(4);
		c.fill= GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		c.gridheight = 1;
		
		add(input,c);
		
		action = new JButton("Calc");
		action.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(!turno){
					aux=Double.parseDouble(input.getText());
					input.setText("");
					turno = true;
					action.setText("=");
				}else{
					label1.setText(String.valueOf(aux % Double.parseDouble(input.getText())));
				input.setText("");
				action.setText("Calc");
				aux = 0;
				turno = false;
				input.selectAll();
				}
			}
		});
		c.fill= GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		
		add(action,c);
		
		
		label1 = new JLabel();
		c.fill= GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		
		add(label1,c);
		
		pack();
	}

		public static void main(String[] args){
			Ventana_R ventana = new Ventana_R();
			ventana.setVisible(true);
			ventana.setResizable(false);
			ventana.setSize(100, 100);
			ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

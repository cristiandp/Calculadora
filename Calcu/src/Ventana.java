import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;



public class Ventana extends JFrame implements KeyListener, ActionListener,WindowListener {
	 double aux=0,aux2=0;
	 double resultado=0;
	 int estado =  0;
	 private static final int SUMA=0;
	 private static final int RESTA=1;
	 private static final int MULT=2;
	 private static final int DIV=3;
	 private static final int REST=4;
	 JLabel operando,dec;
	 JTextField bin,hex,oct;
	 JButton numero;
	 JTextField computo;
	 JPanel conversor;
	 Thread t;
	public Ventana(){
		
		super("Calculadora");
		
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		operando = new JLabel();
		
		c.fill = GridBagConstraints.CENTER;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		add(operando,c);
		
		computo = new JTextField("0");
		computo.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()){
				case 48:
					computo.setText(computo.getText() + 0);
					break;
				case 49:
					computo.setText(computo.getText() + 1);
					break;
				case 50:
					computo.setText(computo.getText() + 2);
					break;
				case 51:
					computo.setText(computo.getText() + 3);
					break;
				case 52:
					computo.setText(computo.getText() + 4);
					break;
				case 53:
					computo.setText(computo.getText() + 5);
					break;
				case 54:
					computo.setText(computo.getText() + 6);
					break;
				case 55:
					computo.setText(computo.getText() + 7);
					break;
				case 56:
					computo.setText(computo.getText() + 8);
					break;
				case 57:
					computo.setText(computo.getText() + 9);
					break;
				case 96:
					computo.setText(computo.getText() + 0);
					break;
				case 97:
					computo.setText(computo.getText() + 1);
					break;
				case 98:
					computo.setText(computo.getText() + 2);
					break;
				case 99:
					computo.setText(computo.getText() + 3);
					break;
				case 100:
					computo.setText(computo.getText() + 4);
					break;
				case 101:
					computo.setText(computo.getText() + 5);
					break;
				case 102:
					computo.setText(computo.getText() + 6);
					break;
				case 103:
					computo.setText(computo.getText() + 7);
					break;
				case 104:
					computo.setText(computo.getText() + 8);
					break;
				case 105:
					computo.setText(computo.getText() + 9);
					break;
					
				}
				
			}
		});
		computo.setVisible(true);
		computo.setEditable(false);
		computo.setMaximumSize(new Dimension(15,200));
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 4;
		c.gridheight = 1;
		add(computo,c);
		
		computo.setMaximumSize(new Dimension());
		
		
		
		
		
		numero = new JButton("1");
		numero.addActionListener(new ActionListener() {
		
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				computo.setText(computo.getText()+"1");
				computo.requestFocus();
				
				
			}
		});
			
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		add(numero,c);
		
		numero = new JButton("2");
numero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				computo.setText(computo.getText()+"2");
				
			}
		});
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		add(numero,c);
		
		numero = new JButton("3");
numero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				computo.setText(computo.getText()+"3");
				
			}
		});
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		add(numero,c);
		
		numero = new JButton("4");
numero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				computo.setText(computo.getText()+"4");
				
			}
		});
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		add(numero,c);
		
		numero = new JButton("5");
numero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				computo.setText(computo.getText()+"5");
				
			}
		});
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		add(numero,c);
		
		numero = new JButton("6");
numero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				computo.setText(computo.getText()+"6");
				
			}
		});
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		add(numero,c);
		
		numero = new JButton("7");		
		numero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				computo.setText(computo.getText()+"7");
				
			}
		});
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight = 1;
		add(numero,c);
		
		numero = new JButton("8");
numero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				computo.setText(computo.getText()+"8");
				
			}
		});
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight = 1;
		add(numero,c);
		
		numero = new JButton("9");
numero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				computo.setText(computo.getText()+"9");
				
			}
		});
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight = 1;
		add(numero,c);
		
		
		numero = new JButton("0");
		numero.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						computo.setText(computo.getText()+"0");
						
					}
				});
				c.fill = GridBagConstraints.HORIZONTAL;
				c.gridx = 0;
				c.gridy = 4;
				c.gridwidth = 1;
				c.gridheight = 1;
				add(numero,c);
		
		numero = new JButton("+");
		numero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		
					operando.setText("+");
					resultado = Double.parseDouble(computo.getText());
					computo.setText("0");
					estado = SUMA;
			}
		});
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		add(numero,c);
		
		numero = new JButton("-");
numero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				operando.setText("-");
				resultado = Double.parseDouble(computo.getText());
				computo.setText("0");
				estado=RESTA;
			}
		});
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		add(numero,c);
		
		numero = new JButton("X");
numero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				operando.setText("X");
				resultado = Double.parseDouble(computo.getText());
				computo.setText("0");
				estado=MULT;
			}
		});
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight = 1;
		add(numero,c);
		
		numero = new JButton("/");
numero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				operando.setText("/");
				resultado = Double.parseDouble(computo.getText());
				computo.setText("0");
				estado=DIV;
			}
		});
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 4;
		c.gridwidth = 1;
		c.gridheight = 1;
		add(numero,c);
		
		
		numero = new JButton("Resto");
numero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				operando.setText("Resto");
				resultado = Double.parseDouble(computo.getText());
				computo.setText("0");
				estado=REST;
			}
		});
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		add(numero,c);
		
		numero = new JButton("C");
		numero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			computo.setText("0");
			operando.setText("");
			aux=0;
			aux2=0;
			bin.setText("0");
			hex.setText("0");
			oct.setText("0");
				
			}
		});
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 4;
		c.gridwidth = 1;
		c.gridheight = 1;
		add(numero,c);
		
		
		numero = new JButton("=");
		numero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String result;
				
				switch(estado){
				case SUMA:
					result=(String.valueOf(resultado+Double.parseDouble(computo.getText())));
					computo.setText("");
					computo.setText(result);
					break;
				case RESTA:
					result=(String.valueOf(resultado-Double.parseDouble(computo.getText())));
					computo.setText("");
					computo.setText(result);
					break;
				case MULT:
					result=(String.valueOf(resultado*Double.parseDouble(computo.getText())));
					computo.setText("");
					computo.setText(result);
					break;
				case DIV:
					result=(String.valueOf(resultado/Double.parseDouble(computo.getText())));
					computo.setText("");
					computo.setText(result);
					break;
				case REST:
					result=(String.valueOf(resultado%Float.parseFloat(computo.getText())));
					computo.setText("");
					computo.setText(result);
					break;
				}
				operando.setText("");
			}
		});
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 4;
		c.gridwidth = 1;
		c.gridheight = 1;
		add(numero,c);
		
		
		
		
		
		/* ******Prueba conversor*********************************************** */
		conversor = new JPanel(new GridBagLayout());
		
				GridBagConstraints cp = new GridBagConstraints();
				bin = new JTextField("Binario");
				bin.setMaximumSize(new Dimension(4,4));
				bin.setEditable(false);
				cp.gridx = 0;
				cp.gridy = 1;
				cp.gridheight = 1;
				cp.gridwidth = 2;
				cp.fill = GridBagConstraints.HORIZONTAL;
				conversor.add(bin,cp);
				
				hex = new JTextField("Hexadecimal");
				hex.setEditable(false);
				hex.setMaximumSize(new Dimension(0,0));
				cp.gridx = 0;
				cp.gridy = 2;
				cp.gridheight = 1;
				cp.gridwidth = 2;
				cp.fill = GridBagConstraints.HORIZONTAL;
				conversor.add(hex,cp);
				
				oct = new JTextField("Octal");
				oct.setEditable(false);
				oct.setMinimumSize(new Dimension(0,0));
				cp.gridx = 0;
				cp.gridy = 3;
				cp.gridheight = 1;
				cp.gridwidth = 2;
				cp.fill = GridBagConstraints.HORIZONTAL;
				conversor.add(oct,cp);
				
				numero = new JButton("Convertir");
				numero.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						Binario bin2 = new Binario(Integer.parseInt(computo.getText()));
						Hexadecimal hex2 = new Hexadecimal(Integer.parseInt(computo.getText()));
						Octal oct2 = new Octal(Integer.parseInt(computo.getText()));
						
						bin.setText(String.valueOf(bin2.getResultado()));
						hex.setText(String.valueOf(hex2.getResultado()));
						oct.setText(String.valueOf(oct2.getResultado()));
						
//						t = new Thread(Ventana.this);
//						t.start();
					}
				});
				cp.gridx = 0;
				cp.gridy = 0;
				cp.gridheight = 1;
				cp.gridwidth = 2;
				cp.fill = GridBagConstraints.HORIZONTAL;
				conversor.add(numero,cp);
				
				
		conversor.setBorder(new TitledBorder("Conversor"));
		
		
		c.gridx= 4;
		c.gridy= 1;
		c.gridwidth = 1;
		c.gridheight = 5;
		c.fill = GridBagConstraints.HORIZONTAL;
		
		add(conversor,c);
		
		
		
		/* ******Fin Prueba conversor*************************************************** */
		
		
		
		
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent arg0) {

			}
			
			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
		
		
		
		pack();
		
		addWindowListener(this);
		
		
	}
	
	public static void main(String[] args){
		Ventana ventana = new Ventana();
		ventana.setVisible(true);
		ventana.setResizable(false);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		ventana.setSize(500, );
	}
	

	

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void run() {
//		try {
//			Thread.sleep(100);
//			
//				Binario bin2 = new Binario(Integer.parseInt(computo.getText()));
//				Hexadecimal hex2 = new Hexadecimal(Integer.parseInt(computo.getText()));
//				Octal oct2 = new Octal(Integer.parseInt(computo.getText()));
//				while(true){
//				bin.setText(String.valueOf(bin2.getResultado()));
//				hex.setText(String.valueOf(hex2.getResultado()));
//				oct.setText(String.valueOf(oct2.getResultado()));
//			}
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
	}

	

	
	




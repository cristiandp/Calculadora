

public class Actualizar extends Ventana implements Runnable {

	public Actualizar() {
		
	}

	@Override
	public void run() {
		
		Binario bin2 = new Binario(Integer.parseInt(computo.getText()));
		Hexadecimal hex2 = new Hexadecimal(Integer.parseInt(computo.getText()));
		Octal oct2 = new Octal(Integer.parseInt(computo.getText()));
		
		bin.setText(String.valueOf(bin2.getResultado()));
		hex.setText(String.valueOf(hex2.getResultado()));
		oct.setText(String.valueOf(oct2.getResultado()));
		pack();
	}

}

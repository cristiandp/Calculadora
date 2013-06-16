
public class Hexadecimal extends ValorH {
	
	private int num;
	public Hexadecimal(int num) {
		super(num);
		this.num=num;
		
		
	}
	
	public String getResultado(){
		
		
		return (Integer.toHexString(num).toUpperCase());

}
	
	}

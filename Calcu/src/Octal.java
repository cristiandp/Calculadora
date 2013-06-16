
public class Octal extends ValorH {
	
	private int num;
	public Octal(int num) {
		super(num);
		this.num=num;
		
		
	}
	
	public String getResultado(){
		
		
		return (Integer.toOctalString(num).toUpperCase());
		
}
	
	}

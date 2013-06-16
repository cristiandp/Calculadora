
public class Binario extends ValorH {
	private StringBuilder invertida = new StringBuilder();
	private StringBuilder resultado = new StringBuilder();
    private int i;

	public Binario(int num) {
		super(num);
		do{
			if(num == 1) {
				resultado.append("1");
				break;
			}else if(num == 0){
				resultado.append("0");
				break;
			}else{
					invertida.append(num%2);
					num=num/2;
			}
		}while(num != 1);
		invertida.append(num);
	}
	
	
	public String getResultado(){
		i=invertida.length()-1;
		if (num == 1 || num== 0){
			return String.valueOf(resultado);
		}else{
		do{
			resultado.append(invertida.charAt(i));
			i--;
		}while (i>=0);
		return String.valueOf(resultado);
		}
	}
}



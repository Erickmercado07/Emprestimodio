package hoje;

public class Emprestimo {

private double result;
private double parc;
private int i;
	
	public double Emprestimofisic (double emp, int qtd) {
		i =qtd;
		if (qtd <=1) {
			result = emp +  emp * 0.0;
		}
		if (qtd >=2 && qtd <=4) {
			result = emp +  emp * 0.2;
			parc = result /qtd;
			
		}
		if (qtd >=5 && qtd <=7) {
			result = emp + emp*0.5;
			parc = result/qtd;
		}
		
		if (qtd >=7 && qtd <=9) {
			result = emp + emp*0.7;
			parc = result/qtd;
		}
		
return result;		

	}

	@Override
	public String toString() {
		return " Valor de emprestimo " + result + " Voce ira pagar em " + i
				+ " parcelas de " + parc ;
	}
	

	
	
	
}

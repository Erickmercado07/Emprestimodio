package hoje;

import java.util.Scanner;

public class empresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner (System.in);

System.out.println("Digite o valor que deseja emprestimo");

Double ep = in.nextDouble();

System.out.println("Qual a quantidade de parcelas");

int qtd = in.nextInt();
Emprestimo emp = new Emprestimo();

emp.Emprestimofisic(ep,qtd);

System.out.println(emp);

     

	}

}

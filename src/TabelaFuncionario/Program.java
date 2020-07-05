package TabelaFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List <Cadastro> list = new ArrayList<>();
		
		int num=0 , id = 0, bus= 0;;
		String name = null;
		double salary =0.0;
		int i = 0;
		
		System.out.println("digite o numero de funcionarios ao qual deseja cadastrar");
		num = sc.nextInt();
		
		for ( i = 0; i<num; i++) {
			System.out.println("numero identificador");
			id = sc.nextInt();
			sc.nextLine();
			System.out.println("nome: ");
			name = sc.nextLine();
			System.out.println("salario:");
			salary = sc.nextDouble();
			
			Cadastro cad = new Cadastro(id, name, salary);
			list.add(cad);
			
			System.out.println();
		}
		
		System.out.println("entre com o id do qual recebera o aumento");
		bus = sc.nextInt();
		
		System.out.println("entre com a porcentagem do aumento");
		double aum = sc.nextDouble();
		
		for(Cadastro xis : list) {
			if (xis.getId() == bus)
				xis.setSalary(xis.aumento(aum));
			
			else System.out.println("funcionario não cadastrado");
				
		}
		
		System.out.println();
		System.out.println("dados atualizados");
		
		for(Cadastro xis : list) {
			System.out.println();
			System.out.println(xis.getId()+", "+xis.getName()+", "+xis.getSalary());
		}
		
		
		sc.close();
	}



}

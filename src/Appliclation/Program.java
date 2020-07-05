package Appliclation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dp = new Scanner(System.in);
		List <String> list = new ArrayList<>();
		
		list.add("o EL PEDRON HA HA HA");
		list.add("A sua mãe HA HA HA");
		list.add(1, dp.nextLine()+" HA HA HA");
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		//list.remove(1) || //list.remove("algo");
		list.removeIf(x -> x.charAt(0) == 'o');
		
		System.out.println("\n");
		for (String x : list) {
			System.out.println(x);
		}
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		list.add("A EL PEDRON HA HA HA");
		
		System.out.println("\n"+list.indexOf("A EL PEDRON HA HA HA"));
		
		result.add("A EL PEDRON HA HA HA");
		
		System.out.println("\n");
		for (String x : result) {
			System.out.println(x);
		}
		dp.close();
	}
	
}

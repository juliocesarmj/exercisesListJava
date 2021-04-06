package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Emplyoee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);	
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int idSalary = sc.nextInt();
		
		Integer pos = position(list, idSalary);
		
		if(pos == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent); // pensamento logico: list = lista de funcionarios criada
			// get "funcao pra obter uma informacao", como parametro iremos adicionar a variavel pos
			// que retorna a posicao do id dentro da lista
			// com base nisso, adicionamos um bonus salarial, invocando o metodo subsequente com a variavel
			// percentage como parâmetro.
		}
		System.out.println();
		System.out.println("List of employees:");
		
		for(Employee emp : list) {
			System.out.println(emp);
		}
		sc.close();

	}
	
	//funcao que irá percorrer uma lista para encontrar o id que for informado pelo usuário
	// para só entao, depois atribuir a esse funcionario com o id, seu respectivo aumento salarial.
	// caso nao encontre um id, significa que nao existe, logo será exibido em tela uma mensagem a respeito.
	public static Integer position(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}

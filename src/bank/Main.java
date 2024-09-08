package bank;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.accout.Account;
import model.exception.DomainException;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter account data");
			System.out.print("nuber: ");//id
			int nuber = sc.nextInt();
			
			System.out.print("holder: ");//name
			String holder = sc.next();sc.nextLine();
			
			System.out.print("Initicial Balance: ");//saldo inicial
			double Balance = sc.nextDouble();
			
			System.out.print("withdraw limit: ");//limite do cartao
			double withdraw = sc.nextDouble();
			
			
		
			Account account = new Account(nuber, holder, Balance, withdraw);
			System.out.print("\nEnter amount for withdraw: ");
			double withlimit = sc.nextDouble();
			
			account.deposit(withlimit);
			System.out.print("New Balance:"+account.toString());
			
		
			
		}catch (DomainException e) {
			System.out.println("Withdraw erro: "+e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("Erro na digitacao");
		}
		
		sc.close();

	}

}

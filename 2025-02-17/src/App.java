import java.util.Scanner;
import java.util.ArrayList;
public class App
{
	public static void main(String[] args) {
		System.out.print("Enter the number of tax payers: ");
		
		Scanner scanner = new Scanner(System.in);
		int quant_payers = scanner.nextInt();
		scanner.nextLine();
		System.out.println();
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		for(int i=0;i<quant_payers;i++){
		    
		    System.out.println("Tax payer #"+(i+1)+" data:");
		    System.out.print("Individual or company (i/c)? ");
		    char tipo = scanner.next().charAt(0);
		    scanner.nextLine();
		    String nomeinput;
		    double rendainput;
		    if(tipo == 'i'){
		        System.out.print("Name: ");
		        nomeinput = scanner.nextLine();
		        System.out.print("Anual income: ");
		        rendainput = scanner.nextDouble();
		        System.out.print("Heath expenditures: ");
		        double gastosaudeinput = scanner.nextDouble();
		        System.out.println();
		        Fisica fisica = new Fisica(nomeinput,rendainput,gastosaudeinput);
		        pessoas.add(fisica);
		        
		    }else if(tipo == 'c'){
		        System.out.print("Name: ");
		        nomeinput = scanner.nextLine();
		        System.out.print("Anual income: ");
		        rendainput = scanner.nextDouble();
		        System.out.print("Number of employees: ");
		        int numfuncionariosinput = scanner.nextInt();
		        System.out.println();
		        Juridica juridica = new Juridica(nomeinput,rendainput,numfuncionariosinput);
		        pessoas.add(juridica);
		    }else{
		        System.out.println("caractere invalido.");
		    }
		    
		}
		
		System.out.println("TAXES PAID:");
		double totaltaxes=0;
		for(int i=0;i<pessoas.size();i++){
		    System.out.println(pessoas.get(i).getNome()+": $ "+pessoas.get(i).calculaImposto());
		    totaltaxes = totaltaxes + pessoas.get(i).calculaImposto();
		}
		System.out.println("TOTAL TAXES: $ "+totaltaxes);
	}
}

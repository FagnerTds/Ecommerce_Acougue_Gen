package e_acougue;

import java.util.InputMismatchException;
import java.util.Scanner;

import e_acougue.controller.EacougueControler;
import e_acougue.model.Produtos;
import e_acougue.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		EacougueControler acougue = new EacougueControler();
		
		Produtos p1 = new Produtos(1,1,2,1,20.35);
		acougue.adicionarPedidos(p1);
		
		Produtos p2 = new Produtos(2,2,2,1,62.30);
		acougue.adicionarPedidos(p2);
		
		Produtos p3= new Produtos(3,3,3,1,15.88);
		acougue.adicionarPedidos(p3);
		
		Produtos p4 = new Produtos(4,4,2,1,24.54);
		acougue.adicionarPedidos(p4);
		
		Scanner sc = new Scanner(System.in);
		int opcao, tipo, categoria, numero, pagamento;
		boolean novaCarne=true, novaAve=true, novoPeixe=true, novoSuino=true;
		
		do{
			double preco1=0,preco2=0,preco3=0,preco4=0, quantidade;

		System.out.println(Cores.TEXT_YELLOW_BOLD +"                       BEM VINDOS A          "+ Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"                                                                       ");
		System.out.println("         ______ _        _____                                         ");
		System.out.println("        |  ____| |      / ____|                                        ");
		System.out.println("        | |__  | |_ ___| |     __ _ _ __ _ __   ___  ___               ");
		System.out.println("        |  __| | __/ __| |    / _` | '__| '_ \\ / _ \\/ __|            ");
		System.out.println("        | |    | |_\\__ \\ |___| (_| | |  | | | |  __/\\__ \\          ");
		System.out.println("        |_|     \\__|___/\\_____\\__,_|_|  |_| |_|\\___||___/          ");
		System.out.println("                                                                       ");
		System.out.println("                                                                       ");
		System.out.println(Cores.TEXT_YELLOW_BOLD +"                      1"+ Cores.TEXT_RESET +" - Realizar Pedido                              ");
		System.out.println(Cores.TEXT_YELLOW_BOLD +"                      2"+ Cores.TEXT_RESET +" - Visualizar pedidos                           ");
		System.out.println(Cores.TEXT_YELLOW_BOLD +"                      3"+ Cores.TEXT_RESET +" - Deletar pedidos                              ");
		System.out.println(Cores.TEXT_YELLOW_BOLD +"                      4"+ Cores.TEXT_RESET +" - Finalizar pedidos                            ");
		System.out.println(Cores.TEXT_YELLOW_BOLD +"                      5"+ Cores.TEXT_RESET +" - sair                                         ");
		System.out.println(Cores.TEXT_YELLOW_BOLD +"                                                                       ");
		System.out.println("       Digite a opção desejada:"+ Cores.TEXT_RESET                     );
		
		try {
			opcao=sc.nextInt();
		}catch (InputMismatchException e) {
			System.out.println("Digite apenas valores inteiros");
			sc.nextLine();
			opcao=0;
		}
		if (opcao==5) {
			System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nFtsCarnes agradece sua preferência volte sempre "+Cores.TEXT_RESET);
		}

		switch (opcao) {
		case 1:
			do {
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"                                          ");
				System.out.println("                      Escolha a categoria                              ");
				System.out.println("                                                                       ");
				System.out.println(Cores.TEXT_CYAN_BOLD +"                      1"+ Cores.TEXT_RESET +" - Bovino                                       ");
				System.out.println(Cores.TEXT_CYAN_BOLD +"                      2"+ Cores.TEXT_RESET +" - Aves                                         ");
				System.out.println(Cores.TEXT_CYAN_BOLD +"                      3"+ Cores.TEXT_RESET +" - peixes                                       ");
				System.out.println(Cores.TEXT_CYAN_BOLD +"                      4"+ Cores.TEXT_RESET +" - Suínos                                       ");
				System.out.println(Cores.TEXT_CYAN_BOLD +"                      5"+ Cores.TEXT_RESET +" - Voltar ao Menu Principal                     ");
				System.out.println(Cores.TEXT_CYAN_BOLD +"                                                                       ");
				System.out.println("       Digite a opção desejada:"+ Cores.TEXT_RESET                        );
				categoria=sc.nextInt();
		
				switch (categoria) {
				case 1:
				do {
					System.out.println(Cores.TEXT_YELLOW +"      SELECIONE O TIPO DE CARNE BOVINA"+ Cores.TEXT_RESET);
					System.out.println("                                             ");
					System.out.println("    1 - Contra Filé \t\tPreço R$34.50kg      ");
					System.out.println("    2 - Alcatra \t\tPreço R$32.00kg           ");
					System.out.println("    3 - Coxão Mole \t\tPreço R$30.00kg       ");
					System.out.println("    4 - Coxão Duro \t\tPreço R$28.00kg       ");
					System.out.println("    5 - Picanha \t\tPreço R$42.99kg          ");
					System.out.println("    6 - Patinho \t\tPreço R$30.00kg          ");
					System.out.println("                                             ");
					tipo=sc.nextInt();
					
					System.out.println("Digite a quantidade em Kg: ");
					quantidade=sc.nextDouble();
					
					switch (tipo) {
					case 1 -> {
						preco1+=quantidade*34.50;
						System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Contra filé é: R$"+preco1+"\n"+ Cores.TEXT_RESET);
						acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco1));
					}
					case 2 -> {
						preco1+=quantidade*32.00;
						System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Alcatra é: R$"+preco1+"\n"+ Cores.TEXT_RESET);
						acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco1));

					}
					case 3 -> {
						preco1+=quantidade*30.00;
						System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Coxão Mole é: R$"+preco1+"\n"+ Cores.TEXT_RESET);
						acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco1));

					}
					case 4 -> {
						preco1+=quantidade*28.00;
						System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Coxão Duro é: R$"+preco1+"\n"+ Cores.TEXT_RESET);
						acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco1));

					}
					case 5 -> {
						preco1+=quantidade*42.99;
						System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Picanha é: R$"+preco1+"\n"+ Cores.TEXT_RESET);
						acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco1));

					}
					case 6 -> {
						preco1+=quantidade*30.00;
						System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Patinho é: R$"+preco1+"\n"+ Cores.TEXT_RESET);
						acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco1));

					}
					default ->{
						System.out.println(Cores.TEXT_RED+"Opção inválida"+ Cores.TEXT_RESET);
					}
					
					
					}
					
					System.out.println("Deseja selecionar outro tipo de carne bovina? [S/N");
					char x =sc.next().toUpperCase().charAt(0);
					preco1=0;
					
					if(x=='S') {
						novaCarne=true;
					}
	
					if(x=='N') {
						novaCarne=false;
					}
					
				}while(novaCarne);
				break;
				
				case 2:
					do {
						System.out.println(Cores.TEXT_YELLOW +"      SELECIONE O TIPO DE AVE"+ Cores.TEXT_RESET);
						System.out.println("                                                 ");
						System.out.println("    1 - Peito de frango \t\tPreço R$25.00 - KG   ");
						System.out.println("    2 - Filé de frango \t\tPreço R$17.00 - kg    ");
						System.out.println("    3 - Asa de frango \t\tPreço R$12.99 - kg     ");
						System.out.println("    4 - Tulipa Temperada \tPreço R$20.00 - kg    ");
						System.out.println("    5 - Peito de Peru \t\tPreço R$22.99 - Kg          ");
						System.out.println("    6 - Coxa de frango \t\tPreço R$10.99 - kg    ");
						System.out.println("                                                 ");
					
						tipo=sc.nextInt();
						System.out.println("Digite a quantidade em Kg: ");
						quantidade=sc.nextDouble();
						
						switch (tipo) {
						case 1 -> {
							preco2+=quantidade*25.00;
							System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Peito de Frango é: R$"+preco2+"\n"+ Cores.TEXT_RESET);
							acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco2));

						}
						case 2 -> {
							preco2+=quantidade*17.00;
							System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Filé de frango é: R$"+preco2+"\n"+ Cores.TEXT_RESET);
							acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco2));

						}
						case 3 -> {
							preco2+=quantidade *12.99;
							System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Asa de Franqo é: R$"+preco2+"\n"+ Cores.TEXT_RESET);
							acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco2));

						}
						case 4 -> {
							preco2+=quantidade*20.00;
							System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Tulipa Temperada é: R$"+preco2+"\n"+ Cores.TEXT_RESET);
							acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco2));

						}
						case 5 -> {
							preco2+=quantidade*22.99;
							System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Peito de Peru é: R$"+preco2+"\n"+ Cores.TEXT_RESET);
							acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco2));

						}
						case 6 -> {
							preco2+=quantidade*10.99;
							System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Coxa de Frango é: R$"+preco2+"\n"+ Cores.TEXT_RESET);
							acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco2));

						}
						default ->{
							System.out.println(Cores.TEXT_RED+"Opção inválida"+ Cores.TEXT_RESET);
						}
						
						}
						
						System.out.println("Deseja selecionar outro tipo de carne de ave? [S/N");
						char x =sc.next().toUpperCase().charAt(0);
						preco2=0;

						
						if(x=='S') {
							novaAve=true;
						}

						if(x=='N') {
							novaAve=false;
						}
					
					}while(novaAve);
					break;
					
				case 3:
					do {
						System.out.println(Cores.TEXT_YELLOW +"      SELECIONE O TIPO DE PEIXE"+ Cores.TEXT_RESET);
						System.out.println("                                                   ");
						System.out.println("    1 - Tilápia em posta \t\tPreço R$25.00 - kg    ");
						System.out.println("    2 - Filé de Tilápia \t\tPreço R$47.99 - kg     ");
						System.out.println("    3 - Filé de Merlusa \t\tPreço R$32.99 - kg     ");
						System.out.println("    4 - Filé de pescada \t\tPreço R$30.00 - kg     ");
						System.out.println("    5 - Salmão \t\t\t\tPreço R$62.99 - kg          ");
						System.out.println("    6 - Camarão \t\t\tPreço R$25.99 - kg           ");
						System.out.println("                                                   ");
					
						tipo=sc.nextInt();
						System.out.println("Digite a quantidade em Kg: ");
						quantidade=sc.nextDouble();
						
						switch (tipo) {
						case 1 -> {
							preco3+=quantidade*25.00;
							System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Tilápia em Posta é: R$"+preco3+"\n"+ Cores.TEXT_RESET);
							acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco3));

						}
						case 2 -> {
							preco3+=quantidade*47.99;
							System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Filé de Tilápia é: R$"+preco3+"\n"+ Cores.TEXT_RESET);
							acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco3));

						}
						case 3 -> {
							preco3+=quantidade *32.99;
							System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Filé de Merlusa é: R$"+preco3+"\n"+ Cores.TEXT_RESET);
							acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco3));

						}
						case 4 -> {
							preco3+=quantidade*30.00;
							System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de filé de pescada é: R$"+preco3+"\n"+ Cores.TEXT_RESET);
							acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco3));

						}
						case 5 -> {
							preco3+=quantidade*62.99;
							System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Salmão é: R$"+preco3+"\n"+ Cores.TEXT_RESET);
							acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco3));

						}
						case 6 -> {
							preco3+=quantidade*25.99;
							System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Camarão é: R$"+preco3+"\n"+ Cores.TEXT_RESET);
							acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco3));

						}
						default->{
							System.out.println(Cores.TEXT_RED+"Opção inválida"+ Cores.TEXT_RESET);
							break;
						}
						
						
						}
						
						System.out.println("Deseja selecionar outro tipo de Peixe? [S/N");
						char x =sc.next().toUpperCase().charAt(0);
						preco3=0;

						
						if(x=='S') {
							novoPeixe=true;
						}

						if(x=='N') {
							novoPeixe=false;
						}
					
					}while(novoPeixe);
					break;

				case 4:
					do {
						System.out.println(Cores.TEXT_YELLOW +"      SELECIONE O TIPO DE SUÍNO"+ Cores.TEXT_RESET);
						System.out.println("                                                    ");
						System.out.println("    1 - Pernil \t\t\t\tPreço R$45.00 - kg           ");
						System.out.println("    2 - Bisteca \t\t\tPreço R$12.99 - kg            ");
						System.out.println("    3 - Lingiça apimentada \t\tPreço R$9.99 - kg    ");
						System.out.println("    4 - Costelinha \t\t\tPreço R$24.99 - kg         ");
						System.out.println("    5 - Bacon \t\t\t\tPreço R$25.99 - kg            ");
						System.out.println("                                                    ");
					
						tipo=sc.nextInt();
						System.out.println("Digite a quantidade em Kg: ");
						quantidade=sc.nextDouble();
						
						switch (tipo) {
						case 1 -> {
							preco4+=quantidade*45.00;
							System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Pernil é: R$"+preco4+"\n"+ Cores.TEXT_RESET);
							acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco4));

						}
						case 2 -> {
							preco4+=quantidade*12.99;
							System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Bisteca é: R$"+preco4+"\n"+ Cores.TEXT_RESET);
							acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco4));

						}
						case 3 -> {
							preco4+=quantidade *9.99;
							System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Linguiça apimentada é: R$"+preco4+"\n"+ Cores.TEXT_RESET);
							acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco4));

						}
						case 4 -> {
							preco4+=quantidade*30.00;
							System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Costelinha é: R$"+preco4+"\n"+ Cores.TEXT_RESET);
							acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco4));

						}
						case 5 -> {
							preco4+=quantidade*62.99;
							System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nO preço de "+quantidade+"kg(S) de Bacon é: R$"+preco4+"\n"+ Cores.TEXT_RESET);
							acougue.adicionarPedidos(new Produtos(acougue.gerarNumero(),categoria,tipo,quantidade,preco4));

						}
						
						default->{
							System.out.println(Cores.TEXT_RED+"Opção inválida"+ Cores.TEXT_RESET);
							
						}
						
						
						}
						
						System.out.println("Deseja selecionar outro tipo de Peixe? [S/N");
						char x =sc.next().toUpperCase().charAt(0);
						preco4=0;

						
						if(x=='S') {
							novoSuino=true;
						}

						if(x=='N') {
							novoSuino=false;
						}
					
					}while(novoSuino);
					break;
				case 5:
					break;
				default: 
					System.out.println(Cores.TEXT_RED+"Categoria inexistente selecione uma válida"+ Cores.TEXT_RESET);
				}
				
				
			}while(categoria!=5);
			break;
		case 2:
			System.out.println("\n\tVisualizar pedidos\n");
			acougue.visualizarPedidos();
			break;
			
		case 3 :
			System.out.println("\n\tDeletar pedidos\n");
			
			System.out.println("Digite o número do pedido que deseja deletar");
			numero=sc.nextInt();
			
			acougue.deletarPedidos(numero);
			break;
			
		case 4 :
			System.out.println("\n\tFinalizar pedidos\n");
			acougue.visualizarPedidosFinal();

			
			System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT+"Seu pedido deu o total de R$"+String.format("%.2f", acougue.calcularTotal(null))+Cores.TEXT_RESET+"\n\n");
			
			System.out.println("Escolha a forma de pagamento: ");
			
			System.out.println(Cores.TEXT_YELLOW+"--------------------------------"+Cores.TEXT_RESET);
			System.out.println("       1 - Pix                  ");
			System.out.println("       2 - Crédito              ");
			System.out.println("       3 - Mercado pago         ");
			System.out.println(Cores.TEXT_YELLOW+"--------------------------------"+Cores.TEXT_RESET);
			
			
			do {
				pagamento=sc.nextInt();
			}while(pagamento <1 && pagamento>3 );
			
			switch(pagamento) {
			case 1->{
				System.out.println("\n\nPagamento via Pix realizado com sucesso.");
			}
			case 2->{
				System.out.println("\n\nPagamento via Crédito realizado com sucesso.");
			}
			case 3->{
				System.out.println("\n\nPagamento via Mercado Pago realizado com sucesso.");
			}
			}
			System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT+"\nFtsCarnes agradece sua preferência volte sempre "+Cores.TEXT_RESET);

			System.exit(0);
			break;
		case 5 :
			break;
		default :
			System.out.println(Cores.TEXT_RED+"Opção inválida"+ Cores.TEXT_RESET);
			break;
		}
		
		
		
	}while(opcao!=5);
		sc.close();
	}
}

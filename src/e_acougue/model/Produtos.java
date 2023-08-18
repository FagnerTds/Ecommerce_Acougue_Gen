package e_acougue.model;

import e_acougue.util.Cores;

public class Produtos {
	
	private int numeroPedido;
	private int categoria;
	private int tipo;
	private double quantidade;
	private double preco;
	private double total;
	
	
	public Produtos(int numeroPedido,int categoria, int tipo, double quantidade, double preco) {
		this.numeroPedido = numeroPedido;
		this.categoria = categoria;
		this.tipo = tipo;
		this.quantidade = quantidade;
		this.preco = preco;
		
	}
	
	

	public int getCategoria() {
		return categoria;
	}



	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}



	public int getTipo() {
		return tipo;
	}



	public void setTipo(int tipo) {
		this.tipo = tipo;
	}



	public double getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double peco) {
		this.preco = peco;
	}



	public double getTotal() {
		return total;
	}



	public void setTotal(double total) {
		this.total = total;
	}
	

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}


	public void calcularTotal(double quantidade, double preco) {
		 this.setTotal(this.getPreco()*this.getQuantidade());
	}
	
	public void visualizar() {
		String categoria = "";
		String tipo = "";
		
		switch(this.getCategoria()) {
		case 1:
			categoria = "Bovino";
			
			switch(this.getTipo()) {
			case 1->{ 
				tipo = "Contra Filé";
				
			}
			case 2-> {
				tipo = "Alcatra";
				
			}
			case 3-> {
				tipo = "Coxão Mole";
				
			}
			case 4-> {
				tipo = "Coxão duro";
				
			}
			case 5-> {
				tipo = "Picanha";
				
			}
			case 6-> {
				tipo = "Patinho";
				
			}
			
			}
		break;
		
		case 2:
			categoria = "Aves";
			
			switch(this.getTipo()) {
			case 1->{ 
				tipo = "Peito de Frango";
				
			}
			case 2-> {
				tipo = "Filé de frango";
				
			}
			case 3-> {
				tipo = "Asa de frango";
				
			}
			case 4-> {
				tipo = "Tulipa Temperada";
				
			}
			case 5-> {
				tipo = "Peito de Peru";
				
			}
			case 6-> {
				tipo = "Coxa de frango";
				
			}
			
			}	
		break;
		
		case 3:
			categoria = "Peixes";
			
			switch(this.getTipo()) {
			case 1->{ 
				tipo = "Tilápia em posta";
				
			}
			case 2-> {
				tipo = "Filé de Tilápia";
				
			}
			case 3-> {
				tipo = "Filé de Merlusa";
				
			}
			case 4-> {
				tipo = "Filé de pescada";
				
			}
			case 5-> {
				tipo = "Salmão";
				
			}
			case 6-> {
				tipo = "Camarão";
				
			}
			
			}
		break;
		
		case 4:
			categoria = "Suíno";
			
			switch(this.getTipo()) {
			case 1->{ 
				tipo = "Pernil";
				
			}
			case 2-> {
				tipo = "Bisteca";
				
			}
			case 3-> {
				tipo = "Lingiça apimentada";
				
			}
			case 4-> {
				tipo = "Costelinha";
				
			}
			case 5-> {
				tipo = "Bacon";
				
			}
			
			}
		break;
		}
		
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*****************************************"+Cores.TEXT_RESET);
		System.out.println("        Produto número "+ getNumeroPedido()+"          ");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*****************************************"+Cores.TEXT_RESET);
		System.out.print("Você selecionou "+ getQuantidade());
		System.out.print  ("kg de "+tipo+"\n");
		System.out.println("Categoria "+categoria);
		System.out.println("O preço do pedido é: R$"+ getPreco());
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*****************************************"+Cores.TEXT_RESET);
		System.out.println("                                         \n");
	}
	
	public void visualizarFinal() {
		@SuppressWarnings("unused")
		String categoria = "";
		String tipo = "";
		
		switch(this.getCategoria()) {
		case 1:
			categoria = "Bovino";
			
			switch(this.getTipo()) {
			case 1->{ 
				tipo = "Contra Filé";
				
			}
			case 2-> {
				tipo = "Alcatra";
				
			}
			case 3-> {
				tipo = "Coxão Mole";
				
			}
			case 4-> {
				tipo = "Coxão duro";
				
			}
			case 5-> {
				tipo = "Picanha";
				
			}
			case 6-> {
				tipo = "Patinho";
				
			}
			
			}
		break;
		
		case 2:
			categoria = "Aves";
			
			switch(this.getTipo()) {
			case 1->{ 
				tipo = "Peito de Frango";
				
			}
			case 2-> {
				tipo = "Filé de frango";
				
			}
			case 3-> {
				tipo = "Asa de frango";
				
			}
			case 4-> {
				tipo = "Tulipa Temperada";
				
			}
			case 5-> {
				tipo = "Peito de Peru";
				
			}
			case 6-> {
				tipo = "Coxa de frango";
				
			}
			
			}	
		break;
		
		case 3:
			categoria = "Peixes";
			
			switch(this.getTipo()) {
			case 1->{ 
				tipo = "Tilápia em posta";
				
			}
			case 2-> {
				tipo = "Filé de Tilápia";
				
			}
			case 3-> {
				tipo = "Filé de Merlusa";
				
			}
			case 4-> {
				tipo = "Filé de pescada";
				
			}
			case 5-> {
				tipo = "Salmão";
				
			}
			case 6-> {
				tipo = "Camarão";
				
			}
			
			}
		break;
		
		case 4:
			categoria = "Suíno";
			
			switch(this.getTipo()) {
			case 1->{ 
				tipo = "Pernil";
				
			}
			case 2-> {
				tipo = "Bisteca";
				
			}
			case 3-> {
				tipo = "Lingiça apimentada";
				
			}
			case 4-> {
				tipo = "Costelinha";
				
			}
			case 5-> {
				tipo = "Bacon";
				
			}
			
			}
		break;
		}
		
		System.out.println(Cores.TEXT_YELLOW_BOLD+"***************************************************************************"+Cores.TEXT_RESET);
		System.out.println("Produto número "+ getNumeroPedido()+" = "+getQuantidade()+"kg(s) de "+tipo+" Preço R$"+getPreco());
		System.out.println(Cores.TEXT_YELLOW_BOLD+"***************************************************************************"+Cores.TEXT_RESET);
		
	}

}

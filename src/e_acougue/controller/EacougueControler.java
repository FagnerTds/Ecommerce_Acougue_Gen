package e_acougue.controller;

import java.util.ArrayList;
import java.util.List;

import e_acougue.model.Produtos;
import e_acougue.repository.EacougueRepository;
import e_acougue.util.Cores;

public class EacougueControler implements EacougueRepository {

	private ArrayList<Produtos> listaAcougue = new ArrayList<Produtos>();
	int numero = 0;
	double somaTotal=0;
	
	@Override
	public void visualizarPedidos() {
		for(var produto: listaAcougue) {
			produto.visualizar();
		}
		
	}

	@Override
	public void deletarPedidos(int numero) {
		
		var acougue = buscarCollection(numero);
		
		if(acougue!=null) {
			listaAcougue.remove(acougue);	
			System.out.println(Cores.TEXT_GREEN+"\nO produto número "+numero+" Foi deletado com sucesso\n\n"+Cores.TEXT_RESET);
			}else System.out.println("O produto número "+numero+" não foi encontrado");
		
	}

	@Override
	public void finalizarPedidos() {
		
		
	}

	@Override
	public void adicionarPedidos(Produtos produtos) {
		listaAcougue.add(produtos);
		System.out.println(Cores.TEXT_CYAN+"Produto adicionado a pedidos\n\n"+ Cores.TEXT_RESET );
		
	}
	
	public int gerarNumero(){	
		return ++ numero;
	}
	
	public Produtos buscarCollection(int numero) {
		for(var acougue: listaAcougue) {
			if(acougue.getNumeroPedido()==numero) {
				return acougue;
			}
		}return null;
		}
		
	public double calcularTotal(List<Produtos> produtos) {
		for(var acougue: listaAcougue) {
			somaTotal+= acougue.getPreco();
		}
		return somaTotal;
	}
	
	public void visualizarPedidosFinal() {
		for(var produto: listaAcougue) {
			produto.visualizarFinal();
		}
	}

}

package e_acougue.repository;

import e_acougue.model.Produtos;

public interface EacougueRepository {
	
	public void adicionarPedidos(Produtos produtos);
	public void visualizarPedidos();
	public void deletarPedidos(int numero);
	
	public void finalizarPedidos();

}

package Model;

public interface Utilizadores {
	String getNumeroCartao();
    String getNome();
    boolean isNewsletter();
	void inserirEmprestimo(Emprestimo emp);
	Emprestimo pesquisarEmprestimo(String p) ;
    
}

// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Model;

import java.util.ArrayList;

public class Staff implements Utilizadores{

	//vari�veis
	private String Nome;
	private String NumeroCartao;
	private int Tipo;
	private int NumeroEmprestimos;
	private int PrazoEntrega;
	private boolean Newsletter;
	public ArrayList<Emprestimo> emprestimos;
	
	//construtor
	public Staff(String nome, String numeroCartao, int tipo) {
		PrazoEntrega = 0;
		Nome = nome;
		Newsletter = false;
		NumeroCartao = numeroCartao;
		Tipo = tipo;
		emprestimos = new ArrayList<Emprestimo>();
	}

	public void inserirEmprestimo(Emprestimo e) {//insere Emprestimo
    	emprestimos.add(e);
    }// fim do m�todo inserirEmprestimo
	
	public void imprimirEmprestimos() {//imprimir Emprestimos
		for (Emprestimo e: emprestimos) {
			System.out.println(e.toString());
		}
	}// fim do m�todo imprimirEmprestimos
	
	public Emprestimo pesquisarEmprestimo(Publicacao p) {// pesquisa emprestimos
		for (Emprestimo emp : emprestimos) {
            if (emp.getP().getTitulo().equals(p.getTitulo())) {
                return emp;
            }
        }
        return null;
	}// fim do m�todo pesquisarEmprestimo
	
	//getters e setters
	public int getPrazoEntrega() {
		return PrazoEntrega;
	}

	public void setPrazoEntrega(int prazoEntrega) {
		PrazoEntrega = prazoEntrega;
	}

	public boolean isNewsletter() {
		return Newsletter;
	}

	public void setNewsletter(boolean newsletter) {
		Newsletter = newsletter;
	}

	public int getNumeroEmprestimos() {
		return NumeroEmprestimos;
	}

	public void setNumeroEmprestimos(int numeroEmprestimos) {
		NumeroEmprestimos = numeroEmprestimos;
	}

	public String getNome() {
		return Nome;
	}

	public String getNumeroCartao() {
		return NumeroCartao;
	}

	public int getTipo() {
		return Tipo;
	}

	@Override
	public String toString() {
		return "Staff [Nome=" + Nome + ", NumeroCartao=" + NumeroCartao + ", Tipo=" + Tipo + ", NumeroEmprestimos="
				+ NumeroEmprestimos + ", PrazoEntrega=" + PrazoEntrega + ", Newsletter=" + Newsletter + "]";
	}

	//to String
	@Override
	public Emprestimo pesquisarEmprestimo(String p) {
		
		return null;
	}

}//fim da classe

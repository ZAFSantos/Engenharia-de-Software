package Model;

public class Emprestimo {
	Utilizadores u;
	Publicacao p;
	private boolean emprestimo;
	
	public Emprestimo(Utilizadores u, Publicacao p) {
		this.u = u;
		this.p = p;
		emprestimo = false;
	}

	public Utilizadores getU() {
		return u;
	}

	public void setU(Utilizadores u) {
		this.u = u;
	}

	public Publicacao getP() {
		return p;
	}


	public boolean isEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(boolean emprestimo) {
		emprestimo = true;
	}

	@Override
	public String toString() {
		return "Emprestimo [utilizador=" + u + ", publicacao=" + p + ", emprestimo=" + emprestimo + "]";
	}
	
	
}

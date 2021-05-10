// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Model;

public class PublicacaoPeriodica implements Publicacao {

	private String Titulo;
	private String Autor;
	private String Editor;
	private String Tipo;
	private String DataRepublicacao;
	
	public PublicacaoPeriodica(String titulo, String autor, String editor,  String tipo, String dataRepublicacao) {
		Autor = autor;
		Editor = editor;
		Titulo = titulo;
		Tipo = tipo;
		DataRepublicacao = dataRepublicacao;
	}

	public String getAutor() {
		return Autor;
	}

	public String getEditor() {
		return Editor;
	}

	public String getTitulo() {
		return Titulo;
	}

	public String getTipo() {
		return Tipo;
	}

	public String getDataRepublicacao() {
		return DataRepublicacao;
	}


	@Override
	public String toString() {
		return "PublicacaoPeriodica [Titulo=" + Titulo + ", Autor=" + Autor + ", Editor=" + Editor + ", Tipo=" + Tipo
				+ ", DataRepublicacao=" + DataRepublicacao + "]";
	}
	
};

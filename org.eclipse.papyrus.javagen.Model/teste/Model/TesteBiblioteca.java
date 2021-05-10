package Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;


class TesteBiblioteca {

	GerirBiblioteca gb;

	@BeforeAll
	public static void beforeAll() {
		System.out.println("Inicializar testes");
	}
	
    @BeforeEach
    public void setup() {
        System.out.println("Inicializa a GB antes de cada teste");
        gb= new GerirBiblioteca();
    }

    @Test
    @DisplayName ("teste para ver se o utilizador foi registado")
    void testRegistarUtilizador() {
        gb.adicionarUtilizador("E,Ze,103,Informatica");
        assertTrue(gb.pesquisarUtilizadores("103"));
    }

    @Test
    @DisplayName ("teste para ver se a publicaçao foi registada")
    void testRegistarPublicacao() {
        gb.adicionarPublicacao("L,HarryPotter,JKRowling,BAss,Aventura,1234");
        assertTrue(gb.pesquisarPublicacoes("HarryPotter"));
    }

    @Test
    @DisplayName ("teste para ver se o livro foi emprestado")
    void testEmprestar() {
    	gb.adicionarUtilizador("E,Ze,103,Informatica");
    	gb.adicionarPublicacao("L,HarryPotter,JKRowling,BAss,Aventura,1234");
    	gb.inserirLivroUtilizador("103", "HarryPotter");
    	assertTrue(gb.pesquisarLivrosEmprestados("HarryPotter", "103"));
    }
    
    @AfterAll
	public static void afterAll() {
		System.out.println("Finalizar testes");
	}
}

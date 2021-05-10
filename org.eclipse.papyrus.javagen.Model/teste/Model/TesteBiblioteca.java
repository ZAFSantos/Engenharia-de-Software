package Model;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class TesteBiblioteca {

	GerirBiblioteca gb;

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

    @Disabled
    @Test
    @DisplayName ("teste para ver se o livro foi emprestado")
    void testEmprestar() {

    }
}

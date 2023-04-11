import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TosaHigienicaTest {

    @Test
    void deveRetornarPrecoTosaHigienicaPortePequenoPelagemCurta() {
        Porte porte = new PortePequeno();
        Pelagem pelagem = new PelagemCurta();
        TosaHigienica tosaHigienica = new TosaHigienica(20.0f);
        tosaHigienica.setPorte(porte);
        tosaHigienica.setPelagem(pelagem);
        assertEquals(20.0f, tosaHigienica.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoTosaHigienicaPortePequenoPelagemMedia() {
        Porte porte = new PortePequeno();
        Pelagem pelagem = new PelagemMedia();
        TosaHigienica tosaHigienica = new TosaHigienica(20.0f);
        tosaHigienica.setPorte(porte);
        tosaHigienica.setPelagem(pelagem);
        assertEquals(20.0f, tosaHigienica.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoTosaHigienicaPortePequenoPelagemLonga() {
        Porte porte = new PortePequeno();
        Pelagem pelagem = new PelagemLonga();
        TosaHigienica tosaHigienica = new TosaHigienica(20.0f);
        tosaHigienica.setPorte(porte);
        tosaHigienica.setPelagem(pelagem);
        assertEquals(20.0f, tosaHigienica.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoTosaHigienicaPorteMedioPelagemCurta() {
        Porte porte = new PorteMedio();
        Pelagem pelagem = new PelagemCurta();
        TosaHigienica tosaHigienica = new TosaHigienica(20.0f);
        tosaHigienica.setPorte(porte);
        tosaHigienica.setPelagem(pelagem);
        assertEquals(20.0f, tosaHigienica.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoTosaHigienicaPorteMedioPelagemMedia() {
        Porte porte = new PorteMedio();
        Pelagem pelagem = new PelagemMedia();
        TosaHigienica tosaHigienica = new TosaHigienica(20.0f);
        tosaHigienica.setPorte(porte);
        tosaHigienica.setPelagem(pelagem);
        assertEquals(20.0f, tosaHigienica.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoTosaHigienicaPorteMedioPelagemLonga() {
        Porte porte = new PorteMedio();
        Pelagem pelagem = new PelagemLonga();
        TosaHigienica tosaHigienica = new TosaHigienica(20.0f);
        tosaHigienica.setPorte(porte);
        tosaHigienica.setPelagem(pelagem);
        assertEquals(20.0f, tosaHigienica.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoTosaHigienicaPorteGrandePelagemCurta() {
        Porte porte = new PorteGrande();
        Pelagem pelagem = new PelagemCurta();
        TosaHigienica tosaHigienica = new TosaHigienica(20.0f);
        tosaHigienica.setPorte(porte);
        tosaHigienica.setPelagem(pelagem);
        assertEquals(20.0f, tosaHigienica.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoTosaHigienicaPorteGrandePelagemMedia() {
        Porte porte = new PorteGrande();
        Pelagem pelagem = new PelagemMedia();
        TosaHigienica tosaHigienica = new TosaHigienica(20.0f);
        tosaHigienica.setPorte(porte);
        tosaHigienica.setPelagem(pelagem);
        assertEquals(20.0f, tosaHigienica.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoTosaHigienicaPorteGrandePelagemLonga() {
        Porte porte = new PorteGrande();
        Pelagem pelagem = new PelagemLonga();
        TosaHigienica tosaHigienica = new TosaHigienica(20.0f);
        tosaHigienica.setPorte(porte);
        tosaHigienica.setPelagem(pelagem);
        assertEquals(20.0f, tosaHigienica.calcularPreco(), 0.01f);
    }
}
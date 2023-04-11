import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TosaTest {

    @Test
    void deveRetornarPrecoTosaPortePequenoPelagemCurta() {
        Porte porte = new PortePequeno();
        Pelagem pelagem = new PelagemCurta();
        Tosa tosa = new Tosa(40.0f);
        tosa.setPorte(porte);
        tosa.setPelagem(pelagem);
        assertEquals(52.0f, tosa.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoTosaPortePequenoPelagemMedia() {
        Porte porte = new PortePequeno();
        Pelagem pelagem = new PelagemMedia();
        Tosa tosa = new Tosa(40.0f);
        tosa.setPorte(porte);
        tosa.setPelagem(pelagem);
        assertEquals(56.0f, tosa.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoTosaPortePequenoPelagemLonga() {
        Porte porte = new PortePequeno();
        Pelagem pelagem = new PelagemLonga();
        Tosa tosa = new Tosa(40.0f);
        tosa.setPorte(porte);
        tosa.setPelagem(pelagem);
        assertEquals(60.0f, tosa.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoTosaPorteMedioPelagemCurta() {
        Porte porte = new PorteMedio();
        Pelagem pelagem = new PelagemCurta();
        Tosa tosa = new Tosa(40.0f);
        tosa.setPorte(porte);
        tosa.setPelagem(pelagem);
        assertEquals(52.0f, tosa.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoTosaPorteMedioPelagemMedia() {
        Porte porte = new PorteMedio();
        Pelagem pelagem = new PelagemMedia();
        Tosa tosa = new Tosa(40.0f);
        tosa.setPorte(porte);
        tosa.setPelagem(pelagem);
        assertEquals(56.0f, tosa.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoTosaPorteMedioPelagemLonga() {
        Porte porte = new PorteMedio();
        Pelagem pelagem = new PelagemLonga();
        Tosa tosa = new Tosa(40.0f);
        tosa.setPorte(porte);
        tosa.setPelagem(pelagem);
        assertEquals(60.0f, tosa.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoTosaPorteGrandePelagemCurta() {
        Porte porte = new PorteGrande();
        Pelagem pelagem = new PelagemCurta();
        Tosa tosa = new Tosa(40.0f);
        tosa.setPorte(porte);
        tosa.setPelagem(pelagem);
        assertEquals(52.0f, tosa.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoTosaPorteGrandePelagemMedia() {
        Porte porte = new PorteGrande();
        Pelagem pelagem = new PelagemMedia();
        Tosa tosa = new Tosa(40.0f);
        tosa.setPorte(porte);
        tosa.setPelagem(pelagem);
        assertEquals(56.0f, tosa.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoTosaPorteGrandePelagemLonga() {
        Porte porte = new PorteGrande();
        Pelagem pelagem = new PelagemLonga();
        Tosa tosa = new Tosa(40.0f);
        tosa.setPorte(porte);
        tosa.setPelagem(pelagem);
        assertEquals(60.0f, tosa.calcularPreco(), 0.01f);
    }
}
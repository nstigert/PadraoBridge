import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BanhoTest {

    @Test
    void deveRetornarPrecoBanhoPortePequenoPelagemCurta() {
        Porte porte = new PortePequeno();
        Pelagem pelagem = new PelagemCurta();
        Banho banho = new Banho(30.0f);
        banho.setPorte(porte);
        banho.setPelagem(pelagem);
        assertEquals(39.0f, banho.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoBanhoPortePequenoPelagemMedia() {
        Porte porte = new PortePequeno();
        Pelagem pelagem = new PelagemMedia();
        Banho banho = new Banho(30.0f);
        banho.setPorte(porte);
        banho.setPelagem(pelagem);
        assertEquals(42.0f, banho.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoBanhoPortePequenoPelagemLonga() {
        Porte porte = new PortePequeno();
        Pelagem pelagem = new PelagemLonga();
        Banho banho = new Banho(30.0f);
        banho.setPorte(porte);
        banho.setPelagem(pelagem);
        assertEquals(45.0f, banho.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoBanhoPorteMedioPelagemCurta() {
        Porte porte = new PorteMedio();
        Pelagem pelagem = new PelagemCurta();
        Banho banho = new Banho(30.0f);
        banho.setPorte(porte);
        banho.setPelagem(pelagem);
        assertEquals(42.0f, banho.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoBanhoPorteMedioPelagemMedia() {
        Porte porte = new PorteMedio();
        Pelagem pelagem = new PelagemMedia();
        Banho banho = new Banho(30.0f);
        banho.setPorte(porte);
        banho.setPelagem(pelagem);
        assertEquals(45.0f, banho.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoBanhoPorteMedioPelagemLonga() {
        Porte porte = new PorteMedio();
        Pelagem pelagem = new PelagemLonga();
        Banho banho = new Banho(30.0f);
        banho.setPorte(porte);
        banho.setPelagem(pelagem);
        assertEquals(48.0f, banho.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoBanhoPorteGrandePelagemCurta() {
        Porte porte = new PorteGrande();
        Pelagem pelagem = new PelagemCurta();
        Banho banho = new Banho(30.0f);
        banho.setPorte(porte);
        banho.setPelagem(pelagem);
        assertEquals(45.0f, banho.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoBanhoPorteGrandePelagemMedia() {
        Porte porte = new PorteGrande();
        Pelagem pelagem = new PelagemMedia();
        Banho banho = new Banho(30.0f);
        banho.setPorte(porte);
        banho.setPelagem(pelagem);
        assertEquals(48.0f, banho.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoBanhoPorteGrandePelagemLonga() {
        Porte porte = new PorteGrande();
        Pelagem pelagem = new PelagemLonga();
        Banho banho = new Banho(30.0f);
        banho.setPorte(porte);
        banho.setPelagem(pelagem);
        assertEquals(51.0f, banho.calcularPreco(), 0.01f);
    }
}
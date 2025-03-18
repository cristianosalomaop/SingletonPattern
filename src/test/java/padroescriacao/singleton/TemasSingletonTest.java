package padroescriacao.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemasSingletonTest {

    @Test
    public void deveRetornarTemaAtual() {
        TemasSingleton.getInstance().setTemaAtual("Escuro");
        assertEquals("Escuro", TemasSingleton.getInstance().getTemaAtual());
    }

    @Test
    public void deveManterInstanciaUnica() {
        TemasSingleton tema1 = TemasSingleton.getInstance();
        TemasSingleton tema2 = TemasSingleton.getInstance();

        assertSame(tema1, tema2);
    }
}

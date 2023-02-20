package tests.ExemploListaDuplaEncadeada;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.ExemploListaDuplaEncadeada.ListaDuplaEncadeada;

public class ListaDuplaEncadeadaTest {
    
    ListaDuplaEncadeada<String> minhaLista = new ListaDuplaEncadeada<>();

    @Test
    public void metodoGetDeveRetornarGisele() {
        minhaLista.add("Lucas");
        minhaLista.add("Gisele");
        assertEquals("Gisele", minhaLista.get(1));
    }

    @Test
    public void tamanhoListaDeveSerDois() {
        minhaLista.add("Lucas");
        minhaLista.add("Gisele");
        assertEquals(2, minhaLista.size());
    }

    @Test
    public void pessoaGiseleDeveSerRemovida() {
        minhaLista.add("Lucas");
        minhaLista.add("Gisele");
        minhaLista.add("Bruna");
        minhaLista.remove(1);

        assertNotEquals("Gisele", minhaLista.get(1));

    }


}

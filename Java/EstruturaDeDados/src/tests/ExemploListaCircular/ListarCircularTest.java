package tests.ExemploListaCircular;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ExemploListaCircular.ListaCircular;

public class ListarCircularTest {

    ListaCircular<String> minhaLista = new ListaCircular<>();

    @Test
    public void oTamanhoDaListaDeveSerZero() {
        assertEquals(0, minhaLista.size());
    }

}
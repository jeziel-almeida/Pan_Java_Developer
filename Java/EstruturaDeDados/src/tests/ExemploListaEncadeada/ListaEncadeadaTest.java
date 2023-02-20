package tests.ExemploListaEncadeada;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ExemploListaEncadeada.ListaEncadeada;

public class ListaEncadeadaTest {
    
    ListaEncadeada<String> minhaLista = new ListaEncadeada<>();

    @Test
    public void tamanhoListaDeveSerZero() {
        assertEquals(0, minhaLista.size());
    }

    @Test
    public void tamanhoListaDeveSerTres() {
        minhaLista.add("Lucas");
        minhaLista.add("João");
        minhaLista.add("Luíza");
        assertEquals(3, minhaLista.size());
    }

    @Test
    public void metodoGetDeveRetornarJoao() {
        minhaLista.add("Lucas");
        minhaLista.add("João");
        minhaLista.add("Luíza");
        assertEquals("João", minhaLista.get(1));
    }

    @Test
    public void pessoaRemovidaDeveSerLuiza() {
        minhaLista.add("Lucas");
        minhaLista.add("João");
        minhaLista.add("Luíza");
        assertEquals("Luíza", minhaLista.remove(2));
    }
}

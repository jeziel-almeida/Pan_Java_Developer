package com.FactoryMethod

class ProdutoECategoria {
  
  public static void main(String[] args) {
    Categoria categoria = new Digital();
    Produto produto = new categoria.novoProduto();
  }
}

// Produto abstrato
interface Produto {
}

// Produto concreto
class ProdutoDigital implements Produto {
}

class ProdutoFisico implements Produto {
}

// Criador abstrato
interface Categoria {
  Produto novoProduto();
}

// Criador concreto
class Digital implements Categoria {
  @Override
  public Produto novoProduto() {
    return new ProdutoDigital();
  }
}

class Fisico implements Categoria {
  @Override
  public Produto novoProduto() {
    return new ProdutoFisico();
  }
}

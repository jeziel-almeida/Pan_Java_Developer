package com.ExemploArvore;

public class ArvoreBinaria<T extends Comparable<T>> {
    
    private No<T> raiz = null;


    public void inserir(T conteudo) {

        No<T> novoNo = new No<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private No<T> inserir(No<T> atual, No<T> novoNo) {
        
        if(atual == null) {
            return novoNo;
        } else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }

        return atual;
    }

    public void exibirEmOrdem() {

        System.out.println("\n -- Exibindo em ordem --");
        exibirEmOrdem(raiz);
        System.out.println();
    }

    private void exibirEmOrdem(No<T> atual) {
        if(atual != null) {
            exibirEmOrdem(atual.getNoEsq());
            System.out.print("("+atual.getConteudo()+") ");
            exibirEmOrdem(atual.getNoDir());
        }
    }

    public void exibirEmPosOrdem() {

        System.out.println("\n -- Exibindo em pós ordem --");
        exibirEmPosOrdem(raiz);
        System.out.println();
    }

    private void exibirEmPosOrdem(No<T> atual) {
        if(atual != null) {
            exibirEmPosOrdem(atual.getNoEsq());
            exibirEmPosOrdem(atual.getNoDir());
            System.out.print("("+atual.getConteudo()+") ");
        }

    }

    public void exibirEmPreOrdem() {

        System.out.println("\n -- Exibindo em pré ordem --");
        exibirEmPreOrdem(raiz);
        System.out.println();
    }

    private void exibirEmPreOrdem(No<T> atual) {
        if(atual != null) {
            System.out.print("("+atual.getConteudo()+") ");
            exibirEmPreOrdem(atual.getNoEsq());
            exibirEmPreOrdem(atual.getNoDir());
        }

    }

    public void remover(T conteudo) {
        try {

            No<T> atual = raiz;
            No<T> pai = null;
            No<T> filho = null;
            No<T> temp = null;

            while(atual != null && !atual.getConteudo().equals(conteudo)) {
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }
            }

            if(atual == null) {
                System.out.println("Conteúdo não encontrado. Bloco try");    
            }
        
            if(pai == null) {
                if(atual.getNoDir() == null) {
                    raiz = atual.getNoEsq();
                } else if(atual.getNoEsq() == null) {
                    raiz = atual.getNoDir();
                } else {
                    for(temp = atual, filho = atual.getNoEsq(); 
                        filho.getNoDir() != null; 
                        temp = filho, filho = filho.getNoEsq()) {

                            if(filho != atual.getNoEsq()) {
                                temp.setNoDir(filho.getNoEsq());
                                filho.setNoEsq(raiz.getNoEsq());
                            }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
            } else if(atual.getNoDir() == null) {
                if(pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoEsq());
                } else {
                    pai.setNoDir(atual.getNoEsq());
                }
            } else if(atual.getNoEsq() == null) {
                if(pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoDir());
                } else {
                    pai.setNoDir(atual.getNoDir());
                }
            } else {
                for(temp = atual, filho = atual.getNoEsq(); 
                    filho.getNoDir() != null; 
                    temp = filho, filho = filho.getNoDir()) {

                        if(filho != atual.getNoEsq()) {
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(atual.getNoEsq());
                        }
                        filho.setNoDir(atual.getNoDir());
                        if(pai.getNoEsq() == atual) {
                            pai.setNoEsq(filho);
                        } else {
                            pai.setNoDir(filho);
                        }
                }
            }

        } catch(NullPointerException erro) {
            System.out.println("Conteúdo não encontrado. Bloco catch");
        }
    }
}

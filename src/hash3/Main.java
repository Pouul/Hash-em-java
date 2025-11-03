package hash3;

public class Main{
    public static void main(String[] args){
        Hash dicionario = new Hash(13);
        dicionario.inserir(0, 1);
        dicionario.inserir(0, 3);
        dicionario.inserir(1, 2);
        dicionario.inserir(1, 4);
        dicionario.remover(2);
        dicionario.imprimir();
        
    }
}
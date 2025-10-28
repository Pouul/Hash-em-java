package hash1;

public class Main{
    public static void main(String[] args){
        Hash dicionario = new Hash(5);
        dicionario.inserir(1, 1);
        dicionario.inserir(1, 3);
        dicionario.inserir(2, 0);
        dicionario.inserir(2, 2);
        dicionario.remover(2);
        dicionario.imprimir();
        
    }
}

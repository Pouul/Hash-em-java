package hash1;

import java.util.ArrayList;

class Hash{
    HashNo[] vetorNos;
    int tamanhoDi;
    boolean vazia;

    Hash(int m){
        this.vetorNos = new HashNo[m];
        this.tamanhoDi = m;
        this.vazia = true;

    }




    public void inserir(int chave, int valor){
        int hChave = chave % this.tamanhoDi;
        if (vetorNos[hChave] == null){
            vetorNos[hChave] = new HashNo();
        }

        vetorNos[hChave].lista.add(valor);
        vazia = false;
    
    }

    public HashNo buscar(int valor){
        if (this.vazia){
            System.out.println("vetor de Nos vazia");
            return null;
        }
        else {
            for (int i = 0; i < this.tamanhoDi; i++) {
                HashNo atual = vetorNos[i];
                if (atual == null) continue;
                for(int j = 0; j < atual.lista.size(); j++){

                    if(atual.lista.get(j) == valor){
                        System.out.printf("valor localizado no index: %d ", j);
                        return atual;
                    }
                }
            }
            
            System.out.println("valor não encontrado");
            return null;
        }
    }

    public void remover(int valor){
        if (this.vazia){
            System.out.println("vetor de Nos vazia");
            return;
        }
        else {
            for (int i = 0; i < this.tamanhoDi; i++) {
                HashNo atual = vetorNos[i];
                if (atual == null) continue;
                for(int j = 0; j < atual.lista.size(); j++){

                    if(atual.lista.get(j) == valor){
                        atual.lista.remove(j);
                        return;
                    }
                }
            }

            System.out.println("valor não encontrado");
            return;
        }
    }


    public void imprimir(){
        if (this.vazia){
            System.out.println("vetor de Nos vazia");
            return;
        }
        for (int i = 0; i < this.tamanhoDi; i++) {
            HashNo atual = vetorNos[i];
            if (atual == null) continue;
            System.out.printf("%dº palavra :", i);

            for(int j = 0; j < atual.lista.size(); j++){

                System.out.printf("%d ",atual.lista.get(j));

            }
            System.out.println(" ");
        }
    }

}


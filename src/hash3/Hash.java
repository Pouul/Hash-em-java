package hash3;

class Hash{
    int[] vetorNos;
    int tamanhoDi;
    boolean vazia;

    Hash(int m){
        this.vetorNos = new int[m];
        this.tamanhoDi = m;
        this.vazia = true;
    }

    public void inserir(int chave, int valor){
        
        int k = 0;
        int h1Chave = chave % 13;
        int h2Chave = chave % 11 + 1;
        int hResultante = h1Chave + k * h2Chave;
        boolean inserido = false;

        if (vetorNos[hResultante] == 0){
            vetorNos[hResultante] = valor;
            vazia = false;
        }

        else{
            while(inserido != true && hResultante < this.tamanhoDi){
                    k++;
                    hResultante = h1Chave + k * h2Chave;

                    if (vetorNos[hResultante] == 0){
                        vetorNos[hResultante] = valor;
                        vazia = false;
                        inserido = true;
                    }
                }
            }

            if (inserido == false){
                System.out.println("vetor colisão cheio");
                
        }
    }
    


    public void remover(int valor){
        if (this.vazia){
            System.out.println("vetor de Nos vazia");
            return;
        }
        else {
            for (int i = 0; i < this.tamanhoDi; i++) {
                if (this.vetorNos[i] == 0) continue;
                if (this.vetorNos[i] == valor){
                    this.vetorNos[i] = 0;
                    return;
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
            
            if (vetorNos[i] == 0) continue;
            System.out.printf("%dº elemento do Hash : %d \n", i, vetorNos[i]);
        }
    }
}


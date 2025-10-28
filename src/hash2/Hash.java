package hash2;


class Hash{
    int[] vetorNos;
    int p;
    int s;
    int tamanhoDi;
    boolean vazia;

    Hash(int m){
        this.vetorNos = new int[m];
        this.tamanhoDi = m;
        this.p = m/2;
        this.s = m/2 + 1;
        this.vazia = true;
    }

    public void inserir(int chave, int valor){
        int count = 0;
        int tamanhoVetor2 = this.s;
        

        int hChave = chave % (this.tamanhoDi/2);
        boolean inserido = false;
        if (vetorNos[hChave] == 0){
            vetorNos[hChave] = valor;
            vazia = false;
        }

        else{
            while(inserido != true && count != this.s - 1){
                if(vetorNos[tamanhoVetor2-1] == 0){
                    vetorNos[tamanhoVetor2-1] = valor;
                    inserido = true;
                }
                tamanhoVetor2++;
                count++;
            }

            if (inserido == false){
                System.out.println("vetor colisão cheio");
                
            }
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


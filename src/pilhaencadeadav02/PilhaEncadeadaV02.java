package pilhaencadeadav02;

public class PilhaEncadeadaV02 {

    public static void main(String[] args) {
        new PilhaEncadeadaV02();
    }

    public PilhaEncadeadaV02() {

        Pilha pilha1 = new Pilha();  // cria uma pilha, inicialmente vazia        
        pilha1.push(5);
        pilha1.push(7);
        pilha1.push(9);
        pilha1.push(12);
        pilha1.push(4);
        System.out.println("A pilha de objetos inteiros é " + pilha1.toString());
        System.out.println("A qtde de objetos na 1ª pilha é " + pilha1.size());
        System.out.println("O valor no topo da pilha é " + pilha1.top().toString());
        System.out.println("O vetor de objetos retornado pela função toArray():");
        Object vetor[] = pilha1.toArray();
        visualizarVetor(vetor);
        while (!pilha1.isEmpty()) { // repetir enquanto a pilha não estiver vazia
            System.out.println("Retirado o valor " + pilha1.pop().toString() + " da pilha de objetos inteiros");
        }

        Pilha pilha2 = new Pilha();  // cria uma pilha, inicialmente vazia        
        pilha2.push(new Aluno(123, "Nicolas", "CCP", 9.2f));
        pilha2.push(new Aluno(456, "Renata", "ADS", 5.8f));
        pilha2.push(new Aluno(789, "Luiz", "CCP", 6.5f));
        pilha2.push(new Aluno(890, "Vanda", "ARQ", 9.5f));
        System.out.println("\nPilha de alunos \n" + pilha2.toString2());
        System.out.println("A qtde de objetos na 2ª pilha é " + pilha2.size());
        System.out.println("O valor no topo da pilha é " + pilha2.top().toString());
        System.out.println("O vetor de objetos retornado pela função toArray():");        
        visualizarVetor(pilha2.toArray());

        while (!pilha2.isEmpty()) { // repetir enquanto a pilha não estiver vazia
            System.out.println("Retirado o valor " + pilha2.pop().toString() + " da pilha de alunos");
        }

    }

    public void visualizarVetor(Object vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }

}

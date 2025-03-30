package pilhaencadeadav02;
// A classe Pilha implementa uma pilha dinâmica enlaçada 

class Pilha implements TAD_Pilha {  //a classe Pilha implementa o TAD_Pilha
//Nesta versão da classe Pilha adicionamos o atributo count e os métodos
//size e toArray, em forma similar à classe Stack da Oracle. 

    private Node topo = null;
    private int count = 0;

    public int size() { //retorna a quantidade de objetos guardados na pilha
      return count;
    }
    
    public Object[] toArray() {
    //retorna um vetor com os objetos guardados na pilha, o que poderá
    //ser útil para ordenar ou processar os dados
      if(isEmpty())return null; //operação imposível se a pilha estiver vazia
      Object vet[] = new Object[count];
      Node aux = topo;
      for(int i=0; i<count; i++) {
          vet[count - i - 1] = aux.getValue();
          aux = aux.getNext();
      }
      return vet;
    }

    public Pilha() {
        topo = null;
    }

    public boolean isEmpty() { //verifica se a pilha está vazia
        return (topo == null);
        // ou também: if(topo == null) return true; else return false;
    }

    public Node push(Object x) {
        try {
            if (x == null) {
                return null; //não permitimos novo objeto nulo
            }
            if (Runtime.getRuntime().freeMemory() < x.toString().length() + 1024) {
                return null;
            }
            Node novo = new Node(); //alocamos memória para um novo nodo
            novo.setValue(x); //atribuímos valor para o novo nó                   
            novo.setNext(topo); //no caso de pilha vazia (topo == null) também funciona   
            topo = novo;
            count++;
            return novo;
        } catch (Exception ex) {
            return null;  // memória insuficiente ou qualquer outro erro
        }
    }

    public Object pop() {
        if (topo == null) return null; // se a pilha estiver vazia retornamos null
        Object valor = topo.getValue();
        topo = topo.getNext(); // avançar o topo para o próximo da pilha
        count--;
        return valor;  // retornamos o valor do elemento que estava no topo
    }

    public Object top() { // retornamos o valor no topo, sem eliminá-lo
        if (topo == null) {
            return null;
        } else {
            return topo.getValue();
        }
        // ou:  if(isEmpty()) return null; else return topo.getValue();
    }

    public String toString() {
        //Este método retorna os itens guardados na pilha, com a convenção p: [ a, b, c, topo ]
        if (!isEmpty()) {
            String resp = "";
            Node aux = topo;
            while (aux != null) {
                resp = aux.getValue().toString() + resp;
                aux = aux.getNext();
                if (aux != null) {
                    resp = ", " + resp;
                }
            }
            return ("p: [ " + resp + " ]");
        } else {
            return ("p: [ ]");
        }
    }

    public String toString2() {
        /*
                Este método retorna os itens guardados na pilha, com a convenção 
                p: [ 
                    a
                    b
                    c
                    topo
                ]
            
                Mais apropiado para retornar objetos em diferentes linhas, com \n
         */
        if (!isEmpty()) {
            String resp = "";
            Node aux = topo;
            while (aux != null) {
                resp = aux.getValue().toString() + "\n" + resp;
                aux = aux.getNext();
            }
            return ("p: [\n" + resp + "]");
        } else {
            return ("p: [ ]");
        }
    }

}

import java.util.*;

public class MyClass {
  public static void main(String[] args) {
    ArrayList < Integer > lista = new ArrayList < > (5);
    System.out.println("Inserindo na lista");
    lista.add(1);
    lista.add(2);
    lista.add(3);
    lista.add(4);
    lista.add(5);
    System.out.println(lista);
    System.out.println("Removendo da lista");
    while (!lista.isEmpty()) {
      int elemento = lista.remove(0);
      System.out.println(lista);
    }
    System.out.println("Lista vazia");

    System.out.println("Inserindo os dados da lista na pilha");
    ArrayDeque < Integer > pilha = new ArrayDeque < > (5);
    pilha.push(1);
    pilha.push(2);
    pilha.push(3);
    pilha.push(4);
    pilha.push(5);
    System.out.println(pilha);
    System.out.println("Remove os dados da pilha");
    pilha.clear();
    System.out.println(pilha);
    while (!pilha.isEmpty()) {
      int elemento = pilha.pop();
      System.out.println(pilha);
    }
    System.out.println("Inserindo os dados da pilha na fila");
    ArrayDeque < Integer > fila = new ArrayDeque < > (10);
    fila.add(1);
    fila.add(2);
    fila.add(3);
    fila.add(4);
    fila.add(5);
    fila.add(0);
    fila.add(0);
    fila.add(0);
    fila.add(0);
    fila.add(0);
    System.out.println(fila);
    System.out.println("Adicionando os números 6,7,8,9,10 na lista");
    lista.add(6);
    lista.add(7);
    lista.add(8);
    lista.add(9);
    lista.add(10);
    System.out.println(lista);
    System.out.println("Removendo da lista");
    while (!lista.isEmpty()) {
      int elemento = lista.remove(0);
      System.out.println(lista);
    }
    System.out.println("Lista vazia");
    System.out.println("Inserindo os dados da lista na pilha");
    pilha.push(6);
    pilha.push(7);
    pilha.push(8);
    pilha.push(9);
    pilha.push(10);
    System.out.println(pilha);
    System.out.println("Removendo os dados da pilha");
    pilha.clear();
    System.out.println(pilha);
    System.out.println("Inserindo os dados da pilha na fila");
    fila.add(0);
    fila.add(0);
    fila.add(0);
    fila.add(0);
    fila.add(0);
    fila.add(6);
    fila.add(7);
    fila.add(8);
    fila.add(9);
    fila.add(10);
    System.out.println(fila);
  }
}
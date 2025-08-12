package oriented_object_programm

class Pilha<T>(vararg  items: T){

    // classe pilha tem o mesmo fundamento da Stack , apeans para exemplo do uso de generics e conceitos de DRY em KOTLIN expostos na aula Stack.kt


    val elements = items.toMutableList()

    fun push(element: T){
        elements.add(element)

    }

    fun pop():  T? {
        if(!isEmpty()){
              return elements.removeAt(elements.size - 1) // remove o último elemento da pilha e o retorna - tamanho total da pilha (que começa em 0 e - 1)
// pilha é um LIFO (Last In First Out), ou seja, o último elemento adicionado é o primeiro a ser removido
        }
        return null;


    }

    fun isEmpty(): Boolean{
        return elements.isEmpty()


    }

}


fun main() {
    val pilha = Pilha(1,2,3,4)
    val pilhaString = Pilha("A", "B", "C")
    pilhaString.push("Hello")
    println(pilha.pop())
    println(pilha.pop())
    println(pilha.pop())
    println(pilha.pop())
    println(pilha.pop()) // tenta remover um elemento de uma pilha vazia, retornando null



}
package oriented_object_programm



// DRY -> não repetir código, encapsulando a lógica de pilha em uma classe
    class Stack<E>{


/*
    Com essa logica eu defino uma classe como um tipi generico e posso usar qualquer tipo de dado como
    parametro em uma classe filha que a for herdar

    Exemplo de uso:

    val intStack = Stack<Int>()
    intStack.push(1)
    intStack.push(2)
    intStack.push(3)
    intStack.pop() // remove o último item adicionado
    println(intStack) // imprime o estado atual da pilha
    val stringStack = Stack<String>()
    stringStack.push("Hello")
    stringStack.push("World")
    stringStack.pop() // remove o último item adicionado
    println(stringStack) // imprime o estado atual da pilha

    acima temos exemplo da mesma classe e mesmo metodo manipulando diferentes tipos de dados, como Int e String.
    Isso garante a não repetição de codigo

 */
        fun push(item: E){
            val array = arrayOf(1,2,3,);

        }

        fun pop(){


        }


    }


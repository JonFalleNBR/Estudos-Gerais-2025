public class No<T> {

    private T elemento;
    private No<T> proximo;


    public No(T elemento){
        this.elemento = elemento;
        this.proximo = null;
    }

    public No(T elemento, No<T> proximo){
        this.elemento = elemento;
        this.proximo =  proximo;
// por que não usar o this.proximo = proximo; ?

    }


    public T getElemento() {
        return elemento;
    }

    public No<T> getProximo() {
        return proximo;
    }


    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("No [Elemento =").append(elemento).append(", Proximo = ")
                .append(proximo != null ? proximo.getElemento() : "null").append("]"); // validação ternaria que verifica se é null ou não, meio desnecssaro
        return sb.toString();
    }

    // elemento irá guardar o vlaor do nó - qe pode ser de qualquer tipo
}

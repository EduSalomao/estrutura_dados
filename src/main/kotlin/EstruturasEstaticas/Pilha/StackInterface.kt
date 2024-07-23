package EstruturasEstaticas.Pilha

interface StackInterface {
    fun topo(): Any?
    fun empilhar(dado: Any)
    fun desempilhar(): Any?

    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun espiar(): Any?
    fun print(): String
}
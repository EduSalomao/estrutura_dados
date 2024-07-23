interface Empilhavel {
    fun topo(): Any?
    fun empilhar(dado: Any)
    fun desempilhar(): Any?
    fun atualizar(dado: Any?)
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun espiar(): Any?
    fun print(): String
}
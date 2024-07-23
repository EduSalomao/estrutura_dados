package EstruturasDinamicas.Listas.Lista

interface Listavel {
    fun enfileirar(dado: Any)
    fun desenfileirar(): Any?
    fun atualizar(dado: Any, posicao: Int)
    fun selecionarTodos(): List<Any>
    fun selecionar(posicao: Int): Any?
    fun estaVazia(): Boolean
    fun estaCheia(): Boolean
    fun imprimir(): String
}
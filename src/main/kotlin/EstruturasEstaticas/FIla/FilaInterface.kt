package EstruturasEstaticas.FIla

interface FilaInterface {
    fun enfileirar(dado: Any?)
    fun desenfileirar(): Any?
    fun espiar(): Any?

    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}
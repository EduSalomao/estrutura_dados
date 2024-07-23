package EstruturasEstaticas.ArvoreBinaria

interface Amontoavel {
    fun inserir(dado: Int)
    fun extrair(): Any?
    fun obter(): Any?
    fun atualizar(): Any?

    fun estaCheio(): Boolean
    fun estaVazio(): Boolean
    fun imprimir(): String
}
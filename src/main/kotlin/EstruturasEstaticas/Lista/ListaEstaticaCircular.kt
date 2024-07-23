package EstruturasEstaticas.Lista

class ListaEstaticaCircular(var tamanho: Int = 10) : ListaInterface {
    private var dados: Array<Any?> = arrayOfNulls(tamanho)
    private var quantidade = 0
    private var ponteiroInicio = 0
    private var ponteiroFim = -1

    override fun estaCheia(): Boolean {
        return quantidade == dados.size
    }

    override fun estaVazia(): Boolean {
        return quantidade == 0
    }

    override fun print(): String {
        TODO("Not yet implemented")
    }

    override fun anexar(dado: Any?) {
        if(!estaCheia()) {
            ponteiroFim++
            if (ponteiroFim == dados.size)
                ponteiroFim = 0
            dados[ponteiroFim] = dado
            quantidade++
        }
    }

    override fun inserir(posicao: Int, dado: Any?) {
        if(!estaCheia()) {
            if (posicao in 0..quantidade) {
                var posicaoFisica = (ponteiroInicio + posicao) % dados.size
                var ponteiroAux = ponteiroFim + 1
                for (i in posicao until quantidade) {

                }
            }
        }
    }

    override fun selecionar(posicao: Int): Any? {
        TODO("Not yet implemented")
    }

    override fun selecionarTodos(): Array<Any?> {
        TODO("Not yet implemented")
    }

    override fun atualizar(posicao: Int, dado: Any?) {
        TODO("Not yet implemented")
    }

    override fun apagar(posicao: Int): Any? {
        TODO("Not yet implemented")
    }

}
package EstruturasEstaticas.Pilha

class Stack(val tamanho: Int = 10): StackInterface {
    private var ponteiro: Int = -1
    private var dados: Array<Any?> = arrayOfNulls(tamanho)

    override fun estaCheia(): Boolean {
        return ponteiro == dados.size
    }

    override fun estaVazia(): Boolean {
        return ponteiro == -1
    }

    override fun espiar(): Any? {
        return dados[ponteiro];
    }

    override fun print(): String {
        var retorno: String = "["
        for (i in 0..ponteiro) {
            if (i == 0) {
                retorno += dados[i].toString()
            } else {
                retorno += ", " + dados[i]
            }
        }
        return "$retorno]"
    }

    override fun empilhar(dado: Any) {
        if (!estaCheia()) {
            ponteiro++
            dados[ponteiro] = dado
        }
    }

    override fun desempilhar(): Any? {
        var retorno: Any? = null
        if (!estaVazia()) {
            retorno = dados[ponteiro]
            ponteiro--
        }
        return retorno
    }

    override fun topo(): Any? {
        if (!estaVazia()) {
            return dados[ponteiro]
        }
        return null;
    }
}


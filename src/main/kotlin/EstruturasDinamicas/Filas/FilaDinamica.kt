package EstruturasDinamicas.Filas

class FilaDinamica (private var tamanho: Int = 100) : Enfileravel {
    private var ponteiroInicio: NoDuplo? = null
    private var ponteiroFinal: NoDuplo? = null
    private var quantidade = 0

    override fun estaVazia(): Boolean {
        return quantidade == 0
    }

    override fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    override fun imprimir(): String {
        if (estaVazia()) {
            return "[]"
        }
        var retorno = "["
        var noAtual = ponteiroInicio
        while (noAtual?.proximo != null) {
            retorno += noAtual.dado.toString() + ", "
            noAtual = noAtual.proximo
        }
        retorno += noAtual?.dado.toString()
        return "$retorno]"
    }

    override fun enfileirar(dado: Any) {
        if (!estaCheia()) {
            val novoNo = NoDuplo(dado)
            if (estaVazia())
                ponteiroInicio = novoNo
            ponteiroFinal?.proximo = novoNo
            novoNo.anterior = ponteiroFinal
            ponteiroFinal = novoNo
            quantidade++
        } else
            println("A lista está cheia!")
    }

    override fun desenfileirar(): Any? {
        var temp: NoDuplo? = null
        if (!estaVazia()) {
            temp = ponteiroInicio
            ponteiroInicio = ponteiroInicio?.proximo
            ponteiroInicio?.anterior = null
            quantidade--
        }
        return temp
    }

    override fun remover(posicao: Int) {
        if (!estaVazia()) {
            if (posicao > 0 || posicao <= quantidade) {
                var ponteiroAux = ponteiroInicio
                for (i in 0..<posicao) {
                    ponteiroAux = ponteiroAux?.proximo
                }
                if (ponteiroAux == ponteiroInicio) {
                    ponteiroInicio = ponteiroAux?.proximo
                    if (ponteiroInicio != null) {
                        ponteiroInicio?.anterior = null
                    }
                } else if (ponteiroAux == ponteiroFinal) {
                    ponteiroFinal = ponteiroAux?.anterior
                    if (ponteiroFinal != null) {
                        ponteiroFinal?.proximo = null
                    }
                } else {
                    ponteiroAux?.anterior?.proximo = ponteiroAux?.proximo
                    ponteiroAux?.proximo?.anterior = ponteiroAux?.anterior
                }
                quantidade--
            } else {
                println("Posição ínvalida!")
            }
        } else {
            println("A fila está vazia!")
        }
    }

    override fun atualizar(dado: Any, posicao: Int) {
        if(!estaVazia()) {
            if (posicao > 0 || posicao <= quantidade) {
                var ponteiroAux = ponteiroInicio
                for (i in 0..<posicao - 1) {
                    ponteiroAux = ponteiroAux?.proximo
                }
                ponteiroAux?.dado = dado
            }
        }
    }

    override fun selecionarTodos(): List<Any?> {
        val retorno = mutableListOf<Any?>()
        if (!estaVazia()) {
            var ponteiroAux = ponteiroInicio
            while (ponteiroAux != null) {
                retorno.add(ponteiroAux.dado)
                ponteiroAux = ponteiroAux.proximo
            }
        }
        return retorno
    }

    override fun selecionar(posicao: Int): Any? {
        var retorno: NoDuplo? = null
        if(!estaVazia()) {
            if (posicao > 0 || posicao <= quantidade) {
                var ponteiroAux = ponteiroInicio
                for (i in 0..<posicao-1) {
                    ponteiroAux = ponteiroAux?.proximo
                }
                retorno = ponteiroAux
            }
        }
        return retorno
    }
}

fun main() {
    val fila = FilaDinamica()
    fila.enfileirar(1)
    fila.enfileirar(2)
    fila.enfileirar(3)
    fila.enfileirar(4)
    fila.enfileirar(5)
    fila.remover(2)
    fila.remover(0)
    println(fila.imprimir())
}
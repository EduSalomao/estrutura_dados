package EstruturasEstaticas.ArvoreBinaria.heapMin

import EstruturasEstaticas.ArvoreBinaria.Amontoavel

class minHeap(var tamanho: Int = 10) : Amontoavel {
    private var ponteiro: Int = -1
    private var dados: IntArray = IntArray(tamanho)

    override fun estaCheio(): Boolean {
        return ponteiro == dados.size
    }

    override fun estaVazio(): Boolean {
        return ponteiro == -1
    }

    override fun imprimir(): String {
        var resultado = "["
        for (i in 0..ponteiro) {
            resultado += "${dados[i]}"
            if (i < ponteiro) {
                resultado += ", "
            }
        }
        return "$resultado]"
    }

    private fun indicePai(indiceFilho: Int): Int {
        return (indiceFilho - 1)/2;
    }

    private fun indiceFilhoEsquerdo(indicePai: Int): Int {
        return indicePai * 2 + 1
    }

    private fun indiceFilhoDireito(indicePai: Int): Int {
        return indicePai * 2 + 2
    }

    private fun troca(i: Int, j: Int) {
        val temp = dados[i]
        dados[i] = dados[j]
        dados[j] = temp
    }

    private fun ajustarAcima(indice: Int) {
        var indiceAux = indice
        while (indiceAux != 0) {
            if(dados[indicePai(indiceAux)] > dados[indiceAux]) {
                troca(indicePai(indiceAux), indiceAux)
                indiceAux = indicePai(indiceAux)
            } else {
                break
            }
        }
    }

    private fun ajustarAbaixo(indice: Int) {
        var indiceAux = indice
        while (indiceAux <= ponteiro) {
            if (dados[indiceAux] > dados[indiceFilhoDireito(indiceAux)]) {
                troca(indiceFilhoDireito(indiceAux), indiceAux)
                indiceAux = indiceFilhoDireito(indiceAux)
            }

            else if (dados[indiceAux] > dados[indiceFilhoEsquerdo(indiceAux)]) {
                indiceAux = indiceFilhoEsquerdo(indiceAux)
            }
        }
    }

    override fun inserir(dado: Int) {
        if(!estaCheio()) {
            ponteiro = ponteiro.inc()
            dados[ponteiro] = dado
            ajustarAcima(ponteiro)
        } else
            println("O heap está cheio!")
    }

    override fun extrair(): Any? {
        var raiz = 0
        if(!estaVazio()) {
            raiz = dados[0]
            dados[0] = dados[ponteiro]
            ponteiro = ponteiro.dec()
            ajustarAbaixo(0)
        } else {
            println("Heap vazia!")
        }
        return raiz
    }

    override fun obter(): Any {
        var raiz = -1
        if (!estaVazio())
            raiz = dados[0]
        return raiz
    }

    override fun atualizar(): Any? {
        TODO("Not yet implemented")
    }


}
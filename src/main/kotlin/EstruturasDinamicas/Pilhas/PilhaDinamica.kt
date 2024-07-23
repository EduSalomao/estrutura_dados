package EstruturasDinamicas.Pilhas

import Empilhavel

class PilhaDinamica (private var tamanho: Int = 10): Empilhavel{
    private var ponteiroTopo: NoDuplo? = null
    private var quantidade = 0

    override fun estaVazia(): Boolean {
        return quantidade == 0
    }

    override fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    override fun espiar(): Any? {
        var dadoTopo: Any? = null
        if (!estaVazia()) {
            dadoTopo = ponteiroTopo?.dado
        } else {
            println("Pilha vazia!")
        }
        return dadoTopo
    }

    override fun atualizar(dado: Any?) {
        if(!estaVazia())
            ponteiroTopo?.dado = dado
        else
            println("Pilha vazia!")
    }

    override fun print(): String {
        if (estaVazia()) {
            return "[]"
        }
        var retorno: String = "["
        var noAtual = ponteiroTopo
        while (noAtual?.anterior != null) {
            retorno += noAtual.dado.toString() + ", "
            noAtual = noAtual.anterior
        }
        retorno += noAtual?.dado.toString()
        return "$retorno]"
    }

    override fun desempilhar(): Any? {
        var dadoDesempilhado: Any? = null
        if (!estaVazia()) {
            dadoDesempilhado = ponteiroTopo?.dado
            ponteiroTopo = ponteiroTopo?.anterior!!
            quantidade--
        } else {
            println("Pilha vazia!")
        }
        return dadoDesempilhado
    }

    override fun empilhar(dado: Any) {
        if (!estaCheia()) {
            var novoNo = NoDuplo(dado)
            novoNo.proximo = ponteiroTopo
            ponteiroTopo = novoNo
            quantidade++
        } else {
            println("Pilha cheia!")
        }
    }

    override fun topo(): Any? {
        var dadoTopo: Any? = null
        if (!estaVazia()) {
            dadoTopo = ponteiroTopo?.dado
        } else {
            println("Pilha vazia!")
        }
        return dadoTopo
    }
}


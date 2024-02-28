class PilhaEstatica : Empilhavel {
  private var ponteiroTopo: Int
  private var dados: Array<Any?>

  constructor():this(10){}

  constructor(tamanho: Int) {
    ponteiroTopo = -1
    dados = arrayOfNulls(tamanho)
  }

  override fun estaCheia(): Boolean {
    return (ponteiroTopo == dados.size - 1)
  }

  override fun estaVazia (): Boolean {
    return (ponteiroTopo == -1)
  }

  override fun imprimir(): String {
    var resultado: String = "["
    for (i in ponteiroTopo downTo 0) {
      if(i == 0) 
        resultado += "$dados[i]"
      else
        resultado += "$dados[i]"
    }
    return "$resultado]"
  }


  override fun topo(): Any? {
    return !estaVazia() ? dados[ponteiroTopo] : print("A lista está vazia!")
  }

  override fun empilhar(dado: Any?) {
    if(!estaCheia()) {
      ponteiroTopo++
      dados[ponteiroTopo] = dado
    } else {
      print("A pilha está cheia!")
    }
  }

  override fun desempilhar(): Any? {
    var retorno: Any? = null
    if(!estaVazia()) {
      retorno = dados[ponteiroTopo]
      ponteiroTopo++
    } else {
      print("A pilha está vazia!")
    }
    return retorno
  }  
}

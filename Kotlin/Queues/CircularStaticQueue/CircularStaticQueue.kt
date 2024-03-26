class CircularStaticQueue(val tamanho: Int = 10) {
  private var ponteiroInicio = 0
  private var ponteiroFim = -1
  private var dados: Array<Any?> = arrayOfNulls(tamanho)
  private var quantidade = 0
  
  fun estaCheia(): Boolean {
    return quantidade == dados.size
  }

  fun estaVazia(): Boolean {
    return quantidade == 0
  }
  
  fun imprimir(): String {
    var resultado = "["
    var aux = ponteiroInicio
    for (i in (0..quantidade)) {
      resultado += if (i == quantidade)
        "${dados[aux]}"
      else
        resultado += dados[aux] 
      aux++
      if(aux == dados.size)
        aux = 0
    }
    return "$resultado]"
  }

  fun espiar(): Any? {
    var dado: Any? = null
    if(!estaVazia()) {
      dado = dados[ponteiroInicio]
    }
    return dado
  }

  fun desenfileirar(): Any? {
    var dado: Any? = null
    if (!estaVazia()) {
      dado = dados[ponteiroInicio]
      ponteiroInicio++
      if(ponteiroInicio == dados.size) {
        ponteiroInicio = 0
      }
      quantidade--                               
    } else {
      print("Fila vazia!")
    }
    return dado
  }

  fun enfileirar(dado: Any?) {
    if (!estaCheia()) {
      ponteiroFim++
      if(ponteiroFim == dados.size)
        ponteiroFim = 0
      dados[ponteiroFim] = dado
      quantidade++
    } else {
      println("Fila Cheia!")
    }
  }

  fun atualizar() {
    if (!estaVazia()) {

    }
  }
}
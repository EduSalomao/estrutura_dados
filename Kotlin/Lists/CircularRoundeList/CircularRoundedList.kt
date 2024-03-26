class CircularRoundedList(val tamanho: Int = 10) : Listable {
  var ponteiroInicio = 0
  var ponteiroFim = 0
  var quantidade = 0
  var posicaoFisica = 0
  private var dados: Array<Any?> = arrayOfNulls(tamanho)
   
  override fun isEmpty(): Boolean {
    return quantidade == 0
  }
  
  override fun isFull(): Boolean {
    return quantidade == dados.size
  }

  override fun print(): String {}

  override fun selectOne(posicao: Int): Any? {}

  override fun append() {}

  override fun insert(posicao: Int, dado: Any) {
    if(!isFull()) {
      if (posicao >= 0 && posicao <= quantidade) {
        posicaoFisica = (posicao + ponteiroInicio) % dados.size
      } 
      for(i in 0..quantidade-posicao) {
        
        
      }
    }
  }

  override fun remove(posicao: Int): Any? {
    var dadoAux: Any? = null
    if(!isEmpty()) {
      if (posicao >= 0 && posicao < quantidade) {
        posicaoFisica = (posicao + ponteiroInicio) % dados.size
        dadoAux = dados[posicaoFisica]
        
        var atual = posicaoFisica

        for(i in 0..quantidade-posicao-1) {
          var proxima = (atual + 1) % dados.size
          dados[atual] = dados[proxima]
          atual = (atual + 1) % dados.size
        }

        ponteiroFim--
        if(ponteiroFim == -1)
          ponteiroFim = dados.size -1

        quantidade--
      }
    }
    return dadoAux
  }

  override fun update(posicao: Int, newDado: Any) {

  }
}
import Stackable

class PilhaEstatica : Stackable {
  private var ponteiroTopo: Int
  private var dados: Array<Any?>

  constructor():this(10){}

  constructor(tamanho: Int) {
    ponteiroTopo = -1
    dados = arrayOfNulls(tamanho)
  }

  override fun isFull(): Boolean {
    return (ponteiroTopo == dados.size - 1)
  }

  override fun isEmpty(): Boolean {
    return (ponteiroTopo == -1)
  }

  override fun print(): String {
    var resultado: String = "["
    for (i in ponteiroTopo downTo 0) {
      if(i == 0) 
        resultado += "$dados[i]"
      else
        resultado += "$dados[i]"
    }
    return "$resultado]"
  }


  override fun top(): Any? {
    return !isEmpty() ? dados[ponteiroTopo] : print("Stack is empty!")
  }

  override fun stack(dado: Any?) {
    if(!isFull()) {
      ponteiroTopo++
      dados[ponteiroTopo] = dado
    } else {
      print("Stack is full!")
    }
  }

  override fun unstack(): Any? {
    var retorno: Any? = null
    if(!isEmpty()) {
      retorno = dados[ponteiroTopo]
      ponteiroTopo++
    } else {
      print("Stack is empty!")
    }
    return retorno
  }  
}
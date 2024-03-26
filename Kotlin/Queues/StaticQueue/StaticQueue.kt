import kotlin.arrayOfNulls

class StaticQueue(tamanho: Int = 10): QueueInterface {
  private var ponteiroInicio = 0
  private var ponteiroFim = 0
  private var dados: Array<Any?> = arrayOfNulls(tamanho)

  override fun estaVazia(): Boolean {
    return (ponteiroFim + 1 == ponteiroInicio)
  }
  
  override fun estaCheia(): Boolean {
    return (ponteiroFim == (dados.size - 1))
  }

  override fun imprimir(): String {
    var resultado = "["
    for (i in ponteiroInicio .. ponteiroFim) {
      if (i == ponteiroFim) {
        resultado +=  "${dados[i]}"
      }
      resultado += "${dados[i]} ,"      
    }
    return resultado + "]"
  }

  override fun atualizar(novoDado: Any?) {
    if (!estaVazia())
      dados[ponteiroInicio] = novoDado
    else
      println("")
  }

  override fun espiar(): Any? {
    var dado: Any? = null
    if (!estaVazia()) 
      dado = dados[ponteiroInicio]
    else
      print("Queue is empty!")
    return dado
  }


  override fun enfileirar(dado: Any?) {
    if(!estaCheia())
      ponteiroFim++
      dados[ponteiroFim] = dado
    else
      println("A lista está cheia!")
  } 

  override fun desenfileirar(): Any? {
    var dado:Any? = null
    if (!estaVazia()) {
      dados[ponteiroInicio] = dado
      ponteiroInicio++
    }
    return("A lista está vazia!")
    
  }

}
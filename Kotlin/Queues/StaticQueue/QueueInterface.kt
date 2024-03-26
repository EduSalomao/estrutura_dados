interface QueueInterface {
  
  fun enfileirar(dado: Any?)
  fun desenfileirar(): Any?
  fun espiar(): Any?
  fun atualizar(novoDado: Any?)
  fun estaCheia(): Boolean
  fun estaVazia(): Boolean
  fun imprimir(): String
  
}
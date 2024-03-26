interface DoubleEndedQueue {
  fun enfileirarInicio(dado: Any?)
  fun enfileirarFim(dado: Any?)
  fun desinfeleirarInicio(): Any?
  fun desinfeleirarFim(): Any?
  fun espiarInicio(): Any?
  fun espiarFim(): Any?
  fun atualizarInicio(novoDado: Any?)
  fun atualizarFim(novoDado: Any?)
  fun estaCheia(): Boolean
  fun estaVazia(): Boolean
  fun imprimir(): String
  
}
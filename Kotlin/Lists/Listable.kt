interface Listable {
  fun append(): Any
  fun insert(posicao: Int, dado: Any)
  fun selectOne(posicao: Int): Any?
  fun update(posicao: Int, newDado: Any)
  fun remove(posicao: Int): Any?

  fun isFull(): Boolean
  fun isEmpty(): Boolean
  fun print(): String
}
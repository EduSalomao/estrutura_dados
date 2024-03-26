interface Stackable {
  fun stack(dado: Any?)
  fun unstack(): Any?
  fun top(): Any?
  fun isFull(): Boolean
  fun isEmpty(): Boolean
  fun print(): String
}
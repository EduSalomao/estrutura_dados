public interface Listable {
  void append(Object obj);
  void insert(int posicao, Object obj);
  Object selectOne(int posicao);
  void update(int posicao, Object novoObj);
  Object remove(int posicao);

  boolean isFull();
  boolean isEmpty();
  String print();
}
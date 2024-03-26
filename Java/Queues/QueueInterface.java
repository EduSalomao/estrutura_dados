package Java.Queues;

public interface QueueInterface {
  void Append(Object dado);
  void desenfileirar();
  void peek();
  void update(Object novoDado);
  Boolean isEmpty();
  Boolean isFull();
  String showData();
  
}
package Java.Stacks.StatickStack;

interface StackInterface {
  
  void Append(Object data);
  void Pop();
  String Top();
  Boolean isFull();
  Boolean isEmpty();

}
package Java.Stacks.StatickStack;

public class StaticStack implements StackInterface{
  private Object[] data;
  private int head;

  StaticStack() {
    this(10);
  }

  StaticStack(int x) {
    this.data = new Object[x];
    this.head = -1;
  }

  public Boolean isEmpty() {
    return this.head == -1;
  }

  public Boolean isFull() {
    return this.head == this.data.length - 1;
  }

  public String Top() {
    if (!isEmpty()) {
      return data[head].toString();
    }
    return null;
  }

  public void Append(Object obj) {
    if (!isFull()) {
      head++;
      data[head] = obj;
    }
  }

  public void Pop() {
    if(!isEmpty()) {
      head--;
    }
  }
}


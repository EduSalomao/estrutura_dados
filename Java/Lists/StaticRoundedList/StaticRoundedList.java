public class StaticRoundedList implements Listable {
  private int ponteiroInicio, ponteiroFim;
  private Object[] dados;
  private int quantidade;

  public StaticRoundedList() {
    this(10);
  }

  public StaticRoundedList(int x) {
    this.quantidade = 0;
    this.ponteiroInicio = 0;
    this.ponteiroFim = -1;
    this.dados = new Object[x];
  }

  public boolean isFull(){
    return (quantidade == dados.length);
  }

  public boolean isEmpty() {
    return (quantidade == 0);
  }

  public String print() {
    String resultado = "[";
    
    int i = ponteiroInicio+1;
    for (int auxQtde = 0; auxQtde != quantidade; auxQtde++) {
      if (i == dados.length) {
        i = 0;
      }

      if (i == ponteiroFim)
        resultado += dados[i];
      else
        resultado += dados[i] + ",";
      i++;
    }
    return resultado + "]";
  }

  public void append(Object obj) {
    if (!isFull()) {
      ponteiroFim++;
      if (ponteiroFim == dados.length)
        ponteiroFim = 0;
      quantidade++;
      dados[ponteiroFim] = obj;
    } else {
      System.out.println("List is full!");
    }
  }

  public void insert(int posicao, Object obj) {
    
  }

  public Object selectOne(int posicao) {
    Object elementotemp = null;
    if (!isEmpty()) {
      if ((posicao >= 0) && (posicao < quantidade)) {
        int pontoManipulacao = ((ponteiroInicio+1)+posicao) % dados.length;
        elementotemp = dados[pontoManipulacao];
      } else {
        System.out.println("Indice invalido!");
      }
    } else {
      System.out.println("List is empty!");
    }
    return elementotemp;
  }

  public void update(int posicao, Object novoObj) {
    if (!isEmpty()) {
      if (posicao >= 0 && posicao < quantidade) {
        int posicaoFisica = (ponteiroInicio + posicao) % dados.length;
        dados[posicaoFisica] = novoObj;
      } else {
        System.out.println("Indice inválido!");
      }
    } else {
      System.out.println("Lista vazia!");
    }
  }

  public Object remove(int posicao) {
    Object dadoAux = null;
    if(!isEmpty()) {
      if ((posicao >= 0) && (posicao < quantidade)) {
        int posicaoFisica = ((ponteiroInicio + posicao) % dados.length);
        dadoAux = dados[posicaoFisica];
        int ponteiroAux = posicaoFisica;
        for (int i = 0; i < quantidade-1; i++) {
          int atual = ponteiroAux;
          if(ponteiroAux == dados.length - 1) {
            ponteiroAux = -1;
          }
          int proximo = ponteiroAux + 1;

          dados[atual] = dados[proximo];
          ponteiroAux++;
        }
        ponteiroFim--;
        if (ponteiroFim == -1) {
          ponteiroFim = dados.length-1;
        }
        quantidade--;
      } else {
        System.out.println("Indice inválido!");
      }
    } else {
      System.out.println("Lista vazia!");
    }
    return dadoAux;
  }
}
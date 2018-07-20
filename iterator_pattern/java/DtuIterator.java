import java.util.List;
import java.util.ArrayList;

class DtuIterator implements Iterator {
  private List<Person> elements; // 繰り返し処理をする要素
  private int now = 0; // 現在処理を行っている要素位置
   
  public DtuIterator(List<Person> elements) {
    this.elements = new ArrayList<Person>();
    for(Person element : elements) {
      this.elements.add(element);
    }
  }

  public boolean hasNext() {
    if(this.elements.size() < this.now + 1) {
      return false;
    } else {
      return true;
    }
  }

  public Person next() {
    int tmp = this.now;
    this.now++;
    return this.elements.get(tmp);
  }
}


import java.util.ArrayList;
import java.util.List;

class DtuMember implements Collection {
  private List<Person> members;

  public DtuMember(Person[] members) {
    this.members = new ArrayList<Person>();
    // 引数で受け取った配列をプロパティに格納
    for(Person member : members) {
      this.members.add(member);
    }
  }

  public DtuIterator getIterator() {
    return new DtuIterator(this.members);
  }

  public void joinDtu(Person member) {
    this.members.add(member);
  }
}

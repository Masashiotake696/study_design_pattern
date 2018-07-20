class MyApp {
  public static void main(String[] args) {
    Person oba = new Person("oba", 25);
    Person masashi = new Person("masashi", 22);
    Person hasumin = new Person("hasumin", 1000);

    Person person_array[] = {oba, masashi, hasumin};
    DtuMember dtu_member = new DtuMember(person_array);
    DtuIterator dtu_iterator = dtu_member.getIterator();

    while(dtu_iterator.hasNext()) {
      Person next = dtu_iterator.next();
      System.out.println(next.getName());
      System.out.println(next.getAge());
    }
  }
}

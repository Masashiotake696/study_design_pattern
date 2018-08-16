public class MyApp {
  public static void main(String[] args) {
    ConcreteObserver observer = new ConcreteObserver();
    Subject subjectA = new ConcreteSubjectA();
    Subject subjectB = new ConcreteSubjectB();

    // 観察対象インスタンスにオブザーバーをセット
    subjectA.addObserver(observer);
    subjectB.addObserver(observer);

    for(int i = 0; i < 100; i++) {
        subjectA.run();
        subjectB.run();
    }

    System.out.println("合計値: " + observer.getTotal());
  }
}

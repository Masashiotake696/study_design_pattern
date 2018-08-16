public class ConcreteObserver extends Observer {
    private String observerName = "ConcreteObserver";
    private int total = 0;
    
    public int getTotal() {
      return total;
    }
    
    // 通知受信
    public void update(Subject subject) {
      total += subject.getRandom();
    }
}

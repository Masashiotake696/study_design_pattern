import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// 観察対象の抽象クラス
public abstract class Subject {
  // オブザーバーを保持(複数のオブザーバーを保持できるようにArrayListを使用)
  private List<Observer> observers = new ArrayList<Observer>();
  private Random random = new Random(); // 乱数生成用のRandomクラス

  // オブザーバーの格納
  public void addObserver(Observer observer) {
      observers.add(observer);
  }

  // オブザーバーの削除
  public void removeObserver(Observer observer) {
      observers.remove(observer);
  }

  // オブザーバーに対する通知
  public void notifyObservers() {
      for(Observer observer : observers) {
          observer.update(this);
      }
  }

  // 1~100の乱数を生成して返却
  public int getRandomNumber() {
      return random.nextInt(100) + 1;
  }

  public abstract void run();
  public abstract String getName();
  public abstract int getRandom();
}

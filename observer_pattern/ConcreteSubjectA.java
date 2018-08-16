public class ConcreteSubjectA extends Subject {
  private String subjectName = "ConcreteSubjectA";
  private int random = 0;

  // 名前用ゲッター
  public String getName() {
      return subjectName;
  }

  // 乱数用ゲッター
  public int getRandom() {
      return random;
  }

  public void run() {
      // 1~100の乱数を取得
      random = getRandomNumber();
      // 結果を表示
      System.out.println(subjectName + ": " + random);
      // 3の倍数の時にイエーと表示
      if(random % 3 == 0) {
        System.out.println("イェー！！！");
      }
      // オブザーバーに通知
      notifyObservers();
  }
}

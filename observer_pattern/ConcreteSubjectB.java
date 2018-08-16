public class ConcreteSubjectB extends Subject {
  private String subjectName = "ConcreteSubjectB";
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
      // 5の倍数の時にウッスと表示
      if(random % 5 == 0) {
        System.out.println("ウッスッッ");
      }
      // オブザーバーに通知
      notifyObservers();
  }
}

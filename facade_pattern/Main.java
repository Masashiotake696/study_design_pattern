public class Main {
  public static void main(String argv[]) {
    Obachan obachan = new Obachan();
    Sakurai sakurai = new Sakurai();

    System.out.println(obachan.getIntelijAccountNumber());

    obachan.requestIntelij(sakurai);

    System.out.println(obachan.getIntelijAccountNumber());
  }
}

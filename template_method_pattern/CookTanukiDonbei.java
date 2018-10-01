public class CookTanukiDonbei extends CookCupNoodle {
    public CookTanukiDonbei() {
        super("どん兵衛たぬきうどん", 5);
    }

    public void open() {
        System.out.println("加薬を入れるよ");
    }

    public void close() {
        System.out.println("サクサク天ぷらを入れるよ");
    }
}

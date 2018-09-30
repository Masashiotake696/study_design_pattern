public class CookTanukiDonbei extends CookCupNoodle {
    public CookTanukiDonbei() {
        super("どん兵衛たぬきうどん");
    }

    public void open() {
        System.out.println("火薬を入れるよ");
        System.out.println("ふっくらおあげを入れるよ");
    }

    public void waiting() {
        System.out.println("5分待つよ");
    }

    public void close() {}
}

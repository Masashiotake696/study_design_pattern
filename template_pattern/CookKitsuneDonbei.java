public class CookKitsuneDonbei extends CookCupNoodle {
    public CookKitsuneDonbei() {
        super("どん兵衛きつねそば");
    }

    public void open() {
        System.out.println("火薬を入れるよ");
    }

    public void waiting() {
        System.out.println("5分待つよ");
    }

    public void close() {
        System.out.println("サクサクの天ぷらを入れるよ");
    }
}

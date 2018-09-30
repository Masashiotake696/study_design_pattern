public class NisshinCupNoodle extends CookCupNoodle {
    public NisshinCupNoodle() {
        super("日清カップヌードル");
    }

    public void open() {}

    public void waiting() {
        System.out.println("3分待つよ");
    }

    public void close() {}
}

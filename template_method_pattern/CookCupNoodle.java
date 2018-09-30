public abstract class CookCupNoodle {
    private String name;
    private int time;
    public abstract void open();
    public abstract void close();

    public CookCupNoodle(String name, int time) {
        this.name = name;
        this.time = time;
    }

    // template method
    public final void cook() {
        System.out.println(this.name + "を作るよ!");
        System.out.println("フタを開けるよ");
        open();
        System.out.println("お湯を注ぐよ");
        System.out.println(this.time + "分待つよ");
        close();
        System.out.println("完成!!!");
    }
}

public abstract class CookCupNoodle {
    private String name;
    public abstract void open();
    public abstract void waiting();
    public abstract void close();

    public CookCupNoodle(String name) {
        this.name = name;
    }

    // template method
    public final void cook() {
        System.out.println(this.name + "を作るよ!");
        System.out.println("フタを開けるよ");
        open();
        System.out.println("お湯を注ぐよ");
        waiting();
        close();
        System.out.println("完成!!!");
    }
}

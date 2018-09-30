public class Main {
    public static void main(String argv[]) {
        CookCupNoodle cook_kitsune_donbei = new CookKitsuneDonbei();
        CookCupNoodle cook_tanuki_donbei = new CookTanukiDonbei();
        CookCupNoodle cook_nisshin_cup_noodle = new NisshinCupNoodle();

        cook_kitsune_donbei.cook();
        System.out.println("-------------------------");
        cook_tanuki_donbei.cook();
        System.out.println("-------------------------");
        cook_nisshin_cup_noodle.cook();
    }
}

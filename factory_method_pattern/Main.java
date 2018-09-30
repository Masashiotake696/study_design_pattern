public class Main {
    public static void main(String argv[]) {
        PanmanBody panman_body = new PanmanBody();

        BreadFace anpanman_face = (new AnpanmanFaceFactory()).create();
        panman_body.setFace(anpanman_face);
        panman_body.attack();

        BreadFace syokupanman_face = (new SyokupanmanFaceFactory()).create();
        panman_body.setFace(syokupanman_face);
        panman_body.attack();

        BreadFace currypanman_face = (new CurrypanmanFaceFactory()).create();
        panman_body.setFace(currypanman_face);
        panman_body.attack();
    }
}

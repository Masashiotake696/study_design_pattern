public class PanmanBody {
    private String technique_name; // 技名

    // TODO: 技名はpanman_faceに持たせる
    public void setFace(BreadFace bread_face) {
        switch(bread_face.getName()) {
            case "アンパンマン":
                this.technique_name = "アンパンチ!";
                break;
            case "食パンマン":
                this.technique_name = "ショクパンチ!";
                break;
            case "カレーパンマン":
                this.technique_name = "カレービュー!";
                break;
            default:
                this.technique_name = "何かしらのパンパンチ!";
                break;
        }
    }

    public void attack() {
        System.out.println("くらえ!" + this.technique_name);
    }
}

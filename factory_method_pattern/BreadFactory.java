/**
 * Factoryの抽象クラス
 * すべてのFactoryはこのクラスを継承する。
 */
public abstract class BreadFactory {
    /**
     * パン系の顔オブジェクトを作成後、
     * 誰に対しての顔なのかを叫び、顔を返却
     *
     * @return BreadFace bread_face
     */
    public BreadFace create()
    {
        // パン系の顔オブジェクトを取得
        BreadFace bread_face = createFace();

        // 誰に対しての顔なのかを叫ぶ
        System.out.println(bread_face.getName() + "!新しい顔よ!");

        // 顔を返却
        return bread_face;
    }

    /**
     * パン系の顔オブジェクトを生成する抽象メソッド
     * サブクラスで実装
     */
    protected abstract BreadFace createFace();
}

import java.util.*;

class Player {
    private String name; // プレイヤー名
    private Inference inference = new Inference(); // 推論

    // コンストラクタ
    public Player(String name, int number_of_cards) {
        // プレイヤー名をセット
        this.name = name;

        // 予測される自分のカード配列をセット
        for (int i = 1; i <= number_of_cards; i++) {
            this.inference.addPredictOwnCard(i);
        }
    }

    public String getName() {
        return this.name;
    }

    private Inference getInference() {
        return this.inference;
    }

    showOtherPlayersInformation() {
        // 自分の場合はcontinue
        if(player == other_player) {
            return;
        }
        this.getInference().addPredictOwnCard(card_number);
    }

    // // 予測される自分のカード配列を返却
    // public ArrayList<Integer> getPredictOwnCards() {
    //     return this.predict_own_cards;
    // }

    // // 他のプレイヤーを追加
    // public void addOtherPlayer(Player player) {
    //     this.other_players.add(player);
    // }

    // // 自分の保持するカードを他のプレイヤーに見せる
    // public void showOwnCard(int card_number) {
    //     // 他のプレイヤーから自分の保持するカード番号を削除
    //     for(Player other_player : this.other_players) {
    //         other_player.removeCardNumber(card_number);
    //     }
    // }

    // // 予想される自分のカード配列から指定の数字を削除
    // public void removeCardNumber(int card_number) {
    //     this.predict_own_cards.remove(this.predict_own_cards.indexOf(card_number));
    // }

    // // 自分が1番大きい(MAX), 自分は2番目に大きい(MID), 自分が1番小さい(MIN), わからない(?)を回答
    // public Boolean answer() {
    //     String result = "?";
    //     // MAXであるか判定(予測されるカード番号がカード最大値からの連番であるか)
    //     int counter = 0;
    //     for(int i = this.predict_own_cards.size() - 1; i >= 0; i--) {
    //         if(this.predict_own_cards.get(i) != (Card.CARD_NUMBER_OF_SHEET - counter)) {
    //             break;
    //         } else {
    //             if(i == 0) {
    //                 result = "MAX";
    //             }
    //         }
    //         counter++;
    //     }

    //     // MINであるか判定(予測されるカード番号がカード最小値(1)からの連番であるか)
    //     for(int i = 0; i < this.predict_own_cards.size(); i++) {
    //         if(this.predict_own_cards.get(i) != i+1) {
    //             break;
    //         } else {
    //             if(i == this.predict_own_cards.size() -1) {
    //                 result = "MIN";
    //             }
    //         }
    //     }

    //     // MIDであるか判定(予測されるカード番号がカード最大値とカード最小値を含まない連番であるか)
    //     int min_number = this.predict_own_cards.get(0);
    //     for(int i = 0; i < this.predict_own_cards.size(); i++) {
    //         if(this.predict_own_cards.get(i) != min_number) {
    //             break;
    //         } else {
    //             if(i == this.predict_own_cards.size() - 1) {
    //                 result = "MID";
    //             }
    //         }

    //         min_number++;
    //     }

    //     // 結果の出力
    //     System.out.print(this.getName() + " => " + result);

    //     // わからない(?)以外の場合はtrueを返却
    //     if(result != "?") {
    //         System.out.println();
    //         return true;
    //     } else {
    //         System.out.print(", ");
    //         // 「わからない」という結果により他のプレイヤーの推測カードを変更する
    //         for(Player other_player : this.other_players) {
    //             other_player.predictCardNumber(this.getName(), result);
    //         }
    //     }

    //     return false;
    // }

    // // カードを推測する
    // public void predictCardNumber(String name, String result) {
    //     for(Player other_player : this.other_players) {
    //         // 回答したプレイヤーの場合はcontinue
    //         if(other_player.getName() == name) {
    //             continue;
    //         }

    //         // 最大値が候補から外れるか判定
    //         // if()
    //     }
    // }
}

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // 誰が何番のカードを保持するか
        HashMap<String, Integer> player_card_information = new HashMap<String, Integer>();

        // コマンドライン引数がない場合
        if(args.length == 0) {
            System.out.println("usage: java Main A=1 B=2 ...");
            System.exit(1);
        }

        // コマンドライン引数からプレイヤーの生成とカード番号の取得
        for(String arg : args) {
            // 入力値のチェック
            if(arg.matches("[A-Z]+=[1-9][0-9]*") == false) {
                System.out.println("usage: java Main A=1 B=2 ...");
                System.exit(1);
            }

            String[] temp = arg.split("=", 0);

            player_card_information.put(temp[0], Integer.parseInt(temp[1]));
        }

        // インディアン・ポーカーを生成
        IndianPorker indian_porker = new IndianPorker(
            player_card_information
        );

        // 互いのカードを見せる
        indian_porker.showEachOtherCard();

        // 

        // // 他のプレイヤーをセット
        // for(Player player : players) {
        //     for(Player other_player : players) {
        //         if(player != other_player) {
        //             player.addOtherPlayer(other_player);
        //         }
        //     }
        // }

        // // 自分の保持するカードを他のプレイヤーに見せる
        // for(Player player : players) {
        //     player.showOwnCard(players_card_number.get(player.getName()));
        // }


        // Boolean result = false;
        // // プレイヤー1から順に回答
        // while(!result) {
        //     for(Player player : players) {
        //         result = player.answer();
        //         if(result == true) {
        //             break;
        //         }
        //     }
        // }

        // for(Player player : players) {
        //     System.out.println(player.getName());
        //     System.out.println(player.getPredictOwnCards());
        // }
    }
}

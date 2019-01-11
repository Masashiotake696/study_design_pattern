import java.util.*;

class IndianPorker {
    private HashMap<String, Integer> player_card_information = new HashMap<String, Integer>();
    private ArrayList<Player> players = new ArrayList<Player>();
    private int number_of_cards = Card.CARD_NUMBER_OF_SHEET;

    public IndianPorker(HashMap<String, Integer> player_card_information) {
        this.player_card_information = player_card_information;

        // プレイヤーインスタンスを生成してプロパティに格納
        for(String player_name : this.player_card_information.keySet()) {
            Player player = new Player(player_name, this.number_of_cards);
            this.players.add(player);
        }
    }

    // 互いのカードを見せる
    public void showEachOtherCard() {
        String other_player_name;
        for(Player player : this.players) {
            for(Player other_player : this.players) {
                other_player_name = other_player.getName();

                player.showOtherPlayersInformation(
                    other_player_name,
                    this.player_card_information.get(other_player_name)
                );
            }
        }
    }
}

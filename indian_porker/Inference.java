import java.util.*;

class Inference {
    private ArrayList<Integer> predict_own_cards = new ArrayList<>(); // 予想される自分のカードの選択肢
    private HashMap<String, Integer> other_players_information = new HashMap<>(); // 他のプレイヤー情報

    public void addPredictOwnCard(int card_number) {
        this.predict_own_cards.add(card_number);
    }

    public void showOtherPlayersInformation(
        String other_player_name,
        int card_number
    ) {
        this.other_players_information.put(other_player_name, card_number);
    }
}

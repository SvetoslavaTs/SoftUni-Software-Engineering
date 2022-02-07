package ExercisesWorkingWithAbstractions.CardsWithPower;

public class Card {
    private CardRank cardRank;
    private CardSuit cardSuit;
    int power;

    public Card(CardRank cardRank, CardSuit cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
        getPower();
    }

    public void getPower() {
        this.power = cardRank.getRankPower() + cardSuit.getSuitPower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", this.cardRank, this.cardSuit, this.power);
    }
}

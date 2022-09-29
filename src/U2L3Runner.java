public class U2L3Runner {
    public static void main(String[] args) {
        Game game = new Game();
        game.addPlayer();
        game.addPlayer();
        game.increaseScore(2);
        game.increaseScore(6);
        System.out.println("There are " + game.getPlayers() + " in this game.");
        System.out.println("The score is " + game.getScore() + ".");
        System.out.println("The average score per player is " + game.averageScorePerPlayer() + ".");
        game.end();
    }
}

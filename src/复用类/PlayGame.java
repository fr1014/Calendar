package 复用类;

class Game {
    Game(int i) {
        System.out.println("Game Construct i = " + i);
    }
}

class BoardGame extends Game {

    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame Construct");
    }
}

public class PlayGame extends BoardGame {

    PlayGame(int i) {
        super(i);
        System.out.println("PlayGame Construct");
    }

    public static void main(String[] args) {
        PlayGame playGame = new PlayGame(1);
    }
}

package bridge;

public class Application {

    private int size;

    private String move;

    private String retry;

    private static Error error;

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        startBridgeGame();
    }

    public static void startBridgeGame() {
        playBridgeGame();
    }

    public static void playBridgeGame() {

    }

    public static void setError(Error errorMessage) {
        error = errorMessage;
    }
}

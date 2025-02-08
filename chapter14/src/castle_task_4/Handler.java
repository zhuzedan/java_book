package castle_task_4;

public abstract class Handler {
    protected Game game;

    public Handler(Game game) {
        this.game = game;
    }

    public abstract void doCmd(String word);

    public boolean isBye() {
        return false;
    }
}
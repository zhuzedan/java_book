package castle_task_4;

public class HandlerBye extends Handler {
    public HandlerBye(Game game) {
        super(game);
    }

    @Override
    public void doCmd(String word) {
    }

    @Override
    public boolean isBye() {
        return true;
    }
}
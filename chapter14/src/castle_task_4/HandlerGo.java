package castle_task_4;

public class HandlerGo extends Handler {
    public HandlerGo(Game game) {
        super(game);
    }

    @Override
    public void doCmd(String word) {
        game.goRoom(word);
    }
}


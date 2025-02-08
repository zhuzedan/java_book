package castle_task_3;

import java.util.HashMap;
import java.util.Map;

public class Room {
    private String description;
    private Map<String, Room> exits = new HashMap<>();

    public Room(String description) {
        this.description = description;
    }

    public void setExit(String direction, Room room) {
        exits.put(direction, room);
    }

    public Room getExit(String direction) {
        return exits.get(direction);
    }

    public String getExitDesc() {
        StringBuilder sb = new StringBuilder();
        for (String direction : exits.keySet()) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(direction);
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return description;
    }
}
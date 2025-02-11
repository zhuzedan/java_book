public class Goods {
    private int type;
    private int id;

    public Goods(int type, int id) {
        this.type = type;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "type=" + type +
                ", id=" + id +
                '}';
    }
}


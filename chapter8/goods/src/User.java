public class User {
    private int userId;
    private String nick;
    private String username;
    private String password;

    public User(int userId, String nick) {
        this.userId = userId;
        this.nick = nick;
    }

    public int getUserId() {
        return userId;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", nick='" + nick + '\'' +
                '}';
    }
}

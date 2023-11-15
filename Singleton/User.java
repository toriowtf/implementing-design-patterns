package Singleton;
public final class User {
    private static User instance;
    public static String name;

    private User(String name) {
        this.name = name;
    }

    public static User getInstance(String name) {
        if (instance == null) {
            instance = new User(name);
        }
        return instance;
    }
    public static void getUserName() {
        System.out.println("User: " + name);
    }
}
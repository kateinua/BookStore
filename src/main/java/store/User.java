package store;

public class User implements Observer{

    private String name;
    User(String name) {
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public void update() {
        System.out.format("Dear %s, here is your personal update", name);
    }
}

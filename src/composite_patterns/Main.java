package composite_patterns;

public class Main {
    public static void main(String[] args) {
        var Group1 = new Group();
        Group1.add(new Shape());
        Group1.add(new Shape());
        Group1.add(new Shape());
        Group1.add(new Shape());
        var Group = new Group();
        Group.add(Group1);
        Group.render();
    }
}

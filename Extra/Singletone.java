class Singleton1 {
    private static Singleton1 instance = null;
    private Singleton1() {
        // Exists only to defeat instantiation.
    }
    public static Singleton1 getInstance() {
        if(instance == null) {
            instance = new Singleton1();
            // instance.showMessage();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}


public class Singletone {
    public static void main(String[] args) {
        Singleton1 s = Singleton1.getInstance();
        s.showMessage();
    }
}

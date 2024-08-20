package E_Chocolate_SIngleton;

public class ChocolateSingleton {

    private volatile static ChocolateSingleton chocolateSingleton;

    private ChocolateSingleton() {
        System.out.println("Singleton constructor called");
    }

    public static ChocolateSingleton getInstance() {
        if (chocolateSingleton == null) {
            synchronized (ChocolateSingleton.class) {
                if (chocolateSingleton == null) {
                    chocolateSingleton = new ChocolateSingleton();
                }
            }
        }
        return chocolateSingleton;
    }

    public void isRunning() {
        System.out.println("Running smoothly");
    }
}

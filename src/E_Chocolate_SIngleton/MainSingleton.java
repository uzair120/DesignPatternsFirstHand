package E_Chocolate_SIngleton;

public class MainSingleton {
    public static void execute() {
        ChocolateSingleton.getInstance();
        ChocolateSingleton.getInstance();
        ChocolateSingleton.getInstance();
        ChocolateSingleton chocolateSingleton = ChocolateSingleton.getInstance();


        chocolateSingleton.isRunning();
    }
}

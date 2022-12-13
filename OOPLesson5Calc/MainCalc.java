import controllers.ViewController;
import views.ViewCalculator;

public class MainCalc {
    public static void main(String[] args) {
        ViewController controller = new ViewController();
        ViewCalculator view = new ViewCalculator(controller);
        view.start();
    }
}

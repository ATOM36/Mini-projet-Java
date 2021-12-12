import models.entity.DataBase;
import views.Login;

public class App {
    public static void main(String[] args) {
        DataBase.load();
        Login.run();
    }
}

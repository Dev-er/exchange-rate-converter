import Converter.Converter;
import Menu.Menu;

public class Principal {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menu();

        Converter converter = new Converter();
        converter.getBase_code();
        converter.getTarget_code();
        converter.getValue();

    }
}

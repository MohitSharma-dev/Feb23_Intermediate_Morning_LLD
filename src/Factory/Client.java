package Factory;

import Factory.components.button.Button;

public class Client {
    public static void main(String[] args) {
        Platform p = new Android();
        UIComponentFactory uiComponentFactory = p.createUIComponentFactory();
        Button b = uiComponentFactory.createButton();
        b.getSize();

        Platform p1 = new Platform();
        UIComponentFactory uiComponentFactory1 = p.createUIComponentFactory("Android");
        Button b1 = uiComponentFactory.createButton();
        b1.getSize();
//        if(p is a type of Android){
//            new AndroidButton;
//        }

    }
}

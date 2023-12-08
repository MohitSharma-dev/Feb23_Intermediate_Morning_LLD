package Factory;

public class Android extends Platform {
    public UIComponentFactory createUIComponentFactory(){
        return new AndroidUIComponentFactory();
    }
}

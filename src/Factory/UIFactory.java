package Factory;

import Factory.AndroidUIComponentFactory;
import Factory.IOSUIComponentFactory;
import Factory.UIComponentFactory;

public class UIFactory {
    public static UIComponentFactory getUIComponentFactoryByPlatform(String platform){
        if(platform.equals("Android")){
            return new AndroidUIComponentFactory();
        } else if (platform.equals("IOS")){
            return new IOSUIComponentFactory();
        }
        return null;
    }
}

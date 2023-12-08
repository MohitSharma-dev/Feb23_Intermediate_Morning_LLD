package Factory;

public class Platform {
    public void setRefreshRate(){
        System.out.println("REFRESH RATE UPDATED");
    }

    public void setTheme(){
        System.out.println("THEME UPDATED");
    }

    public UIComponentFactory createUIComponentFactory(String platform){
        return UIFactory.getUIComponentFactoryByPlatform(platform);
    }

     public UIComponentFactory createUIComponentFactory(){
        return null;
    }
}

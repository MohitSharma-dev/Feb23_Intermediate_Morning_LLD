package Factory;

import Factory.components.button.Button;
import Factory.components.button.IOSButton;
import Factory.components.dropdown.Dropdown;
import Factory.components.dropdown.IOSDropdown;
import Factory.components.menu.IOSMenu;
import Factory.components.menu.Menu;

public class IOSUIComponentFactory implements UIComponentFactory{
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }
}

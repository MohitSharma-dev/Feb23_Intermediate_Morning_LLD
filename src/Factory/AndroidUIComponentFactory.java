package Factory;

import Factory.components.button.AndroidButton;
import Factory.components.button.Button;
import Factory.components.dropdown.AndroidDropdown;
import Factory.components.dropdown.Dropdown;
import Factory.components.menu.AndroidMenu;
import Factory.components.menu.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory{
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}

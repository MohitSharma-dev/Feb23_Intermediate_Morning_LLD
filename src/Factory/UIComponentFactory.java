package Factory;

import Factory.components.button.Button;
import Factory.components.dropdown.Dropdown;
import Factory.components.menu.Menu;

public interface UIComponentFactory {
    public Button createButton();
    public Menu createMenu();
    public Dropdown createDropdown();
}

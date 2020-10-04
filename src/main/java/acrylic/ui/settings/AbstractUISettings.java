package acrylic.ui.settings;

import acrylic.ui.AbstractUserInterface;

import java.awt.*;

public interface AbstractUISettings {

    AbstractUISettings setWidth(int width);

    AbstractUISettings setHeight(int height);

    AbstractUISettings setTitle(String title);

    int getWidth();

    int getHeight();

    String getTitle();

    AbstractUISettings build(AbstractUserInterface abstractUserInterface);

    default AbstractUISettings setUISizeToUserScreen() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        setWidth(dimension.width).setHeight(dimension.height);
        return this;
    }

}

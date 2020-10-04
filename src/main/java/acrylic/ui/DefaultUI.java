package acrylic.ui;

import acrylic.ui.settings.AbstractUISettings;
import acrylic.ui.settings.DefaultUISettings;

import javax.swing.*;
import java.awt.*;

public abstract class DefaultUI implements AbstractUserInterface {

    private final JFrame jFrame;
    private AbstractUISettings uiSettings;
    private Canvas canvas;

    public DefaultUI(String title) {
        jFrame = new JFrame(title);
        uiSettings = new DefaultUISettings().setTitle(title);
    }

    public DefaultUI(AbstractUISettings uiSettings) {
        jFrame = new JFrame(uiSettings.getTitle());
        this.uiSettings = uiSettings;
    }

    @Override
    public Canvas getCanvas() {
        return canvas;
    }

    @Override
    public JFrame getJFrame() {
        return jFrame;
    }

    @Override
    public AbstractUserInterface setUISettings(AbstractUISettings uiSettings) {
        this.uiSettings = uiSettings;
        return this;
    }

    @Override
    public AbstractUISettings getUISettings() {
        return uiSettings;
    }


}

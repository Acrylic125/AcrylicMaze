package acrylic.ui;

import acrylic.ui.settings.AbstractUISettings;

import javax.swing.*;
import java.awt.*;

public interface AbstractUserInterface {

    JFrame getJFrame();

    Canvas getCanvas();

    AbstractUISettings getUISettings();

    AbstractUserInterface setUISettings(AbstractUISettings uiSettings);

    default AbstractUserInterface updateUI() {
        AbstractUISettings uiSettings = getUISettings();
        uiSettings.build(this);
        return this;
    }

    default AbstractUserInterface constructUI() {
        JFrame jFrame = getJFrame();
        AbstractUISettings uiSettings = getUISettings();
        uiSettings.build(this);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        return this;
    }

}

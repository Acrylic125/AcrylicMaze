package acrylic.ui.canvas.brushes;

import acrylic.ui.AbstractUserInterface;
import acrylic.ui.settings.AbstractUISettings;

import java.awt.*;

public interface AbstractUIPainter {

    Graphics getGraphics();

    AbstractUserInterface getUserInterface();

    AbstractUIPainter paint();

    default AbstractUIPainter clear() {
        AbstractUISettings settings = getUserInterface().getUISettings();
        getGraphics().clearRect(0,0,settings.getWidth(),settings.getHeight());
        return this;
    }

    default Color getColor(int red, int green, int blue) {
        float[] colors = Color.RGBtoHSB(red,green,blue,null);
        return Color.getHSBColor(colors[0],colors[1],colors[2]);
    }

}

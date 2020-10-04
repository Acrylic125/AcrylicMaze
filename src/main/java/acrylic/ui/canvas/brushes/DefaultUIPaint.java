package acrylic.ui.canvas.brushes;

import acrylic.ui.AbstractUserInterface;

import java.awt.*;

public class DefaultUIPaint implements AbstractUIPainter {

    private final AbstractUserInterface userInterface;

    public DefaultUIPaint(AbstractUserInterface userInterface) {
        this.userInterface = userInterface;
    }

    @Override
    public Graphics getGraphics() {
        return userInterface.getCanvas().getGraphics();
    }

    @Override
    public AbstractUserInterface getUserInterface() {
        return userInterface;
    }

    @Override
    public AbstractUIPainter paint() {
        Graphics graphics = getGraphics();
        return this;
    }
}

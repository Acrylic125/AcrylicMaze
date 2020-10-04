package acrylic.ui.canvas;

import acrylic.ui.AbstractUserInterface;
import acrylic.ui.settings.AbstractUISettings;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class DefaultCanvas implements CanvasRenderer {

    private final Canvas canvas;

    private BufferStrategy bufferStrategy;
    private Graphics graphics;

    public DefaultCanvas(AbstractUserInterface abstractUserInterface) {
        canvas = new Canvas();
        AbstractUISettings uiSettings = abstractUserInterface.getUISettings();
        updateUICanvas(abstractUserInterface.getJFrame(), new Dimension(uiSettings.getWidth(),uiSettings.getHeight()));
    }

    public DefaultCanvas() {
        canvas = new Canvas();
    }

    @Override
    public void updateUICanvas(JFrame jFrame,Dimension dimension) {
        canvas.setPreferredSize(dimension);
        canvas.setMinimumSize(dimension);
        canvas.setMaximumSize(dimension);
        jFrame.add(canvas);
        jFrame.pack();
    }

    @Override
    public Canvas getCanvas() {
        return canvas;
    }

    @Override
    public BufferStrategy getBufferStrategy() {
        return bufferStrategy;
    }

    @Override
    public Graphics getGraphics() {
        return graphics;
    }

    @Override
    public void setBufferStrategy(BufferStrategy bufferStrategy) {
        this.bufferStrategy = bufferStrategy;
    }

    @Override
    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }
}

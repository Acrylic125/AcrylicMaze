package acrylic.ui.canvas;

import java.awt.*;
import java.awt.image.BufferStrategy;

public interface CanvasRenderer extends AbstractCanvas {

    BufferStrategy getBufferStrategy();

    Graphics getGraphics();

    void setBufferStrategy(BufferStrategy bufferStrategy);

    void setGraphics(Graphics graphics);

    default void render() {
        BufferStrategy bufferStrategy = getBufferStrategy();
        if (bufferStrategy == null) {
            getCanvas().createBufferStrategy(2);
            bufferStrategy = getCanvas().getBufferStrategy();
            setBufferStrategy(bufferStrategy);
        }
        bufferStrategy.getDrawGraphics();
        Graphics graphics = (getGraphics() != null) ? getGraphics() : bufferStrategy.getDrawGraphics();
        setGraphics(graphics);
    }

}

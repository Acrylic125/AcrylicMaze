package acrylic.ui.canvas;

import javax.swing.*;
import java.awt.*;

public interface AbstractCanvas {

    Canvas getCanvas();

    void updateUICanvas(JFrame jFrame, Dimension dimension);

}

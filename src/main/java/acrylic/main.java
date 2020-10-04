package acrylic;

import acrylic.ui.settings.DefaultUISettings;
import acrylic.ui.types.MazeUI;

public class main {

    public static void main(String[] args) {
        new MazeUI("Maze").setUISettings(
                new DefaultUISettings()
                        .setWidth(1000)
                        .setHeight(400)
        ).constructUI();
    }

}

package acrylic;

import acrylic.ui.settings.DefaultUISettings;
import acrylic.ui.types.MazeUI;
import acrylic.utilities.TextsKt;

public class main {

    public static void main(String[] args) {
        TextsKt.send("Booting up!");
        new MazeUI("Maze").setUISettings(
                new DefaultUISettings()
                        .setWidth(1000)
                        .setHeight(400)
        ).constructUI();
        TextsKt.send("Done!");
    }

}

package acrylic.utilities;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public final class Location2D {

    private int x;
    private int y;

    public Location2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

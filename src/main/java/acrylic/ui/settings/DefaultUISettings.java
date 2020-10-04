package acrylic.ui.settings;

import acrylic.ui.AbstractUserInterface;

import javax.swing.*;

public class DefaultUISettings implements AbstractUISettings {

    private int width = 400;
    private int height = 300;
    private String title;

    @Override
    public AbstractUISettings setWidth(int width) {
        this.width = width;
        return this;
    }

    @Override
    public AbstractUISettings setHeight(int height) {
        this.height = height;
        return this;
    }

    @Override
    public AbstractUISettings setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public AbstractUISettings build(AbstractUserInterface abstractUserInterface) {
        JFrame jFrame = abstractUserInterface.getJFrame();
        jFrame.setSize(getWidth(),getHeight());
        jFrame.setTitle(getTitle());
        return this;
    }

    @Override
    public String toString() {
        return "DefaultUISettings{" +
                "width=" + width +
                ", height=" + height +
                ", title='" + title + '\'' +
                '}';
    }
}

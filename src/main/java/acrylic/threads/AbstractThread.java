package acrylic.threads;

import java.util.concurrent.Executor;

public interface AbstractThread extends Runnable, Executor {

    @Override
    void run();

    default void execute() {
        execute(this);

    }
}

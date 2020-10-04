package acrylic.threads;

import acrylic.math.KotlinTestKt;

import java.util.concurrent.Executor;

public interface AbstractThread extends Runnable, Executor {

    @Override
    void run();

    default void execute() {
        execute(this);

    }
}

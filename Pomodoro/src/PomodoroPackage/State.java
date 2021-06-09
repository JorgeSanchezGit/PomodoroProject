package PomodoroPackage;

public abstract class State {
    protected PomodoroApp pomoApp;
    abstract void pressRunButton();
    abstract void pressAddButton();
    abstract void pressDelButton();
}

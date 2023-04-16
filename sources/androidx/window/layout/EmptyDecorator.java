package androidx.window.layout;

import kotlin.jvm.internal.C3357i;

final class EmptyDecorator implements WindowInfoTrackerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    public WindowInfoTracker decorate(WindowInfoTracker windowInfoTracker) {
        C3357i.m24508e(windowInfoTracker, "tracker");
        return windowInfoTracker;
    }
}

package androidx.window.layout;

import android.content.Context;
import androidx.window.layout.WindowInfoTracker;

/* renamed from: androidx.window.layout.b */
public final /* synthetic */ class C1225b {
    static {
        WindowInfoTracker.Companion companion = WindowInfoTracker.Companion;
    }

    /* renamed from: a */
    public static WindowInfoTracker m4930a(Context context) {
        return WindowInfoTracker.Companion.getOrCreate(context);
    }

    /* renamed from: b */
    public static void m4931b(WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
        WindowInfoTracker.Companion.overrideDecorator(windowInfoTrackerDecorator);
    }

    /* renamed from: c */
    public static void m4932c() {
        WindowInfoTracker.Companion.reset();
    }
}

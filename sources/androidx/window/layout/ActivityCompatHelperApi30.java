package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import kotlin.jvm.internal.C3357i;

public final class ActivityCompatHelperApi30 {
    public static final ActivityCompatHelperApi30 INSTANCE = new ActivityCompatHelperApi30();

    private ActivityCompatHelperApi30() {
    }

    public final Rect currentWindowBounds(Activity activity) {
        C3357i.m24508e(activity, "activity");
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        C3357i.m24507d(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    public final Rect maximumWindowBounds(Activity activity) {
        C3357i.m24508e(activity, "activity");
        Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        C3357i.m24507d(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}

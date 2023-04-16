package androidx.window.layout;

import android.app.Activity;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;
import p037e5.C2576b;
import p037e5.C2578d;
import p100n4.C3773d;

public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private static final int BUFFER_CAPACITY = 10;
    public static final Companion Companion = new Companion((C3353e) null);
    /* access modifiers changed from: private */
    public final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C3353e eVar) {
            this();
        }
    }

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator2, WindowBackend windowBackend2) {
        C3357i.m24508e(windowMetricsCalculator2, "windowMetricsCalculator");
        C3357i.m24508e(windowBackend2, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator2;
        this.windowBackend = windowBackend2;
    }

    public C2576b<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        C3357i.m24508e(activity, "activity");
        return C2578d.m21268a(new WindowInfoTrackerImpl$windowLayoutInfo$1(this, activity, (C3773d<? super WindowInfoTrackerImpl$windowLayoutInfo$1>) null));
    }
}

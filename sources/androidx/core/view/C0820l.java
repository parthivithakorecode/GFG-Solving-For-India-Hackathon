package androidx.core.view;

import android.view.MotionEvent;

/* renamed from: androidx.core.view.l */
public final class C0820l {
    /* renamed from: a */
    public static boolean m3285a(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}

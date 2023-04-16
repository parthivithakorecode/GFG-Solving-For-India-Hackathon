package p066io.flutter.plugin.platform;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import p066io.flutter.view.C3102c;

/* renamed from: io.flutter.plugin.platform.a */
class C2998a {

    /* renamed from: a */
    private C3102c f19956a;

    C2998a() {
    }

    /* renamed from: a */
    public boolean mo13637a(MotionEvent motionEvent, boolean z) {
        C3102c cVar = this.f19956a;
        if (cVar == null) {
            return false;
        }
        return cVar.mo13936K(motionEvent, z);
    }

    /* renamed from: b */
    public boolean mo13638b(View view, View view2, AccessibilityEvent accessibilityEvent) {
        C3102c cVar = this.f19956a;
        if (cVar == null) {
            return false;
        }
        return cVar.mo13944x(view, view2, accessibilityEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo13639c(C3102c cVar) {
        this.f19956a = cVar;
    }
}

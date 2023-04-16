package p069j1;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.jp0;
import p054h1.C2694t;

/* renamed from: j1.p1 */
public final class C3196p1 {

    /* renamed from: a */
    private final View f20526a;

    /* renamed from: b */
    private Activity f20527b;

    /* renamed from: c */
    private boolean f20528c;

    /* renamed from: d */
    private boolean f20529d;

    /* renamed from: e */
    private boolean f20530e;

    /* renamed from: f */
    private final ViewTreeObserver.OnGlobalLayoutListener f20531f;

    public C3196p1(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f20527b = activity;
        this.f20526a = view;
        this.f20531f = onGlobalLayoutListener;
    }

    /* renamed from: f */
    private static ViewTreeObserver m24005f(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    /* renamed from: g */
    private final void m24006g() {
        if (!this.f20528c) {
            Activity activity = this.f20527b;
            if (activity != null) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f20531f;
                ViewTreeObserver f = m24005f(activity);
                if (f != null) {
                    f.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
            }
            C2694t.m21616y();
            jp0.m11762a(this.f20526a, this.f20531f);
            this.f20528c = true;
        }
    }

    /* renamed from: h */
    private final void m24007h() {
        Activity activity = this.f20527b;
        if (activity != null && this.f20528c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f20531f;
            ViewTreeObserver f = m24005f(activity);
            if (f != null) {
                C2694t.m21609r();
                f.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f20528c = false;
        }
    }

    /* renamed from: a */
    public final void mo14059a() {
        this.f20530e = false;
        m24007h();
    }

    /* renamed from: b */
    public final void mo14060b() {
        this.f20530e = true;
        if (this.f20529d) {
            m24006g();
        }
    }

    /* renamed from: c */
    public final void mo14061c() {
        this.f20529d = true;
        if (this.f20530e) {
            m24006g();
        }
    }

    /* renamed from: d */
    public final void mo14062d() {
        this.f20529d = false;
        m24007h();
    }

    /* renamed from: e */
    public final void mo14063e(Activity activity) {
        this.f20527b = activity;
    }
}

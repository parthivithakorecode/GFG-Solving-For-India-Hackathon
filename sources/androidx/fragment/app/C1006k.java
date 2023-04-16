package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.util.C0743e;

/* renamed from: androidx.fragment.app.k */
public abstract class C1006k<E> extends C1002g {

    /* renamed from: f */
    private final Activity f2698f;

    /* renamed from: g */
    private final Context f2699g;

    /* renamed from: h */
    private final Handler f2700h;

    /* renamed from: i */
    private final int f2701i;

    /* renamed from: j */
    final C1011n f2702j;

    C1006k(Activity activity, Context context, Handler handler, int i) {
        this.f2702j = new C1030o();
        this.f2698f = activity;
        this.f2699g = (Context) C0743e.m2959g(context, "context == null");
        this.f2700h = (Handler) C0743e.m2959g(handler, "handler == null");
        this.f2701i = i;
    }

    C1006k(C0990e eVar) {
        this(eVar, eVar, new Handler(), 0);
    }

    /* renamed from: d */
    public View mo3350d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean mo3351e() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Activity mo3529f() {
        return this.f2698f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Context mo3530j() {
        return this.f2699g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Handler mo3531l() {
        return this.f2700h;
    }

    /* renamed from: m */
    public abstract E mo3473m();

    /* renamed from: n */
    public LayoutInflater mo3474n() {
        return LayoutInflater.from(this.f2699g);
    }

    /* renamed from: o */
    public boolean mo3475o(Fragment fragment) {
        return true;
    }

    /* renamed from: p */
    public void mo3476p() {
    }
}

package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p102o.C3803b;

/* renamed from: androidx.appcompat.app.e */
public abstract class C0256e {

    /* renamed from: f */
    private static int f564f = -100;

    /* renamed from: g */
    private static final C3803b<WeakReference<C0256e>> f565g = new C3803b<>();

    /* renamed from: h */
    private static final Object f566h = new Object();

    C0256e() {
    }

    /* renamed from: c */
    static void m798c(C0256e eVar) {
        synchronized (f566h) {
            m803y(eVar);
            f565g.add(new WeakReference(eVar));
        }
    }

    /* renamed from: g */
    public static C0256e m799g(Activity activity, C0255d dVar) {
        return new C0257f(activity, dVar);
    }

    /* renamed from: h */
    public static C0256e m800h(Dialog dialog, C0255d dVar) {
        return new C0257f(dialog, dVar);
    }

    /* renamed from: j */
    public static int m801j() {
        return f564f;
    }

    /* renamed from: x */
    static void m802x(C0256e eVar) {
        synchronized (f566h) {
            m803y(eVar);
        }
    }

    /* renamed from: y */
    private static void m803y(C0256e eVar) {
        synchronized (f566h) {
            Iterator<WeakReference<C0256e>> it = f565g.iterator();
            while (it.hasNext()) {
                C0256e eVar2 = (C0256e) it.next().get();
                if (eVar2 == eVar || eVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: A */
    public abstract void mo660A(int i);

    /* renamed from: B */
    public abstract void mo661B(View view);

    /* renamed from: C */
    public abstract void mo662C(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: D */
    public void mo663D(int i) {
    }

    /* renamed from: E */
    public abstract void mo664E(CharSequence charSequence);

    /* renamed from: d */
    public abstract void mo665d(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    /* renamed from: e */
    public void mo666e(Context context) {
    }

    /* renamed from: f */
    public Context mo667f(Context context) {
        mo666e(context);
        return context;
    }

    /* renamed from: i */
    public abstract <T extends View> T mo668i(int i);

    /* renamed from: k */
    public int mo669k() {
        return -100;
    }

    /* renamed from: l */
    public abstract MenuInflater mo670l();

    /* renamed from: m */
    public abstract C0246a mo671m();

    /* renamed from: n */
    public abstract void mo672n();

    /* renamed from: o */
    public abstract void mo673o();

    /* renamed from: p */
    public abstract void mo674p(Configuration configuration);

    /* renamed from: q */
    public abstract void mo675q(Bundle bundle);

    /* renamed from: r */
    public abstract void mo676r();

    /* renamed from: s */
    public abstract void mo677s(Bundle bundle);

    /* renamed from: t */
    public abstract void mo678t();

    /* renamed from: u */
    public abstract void mo679u(Bundle bundle);

    /* renamed from: v */
    public abstract void mo680v();

    /* renamed from: w */
    public abstract void mo681w();

    /* renamed from: z */
    public abstract boolean mo682z(int i);
}

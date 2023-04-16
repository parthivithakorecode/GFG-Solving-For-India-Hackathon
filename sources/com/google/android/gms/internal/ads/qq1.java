package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.Collections;
import p003a2.C0092o;
import p048g2.C2635a;
import p048g2.C2637b;
import p054h1.C2694t;

public final class qq1 extends u90 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, y30 {

    /* renamed from: f */
    private View f13272f;

    /* renamed from: g */
    private C1609cz f13273g;

    /* renamed from: h */
    private mm1 f13274h;

    /* renamed from: i */
    private boolean f13275i = false;

    /* renamed from: j */
    private boolean f13276j = false;

    public qq1(mm1 mm1, rm1 rm1) {
        this.f13272f = rm1.mo10560N();
        this.f13273g = rm1.mo10564R();
        this.f13274h = mm1;
        if (rm1.mo10572Z() != null) {
            rm1.mo10572Z().mo7106Y0(this);
        }
    }

    /* renamed from: e */
    private final void m15811e() {
        View view;
        mm1 mm1 = this.f13274h;
        if (mm1 != null && (view = this.f13272f) != null) {
            mm1.mo9294O(view, Collections.emptyMap(), Collections.emptyMap(), mm1.m13354w(this.f13272f));
        }
    }

    /* renamed from: f */
    private final void m15812f() {
        View view = this.f13272f;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f13272f);
            }
        }
    }

    /* renamed from: z5 */
    private static final void m15813z5(y90 y90, int i) {
        try {
            y90.mo10147C(i);
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final C1609cz mo10347a() {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        if (!this.f13275i) {
            return this.f13273g;
        }
        io0.m11128d("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    /* renamed from: c */
    public final k40 mo10348c() {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        if (this.f13275i) {
            io0.m11128d("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        mm1 mm1 = this.f13274h;
        if (mm1 == null || mm1.mo9283A() == null) {
            return null;
        }
        return this.f13274h.mo9283A().mo9796a();
    }

    /* renamed from: g */
    public final void mo10349g() {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        m15812f();
        mm1 mm1 = this.f13274h;
        if (mm1 != null) {
            mm1.mo9123a();
        }
        this.f13274h = null;
        this.f13272f = null;
        this.f13273g = null;
        this.f13275i = true;
    }

    public final void onGlobalLayout() {
        m15811e();
    }

    public final void onScrollChanged() {
        m15811e();
    }

    /* renamed from: s1 */
    public final void mo10352s1(C2635a aVar, y90 y90) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        if (this.f13275i) {
            io0.m11128d("Instream ad can not be shown after destroy().");
            m15813z5(y90, 2);
            return;
        }
        View view = this.f13272f;
        if (view == null || this.f13273g == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            io0.m11128d(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
            m15813z5(y90, 0);
        } else if (this.f13276j) {
            io0.m11128d("Instream ad should not be used again.");
            m15813z5(y90, 1);
        } else {
            this.f13276j = true;
            m15812f();
            ((ViewGroup) C2637b.m21357C0(aVar)).addView(this.f13272f, new ViewGroup.LayoutParams(-1, -1));
            C2694t.m21616y();
            jp0.m11762a(this.f13272f, this);
            C2694t.m21616y();
            jp0.m11763b(this.f13272f, this);
            m15811e();
            try {
                y90.mo10148d();
            } catch (RemoteException e) {
                io0.m11133i("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zze(C2635a aVar) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        mo10352s1(aVar, new pq1(this));
    }
}

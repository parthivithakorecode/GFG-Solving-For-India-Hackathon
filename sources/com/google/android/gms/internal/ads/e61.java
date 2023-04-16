package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p048g2.C2637b;

public final class e61 extends t41 {

    /* renamed from: i */
    private final b60 f6098i;

    /* renamed from: j */
    private final Runnable f6099j;

    /* renamed from: k */
    private final Executor f6100k;

    public e61(u61 u61, b60 b60, Runnable runnable, Executor executor) {
        super(u61);
        this.f6098i = b60;
        this.f6099j = runnable;
        this.f6100k = executor;
    }

    /* renamed from: o */
    static /* synthetic */ void m8324o(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet((Object) null);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: b */
    public final void mo6842b() {
        this.f6100k.execute(new c61(this, new d61(new AtomicReference(this.f6099j))));
    }

    /* renamed from: h */
    public final int mo6843h() {
        return 0;
    }

    /* renamed from: i */
    public final View mo6844i() {
        return null;
    }

    /* renamed from: j */
    public final C1609cz mo6845j() {
        return null;
    }

    /* renamed from: k */
    public final sr2 mo6846k() {
        return null;
    }

    /* renamed from: l */
    public final sr2 mo6847l() {
        return null;
    }

    /* renamed from: m */
    public final void mo6848m() {
    }

    /* renamed from: n */
    public final void mo6849n(ViewGroup viewGroup, C2087pv pvVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo6850p(Runnable runnable) {
        try {
            if (!this.f6098i.mo5726s0(C2637b.m21358Z2(runnable))) {
                m8324o(((d61) runnable).f5666f);
            }
        } catch (RemoteException unused) {
            m8324o(((d61) runnable).f5666f);
        }
    }
}

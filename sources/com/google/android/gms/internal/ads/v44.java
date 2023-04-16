package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public abstract class v44 implements v54 {

    /* renamed from: a */
    private final ArrayList<u54> f15908a = new ArrayList<>(1);

    /* renamed from: b */
    private final HashSet<u54> f15909b = new HashSet<>(1);

    /* renamed from: c */
    private final c64 f15910c = new c64();

    /* renamed from: d */
    private final v24 f15911d = new v24();

    /* renamed from: e */
    private Looper f15912e;

    /* renamed from: f */
    private ei0 f15913f;

    /* renamed from: A */
    public final /* synthetic */ ei0 mo11384A() {
        return null;
    }

    /* renamed from: a */
    public final void mo11385a(u54 u54) {
        this.f15908a.remove(u54);
        if (this.f15908a.isEmpty()) {
            this.f15912e = null;
            this.f15913f = null;
            this.f15909b.clear();
            mo6388u();
            return;
        }
        mo11392k(u54);
    }

    /* renamed from: b */
    public final void mo11386b(Handler handler, w24 w24) {
        Objects.requireNonNull(w24);
        this.f15911d.mo11372b(handler, w24);
    }

    /* renamed from: c */
    public final void mo11387c(Handler handler, d64 d64) {
        Objects.requireNonNull(d64);
        this.f15910c.mo6065b(handler, d64);
    }

    /* renamed from: d */
    public final void mo11388d(u54 u54) {
        Objects.requireNonNull(this.f15912e);
        boolean isEmpty = this.f15909b.isEmpty();
        this.f15909b.add(u54);
        if (isEmpty) {
            mo6386r();
        }
    }

    /* renamed from: e */
    public final void mo11389e(w24 w24) {
        this.f15911d.mo11373c(w24);
    }

    /* renamed from: f */
    public final void mo11390f(d64 d64) {
        this.f15910c.mo6076m(d64);
    }

    /* renamed from: i */
    public final void mo11391i(u54 u54, vt1 vt1) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f15912e;
        boolean z = true;
        if (!(looper == null || looper == myLooper)) {
            z = false;
        }
        wu1.m19205d(z);
        ei0 ei0 = this.f15913f;
        this.f15908a.add(u54);
        if (this.f15912e == null) {
            this.f15912e = myLooper;
            this.f15909b.add(u54);
            mo6387s(vt1);
        } else if (ei0 != null) {
            mo11388d(u54);
            u54.mo5109a(this, ei0);
        }
    }

    /* renamed from: k */
    public final void mo11392k(u54 u54) {
        boolean isEmpty = this.f15909b.isEmpty();
        this.f15909b.remove(u54);
        if ((!isEmpty) && this.f15909b.isEmpty()) {
            mo6385p();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final v24 mo11393l(s54 s54) {
        return this.f15911d.mo11371a(0, s54);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final v24 mo11394m(int i, s54 s54) {
        return this.f15911d.mo11371a(i, s54);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final c64 mo11395n(s54 s54) {
        return this.f15910c.mo6064a(0, s54, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final c64 mo11396o(int i, s54 s54, long j) {
        return this.f15910c.mo6064a(i, s54, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo6385p() {
    }

    /* renamed from: q */
    public final /* synthetic */ boolean mo11397q() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo6386r() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract void mo6387s(vt1 vt1);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo11398t(ei0 ei0) {
        this.f15913f = ei0;
        ArrayList<u54> arrayList = this.f15908a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo5109a(this, ei0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract void mo6388u();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo11399v() {
        return !this.f15909b.isEmpty();
    }
}

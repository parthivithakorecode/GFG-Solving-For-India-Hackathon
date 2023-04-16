package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ea1;
import com.google.android.gms.internal.ads.v61;
import java.util.ArrayDeque;
import javax.annotation.concurrent.GuardedBy;
import p054h1.C2694t;

public final class qu2<R extends ea1<AdT>, AdT extends v61> {

    /* renamed from: a */
    private final tt2 f13308a;

    /* renamed from: b */
    private final ou2<R, AdT> f13309b;

    /* renamed from: c */
    private final pt2 f13310c;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: d */
    public final ArrayDeque<pu2<R, AdT>> f13311d;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: e */
    public wu2<R, AdT> f13312e;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: f */
    public int f13313f = 1;

    public qu2(tt2 tt2, pt2 pt2, ou2<R, AdT> ou2) {
        this.f13308a = tt2;
        this.f13310c = pt2;
        this.f13309b = ou2;
        this.f13311d = new ArrayDeque<>();
        pt2.mo10176b(new lu2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final synchronized void m15883h() {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10318K4)).booleanValue()) {
            if (!C2694t.m21607p().mo11025h().mo14084e().mo9806h()) {
                this.f13311d.clear();
                return;
            }
        }
        if (m15884i()) {
            while (!this.f13311d.isEmpty()) {
                pu2 pollFirst = this.f13311d.pollFirst();
                if (pollFirst == null || (pollFirst.zza() != null && this.f13308a.mo11116d(pollFirst.zza()))) {
                    wu2<R, AdT> wu2 = new wu2<>(this.f13308a, this.f13309b, pollFirst);
                    this.f13312e = wu2;
                    wu2.mo11737d(new mu2(this, pollFirst));
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    private final synchronized boolean m15884i() {
        return this.f13312e == null;
    }

    /* renamed from: a */
    public final synchronized cc3<nu2<R, AdT>> mo10395a(pu2<R, AdT> pu2) {
        this.f13313f = 2;
        if (m15884i()) {
            return null;
        }
        return this.f13312e.mo11734a(pu2);
    }

    /* renamed from: e */
    public final synchronized void mo10396e(pu2<R, AdT> pu2) {
        this.f13311d.add(pu2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo10397f() {
        synchronized (this) {
            this.f13313f = 1;
            m15883h();
        }
    }
}

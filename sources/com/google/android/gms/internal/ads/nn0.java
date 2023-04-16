package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;
import p034e2.C2547d;

public final class nn0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2547d f11555a;

    /* renamed from: b */
    private final xn0 f11556b;
    @GuardedBy("lock")

    /* renamed from: c */
    private final LinkedList<mn0> f11557c;

    /* renamed from: d */
    private final Object f11558d = new Object();

    /* renamed from: e */
    private final String f11559e;

    /* renamed from: f */
    private final String f11560f;
    @GuardedBy("lock")

    /* renamed from: g */
    private long f11561g = -1;
    @GuardedBy("lock")

    /* renamed from: h */
    private long f11562h = -1;
    @GuardedBy("lock")

    /* renamed from: i */
    private long f11563i = 0;
    @GuardedBy("lock")

    /* renamed from: j */
    private long f11564j = -1;
    @GuardedBy("lock")

    /* renamed from: k */
    private long f11565k = -1;

    nn0(C2547d dVar, xn0 xn0, String str, String str2) {
        this.f11555a = dVar;
        this.f11556b = xn0;
        this.f11559e = str;
        this.f11560f = str2;
        this.f11557c = new LinkedList<>();
    }

    /* renamed from: a */
    public final Bundle mo9554a() {
        Bundle bundle;
        synchronized (this.f11558d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f11559e);
            bundle.putString("slotid", this.f11560f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.f11564j);
            bundle.putLong("tresponse", this.f11565k);
            bundle.putLong("timp", this.f11561g);
            bundle.putLong("tload", this.f11562h);
            bundle.putLong("pcc", this.f11563i);
            bundle.putLong("tfetch", -1);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f11557c.iterator();
            while (it.hasNext()) {
                arrayList.add(((mn0) it.next()).mo9318b());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    /* renamed from: c */
    public final String mo9555c() {
        return this.f11559e;
    }

    /* renamed from: d */
    public final void mo9556d() {
        synchronized (this.f11558d) {
            if (this.f11565k != -1) {
                mn0 mn0 = new mn0(this);
                mn0.mo9320d();
                this.f11557c.add(mn0);
                this.f11563i++;
                this.f11556b.mo11867d();
                this.f11556b.mo11866b(this);
            }
        }
    }

    /* renamed from: e */
    public final void mo9557e() {
        synchronized (this.f11558d) {
            if (this.f11565k != -1 && !this.f11557c.isEmpty()) {
                mn0 last = this.f11557c.getLast();
                if (last.mo9317a() == -1) {
                    last.mo9319c();
                    this.f11556b.mo11866b(this);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo9558f() {
        synchronized (this.f11558d) {
            if (this.f11565k != -1 && this.f11561g == -1) {
                this.f11561g = this.f11555a.mo12463b();
                this.f11556b.mo11866b(this);
            }
            this.f11556b.mo11868e();
        }
    }

    /* renamed from: g */
    public final void mo9559g() {
        synchronized (this.f11558d) {
            this.f11556b.mo11869f();
        }
    }

    /* renamed from: h */
    public final void mo9560h(boolean z) {
        synchronized (this.f11558d) {
            if (this.f11565k != -1) {
                this.f11562h = this.f11555a.mo12463b();
            }
        }
    }

    /* renamed from: i */
    public final void mo9561i() {
        synchronized (this.f11558d) {
            this.f11556b.mo11870g();
        }
    }

    /* renamed from: j */
    public final void mo9562j(C1902kv kvVar) {
        synchronized (this.f11558d) {
            long b = this.f11555a.mo12463b();
            this.f11564j = b;
            this.f11556b.mo11871h(kvVar, b);
        }
    }

    /* renamed from: k */
    public final void mo9563k(long j) {
        synchronized (this.f11558d) {
            this.f11565k = j;
            if (j != -1) {
                this.f11556b.mo11866b(this);
            }
        }
    }
}

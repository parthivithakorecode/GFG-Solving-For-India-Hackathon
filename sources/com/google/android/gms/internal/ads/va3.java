package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

abstract class va3<OutputT> extends ca3<OutputT> {

    /* renamed from: o */
    private static final ra3 f16150o;

    /* renamed from: p */
    private static final Logger f16151p = Logger.getLogger(va3.class.getName());
    /* access modifiers changed from: private */
    @CheckForNull

    /* renamed from: m */
    public volatile Set<Throwable> f16152m = null;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public volatile int f16153n;

    static {
        Throwable th;
        ra3 ra3;
        try {
            ra3 = new sa3(AtomicReferenceFieldUpdater.newUpdater(va3.class, Set.class, "m"), AtomicIntegerFieldUpdater.newUpdater(va3.class, "n"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            ra3 = new ua3((ta3) null);
        }
        f16150o = ra3;
        if (th != null) {
            f16151p.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    va3(int i) {
        this.f16153n = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final int mo11439F() {
        return f16150o.mo10500a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final Set<Throwable> mo11440H() {
        Set<Throwable> set = this.f16152m;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        mo10003L(newSetFromMap);
        f16150o.mo10501b(this, (Set<Throwable>) null, newSetFromMap);
        Set<Throwable> set2 = this.f16152m;
        set2.getClass();
        return set2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo11441K() {
        this.f16152m = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public abstract void mo10003L(Set<Throwable> set);
}

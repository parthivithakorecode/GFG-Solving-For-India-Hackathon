package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class bp2 {

    /* renamed from: e */
    private static bp2 f5003e;

    /* renamed from: a */
    private final Handler f5004a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final CopyOnWriteArrayList<WeakReference<h94>> f5005b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final Object f5006c = new Object();

    /* renamed from: d */
    private int f5007d = 0;

    private bp2(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new xl2(this, (wk2) null), intentFilter);
    }

    /* renamed from: b */
    public static synchronized bp2 m7017b(Context context) {
        bp2 bp2;
        synchronized (bp2.class) {
            if (f5003e == null) {
                f5003e = new bp2(context);
            }
            bp2 = f5003e;
        }
        return bp2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = r0.next();
        r2 = (com.google.android.gms.internal.ads.h94) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        com.google.android.gms.internal.ads.j94.m11523f(r2.f8119a, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r3.f5005b.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r0 = r3.f5005b.iterator();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m7018c(com.google.android.gms.internal.ads.bp2 r3, int r4) {
        /*
            java.lang.Object r0 = r3.f5006c
            monitor-enter(r0)
            int r1 = r3.f5007d     // Catch:{ all -> 0x0033 }
            if (r1 != r4) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return
        L_0x0009:
            r3.f5007d = r4     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.google.android.gms.internal.ads.h94>> r0 = r3.f5005b
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            com.google.android.gms.internal.ads.h94 r2 = (com.google.android.gms.internal.ads.h94) r2
            if (r2 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.j94 r1 = r2.f8119a
            r1.m11526j(r4)
            goto L_0x0012
        L_0x002c:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.google.android.gms.internal.ads.h94>> r2 = r3.f5005b
            r2.remove(r1)
            goto L_0x0012
        L_0x0032:
            return
        L_0x0033:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bp2.m7018c(com.google.android.gms.internal.ads.bp2, int):void");
    }

    /* renamed from: a */
    public final int mo5914a() {
        int i;
        synchronized (this.f5006c) {
            i = this.f5007d;
        }
        return i;
    }

    /* renamed from: d */
    public final void mo5915d(h94 h94) {
        Iterator<WeakReference<h94>> it = this.f5005b.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            if (next.get() == null) {
                this.f5005b.remove(next);
            }
        }
        this.f5005b.add(new WeakReference(h94));
        this.f5004a.post(new ui2(this, h94, (byte[]) null));
    }
}

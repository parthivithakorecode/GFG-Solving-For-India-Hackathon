package p172z1;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p131s2.C4029i;
import p166y1.C4376b;

/* renamed from: z1.p */
public final class C4519p {

    /* renamed from: a */
    private final Map<BasePendingResult<?>, Boolean> f23030a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<C4029i<?>, Boolean> f23031b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: f */
    private final void m27393f(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f23030a) {
            hashMap = new HashMap(this.f23030a);
        }
        synchronized (this.f23031b) {
            hashMap2 = new HashMap(this.f23031b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo5017b(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C4029i) entry2.getKey()).mo15527d(new C4376b(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <TResult> void mo16182a(C4029i<TResult> iVar, boolean z) {
        this.f23031b.put(iVar, Boolean.valueOf(z));
        iVar.mo15524a().mo15505c(new C4536x0(this, iVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo16183b() {
        return !this.f23030a.isEmpty() || !this.f23031b.isEmpty();
    }

    /* renamed from: c */
    public final void mo16184c() {
        m27393f(false, C4496e.f22961w);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16185d(int r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The connection to Google Play services was lost"
            r0.<init>(r1)
            r1 = 1
            if (r4 != r1) goto L_0x0010
            java.lang.String r4 = " due to service disconnection."
        L_0x000c:
            r0.append(r4)
            goto L_0x0016
        L_0x0010:
            r2 = 3
            if (r4 != r2) goto L_0x0016
            java.lang.String r4 = " due to dead object exception."
            goto L_0x000c
        L_0x0016:
            if (r5 == 0) goto L_0x0020
            java.lang.String r4 = " Last reason for disconnect: "
            r0.append(r4)
            r0.append(r5)
        L_0x0020:
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status
            r5 = 20
            java.lang.String r0 = r0.toString()
            r4.<init>((int) r5, (java.lang.String) r0)
            r3.m27393f(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p172z1.C4519p.mo16185d(int, java.lang.String):void");
    }
}

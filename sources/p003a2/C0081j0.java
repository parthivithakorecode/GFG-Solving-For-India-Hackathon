package p003a2;

import android.os.Bundle;
import p160x1.C4280b;

/* renamed from: a2.j0 */
abstract class C0081j0 extends C0097q0<Boolean> {

    /* renamed from: d */
    public final int f183d;

    /* renamed from: e */
    public final Bundle f184e;

    /* renamed from: f */
    final /* synthetic */ C0052c f185f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C0081j0(C0052c cVar, int i, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f185f = cVar;
        this.f183d = i;
        this.f184e = bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo248a() {
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo249b(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f183d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.mo250f()
            if (r3 != 0) goto L_0x001b
            a2.c r3 = r2.f185f
            r3.m182h0(r0, null)
            x1.b r3 = new x1.b
            r0 = 8
            r3.<init>(r0, r1)
        L_0x0018:
            r2.mo251g(r3)
        L_0x001b:
            return
        L_0x001c:
            a2.c r3 = r2.f185f
            r3.m182h0(r0, null)
            android.os.Bundle r3 = r2.f184e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            x1.b r3 = new x1.b
            int r0 = r2.f183d
            r3.<init>(r0, r1)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: p003a2.C0081j0.mo249b(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo250f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo251g(C4280b bVar);
}

package p016b5;

import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;
import p079k4.C3330q;
import p145u4.C4150l;

/* renamed from: b5.u */
final class C1403u {

    /* renamed from: a */
    public final Object f3601a;

    /* renamed from: b */
    public final C1356i f3602b;

    /* renamed from: c */
    public final C4150l<Throwable, C3330q> f3603c;

    /* renamed from: d */
    public final Object f3604d;

    /* renamed from: e */
    public final Throwable f3605e;

    public C1403u(Object obj, C1356i iVar, C4150l<? super Throwable, C3330q> lVar, Object obj2, Throwable th) {
        this.f3601a = obj;
        this.f3602b = iVar;
        this.f3603c = lVar;
        this.f3604d = obj2;
        this.f3605e = th;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1403u(Object obj, C1356i iVar, C4150l lVar, Object obj2, Throwable th, int i, C3353e eVar) {
        this(obj, (i & 2) != 0 ? null : iVar, (i & 4) != 0 ? null : lVar, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }

    /* renamed from: b */
    public static /* synthetic */ C1403u m5466b(C1403u uVar, Object obj, C1356i iVar, C4150l<Throwable, C3330q> lVar, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = uVar.f3601a;
        }
        if ((i & 2) != 0) {
            iVar = uVar.f3602b;
        }
        C1356i iVar2 = iVar;
        if ((i & 4) != 0) {
            lVar = uVar.f3603c;
        }
        C4150l<Throwable, C3330q> lVar2 = lVar;
        if ((i & 8) != 0) {
            obj2 = uVar.f3604d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = uVar.f3605e;
        }
        return uVar.mo4778a(obj, iVar2, lVar2, obj4, th);
    }

    /* renamed from: a */
    public final C1403u mo4778a(Object obj, C1356i iVar, C4150l<? super Throwable, C3330q> lVar, Object obj2, Throwable th) {
        return new C1403u(obj, iVar, lVar, obj2, th);
    }

    /* renamed from: c */
    public final boolean mo4779c() {
        return this.f3605e != null;
    }

    /* renamed from: d */
    public final void mo4780d(C1371l<?> lVar, Throwable th) {
        C1356i iVar = this.f3602b;
        if (iVar != null) {
            lVar.mo4749n(iVar, th);
        }
        C4150l<Throwable, C3330q> lVar2 = this.f3603c;
        if (lVar2 != null) {
            lVar.mo4750p(lVar2, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1403u)) {
            return false;
        }
        C1403u uVar = (C1403u) obj;
        return C3357i.m24504a(this.f3601a, uVar.f3601a) && C3357i.m24504a(this.f3602b, uVar.f3602b) && C3357i.m24504a(this.f3603c, uVar.f3603c) && C3357i.m24504a(this.f3604d, uVar.f3604d) && C3357i.m24504a(this.f3605e, uVar.f3605e);
    }

    public int hashCode() {
        Object obj = this.f3601a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C1356i iVar = this.f3602b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        C4150l<Throwable, C3330q> lVar = this.f3603c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f3604d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f3605e;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f3601a + ", cancelHandler=" + this.f3602b + ", onCancellation=" + this.f3603c + ", idempotentResume=" + this.f3604d + ", cancelCause=" + this.f3605e + ')';
    }
}

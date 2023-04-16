package kotlinx.coroutines.internal;

import kotlin.jvm.internal.C3357i;
import p016b5.C1349g2;
import p100n4.C3778g;

/* renamed from: kotlinx.coroutines.internal.l0 */
final class C3400l0 {

    /* renamed from: a */
    public final C3778g f20891a;

    /* renamed from: b */
    private final Object[] f20892b;

    /* renamed from: c */
    private final C1349g2<Object>[] f20893c;

    /* renamed from: d */
    private int f20894d;

    public C3400l0(C3778g gVar, int i) {
        this.f20891a = gVar;
        this.f20892b = new Object[i];
        this.f20893c = new C1349g2[i];
    }

    /* renamed from: a */
    public final void mo14438a(C1349g2<?> g2Var, Object obj) {
        Object[] objArr = this.f20892b;
        int i = this.f20894d;
        objArr[i] = obj;
        C1349g2<Object>[] g2VarArr = this.f20893c;
        this.f20894d = i + 1;
        g2VarArr[i] = g2Var;
    }

    /* renamed from: b */
    public final void mo14439b(C3778g gVar) {
        int length = this.f20893c.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                C1349g2<Object> g2Var = this.f20893c[length];
                C3357i.m24505b(g2Var);
                g2Var.mo4707n(gVar, this.f20892b[length]);
                if (i >= 0) {
                    length = i;
                } else {
                    return;
                }
            }
        }
    }
}

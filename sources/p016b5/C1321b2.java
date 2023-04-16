package p016b5;

import kotlin.jvm.internal.C3357i;
import kotlinx.coroutines.internal.C3406p;
import kotlinx.coroutines.internal.C3408r;

/* renamed from: b5.b2 */
public final class C1321b2 extends C3406p implements C1373l1 {
    /* renamed from: d */
    public boolean mo4653d() {
        return true;
    }

    /* renamed from: h */
    public C1321b2 mo4654h() {
        return this;
    }

    public String toString() {
        return C1384o0.m5427c() ? mo4669y("Active") : super.toString();
    }

    /* renamed from: y */
    public final String mo4669y(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z = true;
        for (C3408r rVar = (C3408r) mo14444o(); !C3357i.m24504a(rVar, this); rVar = rVar.mo14445p()) {
            if (rVar instanceof C1411w1) {
                C1411w1 w1Var = (C1411w1) rVar;
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(w1Var);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        C3357i.m24507d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}

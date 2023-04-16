package p003a2;

import android.content.Context;
import android.util.SparseIntArray;
import p160x1.C4284f;
import p166y1.C4365a;

/* renamed from: a2.d0 */
public final class C0062d0 {

    /* renamed from: a */
    private final SparseIntArray f134a = new SparseIntArray();

    /* renamed from: b */
    private C4284f f135b;

    public C0062d0(C4284f fVar) {
        C0092o.m313i(fVar);
        this.f135b = fVar;
    }

    /* renamed from: a */
    public final int mo214a(Context context, C4365a.C4374f fVar) {
        C0092o.m313i(context);
        C0092o.m313i(fVar);
        int i = 0;
        if (!fVar.mo15990e()) {
            return 0;
        }
        int i2 = fVar.mo178i();
        int b = mo215b(context, i2);
        if (b == -1) {
            int i3 = 0;
            while (true) {
                if (i3 >= this.f134a.size()) {
                    i = -1;
                    break;
                }
                int keyAt = this.f134a.keyAt(i3);
                if (keyAt > i2 && this.f134a.get(keyAt) == 0) {
                    break;
                }
                i3++;
            }
            b = i == -1 ? this.f135b.mo15863h(context, i2) : i;
            this.f134a.put(i2, b);
        }
        return b;
    }

    /* renamed from: b */
    public final int mo215b(Context context, int i) {
        return this.f134a.get(i, -1);
    }

    /* renamed from: c */
    public final void mo216c() {
        this.f134a.clear();
    }
}

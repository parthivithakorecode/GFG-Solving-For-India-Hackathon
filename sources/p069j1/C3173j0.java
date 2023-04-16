package p069j1;

import java.util.ArrayList;
import java.util.List;

/* renamed from: j1.j0 */
public final class C3173j0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<String> f20486a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<Double> f20487b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List<Double> f20488c = new ArrayList();

    /* renamed from: a */
    public final C3173j0 mo14043a(String str, double d, double d2) {
        int i = 0;
        while (i < this.f20486a.size()) {
            double doubleValue = this.f20488c.get(i).doubleValue();
            double doubleValue2 = this.f20487b.get(i).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.f20486a.add(i, str);
        this.f20488c.add(i, Double.valueOf(d));
        this.f20487b.add(i, Double.valueOf(d2));
        return this;
    }

    /* renamed from: b */
    public final C3181l0 mo14044b() {
        return new C3181l0(this, (C3177k0) null);
    }
}

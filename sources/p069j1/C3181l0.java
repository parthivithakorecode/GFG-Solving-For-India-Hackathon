package p069j1;

import java.util.ArrayList;
import java.util.List;

/* renamed from: j1.l0 */
public final class C3181l0 {

    /* renamed from: a */
    private final String[] f20494a;

    /* renamed from: b */
    private final double[] f20495b;

    /* renamed from: c */
    private final double[] f20496c;

    /* renamed from: d */
    private final int[] f20497d;

    /* renamed from: e */
    private int f20498e = 0;

    /* synthetic */ C3181l0(C3173j0 j0Var, C3177k0 k0Var) {
        int size = j0Var.f20487b.size();
        this.f20494a = (String[]) j0Var.f20486a.toArray(new String[size]);
        this.f20495b = m23983c(j0Var.f20487b);
        this.f20496c = m23983c(j0Var.f20488c);
        this.f20497d = new int[size];
    }

    /* renamed from: c */
    private static final double[] m23983c(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = list.get(i).doubleValue();
        }
        return dArr;
    }

    /* renamed from: a */
    public final List<C3169i0> mo14049a() {
        ArrayList arrayList = new ArrayList(this.f20494a.length);
        int i = 0;
        while (true) {
            String[] strArr = this.f20494a;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double d = this.f20496c[i];
            double d2 = this.f20495b[i];
            int i2 = this.f20497d[i];
            arrayList.add(new C3169i0(str, d, d2, ((double) i2) / ((double) this.f20498e), i2));
            i++;
        }
    }

    /* renamed from: b */
    public final void mo14050b(double d) {
        this.f20498e++;
        int i = 0;
        while (true) {
            double[] dArr = this.f20496c;
            if (i < dArr.length) {
                double d2 = dArr[i];
                if (d2 <= d && d < this.f20495b[i]) {
                    int[] iArr = this.f20497d;
                    iArr[i] = iArr[i] + 1;
                }
                if (d >= d2) {
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}

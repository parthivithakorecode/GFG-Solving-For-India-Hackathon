package p025d0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p053h0.C2672d;
import p053h0.C2673e;

/* renamed from: d0.c */
public class C2467c implements C2673e, C2672d {

    /* renamed from: n */
    static final TreeMap<Integer, C2467c> f18509n = new TreeMap<>();

    /* renamed from: f */
    private volatile String f18510f;

    /* renamed from: g */
    final long[] f18511g;

    /* renamed from: h */
    final double[] f18512h;

    /* renamed from: i */
    final String[] f18513i;

    /* renamed from: j */
    final byte[][] f18514j;

    /* renamed from: k */
    private final int[] f18515k;

    /* renamed from: l */
    final int f18516l;

    /* renamed from: m */
    int f18517m;

    private C2467c(int i) {
        this.f18516l = i;
        int i2 = i + 1;
        this.f18515k = new int[i2];
        this.f18511g = new long[i2];
        this.f18512h = new double[i2];
        this.f18513i = new String[i2];
        this.f18514j = new byte[i2][];
    }

    /* renamed from: m */
    public static C2467c m20905m(String str, int i) {
        TreeMap<Integer, C2467c> treeMap = f18509n;
        synchronized (treeMap) {
            Map.Entry<Integer, C2467c> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                C2467c value = ceilingEntry.getValue();
                value.mo12298n(str, i);
                return value;
            }
            C2467c cVar = new C2467c(i);
            cVar.mo12298n(str, i);
            return cVar;
        }
    }

    /* renamed from: u */
    private static void m20906u() {
        TreeMap<Integer, C2467c> treeMap = f18509n;
        if (treeMap.size() > 15) {
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            while (true) {
                int i = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: D */
    public void mo12293D(int i, byte[] bArr) {
        this.f18515k[i] = 5;
        this.f18514j[i] = bArr;
    }

    public void close() {
    }

    /* renamed from: d */
    public String mo12295d() {
        return this.f18510f;
    }

    /* renamed from: h */
    public void mo12296h(C2672d dVar) {
        for (int i = 1; i <= this.f18517m; i++) {
            int i2 = this.f18515k[i];
            if (i2 == 1) {
                dVar.mo12299p(i);
            } else if (i2 == 2) {
                dVar.mo12302x(i, this.f18511g[i]);
            } else if (i2 == 3) {
                dVar.mo12300q(i, this.f18512h[i]);
            } else if (i2 == 4) {
                dVar.mo12297j(i, this.f18513i[i]);
            } else if (i2 == 5) {
                dVar.mo12293D(i, this.f18514j[i]);
            }
        }
    }

    /* renamed from: j */
    public void mo12297j(int i, String str) {
        this.f18515k[i] = 4;
        this.f18513i[i] = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo12298n(String str, int i) {
        this.f18510f = str;
        this.f18517m = i;
    }

    /* renamed from: p */
    public void mo12299p(int i) {
        this.f18515k[i] = 1;
    }

    /* renamed from: q */
    public void mo12300q(int i, double d) {
        this.f18515k[i] = 3;
        this.f18512h[i] = d;
    }

    /* renamed from: v */
    public void mo12301v() {
        TreeMap<Integer, C2467c> treeMap = f18509n;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f18516l), this);
            m20906u();
        }
    }

    /* renamed from: x */
    public void mo12302x(int i, long j) {
        this.f18515k[i] = 2;
        this.f18511g[i] = j;
    }
}

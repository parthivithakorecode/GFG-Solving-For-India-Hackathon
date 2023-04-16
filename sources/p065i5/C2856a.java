package p065i5;

import java.io.Serializable;
import p058h5.C2742b;
import p058h5.C2755h;
import p065i5.C2858b;
import p080k5.C3334d;
import p087l5.C3604b;
import p087l5.C3630l;

/* renamed from: i5.a */
abstract class C2856a<D extends C2858b> extends C2858b implements Serializable {

    /* renamed from: i5.a$a */
    static /* synthetic */ class C2857a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19547a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                l5.b[] r0 = p087l5.C3604b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19547a = r0
                l5.b r1 = p087l5.C3604b.DAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19547a     // Catch:{ NoSuchFieldError -> 0x001d }
                l5.b r1 = p087l5.C3604b.WEEKS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19547a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l5.b r1 = p087l5.C3604b.MONTHS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f19547a     // Catch:{ NoSuchFieldError -> 0x0033 }
                l5.b r1 = p087l5.C3604b.YEARS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f19547a     // Catch:{ NoSuchFieldError -> 0x003e }
                l5.b r1 = p087l5.C3604b.DECADES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f19547a     // Catch:{ NoSuchFieldError -> 0x0049 }
                l5.b r1 = p087l5.C3604b.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f19547a     // Catch:{ NoSuchFieldError -> 0x0054 }
                l5.b r1 = p087l5.C3604b.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p065i5.C2856a.C2857a.<clinit>():void");
        }
    }

    C2856a() {
    }

    /* renamed from: A */
    public C2856a<D> mo12852v(long j, C3630l lVar) {
        if (!(lVar instanceof C3604b)) {
            return (C2856a) mo12847r().mo13129e(lVar.mo14741d(this, j));
        }
        switch (C2857a.f19547a[((C3604b) lVar).ordinal()]) {
            case 1:
                return mo13103B(j);
            case 2:
                return mo13103B(C3334d.m24476l(j, 7));
            case 3:
                return mo13104C(j);
            case 4:
                return mo13105D(j);
            case 5:
                return mo13105D(C3334d.m24476l(j, 10));
            case 6:
                return mo13105D(C3334d.m24476l(j, 100));
            case 7:
                return mo13105D(C3334d.m24476l(j, 1000));
            default:
                throw new C2742b(lVar + " not valid for chronology " + mo12847r().mo13136k());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public abstract C2856a<D> mo13103B(long j);

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public abstract C2856a<D> mo13104C(long j);

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public abstract C2856a<D> mo13105D(long j);

    /* renamed from: p */
    public C2860c<?> mo12845p(C2755h hVar) {
        return C2862d.m22415C(this, hVar);
    }
}

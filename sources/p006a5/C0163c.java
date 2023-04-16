package p006a5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C3357i;
import p079k4.C3321j;
import p145u4.C4154p;
import p163x4.C4353c;
import p175z4.C4601b;

/* renamed from: a5.c */
final class C0163c implements C4601b<C4353c> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f288a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f289b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f290c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4154p<CharSequence, Integer, C3321j<Integer, Integer>> f291d;

    /* renamed from: a5.c$a */
    public static final class C0164a implements Iterator<C4353c> {

        /* renamed from: f */
        private int f292f = -1;

        /* renamed from: g */
        private int f293g;

        /* renamed from: h */
        private int f294h;

        /* renamed from: i */
        private C4353c f295i;

        /* renamed from: j */
        private int f296j;

        /* renamed from: k */
        final /* synthetic */ C0163c f297k;

        C0164a(C0163c cVar) {
            this.f297k = cVar;
            int e = C4357f.m26997e(cVar.f289b, 0, cVar.f288a.length());
            this.f293g = e;
            this.f294h = e;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < p006a5.C0163c.m476c(r6.f297k)) goto L_0x0023;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m478a() {
            /*
                r6 = this;
                int r0 = r6.f294h
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f292f = r1
                r0 = 0
                r6.f295i = r0
                goto L_0x0099
            L_0x000c:
                a5.c r0 = r6.f297k
                int r0 = r0.f290c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f296j
                int r0 = r0 + r3
                r6.f296j = r0
                a5.c r4 = r6.f297k
                int r4 = r4.f290c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f294h
                a5.c r4 = r6.f297k
                java.lang.CharSequence r4 = r4.f288a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                x4.c r0 = new x4.c
                int r1 = r6.f293g
                a5.c r4 = r6.f297k
                java.lang.CharSequence r4 = r4.f288a
                int r4 = p006a5.C0179o.m552s(r4)
                r0.<init>(r1, r4)
            L_0x0042:
                r6.f295i = r0
            L_0x0044:
                r6.f294h = r2
                goto L_0x0097
            L_0x0047:
                a5.c r0 = r6.f297k
                u4.p r0 = r0.f291d
                a5.c r4 = r6.f297k
                java.lang.CharSequence r4 = r4.f288a
                int r5 = r6.f294h
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                k4.j r0 = (p079k4.C3321j) r0
                if (r0 != 0) goto L_0x0073
                x4.c r0 = new x4.c
                int r1 = r6.f293g
                a5.c r4 = r6.f297k
                java.lang.CharSequence r4 = r4.f288a
                int r4 = p006a5.C0179o.m552s(r4)
                r0.<init>(r1, r4)
                goto L_0x0042
            L_0x0073:
                java.lang.Object r2 = r0.mo14321a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo14322b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f293g
                x4.c r4 = p163x4.C4357f.m26999g(r4, r2)
                r6.f295i = r4
                int r2 = r2 + r0
                r6.f293g = r2
                if (r0 != 0) goto L_0x0095
                r1 = r3
            L_0x0095:
                int r2 = r2 + r1
                goto L_0x0044
            L_0x0097:
                r6.f292f = r3
            L_0x0099:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p006a5.C0163c.C0164a.m478a():void");
        }

        /* renamed from: b */
        public C4353c next() {
            if (this.f292f == -1) {
                m478a();
            }
            if (this.f292f != 0) {
                C4353c cVar = this.f295i;
                C3357i.m24506c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f295i = null;
                this.f292f = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f292f == -1) {
                m478a();
            }
            return this.f292f == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0163c(CharSequence charSequence, int i, int i2, C4154p<? super CharSequence, ? super Integer, C3321j<Integer, Integer>> pVar) {
        C3357i.m24508e(charSequence, "input");
        C3357i.m24508e(pVar, "getNextMatch");
        this.f288a = charSequence;
        this.f289b = i;
        this.f290c = i2;
        this.f291d = pVar;
    }

    public Iterator<C4353c> iterator() {
        return new C0164a(this);
    }
}

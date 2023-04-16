package p149v2;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p161x2.C4325d;

/* renamed from: v2.f */
public final class C4210f {

    /* renamed from: a */
    private C4325d f22484a = C4325d.f22646l;

    /* renamed from: b */
    private C4224t f22485b = C4224t.DEFAULT;

    /* renamed from: c */
    private C4202d f22486c = C4195c.IDENTITY;

    /* renamed from: d */
    private final Map<Type, C4211g<?>> f22487d = new HashMap();

    /* renamed from: e */
    private final List<C4235x> f22488e = new ArrayList();

    /* renamed from: f */
    private final List<C4235x> f22489f = new ArrayList();

    /* renamed from: g */
    private boolean f22490g = false;

    /* renamed from: h */
    private String f22491h;

    /* renamed from: i */
    private int f22492i = 2;

    /* renamed from: j */
    private int f22493j = 2;

    /* renamed from: k */
    private boolean f22494k = false;

    /* renamed from: l */
    private boolean f22495l = false;

    /* renamed from: m */
    private boolean f22496m = true;

    /* renamed from: n */
    private boolean f22497n = false;

    /* renamed from: o */
    private boolean f22498o = false;

    /* renamed from: p */
    private boolean f22499p = false;

    /* renamed from: q */
    private C4232v f22500q = C4227u.DOUBLE;

    /* renamed from: r */
    private C4232v f22501r = C4227u.LAZILY_PARSED_NUMBER;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26703a(java.lang.String r5, int r6, int r7, java.util.List<p149v2.C4235x> r8) {
        /*
            r4 = this;
            boolean r0 = p014b3.C1309d.f3517a
            r1 = 0
            if (r5 == 0) goto L_0x0026
            java.lang.String r2 = r5.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0026
            y2.d$b<java.util.Date> r6 = p167y2.C4400d.C4402b.f22759b
            v2.x r6 = r6.mo16021b(r5)
            if (r0 == 0) goto L_0x0024
            y2.d$b<? extends java.util.Date> r7 = p014b3.C1309d.f3519c
            v2.x r1 = r7.mo16021b(r5)
            y2.d$b<? extends java.util.Date> r7 = p014b3.C1309d.f3518b
            v2.x r5 = r7.mo16021b(r5)
            goto L_0x0045
        L_0x0024:
            r5 = r1
            goto L_0x0045
        L_0x0026:
            r5 = 2
            if (r6 == r5) goto L_0x0050
            if (r7 == r5) goto L_0x0050
            y2.d$b<java.util.Date> r5 = p167y2.C4400d.C4402b.f22759b
            v2.x r5 = r5.mo16020a(r6, r7)
            if (r0 == 0) goto L_0x0043
            y2.d$b<? extends java.util.Date> r1 = p014b3.C1309d.f3519c
            v2.x r1 = r1.mo16020a(r6, r7)
            y2.d$b<? extends java.util.Date> r2 = p014b3.C1309d.f3518b
            v2.x r6 = r2.mo16020a(r6, r7)
            r3 = r6
            r6 = r5
            r5 = r3
            goto L_0x0045
        L_0x0043:
            r6 = r5
            goto L_0x0024
        L_0x0045:
            r8.add(r6)
            if (r0 == 0) goto L_0x0050
            r8.add(r1)
            r8.add(r5)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p149v2.C4210f.m26703a(java.lang.String, int, int, java.util.List):void");
    }

    /* renamed from: b */
    public C4203e mo15740b() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f22488e.size() + this.f22489f.size() + 3);
        arrayList2.addAll(this.f22488e);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f22489f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        m26703a(this.f22491h, this.f22492i, this.f22493j, arrayList2);
        return new C4203e(this.f22484a, this.f22486c, this.f22487d, this.f22490g, this.f22494k, this.f22498o, this.f22496m, this.f22497n, this.f22499p, this.f22495l, this.f22485b, this.f22491h, this.f22492i, this.f22493j, this.f22488e, this.f22489f, arrayList, this.f22500q, this.f22501r);
    }

    /* renamed from: c */
    public C4210f mo15741c(C4235x xVar) {
        this.f22488e.add(xVar);
        return this;
    }
}

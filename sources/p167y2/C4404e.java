package p167y2;

import p021c3.C1439a;
import p149v2.C4203e;
import p149v2.C4233w;
import p149v2.C4235x;
import p155w2.C4266b;
import p161x2.C4310c;

/* renamed from: y2.e */
public final class C4404e implements C4235x {

    /* renamed from: f */
    private final C4310c f22761f;

    public C4404e(C4310c cVar) {
        this.f22761f = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: v2.w<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: v2.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: y2.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: y2.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: y2.l} */
    /* JADX WARNING: type inference failed for: r9v3, types: [v2.w, v2.w<?>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p149v2.C4233w<?> mo16022a(p161x2.C4310c r9, p149v2.C4203e r10, p021c3.C1439a<?> r11, p155w2.C4266b r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            c3.a r0 = p021c3.C1439a.m5626a(r0)
            x2.i r9 = r9.mo15900a(r0)
            java.lang.Object r9 = r9.mo15902a()
            boolean r0 = r9 instanceof p149v2.C4233w
            if (r0 == 0) goto L_0x0017
            v2.w r9 = (p149v2.C4233w) r9
            goto L_0x0075
        L_0x0017:
            boolean r0 = r9 instanceof p149v2.C4235x
            if (r0 == 0) goto L_0x0022
            v2.x r9 = (p149v2.C4235x) r9
            v2.w r9 = r9.create(r10, r11)
            goto L_0x0075
        L_0x0022:
            boolean r0 = r9 instanceof p149v2.C4222r
            if (r0 != 0) goto L_0x005b
            boolean r1 = r9 instanceof p149v2.C4214j
            if (r1 == 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r12.append(r0)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x005b:
            r1 = 0
            if (r0 == 0) goto L_0x0063
            r0 = r9
            v2.r r0 = (p149v2.C4222r) r0
            r3 = r0
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            boolean r0 = r9 instanceof p149v2.C4214j
            if (r0 == 0) goto L_0x006b
            r1 = r9
            v2.j r1 = (p149v2.C4214j) r1
        L_0x006b:
            r4 = r1
            y2.l r9 = new y2.l
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0075:
            if (r9 == 0) goto L_0x0081
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0081
            v2.w r9 = r9.mo15780b()
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p167y2.C4404e.mo16022a(x2.c, v2.e, c3.a, w2.b):v2.w");
    }

    public <T> C4233w<T> create(C4203e eVar, C1439a<T> aVar) {
        C4266b bVar = (C4266b) aVar.mo4848c().getAnnotation(C4266b.class);
        if (bVar == null) {
            return null;
        }
        return mo16022a(this.f22761f, eVar, aVar, bVar);
    }
}

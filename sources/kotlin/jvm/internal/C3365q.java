package kotlin.jvm.internal;

import p169y4.C4476c;
import p169y4.C4477d;
import p169y4.C4478e;
import p169y4.C4479f;

/* renamed from: kotlin.jvm.internal.q */
public class C3365q {
    /* renamed from: a */
    public C4478e mo14387a(C3355g gVar) {
        return gVar;
    }

    /* renamed from: b */
    public C4476c mo14388b(Class cls) {
        return new C3350c(cls);
    }

    /* renamed from: c */
    public C4477d mo14389c(Class cls, String str) {
        return new C3359k(cls, str);
    }

    /* renamed from: d */
    public C4479f mo14390d(C3360l lVar) {
        return lVar;
    }

    /* renamed from: e */
    public String mo14391e(C3354f fVar) {
        String obj = fVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    /* renamed from: f */
    public String mo14392f(C3358j jVar) {
        return mo14391e(jVar);
    }
}

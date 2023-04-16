package androidx.lifecycle;

import android.app.Application;
import java.util.Objects;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;
import p001a0.C0005a;
import p001a0.C0010d;

/* renamed from: androidx.lifecycle.e0 */
public class C1083e0 {

    /* renamed from: a */
    private final C1098h0 f2968a;

    /* renamed from: b */
    private final C1087b f2969b;

    /* renamed from: c */
    private final C0005a f2970c;

    /* renamed from: androidx.lifecycle.e0$a */
    public static class C1084a extends C1089c {

        /* renamed from: d */
        public static final C1085a f2971d = new C1085a((C3353e) null);

        /* renamed from: e */
        public static final C0005a.C0007b<Application> f2972e = C1085a.C1086a.f2973a;

        /* renamed from: androidx.lifecycle.e0$a$a */
        public static final class C1085a {

            /* renamed from: androidx.lifecycle.e0$a$a$a */
            private static final class C1086a implements C0005a.C0007b<Application> {

                /* renamed from: a */
                public static final C1086a f2973a = new C1086a();

                private C1086a() {
                }
            }

            private C1085a() {
            }

            public /* synthetic */ C1085a(C3353e eVar) {
                this();
            }
        }
    }

    /* renamed from: androidx.lifecycle.e0$b */
    public interface C1087b {

        /* renamed from: a */
        public static final C1088a f2974a = C1088a.f2975a;

        /* renamed from: androidx.lifecycle.e0$b$a */
        public static final class C1088a {

            /* renamed from: a */
            static final /* synthetic */ C1088a f2975a = new C1088a();

            private C1088a() {
            }
        }

        /* renamed from: a */
        <T extends C1081d0> T mo12a(Class<T> cls);

        /* renamed from: b */
        <T extends C1081d0> T mo13b(Class<T> cls, C0005a aVar);
    }

    /* renamed from: androidx.lifecycle.e0$c */
    public static class C1089c implements C1087b {

        /* renamed from: b */
        public static final C1090a f2976b = new C1090a((C3353e) null);

        /* renamed from: c */
        public static final C0005a.C0007b<String> f2977c = C1090a.C1091a.f2978a;

        /* renamed from: androidx.lifecycle.e0$c$a */
        public static final class C1090a {

            /* renamed from: androidx.lifecycle.e0$c$a$a */
            private static final class C1091a implements C0005a.C0007b<String> {

                /* renamed from: a */
                public static final C1091a f2978a = new C1091a();

                private C1091a() {
                }
            }

            private C1090a() {
            }

            public /* synthetic */ C1090a(C3353e eVar) {
                this();
            }
        }
    }

    /* renamed from: androidx.lifecycle.e0$d */
    public static class C1092d {
        /* renamed from: a */
        public void mo3824a(C1081d0 d0Var) {
            C3357i.m24508e(d0Var, "viewModel");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1083e0(C1098h0 h0Var, C1087b bVar) {
        this(h0Var, bVar, (C0005a) null, 4, (C3353e) null);
        C3357i.m24508e(h0Var, "store");
        C3357i.m24508e(bVar, "factory");
    }

    public C1083e0(C1098h0 h0Var, C1087b bVar, C0005a aVar) {
        C3357i.m24508e(h0Var, "store");
        C3357i.m24508e(bVar, "factory");
        C3357i.m24508e(aVar, "defaultCreationExtras");
        this.f2968a = h0Var;
        this.f2969b = bVar;
        this.f2970c = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1083e0(C1098h0 h0Var, C1087b bVar, C0005a aVar, int i, C3353e eVar) {
        this(h0Var, bVar, (i & 4) != 0 ? C0005a.C0006a.f2b : aVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1083e0(androidx.lifecycle.C1103i0 r3, androidx.lifecycle.C1083e0.C1087b r4) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.C3357i.m24508e(r3, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.C3357i.m24508e(r4, r0)
            androidx.lifecycle.h0 r0 = r3.mo497k()
            java.lang.String r1 = "owner.viewModelStore"
            kotlin.jvm.internal.C3357i.m24507d(r0, r1)
            a0.a r3 = androidx.lifecycle.C1096g0.m4559a(r3)
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1083e0.<init>(androidx.lifecycle.i0, androidx.lifecycle.e0$b):void");
    }

    /* renamed from: a */
    public <T extends C1081d0> T mo3822a(Class<T> cls) {
        C3357i.m24508e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo3823b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends C1081d0> T mo3823b(String str, Class<T> cls) {
        T t;
        C3357i.m24508e(str, "key");
        C3357i.m24508e(cls, "modelClass");
        T b = this.f2968a.mo3827b(str);
        if (cls.isInstance(b)) {
            C1087b bVar = this.f2969b;
            C1092d dVar = bVar instanceof C1092d ? (C1092d) bVar : null;
            if (dVar != null) {
                C3357i.m24507d(b, "viewModel");
                dVar.mo3824a(b);
            }
            Objects.requireNonNull(b, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return b;
        }
        C0010d dVar2 = new C0010d(this.f2970c);
        dVar2.mo16b(C1089c.f2977c, str);
        try {
            t = this.f2969b.mo13b(cls, dVar2);
        } catch (AbstractMethodError unused) {
            t = this.f2969b.mo12a(cls);
        }
        this.f2968a.mo3829d(str, t);
        return t;
    }
}

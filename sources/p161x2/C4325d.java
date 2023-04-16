package p161x2;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import p021c3.C1439a;
import p028d3.C2488a;
import p028d3.C2491c;
import p149v2.C4193a;
import p149v2.C4194b;
import p149v2.C4203e;
import p149v2.C4233w;
import p149v2.C4235x;
import p155w2.C4265a;
import p155w2.C4268d;
import p155w2.C4269e;

/* renamed from: x2.d */
public final class C4325d implements C4235x, Cloneable {

    /* renamed from: l */
    public static final C4325d f22646l = new C4325d();

    /* renamed from: f */
    private double f22647f = -1.0d;

    /* renamed from: g */
    private int f22648g = 136;

    /* renamed from: h */
    private boolean f22649h = true;

    /* renamed from: i */
    private boolean f22650i;

    /* renamed from: j */
    private List<C4193a> f22651j = Collections.emptyList();

    /* renamed from: k */
    private List<C4193a> f22652k = Collections.emptyList();

    /* renamed from: x2.d$a */
    class C4326a extends C4233w<T> {

        /* renamed from: a */
        private C4233w<T> f22653a;

        /* renamed from: b */
        final /* synthetic */ boolean f22654b;

        /* renamed from: c */
        final /* synthetic */ boolean f22655c;

        /* renamed from: d */
        final /* synthetic */ C4203e f22656d;

        /* renamed from: e */
        final /* synthetic */ C1439a f22657e;

        C4326a(boolean z, boolean z2, C4203e eVar, C1439a aVar) {
            this.f22654b = z;
            this.f22655c = z2;
            this.f22656d = eVar;
            this.f22657e = aVar;
        }

        /* renamed from: f */
        private C4233w<T> m26934f() {
            C4233w<T> wVar = this.f22653a;
            if (wVar != null) {
                return wVar;
            }
            C4233w<T> l = this.f22656d.mo15718l(C4325d.this, this.f22657e);
            this.f22653a = l;
            return l;
        }

        /* renamed from: c */
        public T mo4624c(C2488a aVar) {
            if (!this.f22654b) {
                return m26934f().mo4624c(aVar);
            }
            aVar.mo12358f0();
            return null;
        }

        /* renamed from: e */
        public void mo4625e(C2491c cVar, T t) {
            if (this.f22655c) {
                cVar.mo12369H();
            } else {
                m26934f().mo4625e(cVar, t);
            }
        }
    }

    /* renamed from: c */
    private boolean m26923c(Class<?> cls) {
        if (this.f22647f == -1.0d || m26930m((C4268d) cls.getAnnotation(C4268d.class), (C4269e) cls.getAnnotation(C4269e.class))) {
            return (!this.f22649h && m26926g(cls)) || m26925f(cls);
        }
        return true;
    }

    /* renamed from: d */
    private boolean m26924d(Class<?> cls, boolean z) {
        for (C4193a a : z ? this.f22651j : this.f22652k) {
            if (a.mo15710a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private boolean m26925f(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && !m26927h(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: g */
    private boolean m26926g(Class<?> cls) {
        return cls.isMemberClass() && !m26927h(cls);
    }

    /* renamed from: h */
    private boolean m26927h(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: j */
    private boolean m26928j(C4268d dVar) {
        return dVar == null || dVar.value() <= this.f22647f;
    }

    /* renamed from: l */
    private boolean m26929l(C4269e eVar) {
        return eVar == null || eVar.value() > this.f22647f;
    }

    /* renamed from: m */
    private boolean m26930m(C4268d dVar, C4269e eVar) {
        return m26928j(dVar) && m26929l(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4325d clone() {
        try {
            return (C4325d) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public boolean mo15904b(Class<?> cls, boolean z) {
        return m26923c(cls) || m26924d(cls, z);
    }

    public <T> C4233w<T> create(C4203e eVar, C1439a<T> aVar) {
        Class<? super T> c = aVar.mo4848c();
        boolean c2 = m26923c(c);
        boolean z = c2 || m26924d(c, true);
        boolean z2 = c2 || m26924d(c, false);
        if (z || z2) {
            return new C4326a(z2, z, eVar, aVar);
        }
        return null;
    }

    /* renamed from: e */
    public boolean mo15906e(Field field, boolean z) {
        C4265a aVar;
        if ((this.f22648g & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f22647f != -1.0d && !m26930m((C4268d) field.getAnnotation(C4268d.class), (C4269e) field.getAnnotation(C4269e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f22650i && ((aVar = (C4265a) field.getAnnotation(C4265a.class)) == null || (!z ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.f22649h && m26926g(field.getType())) || m26925f(field.getType())) {
            return true;
        }
        List<C4193a> list = z ? this.f22651j : this.f22652k;
        if (list.isEmpty()) {
            return false;
        }
        C4194b bVar = new C4194b(field);
        for (C4193a b : list) {
            if (b.mo15711b(bVar)) {
                return true;
            }
        }
        return false;
    }
}

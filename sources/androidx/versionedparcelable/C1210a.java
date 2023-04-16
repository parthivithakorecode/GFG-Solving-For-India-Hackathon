package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p082l0.C3443b;
import p102o.C3801a;

/* renamed from: androidx.versionedparcelable.a */
public abstract class C1210a {

    /* renamed from: a */
    protected final C3801a<String, Method> f3287a;

    /* renamed from: b */
    protected final C3801a<String, Method> f3288b;

    /* renamed from: c */
    protected final C3801a<String, Class> f3289c;

    public C1210a(C3801a<String, Method> aVar, C3801a<String, Method> aVar2, C3801a<String, Class> aVar3) {
        this.f3287a = aVar;
        this.f3288b = aVar2;
        this.f3289c = aVar3;
    }

    /* renamed from: N */
    private void m4865N(C3443b bVar) {
        try {
            mo4175I(m4866c(bVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(bVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: c */
    private Class m4866c(Class<? extends C3443b> cls) {
        Class cls2 = this.f3289c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f3289c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    private Method m4867d(String str) {
        Class<C1210a> cls = C1210a.class;
        Method method = this.f3287a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f3287a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    private Method m4868e(Class cls) {
        Method method = this.f3288b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c = m4866c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c.getDeclaredMethod("write", new Class[]{cls, C1210a.class});
        this.f3288b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract void mo4167A(byte[] bArr);

    /* renamed from: B */
    public void mo4168B(byte[] bArr, int i) {
        mo4199w(i);
        mo4167A(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo4169C(CharSequence charSequence);

    /* renamed from: D */
    public void mo4170D(CharSequence charSequence, int i) {
        mo4199w(i);
        mo4169C(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract void mo4171E(int i);

    /* renamed from: F */
    public void mo4172F(int i, int i2) {
        mo4199w(i2);
        mo4171E(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract void mo4173G(Parcelable parcelable);

    /* renamed from: H */
    public void mo4174H(Parcelable parcelable, int i) {
        mo4199w(i);
        mo4173G(parcelable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract void mo4175I(String str);

    /* renamed from: J */
    public void mo4176J(String str, int i) {
        mo4199w(i);
        mo4175I(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public <T extends C3443b> void mo4177K(T t, C1210a aVar) {
        try {
            m4868e(t.getClass()).invoke((Object) null, new Object[]{t, aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo4178L(C3443b bVar) {
        if (bVar == null) {
            mo4175I((String) null);
            return;
        }
        m4865N(bVar);
        C1210a b = mo4181b();
        mo4177K(bVar, b);
        b.mo4180a();
    }

    /* renamed from: M */
    public void mo4179M(C3443b bVar, int i) {
        mo4199w(i);
        mo4178L(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4180a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C1210a mo4181b();

    /* renamed from: f */
    public boolean mo4182f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo4183g();

    /* renamed from: h */
    public boolean mo4184h(boolean z, int i) {
        return !mo4189m(i) ? z : mo4183g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract byte[] mo4185i();

    /* renamed from: j */
    public byte[] mo4186j(byte[] bArr, int i) {
        return !mo4189m(i) ? bArr : mo4185i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract CharSequence mo4187k();

    /* renamed from: l */
    public CharSequence mo4188l(CharSequence charSequence, int i) {
        return !mo4189m(i) ? charSequence : mo4187k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract boolean mo4189m(int i);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public <T extends C3443b> T mo4190n(String str, C1210a aVar) {
        try {
            return (C3443b) m4867d(str).invoke((Object) null, new Object[]{aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract int mo4191o();

    /* renamed from: p */
    public int mo4192p(int i, int i2) {
        return !mo4189m(i2) ? i : mo4191o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract <T extends Parcelable> T mo4193q();

    /* renamed from: r */
    public <T extends Parcelable> T mo4194r(T t, int i) {
        return !mo4189m(i) ? t : mo4193q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract String mo4195s();

    /* renamed from: t */
    public String mo4196t(String str, int i) {
        return !mo4189m(i) ? str : mo4195s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public <T extends C3443b> T mo4197u() {
        String s = mo4195s();
        if (s == null) {
            return null;
        }
        return mo4190n(s, mo4181b());
    }

    /* renamed from: v */
    public <T extends C3443b> T mo4198v(T t, int i) {
        return !mo4189m(i) ? t : mo4197u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo4199w(int i);

    /* renamed from: x */
    public void mo4200x(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo4201y(boolean z);

    /* renamed from: z */
    public void mo4202z(boolean z, int i) {
        mo4199w(i);
        mo4201y(z);
    }
}

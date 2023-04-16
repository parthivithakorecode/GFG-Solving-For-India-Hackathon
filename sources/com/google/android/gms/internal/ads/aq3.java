package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq3;
import com.google.android.gms.internal.ads.xp3;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class aq3<MessageType extends aq3<MessageType, BuilderType>, BuilderType extends xp3<MessageType, BuilderType>> extends bo3<MessageType, BuilderType> {
    private static final Map<Object, aq3<?, ?>> zzb = new ConcurrentHashMap();
    protected xs3 zzc = xs3.m19644c();
    protected int zzd = -1;

    /* renamed from: A */
    protected static <T extends aq3<T, ?>> T m6205A(T t, uo3 uo3) {
        T t2;
        mp3 a = mp3.m13445a();
        try {
            cp3 w = uo3.mo6634w();
            t2 = (aq3) t.mo5181E(4, (Object) null, (Object) null);
            es3<?> b = tr3.m17481a().mo11101b(t2.getClass());
            b.mo7065e(t2, dp3.m7948T(w), a);
            b.mo7064d(t2);
            w.mo5357A(0);
            m6209m(t2);
            m6209m(t2);
            return t2;
        } catch (mq3 e) {
            e = e;
            if (e.mo9353l()) {
                e = new mq3((IOException) e);
            }
            e.mo9351h(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof mq3) {
                throw ((mq3) e2.getCause());
            }
            mq3 mq3 = new mq3(e2);
            mq3.mo9351h(t2);
            throw mq3;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof mq3) {
                throw ((mq3) e3.getCause());
            }
            throw e3;
        } catch (mq3 e4) {
            e4.mo9351h(t2);
            throw e4;
        } catch (mq3 e5) {
            throw e5;
        }
    }

    /* renamed from: B */
    protected static <T extends aq3<T, ?>> T m6206B(T t, byte[] bArr) {
        T n = m6210n(t, bArr, 0, bArr.length, mp3.m13445a());
        m6209m(n);
        return n;
    }

    /* renamed from: C */
    protected static <T extends aq3<T, ?>> T m6207C(T t, uo3 uo3, mp3 mp3) {
        T t2;
        try {
            cp3 w = uo3.mo6634w();
            t2 = (aq3) t.mo5181E(4, (Object) null, (Object) null);
            es3<?> b = tr3.m17481a().mo11101b(t2.getClass());
            b.mo7065e(t2, dp3.m7948T(w), mp3);
            b.mo7064d(t2);
            w.mo5357A(0);
            m6209m(t2);
            return t2;
        } catch (mq3 e) {
            e = e;
            if (e.mo9353l()) {
                e = new mq3((IOException) e);
            }
            e.mo9351h(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof mq3) {
                throw ((mq3) e2.getCause());
            }
            mq3 mq3 = new mq3(e2);
            mq3.mo9351h(t2);
            throw mq3;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof mq3) {
                throw ((mq3) e3.getCause());
            }
            throw e3;
        } catch (mq3 e4) {
            e4.mo9351h(t2);
            throw e4;
        } catch (mq3 e5) {
            throw e5;
        }
    }

    /* renamed from: D */
    protected static <T extends aq3<T, ?>> T m6208D(T t, byte[] bArr, mp3 mp3) {
        T n = m6210n(t, bArr, 0, bArr.length, mp3);
        m6209m(n);
        return n;
    }

    /* renamed from: m */
    private static <T extends aq3<T, ?>> T m6209m(T t) {
        if (t == null || t.mo5399w()) {
            return t;
        }
        mq3 mq3 = new mq3(new vs3(t).getMessage());
        mq3.mo9351h(t);
        throw mq3;
    }

    /* renamed from: n */
    static <T extends aq3<T, ?>> T m6210n(T t, byte[] bArr, int i, int i2, mp3 mp3) {
        T t2 = (aq3) t.mo5181E(4, (Object) null, (Object) null);
        try {
            es3<?> b = tr3.m17481a().mo11101b(t2.getClass());
            b.mo7068h(t2, bArr, 0, i2, new eo3(mp3));
            b.mo7064d(t2);
            if (t2.zza == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (mq3 e) {
            e = e;
            if (e.mo9353l()) {
                e = new mq3((IOException) e);
            }
            e.mo9351h(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof mq3) {
                throw ((mq3) e2.getCause());
            }
            mq3 mq3 = new mq3(e2);
            mq3.mo9351h(t2);
            throw mq3;
        } catch (IndexOutOfBoundsException unused) {
            mq3 j = mq3.m13459j();
            j.mo9351h(t2);
            throw j;
        }
    }

    /* renamed from: o */
    protected static fq3 m6211o() {
        return bq3.m7023j();
    }

    /* renamed from: p */
    protected static fq3 m6212p(fq3 fq3) {
        int size = fq3.size();
        return fq3.mo5917A(size == 0 ? 10 : size + size);
    }

    /* renamed from: q */
    protected static iq3 m6213q() {
        return zq3.m20806j();
    }

    /* renamed from: r */
    protected static <E> jq3<E> m6214r() {
        return ur3.m18027i();
    }

    /* renamed from: s */
    protected static <E> jq3<E> m6215s(jq3<E> jq3) {
        int size = jq3.size();
        return jq3.mo5923e(size == 0 ? 10 : size + size);
    }

    /* renamed from: t */
    static Object m6216t(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: u */
    protected static Object m6217u(kr3 kr3, String str, Object[] objArr) {
        return new vr3(kr3, str, objArr);
    }

    /* renamed from: v */
    protected static <T extends aq3> void m6218v(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    /* renamed from: z */
    static <T extends aq3> T m6219z(Class<T> cls) {
        Map<Object, aq3<?, ?>> map = zzb;
        T t = (aq3) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (aq3) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (aq3) ((aq3) gt3.m9990o(cls)).mo5181E(6, (Object) null, (Object) null);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract Object mo5181E(int i, Object obj, Object obj2);

    /* renamed from: a */
    public final /* synthetic */ kr3 mo5389a() {
        return (aq3) mo5181E(6, (Object) null, (Object) null);
    }

    /* renamed from: c */
    public final void mo5390c(hp3 hp3) {
        tr3.m17481a().mo11101b(getClass()).mo7067g(this, ip3.m11145l(hp3));
    }

    /* renamed from: d */
    public final /* synthetic */ jr3 mo5391d() {
        return (xp3) mo5181E(5, (Object) null, (Object) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return tr3.m17481a().mo11101b(getClass()).mo7069i(this, (aq3) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final int mo5393f() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int c = tr3.m17481a().mo11101b(getClass()).mo7063c(this);
        this.zzd = c;
        return c;
    }

    /* renamed from: g */
    public final /* synthetic */ jr3 mo5394g() {
        xp3 xp3 = (xp3) mo5181E(5, (Object) null, (Object) null);
        xp3.mo11892m(this);
        return xp3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo5395h() {
        return this.zzd;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int a = tr3.m17481a().mo11101b(getClass()).mo7061a(this);
        this.zza = a;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo5397l(int i) {
        this.zzd = i;
    }

    public final String toString() {
        return mr3.m13469a(this, super.toString());
    }

    /* renamed from: w */
    public final boolean mo5399w() {
        byte byteValue = ((Byte) mo5181E(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean j = tr3.m17481a().mo11101b(getClass()).mo7070j(this);
        mo5181E(2, true != j ? null : this, (Object) null);
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final <MessageType extends aq3<MessageType, BuilderType>, BuilderType extends xp3<MessageType, BuilderType>> BuilderType mo5400x() {
        return (xp3) mo5181E(5, (Object) null, (Object) null);
    }

    /* renamed from: y */
    public final BuilderType mo5401y() {
        BuilderType buildertype = (xp3) mo5181E(5, (Object) null, (Object) null);
        buildertype.mo11892m(this);
        return buildertype;
    }
}

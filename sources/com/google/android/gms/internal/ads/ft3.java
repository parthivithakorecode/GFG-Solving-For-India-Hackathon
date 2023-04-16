package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

abstract class ft3 {

    /* renamed from: a */
    final Unsafe f6931a;

    ft3(Unsafe unsafe) {
        this.f6931a = unsafe;
    }

    /* renamed from: a */
    public abstract byte mo6651a(long j);

    /* renamed from: b */
    public abstract double mo6652b(Object obj, long j);

    /* renamed from: c */
    public abstract float mo6653c(Object obj, long j);

    /* renamed from: d */
    public abstract void mo6654d(long j, byte[] bArr, long j2, long j3);

    /* renamed from: e */
    public abstract void mo6655e(Object obj, long j, boolean z);

    /* renamed from: f */
    public abstract void mo6656f(Object obj, long j, byte b);

    /* renamed from: g */
    public abstract void mo6657g(Object obj, long j, double d);

    /* renamed from: h */
    public abstract void mo6658h(Object obj, long j, float f);

    /* renamed from: i */
    public abstract boolean mo6659i(Object obj, long j);

    /* renamed from: j */
    public final int mo7394j(Class<?> cls) {
        return this.f6931a.arrayBaseOffset(cls);
    }

    /* renamed from: k */
    public final int mo7395k(Class<?> cls) {
        return this.f6931a.arrayIndexScale(cls);
    }

    /* renamed from: l */
    public final int mo7396l(Object obj, long j) {
        return this.f6931a.getInt(obj, j);
    }

    /* renamed from: m */
    public final long mo7397m(Object obj, long j) {
        return this.f6931a.getLong(obj, j);
    }

    /* renamed from: n */
    public final long mo7398n(Field field) {
        return this.f6931a.objectFieldOffset(field);
    }

    /* renamed from: o */
    public final Object mo7399o(Object obj, long j) {
        return this.f6931a.getObject(obj, j);
    }

    /* renamed from: p */
    public final void mo7400p(Object obj, long j, int i) {
        this.f6931a.putInt(obj, j, i);
    }

    /* renamed from: q */
    public final void mo7401q(Object obj, long j, long j2) {
        this.f6931a.putLong(obj, j, j2);
    }

    /* renamed from: r */
    public final void mo7402r(Object obj, long j, Object obj2) {
        this.f6931a.putObject(obj, j, obj2);
    }
}

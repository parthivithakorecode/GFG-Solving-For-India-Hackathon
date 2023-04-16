package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.od */
public final class C2032od {

    /* renamed from: a */
    private final C1735gc f11985a;

    /* renamed from: b */
    private final String f11986b;

    /* renamed from: c */
    private final String f11987c;

    /* renamed from: d */
    private volatile Method f11988d = null;

    /* renamed from: e */
    private final Class<?>[] f11989e;

    /* renamed from: f */
    private final CountDownLatch f11990f = new CountDownLatch(1);

    public C2032od(C1735gc gcVar, String str, String str2, Class<?>... clsArr) {
        this.f11985a = gcVar;
        this.f11986b = str;
        this.f11987c = str2;
        this.f11989e = clsArr;
        gcVar.mo7575k().submit(new C1995nd(this));
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m14412b(C2032od odVar) {
        try {
            Class loadClass = odVar.f11985a.mo7573i().loadClass(odVar.m14413c(odVar.f11985a.mo7583u(), odVar.f11986b));
            if (loadClass != null) {
                odVar.f11988d = loadClass.getMethod(odVar.m14413c(odVar.f11985a.mo7583u(), odVar.f11987c), odVar.f11989e);
                Method method = odVar.f11988d;
            }
        } catch (C1882kb | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            odVar.f11990f.countDown();
            throw th;
        }
        odVar.f11990f.countDown();
    }

    /* renamed from: c */
    private final String m14413c(byte[] bArr, String str) {
        return new String(this.f11985a.mo7570e().mo8913b(bArr, str), "UTF-8");
    }

    /* renamed from: a */
    public final Method mo9724a() {
        if (this.f11988d != null) {
            return this.f11988d;
        }
        try {
            if (!this.f11990f.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.f11988d;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}

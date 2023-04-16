package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

final class i23 implements x03 {

    /* renamed from: a */
    private final Object f8500a;

    /* renamed from: b */
    private final j23 f8501b;

    /* renamed from: c */
    private final v23 f8502c;

    /* renamed from: d */
    private final u03 f8503d;

    i23(Object obj, j23 j23, v23 v23, u03 u03) {
        this.f8500a = obj;
        this.f8501b = j23;
        this.f8502c = v23;
        this.f8503d = u03;
    }

    /* renamed from: i */
    private static String m10876i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        C1991n9 F = C2028o9.m14365F();
        F.mo9472t(5);
        F.mo9470r(uo3.m17968I(bArr));
        return Base64.encodeToString(((C2028o9) F.mo11894o()).mo5901b(), 11);
    }

    /* renamed from: j */
    private final synchronized byte[] m10877j(Map<String, String> map, Map<String, Object> map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.f8503d.mo11132c(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.f8500a.getClass().getDeclaredMethod("xss", new Class[]{Map.class, Map.class}).invoke(this.f8500a, new Object[]{null, map2});
    }

    /* renamed from: a */
    public final synchronized String mo8054a(Context context, String str) {
        Map<String, Object> a;
        a = this.f8502c.mo5224a();
        a.put("f", "q");
        a.put("ctx", context);
        a.put("aid", (Object) null);
        return m10876i(m10877j((Map<String, String>) null, a));
    }

    /* renamed from: b */
    public final synchronized void mo8055b(String str, MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", (Object) null);
            hashMap.put("evt", motionEvent);
            this.f8500a.getClass().getDeclaredMethod("he", new Class[]{Map.class}).invoke(this.f8500a, new Object[]{hashMap});
            this.f8503d.mo11133d(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new t23(2005, (Throwable) e);
        }
    }

    /* renamed from: c */
    public final synchronized String mo8056c(Context context, String str, String str2, View view, Activity activity) {
        Map<String, Object> zza;
        zza = this.f8502c.zza();
        zza.put("f", "c");
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", (Object) null);
        zza.put("view", view);
        zza.put("act", activity);
        return m10876i(m10877j((Map<String, String>) null, zza));
    }

    /* renamed from: d */
    public final synchronized String mo8057d(Context context, String str, View view, Activity activity) {
        Map<String, Object> c;
        c = this.f8502c.mo5226c();
        c.put("f", "v");
        c.put("ctx", context);
        c.put("aid", (Object) null);
        c.put("view", view);
        c.put("act", (Object) null);
        return m10876i(m10877j((Map<String, String>) null, c));
    }

    /* renamed from: e */
    public final synchronized int mo8058e() {
        try {
        } catch (Exception e) {
            throw new t23(2006, (Throwable) e);
        }
        return ((Integer) this.f8500a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f8500a, new Object[0])).intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final j23 mo8059f() {
        return this.f8501b;
    }

    /* renamed from: g */
    public final synchronized void mo8060g() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f8500a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f8500a, new Object[0]);
            this.f8503d.mo11133d(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new t23(2003, (Throwable) e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final synchronized boolean mo8061h() {
        try {
        } catch (Exception e) {
            throw new t23(2001, (Throwable) e);
        }
        return ((Boolean) this.f8500a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f8500a, new Object[0])).booleanValue();
    }
}

package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: com.google.android.gms.internal.ads.bb */
public final class C1548bb {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final ConditionVariable f4817c = new ConditionVariable();

    /* renamed from: d */
    protected static volatile y23 f4818d = null;

    /* renamed from: e */
    private static volatile Random f4819e = null;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1735gc f4820a;

    /* renamed from: b */
    protected volatile Boolean f4821b;

    public C1548bb(C1735gc gcVar) {
        this.f4820a = gcVar;
        gcVar.mo7575k().execute(new C1511ab(this));
    }

    /* renamed from: d */
    public static final int m6732d() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : m6733e().nextInt();
        } catch (RuntimeException unused) {
            return m6733e().nextInt();
        }
    }

    /* renamed from: e */
    private static Random m6733e() {
        if (f4819e == null) {
            synchronized (C1548bb.class) {
                if (f4819e == null) {
                    f4819e = new Random();
                }
            }
        }
        return f4819e;
    }

    /* renamed from: c */
    public final void mo5760c(int i, int i2, long j, String str, Exception exc) {
        try {
            f4817c.block();
            if (this.f4821b.booleanValue() && f4818d != null) {
                C2285v7 F = C2434z7.m20498F();
                F.mo11415r(this.f4820a.f7353a.getPackageName());
                F.mo11419v(j);
                if (str != null) {
                    F.mo11416s(str);
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    exc.printStackTrace(new PrintWriter(stringWriter));
                    F.mo11420w(stringWriter.toString());
                    F.mo11418u(exc.getClass().getName());
                }
                x23 a = f4818d.mo11957a(((C2434z7) F.mo11894o()).mo5901b());
                a.mo11764a(i);
                if (i2 != -1) {
                    a.mo11765b(i2);
                }
                a.mo11766c();
            }
        } catch (Exception unused) {
        }
    }
}

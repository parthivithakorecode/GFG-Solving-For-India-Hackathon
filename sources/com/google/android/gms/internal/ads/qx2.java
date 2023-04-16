package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p054h1.C2694t;
import p069j1.C3163g2;
import p160x1.C4284f;

public final class qx2 implements Runnable {

    /* renamed from: n */
    static Boolean f13372n;

    /* renamed from: f */
    private final Context f13373f;

    /* renamed from: g */
    private final po0 f13374g;

    /* renamed from: h */
    private final vx2 f13375h = yx2.m20338G();

    /* renamed from: i */
    private String f13376i;

    /* renamed from: j */
    private int f13377j;

    /* renamed from: k */
    private boolean f13378k = false;

    /* renamed from: l */
    private final r22 f13379l;

    /* renamed from: m */
    private final ij0 f13380m;

    public qx2(Context context, po0 po0, r22 r22, ij0 ij0, byte[] bArr) {
        this.f13373f = context;
        this.f13374g = po0;
        this.f13379l = r22;
        this.f13380m = ij0;
    }

    /* renamed from: b */
    public static synchronized boolean m15945b() {
        boolean booleanValue;
        Boolean valueOf;
        synchronized (qx2.class) {
            if (f13372n == null) {
                if (!v20.f15863b.mo9928e().booleanValue()) {
                    valueOf = Boolean.FALSE;
                } else {
                    valueOf = Boolean.valueOf(Math.random() < v20.f15862a.mo9928e().doubleValue());
                }
                f13372n = valueOf;
            }
            booleanValue = f13372n.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: c */
    private final synchronized void m15946c() {
        if (!this.f13378k) {
            this.f13378k = true;
            if (m15945b()) {
                C2694t.m21608q();
                this.f13376i = C3163g2.m23924d0(this.f13373f);
                this.f13377j = C4284f.m26845f().mo15874a(this.f13373f);
                long intValue = (long) ((Integer) C2199sw.m17001c().mo8579b(m10.f10634v6)).intValue();
                wo0.f16889d.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: d */
    private final synchronized void m15947d() {
        try {
            new q22(this.f13373f, this.f13374g.f12729f, this.f13380m, Binder.getCallingUid(), (byte[]) null).mo6109c(new o22((String) C2199sw.m17001c().mo8579b(m10.f10626u6), 60000, new HashMap(), ((yx2) this.f13375h.mo11894o()).mo5901b(), "application/x-protobuf"));
        } catch (Exception e) {
            if (!(e instanceof fz1) || ((fz1) e).mo7445a() != 3) {
                C2694t.m21607p().mo11033r(e, "CuiMonitor.sendCuiPing");
            } else {
                this.f13375h.mo11546t();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo10426a(px2 px2) {
        if (!this.f13378k) {
            m15946c();
        }
        if (m15945b()) {
            if (px2 != null) {
                vx2 vx2 = this.f13375h;
                wx2 F = xx2.m19728F();
                sx2 F2 = tx2.m17552F();
                F2.mo10894F(7);
                F2.mo10891C(px2.mo10192h());
                F2.mo10901v(px2.mo10186b());
                F2.mo10896H(3);
                F2.mo10890B(this.f13374g.f12729f);
                F2.mo10897r(this.f13376i);
                F2.mo10905z(Build.VERSION.RELEASE);
                F2.mo10892D(Build.VERSION.SDK_INT);
                F2.mo10895G(px2.mo10194j());
                F2.mo10904y(px2.mo10185a());
                F2.mo10899t((long) this.f13377j);
                F2.mo10893E(px2.mo10193i());
                F2.mo10898s(px2.mo10187c());
                F2.mo10900u(px2.mo10188d());
                F2.mo10902w(px2.mo10189e());
                F2.mo10903x(px2.mo10190f());
                F2.mo10889A(px2.mo10191g());
                F.mo11751r(F2);
                vx2.mo11545s(F);
            }
        }
    }

    public final synchronized void run() {
        if (m15945b()) {
            if (this.f13375h.mo11544r() != 0) {
                m15947d();
            }
        }
    }
}

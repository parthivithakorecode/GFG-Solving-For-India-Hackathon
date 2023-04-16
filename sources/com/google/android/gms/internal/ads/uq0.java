package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import p054h1.C2694t;
import p069j1.C3169i0;
import p069j1.C3173j0;
import p069j1.C3181l0;
import p069j1.C3202r1;

public final class uq0 {

    /* renamed from: a */
    private final Context f15694a;

    /* renamed from: b */
    private final String f15695b;

    /* renamed from: c */
    private final po0 f15696c;

    /* renamed from: d */
    private final y10 f15697d;

    /* renamed from: e */
    private final b20 f15698e;

    /* renamed from: f */
    private final C3181l0 f15699f;

    /* renamed from: g */
    private final long[] f15700g;

    /* renamed from: h */
    private final String[] f15701h;

    /* renamed from: i */
    private boolean f15702i = false;

    /* renamed from: j */
    private boolean f15703j = false;

    /* renamed from: k */
    private boolean f15704k = false;

    /* renamed from: l */
    private boolean f15705l = false;

    /* renamed from: m */
    private boolean f15706m;

    /* renamed from: n */
    private zp0 f15707n;

    /* renamed from: o */
    private boolean f15708o;

    /* renamed from: p */
    private boolean f15709p;

    /* renamed from: q */
    private long f15710q = -1;

    public uq0(Context context, po0 po0, String str, b20 b20, y10 y10) {
        C3173j0 j0Var = new C3173j0();
        C3173j0 j0Var2 = j0Var;
        j0Var2.mo14043a("min_1", Double.MIN_VALUE, 1.0d);
        j0Var2.mo14043a("1_5", 1.0d, 5.0d);
        j0Var2.mo14043a("5_10", 5.0d, 10.0d);
        j0Var2.mo14043a("10_20", 10.0d, 20.0d);
        j0Var2.mo14043a("20_30", 20.0d, 30.0d);
        j0Var2.mo14043a("30_max", 30.0d, Double.MAX_VALUE);
        this.f15699f = j0Var.mo14044b();
        this.f15694a = context;
        this.f15696c = po0;
        this.f15695b = str;
        this.f15698e = b20;
        this.f15697d = y10;
        String str2 = (String) C2199sw.m17001c().mo8579b(m10.f10627v);
        if (str2 == null) {
            this.f15701h = new String[0];
            this.f15700g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.f15701h = new String[length];
        this.f15700g = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f15700g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                io0.m11132h("Unable to parse frame hash target time number.", e);
                this.f15700g[i] = -1;
            }
        }
    }

    /* renamed from: a */
    public final void mo11284a(zp0 zp0) {
        t10.m17056a(this.f15698e, this.f15697d, "vpc2");
        this.f15702i = true;
        this.f15698e.mo5631d("vpn", zp0.mo8768p());
        this.f15707n = zp0;
    }

    /* renamed from: b */
    public final void mo11285b() {
        if (this.f15702i && !this.f15703j) {
            t10.m17056a(this.f15698e, this.f15697d, "vfr2");
            this.f15703j = true;
        }
    }

    /* renamed from: c */
    public final void mo11286c() {
        this.f15706m = true;
        if (this.f15703j && !this.f15704k) {
            t10.m17056a(this.f15698e, this.f15697d, "vfp2");
            this.f15704k = true;
        }
    }

    /* renamed from: d */
    public final void mo11287d() {
        if (p30.f12480a.mo9928e().booleanValue() && !this.f15708o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f15695b);
            bundle.putString("player", this.f15707n.mo8768p());
            for (C3169i0 next : this.f15699f.mo14049a()) {
                String valueOf = String.valueOf(next.f20480a);
                bundle.putString(valueOf.length() != 0 ? "fps_c_".concat(valueOf) : new String("fps_c_"), Integer.toString(next.f20484e));
                String valueOf2 = String.valueOf(next.f20480a);
                bundle.putString(valueOf2.length() != 0 ? "fps_p_".concat(valueOf2) : new String("fps_p_"), Double.toString(next.f20483d));
            }
            int i = 0;
            while (true) {
                long[] jArr = this.f15700g;
                if (i < jArr.length) {
                    String str = this.f15701h[i];
                    if (str != null) {
                        bundle.putString("fh_".concat(Long.valueOf(jArr[i]).toString()), str);
                    }
                    i++;
                } else {
                    C2694t.m21608q().mo14028V(this.f15694a, this.f15696c.f12729f, "gmob-apps", bundle, true);
                    this.f15708o = true;
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo11288e() {
        this.f15706m = false;
    }

    /* renamed from: f */
    public final void mo11289f(zp0 zp0) {
        if (this.f15704k && !this.f15705l) {
            if (C3202r1.m24017m() && !this.f15705l) {
                C3202r1.m24015k("VideoMetricsMixin first frame");
            }
            t10.m17056a(this.f15698e, this.f15697d, "vff2");
            this.f15705l = true;
        }
        long c = C2694t.m21592a().mo12464c();
        if (this.f15706m && this.f15709p && this.f15710q != -1) {
            this.f15699f.mo14050b(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (c - this.f15710q)));
        }
        this.f15709p = this.f15706m;
        this.f15710q = c;
        long longValue = ((Long) C2199sw.m17001c().mo8579b(m10.f10635w)).longValue();
        long g = (long) zp0.mo8753g();
        int i = 0;
        while (true) {
            String[] strArr = this.f15701h;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && longValue > Math.abs(g - this.f15700g[i])) {
                String[] strArr2 = this.f15701h;
                int i2 = 8;
                Bitmap bitmap = zp0.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j);
                        i4++;
                        j--;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = String.format("%016X", new Object[]{Long.valueOf(j2)});
                return;
            }
            zp0 zp02 = zp0;
            i++;
        }
    }
}

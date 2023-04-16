package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p054h1.C2694t;
import p069j1.C3202r1;

public final class e90 implements C2209t5 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile q80 f6123a;

    /* renamed from: b */
    private final Context f6124b;

    public e90(Context context) {
        this.f6124b = context;
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m8383c(e90 e90) {
        if (e90.f6123a != null) {
            e90.f6123a.mo184o();
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: a */
    public final C2320w5 mo6876a(C1506a6<?> a6Var) {
        Parcelable.Creator<s80> creator = s80.CREATOR;
        Map<String, String> m = a6Var.mo5120m();
        int size = m.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry next : m.entrySet()) {
            strArr[i2] = (String) next.getKey();
            strArr2[i2] = (String) next.getValue();
            i2++;
        }
        s80 s80 = new s80(a6Var.mo5119l(), strArr, strArr2);
        long b = C2694t.m21592a().mo12463b();
        try {
            bp0 bp0 = new bp0();
            this.f6123a = new q80(this.f6124b, C2694t.m21612u().mo13974b(), new c90(this, bp0), new d90(this, bp0));
            this.f6123a.mo186q();
            a90 a90 = new a90(this, s80);
            dc3 dc3 = wo0.f16886a;
            cc3 o = rb3.m16137o(rb3.m16136n(bp0, a90, dc3), (long) ((Integer) C2199sw.m17001c().mo8579b(m10.f10436Z2)).intValue(), TimeUnit.MILLISECONDS, wo0.f16889d);
            o.mo5905b(new b90(this), dc3);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) o.get();
            long b2 = C2694t.m21592a().mo12463b();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(b2 - b);
            sb.append("ms");
            C3202r1.m24015k(sb.toString());
            u80 u80 = (u80) new ti0(parcelFileDescriptor).mo10990c(u80.CREATOR);
            if (u80 == null) {
                return null;
            }
            if (u80.f15447f) {
                throw new C1877k6(u80.f15448g);
            } else if (u80.f15451j.length != u80.f15452k.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = u80.f15451j;
                    if (i >= strArr3.length) {
                        return new C2320w5(u80.f15449h, u80.f15450i, (Map<String, String>) hashMap, u80.f15453l, u80.f15454m);
                    }
                    hashMap.put(strArr3[i], u80.f15452k[i]);
                    i++;
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            long b3 = C2694t.m21592a().mo12463b();
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(b3 - b);
            sb2.append("ms");
            C3202r1.m24015k(sb2.toString());
            return null;
        } catch (Throwable th) {
            long b4 = C2694t.m21592a().mo12463b();
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(b4 - b);
            sb3.append("ms");
            C3202r1.m24015k(sb3.toString());
            throw th;
        }
    }
}

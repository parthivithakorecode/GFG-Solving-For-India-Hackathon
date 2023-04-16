package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;
import p054h1.C2694t;
import p069j1.C3208t1;

public final class y32 {

    /* renamed from: h */
    private static final SparseArray<C2048ot> f17580h;

    /* renamed from: a */
    private final Context f17581a;

    /* renamed from: b */
    private final aa1 f17582b;

    /* renamed from: c */
    private final TelephonyManager f17583c;

    /* renamed from: d */
    private final r32 f17584d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final n32 f17585e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C3208t1 f17586f;

    /* renamed from: g */
    private int f17587g;

    static {
        SparseArray<C2048ot> sparseArray = new SparseArray<>();
        f17580h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), C2048ot.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        C2048ot otVar = C2048ot.CONNECTING;
        sparseArray.put(ordinal, otVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), otVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), otVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), C2048ot.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        C2048ot otVar2 = C2048ot.DISCONNECTED;
        sparseArray.put(ordinal2, otVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), otVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), otVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), otVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), otVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), C2048ot.SUSPENDED);
        if (Build.VERSION.SDK_INT >= 17) {
            sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), otVar);
        }
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), otVar);
    }

    y32(Context context, aa1 aa1, r32 r32, n32 n32, C3208t1 t1Var) {
        this.f17581a = context;
        this.f17582b = aa1;
        this.f17584d = r32;
        this.f17585e = n32;
        this.f17583c = (TelephonyManager) context.getSystemService("phone");
        this.f17586f = t1Var;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ C1715ft m19829a(y32 y32, Bundle bundle) {
        C2381xs F = C1715ft.m9280F();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        int i3 = 2;
        if (i == -1) {
            y32.f17587g = 2;
        } else {
            y32.f17587g = 1;
            if (i == 0) {
                F.mo11910s(2);
            } else if (i != 1) {
                F.mo11910s(1);
            } else {
                F.mo11910s(3);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i3 = 3;
                    break;
                case 13:
                    i3 = 5;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            F.mo11909r(i3);
        }
        return (C1715ft) F.mo11894o();
    }

    /* renamed from: f */
    static /* bridge */ /* synthetic */ byte[] m19833f(y32 y32, boolean z, ArrayList arrayList, C1715ft ftVar, C2048ot otVar) {
        C1863jt M = C1900kt.m12386M();
        M.mo8531r(arrayList);
        boolean z2 = true;
        M.mo8538y(m19834g(C2694t.m21609r().mo13996a(y32.f17581a.getContentResolver()) != 0));
        M.mo8539z(C2694t.m21609r().mo13972p(y32.f17581a, y32.f17583c));
        M.mo8536w(y32.f17584d.mo10472d());
        M.mo8535v(y32.f17584d.mo10470b());
        M.mo8532s(y32.f17584d.mo10469a());
        M.mo8533t(otVar);
        M.mo8534u(ftVar);
        M.mo8528A(y32.f17587g);
        M.mo8529B(m19834g(z));
        M.mo8537x(C2694t.m21592a().mo12462a());
        if (C2694t.m21609r().mo13997b(y32.f17581a.getContentResolver()) == 0) {
            z2 = false;
        }
        M.mo8530C(m19834g(z2));
        return ((C1900kt) M.mo11894o()).mo5901b();
    }

    /* renamed from: g */
    private static final int m19834g(boolean z) {
        return z ? 2 : 1;
    }

    /* renamed from: e */
    public final void mo11960e(boolean z) {
        rb3.m16140r(this.f17582b.mo5196b(), new x32(this, z), wo0.f16891f);
    }
}

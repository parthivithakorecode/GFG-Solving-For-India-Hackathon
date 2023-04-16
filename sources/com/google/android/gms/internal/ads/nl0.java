package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import p069j1.C3208t1;

public final class nl0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final Context f11520a;

    /* renamed from: b */
    private final SharedPreferences f11521b;

    /* renamed from: c */
    private final C3208t1 f11522c;

    /* renamed from: d */
    private final pm0 f11523d;

    /* renamed from: e */
    private String f11524e = "-1";

    /* renamed from: f */
    private int f11525f = -1;

    nl0(Context context, C3208t1 t1Var, pm0 pm0) {
        this.f11521b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f11522c = t1Var;
        this.f11520a = context;
        this.f11523d = pm0;
    }

    /* renamed from: b */
    private final void m13972b(String str, int i) {
        Context context;
        boolean z = false;
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10586q0)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z = true;
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10568o0)).booleanValue()) {
            this.f11522c.mo14071C(z);
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10270E4)).booleanValue() && z && (context = this.f11520a) != null) {
                context.deleteDatabase("OfflineUpload.db");
            }
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10523j0)).booleanValue()) {
            this.f11523d.mo10108y();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9547a() {
        this.f11521b.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.f11521b, "IABTCF_PurposeConsents");
        onSharedPreferenceChanged(this.f11521b, "gad_has_consent_for_cookies");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "IABTCF_PurposeConsents"
            java.lang.String r1 = "-1"
            java.lang.String r2 = r9.getString(r0, r1)
            java.lang.String r3 = "gad_has_consent_for_cookies"
            r4 = -1
            int r9 = r9.getInt(r3, r4)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r5 = r10.hashCode()
            r6 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r7 = 1
            if (r5 == r6) goto L_0x002b
            r0 = -527267622(0xffffffffe09288da, float:-8.447143E19)
            if (r5 == r0) goto L_0x0023
            goto L_0x0033
        L_0x0023:
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L_0x0033
            r10 = r7
            goto L_0x0034
        L_0x002b:
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0033
            r10 = 0
            goto L_0x0034
        L_0x0033:
            r10 = r4
        L_0x0034:
            if (r10 == 0) goto L_0x0057
            if (r10 == r7) goto L_0x0039
            return
        L_0x0039:
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r10 = com.google.android.gms.internal.ads.m10.f10586q0
            com.google.android.gms.internal.ads.k10 r0 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r10 = r0.mo8579b(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0068
            if (r9 == r4) goto L_0x0068
            int r10 = r8.f11525f
            if (r10 == r9) goto L_0x0068
            r8.f11525f = r9
        L_0x0053:
            r8.m13972b(r2, r9)
            return
        L_0x0057:
            boolean r10 = r2.equals(r1)
            if (r10 != 0) goto L_0x0068
            java.lang.String r10 = r8.f11524e
            boolean r10 = r10.equals(r2)
            if (r10 != 0) goto L_0x0068
            r8.f11524e = r2
            goto L_0x0053
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nl0.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }
}

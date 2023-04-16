package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p034e2.C2547d;

public final class zx2 {

    /* renamed from: a */
    private final r82 f18398a;

    /* renamed from: b */
    private final String f18399b;

    /* renamed from: c */
    private final String f18400c;

    /* renamed from: d */
    private final String f18401d;

    /* renamed from: e */
    private final Context f18402e;

    /* renamed from: f */
    private final fs2 f18403f;

    /* renamed from: g */
    private final C2547d f18404g;

    /* renamed from: h */
    private final C1734gb f18405h;

    public zx2(r82 r82, po0 po0, String str, String str2, Context context, fs2 fs2, C2547d dVar, C1734gb gbVar) {
        this.f18398a = r82;
        this.f18399b = po0.f12729f;
        this.f18400c = str;
        this.f18401d = str2;
        this.f18402e = context;
        this.f18403f = fs2;
        this.f18404g = dVar;
        this.f18405h = gbVar;
    }

    /* renamed from: d */
    public static final List<String> m20877d(int i, int i2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String f : list) {
            StringBuilder sb = new StringBuilder(23);
            sb.append("2.");
            sb.append(i2);
            arrayList.add(m20879f(f, "@gw_mpe@", sb.toString()));
        }
        return arrayList;
    }

    /* renamed from: e */
    private static String m20878e(String str) {
        return (TextUtils.isEmpty(str) || !ho0.m10681l()) ? str : "fakeForAdDebugLog";
    }

    /* renamed from: f */
    private static String m20879f(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* renamed from: a */
    public final List<String> mo12280a(ds2 ds2, rr2 rr2, List<String> list) {
        return mo12281b(ds2, rr2, false, "", "", list);
    }

    /* renamed from: b */
    public final List<String> mo12281b(ds2 ds2, rr2 rr2, boolean z, String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str3 = true != z ? "0" : "1";
        for (String f : list) {
            String f2 = m20879f(m20879f(m20879f(f, "@gw_adlocid@", ds2.f5903a.f4336a.f9641f), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.f18399b);
            if (rr2 != null) {
                f2 = rm0.m16269c(m20879f(m20879f(m20879f(f2, "@gw_qdata@", rr2.f13920z), "@gw_adnetid@", rr2.f13919y), "@gw_allocid@", rr2.f13918x), this.f18402e, rr2.f13877T);
            }
            String f3 = m20879f(m20879f(m20879f(f2, "@gw_adnetstatus@", this.f18398a.mo10493f()), "@gw_seqnum@", this.f18400c), "@gw_sessid@", this.f18401d);
            boolean z2 = false;
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10507h2)).booleanValue() && !TextUtils.isEmpty(str)) {
                z2 = true;
            }
            boolean z3 = !TextUtils.isEmpty(str2);
            if (!z2) {
                if (z3) {
                    z3 = true;
                } else {
                    arrayList.add(f3);
                }
            }
            if (this.f18405h.mo7563f(Uri.parse(f3))) {
                Uri.Builder buildUpon = Uri.parse(f3).buildUpon();
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                f3 = buildUpon.build().toString();
            }
            arrayList.add(f3);
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List<String> mo12282c(rr2 rr2, List<String> list, mj0 mj0) {
        ArrayList arrayList = new ArrayList();
        long a = this.f18404g.mo12462a();
        try {
            String c = mj0.mo8471c();
            String num = Integer.toString(mj0.mo8470a());
            fs2 fs2 = this.f18403f;
            String str = "";
            String e = fs2 == null ? str : m20878e(fs2.f6905a);
            fs2 fs22 = this.f18403f;
            if (fs22 != null) {
                str = m20878e(fs22.f6906b);
            }
            for (String f : list) {
                arrayList.add(rm0.m16269c(m20879f(m20879f(m20879f(m20879f(m20879f(m20879f(f, "@gw_rwd_userid@", Uri.encode(e)), "@gw_rwd_custom_data@", Uri.encode(str)), "@gw_tmstmp@", Long.toString(a)), "@gw_rwd_itm@", Uri.encode(c)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.f18399b), this.f18402e, rr2.f13877T));
            }
            return arrayList;
        } catch (RemoteException e2) {
            io0.m11129e("Unable to determine award type and amount.", e2);
            return arrayList;
        }
    }
}

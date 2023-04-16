package p111p1;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C1902kv;
import com.google.android.gms.internal.ads.ds2;
import com.google.android.gms.internal.ads.ks2;

/* renamed from: p1.o */
public final class C3911o {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m26064a(com.google.android.gms.internal.ads.ds2 r2) {
        /*
            boolean r0 = m26068e(r2)
            java.lang.String r1 = "unspecified"
            if (r0 != 0) goto L_0x0009
            return r1
        L_0x0009:
            com.google.android.gms.internal.ads.as2 r2 = r2.f5903a
            com.google.android.gms.internal.ads.ks2 r2 = r2.f4336a
            java.lang.String r2 = m26066c(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0019
            goto L_0x0082
        L_0x0019:
            int r0 = r2.hashCode()
            switch(r0) {
                case 1743582862: goto L_0x005d;
                case 1743582863: goto L_0x0053;
                case 1743582864: goto L_0x0049;
                case 1743582865: goto L_0x003f;
                case 1743582866: goto L_0x0035;
                case 1743582867: goto L_0x002b;
                case 1743582868: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0067
        L_0x0021:
            java.lang.String r0 = "requester_type_6"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0067
            r0 = 6
            goto L_0x0068
        L_0x002b:
            java.lang.String r0 = "requester_type_5"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0067
            r0 = 5
            goto L_0x0068
        L_0x0035:
            java.lang.String r0 = "requester_type_4"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0067
            r0 = 4
            goto L_0x0068
        L_0x003f:
            java.lang.String r0 = "requester_type_3"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0067
            r0 = 3
            goto L_0x0068
        L_0x0049:
            java.lang.String r0 = "requester_type_2"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0067
            r0 = 2
            goto L_0x0068
        L_0x0053:
            java.lang.String r0 = "requester_type_1"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0067
            r0 = 1
            goto L_0x0068
        L_0x005d:
            java.lang.String r0 = "requester_type_0"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0067
            r0 = 0
            goto L_0x0068
        L_0x0067:
            r0 = -1
        L_0x0068:
            switch(r0) {
                case 0: goto L_0x007f;
                case 1: goto L_0x007c;
                case 2: goto L_0x0079;
                case 3: goto L_0x0076;
                case 4: goto L_0x0073;
                case 5: goto L_0x0070;
                case 6: goto L_0x006d;
                default: goto L_0x006b;
            }
        L_0x006b:
            r1 = r2
            goto L_0x0082
        L_0x006d:
            java.lang.String r2 = "6"
            return r2
        L_0x0070:
            java.lang.String r2 = "5"
            return r2
        L_0x0073:
            java.lang.String r2 = "4"
            return r2
        L_0x0076:
            java.lang.String r2 = "3"
            return r2
        L_0x0079:
            java.lang.String r2 = "2"
            return r2
        L_0x007c:
            java.lang.String r2 = "1"
            return r2
        L_0x007f:
            java.lang.String r2 = "0"
            return r2
        L_0x0082:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p111p1.C3911o.m26064a(com.google.android.gms.internal.ads.ds2):java.lang.String");
    }

    /* renamed from: b */
    public static String m26065b(ds2 ds2) {
        return !m26068e(ds2) ? "" : ds2.f5903a.f4336a.f9639d.f9682u;
    }

    /* renamed from: c */
    public static String m26066c(ks2 ks2) {
        Bundle bundle = ks2.f9639d.f9669h;
        return bundle == null ? "unspecified" : bundle.getString("query_info_type");
    }

    /* renamed from: d */
    public static boolean m26067d(ds2 ds2) {
        if (!m26068e(ds2)) {
            return false;
        }
        C1902kv kvVar = ds2.f5903a.f4336a.f9639d;
        return (kvVar.f9685x == null && kvVar.f9666C == null) ? false : true;
    }

    /* renamed from: e */
    private static boolean m26068e(ds2 ds2) {
        return ds2 != null;
    }
}

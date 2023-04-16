package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import p048g2.C2635a;
import p048g2.C2637b;

public final class y42 implements tg0 {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.qy2 m19859a(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L_0x0020
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = r3
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = r2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0043
            if (r4 == r3) goto L_0x0040
            if (r4 == r2) goto L_0x003d
            r4 = 0
            return r4
        L_0x003d:
            com.google.android.gms.internal.ads.qy2 r4 = com.google.android.gms.internal.ads.qy2.VIDEO
            return r4
        L_0x0040:
            com.google.android.gms.internal.ads.qy2 r4 = com.google.android.gms.internal.ads.qy2.NATIVE_DISPLAY
            return r4
        L_0x0043:
            com.google.android.gms.internal.ads.qy2 r4 = com.google.android.gms.internal.ads.qy2.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y42.m19859a(java.lang.String):com.google.android.gms.internal.ads.qy2");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.sy2 m19860b(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L_0x0020
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = r2
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = r3
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0044
            if (r4 == r3) goto L_0x0041
            if (r4 == r2) goto L_0x003e
            com.google.android.gms.internal.ads.sy2 r4 = com.google.android.gms.internal.ads.sy2.UNSPECIFIED
            return r4
        L_0x003e:
            com.google.android.gms.internal.ads.sy2 r4 = com.google.android.gms.internal.ads.sy2.ONE_PIXEL
            return r4
        L_0x0041:
            com.google.android.gms.internal.ads.sy2 r4 = com.google.android.gms.internal.ads.sy2.DEFINED_BY_JAVASCRIPT
            return r4
        L_0x0044:
            com.google.android.gms.internal.ads.sy2 r4 = com.google.android.gms.internal.ads.sy2.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y42.m19860b(java.lang.String):com.google.android.gms.internal.ads.sy2");
    }

    /* renamed from: c */
    private static ty2 m19861c(String str) {
        return "native".equals(str) ? ty2.NATIVE : "javascript".equals(str) ? ty2.JAVASCRIPT : ty2.NONE;
    }

    /* renamed from: P */
    public final void mo10785P(C2635a aVar) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10245B3)).booleanValue() && iy2.m11366b()) {
            Object C0 = C2637b.m21357C0(aVar);
            if (C0 instanceof ly2) {
                ((ly2) C0).mo9096e();
            }
        }
    }

    /* renamed from: Q */
    public final String mo10786Q(Context context) {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10245B3)).booleanValue()) {
            return null;
        }
        return "a.1.3.3-google_20200416";
    }

    /* renamed from: R */
    public final void mo10787R(C2635a aVar, View view) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10245B3)).booleanValue() && iy2.m11366b()) {
            Object C0 = C2637b.m21357C0(aVar);
            if (C0 instanceof ly2) {
                ((ly2) C0).mo9093b(view, ry2.NOT_VISIBLE, "Ad overlay");
            }
        }
    }

    /* renamed from: S */
    public final C2635a mo10788S(String str, WebView webView, String str2, String str3, String str4, vg0 vg0, ug0 ug0, String str5) {
        String valueOf;
        String str6;
        String str7;
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10245B3)).booleanValue() || !iy2.m11366b()) {
            return null;
        }
        uy2 a = uy2.m18250a("Google", str);
        ty2 c = m19861c("javascript");
        qy2 a2 = m19859a(ug0.toString());
        ty2 ty2 = ty2.NONE;
        if (c == ty2) {
            str7 = "Omid html session error; Unable to parse impression owner: javascript";
        } else {
            if (a2 == null) {
                valueOf = String.valueOf(ug0);
                str6 = "Omid html session error; Unable to parse creative type: ";
            } else {
                ty2 c2 = m19861c(str4);
                if (a2 == qy2.VIDEO && c2 == ty2) {
                    valueOf = String.valueOf(str4);
                    str6 = "Omid html session error; Video events owner unknown for video creative: ";
                    if (valueOf.length() == 0) {
                        str7 = new String(str6);
                    }
                } else {
                    return C2637b.m21358Z2(ly2.m12984a(my2.m13528a(a2, m19860b(vg0.toString()), c, c2, true), ny2.m14172b(a, webView, str5, "")));
                }
            }
            str7 = str6.concat(valueOf);
        }
        io0.m11131g(str7);
        return null;
    }

    /* renamed from: T */
    public final C2635a mo10789T(String str, WebView webView, String str2, String str3, String str4, String str5, vg0 vg0, ug0 ug0, String str6) {
        String concat;
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10245B3)).booleanValue() || !iy2.m11366b()) {
            return null;
        }
        uy2 a = uy2.m18250a(str5, str);
        ty2 c = m19861c("javascript");
        ty2 c2 = m19861c(str4);
        qy2 a2 = m19859a(ug0.toString());
        ty2 ty2 = ty2.NONE;
        if (c == ty2) {
            concat = "Omid js session error; Unable to parse impression owner: javascript";
        } else if (a2 == null) {
            concat = "Omid js session error; Unable to parse creative type: ".concat(String.valueOf(ug0));
        } else if (a2 == qy2.VIDEO && c2 == ty2) {
            String valueOf = String.valueOf(str4);
            io0.m11131g(valueOf.length() != 0 ? "Omid js session error; Video events owner unknown for video creative: ".concat(valueOf) : new String("Omid js session error; Video events owner unknown for video creative: "));
            return null;
        } else {
            return C2637b.m21358Z2(ly2.m12984a(my2.m13528a(a2, m19860b(vg0.toString()), c, c2, true), ny2.m14173c(a, webView, str6, "")));
        }
        io0.m11131g(concat);
        return null;
    }

    /* renamed from: U */
    public final void mo10790U(C2635a aVar, View view) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10245B3)).booleanValue() && iy2.m11366b()) {
            Object C0 = C2637b.m21357C0(aVar);
            if (C0 instanceof ly2) {
                ((ly2) C0).mo9095d(view);
            }
        }
    }

    /* renamed from: V */
    public final boolean mo10791V(Context context) {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10245B3)).booleanValue()) {
            io0.m11131g("Omid flag is disabled");
            return false;
        } else if (iy2.m11366b()) {
            return true;
        } else {
            iy2.m11365a(context);
            return iy2.m11366b();
        }
    }

    public final void zze(C2635a aVar) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10245B3)).booleanValue() && iy2.m11366b()) {
            Object C0 = C2637b.m21357C0(aVar);
            if (C0 instanceof ly2) {
                ((ly2) C0).mo9094c();
            }
        }
    }
}

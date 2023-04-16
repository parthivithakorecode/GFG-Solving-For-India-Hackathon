package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.C0581n;
import com.google.android.gms.internal.ads.C2420yu;
import com.google.android.gms.internal.ads.cv0;
import com.google.android.gms.internal.ads.da0;
import com.google.android.gms.internal.ads.eu0;
import com.google.android.gms.internal.ads.gv0;
import com.google.android.gms.internal.ads.kv0;
import com.google.android.gms.internal.ads.nv0;
import com.google.android.gms.internal.ads.pi1;
import com.google.android.gms.internal.ads.pv0;
import com.google.android.gms.internal.ads.vt0;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p048g2.C2637b;
import p054h1.C2676b;
import p054h1.C2694t;
import p061i1.C2807f;
import p061i1.C2816o;
import p061i1.C2824w;
import p069j1.C3163g2;
import p069j1.C3202r1;
import p069j1.C3219x0;

public final class f80<T extends C2420yu & vt0 & eu0 & da0 & cv0 & gv0 & kv0 & pi1 & nv0 & pv0> implements t70<T> {

    /* renamed from: a */
    private final C2676b f6741a;

    /* renamed from: b */
    private final wv1 f6742b;

    /* renamed from: c */
    private final xw2 f6743c;

    /* renamed from: d */
    private final oo0 f6744d;

    /* renamed from: e */
    private final yf0 f6745e;

    /* renamed from: f */
    private final o42 f6746f;

    /* renamed from: g */
    private C2824w f6747g = null;

    public f80(C2676b bVar, yf0 yf0, o42 o42, wv1 wv1, xw2 xw2) {
        this.f6741a = bVar;
        this.f6745e = yf0;
        this.f6746f = o42;
        this.f6742b = wv1;
        this.f6743c = xw2;
        this.f6744d = new oo0((String) null);
    }

    /* renamed from: b */
    public static int m9040b(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        if ("c".equalsIgnoreCase(str)) {
            return C2694t.m21609r().mo14002g();
        }
        return -1;
    }

    /* renamed from: c */
    static Uri m9041c(Context context, C1734gb gbVar, Uri uri, View view, Activity activity) {
        if (gbVar == null) {
            return uri;
        }
        try {
            return gbVar.mo7562e(uri) ? gbVar.mo7558a(uri, context, view, activity) : uri;
        } catch (C1771hb unused) {
            return uri;
        } catch (Exception e) {
            C2694t.m21607p().mo11034s(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    /* renamed from: d */
    static Uri m9042d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            String valueOf = String.valueOf(uri.toString());
            io0.m11129e(valueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(valueOf) : new String("Error adding click uptime parameter to url: "), e);
        }
        return uri;
    }

    /* renamed from: f */
    public static boolean m9043f(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: android.net.Uri} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v13 */
    /* JADX WARNING: type inference failed for: r11v14 */
    /* JADX WARNING: type inference failed for: r11v15 */
    /* JADX WARNING: type inference failed for: r11v16 */
    /* JADX WARNING: type inference failed for: r11v17 */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00dc, code lost:
        if (r3 == null) goto L_0x00de;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00cc A[ADDED_TO_REGION] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m9045h(T r18, java.util.Map<java.lang.String, java.lang.String> r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = 1
            r1.m9046i(r3)
            r4 = r0
            com.google.android.gms.internal.ads.eu0 r4 = (com.google.android.gms.internal.ads.eu0) r4
            android.content.Context r5 = r4.getContext()
            com.google.android.gms.internal.ads.gb r6 = r4.mo7083H()
            android.view.View r7 = r4.mo7105Y()
            java.lang.String r8 = "activity"
            java.lang.Object r8 = r5.getSystemService(r8)
            android.app.ActivityManager r8 = (android.app.ActivityManager) r8
            java.lang.String r9 = "u"
            java.lang.Object r9 = r2.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            r11 = 0
            if (r10 == 0) goto L_0x0032
            goto L_0x0130
        L_0x0032:
            android.net.Uri r9 = android.net.Uri.parse(r9)
            android.net.Uri r9 = m9041c(r5, r6, r9, r7, r11)
            android.net.Uri r9 = m9042d(r9)
            java.lang.String r10 = "use_first_package"
            java.lang.Object r10 = r2.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            java.lang.String r12 = "use_running_process"
            java.lang.Object r12 = r2.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = java.lang.Boolean.parseBoolean(r12)
            java.lang.String r13 = "use_custom_tabs"
            java.lang.Object r2 = r2.get(r13)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            if (r2 != 0) goto L_0x0078
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.m10.f10445a3
            com.google.android.gms.internal.ads.k10 r14 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r2 = r14.mo8579b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            java.lang.String r2 = r9.getScheme()
            java.lang.String r14 = "http"
            boolean r2 = r14.equalsIgnoreCase(r2)
            java.lang.String r15 = "https"
            if (r2 == 0) goto L_0x0093
            android.net.Uri$Builder r2 = r9.buildUpon()
            android.net.Uri$Builder r2 = r2.scheme(r15)
        L_0x008e:
            android.net.Uri r11 = r2.build()
            goto L_0x00a6
        L_0x0093:
            java.lang.String r2 = r9.getScheme()
            boolean r2 = r15.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00a6
            android.net.Uri$Builder r2 = r9.buildUpon()
            android.net.Uri$Builder r2 = r2.scheme(r14)
            goto L_0x008e
        L_0x00a6:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.Intent r9 = com.google.android.gms.internal.ads.e80.m8359a(r9, r5, r6, r7)
            android.content.Intent r11 = com.google.android.gms.internal.ads.e80.m8359a(r11, r5, r6, r7)
            if (r3 == 0) goto L_0x00c1
            p054h1.C2694t.m21608q()
            p069j1.C3163g2.m23922c0(r5, r9)
            p054h1.C2694t.m21608q()
            p069j1.C3163g2.m23922c0(r5, r11)
        L_0x00c1:
            android.content.pm.ResolveInfo r3 = com.google.android.gms.internal.ads.e80.m8362d(r9, r2, r5, r6, r7)
            if (r3 == 0) goto L_0x00cc
            android.content.Intent r11 = com.google.android.gms.internal.ads.e80.m8360b(r9, r3, r5, r6, r7)
            goto L_0x0130
        L_0x00cc:
            if (r11 == 0) goto L_0x00de
            android.content.pm.ResolveInfo r3 = com.google.android.gms.internal.ads.e80.m8361c(r11, r5, r6, r7)
            if (r3 == 0) goto L_0x00de
            android.content.Intent r11 = com.google.android.gms.internal.ads.e80.m8360b(r9, r3, r5, r6, r7)
            android.content.pm.ResolveInfo r3 = com.google.android.gms.internal.ads.e80.m8361c(r11, r5, r6, r7)
            if (r3 != 0) goto L_0x0130
        L_0x00de:
            int r3 = r2.size()
            if (r3 != 0) goto L_0x00e5
            goto L_0x012f
        L_0x00e5:
            if (r12 == 0) goto L_0x0121
            if (r8 == 0) goto L_0x0121
            java.util.List r3 = r8.getRunningAppProcesses()
            if (r3 == 0) goto L_0x0121
            int r8 = r2.size()
            r11 = 0
        L_0x00f4:
            if (r11 >= r8) goto L_0x0121
            java.lang.Object r12 = r2.get(r11)
            android.content.pm.ResolveInfo r12 = (android.content.pm.ResolveInfo) r12
            java.util.Iterator r14 = r3.iterator()
        L_0x0100:
            int r15 = r11 + 1
            boolean r16 = r14.hasNext()
            if (r16 == 0) goto L_0x011f
            java.lang.Object r15 = r14.next()
            android.app.ActivityManager$RunningAppProcessInfo r15 = (android.app.ActivityManager.RunningAppProcessInfo) r15
            java.lang.String r15 = r15.processName
            android.content.pm.ActivityInfo r13 = r12.activityInfo
            java.lang.String r13 = r13.packageName
            boolean r13 = r15.equals(r13)
            if (r13 == 0) goto L_0x0100
            android.content.Intent r11 = com.google.android.gms.internal.ads.e80.m8360b(r9, r12, r5, r6, r7)
            goto L_0x0130
        L_0x011f:
            r11 = r15
            goto L_0x00f4
        L_0x0121:
            if (r10 == 0) goto L_0x012f
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.Intent r11 = com.google.android.gms.internal.ads.e80.m8360b(r9, r2, r5, r6, r7)
            goto L_0x0130
        L_0x012f:
            r11 = r9
        L_0x0130:
            if (r20 == 0) goto L_0x014e
            com.google.android.gms.internal.ads.o42 r2 = r1.f6746f
            if (r2 == 0) goto L_0x014e
            if (r11 == 0) goto L_0x014e
            android.content.Context r2 = r4.getContext()
            android.net.Uri r3 = r11.getData()
            java.lang.String r3 = r3.toString()
            r4 = r21
            boolean r2 = r1.m9047j(r0, r2, r3, r4)
            if (r2 != 0) goto L_0x014d
            goto L_0x014e
        L_0x014d:
            return
        L_0x014e:
            com.google.android.gms.internal.ads.kv0 r0 = (com.google.android.gms.internal.ads.kv0) r0     // Catch:{ ActivityNotFoundException -> 0x015d }
            i1.f r2 = new i1.f     // Catch:{ ActivityNotFoundException -> 0x015d }
            i1.w r3 = r1.f6747g     // Catch:{ ActivityNotFoundException -> 0x015d }
            r2.<init>(r11, r3)     // Catch:{ ActivityNotFoundException -> 0x015d }
            r3 = r22
            r0.mo8803S0(r2, r3)     // Catch:{ ActivityNotFoundException -> 0x015d }
            return
        L_0x015d:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.google.android.gms.internal.ads.io0.m11131g(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f80.m9045h(com.google.android.gms.internal.ads.yu, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    /* renamed from: i */
    private final void m9046i(boolean z) {
        yf0 yf0 = this.f6745e;
        if (yf0 != null) {
            yf0.mo12004h(z);
        }
    }

    /* renamed from: j */
    private final boolean m9047j(T t, Context context, String str, String str2) {
        String str3;
        String str4 = str2;
        C2694t.m21608q();
        boolean j = C3163g2.m23934j(context);
        C2694t.m21608q();
        C3219x0 e = C3163g2.m23925e(context);
        wv1 wv1 = this.f6742b;
        if (wv1 != null) {
            w42.m18871A5(context, wv1, this.f6743c, this.f6746f, str2, "offline_open");
        }
        eu0 eu0 = (eu0) t;
        boolean z = eu0.mo7151x().mo11531i() && eu0.mo7127j() == null;
        if (j) {
            this.f6746f.mo9655z(this.f6744d, str4);
            return false;
        }
        C2694t.m21608q();
        if (C0581n.m2390e(context).mo2500a() && e != null && !z) {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10520i6)).booleanValue()) {
                if (eu0.mo7151x().mo11531i()) {
                    w42.m18873C5(eu0.mo7127j(), (C2816o) null, e, this.f6746f, this.f6742b, this.f6743c, str2, str);
                } else {
                    ((kv0) t).mo8801D(e, this.f6746f, this.f6742b, this.f6743c, str2, str, C2694t.m21609r().mo14002g());
                }
                wv1 wv12 = this.f6742b;
                if (wv12 != null) {
                    w42.m18871A5(context, wv12, this.f6743c, this.f6746f, str2, "dialog_impression");
                }
                t.mo25L();
                return true;
            }
        }
        this.f6746f.mo9648m(str4);
        if (this.f6742b != null) {
            HashMap hashMap = new HashMap();
            C2694t.m21608q();
            if (!C0581n.m2390e(context).mo2500a()) {
                str3 = "notifications_disabled";
            } else if (e == null) {
                str3 = "work_manager_unavailable";
            } else {
                if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10520i6)).booleanValue()) {
                    str3 = "notification_flow_disabled";
                } else {
                    if (z) {
                        str3 = "fullscreen_no_activity";
                    }
                    w42.m18872B5(context, this.f6742b, this.f6743c, this.f6746f, str2, "dialog_not_shown", hashMap);
                }
            }
            hashMap.put("dialog_not_shown_reason", str3);
            w42.m18872B5(context, this.f6742b, this.f6743c, this.f6746f, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m9048k(int i) {
        if (this.f6742b != null) {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10592q6)).booleanValue()) {
                xw2 xw2 = this.f6743c;
                ww2 b = ww2.m19233b("cct_action");
                b.mo11742a("cct_open_status", k20.m11965a(i));
                xw2.mo5981a(b);
                return;
            }
            vv1 a = this.f6742b.mo11740a();
            a.mo11533b("action", "cct_action");
            a.mo11533b("cct_open_status", k20.m11965a(i));
            a.mo11537f();
        }
    }

    /* renamed from: e */
    public final void mo5150a(T t, Map<String, String> map) {
        String str;
        boolean z;
        Object obj;
        HashMap hashMap;
        T t2 = t;
        Map<String, String> map2 = map;
        eu0 eu0 = (eu0) t2;
        String c = rm0.m16269c(map2.get("u"), eu0.getContext(), true);
        String str2 = map2.get("a");
        if (str2 == null) {
            io0.m11131g("Action missing from an open GMSG.");
            return;
        }
        C2676b bVar = this.f6741a;
        if (bVar == null || bVar.mo12668c()) {
            rr2 A = eu0.mo7073A();
            ur2 F = eu0.mo6308F();
            boolean z2 = false;
            if (A == null || F == null) {
                str = "";
                z = false;
            } else {
                z = A.f13897g0;
                str = F.f15729b;
            }
            boolean z3 = !((Boolean) C2199sw.m17001c().mo8579b(m10.f10539k7)).booleanValue() || !map2.containsKey("sc") || !map2.get("sc").equals("0");
            if ("expand".equalsIgnoreCase(str2)) {
                if (eu0.mo7090K0()) {
                    io0.m11131g("Cannot expand WebView that is already expanded.");
                    return;
                }
                m9046i(false);
                ((kv0) t2).mo8805q0(m9043f(map), m9040b(map), z3);
            } else if ("webapp".equalsIgnoreCase(str2)) {
                m9046i(false);
                if (c != null) {
                    ((kv0) t2).mo8804T0(m9043f(map), m9040b(map), c, z3);
                } else {
                    ((kv0) t2).mo8802Q0(m9043f(map), m9040b(map), map2.get("html"), map2.get("baseurl"), z3);
                }
            } else if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
                Context context = eu0.getContext();
                if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10463c3)).booleanValue()) {
                    if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10517i3)).booleanValue()) {
                        C3202r1.m24015k("User opt out chrome custom tab.");
                    } else {
                        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10499g3)).booleanValue()) {
                            z2 = true;
                        } else {
                            String str3 = (String) C2199sw.m17001c().mo8579b(m10.f10508h3);
                            if (!str3.isEmpty() && context != null) {
                                String packageName = context.getPackageName();
                                Iterator<String> it = z43.m20433c(b43.m6607b(';')).mo12144d(str3).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (it.next().equals(packageName)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                z2 = true;
                            }
                        }
                    }
                }
                boolean g = l20.m12506g(eu0.getContext());
                if (z2) {
                    if (!g) {
                        m9048k(4);
                    } else {
                        m9046i(true);
                        if (TextUtils.isEmpty(c)) {
                            io0.m11131g("Cannot open browser with null or empty url");
                            m9048k(7);
                            return;
                        }
                        Uri d = m9042d(m9041c(eu0.getContext(), eu0.mo7083H(), Uri.parse(c), eu0.mo7105Y(), eu0.mo7127j()));
                        if (!z || this.f6746f == null || !m9047j(t2, eu0.getContext(), d.toString(), str)) {
                            this.f6747g = new c80(this);
                            ((kv0) t2).mo8803S0(new C2807f((String) null, d.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (Intent) null, C2637b.m21358Z2(this.f6747g).asBinder(), true), z3);
                            return;
                        }
                        return;
                    }
                }
                map2.put("use_first_package", "true");
                map2.put("use_running_process", "true");
                m9045h(t, map, z, str, z3);
            } else if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase(map2.get("system_browser"))) {
                m9045h(t, map, z, str, z3);
            } else if ("open_app".equalsIgnoreCase(str2)) {
                if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10439Z5)).booleanValue()) {
                    m9046i(true);
                    String str4 = map2.get("p");
                    if (str4 == null) {
                        io0.m11131g("Package name missing from open app action.");
                    } else if (!z || this.f6746f == null || !m9047j(t2, eu0.getContext(), str4, str)) {
                        PackageManager packageManager = eu0.getContext().getPackageManager();
                        if (packageManager == null) {
                            io0.m11131g("Cannot get package manager from open app action.");
                            return;
                        }
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str4);
                        if (launchIntentForPackage != null) {
                            ((kv0) t2).mo8803S0(new C2807f(launchIntentForPackage, this.f6747g), z3);
                        }
                    }
                }
            } else {
                m9046i(true);
                String str5 = map2.get("intent_url");
                Intent intent = null;
                if (!TextUtils.isEmpty(str5)) {
                    try {
                        intent = Intent.parseUri(str5, 0);
                    } catch (URISyntaxException e) {
                        URISyntaxException uRISyntaxException = e;
                        String valueOf = String.valueOf(str5);
                        io0.m11129e(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), uRISyntaxException);
                    }
                }
                Intent intent2 = intent;
                if (!(intent2 == null || intent2.getData() == null)) {
                    Uri data = intent2.getData();
                    if (!Uri.EMPTY.equals(data)) {
                        Uri d2 = m9042d(m9041c(eu0.getContext(), eu0.mo7083H(), data, eu0.mo7105Y(), eu0.mo7127j()));
                        if (!TextUtils.isEmpty(intent2.getType())) {
                            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10448a6)).booleanValue()) {
                                intent2.setDataAndType(d2, intent2.getType());
                            }
                        }
                        intent2.setData(d2);
                    }
                }
                boolean z4 = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10556m6)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map2.containsKey("event_id");
                HashMap hashMap2 = new HashMap();
                if (z4) {
                    hashMap = hashMap2;
                    obj = "p";
                    d80 d80 = r1;
                    d80 d802 = new d80(this, z3, t, hashMap2, map);
                    this.f6747g = d80;
                    z3 = false;
                } else {
                    hashMap = hashMap2;
                    obj = "p";
                }
                if (intent2 == null) {
                    HashMap hashMap3 = hashMap;
                    if (!TextUtils.isEmpty(c)) {
                        c = m9042d(m9041c(eu0.getContext(), eu0.mo7083H(), Uri.parse(c), eu0.mo7105Y(), eu0.mo7127j())).toString();
                    }
                    if (!z || this.f6746f == null || !m9047j(t2, eu0.getContext(), c, str)) {
                        ((kv0) t2).mo8803S0(new C2807f(map2.get("i"), c, map2.get("m"), map2.get(obj), map2.get("c"), map2.get("f"), map2.get("e"), this.f6747g), z3);
                    } else if (z4) {
                        hashMap3.put(map2.get("event_id"), Boolean.TRUE);
                        ((da0) t2).mo6424t("openIntentAsync", hashMap3);
                    }
                } else if (!z || this.f6746f == null || !m9047j(t2, eu0.getContext(), intent2.getData().toString(), str)) {
                    ((kv0) t2).mo8803S0(new C2807f(intent2, this.f6747g), z3);
                } else if (z4) {
                    HashMap hashMap4 = hashMap;
                    hashMap4.put(map2.get("event_id"), Boolean.TRUE);
                    ((da0) t2).mo6424t("openIntentAsync", hashMap4);
                }
            }
        } else {
            this.f6741a.mo12667b(c);
        }
    }
}

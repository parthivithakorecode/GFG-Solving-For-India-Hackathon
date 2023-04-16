package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0092o;
import p034e2.C2555l;
import p041f2.C2606c;
import p069j1.C3210u0;
import p160x1.C4284f;

@ParametersAreNonnullByDefault
public final class fl0 implements ml0 {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final List<Future<Void>> f6850m = Collections.synchronizedList(new ArrayList());

    /* renamed from: n */
    public static final /* synthetic */ int f6851n = 0;
    @GuardedBy("lock")

    /* renamed from: a */
    private final qt3 f6852a;
    @GuardedBy("lock")

    /* renamed from: b */
    private final LinkedHashMap<String, lu3> f6853b;
    @GuardedBy("lock")

    /* renamed from: c */
    private final List<String> f6854c = new ArrayList();
    @GuardedBy("lock")

    /* renamed from: d */
    private final List<String> f6855d = new ArrayList();

    /* renamed from: e */
    private final Context f6856e;

    /* renamed from: f */
    boolean f6857f;

    /* renamed from: g */
    private final jl0 f6858g;

    /* renamed from: h */
    private final Object f6859h = new Object();

    /* renamed from: i */
    private HashSet<String> f6860i = new HashSet<>();

    /* renamed from: j */
    private boolean f6861j = false;

    /* renamed from: k */
    private boolean f6862k = false;

    /* renamed from: l */
    private final il0 f6863l;

    public fl0(Context context, po0 po0, jl0 jl0, String str, il0 il0, byte[] bArr) {
        C0092o.m314j(jl0, "SafeBrowsing config is not present.");
        this.f6856e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f6853b = new LinkedHashMap<>();
        this.f6863l = il0;
        this.f6858g = jl0;
        for (String lowerCase : jl0.f9177j) {
            this.f6860i.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.f6860i.remove("cookie".toLowerCase(Locale.ENGLISH));
        qt3 F = pu3.m15268F();
        F.mo10385E(9);
        F.mo10381A(str);
        F.mo10393y(str);
        st3 F2 = tt3.m17509F();
        String str2 = this.f6858g.f9173f;
        if (str2 != null) {
            F2.mo10871r(str2);
        }
        F.mo10392x((tt3) F2.mo11894o());
        nu3 F3 = ou3.m14640F();
        F3.mo9599t(C2606c.m21299a(this.f6856e).mo12497g());
        String str3 = po0.f12729f;
        if (str3 != null) {
            F3.mo9597r(str3);
        }
        long a = (long) C4284f.m26845f().mo15874a(this.f6856e);
        if (a > 0) {
            F3.mo9598s(a);
        }
        F.mo10391w((ou3) F3.mo11894o());
        this.f6852a = F;
    }

    /* renamed from: Q */
    public final void mo7367Q(String str) {
        synchronized (this.f6859h) {
            if (str == null) {
                this.f6852a.mo10389u();
            } else {
                this.f6852a.mo10390v(str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7368a(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f6859h
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L_0x0009
            r2 = 1
            r6.f6862k = r2     // Catch:{ all -> 0x00b7 }
        L_0x0009:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.lu3> r2 = r6.f6853b     // Catch:{ all -> 0x00b7 }
            boolean r2 = r2.containsKey(r7)     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x0024
            if (r9 != r1) goto L_0x0022
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.lu3> r8 = r6.f6853b     // Catch:{ all -> 0x00b7 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.lu3 r7 = (com.google.android.gms.internal.ads.lu3) r7     // Catch:{ all -> 0x00b7 }
            int r8 = com.google.android.gms.internal.ads.ku3.m12424a(r1)     // Catch:{ all -> 0x00b7 }
            r7.mo9077v(r8)     // Catch:{ all -> 0x00b7 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            return
        L_0x0024:
            com.google.android.gms.internal.ads.lu3 r1 = com.google.android.gms.internal.ads.mu3.m13486G()     // Catch:{ all -> 0x00b7 }
            int r9 = com.google.android.gms.internal.ads.ku3.m12424a(r9)     // Catch:{ all -> 0x00b7 }
            if (r9 == 0) goto L_0x0031
            r1.mo9077v(r9)     // Catch:{ all -> 0x00b7 }
        L_0x0031:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.lu3> r9 = r6.f6853b     // Catch:{ all -> 0x00b7 }
            int r9 = r9.size()     // Catch:{ all -> 0x00b7 }
            r1.mo9074s(r9)     // Catch:{ all -> 0x00b7 }
            r1.mo9076u(r7)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.wt3 r9 = com.google.android.gms.internal.ads.zt3.m20837F()     // Catch:{ all -> 0x00b7 }
            java.util.HashSet<java.lang.String> r2 = r6.f6860i     // Catch:{ all -> 0x00b7 }
            int r2 = r2.size()     // Catch:{ all -> 0x00b7 }
            if (r2 <= 0) goto L_0x00a7
            if (r8 == 0) goto L_0x00a7
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x00b7 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00b7 }
        L_0x0053:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x00a7
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x00b7 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00b7 }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00b7 }
            if (r3 == 0) goto L_0x006c
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00b7 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00b7 }
            goto L_0x006e
        L_0x006c:
            java.lang.String r3 = ""
        L_0x006e:
            java.lang.Object r4 = r2.getValue()     // Catch:{ all -> 0x00b7 }
            if (r4 == 0) goto L_0x007b
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00b7 }
            goto L_0x007d
        L_0x007b:
            java.lang.String r2 = ""
        L_0x007d:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00b7 }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ all -> 0x00b7 }
            java.util.HashSet<java.lang.String> r5 = r6.f6860i     // Catch:{ all -> 0x00b7 }
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x00b7 }
            if (r4 == 0) goto L_0x0053
            com.google.android.gms.internal.ads.ut3 r4 = com.google.android.gms.internal.ads.vt3.m18673F()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.uo3 r3 = com.google.android.gms.internal.ads.uo3.m17970K(r3)     // Catch:{ all -> 0x00b7 }
            r4.mo11305r(r3)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.uo3 r2 = com.google.android.gms.internal.ads.uo3.m17970K(r2)     // Catch:{ all -> 0x00b7 }
            r4.mo11306s(r2)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.aq3 r2 = r4.mo11894o()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.vt3 r2 = (com.google.android.gms.internal.ads.vt3) r2     // Catch:{ all -> 0x00b7 }
            r9.mo11730r(r2)     // Catch:{ all -> 0x00b7 }
            goto L_0x0053
        L_0x00a7:
            com.google.android.gms.internal.ads.aq3 r8 = r9.mo11894o()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zt3 r8 = (com.google.android.gms.internal.ads.zt3) r8     // Catch:{ all -> 0x00b7 }
            r1.mo9075t(r8)     // Catch:{ all -> 0x00b7 }
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.lu3> r8 = r6.f6853b     // Catch:{ all -> 0x00b7 }
            r8.put(r7, r1)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            return
        L_0x00b7:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fl0.mo7368a(java.lang.String, java.util.Map, int):void");
    }

    /* renamed from: b */
    public final void mo7369b() {
        synchronized (this.f6859h) {
            this.f6853b.keySet();
            cc3 i = rb3.m16131i(Collections.emptyMap());
            bl0 bl0 = new bl0(this);
            dc3 dc3 = wo0.f16891f;
            cc3 n = rb3.m16136n(i, bl0, dc3);
            cc3 o = rb3.m16137o(n, 10, TimeUnit.SECONDS, wo0.f16889d);
            rb3.m16140r(n, new el0(this, o), dc3);
            f6850m.add(o);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0036 A[SYNTHETIC, Splitter:B:20:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7370c(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.jl0 r0 = r7.f6858g
            boolean r0 = r0.f9175h
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = r7.f6861j
            if (r0 == 0) goto L_0x000c
            return
        L_0x000c:
            p054h1.C2694t.m21608q()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L_0x0014
            goto L_0x006d
        L_0x0014:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch:{ RuntimeException -> 0x002d }
            r8.setDrawingCacheEnabled(r0)     // Catch:{ RuntimeException -> 0x002d }
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch:{ RuntimeException -> 0x002d }
            if (r3 == 0) goto L_0x0026
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch:{ RuntimeException -> 0x002d }
            goto L_0x0027
        L_0x0026:
            r3 = r1
        L_0x0027:
            r8.setDrawingCacheEnabled(r2)     // Catch:{ RuntimeException -> 0x002b }
            goto L_0x0034
        L_0x002b:
            r2 = move-exception
            goto L_0x002f
        L_0x002d:
            r2 = move-exception
            r3 = r1
        L_0x002f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.internal.ads.io0.m11129e(r4, r2)
        L_0x0034:
            if (r3 != 0) goto L_0x006c
            int r2 = r8.getWidth()     // Catch:{ RuntimeException -> 0x0065 }
            int r3 = r8.getHeight()     // Catch:{ RuntimeException -> 0x0065 }
            if (r2 == 0) goto L_0x005f
            if (r3 != 0) goto L_0x0043
            goto L_0x005f
        L_0x0043:
            int r4 = r8.getWidth()     // Catch:{ RuntimeException -> 0x0065 }
            int r5 = r8.getHeight()     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch:{ RuntimeException -> 0x0065 }
            r5.<init>(r4)     // Catch:{ RuntimeException -> 0x0065 }
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch:{ RuntimeException -> 0x0065 }
            r8.draw(r5)     // Catch:{ RuntimeException -> 0x0065 }
            r1 = r4
            goto L_0x006d
        L_0x005f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.internal.ads.io0.m11131g(r8)     // Catch:{ RuntimeException -> 0x0065 }
            goto L_0x006d
        L_0x0065:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.internal.ads.io0.m11129e(r2, r8)
            goto L_0x006d
        L_0x006c:
            r1 = r3
        L_0x006d:
            if (r1 != 0) goto L_0x0075
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.ll0.m12780a(r8)
            return
        L_0x0075:
            r7.f6861j = r0
            com.google.android.gms.internal.ads.cl0 r8 = new com.google.android.gms.internal.ads.cl0
            r8.<init>(r7, r1)
            p069j1.C3163g2.m23917U(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fl0.mo7370c(android.view.View):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ cc3 mo7371d(Map map) {
        cc3<O> m;
        lu3 lu3;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.f6859h) {
                            int length = optJSONArray.length();
                            synchronized (this.f6859h) {
                                lu3 = this.f6853b.get(str);
                            }
                            if (lu3 == null) {
                                String valueOf = String.valueOf(str);
                                ll0.m12780a(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                boolean z = false;
                                for (int i = 0; i < length; i++) {
                                    lu3.mo9073r(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                boolean z2 = this.f6857f;
                                if (length > 0) {
                                    z = true;
                                }
                                this.f6857f = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (i30.f8520b.mo9928e().booleanValue()) {
                    io0.m11127c("Failed to get SafeBrowsing metadata", e);
                }
                return rb3.m16130h(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f6857f) {
            synchronized (this.f6859h) {
                this.f6852a.mo10385E(10);
            }
        }
        boolean z3 = this.f6857f;
        if ((!z3 || !this.f6858g.f9179l) && ((!this.f6862k || !this.f6858g.f9178k) && (z3 || !this.f6858g.f9176i))) {
            return rb3.m16131i(null);
        }
        synchronized (this.f6859h) {
            for (lu3 o : this.f6853b.values()) {
                this.f6852a.mo10388t((mu3) o.mo11894o());
            }
            this.f6852a.mo10386r(this.f6854c);
            this.f6852a.mo10387s(this.f6855d);
            if (ll0.m12781b()) {
                String C = this.f6852a.mo10383C();
                String B = this.f6852a.mo10382B();
                StringBuilder sb = new StringBuilder(String.valueOf(C).length() + 53 + String.valueOf(B).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(C);
                sb.append("\n  clickUrl: ");
                sb.append(B);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (mu3 next : this.f6852a.mo10384D()) {
                    sb2.append("    [");
                    sb2.append(next.mo9365F());
                    sb2.append("] ");
                    sb2.append(next.mo9366I());
                }
                ll0.m12780a(sb2.toString());
            }
            cc3<String> b = new C3210u0(this.f6856e).mo14109b(1, this.f6858g.f9174g, (Map<String, String>) null, ((pu3) this.f6852a.mo11894o()).mo5901b());
            if (ll0.m12781b()) {
                b.mo5905b(dl0.f5832f, wo0.f16886a);
            }
            m = rb3.m16135m(b, al0.f4239a, wo0.f16891f);
        }
        return m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo7372f(Bitmap bitmap) {
        ro3 G = uo3.m17966G();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, G);
        synchronized (this.f6859h) {
            qt3 qt3 = this.f6852a;
            eu3 F = gu3.m10005F();
            F.mo7154r(G.mo10630h());
            F.mo7155s("image/png");
            F.mo7156t(2);
            qt3.mo10394z((gu3) F.mo11894o());
        }
    }

    /* renamed from: h */
    public final boolean mo7373h() {
        return C2555l.m21211e() && this.f6858g.f9175h && !this.f6861j;
    }

    public final jl0 zza() {
        return this.f6858g;
    }
}

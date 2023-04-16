package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
public final class r10 {

    /* renamed from: a */
    final BlockingQueue<b20> f13449a = new ArrayBlockingQueue(100);

    /* renamed from: b */
    final LinkedHashMap<String, String> f13450b = new LinkedHashMap<>();

    /* renamed from: c */
    final Map<String, x10> f13451c = new HashMap();

    /* renamed from: d */
    String f13452d;

    /* renamed from: e */
    Context f13453e;

    /* renamed from: f */
    String f13454f;

    /* renamed from: g */
    private final HashSet<String> f13455g = new HashSet<>(Arrays.asList(new String[]{"noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"}));

    /* renamed from: h */
    private AtomicBoolean f13456h;

    /* renamed from: i */
    private File f13457i;

    /* renamed from: c */
    public static /* synthetic */ void m15993c(r10 r10) {
        while (true) {
            try {
                b20 take = r10.f13449a.take();
                a20 a = take.mo5628a();
                if (!TextUtils.isEmpty(a.mo5072b())) {
                    r10.m15994g(r10.mo10450b(r10.f13450b, take.mo5629b()), a);
                }
            } catch (InterruptedException e) {
                io0.m11132h("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a7 A[SYNTHETIC, Splitter:B:38:0x00a7] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b2 A[SYNTHETIC, Splitter:B:44:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m15994g(java.util.Map<java.lang.String, java.lang.String> r5, com.google.android.gms.internal.ads.a20 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            java.lang.String r1 = r4.f13452d
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0014:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.appendQueryParameter(r3, r2)
            goto L_0x0014
        L_0x0030:
            android.net.Uri r5 = r1.build()
            java.lang.String r5 = r5.toString()
            if (r6 == 0) goto L_0x006f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            java.lang.String r5 = r6.mo5072b()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0055
            java.lang.String r5 = "&it="
            r1.append(r5)
            java.lang.String r5 = r6.mo5072b()
            r1.append(r5)
        L_0x0055:
            java.lang.String r5 = r6.mo5071a()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x006b
            java.lang.String r5 = "&blat="
            r1.append(r5)
            java.lang.String r5 = r6.mo5071a()
            r1.append(r5)
        L_0x006b:
            java.lang.String r5 = r1.toString()
        L_0x006f:
            java.util.concurrent.atomic.AtomicBoolean r6 = r4.f13456h
            boolean r6 = r6.get()
            if (r6 == 0) goto L_0x00c1
            java.io.File r6 = r4.f13457i
            if (r6 == 0) goto L_0x00bb
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x009f }
            r3 = 1
            r2.<init>(r6, r3)     // Catch:{ IOException -> 0x009f }
            byte[] r5 = r5.getBytes()     // Catch:{ IOException -> 0x009a, all -> 0x0097 }
            r2.write(r5)     // Catch:{ IOException -> 0x009a, all -> 0x0097 }
            r5 = 10
            r2.write(r5)     // Catch:{ IOException -> 0x009a, all -> 0x0097 }
            r2.close()     // Catch:{ IOException -> 0x0092 }
            return
        L_0x0092:
            r5 = move-exception
            com.google.android.gms.internal.ads.io0.m11132h(r0, r5)
            return
        L_0x0097:
            r5 = move-exception
            r1 = r2
            goto L_0x00b0
        L_0x009a:
            r5 = move-exception
            r1 = r2
            goto L_0x00a0
        L_0x009d:
            r5 = move-exception
            goto L_0x00b0
        L_0x009f:
            r5 = move-exception
        L_0x00a0:
            java.lang.String r6 = "CsiReporter: Cannot write to file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.io0.m11132h(r6, r5)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x00af
            r1.close()     // Catch:{ IOException -> 0x00ab }
            return
        L_0x00ab:
            r5 = move-exception
            com.google.android.gms.internal.ads.io0.m11132h(r0, r5)
        L_0x00af:
            return
        L_0x00b0:
            if (r1 == 0) goto L_0x00ba
            r1.close()     // Catch:{ IOException -> 0x00b6 }
            goto L_0x00ba
        L_0x00b6:
            r6 = move-exception
            com.google.android.gms.internal.ads.io0.m11132h(r0, r6)
        L_0x00ba:
            throw r5
        L_0x00bb:
            java.lang.String r5 = "CsiReporter: File doesn't exists. Cannot write CSI data to file."
            com.google.android.gms.internal.ads.io0.m11131g(r5)
            return
        L_0x00c1:
            p054h1.C2694t.m21608q()
            android.content.Context r6 = r4.f13453e
            java.lang.String r0 = r4.f13454f
            p069j1.C3163g2.m23939o(r6, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r10.m15994g(java.util.Map, com.google.android.gms.internal.ads.a20):void");
    }

    /* renamed from: a */
    public final x10 mo10449a(String str) {
        x10 x10 = this.f13451c.get(str);
        return x10 != null ? x10 : x10.f16978a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map<String, String> mo10450b(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry next : map2.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, mo10449a(str).mo11137a(str2, (String) next.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: d */
    public final void mo10451d(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.f13453e = context;
        this.f13454f = str;
        this.f13452d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f13456h = atomicBoolean;
        atomicBoolean.set(x20.f16999c.mo9928e().booleanValue());
        if (this.f13456h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f13457i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry next : map.entrySet()) {
            this.f13450b.put((String) next.getKey(), (String) next.getValue());
        }
        wo0.f16886a.execute(new q10(this));
        Map<String, x10> map2 = this.f13451c;
        x10 x10 = x10.f16979b;
        map2.put("action", x10);
        this.f13451c.put("ad_format", x10);
        this.f13451c.put("e", x10.f16980c);
    }

    /* renamed from: e */
    public final void mo10452e(String str) {
        if (!this.f13455g.contains(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sdkVersion", this.f13454f);
            linkedHashMap.put("ue", str);
            m15994g(mo10450b(this.f13450b, linkedHashMap), (a20) null);
        }
    }

    /* renamed from: f */
    public final boolean mo10453f(b20 b20) {
        return this.f13449a.offer(b20);
    }
}

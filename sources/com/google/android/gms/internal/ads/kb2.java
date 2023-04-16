package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

public final class kb2 extends ef0 {

    /* renamed from: f */
    private final String f9463f;

    /* renamed from: g */
    private final cf0 f9464g;

    /* renamed from: h */
    private final bp0<JSONObject> f9465h;

    /* renamed from: i */
    private final JSONObject f9466i;
    @GuardedBy("this")

    /* renamed from: j */
    private boolean f9467j = false;

    public kb2(String str, cf0 cf0, bp0<JSONObject> bp0) {
        JSONObject jSONObject = new JSONObject();
        this.f9466i = jSONObject;
        this.f9465h = bp0;
        this.f9463f = str;
        this.f9464g = cf0;
        try {
            jSONObject.put("adapter_version", cf0.mo5260d().toString());
            jSONObject.put("sdk_version", cf0.mo5261e().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    /* renamed from: a */
    public final synchronized void mo8649a() {
        if (!this.f9467j) {
            this.f9465h.mo5907e(this.f9466i);
            this.f9467j = true;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* renamed from: i5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo7324i5(com.google.android.gms.internal.ads.C1605cv r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f9467j     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            org.json.JSONObject r0 = r2.f9466i     // Catch:{ JSONException -> 0x0010 }
            java.lang.String r1 = "signal_error"
            java.lang.String r3 = r3.f5530g     // Catch:{ JSONException -> 0x0010 }
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0010 }
        L_0x0010:
            com.google.android.gms.internal.ads.bp0<org.json.JSONObject> r3 = r2.f9465h     // Catch:{ all -> 0x001c }
            org.json.JSONObject r0 = r2.f9466i     // Catch:{ all -> 0x001c }
            r3.mo5907e(r0)     // Catch:{ all -> 0x001c }
            r3 = 1
            r2.f9467j = r3     // Catch:{ all -> 0x001c }
            monitor-exit(r2)
            return
        L_0x001c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kb2.mo7324i5(com.google.android.gms.internal.ads.cv):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|13|14|15|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0017 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo7325u(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f9467j     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            if (r3 != 0) goto L_0x0010
            java.lang.String r3 = "Adapter returned null signals"
            r2.mo7326z(r3)     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0010:
            org.json.JSONObject r0 = r2.f9466i     // Catch:{ JSONException -> 0x0017 }
            java.lang.String r1 = "signals"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0017 }
        L_0x0017:
            com.google.android.gms.internal.ads.bp0<org.json.JSONObject> r3 = r2.f9465h     // Catch:{ all -> 0x0023 }
            org.json.JSONObject r0 = r2.f9466i     // Catch:{ all -> 0x0023 }
            r3.mo5907e(r0)     // Catch:{ all -> 0x0023 }
            r3 = 1
            r2.f9467j = r3     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0023:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kb2.mo7325u(java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000e */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo7326z(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f9467j     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            org.json.JSONObject r0 = r2.f9466i     // Catch:{ JSONException -> 0x000e }
            java.lang.String r1 = "signal_error"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x000e }
        L_0x000e:
            com.google.android.gms.internal.ads.bp0<org.json.JSONObject> r3 = r2.f9465h     // Catch:{ all -> 0x001a }
            org.json.JSONObject r0 = r2.f9466i     // Catch:{ all -> 0x001a }
            r3.mo5907e(r0)     // Catch:{ all -> 0x001a }
            r3 = 1
            r2.f9467j = r3     // Catch:{ all -> 0x001a }
            monitor-exit(r2)
            return
        L_0x001a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kb2.mo7326z(java.lang.String):void");
    }
}

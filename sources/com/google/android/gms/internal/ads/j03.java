package com.google.android.gms.internal.ads;

public final class j03 extends f03 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: long} */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.HashSet] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j03(com.google.android.gms.internal.ads.yz2 r8, com.google.android.gms.internal.ads.yz2 r9, java.util.HashSet<java.lang.String> r10, org.json.JSONObject r11, long r12) {
        /*
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j03.<init>(com.google.android.gms.internal.ads.yz2, java.util.HashSet, org.json.JSONObject, long, byte[]):void");
    }

    /* renamed from: c */
    private final void m11385c(String str) {
        az2 a = az2.m6457a();
        if (a != null) {
            for (py2 next : a.mo5587c()) {
                if (this.f6645c.contains(next.mo10204h())) {
                    next.mo10203g().mo9896d(str, this.f6647e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7490a(String str) {
        m11385c(str);
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f6646d.toString();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        m11385c(str);
        super.onPostExecute(str);
    }
}

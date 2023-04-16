package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

public abstract class g03 extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private h03 f7222a;

    /* renamed from: b */
    protected final yz2 f7223b;

    public g03(yz2 yz2, byte[] bArr) {
        this.f7223b = yz2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        h03 h03 = this.f7222a;
        if (h03 != null) {
            h03.mo7778a(this);
        }
    }

    /* renamed from: b */
    public final void mo7491b(h03 h03) {
        this.f7222a = h03;
    }
}

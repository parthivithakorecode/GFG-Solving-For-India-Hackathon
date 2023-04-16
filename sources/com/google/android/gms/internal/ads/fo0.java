package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import p034e2.C2545b;

public final /* synthetic */ class fo0 implements go0 {

    /* renamed from: a */
    public final /* synthetic */ byte[] f6878a;

    public /* synthetic */ fo0(byte[] bArr) {
        this.f6878a = bArr;
    }

    /* renamed from: a */
    public final void mo6237a(JsonWriter jsonWriter) {
        String str;
        byte[] bArr = this.f6878a;
        int i = ho0.f8367g;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String a = C2545b.m21175a(bArr);
        if (length < 10000) {
            str = "body";
        } else {
            a = bo0.m6984e(a);
            if (a != null) {
                str = "bodydigest";
            }
            jsonWriter.name("bodylength").value((long) length);
            jsonWriter.endObject();
        }
        jsonWriter.name(str).value(a);
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }
}

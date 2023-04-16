package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

public final /* synthetic */ class eo0 implements go0 {

    /* renamed from: a */
    public final /* synthetic */ String f6291a;

    /* renamed from: b */
    public final /* synthetic */ String f6292b;

    /* renamed from: c */
    public final /* synthetic */ Map f6293c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f6294d;

    public /* synthetic */ eo0(String str, String str2, Map map, byte[] bArr) {
        this.f6291a = str;
        this.f6292b = str2;
        this.f6293c = map;
        this.f6294d = bArr;
    }

    /* renamed from: a */
    public final void mo6237a(JsonWriter jsonWriter) {
        ho0.m10676a(this.f6291a, this.f6292b, this.f6293c, this.f6294d, jsonWriter);
    }
}

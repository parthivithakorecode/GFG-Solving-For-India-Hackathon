package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kr3;
import java.util.Collections;
import java.util.Map;

public abstract class jd3<KeyFormatProtoT extends kr3, KeyT> {

    /* renamed from: a */
    private final Class<KeyFormatProtoT> f9107a;

    public jd3(Class<KeyFormatProtoT> cls) {
        this.f9107a = cls;
    }

    /* renamed from: a */
    public abstract KeyFormatProtoT mo5268a(uo3 uo3);

    /* renamed from: b */
    public final Class<KeyFormatProtoT> mo8450b() {
        return this.f9107a;
    }

    /* renamed from: c */
    public abstract KeyT mo5269c(KeyFormatProtoT keyformatprotot);

    /* renamed from: d */
    public Map<String, id3<KeyFormatProtoT>> mo5270d() {
        return Collections.emptyMap();
    }

    /* renamed from: e */
    public abstract void mo5271e(KeyFormatProtoT keyformatprotot);
}

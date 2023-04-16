package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

public final /* synthetic */ class y12 implements xa3 {

    /* renamed from: a */
    public final /* synthetic */ m22 f17545a;

    public /* synthetic */ y12(m22 m22) {
        this.f17545a = m22;
    }

    /* renamed from: c */
    public final cc3 mo5074c(Object obj) {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        wo0.f16886a.execute(new ct2((InputStream) obj, createPipe[1]));
        return rb3.m16131i(parcelFileDescriptor);
    }
}

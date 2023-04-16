package com.google.android.gms.internal.ads;

public final /* synthetic */ class f44 implements p44 {

    /* renamed from: a */
    public static final /* synthetic */ f44 f6711a = new f44();

    private /* synthetic */ f44() {
    }

    /* renamed from: c */
    public final int mo6791c(Object obj) {
        int i = q44.f13058d;
        String str = ((z34) obj).f18012a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (n13.f11236a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}

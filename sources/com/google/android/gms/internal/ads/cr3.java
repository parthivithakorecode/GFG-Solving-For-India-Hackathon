package com.google.android.gms.internal.ads;

final class cr3 implements fs3 {

    /* renamed from: b */
    private static final ir3 f5504b = new ar3();

    /* renamed from: a */
    private final ir3 f5505a;

    public cr3() {
        ir3 ir3;
        ir3[] ir3Arr = new ir3[2];
        ir3Arr[0] = wp3.m19110c();
        try {
            ir3 = (ir3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            ir3 = f5504b;
        }
        ir3Arr[1] = ir3;
        br3 br3 = new br3(ir3Arr);
        kq3.m12305f(br3, "messageInfoFactory");
        this.f5505a = br3;
    }

    /* renamed from: a */
    private static boolean m7536a(hr3 hr3) {
        return hr3.mo7998c() == 1;
    }

    /* renamed from: d */
    public final <T> es3<T> mo6274d(Class<T> cls) {
        fr3 fr3;
        np3<?> np3;
        ws3<?, ?> ws3;
        yq3 yq3;
        qr3 qr3;
        np3<?> np32;
        ws3<?, ?> b0;
        np3<?> a;
        Class<aq3> cls2 = aq3.class;
        gs3.m9946g(cls);
        hr3 a2 = this.f5505a.mo5438a(cls);
        if (a2.mo7997a()) {
            if (cls2.isAssignableFrom(cls)) {
                b0 = gs3.m9940b();
                a = qp3.m15806b();
            } else {
                b0 = gs3.m9941b0();
                a = qp3.m15805a();
            }
            return or3.m14613k(b0, a, a2.zza());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean a3 = m7536a(a2);
            qr3 = rr3.m16430b();
            yq3 = yq3.m20177e();
            ws3 = gs3.m9940b();
            np3 = a3 ? qp3.m15806b() : null;
            fr3 = gr3.m9905b();
        } else {
            boolean a4 = m7536a(a2);
            qr3 = rr3.m16429a();
            yq3 = yq3.m20176d();
            if (a4) {
                ws3 = gs3.m9941b0();
                np32 = qp3.m15805a();
            } else {
                ws3 = gs3.m9938a();
                np32 = null;
            }
            fr3 = gr3.m9904a();
        }
        return nr3.m14055K(cls, a2, qr3, yq3, ws3, np3, fr3);
    }
}

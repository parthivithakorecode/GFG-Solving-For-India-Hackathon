package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.sc */
public final class C2179sc extends C2106qd {

    /* renamed from: j */
    private static final C2143rd<C2139r9> f14402j = new C2143rd<>();

    /* renamed from: i */
    private final Context f14403i;

    public C2179sc(C1735gc gcVar, String str, String str2, C1842j8 j8Var, int i, int i2, Context context, C1582c8 c8Var) {
        super(gcVar, "iH08ecr5p8p5eQT3/BFJ6jAaJm3eLNoIe2oA7hLZl5P0jAtinrUdPK16lrJGpxBz", "Gvy6wet11FtrNaAWhnvYSI1hOQnkPBTAgqoI9PXuwaM=", j8Var, i, 27);
        this.f14403i = context;
    }

    /* renamed from: d */
    private final String m16758d() {
        try {
            if (this.f13130b.mo7576l() != null) {
                this.f13130b.mo7576l().get();
            }
            C1509a9 c = this.f13130b.mo7568c();
            if (c == null || !c.mo5183k0()) {
                return null;
            }
            return c.mo5188y0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5238a() {
        C2139r9 r9Var;
        int i;
        AtomicReference<C2139r9> a = f14402j.mo10504a(this.f14403i.getPackageName());
        synchronized (a) {
            C2139r9 r9Var2 = a.get();
            if (r9Var2 == null || C1846jc.m11557g(r9Var2.f13547b) || r9Var2.f13547b.equals("E") || r9Var2.f13547b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (!C1846jc.m11557g((String) null)) {
                    i = 5;
                } else {
                    boolean g = C1846jc.m11557g((String) null);
                    i = (!Boolean.FALSE.booleanValue() || !this.f13130b.mo7578p()) ? 3 : 4;
                }
                Boolean valueOf = Boolean.valueOf(i == 3);
                Boolean bool = (Boolean) C2199sw.m17001c().mo8579b(m10.f10291H1);
                String c = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10283G1)).booleanValue() ? mo10760c() : null;
                if (bool.booleanValue() && this.f13130b.mo7578p() && C1846jc.m11557g(c)) {
                    c = m16758d();
                }
                C2139r9 r9Var3 = new C2139r9((String) this.f13134f.invoke((Object) null, new Object[]{this.f14403i, valueOf, c}));
                if (C1846jc.m11557g(r9Var3.f13547b) || r9Var3.f13547b.equals("E")) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String d = m16758d();
                        if (!C1846jc.m11557g(d)) {
                            r9Var3.f13547b = d;
                        }
                    } else if (i2 == 4) {
                        throw null;
                    }
                }
                a.set(r9Var3);
            }
            r9Var = a.get();
        }
        synchronized (this.f13133e) {
            if (r9Var != null) {
                this.f13133e.mo8404l0(r9Var.f13547b);
                this.f13133e.mo8376J(r9Var.f13548c);
                this.f13133e.mo8378L(r9Var.f13549d);
                this.f13133e.mo8391Y(r9Var.f13550e);
                this.f13133e.mo8403k0(r9Var.f13551f);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo10760c() {
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            byte[] i = C1846jc.m11559i((String) C2199sw.m17001c().mo8579b(m10.f10299I1));
            ArrayList arrayList = new ArrayList();
            arrayList.add(instance.generateCertificate(new ByteArrayInputStream(i)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(instance.generateCertificate(new ByteArrayInputStream(C1846jc.m11559i((String) C2199sw.m17001c().mo8579b(m10.f10307J1)))));
            }
            Context context = this.f14403i;
            String packageName = context.getPackageName();
            this.f13130b.mo7575k();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            kc3 E = kc3.m12110E();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new C2180sd(E));
            return (String) E.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.qc */
public final class C2105qc extends C2106qd {
    public C2105qc(C1735gc gcVar, String str, String str2, C1842j8 j8Var, int i, int i2) {
        super(gcVar, "SnrtMYC9+qStj9ZoSAj1DR6mGb7YlLFiZbsMn2F8wpevpQUtlzrwws7lBSZ1KQhS", "3Z4807bJ0KoyYYoQ9dcfmEBolGH5CdxZiQurF1neOqs=", j8Var, i, 49);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5238a() {
        this.f13133e.mo8379M(3);
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.f13134f.invoke((Object) null, new Object[]{this.f13130b.mo7567b()})).booleanValue();
            C1842j8 j8Var = this.f13133e;
            if (true == booleanValue) {
                i = 2;
            }
            j8Var.mo8379M(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}

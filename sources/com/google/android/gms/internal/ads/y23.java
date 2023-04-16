package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p048g2.C2637b;

public final class y23 {

    /* renamed from: a */
    final b33 f17575a;

    /* renamed from: b */
    final boolean f17576b;

    private y23(b33 b33) {
        this.f17575a = b33;
        this.f17576b = b33 != null;
    }

    /* renamed from: b */
    public static y23 m19822b(Context context, String str, String str2) {
        b33 b33;
        try {
            IBinder d = DynamiteModule.m5727e(context, DynamiteModule.f3794b, ModuleDescriptor.MODULE_ID).mo5025d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
            if (d == null) {
                b33 = null;
            } else {
                IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                b33 = queryLocalInterface instanceof b33 ? (b33) queryLocalInterface : new z23(d);
            }
            try {
                b33.mo5662y3(C2637b.m21358Z2(context), str, (String) null);
                Log.i("GASS", "GassClearcutLogger Initialized.");
                return new y23(b33);
            } catch (RemoteException | z13 | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new y23(new c33());
            }
        } catch (Exception e) {
            throw new z13(e);
        } catch (Exception e2) {
            throw new z13(e2);
        }
    }

    /* renamed from: c */
    public static y23 m19823c() {
        c33 c33 = new c33();
        Log.d("GASS", "Clearcut logging disabled");
        return new y23(c33);
    }

    /* renamed from: a */
    public final x23 mo11957a(byte[] bArr) {
        return new x23(this, bArr, (w23) null);
    }
}

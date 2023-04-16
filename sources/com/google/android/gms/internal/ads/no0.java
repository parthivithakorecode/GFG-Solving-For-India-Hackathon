package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

public final class no0 {
    /* renamed from: a */
    public static Context m14003a(Context context) {
        return m14005c(context).mo5024b();
    }

    /* renamed from: b */
    public static <T> T m14004b(Context context, String str, lo0<IBinder, T> lo0) {
        try {
            return lo0.mo5534c(m14005c(context).mo5025d(str));
        } catch (Exception e) {
            throw new mo0(e);
        }
    }

    /* renamed from: c */
    private static DynamiteModule m14005c(Context context) {
        try {
            return DynamiteModule.m5727e(context, DynamiteModule.f3794b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new mo0(e);
        }
    }
}

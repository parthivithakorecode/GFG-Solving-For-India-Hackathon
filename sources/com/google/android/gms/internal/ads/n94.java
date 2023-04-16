package com.google.android.gms.internal.ads;

import android.system.ErrnoException;
import android.system.OsConstants;

final class n94 {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m13806b(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}

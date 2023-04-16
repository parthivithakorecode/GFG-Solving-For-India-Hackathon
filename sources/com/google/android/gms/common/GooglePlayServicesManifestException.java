package com.google.android.gms.common;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: f */
    private final int f3761f;

    public GooglePlayServicesManifestException(int i, @RecentlyNonNull String str) {
        super(str);
        this.f3761f = i;
    }
}

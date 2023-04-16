package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;
import java.util.regex.Pattern;

public final class l93 implements FilenameFilter {

    /* renamed from: a */
    private final Pattern f9949a;

    public l93(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.f9949a = pattern;
    }

    public final boolean accept(File file, String str) {
        return this.f9949a.matcher(str).matches();
    }
}

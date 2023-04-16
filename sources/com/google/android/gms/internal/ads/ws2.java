package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class ws2 {

    /* renamed from: a */
    private final Pattern f16928a;

    public ws2() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) C2199sw.m17001c().mo8579b(m10.f10546l5));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f16928a = pattern;
    }

    /* renamed from: a */
    public final String mo11702a(String str) {
        Pattern pattern = this.f16928a;
        if (!(pattern == null || str == null)) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}

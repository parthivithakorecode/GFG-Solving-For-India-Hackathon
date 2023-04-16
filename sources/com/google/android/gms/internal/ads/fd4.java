package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class fd4 {

    /* renamed from: c */
    private static final Pattern f6804c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f6805a = -1;

    /* renamed from: b */
    public int f6806b = -1;

    /* renamed from: c */
    private final boolean m9120c(String str) {
        Matcher matcher = f6804c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = n13.f11236a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f6805a = parseInt;
            this.f6806b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo7301a() {
        return (this.f6805a == -1 || this.f6806b == -1) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo7302b(c91 c91) {
        for (int i = 0; i < c91.mo6086b(); i++) {
            b81 c = c91.mo6087c(i);
            if (c instanceof pf4) {
                pf4 pf4 = (pf4) c;
                if ("iTunSMPB".equals(pf4.f12659h) && m9120c(pf4.f12660i)) {
                    return true;
                }
            } else if (c instanceof yf4) {
                yf4 yf4 = (yf4) c;
                if ("com.apple.iTunes".equals(yf4.f17726g) && "iTunSMPB".equals(yf4.f17727h) && m9120c(yf4.f17728i)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}

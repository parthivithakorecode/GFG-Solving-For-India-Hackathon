package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.gh */
public final class C1740gh {

    /* renamed from: c */
    public static final C2149rj f7484c = new C1703fh();

    /* renamed from: d */
    private static final Pattern f7485d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f7486a = -1;

    /* renamed from: b */
    public int f7487b = -1;

    /* renamed from: a */
    public final boolean mo7638a() {
        return (this.f7486a == -1 || this.f7487b == -1) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo7639b(C1964mj mjVar) {
        for (int i = 0; i < mjVar.mo9258b(); i++) {
            C1927lj c = mjVar.mo9259c(i);
            if (c instanceof C2112qj) {
                C2112qj qjVar = (C2112qj) c;
                String str = qjVar.f13193h;
                String str2 = qjVar.f13194i;
                if (!"iTunSMPB".equals(str)) {
                    continue;
                } else {
                    Matcher matcher = f7485d.matcher(str2);
                    if (matcher.find()) {
                        try {
                            int parseInt = Integer.parseInt(matcher.group(1), 16);
                            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                            if (parseInt > 0 || parseInt2 > 0) {
                                this.f7486a = parseInt;
                                this.f7487b = parseInt2;
                                return true;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }
}

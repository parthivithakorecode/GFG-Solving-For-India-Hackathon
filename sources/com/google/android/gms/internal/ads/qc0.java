package com.google.android.gms.internal.ads;

import android.net.Uri;

public final class qc0 extends oo0 {

    /* renamed from: b */
    private final pc0 f13124b;

    public qc0(pc0 pc0, String str) {
        super(str);
        this.f13124b = pc0;
    }

    /* renamed from: b */
    public final void mo5345b(String str) {
        String valueOf = String.valueOf(str);
        io0.m11126b(valueOf.length() != 0 ? "LeibnizHttpUrlPinger pinging URL: ".concat(valueOf) : new String("LeibnizHttpUrlPinger pinging URL: "));
        if (!"oda".equals(Uri.parse(str).getScheme())) {
            io0.m11126b("URL does not match oda:// scheme, falling back on HttpUrlPinger");
            super.mo5345b(str);
        }
    }
}

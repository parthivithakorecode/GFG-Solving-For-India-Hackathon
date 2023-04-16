package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qo */
final class C2117qo implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C2154ro f13253f;

    C2117qo(C2154ro roVar) {
        this.f13253f = roVar;
    }

    public final void run() {
        synchronized (this.f13253f.f13770h) {
            if (!this.f13253f.f13771i || !this.f13253f.f13772j) {
                io0.m11126b("App is still foreground");
            } else {
                this.f13253f.f13771i = false;
                io0.m11126b("App went background");
                for (C2191so c : this.f13253f.f13773k) {
                    try {
                        c.mo7380c(false);
                    } catch (Exception e) {
                        io0.m11129e("", e);
                    }
                }
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import javax.annotation.concurrent.GuardedBy;
import p048g2.C2635a;
import p048g2.C2637b;

public final class sg0 implements tg0 {

    /* renamed from: b */
    private static final Object f14430b = new Object();
    @GuardedBy("lock")

    /* renamed from: c */
    static boolean f14431c = false;
    @GuardedBy("lock")

    /* renamed from: d */
    static boolean f14432d = false;

    /* renamed from: a */
    gy2 f14433a;

    /* renamed from: P */
    public final void mo10785P(C2635a aVar) {
        synchronized (f14430b) {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10245B3)).booleanValue()) {
                if (f14431c) {
                    try {
                        this.f14433a.mo7189y0(aVar);
                    } catch (RemoteException | NullPointerException e) {
                        io0.m11133i("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* renamed from: Q */
    public final String mo10786Q(Context context) {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10245B3)).booleanValue()) {
            return null;
        }
        try {
            mo10792a(context);
            String valueOf = String.valueOf(this.f14433a.mo7186e());
            return valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
        } catch (RemoteException | NullPointerException e) {
            io0.m11133i("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* renamed from: R */
    public final void mo10787R(C2635a aVar, View view) {
        synchronized (f14430b) {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10245B3)).booleanValue()) {
                if (f14431c) {
                    try {
                        this.f14433a.mo7188v0(aVar, C2637b.m21358Z2(view));
                    } catch (RemoteException | NullPointerException e) {
                        io0.m11133i("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        com.google.android.gms.internal.ads.io0.m11133i("#007 Could not call remote method.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0023, B:15:0x0045] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p048g2.C2635a mo10788S(java.lang.String r14, android.webkit.WebView r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.google.android.gms.internal.ads.vg0 r19, com.google.android.gms.internal.ads.ug0 r20, java.lang.String r21) {
        /*
            r13 = this;
            java.lang.String r4 = ""
            java.lang.String r5 = "javascript"
            java.lang.String r7 = "Google"
            java.lang.Object r1 = f14430b
            monitor-enter(r1)
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10245B3     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.k10 r2 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r2.mo8579b(r0)     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0047 }
            r11 = 0
            if (r0 == 0) goto L_0x0044
            boolean r0 = f14431c     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0021
            goto L_0x0044
        L_0x0021:
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            r12 = r13
            com.google.android.gms.internal.ads.gy2 r1 = r12.f14433a     // Catch:{ RemoteException -> 0x003d, NullPointerException -> 0x003b }
            g2.a r3 = p048g2.C2637b.m21358Z2(r15)     // Catch:{ RemoteException -> 0x003d, NullPointerException -> 0x003b }
            java.lang.String r8 = r19.toString()     // Catch:{ RemoteException -> 0x003d, NullPointerException -> 0x003b }
            java.lang.String r9 = r20.toString()     // Catch:{ RemoteException -> 0x003d, NullPointerException -> 0x003b }
            r2 = r14
            r6 = r18
            r10 = r21
            g2.a r11 = r1.mo7190z4(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ RemoteException -> 0x003d, NullPointerException -> 0x003b }
            goto L_0x0046
        L_0x003b:
            r0 = move-exception
            goto L_0x003e
        L_0x003d:
            r0 = move-exception
        L_0x003e:
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.io0.m11133i(r1, r0)
            goto L_0x0046
        L_0x0044:
            r12 = r13
            monitor-exit(r1)     // Catch:{ all -> 0x004b }
        L_0x0046:
            return r11
        L_0x0047:
            r0 = move-exception
            r12 = r13
        L_0x0049:
            monitor-exit(r1)     // Catch:{ all -> 0x004b }
            throw r0
        L_0x004b:
            r0 = move-exception
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sg0.mo10788S(java.lang.String, android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.vg0, com.google.android.gms.internal.ads.ug0, java.lang.String):g2.a");
    }

    /* renamed from: T */
    public final C2635a mo10789T(String str, WebView webView, String str2, String str3, String str4, String str5, vg0 vg0, ug0 ug0, String str6) {
        synchronized (f14430b) {
            try {
                if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10245B3)).booleanValue()) {
                    if (f14431c) {
                        try {
                            return this.f14433a.mo7187l3(str, C2637b.m21358Z2(webView), "", "javascript", str4, str5, vg0.toString(), ug0.toString(), str6);
                        } catch (RemoteException | NullPointerException e) {
                            io0.m11133i("#007 Could not call remote method.", e);
                            return null;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    /* renamed from: U */
    public final void mo10790U(C2635a aVar, View view) {
        synchronized (f14430b) {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10245B3)).booleanValue()) {
                if (f14431c) {
                    try {
                        this.f14433a.mo7183F1(aVar, C2637b.m21358Z2(view));
                    } catch (RemoteException | NullPointerException e) {
                        io0.m11133i("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* renamed from: V */
    public final boolean mo10791V(Context context) {
        synchronized (f14430b) {
            if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10245B3)).booleanValue()) {
                return false;
            }
            if (f14431c) {
                return true;
            }
            try {
                mo10792a(context);
                boolean b0 = this.f14433a.mo7185b0(C2637b.m21358Z2(context));
                f14431c = b0;
                return b0;
            } catch (RemoteException e) {
                e = e;
                io0.m11133i("#007 Could not call remote method.", e);
                return false;
            } catch (NullPointerException e2) {
                e = e2;
                io0.m11133i("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10792a(Context context) {
        synchronized (f14430b) {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10245B3)).booleanValue() && !f14432d) {
                try {
                    f14432d = true;
                    this.f14433a = (gy2) no0.m14004b(context, "com.google.android.gms.ads.omid.DynamiteOmid", rg0.f13637a);
                } catch (mo0 e) {
                    io0.m11133i("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void zze(C2635a aVar) {
        synchronized (f14430b) {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10245B3)).booleanValue()) {
                if (f14431c) {
                    try {
                        this.f14433a.mo7184T(aVar);
                    } catch (RemoteException | NullPointerException e) {
                        io0.m11133i("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }
}

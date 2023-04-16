package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;

final class ny3 {

    /* renamed from: a */
    private final Context f11769a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f11770b;

    /* renamed from: c */
    private final iy3 f11771c;

    /* renamed from: d */
    private final AudioManager f11772d;

    /* renamed from: e */
    private ly3 f11773e;

    /* renamed from: f */
    private int f11774f = 3;

    /* renamed from: g */
    private int f11775g;

    /* renamed from: h */
    private boolean f11776h;

    public ny3(Context context, Handler handler, iy3 iy3) {
        Context applicationContext = context.getApplicationContext();
        this.f11769a = applicationContext;
        this.f11770b = handler;
        this.f11771c = iy3;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        wu1.m19203b(audioManager);
        this.f11772d = audioManager;
        this.f11775g = m14183g(audioManager, 3);
        this.f11776h = m14185i(audioManager, this.f11774f);
        ly3 ly3 = new ly3(this, (ky3) null);
        try {
            applicationContext.registerReceiver(ly3, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f11773e = ly3;
        } catch (RuntimeException e) {
            oc2.m14400b("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* renamed from: g */
    private static int m14183g(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i);
            oc2.m14400b("StreamVolumeManager", sb.toString(), e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m14184h() {
        int g = m14183g(this.f11772d, this.f11774f);
        boolean i = m14185i(this.f11772d, this.f11774f);
        if (this.f11775g != g || this.f11776h != i) {
            this.f11775g = g;
            this.f11776h = i;
            Iterator it = ((dy3) this.f11771c).f5989f.f7908h.iterator();
            while (it.hasNext()) {
                ((r80) it.next()).mo10223f(g, i);
            }
        }
    }

    /* renamed from: i */
    private static boolean m14185i(AudioManager audioManager, int i) {
        return n13.f11236a >= 23 ? audioManager.isStreamMute(i) : m14183g(audioManager, i) == 0;
    }

    /* renamed from: a */
    public final int mo9612a() {
        return this.f11772d.getStreamMaxVolume(this.f11774f);
    }

    /* renamed from: b */
    public final int mo9613b() {
        if (n13.f11236a >= 28) {
            return this.f11772d.getStreamMinVolume(this.f11774f);
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo9614e() {
        ly3 ly3 = this.f11773e;
        if (ly3 != null) {
            try {
                this.f11769a.unregisterReceiver(ly3);
            } catch (RuntimeException e) {
                oc2.m14400b("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f11773e = null;
        }
    }

    /* renamed from: f */
    public final void mo9615f(int i) {
        if (this.f11774f != 3) {
            this.f11774f = 3;
            m14184h();
            dy3 dy3 = (dy3) this.f11771c;
            r34 f0 = gy3.m10108S(dy3.f5989f.f7912l);
            if (!f0.equals(dy3.f5989f.f7900F)) {
                dy3.f5989f.f7900F = f0;
                Iterator it = dy3.f5989f.f7908h.iterator();
                while (it.hasNext()) {
                    ((r80) it.next()).mo10225u(f0);
                }
            }
        }
    }
}

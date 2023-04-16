package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import p054h1.C2694t;
import p069j1.C3202r1;

public final class gy1 implements SensorEventListener {
    @Nullable

    /* renamed from: a */
    private final SensorManager f7885a;
    @Nullable

    /* renamed from: b */
    private final Sensor f7886b;

    /* renamed from: c */
    private float f7887c = 0.0f;

    /* renamed from: d */
    private Float f7888d = Float.valueOf(0.0f);

    /* renamed from: e */
    private long f7889e = C2694t.m21592a().mo12462a();

    /* renamed from: f */
    private int f7890f = 0;

    /* renamed from: g */
    private boolean f7891g = false;

    /* renamed from: h */
    private boolean f7892h = false;
    @Nullable

    /* renamed from: i */
    private fy1 f7893i = null;
    @GuardedBy("this")

    /* renamed from: j */
    private boolean f7894j = false;

    gy1(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f7885a = sensorManager;
        if (sensorManager != null) {
            this.f7886b = sensorManager.getDefaultSensor(4);
        } else {
            this.f7886b = null;
        }
    }

    /* renamed from: a */
    public final void mo7733a() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (!(!this.f7894j || (sensorManager = this.f7885a) == null || (sensor = this.f7886b) == null)) {
                sensorManager.unregisterListener(this, sensor);
                this.f7894j = false;
                C3202r1.m24015k("Stopped listening for flick gestures.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r3.f7885a == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r3.f7886b != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        com.google.android.gms.internal.ads.io0.m11131g("Flick detection failed to initialize. Failed to obtain gyroscope.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7734b() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10312J6     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x003e }
            java.lang.Object r0 = r1.mo8579b(r0)     // Catch:{ all -> 0x003e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            return
        L_0x0015:
            boolean r0 = r3.f7894j     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x002d
            android.hardware.SensorManager r0 = r3.f7885a     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x002d
            android.hardware.Sensor r1 = r3.f7886b     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x002d
            r2 = 2
            r0.registerListener(r3, r1, r2)     // Catch:{ all -> 0x003e }
            r0 = 1
            r3.f7894j = r0     // Catch:{ all -> 0x003e }
            java.lang.String r0 = "Listening for flick gestures."
            p069j1.C3202r1.m24015k(r0)     // Catch:{ all -> 0x003e }
        L_0x002d:
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            android.hardware.SensorManager r0 = r3.f7885a
            if (r0 == 0) goto L_0x0038
            android.hardware.Sensor r0 = r3.f7886b
            if (r0 != 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            return
        L_0x0038:
            java.lang.String r0 = "Flick detection failed to initialize. Failed to obtain gyroscope."
            com.google.android.gms.internal.ads.io0.m11131g(r0)
            return
        L_0x003e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gy1.mo7734b():void");
    }

    /* renamed from: c */
    public final void mo7735c(fy1 fy1) {
        this.f7893i = fy1;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10312J6)).booleanValue()) {
            long a = C2694t.m21592a().mo12462a();
            if (this.f7889e + ((long) ((Integer) C2199sw.m17001c().mo8579b(m10.f10328L6)).intValue()) < a) {
                this.f7890f = 0;
                this.f7889e = a;
                this.f7891g = false;
                this.f7892h = false;
                this.f7887c = this.f7888d.floatValue();
            }
            Float valueOf = Float.valueOf(this.f7888d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f7888d = valueOf;
            float floatValue = valueOf.floatValue();
            float f = this.f7887c;
            e10 e10 = m10.f10320K6;
            if (floatValue > f + ((Float) C2199sw.m17001c().mo8579b(e10)).floatValue()) {
                this.f7887c = this.f7888d.floatValue();
                this.f7892h = true;
            } else if (this.f7888d.floatValue() < this.f7887c - ((Float) C2199sw.m17001c().mo8579b(e10)).floatValue()) {
                this.f7887c = this.f7888d.floatValue();
                this.f7891g = true;
            }
            if (this.f7888d.isInfinite()) {
                this.f7888d = Float.valueOf(0.0f);
                this.f7887c = 0.0f;
            }
            if (this.f7891g && this.f7892h) {
                C3202r1.m24015k("Flick detected.");
                this.f7889e = a;
                int i = this.f7890f + 1;
                this.f7890f = i;
                this.f7891g = false;
                this.f7892h = false;
                fy1 fy1 = this.f7893i;
                if (fy1 != null) {
                    if (i == ((Integer) C2199sw.m17001c().mo8579b(m10.f10336M6)).intValue()) {
                        uy1 uy1 = (uy1) fy1;
                        uy1.mo11336g(new sy1(uy1), ty1.GESTURE);
                    }
                }
            }
        }
    }
}

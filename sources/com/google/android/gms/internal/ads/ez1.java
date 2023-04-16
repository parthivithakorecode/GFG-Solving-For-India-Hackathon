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

public final class ez1 implements SensorEventListener {

    /* renamed from: a */
    private final Context f6628a;
    @Nullable

    /* renamed from: b */
    private SensorManager f6629b;

    /* renamed from: c */
    private Sensor f6630c;

    /* renamed from: d */
    private long f6631d;

    /* renamed from: e */
    private int f6632e;

    /* renamed from: f */
    private dz1 f6633f;
    @GuardedBy("this")

    /* renamed from: g */
    private boolean f6634g;

    ez1(Context context) {
        this.f6628a = context;
    }

    /* renamed from: a */
    public final void mo7199a() {
        synchronized (this) {
            if (this.f6634g) {
                SensorManager sensorManager = this.f6629b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.f6630c);
                    C3202r1.m24015k("Stopped listening for shake gestures.");
                }
                this.f6634g = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7200b() {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10272E6     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r1.mo8579b(r0)     // Catch:{ all -> 0x006a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x006a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            return
        L_0x0015:
            android.hardware.SensorManager r0 = r6.f6629b     // Catch:{ all -> 0x006a }
            r1 = 1
            if (r0 != 0) goto L_0x0035
            android.content.Context r0 = r6.f6628a     // Catch:{ all -> 0x006a }
            java.lang.String r2 = "sensor"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ all -> 0x006a }
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0     // Catch:{ all -> 0x006a }
            r6.f6629b = r0     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "Shake detection failed to initialize. Failed to obtain accelerometer."
            com.google.android.gms.internal.ads.io0.m11131g(r0)     // Catch:{ all -> 0x006a }
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            return
        L_0x002f:
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)     // Catch:{ all -> 0x006a }
            r6.f6630c = r0     // Catch:{ all -> 0x006a }
        L_0x0035:
            boolean r0 = r6.f6634g     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0068
            android.hardware.SensorManager r0 = r6.f6629b     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0068
            android.hardware.Sensor r2 = r6.f6630c     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x0068
            r3 = 2
            r0.registerListener(r6, r2, r3)     // Catch:{ all -> 0x006a }
            e2.d r0 = p054h1.C2694t.m21592a()     // Catch:{ all -> 0x006a }
            long r2 = r0.mo12462a()     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.e10<java.lang.Integer> r0 = com.google.android.gms.internal.ads.m10.f10288G6     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.k10 r4 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r4.mo8579b(r0)     // Catch:{ all -> 0x006a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x006a }
            int r0 = r0.intValue()     // Catch:{ all -> 0x006a }
            long r4 = (long) r0     // Catch:{ all -> 0x006a }
            long r2 = r2 - r4
            r6.f6631d = r2     // Catch:{ all -> 0x006a }
            r6.f6634g = r1     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "Listening for shake gestures."
            p069j1.C3202r1.m24015k(r0)     // Catch:{ all -> 0x006a }
        L_0x0068:
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            return
        L_0x006a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ez1.mo7200b():void");
    }

    /* renamed from: c */
    public final void mo7201c(dz1 dz1) {
        this.f6633f = dz1;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10272E6)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((double) ((f * f) + (f2 * f2) + (f3 * f3)))) >= ((Float) C2199sw.m17001c().mo8579b(m10.f10280F6)).floatValue()) {
                long a = C2694t.m21592a().mo12462a();
                if (this.f6631d + ((long) ((Integer) C2199sw.m17001c().mo8579b(m10.f10288G6)).intValue()) <= a) {
                    if (this.f6631d + ((long) ((Integer) C2199sw.m17001c().mo8579b(m10.f10296H6)).intValue()) < a) {
                        this.f6632e = 0;
                    }
                    C3202r1.m24015k("Shake detected.");
                    this.f6631d = a;
                    int i = this.f6632e + 1;
                    this.f6632e = i;
                    dz1 dz1 = this.f6633f;
                    if (dz1 != null) {
                        if (i == ((Integer) C2199sw.m17001c().mo8579b(m10.f10304I6)).intValue()) {
                            uy1 uy1 = (uy1) dz1;
                            uy1.mo11336g(new ry1(uy1), ty1.GESTURE);
                        }
                    }
                }
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import javax.annotation.concurrent.GuardedBy;

final class qq0 implements SensorEventListener {

    /* renamed from: a */
    private final SensorManager f13264a;

    /* renamed from: b */
    private final Object f13265b = new Object();

    /* renamed from: c */
    private final Display f13266c;

    /* renamed from: d */
    private final float[] f13267d = new float[9];

    /* renamed from: e */
    private final float[] f13268e = new float[9];
    @GuardedBy("sensorThreadLock")

    /* renamed from: f */
    private float[] f13269f;

    /* renamed from: g */
    private Handler f13270g;

    /* renamed from: h */
    private pq0 f13271h;

    qq0(Context context) {
        this.f13264a = (SensorManager) context.getSystemService("sensor");
        this.f13266c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10341a(pq0 pq0) {
        this.f13271h = pq0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10342b() {
        if (this.f13270g == null) {
            Sensor defaultSensor = this.f13264a.getDefaultSensor(11);
            if (defaultSensor == null) {
                io0.m11128d("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            s33 s33 = new s33(handlerThread.getLooper());
            this.f13270g = s33;
            if (!this.f13264a.registerListener(this, defaultSensor, 0, s33)) {
                io0.m11128d("SensorManager.registerListener failed.");
                mo10343c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo10343c() {
        if (this.f13270g != null) {
            this.f13264a.unregisterListener(this);
            this.f13270g.post(new oq0(this));
            this.f13270g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo10344d(float[] fArr) {
        synchronized (this.f13265b) {
            float[] fArr2 = this.f13269f;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f13265b) {
                if (this.f13269f == null) {
                    this.f13269f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f13267d, fArr);
            int rotation = this.f13266c.getRotation();
            if (rotation == 1) {
                SensorManager.remapCoordinateSystem(this.f13267d, 2, 129, this.f13268e);
            } else if (rotation == 2) {
                SensorManager.remapCoordinateSystem(this.f13267d, 129, 130, this.f13268e);
            } else if (rotation != 3) {
                System.arraycopy(this.f13267d, 0, this.f13268e, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(this.f13267d, 130, 1, this.f13268e);
            }
            float[] fArr2 = this.f13268e;
            float f = fArr2[1];
            fArr2[1] = fArr2[3];
            fArr2[3] = f;
            float f2 = fArr2[2];
            fArr2[2] = fArr2[6];
            fArr2[6] = f2;
            float f3 = fArr2[5];
            fArr2[5] = fArr2[7];
            fArr2[7] = f3;
            synchronized (this.f13265b) {
                System.arraycopy(this.f13268e, 0, this.f13269f, 0, 9);
            }
            pq0 pq0 = this.f13271h;
            if (pq0 != null) {
                pq0.zza();
            }
        }
    }
}

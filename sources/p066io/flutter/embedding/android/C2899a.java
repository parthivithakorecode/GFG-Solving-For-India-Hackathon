package p066io.flutter.embedding.android;

import android.graphics.Matrix;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import p168y3.C4462a;

/* renamed from: io.flutter.embedding.android.a */
public class C2899a {

    /* renamed from: e */
    private static final Matrix f19657e = new Matrix();

    /* renamed from: a */
    private final C4462a f19658a;

    /* renamed from: b */
    private final C2951u f19659b;

    /* renamed from: c */
    private final boolean f19660c;

    /* renamed from: d */
    private final Map<Integer, float[]> f19661d = new HashMap();

    public C2899a(C4462a aVar, boolean z) {
        this.f19658a = aVar;
        this.f19659b = C2951u.m23010a();
        this.f19660c = z;
    }

    /* renamed from: a */
    private void m22780a(MotionEvent motionEvent, int i, int i2, int i3, Matrix matrix, ByteBuffer byteBuffer) {
        long j;
        long j2;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        InputDevice.MotionRange motionRange;
        MotionEvent motionEvent2 = motionEvent;
        int i4 = i;
        int i5 = i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (i5 != -1) {
            long d6 = this.f19660c ? this.f19659b.mo13401c(motionEvent2).mo13402d() : 0;
            int d7 = m22783d(motionEvent.getToolType(i));
            float[] fArr = {motionEvent.getX(i), motionEvent.getY(i)};
            matrix.mapPoints(fArr);
            if (d7 == 1) {
                j = (long) (motionEvent.getButtonState() & 31);
                if (j == 0 && motionEvent.getSource() == 8194 && i5 == 4) {
                    this.f19661d.put(Integer.valueOf(motionEvent.getPointerId(i)), fArr);
                }
            } else {
                j = d7 == 2 ? (long) ((motionEvent.getButtonState() >> 4) & 15) : 0;
            }
            boolean containsKey = this.f19661d.containsKey(Integer.valueOf(motionEvent.getPointerId(i)));
            int i6 = motionEvent.getActionMasked() == 8 ? 1 : 0;
            byteBuffer2.putLong(d6);
            byteBuffer2.putLong(motionEvent.getEventTime() * 1000);
            if (containsKey) {
                byteBuffer2.putLong((long) m22782c(i5));
                j2 = 4;
            } else {
                byteBuffer2.putLong((long) i5);
                j2 = (long) d7;
            }
            byteBuffer2.putLong(j2);
            byteBuffer2.putLong((long) i6);
            byteBuffer2.putLong((long) motionEvent.getPointerId(i));
            byteBuffer2.putLong(0);
            if (containsKey) {
                float[] fArr2 = this.f19661d.get(Integer.valueOf(motionEvent.getPointerId(i)));
                byteBuffer2.putDouble((double) fArr2[0]);
                byteBuffer2.putDouble((double) fArr2[1]);
            } else {
                byteBuffer2.putDouble((double) fArr[0]);
                byteBuffer2.putDouble((double) fArr[1]);
            }
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putLong(j);
            byteBuffer2.putLong(0);
            byteBuffer2.putLong(0);
            byteBuffer2.putDouble((double) motionEvent.getPressure(i));
            if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
                d2 = 1.0d;
                d = 0.0d;
            } else {
                d = (double) motionRange.getMin();
                d2 = (double) motionRange.getMax();
            }
            byteBuffer2.putDouble(d);
            byteBuffer2.putDouble(d2);
            if (d7 == 2) {
                byteBuffer2.putDouble((double) motionEvent2.getAxisValue(24, i4));
                d3 = 0.0d;
            } else {
                d3 = 0.0d;
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble(d3);
            byteBuffer2.putDouble((double) motionEvent.getSize(i));
            byteBuffer2.putDouble((double) motionEvent.getToolMajor(i));
            byteBuffer2.putDouble((double) motionEvent.getToolMinor(i));
            byteBuffer2.putDouble(d3);
            byteBuffer2.putDouble(d3);
            byteBuffer2.putDouble((double) motionEvent2.getAxisValue(8, i4));
            if (d7 == 2) {
                byteBuffer2.putDouble((double) motionEvent2.getAxisValue(25, i4));
            } else {
                byteBuffer2.putDouble(d3);
            }
            byteBuffer2.putLong((long) i3);
            if (i6 == 1) {
                byteBuffer2.putDouble((double) (-motionEvent2.getAxisValue(10)));
                d4 = (double) (-motionEvent2.getAxisValue(9));
            } else {
                d4 = 0.0d;
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble(d4);
            if (containsKey) {
                float[] fArr3 = this.f19661d.get(Integer.valueOf(motionEvent.getPointerId(i)));
                byteBuffer2.putDouble((double) (fArr[0] - fArr3[0]));
                byteBuffer2.putDouble((double) (fArr[1] - fArr3[1]));
                d5 = 0.0d;
            } else {
                d5 = 0.0d;
                byteBuffer2.putDouble(0.0d);
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble(d5);
            byteBuffer2.putDouble(d5);
            byteBuffer2.putDouble(1.0d);
            byteBuffer2.putDouble(d5);
            if (containsKey && m22782c(i5) == 9) {
                this.f19661d.remove(Integer.valueOf(motionEvent.getPointerId(i)));
            }
        }
    }

    /* renamed from: b */
    private int m22781b(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 6;
        }
        if (i == 5) {
            return 4;
        }
        if (i == 6) {
            return 6;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 7) {
            return 3;
        }
        if (i == 3) {
            return 0;
        }
        return i == 8 ? 3 : -1;
    }

    /* renamed from: c */
    private int m22782c(int i) {
        if (i == 4) {
            return 7;
        }
        if (i == 5) {
            return 8;
        }
        if (i == 6 || i == 0) {
            return 9;
        }
        throw new AssertionError("Unexpected pointer change");
    }

    /* renamed from: d */
    private int m22783d(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return i != 4 ? 5 : 3;
        }
        return 1;
    }

    /* renamed from: e */
    public boolean mo13236e(MotionEvent motionEvent) {
        boolean z = Build.VERSION.SDK_INT >= 18 && motionEvent.isFromSource(2);
        boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!z || !z2) {
            return false;
        }
        int b = m22781b(motionEvent.getActionMasked());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 35 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        m22780a(motionEvent, motionEvent.getActionIndex(), b, 0, f19657e, allocateDirect);
        if (allocateDirect.position() % 280 == 0) {
            this.f19658a.mo16103i(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary.");
    }

    /* renamed from: f */
    public boolean mo13237f(MotionEvent motionEvent) {
        return mo13238g(motionEvent, f19657e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo13238g(android.view.MotionEvent r13, android.graphics.Matrix r14) {
        /*
            r12 = this;
            int r0 = r13.getPointerCount()
            int r1 = r0 * 35
            int r1 = r1 * 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r1.order(r2)
            int r2 = r13.getActionMasked()
            int r3 = r13.getActionMasked()
            int r9 = r12.m22781b(r3)
            r3 = 0
            r10 = 1
            if (r2 == 0) goto L_0x0027
            r4 = 5
            if (r2 != r4) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r4 = r3
            goto L_0x0028
        L_0x0027:
            r4 = r10
        L_0x0028:
            if (r4 != 0) goto L_0x0031
            if (r2 == r10) goto L_0x002f
            r5 = 6
            if (r2 != r5) goto L_0x0031
        L_0x002f:
            r2 = r10
            goto L_0x0032
        L_0x0031:
            r2 = r3
        L_0x0032:
            if (r4 == 0) goto L_0x0042
        L_0x0034:
            int r4 = r13.getActionIndex()
            r6 = 0
            r2 = r12
            r3 = r13
            r5 = r9
            r7 = r14
            r8 = r1
            r2.m22780a(r3, r4, r5, r6, r7, r8)
            goto L_0x006f
        L_0x0042:
            r11 = r3
            if (r2 == 0) goto L_0x0060
        L_0x0045:
            if (r11 >= r0) goto L_0x0034
            int r2 = r13.getActionIndex()
            if (r11 == r2) goto L_0x005d
            int r2 = r13.getToolType(r11)
            if (r2 != r10) goto L_0x005d
            r5 = 5
            r6 = 1
            r2 = r12
            r3 = r13
            r4 = r11
            r7 = r14
            r8 = r1
            r2.m22780a(r3, r4, r5, r6, r7, r8)
        L_0x005d:
            int r11 = r11 + 1
            goto L_0x0045
        L_0x0060:
            if (r11 >= r0) goto L_0x006f
            r6 = 0
            r2 = r12
            r3 = r13
            r4 = r11
            r5 = r9
            r7 = r14
            r8 = r1
            r2.m22780a(r3, r4, r5, r6, r7, r8)
            int r11 = r11 + 1
            goto L_0x0060
        L_0x006f:
            int r13 = r1.position()
            int r13 = r13 % 280
            if (r13 != 0) goto L_0x0081
            y3.a r13 = r12.f19658a
            int r14 = r1.position()
            r13.mo16103i(r1, r14)
            return r10
        L_0x0081:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            java.lang.String r14 = "Packet position is not on field boundary"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.embedding.android.C2899a.mo13238g(android.view.MotionEvent, android.graphics.Matrix):boolean");
    }
}

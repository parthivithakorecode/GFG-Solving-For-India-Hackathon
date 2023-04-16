package p164y;

import android.view.animation.Interpolator;

/* renamed from: y.d */
abstract class C4361d implements Interpolator {

    /* renamed from: a */
    private final float[] f22707a;

    /* renamed from: b */
    private final float f22708b;

    protected C4361d(float[] fArr) {
        this.f22707a = fArr;
        this.f22708b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f22707a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f22708b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f22707a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}

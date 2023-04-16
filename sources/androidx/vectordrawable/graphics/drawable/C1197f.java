package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.core.content.res.C0636k;
import androidx.core.graphics.C0643d;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.vectordrawable.graphics.drawable.f */
public class C1197f implements Interpolator {

    /* renamed from: a */
    private float[] f3214a;

    /* renamed from: b */
    private float[] f3215b;

    public C1197f(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public C1197f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray k = C0636k.m2600k(resources, theme, attributeSet, C1188a.f3198l);
        m4816d(k, xmlPullParser);
        k.recycle();
    }

    /* renamed from: a */
    private void m4813a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m4814b(path);
    }

    /* renamed from: b */
    private void m4814b(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f3214a = new float[min];
            this.f3215b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.f3214a[i2] = fArr[0];
                this.f3215b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f3214a[0])) <= 1.0E-5d && ((double) Math.abs(this.f3215b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f3214a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f3215b[i3] - 1.0f)) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.f3214a;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.f3214a[0]);
            sb.append(",");
            sb.append(this.f3215b[0]);
            sb.append(" end:");
            int i6 = min - 1;
            sb.append(this.f3214a[i6]);
            sb.append(",");
            sb.append(this.f3215b[i6]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    /* renamed from: c */
    private void m4815c(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m4814b(path);
    }

    /* renamed from: d */
    private void m4816d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C0636k.m2599j(xmlPullParser, "pathData")) {
            String i = C0636k.m2598i(typedArray, xmlPullParser, "pathData", 4);
            Path e = C0643d.m2632e(i);
            if (e != null) {
                m4814b(e);
                return;
            }
            throw new InflateException("The path is null, which is created from " + i);
        } else if (!C0636k.m2599j(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C0636k.m2599j(xmlPullParser, "controlY1")) {
            float f = C0636k.m2595f(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float f2 = C0636k.m2595f(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean j = C0636k.m2599j(xmlPullParser, "controlX2");
            if (j != C0636k.m2599j(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!j) {
                m4815c(f, f2);
            } else {
                m4813a(f, f2, C0636k.m2595f(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C0636k.m2595f(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f3214a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f3214a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f3214a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f3215b[i];
        }
        float[] fArr2 = this.f3215b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }
}

package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.C0614d;
import androidx.core.content.res.C0636k;
import androidx.core.graphics.C0643d;
import androidx.core.graphics.drawable.C0650a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p102o.C3801a;

/* renamed from: androidx.vectordrawable.graphics.drawable.h */
public class C1199h extends C1198g {

    /* renamed from: p */
    static final PorterDuff.Mode f3217p = PorterDuff.Mode.SRC_IN;

    /* renamed from: g */
    private C1207h f3218g;

    /* renamed from: h */
    private PorterDuffColorFilter f3219h;

    /* renamed from: i */
    private ColorFilter f3220i;

    /* renamed from: j */
    private boolean f3221j;

    /* renamed from: k */
    private boolean f3222k;

    /* renamed from: l */
    private Drawable.ConstantState f3223l;

    /* renamed from: m */
    private final float[] f3224m;

    /* renamed from: n */
    private final Matrix f3225n;

    /* renamed from: o */
    private final Rect f3226o;

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$b */
    private static class C1201b extends C1205f {
        C1201b() {
        }

        C1201b(C1201b bVar) {
            super(bVar);
        }

        /* renamed from: f */
        private void m4827f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3253b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f3252a = C0643d.m2631d(string2);
            }
            this.f3254c = C0636k.m2596g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        /* renamed from: c */
        public boolean mo4093c() {
            return true;
        }

        /* renamed from: e */
        public void mo4094e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0636k.m2599j(xmlPullParser, "pathData")) {
                TypedArray k = C0636k.m2600k(resources, theme, attributeSet, C1188a.f3190d);
                m4827f(k, xmlPullParser);
                k.recycle();
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$c */
    private static class C1202c extends C1205f {

        /* renamed from: e */
        private int[] f3227e;

        /* renamed from: f */
        C0614d f3228f;

        /* renamed from: g */
        float f3229g = 0.0f;

        /* renamed from: h */
        C0614d f3230h;

        /* renamed from: i */
        float f3231i = 1.0f;

        /* renamed from: j */
        float f3232j = 1.0f;

        /* renamed from: k */
        float f3233k = 0.0f;

        /* renamed from: l */
        float f3234l = 1.0f;

        /* renamed from: m */
        float f3235m = 0.0f;

        /* renamed from: n */
        Paint.Cap f3236n = Paint.Cap.BUTT;

        /* renamed from: o */
        Paint.Join f3237o = Paint.Join.MITER;

        /* renamed from: p */
        float f3238p = 4.0f;

        C1202c() {
        }

        C1202c(C1202c cVar) {
            super(cVar);
            this.f3227e = cVar.f3227e;
            this.f3228f = cVar.f3228f;
            this.f3229g = cVar.f3229g;
            this.f3231i = cVar.f3231i;
            this.f3230h = cVar.f3230h;
            this.f3254c = cVar.f3254c;
            this.f3232j = cVar.f3232j;
            this.f3233k = cVar.f3233k;
            this.f3234l = cVar.f3234l;
            this.f3235m = cVar.f3235m;
            this.f3236n = cVar.f3236n;
            this.f3237o = cVar.f3237o;
            this.f3238p = cVar.f3238p;
        }

        /* renamed from: e */
        private Paint.Cap m4830e(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: f */
        private Paint.Join m4831f(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: h */
        private void m4832h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f3227e = null;
            if (C0636k.m2599j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f3253b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f3252a = C0643d.m2631d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f3230h = C0636k.m2594e(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f3232j = C0636k.m2595f(typedArray, xmlPullParser, "fillAlpha", 12, this.f3232j);
                this.f3236n = m4830e(C0636k.m2596g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f3236n);
                this.f3237o = m4831f(C0636k.m2596g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f3237o);
                this.f3238p = C0636k.m2595f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f3238p);
                this.f3228f = C0636k.m2594e(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f3231i = C0636k.m2595f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f3231i);
                this.f3229g = C0636k.m2595f(typedArray, xmlPullParser, "strokeWidth", 4, this.f3229g);
                this.f3234l = C0636k.m2595f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f3234l);
                this.f3235m = C0636k.m2595f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f3235m);
                this.f3233k = C0636k.m2595f(typedArray, xmlPullParser, "trimPathStart", 5, this.f3233k);
                this.f3254c = C0636k.m2596g(typedArray, xmlPullParser, "fillType", 13, this.f3254c);
            }
        }

        /* renamed from: a */
        public boolean mo4095a() {
            return this.f3230h.mo2559i() || this.f3228f.mo2559i();
        }

        /* renamed from: b */
        public boolean mo4096b(int[] iArr) {
            return this.f3228f.mo2560j(iArr) | this.f3230h.mo2560j(iArr);
        }

        /* renamed from: g */
        public void mo4097g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = C0636k.m2600k(resources, theme, attributeSet, C1188a.f3189c);
            m4832h(k, xmlPullParser, theme);
            k.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f3232j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f3230h.mo2556e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f3231i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f3228f.mo2556e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f3229g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f3234l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f3235m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f3233k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.f3232j = f;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.f3230h.mo2561k(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.f3231i = f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.f3228f.mo2561k(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.f3229g = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.f3234l = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.f3235m = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.f3233k = f;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$d */
    private static class C1203d extends C1204e {

        /* renamed from: a */
        final Matrix f3239a;

        /* renamed from: b */
        final ArrayList<C1204e> f3240b;

        /* renamed from: c */
        float f3241c;

        /* renamed from: d */
        private float f3242d;

        /* renamed from: e */
        private float f3243e;

        /* renamed from: f */
        private float f3244f;

        /* renamed from: g */
        private float f3245g;

        /* renamed from: h */
        private float f3246h;

        /* renamed from: i */
        private float f3247i;

        /* renamed from: j */
        final Matrix f3248j;

        /* renamed from: k */
        int f3249k;

        /* renamed from: l */
        private int[] f3250l;

        /* renamed from: m */
        private String f3251m;

        public C1203d() {
            super();
            this.f3239a = new Matrix();
            this.f3240b = new ArrayList<>();
            this.f3241c = 0.0f;
            this.f3242d = 0.0f;
            this.f3243e = 0.0f;
            this.f3244f = 1.0f;
            this.f3245g = 1.0f;
            this.f3246h = 0.0f;
            this.f3247i = 0.0f;
            this.f3248j = new Matrix();
            this.f3251m = null;
        }

        public C1203d(C1203d dVar, C3801a<String, Object> aVar) {
            super();
            C1205f fVar;
            this.f3239a = new Matrix();
            this.f3240b = new ArrayList<>();
            this.f3241c = 0.0f;
            this.f3242d = 0.0f;
            this.f3243e = 0.0f;
            this.f3244f = 1.0f;
            this.f3245g = 1.0f;
            this.f3246h = 0.0f;
            this.f3247i = 0.0f;
            Matrix matrix = new Matrix();
            this.f3248j = matrix;
            this.f3251m = null;
            this.f3241c = dVar.f3241c;
            this.f3242d = dVar.f3242d;
            this.f3243e = dVar.f3243e;
            this.f3244f = dVar.f3244f;
            this.f3245g = dVar.f3245g;
            this.f3246h = dVar.f3246h;
            this.f3247i = dVar.f3247i;
            this.f3250l = dVar.f3250l;
            String str = dVar.f3251m;
            this.f3251m = str;
            this.f3249k = dVar.f3249k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f3248j);
            ArrayList<C1204e> arrayList = dVar.f3240b;
            for (int i = 0; i < arrayList.size(); i++) {
                C1204e eVar = arrayList.get(i);
                if (eVar instanceof C1203d) {
                    this.f3240b.add(new C1203d((C1203d) eVar, aVar));
                } else {
                    if (eVar instanceof C1202c) {
                        fVar = new C1202c((C1202c) eVar);
                    } else if (eVar instanceof C1201b) {
                        fVar = new C1201b((C1201b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f3240b.add(fVar);
                    String str2 = fVar.f3253b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m4836d() {
            this.f3248j.reset();
            this.f3248j.postTranslate(-this.f3242d, -this.f3243e);
            this.f3248j.postScale(this.f3244f, this.f3245g);
            this.f3248j.postRotate(this.f3241c, 0.0f, 0.0f);
            this.f3248j.postTranslate(this.f3246h + this.f3242d, this.f3247i + this.f3243e);
        }

        /* renamed from: e */
        private void m4837e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f3250l = null;
            this.f3241c = C0636k.m2595f(typedArray, xmlPullParser, "rotation", 5, this.f3241c);
            this.f3242d = typedArray.getFloat(1, this.f3242d);
            this.f3243e = typedArray.getFloat(2, this.f3243e);
            this.f3244f = C0636k.m2595f(typedArray, xmlPullParser, "scaleX", 3, this.f3244f);
            this.f3245g = C0636k.m2595f(typedArray, xmlPullParser, "scaleY", 4, this.f3245g);
            this.f3246h = C0636k.m2595f(typedArray, xmlPullParser, "translateX", 6, this.f3246h);
            this.f3247i = C0636k.m2595f(typedArray, xmlPullParser, "translateY", 7, this.f3247i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3251m = string;
            }
            m4836d();
        }

        /* renamed from: a */
        public boolean mo4095a() {
            for (int i = 0; i < this.f3240b.size(); i++) {
                if (this.f3240b.get(i).mo4095a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo4096b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f3240b.size(); i++) {
                z |= this.f3240b.get(i).mo4096b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void mo4114c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = C0636k.m2600k(resources, theme, attributeSet, C1188a.f3188b);
            m4837e(k, xmlPullParser);
            k.recycle();
        }

        public String getGroupName() {
            return this.f3251m;
        }

        public Matrix getLocalMatrix() {
            return this.f3248j;
        }

        public float getPivotX() {
            return this.f3242d;
        }

        public float getPivotY() {
            return this.f3243e;
        }

        public float getRotation() {
            return this.f3241c;
        }

        public float getScaleX() {
            return this.f3244f;
        }

        public float getScaleY() {
            return this.f3245g;
        }

        public float getTranslateX() {
            return this.f3246h;
        }

        public float getTranslateY() {
            return this.f3247i;
        }

        public void setPivotX(float f) {
            if (f != this.f3242d) {
                this.f3242d = f;
                m4836d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f3243e) {
                this.f3243e = f;
                m4836d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f3241c) {
                this.f3241c = f;
                m4836d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f3244f) {
                this.f3244f = f;
                m4836d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f3245g) {
                this.f3245g = f;
                m4836d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f3246h) {
                this.f3246h = f;
                m4836d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f3247i) {
                this.f3247i = f;
                m4836d();
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$e */
    private static abstract class C1204e {
        private C1204e() {
        }

        /* renamed from: a */
        public boolean mo4095a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo4096b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$f */
    private static abstract class C1205f extends C1204e {

        /* renamed from: a */
        protected C0643d.C0645b[] f3252a = null;

        /* renamed from: b */
        String f3253b;

        /* renamed from: c */
        int f3254c = 0;

        /* renamed from: d */
        int f3255d;

        public C1205f() {
            super();
        }

        public C1205f(C1205f fVar) {
            super();
            this.f3253b = fVar.f3253b;
            this.f3255d = fVar.f3255d;
            this.f3252a = C0643d.m2633f(fVar.f3252a);
        }

        /* renamed from: c */
        public boolean mo4093c() {
            return false;
        }

        /* renamed from: d */
        public void mo4131d(Path path) {
            path.reset();
            C0643d.C0645b[] bVarArr = this.f3252a;
            if (bVarArr != null) {
                C0643d.C0645b.m2641e(bVarArr, path);
            }
        }

        public C0643d.C0645b[] getPathData() {
            return this.f3252a;
        }

        public String getPathName() {
            return this.f3253b;
        }

        public void setPathData(C0643d.C0645b[] bVarArr) {
            if (!C0643d.m2629b(this.f3252a, bVarArr)) {
                this.f3252a = C0643d.m2633f(bVarArr);
            } else {
                C0643d.m2637j(this.f3252a, bVarArr);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$g */
    private static class C1206g {

        /* renamed from: q */
        private static final Matrix f3256q = new Matrix();

        /* renamed from: a */
        private final Path f3257a;

        /* renamed from: b */
        private final Path f3258b;

        /* renamed from: c */
        private final Matrix f3259c;

        /* renamed from: d */
        Paint f3260d;

        /* renamed from: e */
        Paint f3261e;

        /* renamed from: f */
        private PathMeasure f3262f;

        /* renamed from: g */
        private int f3263g;

        /* renamed from: h */
        final C1203d f3264h;

        /* renamed from: i */
        float f3265i;

        /* renamed from: j */
        float f3266j;

        /* renamed from: k */
        float f3267k;

        /* renamed from: l */
        float f3268l;

        /* renamed from: m */
        int f3269m;

        /* renamed from: n */
        String f3270n;

        /* renamed from: o */
        Boolean f3271o;

        /* renamed from: p */
        final C3801a<String, Object> f3272p;

        public C1206g() {
            this.f3259c = new Matrix();
            this.f3265i = 0.0f;
            this.f3266j = 0.0f;
            this.f3267k = 0.0f;
            this.f3268l = 0.0f;
            this.f3269m = 255;
            this.f3270n = null;
            this.f3271o = null;
            this.f3272p = new C3801a<>();
            this.f3264h = new C1203d();
            this.f3257a = new Path();
            this.f3258b = new Path();
        }

        public C1206g(C1206g gVar) {
            this.f3259c = new Matrix();
            this.f3265i = 0.0f;
            this.f3266j = 0.0f;
            this.f3267k = 0.0f;
            this.f3268l = 0.0f;
            this.f3269m = 255;
            this.f3270n = null;
            this.f3271o = null;
            C3801a<String, Object> aVar = new C3801a<>();
            this.f3272p = aVar;
            this.f3264h = new C1203d(gVar.f3264h, aVar);
            this.f3257a = new Path(gVar.f3257a);
            this.f3258b = new Path(gVar.f3258b);
            this.f3265i = gVar.f3265i;
            this.f3266j = gVar.f3266j;
            this.f3267k = gVar.f3267k;
            this.f3268l = gVar.f3268l;
            this.f3263g = gVar.f3263g;
            this.f3269m = gVar.f3269m;
            this.f3270n = gVar.f3270n;
            String str = gVar.f3270n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f3271o = gVar.f3271o;
        }

        /* renamed from: a */
        private static float m4845a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: c */
        private void m4846c(C1203d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f3239a.set(matrix);
            dVar.f3239a.preConcat(dVar.f3248j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f3240b.size(); i3++) {
                C1204e eVar = dVar.f3240b.get(i3);
                if (eVar instanceof C1203d) {
                    m4846c((C1203d) eVar, dVar.f3239a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof C1205f) {
                    m4847d(dVar, (C1205f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m4847d(C1203d dVar, C1205f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f3267k;
            float f2 = ((float) i2) / this.f3268l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f3239a;
            this.f3259c.set(matrix);
            this.f3259c.postScale(f, f2);
            float e = m4848e(matrix);
            if (e != 0.0f) {
                fVar.mo4131d(this.f3257a);
                Path path = this.f3257a;
                this.f3258b.reset();
                if (fVar.mo4093c()) {
                    this.f3258b.setFillType(fVar.f3254c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f3258b.addPath(path, this.f3259c);
                    canvas.clipPath(this.f3258b);
                    return;
                }
                C1202c cVar = (C1202c) fVar;
                float f3 = cVar.f3233k;
                if (!(f3 == 0.0f && cVar.f3234l == 1.0f)) {
                    float f4 = cVar.f3235m;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (cVar.f3234l + f4) % 1.0f;
                    if (this.f3262f == null) {
                        this.f3262f = new PathMeasure();
                    }
                    this.f3262f.setPath(this.f3257a, false);
                    float length = this.f3262f.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f3262f.getSegment(f7, length, path, true);
                        this.f3262f.getSegment(0.0f, f8, path, true);
                    } else {
                        this.f3262f.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f3258b.addPath(path, this.f3259c);
                if (cVar.f3230h.mo2562l()) {
                    C0614d dVar2 = cVar.f3230h;
                    if (this.f3261e == null) {
                        Paint paint = new Paint(1);
                        this.f3261e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f3261e;
                    if (dVar2.mo2558h()) {
                        Shader f9 = dVar2.mo2557f();
                        f9.setLocalMatrix(this.f3259c);
                        paint2.setShader(f9);
                        paint2.setAlpha(Math.round(cVar.f3232j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(C1199h.m4817a(dVar2.mo2556e(), cVar.f3232j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f3258b.setFillType(cVar.f3254c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f3258b, paint2);
                }
                if (cVar.f3228f.mo2562l()) {
                    C0614d dVar3 = cVar.f3228f;
                    if (this.f3260d == null) {
                        Paint paint3 = new Paint(1);
                        this.f3260d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f3260d;
                    Paint.Join join = cVar.f3237o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f3236n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f3238p);
                    if (dVar3.mo2558h()) {
                        Shader f10 = dVar3.mo2557f();
                        f10.setLocalMatrix(this.f3259c);
                        paint4.setShader(f10);
                        paint4.setAlpha(Math.round(cVar.f3231i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(C1199h.m4817a(dVar3.mo2556e(), cVar.f3231i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f3229g * min * e);
                    canvas.drawPath(this.f3258b, paint4);
                }
            }
        }

        /* renamed from: e */
        private float m4848e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = m4845a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: b */
        public void mo4135b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m4846c(this.f3264h, f3256q, canvas, i, i2, colorFilter);
        }

        /* renamed from: f */
        public boolean mo4136f() {
            if (this.f3271o == null) {
                this.f3271o = Boolean.valueOf(this.f3264h.mo4095a());
            }
            return this.f3271o.booleanValue();
        }

        /* renamed from: g */
        public boolean mo4137g(int[] iArr) {
            return this.f3264h.mo4096b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f3269m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f3269m = i;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$h */
    private static class C1207h extends Drawable.ConstantState {

        /* renamed from: a */
        int f3273a;

        /* renamed from: b */
        C1206g f3274b;

        /* renamed from: c */
        ColorStateList f3275c;

        /* renamed from: d */
        PorterDuff.Mode f3276d;

        /* renamed from: e */
        boolean f3277e;

        /* renamed from: f */
        Bitmap f3278f;

        /* renamed from: g */
        ColorStateList f3279g;

        /* renamed from: h */
        PorterDuff.Mode f3280h;

        /* renamed from: i */
        int f3281i;

        /* renamed from: j */
        boolean f3282j;

        /* renamed from: k */
        boolean f3283k;

        /* renamed from: l */
        Paint f3284l;

        public C1207h() {
            this.f3275c = null;
            this.f3276d = C1199h.f3217p;
            this.f3274b = new C1206g();
        }

        public C1207h(C1207h hVar) {
            this.f3275c = null;
            this.f3276d = C1199h.f3217p;
            if (hVar != null) {
                this.f3273a = hVar.f3273a;
                C1206g gVar = new C1206g(hVar.f3274b);
                this.f3274b = gVar;
                if (hVar.f3274b.f3261e != null) {
                    gVar.f3261e = new Paint(hVar.f3274b.f3261e);
                }
                if (hVar.f3274b.f3260d != null) {
                    this.f3274b.f3260d = new Paint(hVar.f3274b.f3260d);
                }
                this.f3275c = hVar.f3275c;
                this.f3276d = hVar.f3276d;
                this.f3277e = hVar.f3277e;
            }
        }

        /* renamed from: a */
        public boolean mo4142a(int i, int i2) {
            return i == this.f3278f.getWidth() && i2 == this.f3278f.getHeight();
        }

        /* renamed from: b */
        public boolean mo4143b() {
            return !this.f3283k && this.f3279g == this.f3275c && this.f3280h == this.f3276d && this.f3282j == this.f3277e && this.f3281i == this.f3274b.getRootAlpha();
        }

        /* renamed from: c */
        public void mo4144c(int i, int i2) {
            if (this.f3278f == null || !mo4142a(i, i2)) {
                this.f3278f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f3283k = true;
            }
        }

        /* renamed from: d */
        public void mo4145d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f3278f, (Rect) null, rect, mo4146e(colorFilter));
        }

        /* renamed from: e */
        public Paint mo4146e(ColorFilter colorFilter) {
            if (!mo4147f() && colorFilter == null) {
                return null;
            }
            if (this.f3284l == null) {
                Paint paint = new Paint();
                this.f3284l = paint;
                paint.setFilterBitmap(true);
            }
            this.f3284l.setAlpha(this.f3274b.getRootAlpha());
            this.f3284l.setColorFilter(colorFilter);
            return this.f3284l;
        }

        /* renamed from: f */
        public boolean mo4147f() {
            return this.f3274b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean mo4148g() {
            return this.f3274b.mo4136f();
        }

        public int getChangingConfigurations() {
            return this.f3273a;
        }

        /* renamed from: h */
        public boolean mo4150h(int[] iArr) {
            boolean g = this.f3274b.mo4137g(iArr);
            this.f3283k |= g;
            return g;
        }

        /* renamed from: i */
        public void mo4151i() {
            this.f3279g = this.f3275c;
            this.f3280h = this.f3276d;
            this.f3281i = this.f3274b.getRootAlpha();
            this.f3282j = this.f3277e;
            this.f3283k = false;
        }

        /* renamed from: j */
        public void mo4152j(int i, int i2) {
            this.f3278f.eraseColor(0);
            this.f3274b.mo4135b(new Canvas(this.f3278f), i, i2, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new C1199h(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C1199h(this);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$i */
    private static class C1208i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f3285a;

        public C1208i(Drawable.ConstantState constantState) {
            this.f3285a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f3285a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f3285a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1199h hVar = new C1199h();
            hVar.f3216f = (VectorDrawable) this.f3285a.newDrawable();
            return hVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1199h hVar = new C1199h();
            hVar.f3216f = (VectorDrawable) this.f3285a.newDrawable(resources);
            return hVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1199h hVar = new C1199h();
            hVar.f3216f = (VectorDrawable) this.f3285a.newDrawable(resources, theme);
            return hVar;
        }
    }

    C1199h() {
        this.f3222k = true;
        this.f3224m = new float[9];
        this.f3225n = new Matrix();
        this.f3226o = new Rect();
        this.f3218g = new C1207h();
    }

    C1199h(C1207h hVar) {
        this.f3222k = true;
        this.f3224m = new float[9];
        this.f3225n = new Matrix();
        this.f3226o = new Rect();
        this.f3218g = hVar;
        this.f3219h = mo4083j(this.f3219h, hVar.f3275c, hVar.f3276d);
    }

    /* renamed from: a */
    static int m4817a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[Catch:{ IOException | XmlPullParserException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ IOException | XmlPullParserException -> 0x0045 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.vectordrawable.graphics.drawable.C1199h m4818b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0023
            androidx.vectordrawable.graphics.drawable.h r0 = new androidx.vectordrawable.graphics.drawable.h
            r0.<init>()
            android.graphics.drawable.Drawable r6 = androidx.core.content.res.C0624h.m2565d(r6, r7, r8)
            r0.f3216f = r6
            androidx.vectordrawable.graphics.drawable.h$i r6 = new androidx.vectordrawable.graphics.drawable.h$i
            android.graphics.drawable.Drawable r7 = r0.f3216f
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f3223l = r6
            return r0
        L_0x0023:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
        L_0x002b:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            r4 = 2
            if (r3 == r4) goto L_0x0036
            r5 = 1
            if (r3 == r5) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            if (r3 != r4) goto L_0x003d
            androidx.vectordrawable.graphics.drawable.h r6 = m4819c(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            return r6
        L_0x003d:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
        L_0x0045:
            r6 = move-exception
            goto L_0x0048
        L_0x0047:
            r6 = move-exception
        L_0x0048:
            android.util.Log.e(r1, r0, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1199h.m4818b(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.vectordrawable.graphics.drawable.h");
    }

    /* renamed from: c */
    public static C1199h m4819c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1199h hVar = new C1199h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: androidx.vectordrawable.graphics.drawable.h$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: androidx.vectordrawable.graphics.drawable.h$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: androidx.vectordrawable.graphics.drawable.h$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: androidx.vectordrawable.graphics.drawable.h$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: androidx.vectordrawable.graphics.drawable.h$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4820e(android.content.res.Resources r11, org.xmlpull.v1.XmlPullParser r12, android.util.AttributeSet r13, android.content.res.Resources.Theme r14) {
        /*
            r10 = this;
            androidx.vectordrawable.graphics.drawable.h$h r0 = r10.f3218g
            androidx.vectordrawable.graphics.drawable.h$g r1 = r0.f3274b
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            androidx.vectordrawable.graphics.drawable.h$d r3 = r1.f3264h
            r2.push(r3)
            int r3 = r12.getEventType()
            int r4 = r12.getDepth()
            r5 = 1
            int r4 = r4 + r5
            r6 = r5
        L_0x0019:
            if (r3 == r5) goto L_0x00c4
            int r7 = r12.getDepth()
            r8 = 3
            if (r7 >= r4) goto L_0x0024
            if (r3 == r8) goto L_0x00c4
        L_0x0024:
            r7 = 2
            java.lang.String r9 = "group"
            if (r3 != r7) goto L_0x00af
            java.lang.String r3 = r12.getName()
            java.lang.Object r7 = r2.peek()
            androidx.vectordrawable.graphics.drawable.h$d r7 = (androidx.vectordrawable.graphics.drawable.C1199h.C1203d) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0059
            androidx.vectordrawable.graphics.drawable.h$c r3 = new androidx.vectordrawable.graphics.drawable.h$c
            r3.<init>()
            r3.mo4097g(r11, r13, r14, r12)
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.h$e> r6 = r7.f3240b
            r6.add(r3)
            java.lang.String r6 = r3.getPathName()
            if (r6 == 0) goto L_0x0057
            o.a<java.lang.String, java.lang.Object> r6 = r1.f3272p
            java.lang.String r7 = r3.getPathName()
            r6.put(r7, r3)
        L_0x0057:
            r6 = 0
            goto L_0x007d
        L_0x0059:
            java.lang.String r8 = "clip-path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0085
            androidx.vectordrawable.graphics.drawable.h$b r3 = new androidx.vectordrawable.graphics.drawable.h$b
            r3.<init>()
            r3.mo4094e(r11, r13, r14, r12)
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.h$e> r7 = r7.f3240b
            r7.add(r3)
            java.lang.String r7 = r3.getPathName()
            if (r7 == 0) goto L_0x007d
            o.a<java.lang.String, java.lang.Object> r7 = r1.f3272p
            java.lang.String r8 = r3.getPathName()
            r7.put(r8, r3)
        L_0x007d:
            int r7 = r0.f3273a
            int r3 = r3.f3255d
        L_0x0081:
            r3 = r3 | r7
            r0.f3273a = r3
            goto L_0x00be
        L_0x0085:
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            androidx.vectordrawable.graphics.drawable.h$d r3 = new androidx.vectordrawable.graphics.drawable.h$d
            r3.<init>()
            r3.mo4114c(r11, r13, r14, r12)
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.h$e> r7 = r7.f3240b
            r7.add(r3)
            r2.push(r3)
            java.lang.String r7 = r3.getGroupName()
            if (r7 == 0) goto L_0x00aa
            o.a<java.lang.String, java.lang.Object> r7 = r1.f3272p
            java.lang.String r8 = r3.getGroupName()
            r7.put(r8, r3)
        L_0x00aa:
            int r7 = r0.f3273a
            int r3 = r3.f3249k
            goto L_0x0081
        L_0x00af:
            if (r3 != r8) goto L_0x00be
            java.lang.String r3 = r12.getName()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            r2.pop()
        L_0x00be:
            int r3 = r12.next()
            goto L_0x0019
        L_0x00c4:
            if (r6 != 0) goto L_0x00c7
            return
        L_0x00c7:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r12 = "no path defined"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1199h.m4820e(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    /* renamed from: f */
    private boolean m4821f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && C0650a.m2688e(this) == 1;
    }

    /* renamed from: g */
    private static PorterDuff.Mode m4822g(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: i */
    private void m4823i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        C1207h hVar = this.f3218g;
        C1206g gVar = hVar.f3274b;
        hVar.f3276d = m4822g(C0636k.m2596g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c = C0636k.m2592c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c != null) {
            hVar.f3275c = c;
        }
        hVar.f3277e = C0636k.m2590a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f3277e);
        gVar.f3267k = C0636k.m2595f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f3267k);
        float f = C0636k.m2595f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f3268l);
        gVar.f3268l = f;
        if (gVar.f3267k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f > 0.0f) {
            gVar.f3265i = typedArray.getDimension(3, gVar.f3265i);
            float dimension = typedArray.getDimension(2, gVar.f3266j);
            gVar.f3266j = dimension;
            if (gVar.f3265i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(C0636k.m2595f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f3270n = string;
                    gVar.f3272p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f3216f;
        if (drawable == null) {
            return false;
        }
        C0650a.m2685b(drawable);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object mo4068d(String str) {
        return this.f3218g.f3274b.f3272p.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f3226o);
        if (this.f3226o.width() > 0 && this.f3226o.height() > 0) {
            ColorFilter colorFilter = this.f3220i;
            if (colorFilter == null) {
                colorFilter = this.f3219h;
            }
            canvas.getMatrix(this.f3225n);
            this.f3225n.getValues(this.f3224m);
            float abs = Math.abs(this.f3224m[0]);
            float abs2 = Math.abs(this.f3224m[4]);
            float abs3 = Math.abs(this.f3224m[1]);
            float abs4 = Math.abs(this.f3224m[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f3226o.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f3226o.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f3226o;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m4821f()) {
                    canvas.translate((float) this.f3226o.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f3226o.offsetTo(0, 0);
                this.f3218g.mo4144c(min, min2);
                if (!this.f3222k) {
                    this.f3218g.mo4152j(min, min2);
                } else if (!this.f3218g.mo4143b()) {
                    this.f3218g.mo4152j(min, min2);
                    this.f3218g.mo4151i();
                }
                this.f3218g.mo4145d(canvas, colorFilter, this.f3226o);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f3216f;
        return drawable != null ? C0650a.m2686c(drawable) : this.f3218g.f3274b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f3216f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3218g.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3216f;
        return drawable != null ? C0650a.m2687d(drawable) : this.f3220i;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f3216f != null && Build.VERSION.SDK_INT >= 24) {
            return new C1208i(this.f3216f.getConstantState());
        }
        this.f3218g.f3273a = getChangingConfigurations();
        return this.f3218g;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f3216f;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3218g.f3274b.f3266j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f3216f;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3218g.f3274b.f3265i;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4077h(boolean z) {
        this.f3222k = z;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            C0650a.m2689f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1207h hVar = this.f3218g;
        hVar.f3274b = new C1206g();
        TypedArray k = C0636k.m2600k(resources, theme, attributeSet, C1188a.f3187a);
        m4823i(k, xmlPullParser, theme);
        k.recycle();
        hVar.f3273a = getChangingConfigurations();
        hVar.f3283k = true;
        m4820e(resources, xmlPullParser, attributeSet, theme);
        this.f3219h = mo4083j(this.f3219h, hVar.f3275c, hVar.f3276d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f3216f;
        return drawable != null ? C0650a.m2690g(drawable) : this.f3218g.f3277e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f3218g.f3275c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f3218g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f3216f
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.h$h r0 = r1.f3218g
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo4148g()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.h$h r0 = r1.f3218g
            android.content.res.ColorStateList r0 = r0.f3275c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1199h.isStateful():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public PorterDuffColorFilter mo4083j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3221j && super.mutate() == this) {
            this.f3218g = new C1207h(this.f3218g);
            this.f3221j = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C1207h hVar = this.f3218g;
        ColorStateList colorStateList = hVar.f3275c;
        if (!(colorStateList == null || (mode = hVar.f3276d) == null)) {
            this.f3219h = mo4083j(this.f3219h, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.mo4148g() || !hVar.mo4150h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f3218g.f3274b.getRootAlpha() != i) {
            this.f3218g.f3274b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            C0650a.m2692i(drawable, z);
        } else {
            this.f3218g.f3277e = z;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f3220i = colorFilter;
        invalidateSelf();
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            C0650a.m2696m(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            C0650a.m2697n(drawable, colorStateList);
            return;
        }
        C1207h hVar = this.f3218g;
        if (hVar.f3275c != colorStateList) {
            hVar.f3275c = colorStateList;
            this.f3219h = mo4083j(this.f3219h, colorStateList, hVar.f3276d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            C0650a.m2698o(drawable, mode);
            return;
        }
        C1207h hVar = this.f3218g;
        if (hVar.f3276d != mode) {
            hVar.f3276d = mode;
            this.f3219h = mo4083j(this.f3219h, hVar.f3275c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f3216f;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}

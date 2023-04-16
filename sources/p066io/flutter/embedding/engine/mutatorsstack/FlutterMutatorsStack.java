package p066io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

@Keep
/* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack */
public class FlutterMutatorsStack {
    private List<Path> finalClippingPaths = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List<C2974a> mutators = new ArrayList();

    /* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack$a */
    public class C2974a {

        /* renamed from: a */
        private Matrix f19863a;

        /* renamed from: b */
        private Rect f19864b;

        /* renamed from: c */
        private float[] f19865c;

        /* renamed from: d */
        private C2975b f19866d;

        public C2974a(Matrix matrix) {
            this.f19866d = C2975b.TRANSFORM;
            this.f19863a = matrix;
        }

        public C2974a(Rect rect) {
            this.f19866d = C2975b.CLIP_RECT;
            this.f19864b = rect;
        }

        public C2974a(Rect rect, float[] fArr) {
            this.f19866d = C2975b.CLIP_RRECT;
            this.f19864b = rect;
            this.f19865c = fArr;
        }

        /* renamed from: a */
        public Matrix mo13533a() {
            return this.f19863a;
        }
    }

    /* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack$b */
    public enum C2975b {
        CLIP_RECT,
        CLIP_RRECT,
        CLIP_PATH,
        TRANSFORM,
        OPACITY
    }

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public List<C2974a> getMutators() {
        return this.mutators;
    }

    public void pushClipRRect(int i, int i2, int i3, int i4, float[] fArr) {
        Rect rect = new Rect(i, i2, i3, i4);
        this.mutators.add(new C2974a(rect, fArr));
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i, int i2, int i3, int i4) {
        Rect rect = new Rect(i, i2, i3, i4);
        this.mutators.add(new C2974a(rect));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        C2974a aVar = new C2974a(matrix);
        this.mutators.add(aVar);
        this.finalMatrix.preConcat(aVar.mo13533a());
    }
}

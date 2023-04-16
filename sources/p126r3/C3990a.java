package p126r3;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import p064i4.C2854h;
import p066io.flutter.embedding.android.C2899a;
import p066io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;

@TargetApi(19)
/* renamed from: r3.a */
public class C3990a extends FrameLayout {

    /* renamed from: f */
    private FlutterMutatorsStack f22149f;

    /* renamed from: g */
    private float f22150g;

    /* renamed from: h */
    private int f22151h;

    /* renamed from: i */
    private int f22152i;

    /* renamed from: j */
    private int f22153j;

    /* renamed from: k */
    private int f22154k;

    /* renamed from: l */
    private final C2899a f22155l;

    /* renamed from: m */
    ViewTreeObserver.OnGlobalFocusChangeListener f22156m;

    /* renamed from: r3.a$a */
    class C3991a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: f */
        final /* synthetic */ View.OnFocusChangeListener f22157f;

        /* renamed from: g */
        final /* synthetic */ View f22158g;

        C3991a(View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.f22157f = onFocusChangeListener;
            this.f22158g = view;
        }

        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f22157f;
            View view3 = this.f22158g;
            onFocusChangeListener.onFocusChange(view3, C2854h.m22361c(view3));
        }
    }

    public C3990a(Context context, float f, C2899a aVar) {
        super(context, (AttributeSet) null);
        this.f22150g = f;
        this.f22155l = aVar;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f22149f.getFinalMatrix());
        float f = this.f22150g;
        matrix.preScale(1.0f / f, 1.0f / f);
        matrix.postTranslate((float) (-this.f22151h), (float) (-this.f22152i));
        return matrix;
    }

    /* renamed from: a */
    public void mo15457a(FlutterMutatorsStack flutterMutatorsStack, int i, int i2, int i3, int i4) {
        this.f22149f = flutterMutatorsStack;
        this.f22151h = i;
        this.f22152i = i2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    /* renamed from: b */
    public void mo15458b() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.f22156m) != null) {
            this.f22156m = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void draw(Canvas canvas) {
        canvas.save();
        for (Path path : this.f22149f.getFinalClippingPaths()) {
            Path path2 = new Path(path);
            path2.offset((float) (-this.f22151h), (float) (-this.f22152i));
            canvas.clipPath(path2);
        }
        super.draw(canvas);
        canvas.restore();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        float f;
        if (this.f22155l == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i2 = this.f22151h;
            this.f22153j = i2;
            i = this.f22152i;
            this.f22154k = i;
            f = (float) i2;
        } else if (action != 2) {
            f = (float) this.f22151h;
            i = this.f22152i;
        } else {
            matrix.postTranslate((float) this.f22153j, (float) this.f22154k);
            this.f22153j = this.f22151h;
            this.f22154k = this.f22152i;
            return this.f22155l.mo13238g(motionEvent, matrix);
        }
        matrix.postTranslate(f, (float) i);
        return this.f22155l.mo13238g(motionEvent, matrix);
    }

    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        mo15458b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f22156m == null) {
            C3991a aVar = new C3991a(onFocusChangeListener, this);
            this.f22156m = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }
}

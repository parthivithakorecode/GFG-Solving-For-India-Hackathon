package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p038f.C2591j;

public final class ViewStubCompat extends View {

    /* renamed from: f */
    private int f1273f;

    /* renamed from: g */
    private int f1274g;

    /* renamed from: h */
    private WeakReference<View> f1275h;

    /* renamed from: i */
    private LayoutInflater f1276i;

    /* renamed from: j */
    private C0397a f1277j;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0397a {
        /* renamed from: a */
        void mo1691a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1273f = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2591j.f18712C3, i, 0);
        this.f1274g = obtainStyledAttributes.getResourceId(C2591j.f18727F3, -1);
        this.f1273f = obtainStyledAttributes.getResourceId(C2591j.f18722E3, 0);
        setId(obtainStyledAttributes.getResourceId(C2591j.f18717D3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View mo1679a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1273f != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1276i;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1273f, viewGroup, false);
            int i = this.f1274g;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1275h = new WeakReference<>(inflate);
            C0397a aVar = this.f1277j;
            if (aVar != null) {
                aVar.mo1691a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1274g;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1276i;
    }

    public int getLayoutResource() {
        return this.f1273f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1274g = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1276i = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1273f = i;
    }

    public void setOnInflateListener(C0397a aVar) {
        this.f1277j = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1275h;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo1679a();
        }
    }
}

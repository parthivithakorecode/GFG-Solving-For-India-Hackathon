package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.C0636k;
import androidx.core.graphics.drawable.C0650a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p102o.C3801a;

/* renamed from: androidx.vectordrawable.graphics.drawable.b */
public class C1189b extends C1198g implements Animatable {

    /* renamed from: g */
    private C1191b f3199g;

    /* renamed from: h */
    private Context f3200h;

    /* renamed from: i */
    private ArgbEvaluator f3201i;

    /* renamed from: j */
    private Animator.AnimatorListener f3202j;

    /* renamed from: k */
    ArrayList<Object> f3203k;

    /* renamed from: l */
    final Drawable.Callback f3204l;

    /* renamed from: androidx.vectordrawable.graphics.drawable.b$a */
    class C1190a implements Drawable.Callback {
        C1190a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C1189b.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C1189b.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C1189b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.b$b */
    private static class C1191b extends Drawable.ConstantState {

        /* renamed from: a */
        int f3206a;

        /* renamed from: b */
        C1199h f3207b;

        /* renamed from: c */
        AnimatorSet f3208c;

        /* renamed from: d */
        ArrayList<Animator> f3209d;

        /* renamed from: e */
        C3801a<Animator, String> f3210e;

        public C1191b(Context context, C1191b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f3206a = bVar.f3206a;
                C1199h hVar = bVar.f3207b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    this.f3207b = (C1199h) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    C1199h hVar2 = (C1199h) this.f3207b.mutate();
                    this.f3207b = hVar2;
                    hVar2.setCallback(callback);
                    this.f3207b.setBounds(bVar.f3207b.getBounds());
                    this.f3207b.mo4077h(false);
                }
                ArrayList<Animator> arrayList = bVar.f3209d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f3209d = new ArrayList<>(size);
                    this.f3210e = new C3801a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f3209d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.f3210e.get(animator);
                        clone.setTarget(this.f3207b.mo4068d(str));
                        this.f3209d.add(clone);
                        this.f3210e.put(clone, str);
                    }
                    mo4054a();
                }
            }
        }

        /* renamed from: a */
        public void mo4054a() {
            if (this.f3208c == null) {
                this.f3208c = new AnimatorSet();
            }
            this.f3208c.playTogether(this.f3209d);
        }

        public int getChangingConfigurations() {
            return this.f3206a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.b$c */
    private static class C1192c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f3211a;

        public C1192c(Drawable.ConstantState constantState) {
            this.f3211a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f3211a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f3211a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1189b bVar = new C1189b();
            Drawable newDrawable = this.f3211a.newDrawable();
            bVar.f3216f = newDrawable;
            newDrawable.setCallback(bVar.f3204l);
            return bVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1189b bVar = new C1189b();
            Drawable newDrawable = this.f3211a.newDrawable(resources);
            bVar.f3216f = newDrawable;
            newDrawable.setCallback(bVar.f3204l);
            return bVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1189b bVar = new C1189b();
            Drawable newDrawable = this.f3211a.newDrawable(resources, theme);
            bVar.f3216f = newDrawable;
            newDrawable.setCallback(bVar.f3204l);
            return bVar;
        }
    }

    C1189b() {
        this((Context) null, (C1191b) null, (Resources) null);
    }

    private C1189b(Context context) {
        this(context, (C1191b) null, (Resources) null);
    }

    private C1189b(Context context, C1191b bVar, Resources resources) {
        this.f3201i = null;
        this.f3202j = null;
        this.f3203k = null;
        C1190a aVar = new C1190a();
        this.f3204l = aVar;
        this.f3200h = context;
        if (bVar != null) {
            this.f3199g = bVar;
        } else {
            this.f3199g = new C1191b(context, bVar, aVar, resources);
        }
    }

    /* renamed from: a */
    public static C1189b m4786a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1189b bVar = new C1189b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    /* renamed from: b */
    private void m4787b(String str, Animator animator) {
        animator.setTarget(this.f3199g.f3207b.mo4068d(str));
        if (Build.VERSION.SDK_INT < 21) {
            m4788c(animator);
        }
        C1191b bVar = this.f3199g;
        if (bVar.f3209d == null) {
            bVar.f3209d = new ArrayList<>();
            this.f3199g.f3210e = new C3801a<>();
        }
        this.f3199g.f3209d.add(animator);
        this.f3199g.f3210e.put(animator, str);
    }

    /* renamed from: c */
    private void m4788c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m4788c(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f3201i == null) {
                    this.f3201i = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f3201i);
            }
        }
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            C0650a.m2684a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            return C0650a.m2685b(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f3199g.f3207b.draw(canvas);
        if (this.f3199g.f3208c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f3216f;
        return drawable != null ? C0650a.m2686c(drawable) : this.f3199g.f3207b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f3216f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3199g.f3206a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3216f;
        return drawable != null ? C0650a.m2687d(drawable) : this.f3199g.f3207b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f3216f == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1192c(this.f3216f.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f3216f;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3199g.f3207b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f3216f;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3199g.f3207b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f3216f;
        return drawable != null ? drawable.getOpacity() : this.f3199g.f3207b.getOpacity();
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

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            C0650a.m2689f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C0636k.m2600k(resources, theme, attributeSet, C1188a.f3191e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1199h b = C1199h.m4818b(resources, resourceId, theme);
                        b.mo4077h(false);
                        b.setCallback(this.f3204l);
                        C1199h hVar = this.f3199g.f3207b;
                        if (hVar != null) {
                            hVar.setCallback((Drawable.Callback) null);
                        }
                        this.f3199g.f3207b = b;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C1188a.f3192f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3200h;
                        if (context != null) {
                            m4787b(string, C1194d.m4800i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f3199g.mo4054a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f3216f;
        return drawable != null ? C0650a.m2690g(drawable) : this.f3199g.f3207b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f3216f;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3199g.f3208c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f3216f;
        return drawable != null ? drawable.isStateful() : this.f3199g.f3207b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3199g.f3207b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f3216f;
        return drawable != null ? drawable.setLevel(i) : this.f3199g.f3207b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3216f;
        return drawable != null ? drawable.setState(iArr) : this.f3199g.f3207b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3199g.f3207b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            C0650a.m2692i(drawable, z);
        } else {
            this.f3199g.f3207b.setAutoMirrored(z);
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
        } else {
            this.f3199g.f3207b.setColorFilter(colorFilter);
        }
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
            this.f3199g.f3207b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            C0650a.m2697n(drawable, colorStateList);
        } else {
            this.f3199g.f3207b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            C0650a.m2698o(drawable, mode);
        } else {
            this.f3199g.f3207b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f3199g.f3207b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f3199g.f3208c.isStarted()) {
            this.f3199g.f3208c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f3216f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3199g.f3208c.end();
        }
    }
}

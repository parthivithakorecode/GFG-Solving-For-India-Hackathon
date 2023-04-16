package p052h;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0504q0;
import androidx.core.content.res.C0636k;
import androidx.core.graphics.drawable.C0654b;
import androidx.vectordrawable.graphics.drawable.C1189b;
import androidx.vectordrawable.graphics.drawable.C1199h;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p052h.C2657b;
import p052h.C2663d;
import p059i.C2787b;
import p059i.C2788c;
import p059i.C2790e;
import p102o.C3806d;
import p102o.C3815h;

/* renamed from: h.a */
public class C2649a extends C2663d implements C0654b {

    /* renamed from: y */
    private static final String f19025y = C2649a.class.getSimpleName();

    /* renamed from: t */
    private C2652c f19026t;

    /* renamed from: u */
    private C2656g f19027u;

    /* renamed from: v */
    private int f19028v;

    /* renamed from: w */
    private int f19029w;

    /* renamed from: x */
    private boolean f19030x;

    /* renamed from: h.a$b */
    private static class C2651b extends C2656g {

        /* renamed from: a */
        private final Animatable f19031a;

        C2651b(Animatable animatable) {
            super();
            this.f19031a = animatable;
        }

        /* renamed from: c */
        public void mo12560c() {
            this.f19031a.start();
        }

        /* renamed from: d */
        public void mo12561d() {
            this.f19031a.stop();
        }
    }

    /* renamed from: h.a$c */
    static class C2652c extends C2663d.C2664a {

        /* renamed from: K */
        C3806d<Long> f19032K;

        /* renamed from: L */
        C3815h<Integer> f19033L;

        C2652c(C2652c cVar, C2649a aVar, Resources resources) {
            super(cVar, aVar, resources);
            C3815h<Integer> hVar;
            if (cVar != null) {
                this.f19032K = cVar.f19032K;
                hVar = cVar.f19033L;
            } else {
                this.f19032K = new C3806d<>();
                hVar = new C3815h<>();
            }
            this.f19033L = hVar;
        }

        /* renamed from: D */
        private static long m21391D(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public int mo12562B(int[] iArr, Drawable drawable, int i) {
            int z = super.mo12645z(iArr, drawable);
            this.f19033L.mo15195h(z, Integer.valueOf(i));
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public int mo12563C(int i, int i2, Drawable drawable, boolean z) {
            int a = super.mo12590a(drawable);
            long D = m21391D(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.f19032K.mo15081a(D, Long.valueOf(j2 | j));
            if (z) {
                this.f19032K.mo15081a(m21391D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public int mo12564E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f19033L.mo15193f(i, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public int mo12565F(int[] iArr) {
            int A = super.mo12644A(iArr);
            return A >= 0 ? A : super.mo12644A(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public int mo12566G(int i, int i2) {
            return (int) this.f19032K.mo15086f(m21391D(i, i2), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public boolean mo12567H(int i, int i2) {
            return (this.f19032K.mo15086f(m21391D(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public boolean mo12568I(int i, int i2) {
            return (this.f19032K.mo15086f(m21391D(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new C2649a(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C2649a(this, resources);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo12571r() {
            this.f19032K = this.f19032K.clone();
            this.f19033L = this.f19033L.clone();
        }
    }

    /* renamed from: h.a$d */
    private static class C2653d extends C2656g {

        /* renamed from: a */
        private final C1189b f19034a;

        C2653d(C1189b bVar) {
            super();
            this.f19034a = bVar;
        }

        /* renamed from: c */
        public void mo12560c() {
            this.f19034a.start();
        }

        /* renamed from: d */
        public void mo12561d() {
            this.f19034a.stop();
        }
    }

    /* renamed from: h.a$e */
    private static class C2654e extends C2656g {

        /* renamed from: a */
        private final ObjectAnimator f19035a;

        /* renamed from: b */
        private final boolean f19036b;

        C2654e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C2655f fVar = new C2655f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (Build.VERSION.SDK_INT >= 18) {
                C2787b.m22216a(ofInt, true);
            }
            ofInt.setDuration((long) fVar.mo12574a());
            ofInt.setInterpolator(fVar);
            this.f19036b = z2;
            this.f19035a = ofInt;
        }

        /* renamed from: a */
        public boolean mo12572a() {
            return this.f19036b;
        }

        /* renamed from: b */
        public void mo12573b() {
            this.f19035a.reverse();
        }

        /* renamed from: c */
        public void mo12560c() {
            this.f19035a.start();
        }

        /* renamed from: d */
        public void mo12561d() {
            this.f19035a.cancel();
        }
    }

    /* renamed from: h.a$f */
    private static class C2655f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f19037a;

        /* renamed from: b */
        private int f19038b;

        /* renamed from: c */
        private int f19039c;

        C2655f(AnimationDrawable animationDrawable, boolean z) {
            mo12575b(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo12574a() {
            return this.f19039c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo12575b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f19038b = numberOfFrames;
            int[] iArr = this.f19037a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f19037a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f19037a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f19039c = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f19039c)) + 0.5f);
            int i2 = this.f19038b;
            int[] iArr = this.f19037a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f19039c) : 0.0f);
        }
    }

    /* renamed from: h.a$g */
    private static abstract class C2656g {
        private C2656g() {
        }

        /* renamed from: a */
        public boolean mo12572a() {
            return false;
        }

        /* renamed from: b */
        public void mo12573b() {
        }

        /* renamed from: c */
        public abstract void mo12560c();

        /* renamed from: d */
        public abstract void mo12561d();
    }

    public C2649a() {
        this((C2652c) null, (Resources) null);
    }

    C2649a(C2652c cVar, Resources resources) {
        super((C2663d.C2664a) null);
        this.f19028v = -1;
        this.f19029w = -1;
        mo12540h(new C2652c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: m */
    public static C2649a m21377m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C2649a aVar = new C2649a();
            aVar.mo12548n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: o */
    private void m21378o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m21380q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m21381r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    private void m21379p() {
        onStateChange(getState());
    }

    /* renamed from: q */
    private int m21380q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k = C0636k.m2600k(resources, theme, attributeSet, C2790e.f19437h);
        int resourceId = k.getResourceId(C2790e.f19438i, 0);
        int resourceId2 = k.getResourceId(C2790e.f19439j, -1);
        Drawable j = resourceId2 > 0 ? C0504q0.m2077h().mo2266j(context, resourceId2) : null;
        k.recycle();
        int[] k2 = mo12643k(attributeSet);
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                j = xmlPullParser.getName().equals("vector") ? C1199h.m4819c(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? C2788c.m22217a(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j != null) {
            return this.f19026t.mo12562B(k2, j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: r */
    private int m21381r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k = C0636k.m2600k(resources, theme, attributeSet, C2790e.f19440k);
        int resourceId = k.getResourceId(C2790e.f19443n, -1);
        int resourceId2 = k.getResourceId(C2790e.f19442m, -1);
        int resourceId3 = k.getResourceId(C2790e.f19441l, -1);
        Drawable j = resourceId3 > 0 ? C0504q0.m2077h().mo2266j(context, resourceId3) : null;
        boolean z = k.getBoolean(C2790e.f19444o, false);
        k.recycle();
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                j = xmlPullParser.getName().equals("animated-vector") ? C1189b.m4786a(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? C2788c.m22217a(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f19026t.mo12563C(resourceId, resourceId2, j, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* renamed from: s */
    private boolean m21382s(int i) {
        int i2;
        int G;
        C2656g gVar;
        C2656g gVar2 = this.f19027u;
        if (gVar2 == null) {
            i2 = mo12578c();
        } else if (i == this.f19028v) {
            return true;
        } else {
            if (i != this.f19029w || !gVar2.mo12572a()) {
                i2 = this.f19028v;
                gVar2.mo12561d();
            } else {
                gVar2.mo12573b();
                this.f19028v = this.f19029w;
                this.f19029w = i;
                return true;
            }
        }
        this.f19027u = null;
        this.f19029w = -1;
        this.f19028v = -1;
        C2652c cVar = this.f19026t;
        int E = cVar.mo12564E(i2);
        int E2 = cVar.mo12564E(i);
        if (E2 == 0 || E == 0 || (G = cVar.mo12566G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.mo12568I(E, E2);
        mo12579g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new C2654e((AnimationDrawable) current, cVar.mo12567H(E, E2), I);
        } else if (current instanceof C1189b) {
            gVar = new C2653d((C1189b) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new C2651b((Animatable) current);
            }
            return false;
        }
        gVar.mo12560c();
        this.f19027u = gVar;
        this.f19029w = i2;
        this.f19028v = i;
        return true;
    }

    /* renamed from: t */
    private void m21383t(TypedArray typedArray) {
        C2652c cVar = this.f19026t;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f19066d |= C2788c.m22218b(typedArray);
        }
        cVar.mo12612x(typedArray.getBoolean(C2790e.f19433d, cVar.f19071i));
        cVar.mo12608t(typedArray.getBoolean(C2790e.f19434e, cVar.f19074l));
        cVar.mo12609u(typedArray.getInt(C2790e.f19435f, cVar.f19054A));
        cVar.mo12610v(typedArray.getInt(C2790e.f19436g, cVar.f19055B));
        setDither(typedArray.getBoolean(C2790e.f19431b, cVar.f19086x));
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo12540h(C2657b.C2661d dVar) {
        super.mo12540h(dVar);
        if (dVar instanceof C2652c) {
            this.f19026t = (C2652c) dVar;
        }
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C2656g gVar = this.f19027u;
        if (gVar != null) {
            gVar.mo12561d();
            this.f19027u = null;
            mo12579g(this.f19028v);
            this.f19028v = -1;
            this.f19029w = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C2652c mo12544j() {
        return new C2652c(this.f19026t, this, (Resources) null);
    }

    public Drawable mutate() {
        if (!this.f19030x && super.mutate() == this) {
            this.f19026t.mo12571r();
            this.f19030x = true;
        }
        return this;
    }

    /* renamed from: n */
    public void mo12548n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray k = C0636k.m2600k(resources, theme, attributeSet, C2790e.f19430a);
        setVisible(k.getBoolean(C2790e.f19432c, true), true);
        m21383t(k);
        mo12581i(resources);
        k.recycle();
        m21378o(context, resources, xmlPullParser, attributeSet, theme);
        m21379p();
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int F = this.f19026t.mo12565F(iArr);
        boolean z = F != mo12578c() && (m21382s(F) || mo12579g(F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setTint(int i) {
        super.setTint(i);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        C2656g gVar = this.f19027u;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.mo12560c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }
}

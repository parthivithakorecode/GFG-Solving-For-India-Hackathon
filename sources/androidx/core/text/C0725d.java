package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.util.C0740c;

/* renamed from: androidx.core.text.d */
public class C0725d implements Spannable {

    /* renamed from: i */
    private static final Object f2094i = new Object();

    /* renamed from: f */
    private final Spannable f2095f;

    /* renamed from: g */
    private final C0726a f2096g;

    /* renamed from: h */
    private final PrecomputedText f2097h;

    /* renamed from: androidx.core.text.d$a */
    public static final class C0726a {

        /* renamed from: a */
        private final TextPaint f2098a;

        /* renamed from: b */
        private final TextDirectionHeuristic f2099b;

        /* renamed from: c */
        private final int f2100c;

        /* renamed from: d */
        private final int f2101d;

        /* renamed from: e */
        final PrecomputedText.Params f2102e;

        /* renamed from: androidx.core.text.d$a$a */
        public static class C0727a {

            /* renamed from: a */
            private final TextPaint f2103a;

            /* renamed from: b */
            private TextDirectionHeuristic f2104b;

            /* renamed from: c */
            private int f2105c;

            /* renamed from: d */
            private int f2106d;

            public C0727a(TextPaint textPaint) {
                this.f2103a = textPaint;
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    this.f2105c = 1;
                    this.f2106d = 1;
                } else {
                    this.f2106d = 0;
                    this.f2105c = 0;
                }
                this.f2104b = i >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            /* renamed from: a */
            public C0726a mo2753a() {
                return new C0726a(this.f2103a, this.f2104b, this.f2105c, this.f2106d);
            }

            /* renamed from: b */
            public C0727a mo2754b(int i) {
                this.f2105c = i;
                return this;
            }

            /* renamed from: c */
            public C0727a mo2755c(int i) {
                this.f2106d = i;
                return this;
            }

            /* renamed from: d */
            public C0727a mo2756d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f2104b = textDirectionHeuristic;
                return this;
            }
        }

        public C0726a(PrecomputedText.Params params) {
            this.f2098a = params.getTextPaint();
            this.f2099b = params.getTextDirection();
            this.f2100c = params.getBreakStrategy();
            this.f2101d = params.getHyphenationFrequency();
            this.f2102e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        C0726a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f2102e = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build() : null;
            this.f2098a = textPaint;
            this.f2099b = textDirectionHeuristic;
            this.f2100c = i;
            this.f2101d = i2;
        }

        /* renamed from: a */
        public boolean mo2745a(C0726a aVar) {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.f2100c != aVar.mo2746b() || this.f2101d != aVar.mo2747c())) || this.f2098a.getTextSize() != aVar.mo2749e().getTextSize() || this.f2098a.getTextScaleX() != aVar.mo2749e().getTextScaleX() || this.f2098a.getTextSkewX() != aVar.mo2749e().getTextSkewX()) {
                return false;
            }
            if ((i >= 21 && (this.f2098a.getLetterSpacing() != aVar.mo2749e().getLetterSpacing() || !TextUtils.equals(this.f2098a.getFontFeatureSettings(), aVar.mo2749e().getFontFeatureSettings()))) || this.f2098a.getFlags() != aVar.mo2749e().getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f2098a.getTextLocales().equals(aVar.mo2749e().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f2098a.getTextLocale().equals(aVar.mo2749e().getTextLocale())) {
                return false;
            }
            return this.f2098a.getTypeface() == null ? aVar.mo2749e().getTypeface() == null : this.f2098a.getTypeface().equals(aVar.mo2749e().getTypeface());
        }

        /* renamed from: b */
        public int mo2746b() {
            return this.f2100c;
        }

        /* renamed from: c */
        public int mo2747c() {
            return this.f2101d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic mo2748d() {
            return this.f2099b;
        }

        /* renamed from: e */
        public TextPaint mo2749e() {
            return this.f2098a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0726a)) {
                return false;
            }
            C0726a aVar = (C0726a) obj;
            if (!mo2745a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f2099b == aVar.mo2748d();
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return C0740c.m2947b(Float.valueOf(this.f2098a.getTextSize()), Float.valueOf(this.f2098a.getTextScaleX()), Float.valueOf(this.f2098a.getTextSkewX()), Float.valueOf(this.f2098a.getLetterSpacing()), Integer.valueOf(this.f2098a.getFlags()), this.f2098a.getTextLocales(), this.f2098a.getTypeface(), Boolean.valueOf(this.f2098a.isElegantTextHeight()), this.f2099b, Integer.valueOf(this.f2100c), Integer.valueOf(this.f2101d));
            } else if (i >= 21) {
                return C0740c.m2947b(Float.valueOf(this.f2098a.getTextSize()), Float.valueOf(this.f2098a.getTextScaleX()), Float.valueOf(this.f2098a.getTextSkewX()), Float.valueOf(this.f2098a.getLetterSpacing()), Integer.valueOf(this.f2098a.getFlags()), this.f2098a.getTextLocale(), this.f2098a.getTypeface(), Boolean.valueOf(this.f2098a.isElegantTextHeight()), this.f2099b, Integer.valueOf(this.f2100c), Integer.valueOf(this.f2101d));
            } else if (i >= 18) {
                return C0740c.m2947b(Float.valueOf(this.f2098a.getTextSize()), Float.valueOf(this.f2098a.getTextScaleX()), Float.valueOf(this.f2098a.getTextSkewX()), Integer.valueOf(this.f2098a.getFlags()), this.f2098a.getTextLocale(), this.f2098a.getTypeface(), this.f2099b, Integer.valueOf(this.f2100c), Integer.valueOf(this.f2101d));
            } else if (i >= 17) {
                return C0740c.m2947b(Float.valueOf(this.f2098a.getTextSize()), Float.valueOf(this.f2098a.getTextScaleX()), Float.valueOf(this.f2098a.getTextSkewX()), Integer.valueOf(this.f2098a.getFlags()), this.f2098a.getTextLocale(), this.f2098a.getTypeface(), this.f2099b, Integer.valueOf(this.f2100c), Integer.valueOf(this.f2101d));
            } else {
                return C0740c.m2947b(Float.valueOf(this.f2098a.getTextSize()), Float.valueOf(this.f2098a.getTextScaleX()), Float.valueOf(this.f2098a.getTextSkewX()), Integer.valueOf(this.f2098a.getFlags()), this.f2098a.getTypeface(), this.f2099b, Integer.valueOf(this.f2100c), Integer.valueOf(this.f2101d));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x00df  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "{"
                r0.<init>(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "textSize="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f2098a
                float r2 = r2.getTextSize()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textScaleX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f2098a
                float r2 = r2.getTextScaleX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textSkewX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f2098a
                float r2 = r2.getTextSkewX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 21
                if (r1 < r2) goto L_0x008f
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = ", letterSpacing="
                r2.append(r3)
                android.text.TextPaint r3 = r4.f2098a
                float r3 = r3.getLetterSpacing()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = ", elegantTextHeight="
                r2.append(r3)
                android.text.TextPaint r3 = r4.f2098a
                boolean r3 = r3.isElegantTextHeight()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
            L_0x008f:
                r2 = 24
                java.lang.String r3 = ", textLocale="
                if (r1 < r2) goto L_0x00ae
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r3)
                android.text.TextPaint r3 = r4.f2098a
                android.os.LocaleList r3 = r3.getTextLocales()
            L_0x00a3:
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                goto L_0x00c1
            L_0x00ae:
                r2 = 17
                if (r1 < r2) goto L_0x00c1
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r3)
                android.text.TextPaint r3 = r4.f2098a
                java.util.Locale r3 = r3.getTextLocale()
                goto L_0x00a3
            L_0x00c1:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = ", typeface="
                r2.append(r3)
                android.text.TextPaint r3 = r4.f2098a
                android.graphics.Typeface r3 = r3.getTypeface()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                r2 = 26
                if (r1 < r2) goto L_0x00f9
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", variationSettings="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f2098a
                java.lang.String r2 = r2.getFontVariationSettings()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x00f9:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textDir="
                r1.append(r2)
                android.text.TextDirectionHeuristic r2 = r4.f2099b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", breakStrategy="
                r1.append(r2)
                int r2 = r4.f2100c
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", hyphenationFrequency="
                r1.append(r2)
                int r2 = r4.f2101d
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.C0725d.C0726a.toString():java.lang.String");
        }
    }

    /* renamed from: a */
    public C0726a mo2732a() {
        return this.f2096g;
    }

    /* renamed from: b */
    public PrecomputedText mo2733b() {
        Spannable spannable = this.f2095f;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i) {
        return this.f2095f.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f2095f.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f2095f.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f2095f.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? this.f2097h.getSpans(i, i2, cls) : this.f2095f.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f2095f.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f2095f.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f2097h.removeSpan(obj);
        } else {
            this.f2095f.removeSpan(obj);
        }
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f2097h.setSpan(obj, i, i2, i3);
        } else {
            this.f2095f.setSpan(obj, i, i2, i3);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f2095f.subSequence(i, i2);
    }

    public String toString() {
        return this.f2095f.toString();
    }
}

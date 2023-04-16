package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.core.text.C0725d;
import java.util.stream.IntStream;

/* renamed from: androidx.emoji2.text.p */
class C0941p implements Spannable {

    /* renamed from: f */
    private boolean f2460f = false;

    /* renamed from: g */
    private Spannable f2461g;

    /* renamed from: androidx.emoji2.text.p$a */
    private static class C0942a {
        /* renamed from: a */
        static IntStream m3847a(CharSequence charSequence) {
            return charSequence.chars();
        }

        /* renamed from: b */
        static IntStream m3848b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* renamed from: androidx.emoji2.text.p$b */
    static class C0943b {
        C0943b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3220a(CharSequence charSequence) {
            return charSequence instanceof C0725d;
        }
    }

    /* renamed from: androidx.emoji2.text.p$c */
    static class C0944c extends C0943b {
        C0944c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3220a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof C0725d);
        }
    }

    C0941p(Spannable spannable) {
        this.f2461g = spannable;
    }

    C0941p(CharSequence charSequence) {
        this.f2461g = new SpannableString(charSequence);
    }

    /* renamed from: a */
    private void m3844a() {
        Spannable spannable = this.f2461g;
        if (!this.f2460f && m3845c().mo3220a(spannable)) {
            this.f2461g = new SpannableString(spannable);
        }
        this.f2460f = true;
    }

    /* renamed from: c */
    static C0943b m3845c() {
        return Build.VERSION.SDK_INT < 28 ? new C0943b() : new C0944c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Spannable mo3206b() {
        return this.f2461g;
    }

    public char charAt(int i) {
        return this.f2461g.charAt(i);
    }

    public IntStream chars() {
        return C0942a.m3847a(this.f2461g);
    }

    public IntStream codePoints() {
        return C0942a.m3848b(this.f2461g);
    }

    public int getSpanEnd(Object obj) {
        return this.f2461g.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f2461g.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f2461g.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return this.f2461g.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f2461g.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f2461g.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        m3844a();
        this.f2461g.removeSpan(obj);
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        m3844a();
        this.f2461g.setSpan(obj, i, i2, i3);
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f2461g.subSequence(i, i2);
    }

    public String toString() {
        return this.f2461g.toString();
    }
}

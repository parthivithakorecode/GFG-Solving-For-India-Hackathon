package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.util.C0743e;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.emoji2.text.n */
public final class C0938n extends SpannableStringBuilder {

    /* renamed from: f */
    private final Class<?> f2455f;

    /* renamed from: g */
    private final List<C0939a> f2456g = new ArrayList();

    /* renamed from: androidx.emoji2.text.n$a */
    private static class C0939a implements TextWatcher, SpanWatcher {

        /* renamed from: f */
        final Object f2457f;

        /* renamed from: g */
        private final AtomicInteger f2458g = new AtomicInteger(0);

        C0939a(Object obj) {
            this.f2457f = obj;
        }

        /* renamed from: b */
        private boolean m3840b(Object obj) {
            return obj instanceof C0927i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo3197a() {
            this.f2458g.incrementAndGet();
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f2457f).afterTextChanged(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f2457f).beforeTextChanged(charSequence, i, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo3200c() {
            this.f2458g.decrementAndGet();
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f2458g.get() <= 0 || !m3840b(obj)) {
                ((SpanWatcher) this.f2457f).onSpanAdded(spannable, obj, i, i2);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f2458g.get() <= 0 || !m3840b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    int i7 = i > i2 ? 0 : i;
                    if (i3 > i4) {
                        i6 = i7;
                        i5 = 0;
                    } else {
                        i5 = i3;
                        i6 = i7;
                    }
                } else {
                    i6 = i;
                    i5 = i3;
                }
                ((SpanWatcher) this.f2457f).onSpanChanged(spannable, obj, i6, i2, i5, i4);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f2458g.get() <= 0 || !m3840b(obj)) {
                ((SpanWatcher) this.f2457f).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f2457f).onTextChanged(charSequence, i, i2, i3);
        }
    }

    C0938n(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        C0743e.m2959g(cls, "watcherClass cannot be null");
        this.f2455f = cls;
    }

    C0938n(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        C0743e.m2959g(cls, "watcherClass cannot be null");
        this.f2455f = cls;
    }

    /* renamed from: b */
    private void m3831b() {
        for (int i = 0; i < this.f2456g.size(); i++) {
            this.f2456g.get(i).mo3197a();
        }
    }

    /* renamed from: c */
    public static C0938n m3832c(Class<?> cls, CharSequence charSequence) {
        return new C0938n(cls, charSequence);
    }

    /* renamed from: e */
    private void m3833e() {
        for (int i = 0; i < this.f2456g.size(); i++) {
            this.f2456g.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: f */
    private C0939a m3834f(Object obj) {
        for (int i = 0; i < this.f2456g.size(); i++) {
            C0939a aVar = this.f2456g.get(i);
            if (aVar.f2457f == obj) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    private boolean m3835g(Class<?> cls) {
        return this.f2455f == cls;
    }

    /* renamed from: h */
    private boolean m3836h(Object obj) {
        return obj != null && m3835g(obj.getClass());
    }

    /* renamed from: i */
    private void m3837i() {
        for (int i = 0; i < this.f2456g.size(); i++) {
            this.f2456g.get(i).mo3200c();
        }
    }

    /* renamed from: a */
    public void mo3178a() {
        m3831b();
    }

    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    /* renamed from: d */
    public void mo3183d() {
        m3837i();
        m3833e();
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public int getSpanEnd(Object obj) {
        C0939a f;
        if (m3836h(obj) && (f = m3834f(obj)) != null) {
            obj = f;
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        C0939a f;
        if (m3836h(obj) && (f = m3834f(obj)) != null) {
            obj = f;
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        C0939a f;
        if (m3836h(obj) && (f = m3834f(obj)) != null) {
            obj = f;
        }
        return super.getSpanStart(obj);
    }

    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (!m3835g(cls)) {
            return super.getSpans(i, i2, cls);
        }
        C0939a[] aVarArr = (C0939a[]) super.getSpans(i, i2, C0939a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            tArr[i3] = aVarArr[i3].f2457f;
        }
        return tArr;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public int nextSpanTransition(int i, int i2, Class<C0939a> cls) {
        if (cls == null || m3835g(cls)) {
            cls = C0939a.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        C0939a aVar;
        if (m3836h(obj)) {
            aVar = m3834f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f2456g.remove(aVar);
        }
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m3831b();
        super.replace(i, i2, charSequence);
        m3837i();
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m3831b();
        super.replace(i, i2, charSequence, i3, i4);
        m3837i();
        return this;
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (m3836h(obj)) {
            C0939a aVar = new C0939a(obj);
            this.f2456g.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i, int i2) {
        return new C0938n(this.f2455f, this, i, i2);
    }
}

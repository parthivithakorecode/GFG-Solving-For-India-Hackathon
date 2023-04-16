package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p038f.C2591j;
import p152w.C4243a;

/* renamed from: androidx.appcompat.widget.m */
class C0481m {

    /* renamed from: a */
    private final EditText f1525a;

    /* renamed from: b */
    private final C4243a f1526b;

    C0481m(EditText editText) {
        this.f1525a = editText;
        this.f1526b = new C4243a(editText, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public KeyListener mo2153a(KeyListener keyListener) {
        return mo2154b(keyListener) ? this.f1526b.mo15788a(keyListener) : keyListener;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2154b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2155c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1525a.getContext().obtainStyledAttributes(attributeSet, C2591j.f18839g0, i, 0);
        try {
            int i2 = C2591j.f18909u0;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            mo2157e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public InputConnection mo2156d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f1526b.mo15789b(inputConnection, editorInfo);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2157e(boolean z) {
        this.f1526b.mo15790c(z);
    }
}

package p152w;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C0911e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: w.g */
final class C4257g implements TextWatcher {

    /* renamed from: f */
    private final EditText f22539f;

    /* renamed from: g */
    private final boolean f22540g;

    /* renamed from: h */
    private C0911e.C0917e f22541h;

    /* renamed from: i */
    private int f22542i = Integer.MAX_VALUE;

    /* renamed from: j */
    private int f22543j = 0;

    /* renamed from: k */
    private boolean f22544k;

    /* renamed from: w.g$a */
    private static class C4258a extends C0911e.C0917e {

        /* renamed from: a */
        private final Reference<EditText> f22545a;

        C4258a(EditText editText) {
            this.f22545a = new WeakReference(editText);
        }

        /* renamed from: b */
        public void mo3132b() {
            super.mo3132b();
            C4257g.m26796b(this.f22545a.get(), 1);
        }
    }

    C4257g(EditText editText, boolean z) {
        this.f22539f = editText;
        this.f22540g = z;
        this.f22544k = true;
    }

    /* renamed from: a */
    private C0911e.C0917e m26795a() {
        if (this.f22541h == null) {
            this.f22541h = new C4258a(this.f22539f);
        }
        return this.f22541h;
    }

    /* renamed from: b */
    static void m26796b(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0911e.m3726b().mo3118o(editableText);
            C4249d.m26769b(editableText, selectionStart, selectionEnd);
        }
    }

    /* renamed from: d */
    private boolean m26797d() {
        return !this.f22544k || (!this.f22540g && !C0911e.m3730h());
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: c */
    public void mo15817c(boolean z) {
        if (this.f22544k != z) {
            if (this.f22541h != null) {
                C0911e.m3726b().mo3123t(this.f22541h);
            }
            this.f22544k = z;
            if (z) {
                m26796b(this.f22539f, C0911e.m3726b().mo3113d());
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f22539f.isInEditMode() && !m26797d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int d = C0911e.m3726b().mo3113d();
            if (d != 0) {
                if (d == 1) {
                    C0911e.m3726b().mo3121r((Spannable) charSequence, i, i + i3, this.f22542i, this.f22543j);
                    return;
                } else if (d != 3) {
                    return;
                }
            }
            C0911e.m3726b().mo3122s(m26795a());
        }
    }
}

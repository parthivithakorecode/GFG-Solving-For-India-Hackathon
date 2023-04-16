package p152w;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C0911e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: w.d */
final class C4249d implements InputFilter {

    /* renamed from: a */
    private final TextView f22528a;

    /* renamed from: b */
    private C0911e.C0917e f22529b;

    /* renamed from: w.d$a */
    private static class C4250a extends C0911e.C0917e {

        /* renamed from: a */
        private final Reference<TextView> f22530a;

        /* renamed from: b */
        private final Reference<C4249d> f22531b;

        C4250a(TextView textView, C4249d dVar) {
            this.f22530a = new WeakReference(textView);
            this.f22531b = new WeakReference(dVar);
        }

        /* renamed from: c */
        private boolean m26770c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public void mo3132b() {
            CharSequence text;
            CharSequence o;
            super.mo3132b();
            TextView textView = this.f22530a.get();
            if (m26770c(textView, this.f22531b.get()) && textView.isAttachedToWindow() && (text = textView.getText()) != (o = C0911e.m3726b().mo3118o(text))) {
                int selectionStart = Selection.getSelectionStart(o);
                int selectionEnd = Selection.getSelectionEnd(o);
                textView.setText(o);
                if (o instanceof Spannable) {
                    C4249d.m26769b((Spannable) o, selectionStart, selectionEnd);
                }
            }
        }
    }

    C4249d(TextView textView) {
        this.f22528a = textView;
    }

    /* renamed from: a */
    private C0911e.C0917e m26768a() {
        if (this.f22529b == null) {
            this.f22529b = new C4250a(this.f22528a, this);
        }
        return this.f22529b;
    }

    /* renamed from: b */
    static void m26769b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f22528a.isInEditMode()) {
            return charSequence;
        }
        int d = C0911e.m3726b().mo3113d();
        if (d != 0) {
            boolean z = true;
            if (d == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f22528a.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (!(i == 0 && i2 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C0911e.m3726b().mo3119p(charSequence, 0, charSequence.length());
            } else if (d != 3) {
                return charSequence;
            }
        }
        C0911e.m3726b().mo3122s(m26768a());
        return charSequence;
    }
}

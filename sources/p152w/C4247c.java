package p152w;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.C0911e;

/* renamed from: w.c */
final class C4247c extends InputConnectionWrapper {

    /* renamed from: a */
    private final TextView f22526a;

    /* renamed from: b */
    private final C4248a f22527b;

    /* renamed from: w.c$a */
    public static class C4248a {
        /* renamed from: a */
        public boolean mo15797a(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
            return C0911e.m3727e(inputConnection, editable, i, i2, z);
        }

        /* renamed from: b */
        public void mo15798b(EditorInfo editorInfo) {
            if (C0911e.m3730h()) {
                C0911e.m3726b().mo3124u(editorInfo);
            }
        }
    }

    C4247c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new C4248a());
    }

    C4247c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, C4248a aVar) {
        super(inputConnection, false);
        this.f22526a = textView;
        this.f22527b = aVar;
        aVar.mo15798b(editorInfo);
    }

    /* renamed from: a */
    private Editable m26765a() {
        return this.f22526a.getEditableText();
    }

    public boolean deleteSurroundingText(int i, int i2) {
        return this.f22527b.mo15797a(this, m26765a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return this.f22527b.mo15797a(this, m26765a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}

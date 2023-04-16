package p152w;

import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.C0743e;

/* renamed from: w.a */
public final class C4243a {

    /* renamed from: a */
    private final C4245b f22518a;

    /* renamed from: b */
    private int f22519b = Integer.MAX_VALUE;

    /* renamed from: c */
    private int f22520c = 0;

    /* renamed from: w.a$a */
    private static class C4244a extends C4245b {

        /* renamed from: a */
        private final EditText f22521a;

        /* renamed from: b */
        private final C4257g f22522b;

        C4244a(EditText editText, boolean z) {
            this.f22521a = editText;
            C4257g gVar = new C4257g(editText, z);
            this.f22522b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(C4246b.getInstance());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public KeyListener mo15791a(KeyListener keyListener) {
            if (keyListener instanceof C4251e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new C4251e(keyListener);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public InputConnection mo15792b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof C4247c ? inputConnection : new C4247c(this.f22521a, inputConnection, editorInfo);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo15793c(boolean z) {
            this.f22522b.mo15817c(z);
        }
    }

    /* renamed from: w.a$b */
    static class C4245b {
        C4245b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public KeyListener mo15791a(KeyListener keyListener) {
            return keyListener;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public InputConnection mo15792b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo15793c(boolean z) {
        }
    }

    public C4243a(EditText editText, boolean z) {
        C0743e.m2959g(editText, "editText cannot be null");
        if (Build.VERSION.SDK_INT < 19) {
            this.f22518a = new C4245b();
        } else {
            this.f22518a = new C4244a(editText, z);
        }
    }

    /* renamed from: a */
    public KeyListener mo15788a(KeyListener keyListener) {
        return this.f22518a.mo15791a(keyListener);
    }

    /* renamed from: b */
    public InputConnection mo15789b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f22518a.mo15792b(inputConnection, editorInfo);
    }

    /* renamed from: c */
    public void mo15790c(boolean z) {
        this.f22518a.mo15793c(z);
    }
}

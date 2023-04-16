package p152w;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C0911e;

/* renamed from: w.e */
final class C4251e implements KeyListener {

    /* renamed from: a */
    private final KeyListener f22532a;

    /* renamed from: b */
    private final C4252a f22533b;

    /* renamed from: w.e$a */
    public static class C4252a {
        /* renamed from: a */
        public boolean mo15805a(Editable editable, int i, KeyEvent keyEvent) {
            return C0911e.m3728f(editable, i, keyEvent);
        }
    }

    C4251e(KeyListener keyListener) {
        this(keyListener, new C4252a());
    }

    C4251e(KeyListener keyListener, C4252a aVar) {
        this.f22532a = keyListener;
        this.f22533b = aVar;
    }

    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f22532a.clearMetaKeyState(view, editable, i);
    }

    public int getInputType() {
        return this.f22532a.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f22533b.mo15805a(editable, i, keyEvent) || this.f22532a.onKeyDown(view, editable, i, keyEvent);
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f22532a.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f22532a.onKeyUp(view, editable, i, keyEvent);
    }
}

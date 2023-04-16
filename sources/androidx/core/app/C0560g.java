package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.C0787f;
import androidx.lifecycle.C1099i;
import androidx.lifecycle.C1110m;
import androidx.lifecycle.C1111n;
import androidx.lifecycle.C1125w;
import p102o.C3814g;

/* renamed from: androidx.core.app.g */
public class C0560g extends Activity implements C1110m, C0787f.C0788a {

    /* renamed from: f */
    private C3814g<Class<Object>, Object> f1737f = new C3814g<>();

    /* renamed from: g */
    private C1111n f1738g = new C1111n(this);

    /* renamed from: c */
    public boolean mo761c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0787f.m3129d(decorView, keyEvent)) {
            return C0787f.m3130e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0787f.m3129d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1125w.m4625g(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f1738g.mo3836j(C1099i.C1102c.CREATED);
        super.onSaveInstanceState(bundle);
    }
}

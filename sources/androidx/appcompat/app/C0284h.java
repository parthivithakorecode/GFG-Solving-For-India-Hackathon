package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0219f;
import androidx.appcompat.view.C0299b;
import androidx.core.view.C0787f;
import p038f.C2582a;

/* renamed from: androidx.appcompat.app.h */
public class C0284h extends C0219f implements C0255d {

    /* renamed from: h */
    private C0256e f669h;

    /* renamed from: i */
    private final C0787f.C0788a f670i = new C0283g(this);

    public C0284h(Context context, int i) {
        super(context, m956j(context, i));
        C0256e g = mo766g();
        g.mo663D(m956j(context, i));
        g.mo675q((Bundle) null);
    }

    /* renamed from: j */
    private static int m956j(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2582a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo766g().mo665d(view, layoutParams);
    }

    /* renamed from: d */
    public void mo640d(C0299b bVar) {
    }

    public void dismiss() {
        super.dismiss();
        mo766g().mo676r();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0787f.m3130e(this.f670i, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: e */
    public void mo642e(C0299b bVar) {
    }

    public <T extends View> T findViewById(int i) {
        return mo766g().mo668i(i);
    }

    /* renamed from: g */
    public C0256e mo766g() {
        if (this.f669h == null) {
            this.f669h = C0256e.m800h(this, this);
        }
        return this.f669h;
    }

    public void invalidateOptionsMenu() {
        mo766g().mo673o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo768k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: l */
    public C0299b mo648l(C0299b.C0300a aVar) {
        return null;
    }

    /* renamed from: m */
    public boolean mo769m(int i) {
        return mo766g().mo682z(i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo766g().mo672n();
        super.onCreate(bundle);
        mo766g().mo675q(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo766g().mo681w();
    }

    public void setContentView(int i) {
        mo766g().mo660A(i);
    }

    public void setContentView(View view) {
        mo766g().mo661B(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo766g().mo662C(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo766g().mo664E(getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo766g().mo664E(charSequence);
    }
}

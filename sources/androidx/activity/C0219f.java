package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C1099i;
import androidx.lifecycle.C1110m;
import androidx.lifecycle.C1111n;
import kotlin.jvm.internal.C3357i;

/* renamed from: androidx.activity.f */
public class C0219f extends Dialog implements C1110m, C0221h {

    /* renamed from: f */
    private C1111n f416f;

    /* renamed from: g */
    private final OnBackPressedDispatcher f417g = new OnBackPressedDispatcher(new C0218e(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0219f(Context context, int i) {
        super(context, i);
        C3357i.m24508e(context, "context");
    }

    /* renamed from: c */
    private final C1111n m682c() {
        C1111n nVar = this.f416f;
        if (nVar != null) {
            return nVar;
        }
        C1111n nVar2 = new C1111n(this);
        this.f416f = nVar2;
        return nVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m683f(C0219f fVar) {
        C3357i.m24508e(fVar, "this$0");
        super.onBackPressed();
    }

    /* renamed from: a */
    public final C1099i mo491a() {
        return m682c();
    }

    /* renamed from: h */
    public final OnBackPressedDispatcher mo495h() {
        return this.f417g;
    }

    public void onBackPressed() {
        this.f417g.mo531c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m682c().mo3835h(C1099i.C1101b.ON_CREATE);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        m682c().mo3835h(C1099i.C1101b.ON_RESUME);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        m682c().mo3835h(C1099i.C1101b.ON_DESTROY);
        this.f416f = null;
        super.onStop();
    }
}

package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: androidx.core.view.accessibility.a */
public final class C0749a extends ClickableSpan {

    /* renamed from: f */
    private final int f2127f;

    /* renamed from: g */
    private final C0750b f2128g;

    /* renamed from: h */
    private final int f2129h;

    public C0749a(int i, C0750b bVar, int i2) {
        this.f2127f = i;
        this.f2128g = bVar;
        this.f2129h = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2127f);
        this.f2128g.mo2788F(this.f2129h, bundle);
    }
}

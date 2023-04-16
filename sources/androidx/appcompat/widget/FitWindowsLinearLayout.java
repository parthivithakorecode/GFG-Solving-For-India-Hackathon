package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C0474k0;

public class FitWindowsLinearLayout extends LinearLayout implements C0474k0 {

    /* renamed from: f */
    private C0474k0.C0475a f1144f;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0474k0.C0475a aVar = this.f1144f;
        if (aVar != null) {
            aVar.mo719a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0474k0.C0475a aVar) {
        this.f1144f = aVar;
    }
}

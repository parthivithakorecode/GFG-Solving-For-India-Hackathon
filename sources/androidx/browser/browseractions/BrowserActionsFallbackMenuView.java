package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p088m.C3633a;

public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: f */
    private final int f1701f = getResources().getDimensionPixelOffset(C3633a.browser_actions_context_menu_min_padding);

    /* renamed from: g */
    private final int f1702g = getResources().getDimensionPixelOffset(C3633a.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1701f * 2), this.f1702g), 1073741824), i2);
    }
}

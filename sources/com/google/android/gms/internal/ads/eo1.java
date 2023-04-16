package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;

public final /* synthetic */ class eo1 implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: f */
    public final /* synthetic */ View f6295f;

    /* renamed from: g */
    public final /* synthetic */ eu0 f6296g;

    /* renamed from: h */
    public final /* synthetic */ String f6297h;

    /* renamed from: i */
    public final /* synthetic */ WindowManager.LayoutParams f6298i;

    /* renamed from: j */
    public final /* synthetic */ int f6299j;

    /* renamed from: k */
    public final /* synthetic */ WindowManager f6300k;

    public /* synthetic */ eo1(View view, eu0 eu0, String str, WindowManager.LayoutParams layoutParams, int i, WindowManager windowManager) {
        this.f6295f = view;
        this.f6296g = eu0;
        this.f6297h = str;
        this.f6298i = layoutParams;
        this.f6299j = i;
        this.f6300k = windowManager;
    }

    public final void onScrollChanged() {
        View view = this.f6295f;
        eu0 eu0 = this.f6296g;
        String str = this.f6297h;
        WindowManager.LayoutParams layoutParams = this.f6298i;
        int i = this.f6299j;
        WindowManager windowManager = this.f6300k;
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect) && eu0.mo7105Y().getWindowToken() != null) {
            layoutParams.y = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - i;
            windowManager.updateViewLayout(eu0.mo7105Y(), layoutParams);
        }
    }
}

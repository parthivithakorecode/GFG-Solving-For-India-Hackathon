package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import p069j1.C3218x;

public final class ht1 extends FrameLayout {

    /* renamed from: f */
    private final C3218x f8423f;

    public ht1(Context context, View view, C3218x xVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f8423f = xVar;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f8423f.mo14127m(motionEvent);
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof eu0)) {
                arrayList.add((eu0) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((eu0) arrayList.get(i2)).destroy();
        }
    }
}

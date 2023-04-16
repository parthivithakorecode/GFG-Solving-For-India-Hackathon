package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0329f;
import androidx.appcompat.view.menu.C0330g;
import androidx.appcompat.view.menu.C0334i;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.p0 */
public class C0498p0 extends C0485n0 implements C0496o0 {

    /* renamed from: P */
    private static Method f1589P;

    /* renamed from: O */
    private C0496o0 f1590O;

    /* renamed from: androidx.appcompat.widget.p0$a */
    static class C0499a {
        /* renamed from: a */
        static void m2052a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        /* renamed from: b */
        static void m2053b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* renamed from: androidx.appcompat.widget.p0$b */
    static class C0500b {
        /* renamed from: a */
        static void m2054a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.p0$c */
    public static class C0501c extends C0466j0 {

        /* renamed from: t */
        final int f1591t;

        /* renamed from: u */
        final int f1592u;

        /* renamed from: v */
        private C0496o0 f1593v;

        /* renamed from: w */
        private MenuItem f1594w;

        /* renamed from: androidx.appcompat.widget.p0$c$a */
        static class C0502a {
            /* renamed from: a */
            static int m2057a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public C0501c(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != C0502a.m2057a(configuration)) {
                this.f1591t = 22;
                this.f1592u = 21;
                return;
            }
            this.f1591t = 21;
            this.f1592u = 22;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo2095d(int i, int i2, int i3, int i4, int i5) {
            return super.mo2095d(i, i2, i3, i4, i5);
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo2098e(MotionEvent motionEvent, int i) {
            return super.mo2098e(motionEvent, i);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.f1593v != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C0329f fVar = (C0329f) adapter;
                C0334i iVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < fVar.getCount()) {
                    iVar = fVar.getItem(i2);
                }
                MenuItem menuItem = this.f1594w;
                if (menuItem != iVar) {
                    C0330g b = fVar.mo1050b();
                    if (menuItem != null) {
                        this.f1593v.mo1036e(b, menuItem);
                    }
                    this.f1594w = iVar;
                    if (iVar != null) {
                        this.f1593v.mo1035d(b, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1591t) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1592u) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((C0329f) adapter).mo1050b().mo1100e(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(C0496o0 o0Var) {
            this.f1593v = o0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1589P = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0498p0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: N */
    public void mo2250N(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            C0499a.m2052a(this.f1557K, (Transition) obj);
        }
    }

    /* renamed from: O */
    public void mo2251O(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            C0499a.m2053b(this.f1557K, (Transition) obj);
        }
    }

    /* renamed from: P */
    public void mo2252P(C0496o0 o0Var) {
        this.f1590O = o0Var;
    }

    /* renamed from: Q */
    public void mo2253Q(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1589P;
            if (method != null) {
                try {
                    method.invoke(this.f1557K, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            C0500b.m2054a(this.f1557K, z);
        }
    }

    /* renamed from: d */
    public void mo1035d(C0330g gVar, MenuItem menuItem) {
        C0496o0 o0Var = this.f1590O;
        if (o0Var != null) {
            o0Var.mo1035d(gVar, menuItem);
        }
    }

    /* renamed from: e */
    public void mo1036e(C0330g gVar, MenuItem menuItem) {
        C0496o0 o0Var = this.f1590O;
        if (o0Var != null) {
            o0Var.mo1036e(gVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C0466j0 mo2221s(Context context, boolean z) {
        C0501c cVar = new C0501c(context, z);
        cVar.setHoverListener(this);
        return cVar;
    }
}

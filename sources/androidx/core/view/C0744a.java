package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.C0750b;
import androidx.core.view.accessibility.C0752c;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p109p.C3879e;

/* renamed from: androidx.core.view.a */
public class C0744a {

    /* renamed from: c */
    private static final View.AccessibilityDelegate f2122c = new View.AccessibilityDelegate();

    /* renamed from: a */
    private final View.AccessibilityDelegate f2123a;

    /* renamed from: b */
    private final View.AccessibilityDelegate f2124b;

    /* renamed from: androidx.core.view.a$a */
    static final class C0745a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C0744a f2125a;

        C0745a(C0744a aVar) {
            this.f2125a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2125a.mo2763a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0752c b = this.f2125a.mo2764b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.mo2821a();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2125a.mo2766f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C0750b P = C0750b.m2982P(accessibilityNodeInfo);
            P.mo2792L(C0833y.m3318C(view));
            P.mo2790J(C0833y.m3370z(view));
            P.mo2791K(C0833y.m3357m(view));
            P.mo2794N(C0833y.m3366v(view));
            this.f2125a.mo2767g(view, P);
            P.mo2797c(accessibilityNodeInfo.getText(), view);
            List<C0750b.C0751a> c = C0744a.m2961c(view);
            for (int i = 0; i < c.size(); i++) {
                P.mo2796a(c.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2125a.mo2768h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2125a.mo2769i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f2125a.mo2770j(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f2125a.mo2771l(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2125a.mo2772m(view, accessibilityEvent);
        }
    }

    /* renamed from: androidx.core.view.a$b */
    static class C0746b {
        /* renamed from: a */
        static AccessibilityNodeProvider m2974a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        /* renamed from: b */
        static boolean m2975b(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    public C0744a() {
        this(f2122c);
    }

    public C0744a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2123a = accessibilityDelegate;
        this.f2124b = new C0745a(this);
    }

    /* renamed from: c */
    static List<C0750b.C0751a> m2961c(View view) {
        List<C0750b.C0751a> list = (List) view.getTag(C3879e.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: e */
    private boolean m2962e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] l = C0750b.m2987l(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (l != null && i < l.length) {
                if (clickableSpan.equals(l[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m2963k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C3879e.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m2962e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: a */
    public boolean mo2763a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2123a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C0752c mo2764b(View view) {
        AccessibilityNodeProvider a;
        if (Build.VERSION.SDK_INT < 16 || (a = C0746b.m2974a(this.f2123a, view)) == null) {
            return null;
        }
        return new C0752c(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public View.AccessibilityDelegate mo2765d() {
        return this.f2124b;
    }

    /* renamed from: f */
    public void mo2766f(View view, AccessibilityEvent accessibilityEvent) {
        this.f2123a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo2767g(View view, C0750b bVar) {
        this.f2123a.onInitializeAccessibilityNodeInfo(view, bVar.mo2795O());
    }

    /* renamed from: h */
    public void mo2768h(View view, AccessibilityEvent accessibilityEvent) {
        this.f2123a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo2769i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2123a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo2770j(View view, int i, Bundle bundle) {
        List<C0750b.C0751a> c = m2961c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= c.size()) {
                break;
            }
            C0750b.C0751a aVar = c.get(i2);
            if (aVar.mo2816a() == i) {
                z = aVar.mo2818c(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = C0746b.m2975b(this.f2123a, view, i, bundle);
        }
        return (z || i != C3879e.accessibility_action_clickable_span || bundle == null) ? z : m2963k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: l */
    public void mo2771l(View view, int i) {
        this.f2123a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: m */
    public void mo2772m(View view, AccessibilityEvent accessibilityEvent) {
        this.f2123a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}

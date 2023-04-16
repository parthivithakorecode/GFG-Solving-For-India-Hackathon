package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p009os.C0678e;
import androidx.core.view.C0767b0;
import androidx.core.view.C0830v;
import androidx.core.view.C0833y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.z */
public abstract class C1060z {

    /* renamed from: androidx.fragment.app.z$a */
    class C1061a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f2901f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f2902g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f2903h;

        /* renamed from: i */
        final /* synthetic */ ArrayList f2904i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f2905j;

        C1061a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2901f = i;
            this.f2902g = arrayList;
            this.f2903h = arrayList2;
            this.f2904i = arrayList3;
            this.f2905j = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f2901f; i++) {
                C0833y.m3341Z((View) this.f2902g.get(i), (String) this.f2903h.get(i));
                C0833y.m3341Z((View) this.f2904i.get(i), (String) this.f2905j.get(i));
            }
        }
    }

    /* renamed from: androidx.fragment.app.z$b */
    class C1062b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2907f;

        /* renamed from: g */
        final /* synthetic */ Map f2908g;

        C1062b(ArrayList arrayList, Map map) {
            this.f2907f = arrayList;
            this.f2908g = map;
        }

        public void run() {
            int size = this.f2907f.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f2907f.get(i);
                String w = C0833y.m3367w(view);
                if (w != null) {
                    C0833y.m3341Z(view, C1060z.m4457i(this.f2908g, w));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.z$c */
    class C1063c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2910f;

        /* renamed from: g */
        final /* synthetic */ Map f2911g;

        C1063c(ArrayList arrayList, Map map) {
            this.f2910f = arrayList;
            this.f2911g = map;
        }

        public void run() {
            int size = this.f2910f.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f2910f.get(i);
                C0833y.m3341Z(view, (String) this.f2911g.get(C0833y.m3367w(view)));
            }
        }
    }

    /* renamed from: d */
    protected static void m4455d(List<View> list, View view) {
        int size = list.size();
        if (!m4456h(list, view, size)) {
            if (C0833y.m3367w(view) != null) {
                list.add(view);
            }
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m4456h(list, childAt, size) && C0833y.m3367w(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private static boolean m4456h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    static String m4457i(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    /* renamed from: l */
    protected static boolean m4458l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract void mo3737A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: B */
    public abstract Object mo3738B(Object obj);

    /* renamed from: a */
    public abstract void mo3739a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo3740b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo3741c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo3742e(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3771f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean a = C0767b0.m3044a(viewGroup2);
                viewGroup = viewGroup2;
                if (!a) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        mo3771f(arrayList, viewGroup2.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup);
        }
    }

    /* renamed from: g */
    public abstract Object mo3743g(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3772j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String w = C0833y.m3367w(view);
            if (w != null) {
                map.put(w, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo3772j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo3773k(View view, Rect rect) {
        if (C0833y.m3316A(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: m */
    public abstract Object mo3744m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo3745n(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public ArrayList<String> mo3774o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C0833y.m3367w(view));
            C0833y.m3341Z(view, (String) null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo3746p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo3747q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract void mo3748r(Object obj, View view, ArrayList<View> arrayList);

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3775s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        C0830v.m3313a(viewGroup, new C1063c(arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo3749t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: u */
    public abstract void mo3750u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo3751v(Object obj, View view);

    /* renamed from: w */
    public void mo3752w(Fragment fragment, Object obj, C0678e eVar, Runnable runnable) {
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo3776x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        C0830v.m3313a(view, new C1062b(arrayList, map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo3777y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String w = C0833y.m3367w(view2);
            arrayList4.add(w);
            if (w != null) {
                C0833y.m3341Z(view2, (String) null);
                String str = map.get(w);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C0833y.m3341Z(arrayList2.get(i2), w);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        C0830v.m3313a(view, new C1061a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: z */
    public abstract void mo3753z(Object obj, View view, ArrayList<View> arrayList);
}

package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.l */
class C1007l implements LayoutInflater.Factory2 {

    /* renamed from: f */
    final C1011n f2703f;

    /* renamed from: androidx.fragment.app.l$a */
    class C1008a implements View.OnAttachStateChangeListener {

        /* renamed from: f */
        final /* synthetic */ C1039u f2704f;

        C1008a(C1039u uVar) {
            this.f2704f = uVar;
        }

        public void onViewAttachedToWindow(View view) {
            Fragment k = this.f2704f.mo3689k();
            this.f2704f.mo3690m();
            C0974c0.m4045n((ViewGroup) k.f2475M.getParent(), C1007l.this.f2703f).mo3422j();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    C1007l(C1011n nVar) {
        this.f2703f = nVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r8 = this;
            java.lang.Class<androidx.fragment.app.h> r0 = androidx.fragment.app.C1003h.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0014
            androidx.fragment.app.h r9 = new androidx.fragment.app.h
            androidx.fragment.app.n r10 = r8.f2703f
            r9.<init>(r11, r12, r10)
            return r9
        L_0x0014:
            java.lang.String r0 = "fragment"
            boolean r10 = r0.equals(r10)
            r0 = 0
            if (r10 != 0) goto L_0x001e
            return r0
        L_0x001e:
            java.lang.String r10 = "class"
            java.lang.String r10 = r12.getAttributeValue(r0, r10)
            int[] r1 = p158x.C4275c.f22554d
            android.content.res.TypedArray r1 = r11.obtainStyledAttributes(r12, r1)
            if (r10 != 0) goto L_0x0032
            int r10 = p158x.C4275c.f22555e
            java.lang.String r10 = r1.getString(r10)
        L_0x0032:
            int r2 = p158x.C4275c.f22556f
            r3 = -1
            int r2 = r1.getResourceId(r2, r3)
            int r4 = p158x.C4275c.f22557g
            java.lang.String r4 = r1.getString(r4)
            r1.recycle()
            if (r10 == 0) goto L_0x01c2
            java.lang.ClassLoader r1 = r11.getClassLoader()
            boolean r1 = androidx.fragment.app.C1005j.m4163b(r1, r10)
            if (r1 != 0) goto L_0x0050
            goto L_0x01c2
        L_0x0050:
            if (r9 == 0) goto L_0x0057
            int r1 = r9.getId()
            goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            if (r1 != r3) goto L_0x007d
            if (r2 != r3) goto L_0x007d
            if (r4 == 0) goto L_0x005f
            goto L_0x007d
        L_0x005f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r12.getPositionDescription()
            r11.append(r12)
            java.lang.String r12 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x007d:
            if (r2 == r3) goto L_0x0085
            androidx.fragment.app.n r0 = r8.f2703f
            androidx.fragment.app.Fragment r0 = r0.mo3601g0(r2)
        L_0x0085:
            if (r0 != 0) goto L_0x008f
            if (r4 == 0) goto L_0x008f
            androidx.fragment.app.n r0 = r8.f2703f
            androidx.fragment.app.Fragment r0 = r0.mo3604h0(r4)
        L_0x008f:
            if (r0 != 0) goto L_0x0099
            if (r1 == r3) goto L_0x0099
            androidx.fragment.app.n r0 = r8.f2703f
            androidx.fragment.app.Fragment r0 = r0.mo3601g0(r1)
        L_0x0099:
            java.lang.String r3 = "Fragment "
            java.lang.String r5 = "FragmentManager"
            r6 = 2
            r7 = 1
            if (r0 != 0) goto L_0x0102
            androidx.fragment.app.n r0 = r8.f2703f
            androidx.fragment.app.j r0 = r0.mo3615p0()
            java.lang.ClassLoader r11 = r11.getClassLoader()
            androidx.fragment.app.Fragment r0 = r0.mo3528a(r11, r10)
            r0.f2507s = r7
            if (r2 == 0) goto L_0x00b5
            r11 = r2
            goto L_0x00b6
        L_0x00b5:
            r11 = r1
        L_0x00b6:
            r0.f2464B = r11
            r0.f2465C = r1
            r0.f2466D = r4
            r0.f2508t = r7
            androidx.fragment.app.n r11 = r8.f2703f
            r0.f2512x = r11
            androidx.fragment.app.k r11 = r11.mo3619s0()
            r0.f2513y = r11
            androidx.fragment.app.n r11 = r8.f2703f
            androidx.fragment.app.k r11 = r11.mo3619s0()
            android.content.Context r11 = r11.mo3530j()
            android.os.Bundle r1 = r0.f2495g
            r0.mo3333v0(r11, r12, r1)
            androidx.fragment.app.n r11 = r8.f2703f
            androidx.fragment.app.u r11 = r11.mo3600g(r0)
            boolean r12 = androidx.fragment.app.C1011n.m4190E0(r6)
            if (r12 == 0) goto L_0x013d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
            r12.append(r0)
            java.lang.String r1 = " has been inflated via the <fragment> tag: id=0x"
        L_0x00f0:
            r12.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r2)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            android.util.Log.v(r5, r12)
            goto L_0x013d
        L_0x0102:
            boolean r11 = r0.f2508t
            if (r11 != 0) goto L_0x0184
            r0.f2508t = r7
            androidx.fragment.app.n r11 = r8.f2703f
            r0.f2512x = r11
            androidx.fragment.app.k r11 = r11.mo3619s0()
            r0.f2513y = r11
            androidx.fragment.app.n r11 = r8.f2703f
            androidx.fragment.app.k r11 = r11.mo3619s0()
            android.content.Context r11 = r11.mo3530j()
            android.os.Bundle r1 = r0.f2495g
            r0.mo3333v0(r11, r12, r1)
            androidx.fragment.app.n r11 = r8.f2703f
            androidx.fragment.app.u r11 = r11.mo3624v(r0)
            boolean r12 = androidx.fragment.app.C1011n.m4190E0(r6)
            if (r12 == 0) goto L_0x013d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Retained Fragment "
            r12.append(r1)
            r12.append(r0)
            java.lang.String r1 = " has been re-attached via the <fragment> tag: id=0x"
            goto L_0x00f0
        L_0x013d:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r0.f2474L = r9
            r11.mo3690m()
            r11.mo3688j()
            android.view.View r9 = r0.f2475M
            if (r9 == 0) goto L_0x016a
            if (r2 == 0) goto L_0x0150
            r9.setId(r2)
        L_0x0150:
            android.view.View r9 = r0.f2475M
            java.lang.Object r9 = r9.getTag()
            if (r9 != 0) goto L_0x015d
            android.view.View r9 = r0.f2475M
            r9.setTag(r4)
        L_0x015d:
            android.view.View r9 = r0.f2475M
            androidx.fragment.app.l$a r10 = new androidx.fragment.app.l$a
            r10.<init>(r11)
            r9.addOnAttachStateChangeListener(r10)
            android.view.View r9 = r0.f2475M
            return r9
        L_0x016a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            r11.append(r10)
            java.lang.String r10 = " did not create a view."
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x0184:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r12.getPositionDescription()
            r11.append(r12)
            java.lang.String r12 = ": Duplicate id 0x"
            r11.append(r12)
            java.lang.String r12 = java.lang.Integer.toHexString(r2)
            r11.append(r12)
            java.lang.String r12 = ", tag "
            r11.append(r12)
            r11.append(r4)
            java.lang.String r12 = ", or parent id 0x"
            r11.append(r12)
            java.lang.String r12 = java.lang.Integer.toHexString(r1)
            r11.append(r12)
            java.lang.String r12 = " with another fragment for "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x01c2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1007l.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}

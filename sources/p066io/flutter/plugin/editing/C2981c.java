package p066io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import p099n3.C3768b;
import p174z3.C4591p;

/* renamed from: io.flutter.plugin.editing.c */
class C2981c extends SpannableStringBuilder {

    /* renamed from: f */
    private int f19890f = 0;

    /* renamed from: g */
    private int f19891g = 0;

    /* renamed from: h */
    private ArrayList<C2983b> f19892h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<C2983b> f19893i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C2985e> f19894j = new ArrayList<>();

    /* renamed from: k */
    private String f19895k;

    /* renamed from: l */
    private String f19896l;

    /* renamed from: m */
    private int f19897m;

    /* renamed from: n */
    private int f19898n;

    /* renamed from: o */
    private int f19899o;

    /* renamed from: p */
    private int f19900p;

    /* renamed from: q */
    private BaseInputConnection f19901q;

    /* renamed from: io.flutter.plugin.editing.c$a */
    class C2982a extends BaseInputConnection {

        /* renamed from: a */
        final /* synthetic */ Editable f19902a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2982a(View view, boolean z, Editable editable) {
            super(view, z);
            this.f19902a = editable;
        }

        public Editable getEditable() {
            return this.f19902a;
        }
    }

    /* renamed from: io.flutter.plugin.editing.c$b */
    interface C2983b {
        /* renamed from: a */
        void mo13558a(boolean z, boolean z2, boolean z3);
    }

    public C2981c(C4591p.C4597e eVar, View view) {
        this.f19901q = new C2982a(view, true, this);
        if (eVar != null) {
            mo13590n(eVar);
        }
    }

    /* renamed from: j */
    private void m23115j(C2983b bVar, boolean z, boolean z2, boolean z3) {
        this.f19891g++;
        bVar.mo13558a(z, z2, z3);
        this.f19891g--;
    }

    /* renamed from: k */
    private void m23116k(boolean z, boolean z2, boolean z3) {
        if (z || z2 || z3) {
            Iterator<C2983b> it = this.f19892h.iterator();
            while (it.hasNext()) {
                m23115j(it.next(), z, z2, z3);
            }
        }
    }

    /* renamed from: a */
    public void mo13579a(C2983b bVar) {
        ArrayList<C2983b> arrayList;
        if (this.f19891g > 0) {
            C3768b.m25588b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f19890f > 0) {
            C3768b.m25593g("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            arrayList = this.f19893i;
        } else {
            arrayList = this.f19892h;
        }
        arrayList.add(bVar);
    }

    /* renamed from: b */
    public void mo13580b() {
        this.f19890f++;
        if (this.f19891g > 0) {
            C3768b.m25588b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f19890f == 1 && !this.f19892h.isEmpty()) {
            this.f19896l = toString();
            this.f19897m = mo13587i();
            this.f19898n = mo13586h();
            this.f19899o = mo13585g();
            this.f19900p = mo13584f();
        }
    }

    /* renamed from: c */
    public void mo13581c() {
        this.f19894j.clear();
    }

    /* renamed from: d */
    public void mo13582d() {
        int i = this.f19890f;
        if (i == 0) {
            C3768b.m25588b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i == 1) {
            Iterator<C2983b> it = this.f19893i.iterator();
            while (it.hasNext()) {
                m23115j(it.next(), true, true, true);
            }
            if (!this.f19892h.isEmpty()) {
                C3768b.m25592f("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f19892h.size()) + " listener(s)");
                boolean equals = toString().equals(this.f19896l) ^ true;
                boolean z = false;
                boolean z2 = (this.f19897m == mo13587i() && this.f19898n == mo13586h()) ? false : true;
                if (!(this.f19899o == mo13585g() && this.f19900p == mo13584f())) {
                    z = true;
                }
                m23116k(equals, z2, z);
            }
        }
        this.f19892h.addAll(this.f19893i);
        this.f19893i.clear();
        this.f19890f--;
    }

    /* renamed from: e */
    public ArrayList<C2985e> mo13583e() {
        ArrayList<C2985e> arrayList = new ArrayList<>(this.f19894j);
        this.f19894j.clear();
        return arrayList;
    }

    /* renamed from: f */
    public final int mo13584f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    /* renamed from: g */
    public final int mo13585g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    /* renamed from: h */
    public final int mo13586h() {
        return Selection.getSelectionEnd(this);
    }

    /* renamed from: i */
    public final int mo13587i() {
        return Selection.getSelectionStart(this);
    }

    /* renamed from: l */
    public void mo13588l(C2983b bVar) {
        if (this.f19891g > 0) {
            C3768b.m25588b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f19892h.remove(bVar);
        if (this.f19890f > 0) {
            this.f19893i.remove(bVar);
        }
    }

    /* renamed from: m */
    public void mo13589m(int i, int i2) {
        if (i < 0 || i >= i2) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f19901q.setComposingRegion(i, i2);
        }
    }

    /* renamed from: n */
    public void mo13590n(C4591p.C4597e eVar) {
        mo13580b();
        replace(0, length(), eVar.f23236a);
        if (eVar.mo16268c()) {
            Selection.setSelection(this, eVar.f23237b, eVar.f23238c);
        } else {
            Selection.removeSelection(this);
        }
        mo13589m(eVar.f23239d, eVar.f23240e);
        mo13581c();
        mo13582d();
    }

    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        boolean z;
        boolean z2;
        if (this.f19891g > 0) {
            C3768b.m25588b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String cVar = toString();
        int i5 = i2 - i;
        boolean z3 = i5 != i4 - i3;
        for (int i6 = 0; i6 < i5 && !z3; i6++) {
            z3 |= charAt(i + i6) != charSequence.charAt(i3 + i6);
        }
        CharSequence charSequence2 = charSequence;
        if (z3) {
            this.f19895k = null;
        }
        int i7 = mo13587i();
        int h = mo13586h();
        int g = mo13585g();
        int f = mo13584f();
        SpannableStringBuilder replace = super.replace(i, i2, charSequence, i3, i4);
        C2985e eVar = r1;
        boolean z4 = z3;
        int i8 = f;
        C2985e eVar2 = new C2985e(cVar, i, i2, charSequence, mo13587i(), mo13586h(), mo13585g(), mo13584f());
        this.f19894j.add(eVar);
        if (this.f19890f > 0) {
            return replace;
        }
        boolean z5 = (mo13587i() == i7 && mo13586h() == h) ? false : true;
        if (mo13585g() == g && mo13584f() == i8) {
            z = z4;
            z2 = false;
        } else {
            z = z4;
            z2 = true;
        }
        m23116k(z, z5, z2);
        return replace;
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        super.setSpan(obj, i, i2, i3);
        this.f19894j.add(new C2985e(toString(), mo13587i(), mo13586h(), mo13585g(), mo13584f()));
    }

    public String toString() {
        String str = this.f19895k;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f19895k = spannableStringBuilder;
        return spannableStringBuilder;
    }
}

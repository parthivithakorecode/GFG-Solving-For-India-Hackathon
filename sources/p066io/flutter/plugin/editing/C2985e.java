package p066io.flutter.plugin.editing;

import org.json.JSONException;
import org.json.JSONObject;
import p099n3.C3768b;

/* renamed from: io.flutter.plugin.editing.e */
public final class C2985e {

    /* renamed from: a */
    private CharSequence f19908a;

    /* renamed from: b */
    private CharSequence f19909b;

    /* renamed from: c */
    private int f19910c;

    /* renamed from: d */
    private int f19911d;

    /* renamed from: e */
    private int f19912e;

    /* renamed from: f */
    private int f19913f;

    /* renamed from: g */
    private int f19914g;

    /* renamed from: h */
    private int f19915h;

    public C2985e(CharSequence charSequence, int i, int i2, int i3, int i4) {
        this.f19912e = i;
        this.f19913f = i2;
        this.f19914g = i3;
        this.f19915h = i4;
        m23133a(charSequence, "", -1, -1);
    }

    public C2985e(CharSequence charSequence, int i, int i2, CharSequence charSequence2, int i3, int i4, int i5, int i6) {
        this.f19912e = i3;
        this.f19913f = i4;
        this.f19914g = i5;
        this.f19915h = i6;
        m23133a(charSequence, charSequence2.toString(), i, i2);
    }

    /* renamed from: a */
    private void m23133a(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        this.f19908a = charSequence;
        this.f19909b = charSequence2;
        this.f19910c = i;
        this.f19911d = i2;
    }

    /* renamed from: b */
    public JSONObject mo13600b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.f19908a.toString());
            jSONObject.put("deltaText", this.f19909b.toString());
            jSONObject.put("deltaStart", this.f19910c);
            jSONObject.put("deltaEnd", this.f19911d);
            jSONObject.put("selectionBase", this.f19912e);
            jSONObject.put("selectionExtent", this.f19913f);
            jSONObject.put("composingBase", this.f19914g);
            jSONObject.put("composingExtent", this.f19915h);
        } catch (JSONException e) {
            C3768b.m25588b("TextEditingDelta", "unable to create JSONObject: " + e);
        }
        return jSONObject;
    }
}

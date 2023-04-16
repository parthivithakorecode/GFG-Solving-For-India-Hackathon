package p166y1;

import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import p003a2.C0092o;
import p102o.C3801a;
import p160x1.C4280b;
import p172z1.C4489b;

/* renamed from: y1.c */
public class C4377c extends Exception {

    /* renamed from: f */
    private final C3801a<C4489b<?>, C4280b> f22731f;

    public C4377c(@RecentlyNonNull C3801a<C4489b<?>, C4280b> aVar) {
        this.f22731f = aVar;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C4489b next : this.f22731f.keySet()) {
            C4280b bVar = (C4280b) C0092o.m313i(this.f22731f.get(next));
            z &= !bVar.mo15846g();
            String b = next.mo16125b();
            String valueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2 + valueOf.length());
            sb.append(b);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}

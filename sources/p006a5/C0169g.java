package p006a5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C3357i;
import kotlin.jvm.internal.C3358j;
import p038f.C2591j;
import p145u4.C4150l;

/* renamed from: a5.g */
class C0169g extends C0168f {

    /* renamed from: a5.g$a */
    static final class C0170a extends C3358j implements C4150l<String, String> {

        /* renamed from: f */
        public static final C0170a f300f = new C0170a();

        C0170a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(String str) {
            C3357i.m24508e(str, "line");
            return str;
        }
    }

    /* renamed from: a5.g$b */
    static final class C0171b extends C3358j implements C4150l<String, String> {

        /* renamed from: f */
        final /* synthetic */ String f301f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0171b(String str) {
            super(1);
            this.f301f = str;
        }

        /* renamed from: a */
        public final String invoke(String str) {
            C3357i.m24508e(str, "line");
            return this.f301f + str;
        }
    }

    /* renamed from: b */
    private static final C4150l<String, String> m500b(String str) {
        return str.length() == 0 ? C0170a.f300f : new C0171b(str);
    }

    /* renamed from: c */
    private static final int m501c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!C0161a.m472c(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        return i == -1 ? str.length() : i;
    }

    /* renamed from: d */
    public static final String m502d(String str, String str2) {
        String invoke;
        C3357i.m24508e(str, "<this>");
        C3357i.m24508e(str2, "newIndent");
        List<String> G = C0179o.m520G(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (T next : G) {
            if (!C0178n.m510j((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C3586j.m25035h(arrayList, 10));
        for (String c : arrayList) {
            arrayList2.add(Integer.valueOf(m501c(c)));
        }
        Integer num = (Integer) C3593q.m25048s(arrayList2);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * G.size());
        C4150l<String, String> b = m500b(str2);
        int c2 = C3585i.m25030c(G);
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : G) {
            int i2 = i + 1;
            if (i < 0) {
                C3585i.m25034g();
            }
            String str3 = (String) next2;
            if ((i == 0 || i == c2) && C0178n.m510j(str3)) {
                str3 = null;
            } else {
                String h0 = C0184q.m563h0(str3, intValue);
                if (!(h0 == null || (invoke = b.invoke(h0)) == null)) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i = i2;
        }
        String sb = ((StringBuilder) C3593q.m25043n(arrayList3, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C4150l) null, C2591j.f18745K0, (Object) null)).toString();
        C3357i.m24507d(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    /* renamed from: e */
    public static String m503e(String str) {
        C3357i.m24508e(str, "<this>");
        return m502d(str, "");
    }
}

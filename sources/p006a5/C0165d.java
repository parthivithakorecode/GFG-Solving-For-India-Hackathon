package p006a5;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;

/* renamed from: a5.d */
public final class C0165d implements Serializable {

    /* renamed from: g */
    public static final C0166a f298g = new C0166a((C3353e) null);

    /* renamed from: f */
    private final Pattern f299f;

    /* renamed from: a5.d$a */
    public static final class C0166a {
        private C0166a() {
        }

        public /* synthetic */ C0166a(C3353e eVar) {
            this();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0165d(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.C3357i.m24508e(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.C3357i.m24507d(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p006a5.C0165d.<init>(java.lang.String):void");
    }

    public C0165d(Pattern pattern) {
        C3357i.m24508e(pattern, "nativePattern");
        this.f299f = pattern;
    }

    /* renamed from: a */
    public final String mo362a(CharSequence charSequence, String str) {
        C3357i.m24508e(charSequence, "input");
        C3357i.m24508e(str, "replacement");
        String replaceAll = this.f299f.matcher(charSequence).replaceAll(str);
        C3357i.m24507d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public String toString() {
        String pattern = this.f299f.toString();
        C3357i.m24507d(pattern, "nativePattern.toString()");
        return pattern;
    }
}

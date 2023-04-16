package p131s2;

import androidx.annotation.RecentlyNonNull;

/* renamed from: s2.b */
public final class C4020b extends IllegalStateException {
    private C4020b(String str, Throwable th) {
        super(str, th);
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static IllegalStateException m26304a(@RecentlyNonNull C4028h<?> hVar) {
        String str;
        if (!hVar.mo15514l()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception i = hVar.mo15511i();
        if (i != null) {
            str = "failure";
        } else if (hVar.mo15515m()) {
            String valueOf = String.valueOf(hVar.mo15512j());
            StringBuilder sb = new StringBuilder(valueOf.length() + 7);
            sb.append("result ");
            sb.append(valueOf);
            str = sb.toString();
        } else {
            str = hVar.mo15513k() ? "cancellation" : "unknown issue";
        }
        String valueOf2 = String.valueOf(str);
        return new C4020b(valueOf2.length() != 0 ? "Complete with: ".concat(valueOf2) : new String("Complete with: "), i);
    }
}

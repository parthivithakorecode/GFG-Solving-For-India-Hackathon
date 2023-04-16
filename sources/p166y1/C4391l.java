package p166y1;

import androidx.annotation.RecentlyNonNull;
import p160x1.C4282d;

/* renamed from: y1.l */
public final class C4391l extends UnsupportedOperationException {

    /* renamed from: f */
    private final C4282d f22748f;

    public C4391l(@RecentlyNonNull C4282d dVar) {
        this.f22748f = dVar;
    }

    @RecentlyNonNull
    public String getMessage() {
        String valueOf = String.valueOf(this.f22748f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}

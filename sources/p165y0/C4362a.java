package p165y0;

import androidx.annotation.RecentlyNonNull;

/* renamed from: y0.a */
public enum C4362a {
    INVALID_REQUEST("Invalid Ad request."),
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");
    

    /* renamed from: f */
    private final String f22714f;

    private C4362a(String str) {
        this.f22714f = str;
    }

    @RecentlyNonNull
    public String toString() {
        return this.f22714f;
    }
}

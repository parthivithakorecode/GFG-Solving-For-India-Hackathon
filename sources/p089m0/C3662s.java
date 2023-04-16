package p089m0;

/* renamed from: m0.s */
public enum C3662s {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    /* renamed from: b */
    public boolean mo14822b() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}

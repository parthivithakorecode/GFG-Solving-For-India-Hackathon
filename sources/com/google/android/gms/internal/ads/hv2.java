package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;

final class hv2 implements g42 {

    /* renamed from: a */
    private Message f8438a;

    /* renamed from: b */
    private iw2 f8439b;

    private hv2() {
    }

    /* synthetic */ hv2(gu2 gu2) {
    }

    /* renamed from: c */
    private final void m10796c() {
        this.f8438a = null;
        this.f8439b = null;
        iw2.m11306a(this);
    }

    /* renamed from: a */
    public final hv2 mo8028a(Message message, iw2 iw2) {
        this.f8438a = message;
        this.f8439b = iw2;
        return this;
    }

    /* renamed from: b */
    public final boolean mo8029b(Handler handler) {
        Message message = this.f8438a;
        Objects.requireNonNull(message);
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        m10796c();
        return sendMessageAtFrontOfQueue;
    }

    public final void zza() {
        Message message = this.f8438a;
        Objects.requireNonNull(message);
        message.sendToTarget();
        m10796c();
    }
}

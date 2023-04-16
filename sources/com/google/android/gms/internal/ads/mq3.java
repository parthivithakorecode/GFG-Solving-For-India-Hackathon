package com.google.android.gms.internal.ads;

import java.io.IOException;

public class mq3 extends IOException {

    /* renamed from: f */
    private kr3 f11008f = null;

    /* renamed from: g */
    private boolean f11009g;

    public mq3(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public mq3(String str) {
        super(str);
    }

    /* renamed from: a */
    static lq3 m13451a() {
        return new lq3("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    static mq3 m13452b() {
        return new mq3("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: c */
    static mq3 m13453c() {
        return new mq3("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    static mq3 m13454d() {
        return new mq3("Protocol message had invalid UTF-8.");
    }

    /* renamed from: e */
    static mq3 m13455e() {
        return new mq3("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    static mq3 m13456f() {
        return new mq3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: g */
    static mq3 m13457g() {
        return new mq3("Failed to parse the message.");
    }

    /* renamed from: i */
    static mq3 m13458i() {
        return new mq3("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: j */
    static mq3 m13459j() {
        return new mq3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: h */
    public final mq3 mo9351h(kr3 kr3) {
        this.f11008f = kr3;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo9352k() {
        this.f11009g = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo9353l() {
        return this.f11009g;
    }
}

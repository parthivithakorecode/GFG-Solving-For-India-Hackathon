package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.Objects;

final class j93 extends OutputStream {
    j93() {
    }

    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    public final void write(int i) {
    }

    public final void write(byte[] bArr) {
        Objects.requireNonNull(bArr);
    }

    public final void write(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr);
    }
}

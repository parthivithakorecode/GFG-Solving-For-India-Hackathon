package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

final class dt0 extends SSLSocketFactory {

    /* renamed from: a */
    final SSLSocketFactory f5912a = ((SSLSocketFactory) SSLSocketFactory.getDefault());

    /* renamed from: b */
    final /* synthetic */ et0 f5913b;

    dt0(et0 et0) {
        this.f5913b = et0;
    }

    /* renamed from: a */
    private final Socket m8085a(Socket socket) {
        if (this.f5913b.f6374s > 0) {
            socket.setReceiveBufferSize(this.f5913b.f6374s);
        }
        this.f5913b.f6375t.add(socket);
        return socket;
    }

    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f5912a.createSocket(str, i);
        m8085a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f5912a.createSocket(str, i, inetAddress, i2);
        m8085a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f5912a.createSocket(inetAddress, i);
        m8085a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.f5912a.createSocket(inetAddress, i, inetAddress2, i2);
        m8085a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.f5912a.createSocket(socket, str, i, z);
        m8085a(createSocket);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.f5912a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f5912a.getSupportedCipherSuites();
    }
}

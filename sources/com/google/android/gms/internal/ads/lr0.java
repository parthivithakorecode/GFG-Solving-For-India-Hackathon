package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

final class lr0 extends SSLSocketFactory {

    /* renamed from: a */
    final SSLSocketFactory f10129a = ((SSLSocketFactory) SSLSocketFactory.getDefault());

    /* renamed from: b */
    final /* synthetic */ nr0 f10130b;

    lr0(nr0 nr0) {
        this.f10130b = nr0;
    }

    /* renamed from: a */
    private final Socket m12829a(Socket socket) {
        if (this.f10130b.f11619o > 0) {
            socket.setReceiveBufferSize(this.f10130b.f11619o);
        }
        this.f10130b.f11620p.add(socket);
        return socket;
    }

    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f10129a.createSocket(str, i);
        m12829a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f10129a.createSocket(str, i, inetAddress, i2);
        m12829a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f10129a.createSocket(inetAddress, i);
        m12829a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.f10129a.createSocket(inetAddress, i, inetAddress2, i2);
        m12829a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.f10129a.createSocket(socket, str, i, z);
        m12829a(createSocket);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.f10129a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f10129a.getSupportedCipherSuites();
    }
}

package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

public final class ka4 extends eb1 {

    /* renamed from: e */
    private final byte[] f9451e;

    /* renamed from: f */
    private final DatagramPacket f9452f;

    /* renamed from: g */
    private Uri f9453g;

    /* renamed from: h */
    private DatagramSocket f9454h;

    /* renamed from: i */
    private MulticastSocket f9455i;

    /* renamed from: j */
    private InetAddress f9456j;

    /* renamed from: k */
    private InetSocketAddress f9457k;

    /* renamed from: l */
    private boolean f9458l;

    /* renamed from: m */
    private int f9459m;

    public ka4(int i) {
        super(true);
        byte[] bArr = new byte[2000];
        this.f9451e = bArr;
        this.f9452f = new DatagramPacket(bArr, 0, 2000);
    }

    /* renamed from: a */
    public final int mo5752a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f9459m == 0) {
            try {
                this.f9454h.receive(this.f9452f);
                int length = this.f9452f.getLength();
                this.f9459m = length;
                mo6893o(length);
            } catch (SocketTimeoutException e) {
                throw new ja4(e, 2002);
            } catch (IOException e2) {
                throw new ja4(e2, 2001);
            }
        }
        int length2 = this.f9452f.getLength();
        int i3 = this.f9459m;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f9451e, length2 - i3, bArr, i, min);
        this.f9459m -= min;
        return min;
    }

    /* renamed from: h */
    public final Uri mo5753h() {
        return this.f9453g;
    }

    /* renamed from: i */
    public final void mo5754i() {
        this.f9453g = null;
        MulticastSocket multicastSocket = this.f9455i;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f9456j);
            } catch (IOException unused) {
            }
            this.f9455i = null;
        }
        DatagramSocket datagramSocket = this.f9454h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f9454h = null;
        }
        this.f9456j = null;
        this.f9457k = null;
        this.f9459m = 0;
        if (this.f9458l) {
            this.f9458l = false;
            mo6894p();
        }
    }

    /* renamed from: k */
    public final long mo5755k(li1 li1) {
        DatagramSocket datagramSocket;
        Uri uri = li1.f10058a;
        this.f9453g = uri;
        String host = uri.getHost();
        int port = this.f9453g.getPort();
        mo6895q(li1);
        try {
            this.f9456j = InetAddress.getByName(host);
            this.f9457k = new InetSocketAddress(this.f9456j, port);
            if (this.f9456j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f9457k);
                this.f9455i = multicastSocket;
                multicastSocket.joinGroup(this.f9456j);
                datagramSocket = this.f9455i;
            } else {
                datagramSocket = new DatagramSocket(this.f9457k);
            }
            this.f9454h = datagramSocket;
            this.f9454h.setSoTimeout(8000);
            this.f9458l = true;
            mo6896r(li1);
            return -1;
        } catch (SecurityException e) {
            throw new ja4(e, 2006);
        } catch (IOException e2) {
            throw new ja4(e2, 2001);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.e */
public final class C1647e extends wf4 {
    public static final Parcelable.Creator<C1647e> CREATOR = new C1610d();

    /* renamed from: g */
    public final String f5998g;

    /* renamed from: h */
    public final String f5999h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C1647e(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.n13.f11236a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f5998g = r0
            java.lang.String r3 = r3.readString()
            r2.f5999h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1647e.<init>(android.os.Parcel):void");
    }

    public C1647e(String str, String str2, String str3) {
        super(str);
        this.f5998g = str2;
        this.f5999h = str3;
    }

    /* renamed from: b */
    private static List<Integer> m8231b(String str) {
        int parseInt;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                parseInt = Integer.parseInt(str.substring(8, 10));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                parseInt = Integer.parseInt(str.substring(5, 7));
            } else {
                if (str.length() >= 4) {
                    parseInt = Integer.parseInt(str.substring(0, 4));
                }
                return arrayList;
            }
            arrayList.add(Integer.valueOf(parseInt));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5272a(com.google.android.gms.internal.ads.C1639ds r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.f16810f
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 0
            r5 = 1
            r6 = 2
            switch(r1) {
                case 82815: goto L_0x00fd;
                case 82878: goto L_0x00f2;
                case 82897: goto L_0x00e7;
                case 83253: goto L_0x00dd;
                case 83254: goto L_0x00d3;
                case 83255: goto L_0x00c8;
                case 83341: goto L_0x00bd;
                case 83378: goto L_0x00b3;
                case 83536: goto L_0x00a8;
                case 83552: goto L_0x009c;
                case 2567331: goto L_0x0091;
                case 2569357: goto L_0x0085;
                case 2569891: goto L_0x0079;
                case 2570401: goto L_0x006d;
                case 2570410: goto L_0x0061;
                case 2571565: goto L_0x0055;
                case 2575251: goto L_0x004a;
                case 2581512: goto L_0x003f;
                case 2581513: goto L_0x0034;
                case 2581514: goto L_0x0028;
                case 2583398: goto L_0x001c;
                case 2590194: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0107
        L_0x0010:
            java.lang.String r1 = "TYER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 11
            goto L_0x0108
        L_0x001c:
            java.lang.String r1 = "TRCK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 9
            goto L_0x0108
        L_0x0028:
            java.lang.String r1 = "TPE3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 19
            goto L_0x0108
        L_0x0034:
            java.lang.String r1 = "TPE2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 5
            goto L_0x0108
        L_0x003f:
            java.lang.String r1 = "TPE1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = r3
            goto L_0x0108
        L_0x004a:
            java.lang.String r1 = "TIT2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = r5
            goto L_0x0108
        L_0x0055:
            java.lang.String r1 = "TEXT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 21
            goto L_0x0108
        L_0x0061:
            java.lang.String r1 = "TDRL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 15
            goto L_0x0108
        L_0x006d:
            java.lang.String r1 = "TDRC"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 14
            goto L_0x0108
        L_0x0079:
            java.lang.String r1 = "TDAT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 13
            goto L_0x0108
        L_0x0085:
            java.lang.String r1 = "TCOM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 17
            goto L_0x0108
        L_0x0091:
            java.lang.String r1 = "TALB"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 7
            goto L_0x0108
        L_0x009c:
            java.lang.String r1 = "TYE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 10
            goto L_0x0108
        L_0x00a8:
            java.lang.String r1 = "TXT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 20
            goto L_0x0108
        L_0x00b3:
            java.lang.String r1 = "TT2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = r4
            goto L_0x0108
        L_0x00bd:
            java.lang.String r1 = "TRK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 8
            goto L_0x0108
        L_0x00c8:
            java.lang.String r1 = "TP3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 18
            goto L_0x0108
        L_0x00d3:
            java.lang.String r1 = "TP2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = r2
            goto L_0x0108
        L_0x00dd:
            java.lang.String r1 = "TP1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = r6
            goto L_0x0108
        L_0x00e7:
            java.lang.String r1 = "TDA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 12
            goto L_0x0108
        L_0x00f2:
            java.lang.String r1 = "TCM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 16
            goto L_0x0108
        L_0x00fd:
            java.lang.String r1 = "TAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 6
            goto L_0x0108
        L_0x0107:
            r0 = -1
        L_0x0108:
            switch(r0) {
                case 0: goto L_0x01e6;
                case 1: goto L_0x01e6;
                case 2: goto L_0x01e0;
                case 3: goto L_0x01e0;
                case 4: goto L_0x01da;
                case 5: goto L_0x01da;
                case 6: goto L_0x01d4;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01ac;
                case 9: goto L_0x01ac;
                case 10: goto L_0x019e;
                case 11: goto L_0x019e;
                case 12: goto L_0x017b;
                case 13: goto L_0x017b;
                case 14: goto L_0x014d;
                case 15: goto L_0x011f;
                case 16: goto L_0x0119;
                case 17: goto L_0x0119;
                case 18: goto L_0x0113;
                case 19: goto L_0x0113;
                case 20: goto L_0x010d;
                case 21: goto L_0x010d;
                default: goto L_0x010b;
            }
        L_0x010b:
            goto L_0x01eb
        L_0x010d:
            java.lang.String r0 = r7.f5999h
            r8.mo6601A(r0)
            return
        L_0x0113:
            java.lang.String r0 = r7.f5999h
            r8.mo6608p(r0)
            return
        L_0x0119:
            java.lang.String r0 = r7.f5999h
            r8.mo6607o(r0)
            return
        L_0x011f:
            java.lang.String r0 = r7.f5999h
            java.util.List r0 = m8231b(r0)
            int r1 = r0.size()
            if (r1 == r5) goto L_0x0143
            if (r1 == r6) goto L_0x013a
            if (r1 == r3) goto L_0x0131
            goto L_0x01eb
        L_0x0131:
            java.lang.Object r1 = r0.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.mo6613u(r1)
        L_0x013a:
            java.lang.Object r1 = r0.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.mo6614v(r1)
        L_0x0143:
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.mo6615w(r0)
            return
        L_0x014d:
            java.lang.String r0 = r7.f5999h
            java.util.List r0 = m8231b(r0)
            int r1 = r0.size()
            if (r1 == r5) goto L_0x0171
            if (r1 == r6) goto L_0x0168
            if (r1 == r3) goto L_0x015f
            goto L_0x01eb
        L_0x015f:
            java.lang.Object r1 = r0.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.mo6610r(r1)
        L_0x0168:
            java.lang.Object r1 = r0.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.mo6611s(r1)
        L_0x0171:
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.mo6612t(r0)
            return
        L_0x017b:
            java.lang.String r0 = r7.f5999h     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x019d }
            java.lang.String r0 = r0.substring(r6, r2)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x019d }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x019d }
            java.lang.String r1 = r7.f5999h     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x019d }
            java.lang.String r1 = r1.substring(r4, r6)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x019d }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x019d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x019d }
            r8.mo6611s(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x019d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x019d }
            r8.mo6610r(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x019d }
        L_0x019d:
            return
        L_0x019e:
            java.lang.String r0 = r7.f5999h     // Catch:{ NumberFormatException -> 0x01ab }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01ab }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01ab }
            r8.mo6612t(r0)     // Catch:{ NumberFormatException -> 0x01ab }
        L_0x01ab:
            return
        L_0x01ac:
            java.lang.String r0 = r7.f5999h
            java.lang.String r1 = "/"
            java.lang.String[] r0 = com.google.android.gms.internal.ads.n13.m13599D(r0, r1)
            r1 = r0[r4]     // Catch:{ NumberFormatException -> 0x01d3 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x01d3 }
            int r2 = r0.length     // Catch:{ NumberFormatException -> 0x01d3 }
            if (r2 <= r5) goto L_0x01c8
            r0 = r0[r5]     // Catch:{ NumberFormatException -> 0x01d3 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01d3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01d3 }
            goto L_0x01c9
        L_0x01c8:
            r0 = 0
        L_0x01c9:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x01d3 }
            r8.mo6618z(r1)     // Catch:{ NumberFormatException -> 0x01d3 }
            r8.mo6617y(r0)     // Catch:{ NumberFormatException -> 0x01d3 }
        L_0x01d3:
            return
        L_0x01d4:
            java.lang.String r0 = r7.f5999h
            r8.mo6605m(r0)
            return
        L_0x01da:
            java.lang.String r0 = r7.f5999h
            r8.mo6604l(r0)
            return
        L_0x01e0:
            java.lang.String r0 = r7.f5999h
            r8.mo6606n(r0)
            return
        L_0x01e6:
            java.lang.String r0 = r7.f5999h
            r8.mo6616x(r0)
        L_0x01eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1647e.mo5272a(com.google.android.gms.internal.ads.ds):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1647e.class == obj.getClass()) {
            C1647e eVar = (C1647e) obj;
            return n13.m13643p(this.f16810f, eVar.f16810f) && n13.m13643p(this.f5998g, eVar.f5998g) && n13.m13643p(this.f5999h, eVar.f5999h);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f16810f.hashCode() + 527) * 31;
        String str = this.f5998g;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5999h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f16810f;
        String str2 = this.f5998g;
        String str3 = this.f5999h;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": value=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16810f);
        parcel.writeString(this.f5998g);
        parcel.writeString(this.f5999h);
    }
}

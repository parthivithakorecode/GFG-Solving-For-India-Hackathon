package com.google.android.gms.internal.ads;

final class us3 {
    /* renamed from: a */
    static String m18038a(uo3 uo3) {
        String str;
        StringBuilder sb = new StringBuilder(uo3.mo6627p());
        for (int i = 0; i < uo3.mo6627p(); i++) {
            int m = uo3.mo6625m(i);
            if (m == 34) {
                str = "\\\"";
            } else if (m == 39) {
                str = "\\'";
            } else if (m != 92) {
                switch (m) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (m < 32 || m > 126) {
                            sb.append('\\');
                            sb.append((char) (((m >>> 6) & 3) + 48));
                            sb.append((char) (((m >>> 3) & 7) + 48));
                            m = (m & 7) + 48;
                        }
                        sb.append((char) m);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}

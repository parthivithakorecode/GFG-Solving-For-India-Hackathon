package com.google.android.gms.internal.ads;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.f1 */
final class C1687f1 {

    /* renamed from: a */
    static final String[] f6649a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: b */
    public static final /* synthetic */ int f6650b = 0;

    /* renamed from: a */
    public static b81 m8927a(dr2 dr2) {
        String str;
        String str2;
        int k = dr2.mo6585k() + dr2.mo6587m();
        int m = dr2.mo6587m();
        int i = (m >> 24) & 255;
        b81 b81 = null;
        if (i == 169 || i == 253) {
            int i2 = m & 16777215;
            if (i2 == 6516084) {
                int m2 = dr2.mo6587m();
                if (dr2.mo6587m() == 1684108385) {
                    dr2.mo6581g(8);
                    String E = dr2.mo6571E(m2 - 16);
                    b81 = new pf4("und", E, E);
                } else {
                    String b = C2093q0.m15346b(m);
                    Log.w("MetadataUtil", b.length() != 0 ? "Failed to parse comment attribute: ".concat(b) : new String("Failed to parse comment attribute: "));
                }
                dr2.mo6580f(k);
                return b81;
            } else if (i2 == 7233901 || i2 == 7631467) {
                C1647e e = m8931e(m, "TIT2", dr2);
                dr2.mo6580f(k);
                return e;
            } else if (i2 == 6516589 || i2 == 7828084) {
                C1647e e2 = m8931e(m, "TCOM", dr2);
                dr2.mo6580f(k);
                return e2;
            } else if (i2 == 6578553) {
                C1647e e3 = m8931e(m, "TDRC", dr2);
                dr2.mo6580f(k);
                return e3;
            } else if (i2 == 4280916) {
                C1647e e4 = m8931e(m, "TPE1", dr2);
                dr2.mo6580f(k);
                return e4;
            } else if (i2 == 7630703) {
                C1647e e5 = m8931e(m, "TSSE", dr2);
                dr2.mo6580f(k);
                return e5;
            } else if (i2 == 6384738) {
                C1647e e6 = m8931e(m, "TALB", dr2);
                dr2.mo6580f(k);
                return e6;
            } else if (i2 == 7108978) {
                C1647e e7 = m8931e(m, "USLT", dr2);
                dr2.mo6580f(k);
                return e7;
            } else if (i2 == 6776174) {
                C1647e e8 = m8931e(m, "TCON", dr2);
                dr2.mo6580f(k);
                return e8;
            } else if (i2 == 6779504) {
                C1647e e9 = m8931e(m, "TIT1", dr2);
                dr2.mo6580f(k);
                return e9;
            }
        } else if (m == 1735291493) {
            try {
                int b2 = m8928b(dr2);
                String str3 = (b2 <= 0 || b2 > 192) ? null : f6649a[b2 - 1];
                if (str3 != null) {
                    b81 = new C1647e("TCON", (String) null, str3);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                }
                return b81;
            } finally {
                dr2.mo6580f(k);
            }
        } else if (m == 1684632427) {
            C1647e d = m8930d(1684632427, "TPOS", dr2);
            dr2.mo6580f(k);
            return d;
        } else if (m == 1953655662) {
            C1647e d2 = m8930d(1953655662, "TRCK", dr2);
            dr2.mo6580f(k);
            return d2;
        } else if (m == 1953329263) {
            wf4 c = m8929c(1953329263, "TBPM", dr2, true, false);
            dr2.mo6580f(k);
            return c;
        } else if (m == 1668311404) {
            wf4 c2 = m8929c(1668311404, "TCMP", dr2, true, true);
            dr2.mo6580f(k);
            return c2;
        } else if (m == 1668249202) {
            int m3 = dr2.mo6587m();
            if (dr2.mo6587m() == 1684108385) {
                int m4 = dr2.mo6587m() & 16777215;
                if (m4 == 13) {
                    str2 = "image/jpeg";
                } else if (m4 == 14) {
                    str2 = "image/png";
                    m4 = 14;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    StringBuilder sb = new StringBuilder(41);
                    sb.append("Unrecognized cover art flags: ");
                    sb.append(m4);
                    str = sb.toString();
                } else {
                    dr2.mo6581g(4);
                    int i3 = m3 - 16;
                    byte[] bArr = new byte[i3];
                    dr2.mo6576b(bArr, 0, i3);
                    b81 = new hf4(str2, (String) null, 3, bArr);
                    dr2.mo6580f(k);
                    return b81;
                }
            } else {
                str = "Failed to parse cover art attribute";
            }
            Log.w("MetadataUtil", str);
            dr2.mo6580f(k);
            return b81;
        } else if (m == 1631670868) {
            C1647e e10 = m8931e(1631670868, "TPE2", dr2);
            dr2.mo6580f(k);
            return e10;
        } else if (m == 1936682605) {
            C1647e e11 = m8931e(1936682605, "TSOT", dr2);
            dr2.mo6580f(k);
            return e11;
        } else if (m == 1936679276) {
            C1647e e12 = m8931e(1936679276, "TSO2", dr2);
            dr2.mo6580f(k);
            return e12;
        } else if (m == 1936679282) {
            C1647e e13 = m8931e(1936679282, "TSOA", dr2);
            dr2.mo6580f(k);
            return e13;
        } else if (m == 1936679265) {
            C1647e e14 = m8931e(1936679265, "TSOP", dr2);
            dr2.mo6580f(k);
            return e14;
        } else if (m == 1936679791) {
            C1647e e15 = m8931e(1936679791, "TSOC", dr2);
            dr2.mo6580f(k);
            return e15;
        } else if (m == 1920233063) {
            wf4 c3 = m8929c(1920233063, "ITUNESADVISORY", dr2, false, false);
            dr2.mo6580f(k);
            return c3;
        } else if (m == 1885823344) {
            wf4 c4 = m8929c(1885823344, "ITUNESGAPLESS", dr2, false, true);
            dr2.mo6580f(k);
            return c4;
        } else if (m == 1936683886) {
            C1647e e16 = m8931e(1936683886, "TVSHOWSORT", dr2);
            dr2.mo6580f(k);
            return e16;
        } else if (m == 1953919848) {
            C1647e e17 = m8931e(1953919848, "TVSHOW", dr2);
            dr2.mo6580f(k);
            return e17;
        } else if (m == 757935405) {
            String str4 = null;
            String str5 = null;
            int i4 = -1;
            int i5 = -1;
            while (dr2.mo6585k() < k) {
                int k2 = dr2.mo6585k();
                int m5 = dr2.mo6587m();
                int m6 = dr2.mo6587m();
                dr2.mo6581g(4);
                if (m6 == 1835360622) {
                    str4 = dr2.mo6571E(m5 - 12);
                } else if (m6 == 1851878757) {
                    str5 = dr2.mo6571E(m5 - 12);
                } else {
                    if (m6 == 1684108385) {
                        i5 = m5;
                    }
                    if (m6 == 1684108385) {
                        i4 = k2;
                    }
                    dr2.mo6581g(m5 - 12);
                }
            }
            if (!(str4 == null || str5 == null)) {
                if (i4 != -1) {
                    dr2.mo6580f(i4);
                    dr2.mo6581g(16);
                    b81 = new yf4(str4, str5, dr2.mo6571E(i5 - 16));
                }
            }
            dr2.mo6580f(k);
            return b81;
        }
        String b3 = C2093q0.m15346b(m);
        Log.d("MetadataUtil", b3.length() != 0 ? "Skipped unknown metadata entry: ".concat(b3) : new String("Skipped unknown metadata entry: "));
        dr2.mo6580f(k);
        return null;
    }

    /* renamed from: b */
    private static int m8928b(dr2 dr2) {
        dr2.mo6581g(4);
        if (dr2.mo6587m() == 1684108385) {
            dr2.mo6581g(8);
            return dr2.mo6593s();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: c */
    private static wf4 m8929c(int i, String str, dr2 dr2, boolean z, boolean z2) {
        int b = m8928b(dr2);
        if (z2) {
            b = Math.min(1, b);
        }
        if (b >= 0) {
            return z ? new C1647e(str, (String) null, Integer.toString(b)) : new pf4("und", str, Integer.toString(b));
        }
        String b2 = C2093q0.m15346b(i);
        Log.w("MetadataUtil", b2.length() != 0 ? "Failed to parse uint8 attribute: ".concat(b2) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    /* renamed from: d */
    private static C1647e m8930d(int i, String str, dr2 dr2) {
        int m = dr2.mo6587m();
        if (dr2.mo6587m() == 1684108385 && m >= 22) {
            dr2.mo6581g(10);
            int w = dr2.mo6597w();
            if (w > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(w);
                String sb2 = sb.toString();
                int w2 = dr2.mo6597w();
                if (w2 > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 12);
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(w2);
                    sb2 = sb3.toString();
                }
                return new C1647e(str, (String) null, sb2);
            }
        }
        String b = C2093q0.m15346b(i);
        Log.w("MetadataUtil", b.length() != 0 ? "Failed to parse index/count attribute: ".concat(b) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    /* renamed from: e */
    private static C1647e m8931e(int i, String str, dr2 dr2) {
        int m = dr2.mo6587m();
        if (dr2.mo6587m() == 1684108385) {
            dr2.mo6581g(8);
            return new C1647e(str, (String) null, dr2.mo6571E(m - 16));
        }
        String b = C2093q0.m15346b(i);
        Log.w("MetadataUtil", b.length() != 0 ? "Failed to parse text attribute: ".concat(b) : new String("Failed to parse text attribute: "));
        return null;
    }
}

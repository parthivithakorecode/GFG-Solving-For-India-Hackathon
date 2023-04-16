package com.google.android.gms.internal.ads;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.ni */
final class C2000ni {

    /* renamed from: A */
    private static final int f11467A = C2449zm.m20728g("sosn");

    /* renamed from: B */
    private static final int f11468B = C2449zm.m20728g("tvsh");

    /* renamed from: C */
    private static final int f11469C = C2449zm.m20728g("----");

    /* renamed from: D */
    private static final String[] f11470D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    private static final int f11471a = C2449zm.m20728g("nam");

    /* renamed from: b */
    private static final int f11472b = C2449zm.m20728g("trk");

    /* renamed from: c */
    private static final int f11473c = C2449zm.m20728g("cmt");

    /* renamed from: d */
    private static final int f11474d = C2449zm.m20728g("day");

    /* renamed from: e */
    private static final int f11475e = C2449zm.m20728g("ART");

    /* renamed from: f */
    private static final int f11476f = C2449zm.m20728g("too");

    /* renamed from: g */
    private static final int f11477g = C2449zm.m20728g("alb");

    /* renamed from: h */
    private static final int f11478h = C2449zm.m20728g("com");

    /* renamed from: i */
    private static final int f11479i = C2449zm.m20728g("wrt");

    /* renamed from: j */
    private static final int f11480j = C2449zm.m20728g("lyr");

    /* renamed from: k */
    private static final int f11481k = C2449zm.m20728g("gen");

    /* renamed from: l */
    private static final int f11482l = C2449zm.m20728g("covr");

    /* renamed from: m */
    private static final int f11483m = C2449zm.m20728g("gnre");

    /* renamed from: n */
    private static final int f11484n = C2449zm.m20728g("grp");

    /* renamed from: o */
    private static final int f11485o = C2449zm.m20728g("disk");

    /* renamed from: p */
    private static final int f11486p = C2449zm.m20728g("trkn");

    /* renamed from: q */
    private static final int f11487q = C2449zm.m20728g("tmpo");

    /* renamed from: r */
    private static final int f11488r = C2449zm.m20728g("cpil");

    /* renamed from: s */
    private static final int f11489s = C2449zm.m20728g("aART");

    /* renamed from: t */
    private static final int f11490t = C2449zm.m20728g("sonm");

    /* renamed from: u */
    private static final int f11491u = C2449zm.m20728g("soal");

    /* renamed from: v */
    private static final int f11492v = C2449zm.m20728g("soar");

    /* renamed from: w */
    private static final int f11493w = C2449zm.m20728g("soaa");

    /* renamed from: x */
    private static final int f11494x = C2449zm.m20728g("soco");

    /* renamed from: y */
    private static final int f11495y = C2449zm.m20728g("rtng");

    /* renamed from: z */
    private static final int f11496z = C2449zm.m20728g("pgap");

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035 A[Catch:{ all -> 0x01d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c A[Catch:{ all -> 0x01d2 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.C1927lj m13932a(com.google.android.gms.internal.ads.C2152rm r13) {
        /*
            int r0 = r13.mo10533c()
            int r1 = r13.mo10535e()
            int r0 = r0 + r1
            int r1 = r13.mo10535e()
            int r2 = r1 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = "und"
            java.lang.String r4 = "TCON"
            java.lang.String r5 = "MetadataUtil"
            r6 = 0
            r7 = 169(0xa9, float:2.37E-43)
            if (r2 == r7) goto L_0x01d5
            int r2 = f11483m     // Catch:{ all -> 0x01d2 }
            r7 = -1
            if (r1 != r2) goto L_0x0045
            int r1 = m13933b(r13)     // Catch:{ all -> 0x01d2 }
            if (r1 <= 0) goto L_0x0032
            java.lang.String[] r2 = f11470D     // Catch:{ all -> 0x01d2 }
            int r3 = r2.length     // Catch:{ all -> 0x01d2 }
            r3 = 148(0x94, float:2.07E-43)
            if (r1 > r3) goto L_0x0032
            int r1 = r1 + r7
            r1 = r2[r1]     // Catch:{ all -> 0x01d2 }
            goto L_0x0033
        L_0x0032:
            r1 = r6
        L_0x0033:
            if (r1 == 0) goto L_0x003c
            com.google.android.gms.internal.ads.uj r2 = new com.google.android.gms.internal.ads.uj     // Catch:{ all -> 0x01d2 }
            r2.<init>(r4, r6, r1)     // Catch:{ all -> 0x01d2 }
            r6 = r2
            goto L_0x0041
        L_0x003c:
            java.lang.String r1 = "Failed to parse standard genre code"
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x01d2 }
        L_0x0041:
            r13.mo10552v(r0)
            return r6
        L_0x0045:
            int r2 = f11485o     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x0053
            java.lang.String r2 = "TPOS"
            com.google.android.gms.internal.ads.uj r1 = m13935d(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x0053:
            int r2 = f11486p     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x0061
            java.lang.String r2 = "TRCK"
            com.google.android.gms.internal.ads.uj r1 = m13935d(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x0061:
            int r2 = f11487q     // Catch:{ all -> 0x01d2 }
            r4 = 1
            r8 = 0
            if (r1 != r2) goto L_0x0071
            java.lang.String r2 = "TBPM"
            com.google.android.gms.internal.ads.sj r1 = m13934c(r1, r2, r13, r4, r8)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x0071:
            int r2 = f11488r     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x007f
            java.lang.String r2 = "TCMP"
            com.google.android.gms.internal.ads.sj r1 = m13934c(r1, r2, r13, r4, r4)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x007f:
            int r2 = f11482l     // Catch:{ all -> 0x01d2 }
            r9 = 4
            if (r1 != r2) goto L_0x00da
            int r1 = r13.mo10535e()     // Catch:{ all -> 0x01d2 }
            int r2 = r13.mo10535e()     // Catch:{ all -> 0x01d2 }
            int r3 = com.google.android.gms.internal.ads.C1518ai.f4125F0     // Catch:{ all -> 0x01d2 }
            if (r2 != r3) goto L_0x00d3
            int r2 = r13.mo10535e()     // Catch:{ all -> 0x01d2 }
            int r2 = com.google.android.gms.internal.ads.C1518ai.m6087a(r2)     // Catch:{ all -> 0x01d2 }
            r3 = 13
            r4 = 14
            if (r2 != r3) goto L_0x00a1
            java.lang.String r3 = "image/jpeg"
            goto L_0x00a8
        L_0x00a1:
            if (r2 != r4) goto L_0x00a7
            java.lang.String r3 = "image/png"
            r2 = r4
            goto L_0x00a8
        L_0x00a7:
            r3 = r6
        L_0x00a8:
            if (r3 != 0) goto L_0x00c1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r3 = 41
            r1.<init>(r3)     // Catch:{ all -> 0x01d2 }
            java.lang.String r3 = "Unrecognized cover art flags: "
            r1.append(r3)     // Catch:{ all -> 0x01d2 }
            r1.append(r2)     // Catch:{ all -> 0x01d2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01d2 }
        L_0x00bd:
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x01d2 }
            goto L_0x00d6
        L_0x00c1:
            r13.mo10553w(r9)     // Catch:{ all -> 0x01d2 }
            int r1 = r1 + -16
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x01d2 }
            r13.mo10547q(r2, r8, r1)     // Catch:{ all -> 0x01d2 }
            com.google.android.gms.internal.ads.oj r1 = new com.google.android.gms.internal.ads.oj     // Catch:{ all -> 0x01d2 }
            r4 = 3
            r1.<init>(r3, r6, r4, r2)     // Catch:{ all -> 0x01d2 }
            r6 = r1
            goto L_0x00d6
        L_0x00d3:
            java.lang.String r1 = "Failed to parse cover art attribute"
            goto L_0x00bd
        L_0x00d6:
            r13.mo10552v(r0)
            return r6
        L_0x00da:
            int r2 = f11489s     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x00e8
            java.lang.String r2 = "TPE2"
            com.google.android.gms.internal.ads.uj r1 = m13936e(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x00e8:
            int r2 = f11490t     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x00f6
            java.lang.String r2 = "TSOT"
            com.google.android.gms.internal.ads.uj r1 = m13936e(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x00f6:
            int r2 = f11491u     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x0104
            java.lang.String r2 = "TSO2"
            com.google.android.gms.internal.ads.uj r1 = m13936e(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x0104:
            int r2 = f11492v     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x0112
            java.lang.String r2 = "TSOA"
            com.google.android.gms.internal.ads.uj r1 = m13936e(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x0112:
            int r2 = f11493w     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x0120
            java.lang.String r2 = "TSOP"
            com.google.android.gms.internal.ads.uj r1 = m13936e(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x0120:
            int r2 = f11494x     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x012e
            java.lang.String r2 = "TSOC"
            com.google.android.gms.internal.ads.uj r1 = m13936e(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x012e:
            int r2 = f11495y     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x013c
            java.lang.String r2 = "ITUNESADVISORY"
            com.google.android.gms.internal.ads.sj r1 = m13934c(r1, r2, r13, r8, r8)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x013c:
            int r2 = f11496z     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x014a
            java.lang.String r2 = "ITUNESGAPLESS"
            com.google.android.gms.internal.ads.sj r1 = m13934c(r1, r2, r13, r8, r4)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x014a:
            int r2 = f11467A     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x0158
            java.lang.String r2 = "TVSHOWSORT"
            com.google.android.gms.internal.ads.uj r1 = m13936e(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x0158:
            int r2 = f11468B     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x0166
            java.lang.String r2 = "TVSHOW"
            com.google.android.gms.internal.ads.uj r1 = m13936e(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x0166:
            int r2 = f11469C     // Catch:{ all -> 0x01d2 }
            if (r1 != r2) goto L_0x028b
            r1 = r6
            r2 = r1
            r4 = r7
            r5 = r4
        L_0x016e:
            int r8 = r13.mo10533c()     // Catch:{ all -> 0x01d2 }
            if (r8 >= r0) goto L_0x01a8
            int r8 = r13.mo10533c()     // Catch:{ all -> 0x01d2 }
            int r10 = r13.mo10535e()     // Catch:{ all -> 0x01d2 }
            int r11 = r13.mo10535e()     // Catch:{ all -> 0x01d2 }
            r13.mo10553w(r9)     // Catch:{ all -> 0x01d2 }
            int r12 = com.google.android.gms.internal.ads.C1518ai.f4121D0     // Catch:{ all -> 0x01d2 }
            if (r11 != r12) goto L_0x018e
            int r10 = r10 + -12
            java.lang.String r1 = r13.mo10545o(r10)     // Catch:{ all -> 0x01d2 }
            goto L_0x016e
        L_0x018e:
            int r12 = com.google.android.gms.internal.ads.C1518ai.f4123E0     // Catch:{ all -> 0x01d2 }
            if (r11 != r12) goto L_0x0199
            int r10 = r10 + -12
            java.lang.String r2 = r13.mo10545o(r10)     // Catch:{ all -> 0x01d2 }
            goto L_0x016e
        L_0x0199:
            int r12 = com.google.android.gms.internal.ads.C1518ai.f4125F0     // Catch:{ all -> 0x01d2 }
            if (r11 != r12) goto L_0x019e
            r5 = r10
        L_0x019e:
            if (r11 == r12) goto L_0x01a1
            goto L_0x01a2
        L_0x01a1:
            r4 = r8
        L_0x01a2:
            int r10 = r10 + -12
            r13.mo10553w(r10)     // Catch:{ all -> 0x01d2 }
            goto L_0x016e
        L_0x01a8:
            java.lang.String r8 = "com.apple.iTunes"
            boolean r1 = r8.equals(r1)     // Catch:{ all -> 0x01d2 }
            if (r1 == 0) goto L_0x01ce
            java.lang.String r1 = "iTunSMPB"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x01d2 }
            if (r1 == 0) goto L_0x01ce
            if (r4 != r7) goto L_0x01bb
            goto L_0x01ce
        L_0x01bb:
            r13.mo10552v(r4)     // Catch:{ all -> 0x01d2 }
            r1 = 16
            r13.mo10553w(r1)     // Catch:{ all -> 0x01d2 }
            int r5 = r5 + -16
            java.lang.String r1 = r13.mo10545o(r5)     // Catch:{ all -> 0x01d2 }
            com.google.android.gms.internal.ads.qj r6 = new com.google.android.gms.internal.ads.qj     // Catch:{ all -> 0x01d2 }
            r6.<init>(r3, r2, r1)     // Catch:{ all -> 0x01d2 }
        L_0x01ce:
            r13.mo10552v(r0)
            return r6
        L_0x01d2:
            r1 = move-exception
            goto L_0x02bc
        L_0x01d5:
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            int r7 = f11473c     // Catch:{ all -> 0x01d2 }
            if (r2 != r7) goto L_0x0217
            int r2 = r13.mo10535e()     // Catch:{ all -> 0x01d2 }
            int r4 = r13.mo10535e()     // Catch:{ all -> 0x01d2 }
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4125F0     // Catch:{ all -> 0x01d2 }
            if (r4 != r7) goto L_0x01fa
            r1 = 8
            r13.mo10553w(r1)     // Catch:{ all -> 0x01d2 }
            int r2 = r2 + -16
            java.lang.String r1 = r13.mo10545o(r2)     // Catch:{ all -> 0x01d2 }
            com.google.android.gms.internal.ads.qj r6 = new com.google.android.gms.internal.ads.qj     // Catch:{ all -> 0x01d2 }
            r6.<init>(r3, r1, r1)     // Catch:{ all -> 0x01d2 }
            goto L_0x0213
        L_0x01fa:
            java.lang.String r2 = "Failed to parse comment attribute: "
            java.lang.String r1 = com.google.android.gms.internal.ads.C1518ai.m6089c(r1)     // Catch:{ all -> 0x01d2 }
            int r3 = r1.length()     // Catch:{ all -> 0x01d2 }
            if (r3 == 0) goto L_0x020b
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x01d2 }
            goto L_0x0210
        L_0x020b:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x01d2 }
            r1.<init>(r2)     // Catch:{ all -> 0x01d2 }
        L_0x0210:
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x01d2 }
        L_0x0213:
            r13.mo10552v(r0)
            return r6
        L_0x0217:
            int r3 = f11471a     // Catch:{ all -> 0x01d2 }
            if (r2 == r3) goto L_0x02b2
            int r3 = f11472b     // Catch:{ all -> 0x01d2 }
            if (r2 != r3) goto L_0x0221
            goto L_0x02b2
        L_0x0221:
            int r3 = f11478h     // Catch:{ all -> 0x01d2 }
            if (r2 == r3) goto L_0x02a8
            int r3 = f11479i     // Catch:{ all -> 0x01d2 }
            if (r2 != r3) goto L_0x022b
            goto L_0x02a8
        L_0x022b:
            int r3 = f11474d     // Catch:{ all -> 0x01d2 }
            if (r2 != r3) goto L_0x0239
            java.lang.String r2 = "TDRC"
            com.google.android.gms.internal.ads.uj r1 = m13936e(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x0239:
            int r3 = f11475e     // Catch:{ all -> 0x01d2 }
            if (r2 != r3) goto L_0x0247
            java.lang.String r2 = "TPE1"
            com.google.android.gms.internal.ads.uj r1 = m13936e(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x0247:
            int r3 = f11476f     // Catch:{ all -> 0x01d2 }
            if (r2 != r3) goto L_0x0255
            java.lang.String r2 = "TSSE"
            com.google.android.gms.internal.ads.uj r1 = m13936e(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x0255:
            int r3 = f11477g     // Catch:{ all -> 0x01d2 }
            if (r2 != r3) goto L_0x0263
            java.lang.String r2 = "TALB"
            com.google.android.gms.internal.ads.uj r1 = m13936e(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x0263:
            int r3 = f11480j     // Catch:{ all -> 0x01d2 }
            if (r2 != r3) goto L_0x0271
            java.lang.String r2 = "USLT"
            com.google.android.gms.internal.ads.uj r1 = m13936e(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x0271:
            int r3 = f11481k     // Catch:{ all -> 0x01d2 }
            if (r2 != r3) goto L_0x027d
            com.google.android.gms.internal.ads.uj r1 = m13936e(r1, r4, r13)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x027d:
            int r3 = f11484n     // Catch:{ all -> 0x01d2 }
            if (r2 != r3) goto L_0x028b
            java.lang.String r2 = "TIT1"
            com.google.android.gms.internal.ads.uj r1 = m13936e(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x028b:
            java.lang.String r2 = "Skipped unknown metadata entry: "
            java.lang.String r1 = com.google.android.gms.internal.ads.C1518ai.m6089c(r1)     // Catch:{ all -> 0x01d2 }
            int r3 = r1.length()     // Catch:{ all -> 0x01d2 }
            if (r3 == 0) goto L_0x029c
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x01d2 }
            goto L_0x02a1
        L_0x029c:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x01d2 }
            r1.<init>(r2)     // Catch:{ all -> 0x01d2 }
        L_0x02a1:
            android.util.Log.d(r5, r1)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r6
        L_0x02a8:
            java.lang.String r2 = "TCOM"
            com.google.android.gms.internal.ads.uj r1 = m13936e(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x02b2:
            java.lang.String r2 = "TIT2"
            com.google.android.gms.internal.ads.uj r1 = m13936e(r1, r2, r13)     // Catch:{ all -> 0x01d2 }
            r13.mo10552v(r0)
            return r1
        L_0x02bc:
            r13.mo10552v(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2000ni.m13932a(com.google.android.gms.internal.ads.rm):com.google.android.gms.internal.ads.lj");
    }

    /* renamed from: b */
    private static int m13933b(C2152rm rmVar) {
        rmVar.mo10553w(4);
        if (rmVar.mo10535e() == C1518ai.f4125F0) {
            rmVar.mo10553w(8);
            return rmVar.mo10537g();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: c */
    private static C2186sj m13934c(int i, String str, C2152rm rmVar, boolean z, boolean z2) {
        int b = m13933b(rmVar);
        if (z2) {
            b = Math.min(1, b);
        }
        if (b >= 0) {
            return z ? new C2260uj(str, (String) null, Integer.toString(b)) : new C2112qj("und", str, Integer.toString(b));
        }
        String c = C1518ai.m6089c(i);
        Log.w("MetadataUtil", c.length() != 0 ? "Failed to parse uint8 attribute: ".concat(c) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    /* renamed from: d */
    private static C2260uj m13935d(int i, String str, C2152rm rmVar) {
        int e = rmVar.mo10535e();
        if (rmVar.mo10535e() == C1518ai.f4125F0 && e >= 22) {
            rmVar.mo10553w(10);
            int j = rmVar.mo10540j();
            if (j > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(j);
                String sb2 = sb.toString();
                int j2 = rmVar.mo10540j();
                if (j2 > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 12);
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(j2);
                    sb2 = sb3.toString();
                }
                return new C2260uj(str, (String) null, sb2);
            }
        }
        String c = C1518ai.m6089c(i);
        Log.w("MetadataUtil", c.length() != 0 ? "Failed to parse index/count attribute: ".concat(c) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    /* renamed from: e */
    private static C2260uj m13936e(int i, String str, C2152rm rmVar) {
        int e = rmVar.mo10535e();
        if (rmVar.mo10535e() == C1518ai.f4125F0) {
            rmVar.mo10553w(8);
            return new C2260uj(str, (String) null, rmVar.mo10545o(e - 16));
        }
        String c = C1518ai.m6089c(i);
        Log.w("MetadataUtil", c.length() != 0 ? "Failed to parse text attribute: ".concat(c) : new String("Failed to parse text attribute: "));
        return null;
    }
}

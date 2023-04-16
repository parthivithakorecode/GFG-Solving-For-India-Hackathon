package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

final class ve4 {

    /* renamed from: a */
    private static final String[] f16213a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    private static final String[] f16214b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    private static final String[] f16215c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: a */
    public static re4 m18515a(String str) {
        String str2;
        String str3;
        long j;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (o23.m14247c(newPullParser, "x:xmpmeta")) {
                e73<qe4> v = e73.m8347v();
                long j2 = -9223372036854775807L;
                do {
                    newPullParser.next();
                    if (o23.m14247c(newPullParser, "rdf:Description")) {
                        String[] strArr = f16213a;
                        int i = 0;
                        int i2 = 0;
                        while (i2 < 4) {
                            String a = o23.m14245a(newPullParser, strArr[i2]);
                            if (a == null) {
                                i2++;
                            } else if (Integer.parseInt(a) != 1) {
                                return null;
                            } else {
                                String[] strArr2 = f16214b;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= 4) {
                                        break;
                                    }
                                    String a2 = o23.m14245a(newPullParser, strArr2[i3]);
                                    if (a2 != null) {
                                        j = Long.parseLong(a2);
                                        if (j == -1) {
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                                j = -9223372036854775807L;
                                String[] strArr3 = f16215c;
                                while (true) {
                                    if (i >= 2) {
                                        v = e73.m8347v();
                                        break;
                                    }
                                    String a3 = o23.m14245a(newPullParser, strArr3[i]);
                                    if (a3 != null) {
                                        v = e73.m8349x(new qe4("image/jpeg", "Primary", 0, 0), new qe4("video/mp4", "MotionPhoto", Long.parseLong(a3), 0));
                                        break;
                                    }
                                    i++;
                                }
                                j2 = j;
                            }
                        }
                        return null;
                    }
                    if (o23.m14247c(newPullParser, "Container:Directory")) {
                        str2 = "Container";
                        str3 = "Item";
                    } else if (o23.m14247c(newPullParser, "GContainer:Directory")) {
                        str2 = "GContainer";
                        str3 = "GContainerItem";
                    }
                    v = m18516b(newPullParser, str2, str3);
                } while (!o23.m14246b(newPullParser, "x:xmpmeta"));
                if (v.isEmpty()) {
                    return null;
                }
                return new re4(j2, v);
            }
            throw C1646dz.m8223a("Couldn't find xmp metadata", (Throwable) null);
        } catch (C1646dz | NumberFormatException | XmlPullParserException unused) {
            Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: b */
    private static e73<qe4> m18516b(XmlPullParser xmlPullParser, String str, String str2) {
        b73 p = e73.m8341p();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (o23.m14247c(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String a = o23.m14245a(xmlPullParser, concat3);
                String a2 = o23.m14245a(xmlPullParser, concat4);
                String a3 = o23.m14245a(xmlPullParser, concat5);
                String a4 = o23.m14245a(xmlPullParser, concat6);
                if (a == null || a2 == null) {
                    return e73.m8347v();
                }
                p.mo5730f(new qe4(a, a2, a3 != null ? Long.parseLong(a3) : 0, a4 != null ? Long.parseLong(a4) : 0));
            }
        } while (!o23.m14246b(xmlPullParser, concat2));
        return p.mo5731g();
    }
}

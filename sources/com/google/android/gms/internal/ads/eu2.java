package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public final class eu2 implements du2 {

    /* renamed from: a */
    private final Object[] f6386a;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public eu2(com.google.android.gms.internal.ads.C1902kv r3, java.lang.String r4, int r5, java.lang.String r6, com.google.android.gms.internal.ads.C2309vv r7) {
        /*
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = ","
            java.lang.String[] r1 = r6.split(r1)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r6)
            r1.add(r4)
            java.lang.String r4 = "networkType"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x002c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r1.add(r4)
        L_0x002c:
            java.lang.String r4 = "birthday"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x003d
            long r4 = r3.f9668g
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.add(r4)
        L_0x003d:
            java.lang.String r4 = "extras"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x004f
            android.os.Bundle r4 = r3.f9669h
            java.lang.String r4 = m8803a(r4)
        L_0x004b:
            r1.add(r4)
            goto L_0x005e
        L_0x004f:
            java.lang.String r4 = "npa"
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L_0x005e
            android.os.Bundle r5 = r3.f9669h
            java.lang.String r4 = r5.getString(r4)
            goto L_0x004b
        L_0x005e:
            java.lang.String r4 = "gender"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x006f
            int r4 = r3.f9670i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
        L_0x006f:
            java.lang.String r4 = "keywords"
            boolean r4 = r0.contains(r4)
            r5 = 0
            if (r4 == 0) goto L_0x0087
            java.util.List<java.lang.String> r4 = r3.f9671j
            if (r4 == 0) goto L_0x0084
            java.lang.String r4 = r4.toString()
            r1.add(r4)
            goto L_0x0087
        L_0x0084:
            r1.add(r5)
        L_0x0087:
            java.lang.String r4 = "isTestDevice"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x0098
            boolean r4 = r3.f9672k
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.add(r4)
        L_0x0098:
            java.lang.String r4 = "tagForChildDirectedTreatment"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x00a9
            int r4 = r3.f9673l
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
        L_0x00a9:
            java.lang.String r4 = "manualImpressionsEnabled"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x00ba
            boolean r4 = r3.f9674m
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.add(r4)
        L_0x00ba:
            java.lang.String r4 = "publisherProvidedId"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x00c7
            java.lang.String r4 = r3.f9675n
            r1.add(r4)
        L_0x00c7:
            java.lang.String r4 = "location"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x00de
            android.location.Location r4 = r3.f9677p
            if (r4 == 0) goto L_0x00db
            java.lang.String r4 = r4.toString()
            r1.add(r4)
            goto L_0x00de
        L_0x00db:
            r1.add(r5)
        L_0x00de:
            java.lang.String r4 = "contentUrl"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x00eb
            java.lang.String r4 = r3.f9678q
            r1.add(r4)
        L_0x00eb:
            java.lang.String r4 = "networkExtras"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x00fc
            android.os.Bundle r4 = r3.f9679r
            java.lang.String r4 = m8803a(r4)
            r1.add(r4)
        L_0x00fc:
            java.lang.String r4 = "customTargeting"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x010d
            android.os.Bundle r4 = r3.f9680s
            java.lang.String r4 = m8803a(r4)
            r1.add(r4)
        L_0x010d:
            java.lang.String r4 = "categoryExclusions"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x0124
            java.util.List<java.lang.String> r4 = r3.f9681t
            if (r4 == 0) goto L_0x0121
            java.lang.String r4 = r4.toString()
            r1.add(r4)
            goto L_0x0124
        L_0x0121:
            r1.add(r5)
        L_0x0124:
            java.lang.String r4 = "requestAgent"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x0131
            java.lang.String r4 = r3.f9682u
            r1.add(r4)
        L_0x0131:
            java.lang.String r4 = "requestPackage"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x013e
            java.lang.String r4 = r3.f9683v
            r1.add(r4)
        L_0x013e:
            java.lang.String r4 = "isDesignedForFamilies"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x014f
            boolean r4 = r3.f9684w
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.add(r4)
        L_0x014f:
            java.lang.String r4 = "tagForUnderAgeOfConsent"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x0160
            int r4 = r3.f9686y
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
        L_0x0160:
            java.lang.String r4 = "maxAdContentRating"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x016d
            java.lang.String r3 = r3.f9687z
            r1.add(r3)
        L_0x016d:
            java.lang.String r3 = "orientation"
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L_0x0184
            if (r7 == 0) goto L_0x0181
            int r3 = r7.f16418f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
            goto L_0x0184
        L_0x0181:
            r1.add(r5)
        L_0x0184:
            java.lang.Object[] r3 = r1.toArray()
            r2.f6386a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eu2.<init>(com.google.android.gms.internal.ads.kv, java.lang.String, int, java.lang.String, com.google.android.gms.internal.ads.vv):void");
    }

    /* renamed from: a */
    private static String m8803a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? m8803a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eu2)) {
            return false;
        }
        return Arrays.equals(this.f6386a, ((eu2) obj).f6386a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6386a);
    }

    public final String toString() {
        int hashCode = Arrays.hashCode(this.f6386a);
        String arrays = Arrays.toString(this.f6386a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 22);
        sb.append("[PoolKey#");
        sb.append(hashCode);
        sb.append(" ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}

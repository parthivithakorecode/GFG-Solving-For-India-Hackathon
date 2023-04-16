package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.jp */
public final class C1859jp {
    /* renamed from: a */
    static long m11757a(long j, int i) {
        if (i == 1) {
            return j;
        }
        return ((i & 1) == 0 ? m11757a((j * j) % 1073807359, i >> 1) : j * (m11757a((j * j) % 1073807359, i >> 1) % 1073807359)) % 1073807359;
    }

    /* renamed from: b */
    static String m11758b(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            io0.m11128d("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb.append(strArr[i]);
                sb.append(' ');
                i++;
            } else {
                sb.append(strArr[i4]);
                return sb.toString();
            }
        }
    }

    /* renamed from: c */
    public static void m11759c(String[] strArr, int i, int i2, PriorityQueue<C1822ip> priorityQueue) {
        String[] strArr2 = strArr;
        int length = strArr2.length;
        if (length < 6) {
            m11760d(i, m11761e(strArr2, 0, length), m11758b(strArr2, 0, length), length, priorityQueue);
            return;
        }
        long e = m11761e(strArr2, 0, 6);
        m11760d(i, e, m11758b(strArr2, 0, 6), 6, priorityQueue);
        long a = m11757a(16785407, 5);
        int i3 = 1;
        while (true) {
            int length2 = strArr2.length;
            if (i3 < length2 - 5) {
                e = ((((((e + 1073807359) - ((((((long) C1711fp.m9262a(strArr2[i3 - 1])) + 2147483647L) % 1073807359) * a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) C1711fp.m9262a(strArr2[i3 + 5])) + 2147483647L) % 1073807359)) % 1073807359;
                m11760d(i, e, m11758b(strArr2, i3, 6), length2, priorityQueue);
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    static void m11760d(int i, long j, String str, int i2, PriorityQueue<C1822ip> priorityQueue) {
        C1822ip ipVar = new C1822ip(j, str, i2);
        if ((priorityQueue.size() != i || (priorityQueue.peek().f8746c <= ipVar.f8746c && priorityQueue.peek().f8744a <= ipVar.f8744a)) && !priorityQueue.contains(ipVar)) {
            priorityQueue.add(ipVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    /* renamed from: e */
    private static long m11761e(String[] strArr, int i, int i2) {
        long a = (((long) C1711fp.m9262a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            a = (((a * 16785407) % 1073807359) + ((((long) C1711fp.m9262a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }
}

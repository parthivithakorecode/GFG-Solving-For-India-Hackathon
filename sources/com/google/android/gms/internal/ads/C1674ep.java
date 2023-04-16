package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* renamed from: com.google.android.gms.internal.ads.ep */
public final class C1674ep {

    /* renamed from: a */
    private final int f6307a;

    /* renamed from: b */
    private final C1562bp f6308b = new C1748gp();

    public C1674ep(int i) {
        this.f6307a = i;
    }

    /* renamed from: a */
    public final String mo7013a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(arrayList.get(i).toLowerCase(Locale.US));
            sb.append(10);
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        C1636dp dpVar = new C1636dp();
        PriorityQueue priorityQueue = new PriorityQueue(this.f6307a, new C1599cp(this));
        for (String b : split) {
            String[] b2 = C1711fp.m9263b(b, false);
            if (b2.length != 0) {
                C1859jp.m11759c(b2, this.f6307a, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                dpVar.f5858b.write(this.f6308b.mo5904b(((C1822ip) it.next()).f8745b));
            } catch (IOException e) {
                io0.m11129e("Error while writing hash to byteStream", e);
            }
        }
        return dpVar.toString();
    }
}

package p039f0;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.room.C1173h;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import p053h0.C2666b;
import p053h0.C2673e;

/* renamed from: f0.c */
public class C2594c {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m21276a(C2666b bVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor M = bVar.mo12647M("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (M.moveToNext()) {
            try {
                arrayList.add(M.getString(0));
            } catch (Throwable th) {
                M.close();
                throw th;
            }
        }
        M.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.mo12651i("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    /* renamed from: b */
    public static Cursor m21277b(C1173h hVar, C2673e eVar, boolean z, CancellationSignal cancellationSignal) {
        Cursor q = hVar.mo3964q(eVar, cancellationSignal);
        if (!z || !(q instanceof AbstractWindowedCursor)) {
            return q;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) q;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? C2593b.m21274a(abstractWindowedCursor) : q;
    }

    /* renamed from: c */
    public static int m21278c(File file) {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            fileChannel = new FileInputStream(file).getChannel();
            fileChannel.tryLock(60, 4, true);
            fileChannel.position(60);
            if (fileChannel.read(allocate) == 4) {
                allocate.rewind();
                int i = allocate.getInt();
                fileChannel.close();
                return i;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            if (fileChannel != null) {
                fileChannel.close();
            }
            throw th;
        }
    }
}

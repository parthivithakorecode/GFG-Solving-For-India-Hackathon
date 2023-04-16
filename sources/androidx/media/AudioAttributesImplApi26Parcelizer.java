package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.C1210a;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(C1210a aVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f3043a = (AudioAttributes) aVar.mo4194r(audioAttributesImplApi26.f3043a, 1);
        audioAttributesImplApi26.f3044b = aVar.mo4192p(audioAttributesImplApi26.f3044b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, C1210a aVar) {
        aVar.mo4200x(false, false);
        aVar.mo4174H(audioAttributesImplApi26.f3043a, 1);
        aVar.mo4172F(audioAttributesImplApi26.f3044b, 2);
    }
}

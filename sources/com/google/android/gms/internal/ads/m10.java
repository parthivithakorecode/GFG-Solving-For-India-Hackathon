package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class m10 {

    /* renamed from: A */
    public static final e10<Boolean> f10233A;

    /* renamed from: A0 */
    public static final e10<Boolean> f10234A0;

    /* renamed from: A1 */
    public static final e10<Boolean> f10235A1;

    /* renamed from: A2 */
    public static final e10<Boolean> f10236A2;

    /* renamed from: A3 */
    public static final e10<Integer> f10237A3 = e10.m8262g(1, "gad:http_redirect_max_count:times", 8);

    /* renamed from: A4 */
    public static final e10<String> f10238A4 = e10.m8265j(1, "gads:sp:json_string", "");

    /* renamed from: A5 */
    public static final e10<String> f10239A5 = e10.m8265j(1, "gads:scar_v2:user_agent:key", "ua");

    /* renamed from: A6 */
    public static final e10<Boolean> f10240A6;

    /* renamed from: B */
    public static final e10<Integer> f10241B = e10.m8262g(1, "gads:video:spinner:scale", 4);

    /* renamed from: B0 */
    public static final e10<Boolean> f10242B0;

    /* renamed from: B1 */
    public static final e10<Boolean> f10243B1;

    /* renamed from: B2 */
    public static final e10<Boolean> f10244B2;

    /* renamed from: B3 */
    public static final e10<Boolean> f10245B3;

    /* renamed from: B4 */
    public static final e10<Boolean> f10246B4;

    /* renamed from: B5 */
    public static final e10<Boolean> f10247B5;

    /* renamed from: B6 */
    public static final e10<String> f10248B6 = e10.m8265j(1, "gads:inspector:ui_url", "https://admob-gmats.uc.r.appspot.com/");

    /* renamed from: C */
    public static final e10<Long> f10249C = e10.m8263h(1, "gads:video:spinner:jank_threshold_ms", 50);

    /* renamed from: C0 */
    public static final e10<String> f10250C0 = e10.m8265j(1, "gads:webview_cookie_url", "googleads.g.doubleclick.net");

    /* renamed from: C1 */
    public static final e10<Integer> f10251C1 = e10.m8262g(1, "gads:gestures:a2:enabled", 0);

    /* renamed from: C2 */
    public static final e10<Boolean> f10252C2;

    /* renamed from: C3 */
    public static final e10<Integer> f10253C3 = e10.m8262g(1, "gads:omid:destroy_webview_delay", 1000);

    /* renamed from: C4 */
    public static final e10<Integer> f10254C4 = e10.m8262g(1, "gads:nativeads:image:sample:pixels", 1048576);

    /* renamed from: C5 */
    public static final e10<String> f10255C5 = e10.m8265j(1, "gads:scar_v2:prior_click_count:key", "pcc");

    /* renamed from: C6 */
    public static final e10<Integer> f10256C6 = e10.m8262g(1, "gads:inspector:max_ad_life_cycles", 1000);

    /* renamed from: D */
    public static final e10<Boolean> f10257D;

    /* renamed from: D0 */
    public static final e10<Boolean> f10258D0;

    /* renamed from: D1 */
    public static final e10<Boolean> f10259D1;

    /* renamed from: D2 */
    public static final e10<Boolean> f10260D2;

    /* renamed from: D3 */
    public static final e10<Boolean> f10261D3;

    /* renamed from: D4 */
    public static final e10<Boolean> f10262D4;

    /* renamed from: D5 */
    public static final e10<String> f10263D5 = e10.m8265j(1, "gads:scar_v2:pings_from_gma:key", "is_gma");

    /* renamed from: D6 */
    public static final e10<Integer> f10264D6 = e10.m8262g(1, "gads:inspector:ui_invocation_millis", 2000);

    /* renamed from: E */
    public static final e10<Boolean> f10265E;

    /* renamed from: E0 */
    public static final e10<Boolean> f10266E0;

    /* renamed from: E1 */
    public static final e10<Boolean> f10267E1;

    /* renamed from: E2 */
    public static final e10<Long> f10268E2 = e10.m8263h(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);

    /* renamed from: E3 */
    public static final e10<Boolean> f10269E3;

    /* renamed from: E4 */
    public static final e10<Boolean> f10270E4;

    /* renamed from: E5 */
    public static final e10<Boolean> f10271E5;

    /* renamed from: E6 */
    public static final e10<Boolean> f10272E6;

    /* renamed from: F */
    public static final e10<String> f10273F = e10.m8265j(1, "gads:video:codec_query_mime_types", "");

    /* renamed from: F0 */
    public static final e10<Boolean> f10274F0;

    /* renamed from: F1 */
    public static final e10<Boolean> f10275F1;

    /* renamed from: F2 */
    public static final e10<Long> f10276F2 = e10.m8263h(1, "gads:parental_controls:timeout", 2000);

    /* renamed from: F3 */
    public static final e10<Boolean> f10277F3;

    /* renamed from: F4 */
    public static final e10<Integer> f10278F4 = e10.m8262g(1, "gads:offline_signaling:log_maximum", 100);

    /* renamed from: F5 */
    public static final e10<Integer> f10279F5 = e10.m8262g(1, "gads:native_ads_signal:timeout", 1000);

    /* renamed from: F6 */
    public static final e10<Float> f10280F6 = e10.m8261f(1, "gads:inspector:shake_strength", 2.0f);

    /* renamed from: G */
    public static final e10<Integer> f10281G = e10.m8262g(1, "gads:video:codec_query_minimum_version", 16);

    /* renamed from: G0 */
    public static final e10<Long> f10282G0 = e10.m8263h(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500);

    /* renamed from: G1 */
    public static final e10<Boolean> f10283G1;

    /* renamed from: G2 */
    public static final e10<Integer> f10284G2 = e10.m8262g(1, "gads:cache:ad_request_timeout_millis", 250);

    /* renamed from: G3 */
    public static final e10<String> f10285G3;

    /* renamed from: G4 */
    public static final e10<Boolean> f10286G4;

    /* renamed from: G5 */
    public static final e10<Boolean> f10287G5;

    /* renamed from: G6 */
    public static final e10<Integer> f10288G6 = e10.m8262g(1, "gads:inspector:shake_interval", 500);

    /* renamed from: H */
    public static final e10<String> f10289H = e10.m8265j(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_banner.js");

    /* renamed from: H0 */
    public static final e10<Long> f10290H0 = e10.m8263h(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));

    /* renamed from: H1 */
    public static final e10<Boolean> f10291H1;

    /* renamed from: H2 */
    public static final e10<Integer> f10292H2 = e10.m8262g(1, "gads:cache:max_concurrent_downloads", 10);

    /* renamed from: H3 */
    public static final e10<Boolean> f10293H3;

    /* renamed from: H4 */
    public static final e10<Boolean> f10294H4;

    /* renamed from: H5 */
    public static final e10<Boolean> f10295H5;

    /* renamed from: H6 */
    public static final e10<Integer> f10296H6 = e10.m8262g(1, "gads:inspector:shake_reset_time_ms", 3000);

    /* renamed from: I */
    public static final e10<String> f10297I = e10.m8265j(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_expanded_banner.js");

    /* renamed from: I0 */
    public static final e10<Boolean> f10298I0;

    /* renamed from: I1 */
    public static final e10<String> f10299I1 = e10.m8265j(1, "gads:msa:experiments:incapi:trusted_cert", "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a");

    /* renamed from: I2 */
    public static final e10<Boolean> f10300I2;

    /* renamed from: I3 */
    public static final e10<Integer> f10301I3 = e10.m8262g(1, "gads:app_open_beta:min_version", 999999999);

    /* renamed from: I4 */
    public static final e10<Boolean> f10302I4;

    /* renamed from: I5 */
    public static final e10<Boolean> f10303I5;

    /* renamed from: I6 */
    public static final e10<Integer> f10304I6 = e10.m8262g(1, "gads:inspector:shake_count", 3);

    /* renamed from: J */
    public static final e10<String> f10305J = e10.m8265j(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_interstitial.js");

    /* renamed from: J0 */
    public static final e10<Long> f10306J0 = e10.m8263h(1, "gads:adid_values_in_adrequest:timeout", 2000);

    /* renamed from: J1 */
    public static final e10<String> f10307J1 = e10.m8265j(1, "gads:msa:experiments:incapi:debug_cert", "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b");

    /* renamed from: J2 */
    public static final e10<Long> f10308J2 = e10.m8263h(1, "gads:cache:javascript_timeout_millis", 5000);

    /* renamed from: J3 */
    public static final e10<Integer> f10309J3 = e10.m8262g(1, "gads:app_open_ad_open_beta_api:min_version", 202490999);

    /* renamed from: J4 */
    public static final e10<Boolean> f10310J4;

    /* renamed from: J5 */
    public static final e10<Boolean> f10311J5;

    /* renamed from: J6 */
    public static final e10<Boolean> f10312J6;

    /* renamed from: K */
    public static final e10<String> f10313K = e10.m8265j(1, "gad:mraid:version", "3.0");

    /* renamed from: K0 */
    public static final e10<Boolean> f10314K0;

    /* renamed from: K1 */
    public static final e10<Boolean> f10315K1;

    /* renamed from: K2 */
    public static final e10<Boolean> f10316K2;

    /* renamed from: K3 */
    public static final e10<Boolean> f10317K3;

    /* renamed from: K4 */
    public static final e10<Boolean> f10318K4;

    /* renamed from: K5 */
    public static final e10<Integer> f10319K5 = e10.m8262g(1, "gads:interscroller:min_width", 300);

    /* renamed from: K6 */
    public static final e10<Float> f10320K6 = e10.m8261f(1, "gads:inspector:flick_rotation_threshold", 45.0f);

    /* renamed from: L */
    public static final e10<Boolean> f10321L;

    /* renamed from: L0 */
    public static final e10<Long> f10322L0 = e10.m8263h(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000);

    /* renamed from: L1 */
    public static final p20<Boolean> f10323L1 = f30.f6672b;

    /* renamed from: L2 */
    public static final e10<Boolean> f10324L2;

    /* renamed from: L3 */
    public static final e10<String> f10325L3;

    /* renamed from: L4 */
    public static final e10<Boolean> f10326L4;

    /* renamed from: L5 */
    public static final e10<Integer> f10327L5 = e10.m8262g(1, "gads:interscroller:min_height", 250);

    /* renamed from: L6 */
    public static final e10<Integer> f10328L6 = e10.m8262g(1, "gads:inspector:flick_reset_time_ms", 3000);

    /* renamed from: M */
    public static final e10<Boolean> f10329M;

    /* renamed from: M0 */
    public static final e10<Boolean> f10330M0;

    /* renamed from: M1 */
    public static final e10<Boolean> f10331M1;

    /* renamed from: M2 */
    public static final e10<Boolean> f10332M2;

    /* renamed from: M3 */
    public static final e10<Boolean> f10333M3;

    /* renamed from: M4 */
    public static final e10<Boolean> f10334M4;

    /* renamed from: M5 */
    public static final e10<Boolean> f10335M5;

    /* renamed from: M6 */
    public static final e10<Integer> f10336M6 = e10.m8262g(1, "gads:inspector:flick_count", 2);

    /* renamed from: N */
    public static final e10<Integer> f10337N = e10.m8262g(1, "gads:content_vertical_fingerprint_number", 100);

    /* renamed from: N0 */
    public static final e10<Boolean> f10338N0;

    /* renamed from: N1 */
    public static final e10<Long> f10339N1 = e10.m8263h(1, "gads:gestures:task_timeout", 2000);

    /* renamed from: N2 */
    public static final e10<Long> f10340N2 = e10.m8263h(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));

    /* renamed from: N3 */
    public static final e10<String> f10341N3;

    /* renamed from: N4 */
    public static final e10<Boolean> f10342N4;

    /* renamed from: N5 */
    public static final e10<Boolean> f10343N5;

    /* renamed from: N6 */
    public static final e10<Integer> f10344N6 = e10.m8262g(1, "gads:inspector:icon_width_px", 256);

    /* renamed from: O */
    public static final e10<Integer> f10345O = e10.m8262g(1, "gads:content_vertical_fingerprint_bits", 23);

    /* renamed from: O0 */
    public static final e10<Boolean> f10346O0;

    /* renamed from: O1 */
    public static final e10<Boolean> f10347O1;

    /* renamed from: O2 */
    public static final e10<Boolean> f10348O2;

    /* renamed from: O3 */
    public static final e10<Boolean> f10349O3;

    /* renamed from: O4 */
    public static final e10<Integer> f10350O4 = e10.m8262g(1, "gads:rewarded_precache_pool:count", 0);

    /* renamed from: O5 */
    public static final e10<String> f10351O5 = e10.m8265j(1, "gad:publisher_testing:policy_validator:enabled_list", "");

    /* renamed from: O6 */
    public static final e10<Integer> f10352O6 = e10.m8262g(1, "gads:inspector:icon_height_px", 256);

    /* renamed from: P */
    public static final e10<Integer> f10353P = e10.m8262g(1, "gads:content_vertical_fingerprint_ngram", 3);

    /* renamed from: P0 */
    public static final e10<String> f10354P0 = e10.m8265j(1, "gads:close_button_asset_name", "default");

    /* renamed from: P1 */
    public static final e10<Boolean> f10355P1;

    /* renamed from: P2 */
    public static final e10<Boolean> f10356P2;

    /* renamed from: P3 */
    public static final e10<Boolean> f10357P3;

    /* renamed from: P4 */
    public static final e10<Integer> f10358P4 = e10.m8262g(1, "gads:interstitial_precache_pool:count", 0);

    /* renamed from: P5 */
    public static final e10<Integer> f10359P5 = e10.m8262g(1, "gads:policy_validator_layoutparam:flags", 808);

    /* renamed from: P6 */
    public static final e10<Boolean> f10360P6;

    /* renamed from: Q */
    public static final e10<String> f10361Q = e10.m8265j(1, "gads:content_fetch_view_tag_id", "googlebot");

    /* renamed from: Q0 */
    public static final e10<Long> f10362Q0 = e10.m8263h(1, "gads:close_button_fade_in_duration_ms", 0);

    /* renamed from: Q1 */
    public static final e10<Boolean> f10363Q1;

    /* renamed from: Q2 */
    public static final e10<Long> f10364Q2 = e10.m8263h(1, "gads:cache:connection_timeout", 5000);

    /* renamed from: Q3 */
    public static final e10<String> f10365Q3;

    /* renamed from: Q4 */
    public static final e10<String> f10366Q4 = e10.m8265j(1, "gads:rewarded_precache_pool:discard_strategy", "lru");

    /* renamed from: Q5 */
    public static final e10<Boolean> f10367Q5;

    /* renamed from: Q6 */
    public static final e10<Boolean> f10368Q6;

    /* renamed from: R */
    public static final e10<String> f10369R = e10.m8265j(1, "gads:content_fetch_exclude_view_tag", "none");

    /* renamed from: R0 */
    public static final e10<Boolean> f10370R0;

    /* renamed from: R1 */
    public static final e10<Boolean> f10371R1;

    /* renamed from: R2 */
    public static final e10<Long> f10372R2 = e10.m8263h(1, "gads:cache:read_only_connection_timeout", 5000);

    /* renamed from: R3 */
    public static final e10<Boolean> f10373R3;

    /* renamed from: R4 */
    public static final e10<String> f10374R4 = e10.m8265j(1, "gads:interstitial_precache_pool:discard_strategy", "lru");

    /* renamed from: R5 */
    public static final e10<Integer> f10375R5 = e10.m8262g(1, "gads:policy_validator_overlay_width:dp", 350);

    /* renamed from: R6 */
    public static final e10<Boolean> f10376R6;

    /* renamed from: S */
    public static final e10<Boolean> f10377S;

    /* renamed from: S0 */
    public static final e10<Boolean> f10378S0;

    /* renamed from: S1 */
    public static final e10<Boolean> f10379S1;

    /* renamed from: S2 */
    public static final e10<Boolean> f10380S2;

    /* renamed from: S3 */
    public static final e10<Boolean> f10381S3;

    /* renamed from: S4 */
    public static final e10<String> f10382S4 = e10.m8265j(1, "gads:rewarded_precache_pool:cache_start_trigger", "onAdClosed");

    /* renamed from: S5 */
    public static final e10<Integer> f10383S5 = e10.m8262g(1, "gads:policy_validator_overlay_height:dp", 140);

    /* renamed from: S6 */
    public static final e10<Boolean> f10384S6;

    /* renamed from: T */
    public static final e10<Boolean> f10385T;

    /* renamed from: T0 */
    public static final e10<Boolean> f10386T0;

    /* renamed from: T1 */
    public static final e10<Boolean> f10387T1;

    /* renamed from: T2 */
    public static final e10<Boolean> f10388T2;

    /* renamed from: T3 */
    public static final e10<Boolean> f10389T3;

    /* renamed from: T4 */
    public static final e10<String> f10390T4 = e10.m8265j(1, "gads:interstitial_precache_pool:cache_start_trigger", "onAdClosed");

    /* renamed from: T5 */
    public static final e10<Boolean> f10391T5;

    /* renamed from: T6 */
    public static final e10<Boolean> f10392T6;

    /* renamed from: U */
    public static final e10<Boolean> f10393U;

    /* renamed from: U0 */
    public static final e10<String> f10394U0 = e10.m8265j(1, "gads:spherical_video:vertex_shader", "");

    /* renamed from: U1 */
    public static final e10<Boolean> f10395U1;

    /* renamed from: U2 */
    public static final e10<Boolean> f10396U2;

    /* renamed from: U3 */
    public static final e10<Boolean> f10397U3;

    /* renamed from: U4 */
    public static final e10<Integer> f10398U4 = e10.m8262g(1, "gads:rewarded_precache_pool:size", 1);

    /* renamed from: U5 */
    public static final e10<Boolean> f10399U5;

    /* renamed from: U6 */
    public static final e10<Boolean> f10400U6;

    /* renamed from: V */
    public static final e10<Boolean> f10401V;

    /* renamed from: V0 */
    public static final e10<String> f10402V0 = e10.m8265j(1, "gads:spherical_video:fragment_shader", "");

    /* renamed from: V1 */
    public static final e10<Boolean> f10403V1;

    /* renamed from: V2 */
    public static final e10<Long> f10404V2 = e10.m8263h(1, "gads:cache:function_call_timeout", 5000);

    /* renamed from: V3 */
    public static final e10<Boolean> f10405V3;

    /* renamed from: V4 */
    public static final e10<Integer> f10406V4 = e10.m8262g(1, "gads:interstitial_precache_pool:size", 1);

    /* renamed from: V5 */
    public static final e10<Boolean> f10407V5;

    /* renamed from: V6 */
    public static final e10<Integer> f10408V6 = e10.m8262g(1, "gads:h5ads:max_num_ad_objects", 10);

    /* renamed from: W */
    public static final e10<String> f10409W = e10.m8265j(1, "gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");

    /* renamed from: W0 */
    public static final e10<Boolean> f10410W0;

    /* renamed from: W1 */
    public static final e10<String> f10411W1 = e10.m8265j(1, "gads:gestures:pk", "");

    /* renamed from: W2 */
    public static final e10<Boolean> f10412W2;

    /* renamed from: W3 */
    public static final e10<Integer> f10413W3 = e10.m8262g(1, "gads:nonagon:request_timeout:seconds", 60);

    /* renamed from: W4 */
    public static final e10<Integer> f10414W4 = e10.m8262g(1, "gads:rewarded_precache_pool:ad_time_limit", 1200);

    /* renamed from: W5 */
    public static final e10<Boolean> f10415W5;

    /* renamed from: W6 */
    public static final e10<Integer> f10416W6 = e10.m8262g(1, "gads:h5ads:max_gmsg_length", 5000);

    /* renamed from: X */
    public static final e10<String> f10417X = e10.m8265j(1, "gads:sai:impression_ping_schema_v2", "^[^?]*(/adview|/pcs/view).*");

    /* renamed from: X0 */
    public static final e10<Long> f10418X0 = e10.m8263h(1, "gads:position_watcher:throttle_ms", 200);

    /* renamed from: X1 */
    public static final e10<Boolean> f10419X1;

    /* renamed from: X2 */
    public static final e10<Boolean> f10420X2;

    /* renamed from: X3 */
    public static final e10<Boolean> f10421X3;

    /* renamed from: X4 */
    public static final e10<Integer> f10422X4 = e10.m8262g(1, "gads:interstitial_precache_pool:ad_time_limit", 1200);

    /* renamed from: X5 */
    public static final e10<Boolean> f10423X5;

    /* renamed from: X6 */
    public static final e10<String> f10424X6 = e10.m8265j(1, "gads:h5ads:afma_prefix", "(window.AFMA_ReceiveMessage||function(msg,params){window.h5_iframe.contentWindow.postMessage({messageName:'receive_message_action',parameters:{messageName:msg,parameters:params}},'*');})");

    /* renamed from: Y */
    public static final e10<Boolean> f10425Y;

    /* renamed from: Y0 */
    public static final e10<Long> f10426Y0 = e10.m8263h(1, "gads:position_watcher:scroll_aware_throttle_ms", 33);

    /* renamed from: Y1 */
    public static final e10<Boolean> f10427Y1;

    /* renamed from: Y2 */
    public static final e10<String> f10428Y2 = e10.m8265j(1, "gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");

    /* renamed from: Y3 */
    public static final e10<Boolean> f10429Y3;

    /* renamed from: Y4 */
    public static final e10<String> f10430Y4 = e10.m8265j(1, "gads:rewarded_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");

    /* renamed from: Y5 */
    public static final e10<String> f10431Y5 = e10.m8265j(1, "gads:server_transaction_source:list", "Network");

    /* renamed from: Y6 */
    public static final e10<Boolean> f10432Y6;

    /* renamed from: Z */
    public static final e10<String> f10433Z = e10.m8265j(1, "gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");

    /* renamed from: Z0 */
    public static final e10<Boolean> f10434Z0;

    /* renamed from: Z1 */
    public static final e10<Boolean> f10435Z1;

    /* renamed from: Z2 */
    public static final e10<Integer> f10436Z2 = e10.m8262g(1, "gads:http_assets_cache:time_out", 100);

    /* renamed from: Z3 */
    public static final e10<Boolean> f10437Z3;

    /* renamed from: Z4 */
    public static final e10<String> f10438Z4 = e10.m8265j(1, "gads:interstitial_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");

    /* renamed from: Z5 */
    public static final e10<Boolean> f10439Z5;

    /* renamed from: Z6 */
    public static final e10<Boolean> f10440Z6;

    /* renamed from: a */
    public static final e10<String> f10441a = e10.m8265j(1, "gads:sdk_core_location:client:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* renamed from: a0 */
    public static final e10<Long> f10442a0 = e10.m8263h(1, "gads:sai:timeout_ms", -1);

    /* renamed from: a1 */
    public static final e10<Boolean> f10443a1;

    /* renamed from: a2 */
    public static final e10<Boolean> f10444a2;

    /* renamed from: a3 */
    public static final e10<Boolean> f10445a3;

    /* renamed from: a4 */
    public static final e10<Boolean> f10446a4;

    /* renamed from: a5 */
    public static final e10<String> f10447a5 = e10.m8265j(1, "gads:app_open_precache_pool:schema", "orientation,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");

    /* renamed from: a6 */
    public static final e10<Boolean> f10448a6;

    /* renamed from: a7 */
    public static final e10<Boolean> f10449a7;

    /* renamed from: b */
    public static final e10<String> f10450b = e10.m8265j(1, "gads:active_view_location:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* renamed from: b0 */
    public static final e10<Integer> f10451b0 = e10.m8262g(1, "gads:sai:scion_thread_pool_size", 5);

    /* renamed from: b1 */
    public static final e10<Boolean> f10452b1;

    /* renamed from: b2 */
    public static final e10<Integer> f10453b2 = e10.m8262g(1, "gads:gestures:as2percentage", 0);

    /* renamed from: b3 */
    public static final e10<Boolean> f10454b3;

    /* renamed from: b4 */
    public static final e10<String> f10455b4 = e10.m8265j(1, "gads:uri_query_to_map_bg_thread:types", "/result");

    /* renamed from: b5 */
    public static final e10<String> f10456b5 = e10.m8265j(1, "gads:app_open_precache_pool:discard_strategy", "oldest");

    /* renamed from: b6 */
    public static final e10<Integer> f10457b6 = e10.m8262g(1, "gads:ad_error_api:min_version", 202006000);

    /* renamed from: b7 */
    public static final e10<Boolean> f10458b7;

    /* renamed from: c */
    public static final p20<Boolean> f10459c = g30.f7257d;

    /* renamed from: c0 */
    public static final e10<Boolean> f10460c0;

    /* renamed from: c1 */
    public static final e10<String> f10461c1 = e10.m8265j(1, "gads:logged_adapter_version_classes", "");

    /* renamed from: c2 */
    public static final e10<Boolean> f10462c2;

    /* renamed from: c3 */
    public static final e10<Boolean> f10463c3;

    /* renamed from: c4 */
    public static final e10<Integer> f10464c4 = e10.m8262g(1, "gads:uri_query_to_map_bg_thread:min_length", 1000);

    /* renamed from: c5 */
    public static final e10<Integer> f10465c5 = e10.m8262g(1, "gads:app_open_precache_pool:count", 0);

    /* renamed from: c6 */
    public static final e10<Boolean> f10466c6;

    /* renamed from: c7 */
    public static final e10<Boolean> f10467c7;

    /* renamed from: d */
    public static final e10<Integer> f10468d = e10.m8262g(1, "gads:http_url_connection_factory:timeout_millis", 10000);

    /* renamed from: d0 */
    public static final e10<Integer> f10469d0 = e10.m8262g(1, "gads:sai:app_measurement_min_client_dynamite_version", 20290);

    /* renamed from: d1 */
    public static final e10<Long> f10470d1 = e10.m8263h(1, "gads:rtb_v1_1:signal_timeout_ms", 1000);

    /* renamed from: d2 */
    public static final e10<Boolean> f10471d2;

    /* renamed from: d3 */
    public static final e10<Boolean> f10472d3;

    /* renamed from: d4 */
    public static final e10<Boolean> f10473d4;

    /* renamed from: d5 */
    public static final e10<String> f10474d5 = e10.m8265j(1, "gads:app_open_precache_pool:cache_start_trigger", "onAdClosed");

    /* renamed from: d6 */
    public static final e10<Boolean> f10475d6;

    /* renamed from: d7 */
    public static final e10<Boolean> f10476d7;

    /* renamed from: e */
    public static final e10<String> f10477e = e10.m8265j(1, "gads:video_exo_player:version", "3");

    /* renamed from: e0 */
    public static final e10<Boolean> f10478e0;

    /* renamed from: e1 */
    public static final e10<String> f10479e1 = e10.m8265j(1, "gads:rtb_logging:regex", "(?!)");

    /* renamed from: e2 */
    public static final e10<Boolean> f10480e2;

    /* renamed from: e3 */
    public static final e10<Boolean> f10481e3;

    /* renamed from: e4 */
    public static final e10<Boolean> f10482e4;

    /* renamed from: e5 */
    public static final e10<Integer> f10483e5 = e10.m8262g(1, "gads:app_open_precache_pool:size", 1);

    /* renamed from: e6 */
    public static final e10<Boolean> f10484e6;

    /* renamed from: e7 */
    public static final e10<Integer> f10485e7 = e10.m8262g(1, "gads:msa:visminalpha", 90);

    /* renamed from: f */
    public static final e10<Integer> f10486f = e10.m8262g(1, "gads:video_exo_player:connect_timeout", 8000);

    /* renamed from: f0 */
    public static final e10<Boolean> f10487f0;

    /* renamed from: f1 */
    public static final e10<Boolean> f10488f1;

    /* renamed from: f2 */
    public static final e10<Boolean> f10489f2;

    /* renamed from: f3 */
    public static final e10<Boolean> f10490f3;

    /* renamed from: f4 */
    public static final e10<Boolean> f10491f4;

    /* renamed from: f5 */
    public static final e10<Integer> f10492f5 = e10.m8262g(1, "gads:app_open_precache_pool:ad_time_limit", 14400);

    /* renamed from: f6 */
    public static final e10<Integer> f10493f6 = e10.m8262g(1, "gads:mediation_no_fill_error:min_version", 999999999);

    /* renamed from: f7 */
    public static final e10<Boolean> f10494f7;

    /* renamed from: g */
    public static final e10<Integer> f10495g = e10.m8262g(1, "gads:video_exo_player:read_timeout", 8000);

    /* renamed from: g0 */
    public static final e10<Boolean> f10496g0;

    /* renamed from: g1 */
    public static final e10<Boolean> f10497g1;

    /* renamed from: g2 */
    public static final e10<Boolean> f10498g2;

    /* renamed from: g3 */
    public static final e10<Boolean> f10499g3;

    /* renamed from: g4 */
    public static final e10<Boolean> f10500g4;

    /* renamed from: g5 */
    public static final e10<Boolean> f10501g5;

    /* renamed from: g6 */
    public static final e10<Boolean> f10502g6;

    /* renamed from: g7 */
    public static final e10<Boolean> f10503g7;

    /* renamed from: h */
    public static final e10<Integer> f10504h = e10.m8262g(1, "gads:video_exo_player:loading_check_interval", 1048576);

    /* renamed from: h0 */
    public static final e10<Boolean> f10505h0;

    /* renamed from: h1 */
    public static final e10<Boolean> f10506h1;

    /* renamed from: h2 */
    public static final e10<Boolean> f10507h2;

    /* renamed from: h3 */
    public static final e10<String> f10508h3 = e10.m8265j(1, "gad:publisher_testing:cct_v2:enabled_list", "");

    /* renamed from: h4 */
    public static final e10<Boolean> f10509h4;

    /* renamed from: h5 */
    public static final e10<Boolean> f10510h5;

    /* renamed from: h6 */
    public static final e10<Integer> f10511h6 = e10.m8262g(1, "gads:offline_database_version:version", 1);

    /* renamed from: h7 */
    public static final e10<Boolean> f10512h7;

    /* renamed from: i */
    public static final e10<Integer> f10513i = e10.m8262g(1, "gads:video_exo_player:exo_player_precache_limit", Integer.MAX_VALUE);

    /* renamed from: i0 */
    public static final e10<Boolean> f10514i0;

    /* renamed from: i1 */
    public static final e10<Boolean> f10515i1;

    /* renamed from: i2 */
    public static final e10<Boolean> f10516i2;

    /* renamed from: i3 */
    public static final e10<Boolean> f10517i3;

    /* renamed from: i4 */
    public static final e10<Boolean> f10518i4;

    /* renamed from: i5 */
    public static final e10<Boolean> f10519i5;

    /* renamed from: i6 */
    public static final e10<Boolean> f10520i6;

    /* renamed from: i7 */
    public static final e10<Boolean> f10521i7;

    /* renamed from: j */
    public static final e10<Integer> f10522j = e10.m8262g(1, "gads:video_exo_player:byte_buffer_precache_limit", Integer.MAX_VALUE);

    /* renamed from: j0 */
    public static final e10<Boolean> f10523j0;

    /* renamed from: j1 */
    public static final e10<Integer> f10524j1 = e10.m8262g(1, "gads:native_ad_options_rtb:min_version", 204890000);

    /* renamed from: j2 */
    public static final e10<Boolean> f10525j2;

    /* renamed from: j3 */
    public static final e10<Long> f10526j3 = e10.m8263h(1, "gads:debug_hold_gesture:time_millis", 2000);

    /* renamed from: j4 */
    public static final e10<Boolean> f10527j4;

    /* renamed from: j5 */
    public static final e10<Boolean> f10528j5;

    /* renamed from: j6 */
    public static final e10<Boolean> f10529j6;

    /* renamed from: j7 */
    public static final e10<Integer> f10530j7 = e10.m8262g(1, "gads:timeout_for_show_call_succeed:ms", 3000);

    /* renamed from: k */
    public static final e10<Integer> f10531k = e10.m8262g(1, "gads:video_exo_player_socket_receive_buffer_size", 0);

    /* renamed from: k0 */
    public static final e10<Boolean> f10532k0;

    /* renamed from: k1 */
    public static final e10<Boolean> f10533k1;

    /* renamed from: k2 */
    public static final e10<Integer> f10534k2 = e10.m8262g(1, "gads:gass:impression_retry:count", 0);

    /* renamed from: k3 */
    public static final e10<String> f10535k3 = e10.m8265j(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");

    /* renamed from: k4 */
    public static final e10<Boolean> f10536k4;

    /* renamed from: k5 */
    public static final e10<Boolean> f10537k5;

    /* renamed from: k6 */
    public static final e10<Boolean> f10538k6;

    /* renamed from: k7 */
    public static final e10<Boolean> f10539k7;

    /* renamed from: l */
    public static final e10<Integer> f10540l = e10.m8262g(1, "gads:video_exo_player:min_retry_count", -1);

    /* renamed from: l0 */
    public static final e10<Boolean> f10541l0;

    /* renamed from: l1 */
    public static final e10<Boolean> f10542l1;

    /* renamed from: l2 */
    public static final e10<Integer> f10543l2 = e10.m8262g(1, "gads:gass:impression_retry:delay_ms", 400);

    /* renamed from: l3 */
    public static final e10<String> f10544l3 = e10.m8265j(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");

    /* renamed from: l4 */
    public static final e10<Boolean> f10545l4;

    /* renamed from: l5 */
    public static final e10<String> f10546l5 = e10.m8265j(1, "gads:csi:error_parsing:regex", "^(\\d+)");

    /* renamed from: l6 */
    public static final e10<Boolean> f10547l6;

    /* renamed from: l7 */
    public static final e10<Boolean> f10548l7;

    /* renamed from: m */
    public static final e10<Boolean> f10549m;

    /* renamed from: m0 */
    public static final e10<Long> f10550m0 = e10.m8263h(1, "gads:sai:server_side_npa:ttl", TimeUnit.DAYS.toMillis(90));

    /* renamed from: m1 */
    public static final e10<Boolean> f10551m1;

    /* renamed from: m2 */
    public static final e10<String> f10552m2 = e10.m8266k(1, "gads:sdk_core_constants:experiment_id");

    /* renamed from: m3 */
    public static final e10<String> f10553m3 = e10.m8265j(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");

    /* renamed from: m4 */
    public static final e10<Boolean> f10554m4;

    /* renamed from: m5 */
    public static final e10<Boolean> f10555m5;

    /* renamed from: m6 */
    public static final e10<Boolean> f10556m6;

    /* renamed from: m7 */
    public static final e10<Boolean> f10557m7;

    /* renamed from: n */
    public static final e10<Boolean> f10558n;

    /* renamed from: n0 */
    public static final e10<String> f10559n0 = e10.m8265j(1, "gads:sai:server_side_npa:shared_preference_key_list", "{  \"__default__\": [    \"IABTCF_TCString\"  ],  \"mobileads_consent\": [    \"consent_string\"  ]}");

    /* renamed from: n1 */
    public static final e10<Boolean> f10560n1;

    /* renamed from: n2 */
    public static final e10<String> f10561n2 = e10.m8265j(1, "gads:sdk_core_constants:caps", "");

    /* renamed from: n3 */
    public static final e10<String> f10562n3 = e10.m8265j(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");

    /* renamed from: n4 */
    public static final e10<Boolean> f10563n4;

    /* renamed from: n5 */
    public static final e10<Boolean> f10564n5;

    /* renamed from: n6 */
    public static final e10<Boolean> f10565n6;

    /* renamed from: n7 */
    public static final e10<Boolean> f10566n7;

    /* renamed from: o */
    public static final e10<Boolean> f10567o;

    /* renamed from: o0 */
    public static final e10<Boolean> f10568o0;

    /* renamed from: o1 */
    public static final e10<Integer> f10569o1 = e10.m8262g(1, "gads:adapter_initialization:min_sdk_version", 15301000);

    /* renamed from: o2 */
    public static final e10<Boolean> f10570o2;

    /* renamed from: o3 */
    public static final e10<Integer> f10571o3 = e10.m8262g(1, "gads:drx_debug:timeout_ms", 5000);

    /* renamed from: o4 */
    public static final e10<Boolean> f10572o4;

    /* renamed from: o5 */
    public static final e10<Boolean> f10573o5;

    /* renamed from: o6 */
    public static final e10<Boolean> f10574o6;

    /* renamed from: o7 */
    public static final e10<Boolean> f10575o7;

    /* renamed from: p */
    public static final e10<Integer> f10576p = e10.m8262g(1, "gads:video_stream_cache:limit_count", 5);

    /* renamed from: p0 */
    public static final e10<Boolean> f10577p0;

    /* renamed from: p1 */
    public static final e10<Long> f10578p1 = e10.m8263h(1, "gads:adapter_initialization:timeout", 30);

    /* renamed from: p2 */
    public static final e10<String> f10579p2 = e10.m8265j(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");

    /* renamed from: p3 */
    public static final e10<Integer> f10580p3 = e10.m8262g(1, "gad:pixel_dp_comparision_multiplier", 1);

    /* renamed from: p4 */
    public static final e10<Boolean> f10581p4;

    /* renamed from: p5 */
    public static final e10<Boolean> f10582p5;

    /* renamed from: p6 */
    public static final e10<Boolean> f10583p6;

    /* renamed from: p7 */
    public static final e10<Boolean> f10584p7;

    /* renamed from: q */
    public static final e10<Integer> f10585q = e10.m8262g(1, "gads:video_stream_cache:limit_space", 8388608);

    /* renamed from: q0 */
    public static final e10<Boolean> f10586q0;

    /* renamed from: q1 */
    public static final e10<Long> f10587q1 = e10.m8263h(1, "gads:adapter_initialization:cld_timeout", 10);

    /* renamed from: q2 */
    public static final e10<String> f10588q2 = e10.m8265j(1, "gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");

    /* renamed from: q3 */
    public static final e10<Boolean> f10589q3;

    /* renamed from: q4 */
    public static final e10<Boolean> f10590q4;

    /* renamed from: q5 */
    public static final e10<Integer> f10591q5 = e10.m8262g(1, "gads:maximum_query_json_cache_size", 200);

    /* renamed from: q6 */
    public static final e10<Boolean> f10592q6;

    /* renamed from: q7 */
    public static final e10<Boolean> f10593q7;

    /* renamed from: r */
    public static final e10<Integer> f10594r = e10.m8262g(1, "gads:video_stream_exo_cache:buffer_size", 8388608);

    /* renamed from: r0 */
    public static final e10<String> f10595r0 = e10.m8265j(1, "gads:idless:cookie_modification", "=; Max-Age=-1; path=/; domain=.doubleclick.net");

    /* renamed from: r1 */
    public static final e10<Boolean> f10596r1;

    /* renamed from: r2 */
    public static final e10<Boolean> f10597r2;

    /* renamed from: r3 */
    public static final e10<Boolean> f10598r3;

    /* renamed from: r4 */
    public static final e10<Boolean> f10599r4;

    /* renamed from: r5 */
    public static final e10<Long> f10600r5 = e10.m8263h(1, "gads:timeout_query_json_cache:millis", 3600000);

    /* renamed from: r6 */
    public static final e10<Boolean> f10601r6;

    /* renamed from: r7 */
    public static final e10<Boolean> f10602r7;

    /* renamed from: s */
    public static final e10<Long> f10603s = e10.m8263h(1, "gads:video_stream_cache:limit_time_sec", 300);

    /* renamed from: s0 */
    public static final e10<Boolean> f10604s0;

    /* renamed from: s1 */
    public static final e10<Boolean> f10605s1;

    /* renamed from: s2 */
    public static final e10<Integer> f10606s2 = e10.m8262g(1, "gads:native_video_load_timeout", 10);

    /* renamed from: s3 */
    public static final e10<Boolean> f10607s3;

    /* renamed from: s4 */
    public static final e10<Long> f10608s4 = e10.m8263h(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000);

    /* renamed from: s5 */
    public static final e10<Boolean> f10609s5;

    /* renamed from: s6 */
    public static final e10<Integer> f10610s6 = e10.m8262g(1, "gads:remote_log_send_rate_ms", 60000);

    /* renamed from: t */
    public static final e10<Long> f10611t = e10.m8263h(1, "gads:video_stream_cache:notify_interval_millis", 125);

    /* renamed from: t0 */
    public static final e10<Boolean> f10612t0;

    /* renamed from: t1 */
    public static final e10<Boolean> f10613t1;

    /* renamed from: t2 */
    public static final e10<String> f10614t2 = e10.m8265j(1, "gads:ad_choices_content_description", "Ad Choices Icon");

    /* renamed from: t3 */
    public static final e10<Boolean> f10615t3;

    /* renamed from: t4 */
    public static final e10<Integer> f10616t4 = e10.m8262g(1, "gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);

    /* renamed from: t5 */
    public static final e10<Boolean> f10617t5;

    /* renamed from: t6 */
    public static final e10<Integer> f10618t6 = e10.m8262g(1, "gads:remote_log_queue_max_entries", 500);

    /* renamed from: u */
    public static final e10<Integer> f10619u = e10.m8262g(1, "gads:video_stream_cache:connect_timeout_millis", 10000);

    /* renamed from: u0 */
    public static final e10<Boolean> f10620u0;

    /* renamed from: u1 */
    public static final e10<Boolean> f10621u1;

    /* renamed from: u2 */
    public static final e10<Boolean> f10622u2;

    /* renamed from: u3 */
    public static final e10<Integer> f10623u3 = e10.m8262g(1, "gad:interstitial:close_button_padding_dip", 0);

    /* renamed from: u4 */
    public static final e10<Integer> f10624u4 = e10.m8262g(1, "gads:adoverlay:b68684796:targeting_sdk:upper_bound", 26);

    /* renamed from: u5 */
    public static final e10<Boolean> f10625u5;

    /* renamed from: u6 */
    public static final e10<String> f10626u6 = e10.m8265j(1, "gads:remote_capture_service_url", "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1");

    /* renamed from: v */
    public static final e10<String> f10627v = e10.m8265j(1, "gads:video:metric_frame_hash_times", "");

    /* renamed from: v0 */
    public static final e10<Boolean> f10628v0;

    /* renamed from: v1 */
    public static final e10<Boolean> f10629v1;

    /* renamed from: v2 */
    public static final e10<Boolean> f10630v2;

    /* renamed from: v3 */
    public static final e10<Boolean> f10631v3;

    /* renamed from: v4 */
    public static final e10<Integer> f10632v4 = e10.m8262g(1, "gads:adoverlay:b68684796:sdk_int:lower_bound", 27);

    /* renamed from: v5 */
    public static final e10<Long> f10633v5 = e10.m8263h(1, "gads:timeout_signal_collection_in_exp:millis", 1000);

    /* renamed from: v6 */
    public static final e10<Integer> f10634v6 = e10.m8262g(1, "gads:cui_monitoring_interval_ms", 300000);

    /* renamed from: w */
    public static final e10<Long> f10635w = e10.m8263h(1, "gads:video:metric_frame_hash_time_leniency", 500);

    /* renamed from: w0 */
    public static final e10<Boolean> f10636w0;

    /* renamed from: w1 */
    public static final e10<Boolean> f10637w1;

    /* renamed from: w2 */
    public static final e10<Boolean> f10638w2;

    /* renamed from: w3 */
    public static final e10<Boolean> f10639w3;

    /* renamed from: w4 */
    public static final e10<Integer> f10640w4 = e10.m8262g(1, "gads:adoverlay:b68684796:sdk_int:upper_bound", 26);

    /* renamed from: w5 */
    public static final e10<Boolean> f10641w5;

    /* renamed from: w6 */
    public static final e10<String> f10642w6 = e10.m8265j(1, "gads:plugin_regex", "^Flutter-GMA-.*|^unity-.*");

    /* renamed from: x */
    public static final e10<Boolean> f10643x;

    /* renamed from: x0 */
    public static final e10<Integer> f10644x0 = e10.m8262g(1, "gads:show_interstitial_with_context:min_version", 204890000);

    /* renamed from: x1 */
    public static final e10<Boolean> f10645x1;

    /* renamed from: x2 */
    public static final e10<Boolean> f10646x2;

    /* renamed from: x3 */
    public static final e10<Boolean> f10647x3;

    /* renamed from: x4 */
    public static final e10<Boolean> f10648x4;

    /* renamed from: x5 */
    public static final e10<Boolean> f10649x5;

    /* renamed from: x6 */
    public static final e10<Integer> f10650x6 = e10.m8262g(1, "gads:app_event_queue_size", 20);

    /* renamed from: y */
    public static final e10<Long> f10651y = e10.m8263h(1, "gads:video:surface_update_min_spacing_ms", 1000);

    /* renamed from: y0 */
    public static final e10<Boolean> f10652y0;

    /* renamed from: y1 */
    public static final e10<Boolean> f10653y1;

    /* renamed from: y2 */
    public static final e10<Boolean> f10654y2;

    /* renamed from: y3 */
    public static final e10<String> f10655y3 = e10.m8265j(1, "gad:publisher_testing:force_local_request:enabled_list", "");

    /* renamed from: y4 */
    public static final e10<Boolean> f10656y4;

    /* renamed from: y5 */
    public static final e10<Boolean> f10657y5;

    /* renamed from: y6 */
    public static final e10<Boolean> f10658y6;

    /* renamed from: z */
    public static final e10<Boolean> f10659z;

    /* renamed from: z0 */
    public static final e10<Boolean> f10660z0;

    /* renamed from: z1 */
    public static final e10<Boolean> f10661z1;

    /* renamed from: z2 */
    public static final e10<Boolean> f10662z2;

    /* renamed from: z3 */
    public static final e10<String> f10663z3 = e10.m8265j(1, "gad:publisher_testing:force_local_request:disabled_list", "");

    /* renamed from: z4 */
    public static final e10<Boolean> f10664z4;

    /* renamed from: z5 */
    public static final e10<Boolean> f10665z5;

    /* renamed from: z6 */
    public static final e10<Boolean> f10666z6;

    static {
        Boolean bool = Boolean.TRUE;
        f10549m = e10.m8264i(1, "gads:video_exo_player:fmp4_extractor_enabled", bool);
        Boolean bool2 = Boolean.FALSE;
        f10558n = e10.m8264i(1, "gads:video_exo_player:use_play_back_info_for_should_start_play_back", bool2);
        f10567o = e10.m8264i(1, "gads:video_exo_player:treat_load_exception_as_non_fatal", bool);
        f10643x = e10.m8264i(1, "gads:video:force_watermark", bool2);
        f10659z = e10.m8264i(1, "gads:video:spinner:enabled", bool2);
        f10233A = e10.m8264i(1, "gads:video:shutter:enabled", bool2);
        f10257D = e10.m8264i(1, "gads:video:aggressive_media_codec_release", bool2);
        f10265E = e10.m8264i(1, "gads:memory_bundle:debug_info", bool2);
        f10321L = e10.m8264i(1, "gads:mraid:expanded_interstitial_fix", bool2);
        f10329M = e10.m8264i(1, "gads:mraid:initial_size_fallback", bool2);
        f10377S = e10.m8264i(1, "gads:content_fetch_disable_get_title_from_webview", bool2);
        f10385T = e10.m8264i(1, "gads:content_fetch_enable_new_content_score", bool2);
        f10393U = e10.m8264i(1, "gads:content_fetch_enable_serve_once", bool2);
        f10401V = e10.m8264i(1, "gads:sai:enabled", bool);
        f10425Y = e10.m8264i(1, "gads:sai:using_macro:enabled", bool2);
        f10460c0 = e10.m8264i(1, "gads:sai:app_measurement_enabled3", bool2);
        f10478e0 = e10.m8264i(1, "gads:sai:force_through_reflection", bool);
        f10487f0 = e10.m8264i(1, "gads:sai:gmscore_availability_check_disabled", bool2);
        f10496g0 = e10.m8264i(1, "gads:sai:logging_disabled_for_drx", bool2);
        f10505h0 = e10.m8264i(1, "gads:sai:app_measurement_npa_enabled", bool2);
        f10514i0 = e10.m8264i(1, "gads:idless:idless_disables_attestation", bool);
        f10523j0 = e10.m8264i(1, "gads:idless:app_measurement_idless_enabled", bool);
        f10532k0 = e10.m8264i(1, "gads:sai:server_side_npa:disable_writing", bool2);
        f10541l0 = e10.m8264i(1, "gads:sai:server_side_npa:enabled", bool2);
        f10568o0 = e10.m8264i(1, "gads:idless:internal_state_enabled", bool);
        f10577p0 = e10.m8264i(1, "gads:idless:idless_disables_offline_ads_signalling", bool);
        f10586q0 = e10.m8264i(1, "gads:custom_idless:enabled", bool2);
        f10604s0 = e10.m8264i(1, "gads:tfcd_deny_ad_storage:enabled", bool2);
        f10612t0 = e10.m8264i(1, "gads:tfua_deny_ad_storage:enabled", bool2);
        f10620u0 = e10.m8264i(1, "gads:interstitial:app_must_be_foreground:enabled", bool2);
        f10628v0 = e10.m8264i(1, "gads:interstitial:foreground_report:enabled", bool2);
        f10636w0 = e10.m8264i(1, "gads:interstitial:default_immersive", bool2);
        f10652y0 = e10.m8264i(1, "gads:webview:error_web_response:enabled", bool2);
        f10660z0 = e10.m8264i(1, "gads:webview:set_fixed_text_zoom", bool);
        f10234A0 = e10.m8264i(1, "gads:webviewgone:kill_process:enabled", bool2);
        f10242B0 = e10.m8264i(1, "gads:webviewgone:new_onshow:enabled", bool2);
        f10258D0 = e10.m8264i(1, "gads:new_rewarded_ad:enabled", bool);
        f10266E0 = e10.m8264i(1, "gads:rewarded:adapter_initialization_enabled", bool2);
        f10274F0 = e10.m8264i(1, "gads:rewarded:ad_metadata_enabled", bool2);
        f10298I0 = e10.m8264i(1, "gads:adid_values_in_adrequest:enabled", bool2);
        f10314K0 = e10.m8264i(1, "gads:disable_adid_values_in_ms", bool2);
        f10330M0 = e10.m8264i(1, "gads:custom_close_blocking:enabled", bool2);
        f10338N0 = e10.m8264i(1, "gads:disabling_closable_area:enabled", bool2);
        f10346O0 = e10.m8264i(1, "gads:force_top_right_close_button:enabled", bool2);
        f10370R0 = e10.m8264i(1, "gads:disable_click_during_fade_in", bool2);
        f10378S0 = e10.m8264i(1, "gads:use_system_ui_for_fullscreen:enabled", bool2);
        f10386T0 = e10.m8264i(1, "gads:ad_overlay:collect_cutout_info:enabled", bool2);
        f10410W0 = e10.m8264i(1, "gads:include_local_global_rectangles", bool2);
        f10434Z0 = e10.m8264i(1, "gads:position_watcher:enable_scroll_aware_ads", bool2);
        f10443a1 = e10.m8264i(1, "gads:position_watcher:send_scroll_data", bool2);
        f10452b1 = e10.m8264i(1, "gads:gen204_signals:enabled", bool2);
        f10488f1 = e10.m8264i(1, "gads:presentation_error:urls_enabled", bool);
        f10497g1 = e10.m8264i(1, "gads:rtb_interstitial:use_fullscreen_monitor", bool);
        f10506h1 = e10.m8264i(1, "gads:native_required_assets:enabled", bool2);
        f10515i1 = e10.m8264i(1, "gads:native_required_assets:check_inner_mediaview:enabled", bool);
        f10533k1 = e10.m8264i(1, "gads:track_view_next_runloop:enabled", bool2);
        f10542l1 = e10.m8264i(1, "gads:synchronize_measurement_listener:enabled", bool2);
        f10551m1 = e10.m8264i(1, "gads:native_required_assets:viewability:enabled", bool2);
        f10560n1 = e10.m8264i(1, "gads:signal_adapters:enabled", bool2);
        f10596r1 = e10.m8264i(1, "gads:additional_video_csi:enabled", bool2);
        f10605s1 = e10.m8264i(1, "gads:using_official_simple_exoplayer:enabled", bool2);
        f10613t1 = e10.m8264i(1, "gads:multiple_video_playback:enabled", bool2);
        f10621u1 = e10.m8264i(1, "gads:run_exoplayer_video_stream_task_in_ui_thread:enabled", bool2);
        f10629v1 = e10.m8264i(1, "gads:csi:enabled_per_sampling", bool2);
        f10637w1 = e10.m8264i(1, "gads:always_set_transfer_listener:enabled", bool2);
        f10645x1 = e10.m8264i(1, "gads:initialization_csi:enabled", bool2);
        f10653y1 = e10.m8264i(1, "gads:msa:experiments:enabled", bool2);
        f10661z1 = e10.m8264i(1, "gads:msa:experiments:ps:enabled", bool);
        f10235A1 = e10.m8264i(1, "gads:msa:experiments:fb:enabled", bool);
        f10243B1 = e10.m8264i(1, "gads:msa:experiments:ps:er", bool);
        f10259D1 = e10.m8264i(1, "gads:msa:experiments:a2", bool2);
        f10267E1 = e10.m8264i(1, "gads:msa:experiments:log", bool2);
        f10275F1 = e10.m8264i(1, "gads:msa:experiments:vfb", bool);
        f10283G1 = e10.m8264i(1, "gads:msa:experiments:incapi:enabled", bool2);
        f10291H1 = e10.m8264i(1, "gads:msa:experiments:incapigass:enabled", bool2);
        f10315K1 = e10.m8264i(1, "gads:gestures:clearTd:enabled", bool2);
        f10331M1 = e10.m8264i(1, "gads:gestures:errorlogging:enabled", bool2);
        f10347O1 = e10.m8264i(1, "gads:gestures:asig:enabled", bool2);
        f10355P1 = e10.m8264i(1, "gads:gestures:ans:enabled", bool2);
        f10363Q1 = e10.m8264i(1, "gads:gestures:tos:enabled", bool2);
        f10371R1 = e10.m8264i(1, "gads:gestures:brt:enabled", bool);
        f10379S1 = e10.m8264i(1, "gads:gestures:fpi:enabled", bool2);
        f10387T1 = e10.m8264i(1, "gads:signal:app_permissions:disabled", bool2);
        f10395U1 = e10.m8264i(1, "gads:signal:app_set_id_info_in_ad_request:enabled", bool2);
        f10403V1 = e10.m8264i(1, "gads:gestures:hpk:enabled", bool);
        f10419X1 = e10.m8264i(1, "gads:gestures:bs:enabled", bool);
        f10427Y1 = e10.m8264i(1, "gads:gestures:check_initialization_thread:enabled", bool2);
        f10435Z1 = e10.m8264i(1, "gads:gestures:init_new_thread:enabled", bool);
        f10444a2 = e10.m8264i(1, "gads:gestures:pds:enabled", bool);
        f10462c2 = e10.m8264i(1, "gads:gestures:ns:enabled", bool);
        f10471d2 = e10.m8264i(1, "gads:gestures:vdd:enabled", bool2);
        f10480e2 = e10.m8264i(1, "gads:gadsignalsdelegate_ui_thread_fix:enabled", bool2);
        f10489f2 = e10.m8264i(1, "gads:native:asset_view_touch_events", bool2);
        f10498g2 = e10.m8264i(1, "gads:native:set_touch_listener_on_asset_views", bool);
        f10507h2 = e10.m8264i(1, "gads:ais:enabled", bool);
        f10516i2 = e10.m8264i(1, "gads:stav:enabled", bool2);
        f10525j2 = e10.m8264i(1, "gads:spam:impression_ui_idle:enable", bool2);
        f10570o2 = e10.m8264i(1, "gads:js_flags:disable_phenotype", bool2);
        f10597r2 = e10.m8264i(1, "gads:native:get_native_ad_view_signals", bool2);
        f10622u2 = e10.m8264i(1, "gads:enable_singleton_broadcast_receiver", bool2);
        f10630v2 = e10.m8264i(1, "gads:native:media_view_match_parent:enabled", bool);
        f10638w2 = e10.m8264i(1, "gads:video:restrict_inside_web_view:enabled", bool2);
        f10646x2 = e10.m8264i(1, "gads:native:count_impression_for_assets", bool2);
        f10654y2 = e10.m8264i(1, "gads:native:enable_enigma_watermarking", bool2);
        f10662z2 = e10.m8264i(1, "gads:fluid_ad:use_wrap_content_height", bool2);
        f10236A2 = e10.m8264i(1, "gads:rtb_v1_1:fetch_app_settings_using_cld:enabled", bool);
        f10244B2 = e10.m8264i(1, "gads:get_request_signals_cld:enabled", bool);
        f10252C2 = e10.m8264i(1, "gads:get_request_signals_common_cld:enabled", bool);
        f10260D2 = e10.m8264i(1, "gads:rtb_v1_1:use_manifest_appid_cld:enabled", bool);
        String str = "(?!)";
        f10300I2 = e10.m8264i(1, "gads:cache:downloader_use_high_priority", bool2);
        f10316K2 = e10.m8264i(1, "gads:cache:bind_on_foreground", bool2);
        f10324L2 = e10.m8264i(1, "gads:cache:bind_on_init", bool2);
        f10332M2 = e10.m8264i(1, "gads:cache:bind_on_request", bool2);
        f10348O2 = e10.m8264i(1, "gads:cache:use_cache_data_source", bool2);
        f10356P2 = e10.m8264i(1, "gads:cache:connection_per_read", bool2);
        f10380S2 = e10.m8264i(1, "gads:cache:read_inner_data_source_if_gcache_miss", bool2);
        f10388T2 = e10.m8264i(1, "gads:cache:read_inner_data_source_if_gcache_not_downloaded", bool2);
        f10396U2 = e10.m8264i(1, "gads:cache:function_call_timeout_v1:enabled", bool2);
        f10412W2 = e10.m8264i(1, "gads:cache:add_itag_to_cache_key:enabled", bool2);
        f10420X2 = e10.m8264i(1, "gads:http_assets_cache:enabled", bool2);
        f10445a3 = e10.m8264i(1, "gads:chrome_custom_tabs_browser:enabled", bool2);
        f10454b3 = e10.m8264i(1, "gads:chrome_custom_tabs:disabled", bool2);
        f10463c3 = e10.m8264i(1, "gads:chrome_custom_tabs_browser_v2:enabled", bool2);
        f10472d3 = e10.m8264i(1, "gads:cct_v2_connection:enabled", bool2);
        f10481e3 = e10.m8264i(1, "gads:cct_v2_direct_launch:enabled", bool2);
        f10490f3 = e10.m8264i(1, "gads:chrome_custom_tabs_for_native_ads:enabled", bool2);
        f10499g3 = e10.m8264i(1, "gad:cct_v2_beta:enabled", bool2);
        f10517i3 = e10.m8264i(2, "CHROME_CUSTOM_TAB_OPT_OUT", bool2);
        f10589q3 = e10.m8264i(1, "gad:interstitial_notify_publisher_without_delay", bool2);
        f10598r3 = e10.m8264i(1, "gad:interstitial_for_multi_window", bool2);
        f10607s3 = e10.m8264i(1, "gad:interstitial_ad_stay_active_in_multi_window", bool2);
        f10615t3 = e10.m8264i(1, "gad:interstitial_multi_window_method", bool2);
        f10631v3 = e10.m8264i(1, "gads:clearcut_logging:enabled", bool2);
        f10639w3 = e10.m8264i(1, "gads:clearcut_logging:write_to_file", bool2);
        f10647x3 = e10.m8264i(1, "gad:publisher_testing:force_local_request:enabled", bool);
        f10245B3 = e10.m8264i(1, "gads:omid:enabled", bool);
        f10261D3 = e10.m8264i(1, "gads:omid_use_admob_impl_dependency:enabled", bool2);
        f10269E3 = e10.m8264i(1, "gads:omid_use_base_64_encoding_for_native_html:enabled", bool2);
        f10277F3 = e10.m8264i(1, "gads:nonagon:banner:enabled", bool);
        f10285G3 = e10.m8265j(1, "gads:nonagon:banner:ad_unit_exclusions", str);
        f10293H3 = e10.m8264i(1, "gads:nonagon:app_open:enabled", bool);
        f10317K3 = e10.m8264i(1, "gads:nonagon:app_open_app_switch_signal:enabled", bool2);
        f10325L3 = e10.m8265j(1, "gads:nonagon:app_open:ad_unit_exclusions", str);
        f10333M3 = e10.m8264i(1, "gads:nonagon:interstitial:enabled", bool);
        f10341N3 = e10.m8265j(1, "gads:nonagon:interstitial:ad_unit_exclusions", str);
        f10349O3 = e10.m8264i(1, "gads:nonagon:rewardedvideo:enabled", bool);
        f10357P3 = e10.m8264i(1, "gads:nonagon:mobile_ads_setting_manager:enabled", bool);
        f10365Q3 = e10.m8265j(1, "gads:nonagon:rewardedvideo:ad_unit_exclusions", str);
        f10373R3 = e10.m8264i(1, "gads:nonagon:banner:check_dp_size", bool);
        f10381S3 = e10.m8264i(1, "gads:nonagon:rewarded:load_multiple_ads", bool);
        f10389T3 = e10.m8264i(1, "gads:nonagon:return_no_fill_error_code", bool2);
        f10397U3 = e10.m8264i(1, "gads:nonagon:continue_on_no_fill", bool2);
        f10405V3 = e10.m8264i(1, "gads:nonagon:separate_timeout:enabled", bool);
        f10421X3 = e10.m8264i(1, "gads:nonagon:banner_recursive_renderer", bool2);
        f10429Y3 = e10.m8264i(1, "gads:nonagon:app_stats_lock:enabled", bool2);
        f10437Z3 = e10.m8264i(1, "gads:nonagon:app_stats_main_thread:enabled", bool2);
        f10446a4 = e10.m8264i(1, "gads:uri_query_to_map_bg_thread:enabled", bool2);
        f10473d4 = e10.m8264i(1, "gads:nonagon:active_view_gmsg_background_thread:enabled", bool);
        f10482e4 = e10.m8264i(1, "gads:active_view_gmsg_separate_pool:enabled", bool);
        f10491f4 = e10.m8264i(1, "gads:active_view_audio_signal_audio_mode:enabled", bool2);
        f10500g4 = e10.m8264i(1, "gads:signals:ad_id_info:enabled", bool2);
        f10509h4 = e10.m8264i(1, "gads:signals:app_index:enabled", bool2);
        f10518i4 = e10.m8264i(1, "gads:signals:attestation_token:enabled", bool2);
        f10527j4 = e10.m8264i(1, "gads:signals:cache:enabled", bool2);
        f10536k4 = e10.m8264i(1, "gads:signals:doritos:enabled", bool2);
        f10545l4 = e10.m8264i(1, "gads:signals:doritos:v1:enabled", bool2);
        f10554m4 = e10.m8264i(1, "gads:signals:doritos:v2:immediate:enabled", bool2);
        f10563n4 = e10.m8264i(1, "gads:signals:parental_control:enabled", bool2);
        f10572o4 = e10.m8264i(1, "gads:signals:video_decoder:enabled", bool2);
        f10581p4 = e10.m8264i(1, "gads:signals:banner_hardware_acceleration:enabled", bool2);
        f10590q4 = e10.m8264i(1, "gads:signals:native_hardware_acceleration:enabled", bool2);
        f10599r4 = e10.m8264i(1, "gads:attestation_token:enabled", bool2);
        f10648x4 = e10.m8264i(1, "gads:consent:shared_preference_reading:enabled", bool);
        f10656y4 = e10.m8264i(1, "gads:consent:iab_consent_info:enabled", bool);
        f10664z4 = e10.m8264i(1, "gads:fc_consent:shared_preference_reading:enabled", bool);
        f10246B4 = e10.m8264i(1, "gads:nativeads:image:sample:enabled", bool);
        f10262D4 = e10.m8264i(1, "gads:nativeads:pub_image_scale_type:enabled", bool);
        f10270E4 = e10.m8264i(1, "gads:offline_signaling:enabled", bool2);
        f10286G4 = e10.m8264i(1, "gads:nativeads:template_signal:enabled", bool);
        f10294H4 = e10.m8264i(1, "gads:nativeads:media_content_aspect_ratio:enabled", bool);
        f10302I4 = e10.m8264i(1, "gads:nativeads:media_content_metadata:enabled", bool);
        f10310J4 = e10.m8264i(1, "gads:buffer_click_url_as_ready_to_ping:enabled", bool2);
        f10318K4 = e10.m8264i(1, "gads:predictive_prefetch_from_cld:enabled", bool2);
        f10326L4 = e10.m8264i(1, "gads:cache_layer_from_cld:enabled", bool2);
        f10334M4 = e10.m8264i(1, "gads:cache_layer_wait_for_app_settings:enabled", bool2);
        f10342N4 = e10.m8264i(1, "gads:precache_pool:verbose_logging", bool2);
        f10501g5 = e10.m8264i(1, "gads:memory_leak:b129558083", bool2);
        f10510h5 = e10.m8264i(1, "gads:unhandled_event_reporting:enabled", bool2);
        f10519i5 = e10.m8264i(1, "gads:response_info:enabled", bool);
        f10528j5 = e10.m8264i(1, "gads:csi:interstitial_failed_to_show:enabled", bool2);
        f10537k5 = e10.m8264i(1, "gads:csi:mediation_failure:enabled", bool2);
        f10555m5 = e10.m8264i(1, "gads:csi:eids_from_cld:enabled", bool2);
        f10564n5 = e10.m8264i(1, "gads:request_id_check:enabled", bool2);
        f10573o5 = e10.m8264i(1, "gads:request_id_int32:enabled", bool);
        f10582p5 = e10.m8264i(1, "gads:render_decouple:enabled", bool);
        f10609s5 = e10.m8264i(1, "gads:scar_csi:enabled", bool2);
        f10617t5 = e10.m8264i(1, "gads:scar_signal_comparison_experiment:enabled", bool2);
        f10625u5 = e10.m8264i(1, "gads:scar_signal_comparison_format:unknown", bool2);
        f10641w5 = e10.m8264i(1, "gads:scar_trustless_token_for_gbid:enabled", bool2);
        f10649x5 = e10.m8264i(1, "gads:scar_v2:send_click_ping:enabled", bool2);
        f10657y5 = e10.m8264i(1, "gads:scar_v2:send_impression_pings:enabled", bool2);
        f10665z5 = e10.m8264i(1, "gads:scar_v2:user_agent:enabled", bool2);
        f10247B5 = e10.m8264i(1, "gads:scar_v2:prior_click_count:enabled", bool2);
        f10271E5 = e10.m8264i(1, "gads:signal_collection_without_rendering:enabled", bool);
        f10287G5 = e10.m8264i(2, "DISABLE_CRASH_REPORTING", bool2);
        f10295H5 = e10.m8264i(1, "gads:paid_event_listener:enabled", bool);
        f10303I5 = e10.m8264i(1, "gads:interscroller_ad:enabled", bool);
        f10311J5 = e10.m8264i(1, "gads:interscroller_ad:refresh:enabled", bool2);
        f10335M5 = e10.m8264i(1, "gads:is_in_scroll_view_new_api:enabled", bool);
        f10343N5 = e10.m8264i(1, "gads:policy_validator_for_all_pubs:enabled", bool);
        f10367Q5 = e10.m8264i(2, "NATIVE_AD_DEBUGGER_ENABLED", bool);
        f10391T5 = e10.m8264i(1, "gads:use_wide_viewport:enabled", bool2);
        f10399U5 = e10.m8264i(1, "gads:load_with_overview_mode:enabled", bool2);
        f10407V5 = e10.m8264i(1, "gads:wire_banner_listener_after_request:enabled", bool2);
        f10415W5 = e10.m8264i(1, "gads:wire_app_open_listener_after_request:enabled", bool2);
        f10423X5 = e10.m8264i(1, "gads:wire_interstitial_listener_after_request:enabled", bool2);
        f10439Z5 = e10.m8264i(1, "gads:can_open_app_and_open_app_action:enabled", bool2);
        f10448a6 = e10.m8264i(1, "gads:open_gmsg:set_uri_data_and_type:enabled", bool2);
        f10466c6 = e10.m8264i(1, "gads:forward_bow_error_string:enabled", bool);
        f10475d6 = e10.m8264i(1, "gads:continue_on_process_response:enabled", bool2);
        f10484e6 = e10.m8264i(1, "gads:mediation_status_reporting:enabled", bool);
        f10502g6 = e10.m8264i(1, "gads:line_item_no_fill_conversion:enabled", bool2);
        f10520i6 = e10.m8264i(1, "gads:offline_ads_notification:enabled", bool);
        f10529j6 = e10.m8264i(1, "gads:use_new_network_api:enabled", bool);
        f10538k6 = e10.m8264i(1, "gads:handle_click_recorded_event:enabled", bool2);
        f10547l6 = e10.m8264i(1, "gads:default_network_type_fine_to_unknown:enabled", bool);
        f10556m6 = e10.m8264i(1, "gads:handle_intent_async:enabled", bool);
        f10565n6 = e10.m8264i(1, "gads:skip_deep_link_validation_native_ads:enabled", bool);
        f10574o6 = e10.m8264i(1, "gads:try_deep_link_fallback_native_ads:enabled", bool);
        f10583p6 = e10.m8264i(1, "gads:in_app_link_handling_for_android_11_enabled:enabled", bool);
        f10592q6 = e10.m8264i(1, "gads:new_remote_logging_utils:enabled", bool2);
        f10601r6 = e10.m8264i(1, "gads:remote_logging:enabled", bool2);
        f10658y6 = e10.m8264i(1, "gads:hide_grey_title_bar:enabled", bool2);
        f10666z6 = e10.m8264i(1, "gads:interstitial_ad_parameter_handler:enabled", bool);
        f10240A6 = e10.m8264i(1, "gads:inspector:enabled", bool);
        f10272E6 = e10.m8264i(1, "gads:inspector:shake_enabled", bool);
        f10312J6 = e10.m8264i(1, "gads:inspector:flick_enabled", bool);
        f10360P6 = e10.m8264i(1, "gads:inspector:ad_manager_enabled", bool);
        f10368Q6 = e10.m8264i(1, "gads:inspector:policy_violations_enabled", bool2);
        f10376R6 = e10.m8264i(1, "gads:inspector:bidding_data_enabled", bool);
        f10384S6 = e10.m8264i(1, "gads:paw_register_webview:enabled", bool);
        f10392T6 = e10.m8264i(1, "gads:paw_webview_early_initialization:enabled", bool2);
        f10400U6 = e10.m8264i(1, "gads:h5ads:enabled", bool);
        f10432Y6 = e10.m8264i(1, "gads:native_html_video_asset:enabled", bool);
        f10440Z6 = e10.m8264i(1, "gads:native_html_image_asset:enabled", bool);
        f10449a7 = e10.m8264i(1, "gads:leibniz:events:enabled", bool2);
        f10458b7 = e10.m8264i(1, "gads:msa:alphavis_enabled", bool2);
        f10467c7 = e10.m8264i(1, "gads:msa:adutilalphavis_enabled", bool2);
        f10476d7 = e10.m8264i(1, "gads:msa:nativealphavis_enabled", bool2);
        f10494f7 = e10.m8264i(1, "gads:msa:vswfl", bool2);
        f10503g7 = e10.m8264i(1, "gads:msa:poslogger", bool2);
        f10512h7 = e10.m8264i(1, "gads:new_dynamite_module_method:enabled", bool2);
        f10521i7 = e10.m8264i(1, "gads:new_show_failure_coverage:enabled", bool2);
        f10539k7 = e10.m8264i(1, "gads:read_pub_callback_param_open_gmsg:enabled", bool);
        f10548l7 = e10.m8264i(1, "gads:read_pub_callback_param_click_gmsg:enabled", bool);
        f10557m7 = e10.m8264i(1, "gads:forward_physical_click_to_ad_listener:enabled", bool);
        f10566n7 = e10.m8264i(1, "gads:webview_destroy_workaround:enabled", bool);
        f10575o7 = e10.m8264i(1, "gads:appstate_getresource_fix:enabled", bool2);
        f10584p7 = e10.m8264i(1, "gads:convert_ad_unit_lower_case_rtb:enabled", bool2);
        f10593q7 = e10.m8264i(1, "gads:drx_ad_unit_regex_case_insensitive:enabled", bool2);
        f10602r7 = e10.m8264i(1, "gads:csi_ping_for_invalid_dynamite_flags_access:enabled", bool2);
    }

    /* renamed from: a */
    public static List<String> m13005a() {
        return C2199sw.m16999a().mo7210a();
    }

    /* renamed from: b */
    public static List<String> m13006b() {
        return C2199sw.m16999a().mo7211b();
    }

    /* renamed from: c */
    public static void m13007c(Context context) {
        o10.m14207a(new l10(context));
    }

    /* renamed from: d */
    public static void m13008d(Context context, int i, JSONObject jSONObject) {
        C2199sw.m17000b();
        SharedPreferences.Editor edit = g10.m9497a(context).edit();
        C2199sw.m16999a();
        p20<Boolean> p20 = t20.f14681a;
        C2199sw.m16999a().mo7214e(edit, 1, jSONObject);
        C2199sw.m17000b();
        edit.commit();
    }
}

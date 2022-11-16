/* Class23_Sub4_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class23_Sub4_Sub32 extends Class23_Sub4
{
	private static RSString aClass16_3406 = Class38_Sub6.method1076((byte) 86, "Loading interfaces )2 ");
	private int anInt3407 = 4096;
	static int anInt3408;
	static int anInt3409;
	static int anInt3410;
	private int anInt3411 = 0;
	static int anInt3412;
	static boolean aBoolean3413;
	static RSString aClass16_3414;
	static int anInt3415;
	static RSString aClass16_3416;
	static short[] aShortArray3417;
	static RSString aClass16_3418 = Class38_Sub6.method1076((byte) 86, "<col=ff9040>");
	static RSString aClass16_3419;
	static int[] anIntArray3420 = new int[256];
	static int anInt3421;
	private static RSString aClass16_3422 = Class38_Sub6.method1076((byte) 86, "flash1:");
	static int anInt3423;
	static RSString aClass16_3424;
	
	static final void method401(Class105 class105, Class105 class105_0_, Component component, int i) {
		anInt3410++;
		if (!Class38_Sub2.aBoolean2490) {
			Class20.method219();
			byte[] bs = class105.method1544(0, 0, Class23_Sub4_Sub10.anInt3060);
			Class23_Sub20.aClass23_Sub13_Sub10_Sub1_2402 = new Class23_Sub13_Sub10_Sub1(bs, component);
			Class23_Sub7.aClass23_Sub13_Sub10_Sub1_2216 = Class23_Sub20.aClass23_Sub13_Sub10_Sub1_2402.method707();
			Class69.aClass43_1220 = Class23_Sub25.method907(class105_0_, Class23_Sub14.anInt2338, true);
			Class13.aClass43_255 = Class23_Sub25.method907(class105_0_, Class23_Sub13_Sub1.anInt3672, true);
			Class42.aClass43_650 = Class23_Sub25.method907(class105_0_, Class23_Sub11.anInt2282, true);
			Class72.aClass43_Sub1Array1303 = Class23_Sub4_Sub24.method370(class105_0_, false, Class23_Sub10_Sub2.anInt3617);
			Class67.aClass43Array1171 = RuntimeException_Sub1.method1585(class105_0_, (byte) -102, Class23_Sub20.anInt2398);
			Class23_Sub5_Sub1.anIntArray3543 = new int[256];
			for (int i_1_ = 0; i_1_ < 64; i_1_++)
				Class23_Sub5_Sub1.anIntArray3543[i_1_] = i_1_ * 262144;
			for (int i_2_ = 0; i_2_ < 64; i_2_++)
				Class23_Sub5_Sub1.anIntArray3543[64 + i_2_] = 1024 * i_2_ + 16711680;
			for (int i_3_ = 0; i_3_ < 64; i_3_++)
				Class23_Sub5_Sub1.anIntArray3543[i_3_ - -128] = 16776960 + 4 * i_3_;
			for (int i_4_ = 0; i_4_ < 64; i_4_++)
				Class23_Sub5_Sub1.anIntArray3543[192 + i_4_] = 16777215;
			Class39.anIntArray618 = new int[256];
			for (int i_5_ = 0; i_5_ < 64; i_5_++)
				Class39.anIntArray618[i_5_] = i_5_ * 1024;
			for (int i_6_ = 0; i_6_ < 64; i_6_++)
				Class39.anIntArray618[64 + i_6_] = 65280 - -(4 * i_6_);
			for (int i_7_ = 0; i_7_ < 64; i_7_++)
				Class39.anIntArray618[128 + i_7_] = 65535 - -(262144 * i_7_);
			if (i > -122) {
				aClass16_3416 = null;
			}
			for (int i_8_ = 0; i_8_ < 64; i_8_++)
				Class39.anIntArray618[i_8_ - -192] = 16777215;
			Class35.anIntArray557 = new int[256];
			for (int i_9_ = 0; i_9_ < 64; i_9_++)
				Class35.anIntArray557[i_9_] = 4 * i_9_;
			for (int i_10_ = 0; i_10_ < 64; i_10_++)
				Class35.anIntArray557[64 + i_10_] = 255 - -(i_10_ * 262144);
			for (int i_11_ = 0; i_11_ < 64; i_11_++)
				Class35.anIntArray557[128 + i_11_] = 1024 * i_11_ + 16711935;
			for (int i_12_ = 0; i_12_ < 64; i_12_++)
				Class35.anIntArray557[192 + i_12_] = 16777215;
			Class87_Sub4.anIntArray2828 = new int[32768];
			Class6.anIntArray144 = new int[256];
			Class28.anIntArray425 = new int[32768];
			Class23_Sub4_Sub39.method424(null, (byte) 80);
			Class23_Sub4_Sub19.anIntArray3224 = new int[32768];
			Class23_Sub4_Sub37.anInt3489 = 0;
			Class71_Sub2.aBoolean2736 = false;
			Class23_Sub2.aClass16_2064 = Class23_Sub2.aClass16_2062;
			Class71_Sub2_Sub1.anIntArray4473 = new int[32768];
			Class23_Sub2.aClass16_2065 = Class23_Sub2.aClass16_2062;
			if (Class21.anInt342 == 0) {
				Class23_Sub13_Sub16.aBoolean4043 = true;
			} else {
				Class23_Sub13_Sub16.aBoolean4043 = false;
			}
			if (!Class23_Sub13_Sub16.aBoolean4043) {
				Class23_Sub4_Sub19.method341(Class23_Sub4_Sub3.anInt2940, 13910, 0, false, 2, Class29.aClass105_Sub1_457, 255);
			} else {
				Class23_Sub4_Sub16.method333(-257, 2);
			}
			Class23_Sub2.method238(0, false);
			Class38_Sub2.aBoolean2490 = true;
			Class104.method1529(-107);
			Class49.aClass23_Sub13_Sub10_Sub1_754 = new Class23_Sub13_Sub10_Sub1(128, 254);
			Class23_Sub13_Sub10.aClass23_Sub13_Sub10_Sub1_3880 = new Class23_Sub13_Sub10_Sub1(128, 254);
		}
	}
	
	public Class23_Sub4_Sub32() {
		super(1, true);
	}
	
	final void method255(Buffer class23_sub5, int i, int i_13_) {
		int i_14_ = i;
		do {
			if ((i_14_ ^ 0xffffffff) != -1) {
				if (i_14_ != 1) {
					break;
				}
			} else {
				anInt3411 = class23_sub5.method476((byte) -112);
				break;
			}
			anInt3407 = class23_sub5.method476((byte) -103);
		} while (false);
		if (i_13_ == 1000) {
			anInt3409++;
		}
	}
	
	static final void method402(Component component, byte b) {
		component.removeKeyListener(Class39.aClass32_609);
		anInt3415++;
		if (b != 34) {
			aClass16_3418 = null;
		}
		component.removeFocusListener(Class39.aClass32_609);
		Class23_Sub4_Sub6.anInt2986 = -1;
	}
	
	public static void method403(int i) {
		if (i <= -93) {
			aClass16_3416 = null;
			aClass16_3414 = null;
			aClass16_3418 = null;
			aClass16_3419 = null;
			aShortArray3417 = null;
			anIntArray3420 = null;
			aClass16_3422 = null;
			aClass16_3406 = null;
			aClass16_3424 = null;
		}
	}
	
	final int[] method260(int i, int i_15_) {
		anInt3421++;
		if (i != 0) {
			method255(null, -44, 96);
		}
		int[] is = aClass99_2115.method1500(i_15_, (byte) -103);
		if (aClass99_2115.aBoolean1681) {
			int[] is_16_ = this.method261(i_15_, 0, (byte) 18);
			for (int i_17_ = 0; i_17_ < Class23_Sub4_Sub33.anInt3428; i_17_++) {
				int i_18_ = is_16_[i_17_];
				is[i_17_] = (anInt3411 ^ 0xffffffff) < (i_18_ ^ 0xffffffff) || (anInt3407 ^ 0xffffffff) > (i_18_ ^ 0xffffffff) ? 0 : 4096;
			}
		}
		return is;
	}
	
	static final void method404(RSString class16, boolean bool) {
		anInt3412++;
		if (Class68.aClass23_Sub19Array1186 != null) {
			long l = class16.method184(58);
			int i = 0;
			if ((l ^ 0xffffffffffffffffL) != -1L) {
				for (/**/; i < Class68.aClass23_Sub19Array1186.length; i++) {
					if (Class68.aClass23_Sub19Array1186[i].aLong358 == l) {
						break;
					}
				}
				if ((Class68.aClass23_Sub19Array1186.length ^ 0xffffffff) < (i ^ 0xffffffff) && Class68.aClass23_Sub19Array1186[i] != null) {
					Class23_Sub7.outBuffer.method486(87, 2976);
					Class53.anInt835++;
					if (bool == false) {
						Class23_Sub7.outBuffer.method436(Class68.aClass23_Sub19Array1186[i].aLong358, (byte) -115);
					}
				}
			}
		}
	}
	
	static final int method405(int i, int i_19_, int i_20_, int i_21_) {
		anInt3408++;
		if (i < 47) {
			return 107;
		}
		if ((i_20_ ^ 0xffffffff) > (i_19_ ^ 0xffffffff)) {
			return i_19_;
		}
		if ((i_20_ ^ 0xffffffff) >= (i_21_ ^ 0xffffffff)) {
			return i_20_;
		}
		return i_21_;
	}
	
	static final void method406(int i, int i_22_) {
		if (i_22_ != 37) {
			if (i_22_ == 50) {
				Class23_Sub4_Sub4.aDouble2969 = 4.0;
			} else if (i_22_ != 75) {
				Class23_Sub4_Sub4.aDouble2969 = 8.0;
			} else {
				Class23_Sub4_Sub4.aDouble2969 = 6.0;
			}
		} else {
			Class23_Sub4_Sub4.aDouble2969 = 3.0;
		}
		anInt3423++;
		Class75.anInt1381 = -1;
		if (i != -7606) {
			aShortArray3417 = null;
		}
		Class75.anInt1381 = -1;
	}
	
	static {
		aClass16_3416 = aClass16_3422;
		aBoolean3413 = true;
		aClass16_3414 = Class38_Sub6.method1076((byte) 86, "underlay)3dat");
		aClass16_3424 = aClass16_3406;
		aClass16_3419 = aClass16_3422;
	}
}

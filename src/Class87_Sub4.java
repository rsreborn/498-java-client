/* Class87_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class87_Sub4 extends Class87
{
	static int anInt2827;
	static int[] anIntArray2828;
	static int anInt2829;
	static int anInt2830;
	private final int anInt2831;
	static int anInt2832;
	static RSString aClass16_2833;
	private final int anInt2834;
	private final int anInt2835;
	static RSString aClass16_2836 = Class38_Sub6.method1076((byte) 86, "Anmelde)2Zeitlimit -Uberschritten)3");
	static int anInt2837;
	static int anInt2838;
	private final int anInt2839;
	private static RSString aClass16_2840;
	static int anInt2841;
	private final int anInt2842;
	static int anInt2843 = 0;
	static int anInt2844;
	private final int anInt2845;
	static int anInt2846;
	static int anInt2847;
	private final int anInt2848;
	static int anInt2849;
	private final int anInt2850;
	static short[] aShortArray2851;
	
	static final void method1422(Class105 class105, byte b) {
		int i = -122 % ((7 - b) / 54);
		anInt2849++;
		Class23_Sub13_Sub25.aClass105_4293 = class105;
	}
	
	final void method1408(int i, int i_0_, int i_1_) {
		anInt2846++;
		if (i_1_ > -101) {
			anInt2843 = 113;
		}
	}
	
	static final int method1423(int i, byte b) {
		if (b != -99) {
			aClass16_2833 = null;
		}
		anInt2829++;
		return i >>> 8;
	}
	
	static final Class23_Sub13_Sub10_Sub1 method1424(Class105 class105, boolean bool, int i, int i_2_) {
		if (bool != false) {
			method1423(104, (byte) -54);
		}
		anInt2830++;
		if (!Class23_Sub4_Sub29.method385(class105, 0, i, i_2_)) {
			return null;
		}
		return Class23_Sub13_Sub17.method789(-86);
	}
	
	static final boolean method1425(byte b, int i) {
		int i_3_ = 16 / ((b - 61) / 42);
		anInt2847++;
		if ((i ^ 0xffffffff) > -1) {
			return false;
		}
		int i_4_ = Class38_Sub5.aShortArray2603[i];
		if (i_4_ >= 2000) {
			i_4_ -= 2000;
		}
		if (i_4_ == 1002) {
			return true;
		}
		return false;
	}
	
	Class87_Sub4(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		super(-1, i_12_, i_13_);
		anInt2835 = i_5_;
		anInt2842 = i_10_;
		anInt2850 = i_7_;
		anInt2845 = i_6_;
		anInt2848 = i;
		anInt2839 = i_8_;
		anInt2834 = i_9_;
		anInt2831 = i_11_;
	}
	
	static final void method1426(int i) {
		if (i != 7566) {
			method1425((byte) 113, -13);
		}
		Class4.method57(56, false);
		anInt2827++;
		Class23_Sub4_Sub17.anInt3179 = 0;
		boolean bool = true;
		for (int i_14_ = 0; i_14_ < Class53.aByteArrayArray843.length; i_14_++) {
			if ((Class23_Sub4_Sub23.anIntArray3282[i_14_] ^ 0xffffffff) != 0 && Class53.aByteArrayArray843[i_14_] == null) {
				Class53.aByteArrayArray843[i_14_] = Class38_Sub6.aClass105_Sub1_2613.method1544(0, i + -7566, Class23_Sub4_Sub23.anIntArray3282[i_14_]);
				if (Class53.aByteArrayArray843[i_14_] == null) {
					bool = false;
					Class23_Sub4_Sub17.anInt3179++;
				}
			}
			if (Class23_Sub4_Sub33.anIntArray3431[i_14_] != -1 && Class23_Sub8.aByteArrayArray2235[i_14_] == null) {
				Class23_Sub8.aByteArrayArray2235[i_14_] = Class38_Sub6.aClass105_Sub1_2613.method1546(Class23_Sub4_Sub33.anIntArray3431[i_14_], -119, 0, Class23_Sub2.anIntArrayArray2054[i_14_]);
				if (Class23_Sub8.aByteArrayArray2235[i_14_] == null) {
					bool = false;
					Class23_Sub4_Sub17.anInt3179++;
				}
			}
		}
		if (!bool) {
			Class23_Sub4_Sub25.anInt3311 = 1;
		} else {
			bool = true;
			Class23_Sub4_Sub9.anInt3036 = 0;
			for (int i_15_ = 0; Class53.aByteArrayArray843.length > i_15_; i_15_++) {
				byte[] bs = Class23_Sub8.aByteArrayArray2235[i_15_];
				if (bs != null) {
					int i_16_ = (0xff & Class23_Sub13_Sub13.anIntArray3996[i_15_]) * 64 + -Class58.anInt903;
					int i_17_ = -Class42.anInt662 + (Class23_Sub13_Sub13.anIntArray3996[i_15_] >> 8) * 64;
					if (Class23_Sub13_Sub26.aBoolean4298) {
						i_17_ = 10;
						i_16_ = 10;
					}
					bool &= Class23_Sub4_Sub2.method277(i_16_, bs, i_17_, (byte) 24);
				}
			}
			if (!bool) {
				Class23_Sub4_Sub25.anInt3311 = 2;
			} else {
				if (Class23_Sub4_Sub25.anInt3311 != 0) {
					Class23_Sub4_Sub29.method386(Class23_Sub4_Sub14.method322(new RSString[] { Class64.aClass16_1139, Class23_Sub4_Sub31.aClass16_3403 }, -61), true, false);
				}
				Class48.method1150((byte) 51);
				Class23_Sub10_Sub2.method560(74);
				Class23_Sub13_Sub1.method603();
				for (int i_18_ = 0; i_18_ < 4; i_18_++)
					Class4.aClass72Array85[i_18_].method1298(94);
				for (int i_19_ = 0; i_19_ < 4; i_19_++) {
					for (int i_20_ = 0; i_20_ < 104; i_20_++) {
						for (int i_21_ = 0; i_21_ < 104; i_21_++)
							Class23_Sub4_Sub30.aByteArrayArrayArray3379[i_19_][i_20_][i_21_] = (byte) 0;
					}
				}
				Class23_Sub4_Sub18.method336(i ^ ~0x3644);
				Class48.method1150((byte) 71);
				System.gc();
				Class48.method1150((byte) -91);
				Class4.method57(56, true);
				Class23_Sub13_Sub9.method691(i + 1848034130, false);
				if (!Class23_Sub13_Sub26.aBoolean4298) {
					Class48.method1149((byte) 126, false);
					Class4.method57(56, true);
					Class38_Sub5.method1074(21601, false);
				}
				if (Class23_Sub13_Sub26.aBoolean4298) {
					Class23_Sub19.method877(112, false);
					Class4.method57(56, true);
					Class23_Sub13_Sub8_Sub1.method678(false, (byte) 123);
				}
				Class23_Sub10_Sub2.method560(115);
				Class4.method57(56, true);
				Class48.method1150((byte) -101);
				Class78_Sub2.method1352(Class4.aClass72Array85, i ^ ~0x16d, false);
				Class4.method57(i + -7510, true);
				Class48.method1150((byte) 103);
				int i_22_ = Class28.anInt424;
				if ((ItemDefinition.anInt3916 ^ 0xffffffff) > (i_22_ ^ 0xffffffff)) {
					i_22_ = ItemDefinition.anInt3916;
				}
				if ((i_22_ ^ 0xffffffff) > (-1 + ItemDefinition.anInt3916 ^ 0xffffffff)) {
					i_22_ = ItemDefinition.anInt3916 + -1;
				}
				if (Class7.aBoolean170) {
					Class71_Sub3.method1287(Class28.anInt424);
				} else {
					Class71_Sub3.method1287(0);
				}
				Class104.method1530(i + -7683);
				for (int i_23_ = 0; i_23_ < 104; i_23_++) {
					for (int i_24_ = 0; i_24_ < 104; i_24_++)
						Class44.method1129(i_23_, i_24_, (byte) 118);
				}
				Class48.method1150((byte) -93);
				ISAACCipher.method1259(-1);
				Class23_Sub10_Sub2.method560(118);
				if (Class23_Sub19.aFrame2385 != null) {
					Class23_Sub7.aClass23_Sub5_Sub1_2202.writeOpcode(7, i + -4590);
					Class23_Sub4_Sub39.anInt3524++;
					Class23_Sub7.aClass23_Sub5_Sub1_2202.putInt(1057001181, i ^ ~0x43d2fe69);
				}
				if (!Class23_Sub13_Sub26.aBoolean4298) {
					int i_25_ = (-6 + Class23_Sub4_Sub23.anInt3279) / 8;
					int i_26_ = (6 + Class23_Sub4_Sub23.anInt3279) / 8;
					int i_27_ = (Class64.anInt1138 + -6) / 8;
					int i_28_ = (6 + Class64.anInt1138) / 8;
					for (int i_29_ = i_25_ - 1; i_29_ <= i_26_ + 1; i_29_++) {
						for (int i_30_ = i_27_ + -1; (i_30_ ^ 0xffffffff) >= (1 + i_28_ ^ 0xffffffff); i_30_++) {
							if ((i_25_ ^ 0xffffffff) < (i_29_ ^ 0xffffffff) || i_26_ < i_29_ || (i_27_ ^ 0xffffffff) < (i_30_ ^ 0xffffffff) || (i_30_ ^ 0xffffffff) < (i_28_ ^ 0xffffffff)) {
								Class38_Sub6.aClass105_Sub1_2613.method1535(-1, Class23_Sub4_Sub14.method322(new RSString[] { client.aClass16_1961, Class23_Sub4_Sub23.method360((byte) -9, i_29_), Class38_Sub7_Sub1.aClass16_4369, Class23_Sub4_Sub23.method360((byte) -9, i_30_) }, -120));
								Class38_Sub6.aClass105_Sub1_2613.method1535(-1, Class23_Sub4_Sub14.method322(new RSString[] { Class40.aClass16_632, Class23_Sub4_Sub23.method360((byte) -9, i_29_), Class38_Sub7_Sub1.aClass16_4369, Class23_Sub4_Sub23.method360((byte) -9, i_30_) }, -15));
							}
						}
					}
				}
				Class103.method1521(30, i ^ 0x77aa);
				Class48.method1150((byte) 100);
				Class23_Sub7.aClass23_Sub5_Sub1_2202.writeOpcode(70, 2976);
				ObjectDefinition.method640((byte) -86);
			}
		}
	}
	
	static final void method1427(int i, boolean bool) {
		anInt2832++;
		if (bool != false) {
			method1427(-80, true);
		}
		if (Class17.method189(-10924, i)) {
			Class71_Sub2_Sub1.method1283(Class23_Sub4_Sub28.aClass64ArrayArray3350[i], -1, -22561);
		}
	}
	
	final void method1406(int i, int i_31_, int i_32_) {
		if (i != 1) {
			method1408(-124, -126, 109);
		}
		anInt2838++;
	}
	
	public static void method1428(byte b) {
		if (b != 65) {
			method1427(-103, true);
		}
		aClass16_2840 = null;
		aShortArray2851 = null;
		aClass16_2833 = null;
		aClass16_2836 = null;
		anIntArray2828 = null;
	}
	
	final void method1409(int i, int i_33_, int i_34_) {
		if (i_33_ < 31) {
			method1426(-76);
		}
		int i_35_ = i * anInt2848 >> 12;
		int i_36_ = i_34_ * anInt2835 >> 12;
		anInt2844++;
		int i_37_ = i * anInt2845 >> 12;
		int i_38_ = i_34_ * anInt2850 >> 12;
		int i_39_ = anInt2839 * i >> 12;
		int i_40_ = anInt2834 * i_34_ >> 12;
		int i_41_ = anInt2831 * i_34_ >> 12;
		int i_42_ = i * anInt2842 >> 12;
		Class57.method1189(i_38_, i_40_, i_41_, -2, anInt1487, i_35_, i_42_, i_36_, i_37_, i_39_);
	}
	
	static {
		anInt2841 = 0;
		aClass16_2840 = Class38_Sub6.method1076((byte) 86, "New User");
		aClass16_2833 = aClass16_2840;
		aShortArray2851 = new short[256];
	}
}

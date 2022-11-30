/* Class23_Sub13_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class23_Sub13_Sub10 extends Class23_Sub13
{
	static int anInt3868;
	protected int anInt3869;
	protected int anInt3870;
	static int anInt3871;
	static byte[][][] aByteArrayArrayArray3872;
	protected int anInt3873;
	static int anInt3874;
	static RSString aClass16_3875;
	static RSString aClass16_3876;
	protected int anInt3877;
	static int anInt3878 = 0;
	protected int anInt3879;
	static Class23_Sub13_Sub10_Sub1 aClass23_Sub13_Sub10_Sub1_3880;
	static int[][][] anIntArrayArrayArray3881;
	static int anInt3882;
	private static RSString aClass16_3883 = Class38_Sub6.method1076((byte) 86, "Connection timed out)3");
	static int anInt3884;
	protected int anInt3885;
	static RSString aClass16_3886 = Class38_Sub6.method1076((byte) 86, "::qa_op_test");
	static int anInt3887;
	static RSString aClass16_3888;
	static int anInt3889;
	static int anInt3890;
	
	static final Class23_Sub13_Sub10_Sub1 method692(Class105 class105, int i, RSString class16, RSString class16_0_) {
		anInt3874++;
		if (i < 49) {
			aByteArrayArrayArray3872 = null;
		}
		int i_1_ = class105.method1540(79, class16_0_);
		int i_2_ = class105.method1543(class16, -124, i_1_);
		return Class87_Sub4.method1424(class105, false, i_1_, i_2_);
	}
	
	static final void method693(int i) {
		if (!Class53.aBoolean840) {
			Class38_Sub5.aShortArray2603[0] = (short) 1006;
			Class23_Sub13_Sub26.aClass16Array4307[0] = Class23_Sub4_Sub27.aClass16_3338;
			Class98.aClass16Array1655[0] = Class23_Sub4_Sub38.aClass16_3509;
			Class23_Sub13_Sub9.anInt3863 = 1;
		}
		if ((Class69.anInt1218 ^ 0xffffffff) != 0) {
			Class87_Sub4.method1427(Class69.anInt1218, false);
		}
		if (i == 25602) {
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (Class23_Sub4_Sub25.anInt3306 ^ 0xffffffff); i_3_++) {
				if (Class23_Sub4_Sub23_Sub1.aBooleanArray4478[i_3_]) {
					Class36.aBooleanArray571[i_3_] = true;
				}
				Class23_Sub4_Sub26.aBooleanArray3325[i_3_] = Class23_Sub4_Sub23_Sub1.aBooleanArray4478[i_3_];
				Class23_Sub4_Sub23_Sub1.aBooleanArray4478[i_3_] = false;
			}
			Class97.anInt1632 = -1;
			anInt3884++;
			Class70.anInt1222 = -1;
			Class23_Sub4_Sub14.anInt3120 = Class89.anInt1511;
			Class23_Sub13_Sub23.aClass64_4257 = null;
			if ((Class69.anInt1218 ^ 0xffffffff) != 0) {
				Class23_Sub4_Sub25.anInt3306 = 0;
				Class23_Sub26.method909(0, 0, Class23_Sub4_Sub19.anInt3205, -1, (byte) 21, 0, Class51.anInt801, Class69.anInt1218, 0);
			}
			Class20.method200();
			Class35.method979(false);
			if (!Class53.aBoolean840) {
				if ((Class97.anInt1632 ^ 0xffffffff) != 0) {
					Class71.method1267(Class70.anInt1222, (byte) -64, Class97.anInt1632);
				}
			} else {
				Class99.method1494(-19);
			}
			if (Class57.anInt901 == 3) {
				for (int i_4_ = 0; (Class23_Sub4_Sub25.anInt3306 ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
					if (!Class23_Sub4_Sub26.aBooleanArray3325[i_4_]) {
						if (Class36.aBooleanArray571[i_4_]) {
							Class20.method212(Class23_Sub4_Sub9.anIntArray3034[i_4_], Class23_Sub11.anIntArray2286[i_4_], Class24.anIntArray372[i_4_], Class55.anIntArray865[i_4_], 16711680, 128);
						}
					} else {
						Class20.method212(Class23_Sub4_Sub9.anIntArray3034[i_4_], Class23_Sub11.anIntArray2286[i_4_], Class24.anIntArray372[i_4_], Class55.anIntArray865[i_4_], 16711935, 128);
					}
				}
			}
			Class34.method970((byte) -106, Class23_Sub25.anInt2459, Class105.aClass38_Sub7_Sub2_1812.anInt2674, Class105.aClass38_Sub7_Sub2_1812.anInt2659, Class23_Sub13_Sub11.anInt3916);
			Class23_Sub25.anInt2459 = 0;
		}
	}
	
	abstract void method694(int i, int i_5_);
	
	abstract void method695(int i, int i_6_, int i_7_, int i_8_, int i_9_);
	
	abstract void method696(int i, int i_10_, int i_11_);
	
	final void method697(int i, int i_12_, int i_13_, int i_14_, int i_15_) {
		anInt3890++;
		if (i_15_ > -93) {
			aByteArrayArrayArray3872 = null;
		}
		int i_16_ = anInt3879 << 3;
		i_13_ = (i_13_ << 4) + (i_16_ & 0xf);
		int i_17_ = anInt3885 << 3;
		i_12_ = (i_12_ << 4) - -(0xf & i_17_);
		method701(i_16_, i_17_, i_13_, i_12_, i_14_, i);
	}
	
	abstract void method698(int i, int i_18_, int i_19_, int i_20_);
	
	abstract void method699(int i, int i_21_, int i_22_, int i_23_);
	
	static final void updatePlayers(int i) {
		Class23_Sub2.anInt2048 = 0;
		anInt3889++;
		Class23_Sub4_Sub10.anInt3061 = 0;
		Class23_Sub4_Sub13.parsePlayerMovement(-3);
		Class23_Sub13_Sub19.parseTrackedPlayerMovement((byte) -11);
		Class45.registerNewPlayers(0);
		Class67.parseTrackedPlayerUpdateMasks(118);
		for (int i_24_ = i; (Class23_Sub4_Sub10.anInt3061 ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++) {
			int i_25_ = Class54.anIntArray857[i_24_];
			if ((Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_25_].anInt2698 ^ 0xffffffff) != (Class89.anInt1511 ^ 0xffffffff)) {
				Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_25_] = null;
			}
		}
		if ((Class23_Sub4_Sub2.anInt2925 ^ 0xffffffff) != (Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.position ^ 0xffffffff)) {
			throw new RuntimeException("gpp1 pos:" + Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.position + " psize:" + Class23_Sub4_Sub2.anInt2925);
		}
		for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > (Class23_Sub4_Sub11.anInt3067 ^ 0xffffffff); i_26_++) {
			if (Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[Class23_Sub13_Sub3.anIntArray3700[i_26_]] == null) {
				throw new RuntimeException("gpp2 pos:" + i_26_ + " size:" + Class23_Sub4_Sub11.anInt3067);
			}
		}
	}
	
	abstract void method701(int i, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_);
	
	public static void method702(int i) {
		aClass16_3883 = null;
		aClass23_Sub13_Sub10_Sub1_3880 = null;
		anIntArrayArrayArray3881 = null;
		aByteArrayArrayArray3872 = null;
		aClass16_3876 = null;
		if (i != 3) {
			method692(null, -75, null, null);
		}
		aClass16_3886 = null;
		aClass16_3875 = null;
		aClass16_3888 = null;
	}
	
	static final void method703(byte b, int i) {
		anInt3887++;
		if (i != -1 && Class54.aBooleanArray859[i]) {
			Class71_Sub3.aClass105_2745.method1542(1, i);
			if (Class23_Sub4_Sub28.aClass64ArrayArray3350[i] != null) {
				boolean bool = true;
				if (b == 9) {
					for (int i_32_ = 0; (i_32_ ^ 0xffffffff) > (Class23_Sub4_Sub28.aClass64ArrayArray3350[i].length ^ 0xffffffff); i_32_++) {
						if (Class23_Sub4_Sub28.aClass64ArrayArray3350[i][i_32_] != null) {
							if (Class23_Sub4_Sub28.aClass64ArrayArray3350[i][i_32_].anInt1003 != 2) {
								Class23_Sub4_Sub28.aClass64ArrayArray3350[i][i_32_] = null;
							} else {
								bool = false;
							}
						}
					}
					if (bool) {
						Class23_Sub4_Sub28.aClass64ArrayArray3350[i] = null;
					}
					Class54.aBooleanArray859[i] = false;
				}
			}
		}
	}
	
	static final void method704(boolean bool, RSString class16, byte b) {
		class16 = class16.method152(48);
		short[] ses = new short[16];
		anInt3882++;
		int i = 0;
		for (int i_33_ = 0; i_33_ < Class30.anInt477; i_33_++) {
			Class23_Sub13_Sub11 class23_sub13_sub11 = Class23_Sub13_Sub24.method853(-85, i_33_);
			if ((!bool || class23_sub13_sub11.aBoolean3900) && class23_sub13_sub11.anInt3955 == -1 && class23_sub13_sub11.anInt3915 == -1 && (class23_sub13_sub11.anInt3956 ^ 0xffffffff) == -1 && class23_sub13_sub11.aClass16_3902.method152(48).method173(92, class16) != -1) {
				if (i >= 250) {
					Class23_Sub1.aShortArray2007 = null;
					Class1.anInt67 = -1;
					return;
				}
				if ((ses.length ^ 0xffffffff) >= (i ^ 0xffffffff)) {
					short[] ses_34_ = new short[ses.length * 2];
					for (int i_35_ = 0; (i ^ 0xffffffff) < (i_35_ ^ 0xffffffff); i_35_++)
						ses_34_[i_35_] = ses[i_35_];
					ses = ses_34_;
				}
				ses[i++] = (short) i_33_;
			}
		}
		Class68.anInt1196 = 0;
		Class1.anInt67 = i;
		RSString[] class16s = new RSString[Class1.anInt67];
		Class23_Sub1.aShortArray2007 = ses;
		for (int i_36_ = 0; i_36_ < Class1.anInt67; i_36_++)
			class16s[i_36_] = Class23_Sub13_Sub24.method853(121, ses[i_36_]).aClass16_3902;
		if (b <= 108) {
			method693(-115);
		}
		Class23_Sub4_Sub16.method330(Class23_Sub1.aShortArray2007, (byte) -9, class16s);
	}
	
	abstract void method705(int i, int i_37_);
	
	public Class23_Sub13_Sub10() {
		/* empty */
	}
	
	static {
		aClass16_3876 = aClass16_3883;
		aClass16_3875 = Class38_Sub6.method1076((byte) 86, ")1p");
		aClass16_3888 = Class38_Sub6.method1076((byte) 86, ")2");
	}
}

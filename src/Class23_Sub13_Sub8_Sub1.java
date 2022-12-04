/* Class23_Sub13_Sub8_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class23_Sub13_Sub8_Sub1 extends Class23_Sub13_Sub8
{
	static int anInt4487 = 3353893;
	static int anInt4488;
	static int anInt4489;
	static RSString aClass16_4490;
	static int anInt4491;
	static boolean[] aBooleanArray4492 = new boolean[112];
	static int anInt4493;
	static Class23_Sub13_Sub10 aClass23_Sub13_Sub10_4494;
	static int anInt4495;
	static int[] anIntArray4496;
	protected byte[][] aByteArrayArray4497;
	static int anInt4498;
	static int anInt4499;
	static int anInt4500;
	static int anInt4501;
	
	static final void method677(Class105 class105, Class105 class105_0_, boolean bool, Class105 class105_1_, Class105 class105_2_) {
		Class71_Sub3.aClass105_2745 = class105_2_;
		Class61.aClass105_958 = class105_0_;
		if (bool != false) {
			method679(-100, 46, (byte) -18);
		}
		anInt4499++;
		Class17.aClass105_313 = class105;
		RSString.aClass105_1947 = class105_1_;
		Class23_Sub4_Sub28.aClass64ArrayArray3350 = new Class64[Class71_Sub3.aClass105_2745.method1556(122)][];
		Class54.aBooleanArray859 = new boolean[Class71_Sub3.aClass105_2745.method1556(-61)];
	}
	
	static final void method678(boolean bool, byte b) {
		anInt4495++;
		if (b <= 112) {
			anInt4501 = -108;
		}
		int i = 4;
		byte[][] bs = Class23_Sub8.aByteArrayArray2235;
		for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (i ^ 0xffffffff); i_3_++) {
			Class48.method1150((byte) -127);
			for (int i_4_ = 0; i_4_ < 13; i_4_++) {
				for (int i_5_ = 0; i_5_ < 13; i_5_++) {
					int i_6_ = Class94.anIntArrayArrayArray1602[i_3_][i_4_][i_5_];
					if ((i_6_ ^ 0xffffffff) != 0) {
						int i_7_ = (0x3cb6356 & i_6_) >> 24;
						if (!bool || (i_7_ ^ 0xffffffff) == -1) {
							int i_8_ = (i_6_ & 0xffdacd) >> 14;
							int i_9_ = (i_6_ & 0x3ffa) >> 3;
							int i_10_ = (i_8_ / 8 << 8) - -(i_9_ / 8);
							int i_11_ = (i_6_ & 0x7) >> 1;
							for (int i_12_ = 0; (Class23_Sub13_Sub13.anIntArray3996.length ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++) {
								if (Class23_Sub13_Sub13.anIntArray3996[i_12_] == i_10_ && bs[i_12_] != null) {
									Class78.method1343(i_3_, i_11_, 8 * (0x7 & i_9_), 8 * (0x7 & i_8_), 8 * i_4_, bool, i_7_, Class4.aClass72Array85, 8 * i_5_, -1137131194, bs[i_12_]);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
	
	Class23_Sub13_Sub8_Sub1(byte[] bs, int[] is, int[] is_13_, int[] is_14_, int[] is_15_, byte[][] bs_16_) {
		super(bs, is, is_13_, is_14_, is_15_);
		aByteArrayArray4497 = new byte[256][];
		aByteArrayArray4497 = bs_16_;
	}
	
	Class23_Sub13_Sub8_Sub1(byte[] bs) {
		super(bs);
		aByteArrayArray4497 = new byte[256][];
	}
	
	final void method673(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_) {
		anInt4491++;
		int i_23_ = Class20.anInt329 * i_18_ + i_17_;
		int i_24_ = 0;
		int i_25_ = -i_19_ + Class20.anInt329;
		if (Class20.anInt332 > i_18_) {
			int i_26_ = -i_18_ + Class20.anInt332;
			i_18_ = Class20.anInt332;
			i_23_ += Class20.anInt329 * i_26_;
			i_20_ -= i_26_;
			i_24_ += i_26_ * i_19_;
		}
		int i_27_ = 0;
		if ((Class20.anInt334 ^ 0xffffffff) > (i_18_ + i_20_ ^ 0xffffffff)) {
			i_20_ -= i_18_ + (i_20_ + -Class20.anInt334);
		}
		if (i_17_ < Class20.anInt333) {
			int i_28_ = -i_17_ + Class20.anInt333;
			i_27_ += i_28_;
			i_23_ += i_28_;
			i_25_ += i_28_;
			i_19_ -= i_28_;
			i_24_ += i_28_;
			i_17_ = Class20.anInt333;
		}
		if (i_17_ - -i_19_ > Class20.anInt330) {
			int i_29_ = -Class20.anInt330 + i_17_ - -i_19_;
			i_25_ += i_29_;
			i_27_ += i_29_;
			i_19_ -= i_29_;
		}
		if ((i_19_ ^ 0xffffffff) < -1 && i_20_ > 0) {
			Class71_Sub2_Sub1.method1281((byte) -16, i_22_, i_25_, i_23_, i_19_, i_21_, i_24_, Class20.anIntArray328, i_20_, i_27_, aByteArrayArray4497[i]);
		}
	}
	
	final void method662(int i, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_) {
		anInt4500++;
		int i_35_ = i_31_ * Class20.anInt329 + i_30_;
		int i_36_ = 0;
		if ((Class20.anInt332 ^ 0xffffffff) < (i_31_ ^ 0xffffffff)) {
			int i_37_ = Class20.anInt332 + -i_31_;
			i_36_ += i_37_ * i_32_;
			i_35_ += Class20.anInt329 * i_37_;
			i_33_ -= i_37_;
			i_31_ = Class20.anInt332;
		}
		int i_38_ = 0;
		if (Class20.anInt334 < i_33_ + i_31_) {
			i_33_ -= -Class20.anInt334 + i_31_ - -i_33_;
		}
		int i_39_ = -i_32_ + Class20.anInt329;
		if ((Class20.anInt333 ^ 0xffffffff) < (i_30_ ^ 0xffffffff)) {
			int i_40_ = -i_30_ + Class20.anInt333;
			i_36_ += i_40_;
			i_35_ += i_40_;
			i_39_ += i_40_;
			i_32_ -= i_40_;
			i_30_ = Class20.anInt333;
			i_38_ += i_40_;
		}
		if (Class20.anInt330 < i_30_ - -i_32_) {
			int i_41_ = -Class20.anInt330 + (i_32_ + i_30_);
			i_32_ -= i_41_;
			i_38_ += i_41_;
			i_39_ += i_41_;
		}
		if (i_32_ > 0 && (i_33_ ^ 0xffffffff) < -1) {
			Class68.method1250(-113, i_38_, Class20.anIntArray328, i_36_, i_35_, i_39_, i_33_, i_34_, aByteArrayArray4497[i], i_32_);
		}
	}
	
	static final Class64 method679(int i, int i_42_, byte b) {
		anInt4498++;
		Class64 class64 = Class23_Sub24.method905(i, (byte) 111);
		if (i_42_ == -1) {
			return class64;
		}
		if (class64 == null || class64.aClass64Array1131 == null || (i_42_ ^ 0xffffffff) <= (class64.aClass64Array1131.length ^ 0xffffffff)) {
			return null;
		}
		if (b > -26) {
			aBooleanArray4492 = null;
		}
		return class64.aClass64Array1131[i_42_];
	}
	
	public static void method680(int i) {
		anIntArray4496 = null;
		aBooleanArray4492 = null;
		aClass23_Sub13_Sub10_4494 = null;
		if (i > 62) {
			aClass16_4490 = null;
		}
	}
	
	static final Class23_Sub13_Sub14 method681(int i, boolean bool) {
		anInt4489++;
		Class23_Sub13_Sub14 class23_sub13_sub14 = (Class23_Sub13_Sub14) Class23_Sub13_Sub6.aClass5_3729.method62(-13, (long) i);
		if (class23_sub13_sub14 != null) {
			return class23_sub13_sub14;
		}
		if (bool != false) {
			method679(19, -56, (byte) -28);
		}
		byte[] bs = Class23_Sub13_Sub25.aClass105_4293.method1544(Class23_Sub13_Sub12.method756(i, 1), 0, Class68.method1247(i, (byte) -122));
		class23_sub13_sub14 = new Class23_Sub13_Sub14();
		if (bs != null) {
			class23_sub13_sub14.method766(new Buffer(bs), 2);
		}
		Class23_Sub13_Sub6.aClass5_3729.method67((long) i, class23_sub13_sub14, !bool);
		return class23_sub13_sub14;
	}
	
	static final void method682(int i) {
		anInt4493++;
		Class87.aClass5_1488.method68(i ^ i);
	}
	
	static final void method683(int i, int i_43_, int i_44_, int i_45_, int i_46_) {
		if (i_45_ == -1) {
			if ((Class23_Sub13_Sub6.anInt3728 ^ 0xffffffff) >= (i_46_ ^ 0xffffffff) && i_46_ <= Class35.anInt554) {
				i = Class23_Sub4_Sub32.method405(105, Class88.anInt1503, i, Class23_Sub4_Sub33.anInt3435);
				i_44_ = Class23_Sub4_Sub32.method405(100, Class88.anInt1503, i_44_, Class23_Sub4_Sub33.anInt3435);
				ISAACCipher.method1264(i_43_, i_44_, i, i_46_, (byte) -31);
			}
			anInt4488++;
		}
	}
	
	static {
		aClass16_4490 = Class38_Sub6.method1076((byte) 86, "und haben es deaktiviert)3 Klicken Sie auf der");
		anInt4501 = 0;
		anIntArray4496 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
	}
}

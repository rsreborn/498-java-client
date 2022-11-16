/* Class23_Sub4_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub7 extends Class23_Sub4
{
	static int anInt2994;
	static int anInt2995;
	private int anInt2996;
	static oa anOa2997;
	static int anInt2998;
	private int anInt2999 = 8192;
	static int anInt3000;
	static int anInt3001;
	static int anInt3002;
	static int anInt3003;
	static int anInt3004;
	static int anInt3005;
	static int anInt3006;
	static RSString aClass16_3007;
	private int anInt3008;
	static RSString aClass16_3009;
	private int anInt3010;
	static int anInt3011 = 0;
	static boolean aBoolean3012;
	private int anInt3013;
	private int anInt3014;
	private static RSString aClass16_3015;
	static RSString aClass16_3016 = Class38_Sub6.method1076((byte) 86, "Zu viele Anmelde)2Versuche von Ihrer Adresse");
	static int anInt3017;
	static boolean aBoolean3018;
	private int anInt3019;
	static RSString aClass16_3020;
	static RSString aClass16_3021;
	static RSString aClass16_3022;
	static int anInt3023;
	static Class105_Sub1 aClass105_Sub1_3024;
	static int anInt3025;
	static int anInt3026;
	static int anInt3027;
	
	private final boolean method289(int i, int i_0_, int i_1_) {
		int i_2_ = (i_1_ - i_0_) * anInt2996 >> 12;
		anInt3005++;
		if (i < 86) {
			aBoolean3018 = false;
		}
		int i_3_ = Class55.anIntArray870[0xff & i_2_ * 255 >> 12];
		i_3_ = (i_3_ << 12) / anInt2996;
		i_3_ = (i_3_ << 12) / anInt2999;
		i_3_ = anInt3010 * i_3_ >> 12;
		if ((i_3_ ^ 0xffffffff) >= (i_0_ - -i_1_ ^ 0xffffffff) || (i_0_ + i_1_ ^ 0xffffffff) >= (-i_3_ ^ 0xffffffff)) {
			return false;
		}
		return true;
	}
	
	final void method265(int i) {
		Class33.method968(2);
		if (i != -21746) {
			anInt2999 = -46;
		}
		anInt2998++;
	}
	
	final int[] method260(int i, int i_4_) {
		if (i != 0) {
			method289(24, 115, 66);
		}
		anInt3003++;
		int[] is = aClass99_2115.method1500(i_4_, (byte) -116);
		if (aClass99_2115.aBoolean1681) {
			int i_5_ = Class23_Sub13_Sub16.anIntArray4049[i_4_] - 2048;
			for (int i_6_ = 0; Class23_Sub4_Sub33.anInt3428 > i_6_; i_6_++) {
				int i_7_ = -2048 + Class61.anIntArray967[i_6_];
				int i_8_ = i_7_ + anInt3013;
				int i_9_ = i_5_ + anInt3014;
				i_8_ = i_8_ >= -2048 ? i_8_ : 4096 + i_8_;
				int i_10_ = anInt3008 + i_7_;
				i_10_ = i_10_ >= -2048 ? i_10_ : 4096 + i_10_;
				i_8_ = i_8_ > 2048 ? -4096 + i_8_ : i_8_;
				i_9_ = i_9_ >= -2048 ? i_9_ : 4096 + i_9_;
				i_9_ = i_9_ > 2048 ? -4096 + i_9_ : i_9_;
				i_10_ = i_10_ > 2048 ? -4096 + i_10_ : i_10_;
				int i_11_ = i_5_ + anInt3019;
				i_11_ = i_11_ >= -2048 ? i_11_ : 4096 + i_11_;
				i_11_ = i_11_ > 2048 ? -4096 + i_11_ : i_11_;
				is[i_6_] = method289(114, i_8_, i_9_) || method295(i_10_, i_11_, 109) ? 4096 : 0;
			}
		}
		return is;
	}
	
	public static void method290(int i) {
		aClass16_3021 = null;
		aClass16_3009 = null;
		aClass16_3022 = null;
		aClass16_3020 = null;
		aClass16_3007 = null;
		aClass16_3016 = null;
		aClass105_Sub1_3024 = null;
		aClass16_3015 = null;
		if (i != 6094) {
			method291(null, null, null, true);
		}
		anOa2997 = null;
	}
	
	static final Class43[] method291(RSString class16, Class105 class105, RSString class16_12_, boolean bool) {
		int i = class105.method1540(85, class16);
		anInt2994++;
		int i_13_ = class105.method1543(class16_12_, -81, i);
		if (bool != true) {
			return null;
		}
		return Class68.method1249(class105, i_13_, i, 0);
	}
	
	static final RSString method292(byte b, int i, boolean bool) {
		anInt3000++;
		if (b > 0) {
			method291(null, null, null, true);
		}
		return Class23_Sub24.method903(bool, 10, -23328, i);
	}
	
	static final void method293(byte b) {
		if (Class23_Sub4_Sub4.aDouble2969 > Class107.aDouble1838) {
			Class107.aDouble1838 += Class107.aDouble1838 / 30.0;
			if (Class107.aDouble1838 > Class23_Sub4_Sub4.aDouble2969) {
				Class107.aDouble1838 = Class23_Sub4_Sub4.aDouble2969;
			}
			Class61.method1198(15);
		} else if (Class23_Sub4_Sub4.aDouble2969 < Class107.aDouble1838) {
			Class107.aDouble1838 -= Class107.aDouble1838 / 30.0;
			if (Class107.aDouble1838 < Class23_Sub4_Sub4.aDouble2969) {
				Class107.aDouble1838 = Class23_Sub4_Sub4.aDouble2969;
			}
			Class61.method1198(15);
		}
		if (b >= -97) {
			anOa2997 = null;
		}
		anInt3002++;
		if ((Class68.anInt1203 ^ 0xffffffff) != 0 && Class75.anInt1381 != -1) {
			int i = Class68.anInt1203 - Canvas_Sub1.anInt55;
			int i_14_ = -Class8.anInt179 + Class75.anInt1381;
			if (i < 2 || i > 2) {
				i >>= 4;
			}
			if (i_14_ < 2 || i_14_ > 2) {
				i_14_ >>= 4;
			}
			Canvas_Sub1.anInt55 += i;
			if ((i ^ 0xffffffff) == -1 && i_14_ == 0) {
				Class75.anInt1381 = -1;
				Class68.anInt1203 = -1;
			}
			Class8.anInt179 = i_14_ + Class8.anInt179;
			Class61.method1198(15);
		}
	}
	
	static final void method294(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_) {
		if ((i_15_ ^ 0xffffffff) > (Class23_Sub13_Sub6.anInt3728 ^ 0xffffffff) || i_17_ > Class35.anInt554 || (i_20_ ^ 0xffffffff) > (Class88.anInt1503 ^ 0xffffffff) || i_21_ > Class23_Sub4_Sub33.anInt3435) {
			Class23_Sub20.method888(i_18_, i_17_, i_19_ ^ 0x801, i_15_, i_21_, i_16_, i, i_20_);
		} else {
			Class23_Sub4_Sub39.method423(i_20_, i_18_, i_16_, i, i_15_, (byte) 88, i_17_, i_21_);
		}
		anInt3017++;
		if (i_19_ != 2048) {
			anInt3025 = 9;
		}
	}
	
	public Class23_Sub4_Sub7() {
		super(0, true);
		anInt2996 = 12288;
		anInt3010 = 4096;
		anInt3014 = 0;
		anInt3013 = 2048;
		anInt3019 = 2048;
		anInt3008 = 0;
	}
	
	final void method255(Buffer class23_sub5, int i, int i_22_) {
		if (i_22_ == 1000) {
			anInt2995++;
			int i_23_ = i;
		while_16_:
			do {
			while_15_:
				do {
				while_14_:
					do {
					while_13_:
						do {
						while_12_:
							do {
								do {
									if ((i_23_ ^ 0xffffffff) != -1) {
										if (i_23_ != 1) {
											if (i_23_ != 2) {
												if (i_23_ != 3) {
													if (i_23_ != 4) {
														if (i_23_ != 5) {
															if (i_23_ == 6) {
																break while_15_;
															}
															break while_16_;
														}
													} else {
														break while_13_;
													}
													break while_14_;
												}
											} else {
												break;
											}
											break while_12_;
										}
									} else {
										anInt3013 = class23_sub5.method476((byte) -119);
										return;
									}
									anInt3014 = class23_sub5.method476((byte) -122);
									return;
								} while (false);
								anInt3008 = class23_sub5.method476((byte) -120);
								return;
							} while (false);
							anInt3019 = class23_sub5.method476((byte) -123);
							return;
						} while (false);
						anInt2996 = class23_sub5.method476((byte) -114);
						return;
					} while (false);
					anInt3010 = class23_sub5.method476((byte) -127);
					return;
				} while (false);
				anInt2999 = class23_sub5.method476((byte) -114);
			} while (false);
		}
	}
	
	private final boolean method295(int i, int i_24_, int i_25_) {
		int i_26_ = anInt2996 * (i + i_24_) >> 12;
		anInt3001++;
		int i_27_ = Class55.anIntArray870[(i_26_ * 255 & 0xffd57) >> 12];
		i_27_ = (i_27_ << 12) / anInt2996;
		if (i_25_ <= 98) {
			return true;
		}
		i_27_ = (i_27_ << 12) / anInt2999;
		i_27_ = anInt3010 * i_27_ >> 12;
		if (i_27_ <= -i + i_24_ || (-i_27_ ^ 0xffffffff) <= (i_24_ - i ^ 0xffffffff)) {
			return false;
		}
		return true;
	}
	
	static {
		aClass16_3007 = null;
		aClass16_3020 = Class38_Sub6.method1076((byte) 86, "Weiter");
		aBoolean3012 = false;
		aClass16_3015 = Class38_Sub6.method1076((byte) 86, "Please use a different world)3");
		aClass16_3021 = aClass16_3015;
		aClass16_3009 = aClass16_3015;
		anOa2997 = new oa(32);
		anInt3025 = 0;
		anInt3027 = -1;
	}
}

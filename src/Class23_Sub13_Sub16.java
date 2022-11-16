/* Class23_Sub13_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub13_Sub16 extends Class23_Sub13
{
	static int anInt4037;
	static int anInt4038;
	static RSString aClass16_4039;
	static int anInt4040;
	static RSString aClass16_4041 = Class38_Sub6.method1076((byte) 86, "<)4col> x");
	protected Class15[] aClass15Array4042;
	static boolean aBoolean4043;
	static int anInt4044;
	static int anInt4045;
	private static RSString aClass16_4046 = Class38_Sub6.method1076((byte) 86, "Unexpected server response)3");
	static RSString aClass16_4047;
	static RSString aClass16_4048 = Class38_Sub6.method1076((byte) 86, "");
	static int[] anIntArray4049;
	
	static final void method778(int i, Class105 class105, int i_0_, int i_1_, int i_2_, boolean bool) {
		Class87.aClass105_1496 = class105;
		Class23_Sub9.anInt2257 = i_2_;
		Class59.anInt931 = i_1_;
		Class23_Sub4_Sub7.aBoolean3018 = bool;
		Class46.anInt708 = i_0_;
		Class23_Sub13_Sub5.anInt3720 = 10000;
		Class87_Sub4.anInt2837 = i;
		anInt4038++;
	}
	
	static final boolean method779(boolean bool, int i, long l, int i_3_) {
		int i_4_ = 0x1f & (int) l >> 14;
		anInt4037++;
		int i_5_ = 0x3 & (int) l >> 20;
		if (bool != true) {
			aClass16_4048 = null;
		}
		int i_6_ = (int) (l >>> 32) & 0x7fffffff;
		if (i_4_ == 10 || i_4_ == 11 || i_4_ == 22) {
			Class23_Sub13_Sub7 class23_sub13_sub7 = Class38_Sub2.method1037(i_6_, -21035);
			int i_7_;
			int i_8_;
			if ((i_5_ ^ 0xffffffff) != -1 && i_5_ != 2) {
				i_7_ = class23_sub13_sub7.anInt3754;
				i_8_ = class23_sub13_sub7.anInt3752;
			} else {
				i_7_ = class23_sub13_sub7.anInt3752;
				i_8_ = class23_sub13_sub7.anInt3754;
			}
			int i_9_ = class23_sub13_sub7.anInt3790;
			if (i_5_ != 0) {
				i_9_ = (i_9_ << i_5_ & 0xf) + (i_9_ >> 4 - i_5_);
			}
			Class5.method66(0, i_3_, 2, i, true, !bool, 0, i_9_, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], i_8_, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], i_7_);
		} else {
			Class5.method66(1 + i_4_, i_3_, 2, i, true, !bool, i_5_, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 0);
		}
		Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
		Class51.anInt798 = 0;
		Class23_Sub7.anInt2213 = 2;
		Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
		return true;
	}
	
	static final void method780(int i, int i_10_, int i_11_, int i_12_) {
		Class23_Sub13_Sub18.aClass23_Sub1ArrayArrayArray4088 = new Class23_Sub1[i][i_10_][i_11_];
		Class23_Sub4_Sub12.anIntArrayArrayArray3080 = new int[i][i_10_ + 1][i_11_ + 1];
		Class47.method1143(false);
		Class105.anInt1802 = i_10_;
		client.anInt1974 = i_11_;
		Class92.anIntArrayArrayArray1573 = new int[i][i_10_ + 1][i_11_ + 1];
		Class23_Sub13_Sub1.method603();
		Class23_Sub4_Sub15.anInt3138 = i_12_;
		Class94.aBooleanArrayArray1608 = new boolean[Class23_Sub4_Sub15.anInt3138 + Class23_Sub4_Sub15.anInt3138 + 1][Class23_Sub4_Sub15.anInt3138 + Class23_Sub4_Sub15.anInt3138 + 1];
		oa.aBooleanArrayArray1263 = new boolean[Class23_Sub4_Sub15.anInt3138 + Class23_Sub4_Sub15.anInt3138 + 2][Class23_Sub4_Sub15.anInt3138 + Class23_Sub4_Sub15.anInt3138 + 2];
	}
	
	public static void method781(byte b) {
		anIntArray4049 = null;
		aClass16_4039 = null;
		aClass16_4041 = null;
		aClass16_4047 = null;
		aClass16_4048 = null;
		if (b <= -9) {
			aClass16_4046 = null;
		}
	}
	
	static final int method782(int i, int i_13_) {
		i_13_ = i_13_ * (i & 0x7f) >> 7;
		if (i_13_ < 2) {
			i_13_ = 2;
		} else if (i_13_ > 126) {
			i_13_ = 126;
		}
		return (i & 0xff80) + i_13_;
	}
	
	final boolean method783(int i, int i_14_) {
		if (i_14_ != 1) {
			aClass15Array4042 = null;
		}
		anInt4040++;
		return aClass15Array4042[i].aBoolean294;
	}
	
	static final void method784(Class105 class105, int i) {
		Class75.aClass105_1380 = class105;
		anInt4044++;
		if (i <= 71) {
			method780(8, 84, -21, 119);
		}
	}
	
	Class23_Sub13_Sub16(Class105 class105, Class105 class105_15_, int i, boolean bool) {
		Class89 class89 = new Class89();
		int i_16_ = class105.method1558(26143, i);
		aClass15Array4042 = new Class15[i_16_];
		int[] is = class105.method1537(i, false);
		for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_17_++) {
			byte[] bs = class105.method1544(is[i_17_], 0, i);
			Class23_Sub12 class23_sub12 = null;
			int i_18_ = (bs[0] & 0xff) << 8 | 0xff & bs[1];
			for (Class23_Sub12 class23_sub12_19_ = (Class23_Sub12) class89.method1437(115); class23_sub12_19_ != null; class23_sub12_19_ = (Class23_Sub12) class89.method1431((byte) -89)) {
				if ((class23_sub12_19_.anInt2297 ^ 0xffffffff) == (i_18_ ^ 0xffffffff)) {
					class23_sub12 = class23_sub12_19_;
					break;
				}
			}
			if (class23_sub12 == null) {
				byte[] bs_20_;
				if (bool) {
					bs_20_ = class105_15_.method1555(i_18_, 15059, 0);
				} else {
					bs_20_ = class105_15_.method1555(0, 15059, i_18_);
				}
				class23_sub12 = new Class23_Sub12(i_18_, bs_20_);
				class89.method1439(26, class23_sub12);
			}
			aClass15Array4042[is[i_17_]] = new Class15(bs, class23_sub12);
		}
	}
	
	static final void method785(int i, int i_21_, int i_22_, byte[][][] bs, int i_23_, byte b) {
		Class73.anInt1321++;
		Class11.anInt221 = 0;
		for (int i_24_ = Class23_Sub13_Sub20.anInt4172; i_24_ < Class23_Sub4_Sub18.anInt3196; i_24_++) {
			Class23_Sub1[][] class23_sub1s = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_24_];
			for (int i_25_ = Class23_Sub4_Sub37.anInt3493; i_25_ < Class23_Sub4_Sub7.anInt3004; i_25_++) {
				for (int i_26_ = Class23_Sub1.anInt2006; i_26_ < Class23_Sub24.anInt2448; i_26_++) {
					Class23_Sub1 class23_sub1 = class23_sub1s[i_25_][i_26_];
					if (class23_sub1 != null) {
						if (class23_sub1.anInt2032 > Class23_Sub4_Sub17.anInt3174 || !Class94.aBooleanArrayArray1608[i_25_ - Canvas_Sub1.anInt51 + Class23_Sub4_Sub15.anInt3138][i_26_ - Class23_Sub4_Sub33.anInt3425 + Class23_Sub4_Sub15.anInt3138] || bs != null && i_24_ >= i_23_ && bs[i_24_][i_25_][i_26_] == b) {
							class23_sub1.aBoolean2021 = false;
							class23_sub1.aBoolean2036 = false;
							class23_sub1.anInt2015 = 0;
						} else {
							class23_sub1.aBoolean2021 = true;
							class23_sub1.aBoolean2036 = true;
							if (class23_sub1.anInt2029 > 0) {
								class23_sub1.aBoolean2033 = true;
							} else {
								class23_sub1.aBoolean2033 = false;
							}
							Class11.anInt221++;
						}
					}
				}
			}
		}
		for (int i_27_ = Class23_Sub13_Sub20.anInt4172; i_27_ < Class23_Sub4_Sub18.anInt3196; i_27_++) {
			Class23_Sub1[][] class23_sub1s = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_27_];
			for (int i_28_ = -Class23_Sub4_Sub15.anInt3138; i_28_ <= 0; i_28_++) {
				int i_29_ = Canvas_Sub1.anInt51 + i_28_;
				int i_30_ = Canvas_Sub1.anInt51 - i_28_;
				if (i_29_ >= Class23_Sub4_Sub37.anInt3493 || i_30_ < Class23_Sub4_Sub7.anInt3004) {
					for (int i_31_ = -Class23_Sub4_Sub15.anInt3138; i_31_ <= 0; i_31_++) {
						int i_32_ = Class23_Sub4_Sub33.anInt3425 + i_31_;
						int i_33_ = Class23_Sub4_Sub33.anInt3425 - i_31_;
						if (i_29_ >= Class23_Sub4_Sub37.anInt3493) {
							if (i_32_ >= Class23_Sub1.anInt2006) {
								Class23_Sub1 class23_sub1 = class23_sub1s[i_29_][i_32_];
								if (class23_sub1 != null && class23_sub1.aBoolean2021) {
									Class8.method96(class23_sub1, true);
								}
							}
							if (i_33_ < Class23_Sub24.anInt2448) {
								Class23_Sub1 class23_sub1 = class23_sub1s[i_29_][i_33_];
								if (class23_sub1 != null && class23_sub1.aBoolean2021) {
									Class8.method96(class23_sub1, true);
								}
							}
						}
						if (i_30_ < Class23_Sub4_Sub7.anInt3004) {
							if (i_32_ >= Class23_Sub1.anInt2006) {
								Class23_Sub1 class23_sub1 = class23_sub1s[i_30_][i_32_];
								if (class23_sub1 != null && class23_sub1.aBoolean2021) {
									Class8.method96(class23_sub1, true);
								}
							}
							if (i_33_ < Class23_Sub24.anInt2448) {
								Class23_Sub1 class23_sub1 = class23_sub1s[i_30_][i_33_];
								if (class23_sub1 != null && class23_sub1.aBoolean2021) {
									Class8.method96(class23_sub1, true);
								}
							}
						}
						if (Class11.anInt221 == 0) {
							Class23_Sub13_Sub9.aBoolean3858 = false;
							return;
						}
					}
				}
			}
		}
		for (int i_34_ = Class23_Sub13_Sub20.anInt4172; i_34_ < Class23_Sub4_Sub18.anInt3196; i_34_++) {
			Class23_Sub1[][] class23_sub1s = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_34_];
			for (int i_35_ = -Class23_Sub4_Sub15.anInt3138; i_35_ <= 0; i_35_++) {
				int i_36_ = Canvas_Sub1.anInt51 + i_35_;
				int i_37_ = Canvas_Sub1.anInt51 - i_35_;
				if (i_36_ >= Class23_Sub4_Sub37.anInt3493 || i_37_ < Class23_Sub4_Sub7.anInt3004) {
					for (int i_38_ = -Class23_Sub4_Sub15.anInt3138; i_38_ <= 0; i_38_++) {
						int i_39_ = Class23_Sub4_Sub33.anInt3425 + i_38_;
						int i_40_ = Class23_Sub4_Sub33.anInt3425 - i_38_;
						if (i_36_ >= Class23_Sub4_Sub37.anInt3493) {
							if (i_39_ >= Class23_Sub1.anInt2006) {
								Class23_Sub1 class23_sub1 = class23_sub1s[i_36_][i_39_];
								if (class23_sub1 != null && class23_sub1.aBoolean2021) {
									Class8.method96(class23_sub1, false);
								}
							}
							if (i_40_ < Class23_Sub24.anInt2448) {
								Class23_Sub1 class23_sub1 = class23_sub1s[i_36_][i_40_];
								if (class23_sub1 != null && class23_sub1.aBoolean2021) {
									Class8.method96(class23_sub1, false);
								}
							}
						}
						if (i_37_ < Class23_Sub4_Sub7.anInt3004) {
							if (i_39_ >= Class23_Sub1.anInt2006) {
								Class23_Sub1 class23_sub1 = class23_sub1s[i_37_][i_39_];
								if (class23_sub1 != null && class23_sub1.aBoolean2021) {
									Class8.method96(class23_sub1, false);
								}
							}
							if (i_40_ < Class23_Sub24.anInt2448) {
								Class23_Sub1 class23_sub1 = class23_sub1s[i_37_][i_40_];
								if (class23_sub1 != null && class23_sub1.aBoolean2021) {
									Class8.method96(class23_sub1, false);
								}
							}
						}
						if (Class11.anInt221 == 0) {
							Class23_Sub13_Sub9.aBoolean3858 = false;
							return;
						}
					}
				}
			}
		}
		Class23_Sub13_Sub9.aBoolean3858 = false;
	}
	
	static {
		aClass16_4039 = aClass16_4046;
		aClass16_4047 = Class38_Sub6.method1076((byte) 86, "Das ist eine Mitglieder)2Welt(Q");
		aBoolean4043 = false;
	}
}

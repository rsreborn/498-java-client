/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class47
{
	protected int anInt720;
	static RSString aClass16_721 = Class38_Sub6.method1076((byte) 86, "Spieler kann nicht gefunden werden: ");
	static oa anOa722;
	static RSString aClass16_723;
	protected int anInt724;
	protected int anInt725;
	static int anInt726;
	static int anInt727;
	protected int anInt728;
	protected byte[] aByteArray729;
	protected int anInt730;
	protected byte[] aByteArray731;
	protected int anInt732;
	static int anInt733;
	private static RSString aClass16_734 = Class38_Sub6.method1076((byte) 86, "Loaded input handler");
	static int anInt735;
	protected int anInt736;
	static byte[][][] aByteArrayArrayArray737;
	static long[] aLongArray738;
	static int[] anIntArray739;
	static int anInt740;
	static int anInt741;
	static RSString aClass16_742;
	
	static final int method1142(Class64 class64, int i) {
		anInt735++;
		if (i <= 47) {
			return 120;
		}
		Class23_Sub20 class23_sub20 = (Class23_Sub20) anOa722.a((byte) 121, (long) class64.anInt1005 + ((long) class64.anInt1098 << 32));
		if (class23_sub20 != null) {
			return class23_sub20.anInt2394;
		}
		return class64.anInt1055;
	}
	
	static final void method1143(boolean bool) {
		if (bool) {
			Class17.anIntArrayArrayArray301 = Class23_Sub4_Sub35.anIntArrayArrayArray3461;
			Class23_Sub24.aClass23_Sub1ArrayArrayArray2442 = Class59.aClass23_Sub1ArrayArrayArray912;
		} else {
			Class17.anIntArrayArrayArray301 = Class23_Sub4_Sub12.anIntArrayArrayArray3080;
			Class23_Sub24.aClass23_Sub1ArrayArrayArray2442 = Class23_Sub13_Sub18.aClass23_Sub1ArrayArrayArray4088;
		}
		Class23_Sub4_Sub18.anInt3196 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442.length;
	}
	
	static final void method1144(int i, int i_0_, int i_1_, int i_2_, Class64[] class64s, int i_3_, int i_4_, int i_5_, int i_6_) {
		anInt733++;
		if (i_5_ >= 69) {
			for (int i_7_ = 0; class64s.length > i_7_; i_7_++) {
				Class64 class64 = class64s[i_7_];
				if (class64 != null && (!class64.aBoolean1017 || class64.anInt1003 == 0 || class64.aBoolean1084 || (method1142(class64, 88) ^ 0xffffffff) != -1 || class64 == Class64.aClass64_1102 || class64.anInt1149 == 1338) && (class64.anInt1056 ^ 0xffffffff) == (i ^ 0xffffffff) && (!class64.aBoolean1017 || !Class10.method109(true, class64))) {
					int i_8_ = i_6_ + class64.anInt1120;
					int i_9_ = i_0_ + class64.anInt1126;
					int i_10_;
					int i_11_;
					int i_12_;
					int i_13_;
					if (class64.anInt1003 != 2) {
						i_11_ = i_4_ >= i_9_ ? i_4_ : i_9_;
						i_10_ = (i_2_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff) ? i_8_ : i_2_;
						int i_14_ = class64.anInt1128 + i_8_;
						int i_15_ = i_9_ + class64.anInt999;
						if (class64.anInt1003 == 9) {
							i_15_++;
							i_14_++;
						}
						i_13_ = i_3_ <= i_15_ ? i_3_ : i_15_;
						i_12_ = i_14_ < i_1_ ? i_14_ : i_1_;
					} else {
						i_10_ = i_2_;
						i_11_ = i_4_;
						i_12_ = i_1_;
						i_13_ = i_3_;
					}
					if (Class23_Sub4_Sub8.aClass64_3028 == class64) {
						Class23_Sub4_Sub7.anInt3027 = i_8_;
						Class23_Sub4_Sub39.aBoolean3516 = true;
						Class102.anInt1712 = i_9_;
					}
					if (!class64.aBoolean1017 || i_12_ > i_10_ && (i_11_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff)) {
						if (class64.anInt1003 == 0) {
							if (!class64.aBoolean1017 && Class10.method109(true, class64) && Class42.aClass64_663 != class64) {
								continue;
							}
							if (class64.aBoolean1150 && i_10_ <= Class23_Sub4_Sub14.anInt3126 && (i_11_ ^ 0xffffffff) >= (Class102.anInt1701 ^ 0xffffffff) && (i_12_ ^ 0xffffffff) < (Class23_Sub4_Sub14.anInt3126 ^ 0xffffffff) && Class102.anInt1701 < i_13_) {
								for (Class23_Sub9 class23_sub9 = (Class23_Sub9) Class71_Sub2_Sub1.aClass89_4470.method1437(-116); class23_sub9 != null; class23_sub9 = (Class23_Sub9) Class71_Sub2_Sub1.aClass89_4470.method1431((byte) -89)) {
									if (class23_sub9.aBoolean2262) {
										class23_sub9.method228(0);
									}
								}
								for (Class23_Sub9 class23_sub9 = (Class23_Sub9) Class17_Sub1.aClass89_1999.method1437(79); class23_sub9 != null; class23_sub9 = (Class23_Sub9) Class17_Sub1.aClass89_1999.method1431((byte) -89)) {
									if (class23_sub9.aBoolean2262) {
										class23_sub9.method228(0);
									}
								}
								if ((Class17.anInt304 ^ 0xffffffff) == -1) {
									Class23_Sub4_Sub8.aClass64_3028 = null;
									Class64.aClass64_1102 = null;
								}
								Class23_Sub13_Sub6.aBoolean3736 = false;
							}
						}
						if (class64.aBoolean1017) {
							boolean bool = false;
							boolean bool_16_ = false;
							boolean bool_17_;
							if ((Class23_Sub4_Sub14.anInt3126 ^ 0xffffffff) <= (i_10_ ^ 0xffffffff) && Class102.anInt1701 >= i_11_ && i_12_ > Class23_Sub4_Sub14.anInt3126 && i_13_ > Class102.anInt1701) {
								bool_17_ = true;
							} else {
								bool_17_ = false;
							}
							if (Class23_Sub13_Sub9.anInt3860 == 1 && (Class90.anInt1538 ^ 0xffffffff) <= (i_10_ ^ 0xffffffff) && (i_11_ ^ 0xffffffff) >= (Class23_Sub13_Sub19.anInt4136 ^ 0xffffffff) && i_12_ > Class90.anInt1538 && Class23_Sub13_Sub19.anInt4136 < i_13_) {
								bool = true;
							}
							if (Class8.anInt175 == 1 && bool_17_) {
								bool_16_ = true;
							}
							if (bool) {
								Class23_Sub4_Sub1.method273(class64, (byte) -102, -i_9_ + Class23_Sub13_Sub19.anInt4136, -i_8_ + Class90.anInt1538);
							}
							if (Class23_Sub4_Sub8.aClass64_3028 != null && class64 != Class23_Sub4_Sub8.aClass64_3028 && bool_17_ && Class45.method1137(method1142(class64, 57), true)) {
								Class23_Sub13_Sub19.aClass64_4132 = class64;
							}
							if (class64 == Class64.aClass64_1102) {
								Class64.anInt1082 = i_9_;
								Class72.aBoolean1310 = true;
								Class48.anInt751 = i_8_;
							}
							if (class64.aBoolean1084 || (class64.anInt1149 ^ 0xffffffff) != -1) {
								if (bool_17_ && Class48.anInt749 != 0 && class64.anObjectArray1040 != null) {
									Class23_Sub9 class23_sub9 = new Class23_Sub9();
									class23_sub9.anObjectArray2274 = class64.anObjectArray1040;
									class23_sub9.anInt2258 = Class48.anInt749;
									class23_sub9.aClass64_2263 = class64;
									class23_sub9.aBoolean2262 = true;
									Class71_Sub2_Sub1.aClass89_4470.method1439(59, class23_sub9);
								}
								if (Class23_Sub4_Sub8.aClass64_3028 != null || Class51.aClass64_790 != null || Class53.aBoolean840 || class64.anInt1149 != 1400 && Class23_Sub13_Sub6.aBoolean3736) {
									bool_16_ = false;
									bool_17_ = false;
									bool = false;
								}
								if (class64.anInt1149 == 1337) {
									Class91.method1450((byte) 29, class64);
									continue;
								}
								if (class64.anInt1149 == 1338) {
									if (bool) {
										Class23_Sub4_Sub23_Sub1.method367(Class23_Sub13_Sub19.anInt4136 + -i_9_, Class90.anInt1538 + -i_8_, -96, class64);
									}
									continue;
								}
								if (class64.anInt1149 == 1400) {
									Class23_Sub13_Sub12.aClass64_3967 = class64;
									if (bool) {
										if (Class23_Sub13_Sub8_Sub1.aBooleanArray4492[82] && Class23_Sub4_Sub17.anInt3173 > 0) {
											int i_18_ = Canvas_Sub1.anInt55 + ((int) (2.0 * (double) (-(class64.anInt1128 / 2) + Class90.anInt1538 + -i_8_) / Class107.aDouble1838) + Class102.anInt1702);
											int i_19_ = -Class8.anInt179 + -(int) (2.0 * (double) (Class23_Sub13_Sub19.anInt4136 - i_9_ + -(class64.anInt999 / 2)) / Class107.aDouble1838) + (Class29.anInt445 - -Class38_Sub7.anInt2697);
											RSString class16 = Class23_Sub4_Sub14.method322(new RSString[] { Class54.aClass16_856, Class23_Sub4_Sub23.method360((byte) -9, i_18_ >> 6), Class97.aClass16_1636, Class23_Sub4_Sub23.method360((byte) -9, i_19_ >> 6), Class97.aClass16_1636, Class23_Sub4_Sub23.method360((byte) -9, 0x3f & i_18_), Class97.aClass16_1636, Class23_Sub4_Sub23.method360((byte) -9, 0x3f & i_19_) }, -32);
											class16.method158(-118);
											Class53.method1173(-91, class16);
											Buffer.method444(-7602);
										} else {
											Class23_Sub13_Sub6.aBoolean3736 = true;
											Class23_Sub4_Sub10.anInt3059 = Class23_Sub4_Sub14.anInt3126;
											Class23_Sub13_Sub15.anInt4034 = Class102.anInt1701;
											Class58.anInt905 = Class8.anInt179;
											Class79.anInt1876 = Canvas_Sub1.anInt55;
										}
									} else if (bool_16_ && Class23_Sub13_Sub6.aBoolean3736) {
										Class32.method964(128, (int) (2.0 * (double) (-Class23_Sub4_Sub14.anInt3126 + Class23_Sub4_Sub10.anInt3059) / Class23_Sub4_Sub4.aDouble2969) + Class79.anInt1876);
										Class23_Sub4_Sub33.method408((byte) -98, (int) (2.0 * (double) (Class23_Sub13_Sub15.anInt4034 + -Class102.anInt1701) / Class23_Sub4_Sub4.aDouble2969) + Class58.anInt905);
									} else {
										Class23_Sub13_Sub6.aBoolean3736 = false;
									}
									continue;
								}
								if (class64.anInt1149 == 1401) {
									if (bool_16_) {
										Class38_Sub7.method1088(-i_9_ + Class102.anInt1701, class64.anInt999, -i_8_ + Class23_Sub4_Sub14.anInt3126, class64.anInt1128, 4096);
									}
									continue;
								}
								if (!class64.aBoolean1047 && bool) {
									class64.aBoolean1047 = true;
									if (class64.anObjectArray1008 != null) {
										Class23_Sub9 class23_sub9 = new Class23_Sub9();
										class23_sub9.anInt2264 = Class90.anInt1538 - i_8_;
										class23_sub9.anObjectArray2274 = class64.anObjectArray1008;
										class23_sub9.aBoolean2262 = true;
										class23_sub9.anInt2258 = Class23_Sub13_Sub19.anInt4136 - i_9_;
										class23_sub9.aClass64_2263 = class64;
										Class71_Sub2_Sub1.aClass89_4470.method1439(36, class23_sub9);
									}
								}
								if (class64.aBoolean1047 && bool_16_ && class64.anObjectArray1093 != null) {
									Class23_Sub9 class23_sub9 = new Class23_Sub9();
									class23_sub9.aClass64_2263 = class64;
									class23_sub9.anInt2264 = Class23_Sub4_Sub14.anInt3126 + -i_8_;
									class23_sub9.anObjectArray2274 = class64.anObjectArray1093;
									class23_sub9.anInt2258 = Class102.anInt1701 + -i_9_;
									class23_sub9.aBoolean2262 = true;
									Class71_Sub2_Sub1.aClass89_4470.method1439(126, class23_sub9);
								}
								if (class64.aBoolean1047 && !bool_16_) {
									class64.aBoolean1047 = false;
									if (class64.anObjectArray1023 != null) {
										Class23_Sub9 class23_sub9 = new Class23_Sub9();
										class23_sub9.anObjectArray2274 = class64.anObjectArray1023;
										class23_sub9.aBoolean2262 = true;
										class23_sub9.anInt2258 = Class102.anInt1701 - i_9_;
										class23_sub9.aClass64_2263 = class64;
										class23_sub9.anInt2264 = -i_8_ + Class23_Sub4_Sub14.anInt3126;
										Class17_Sub1.aClass89_1999.method1439(103, class23_sub9);
									}
								}
								if (bool_16_ && class64.anObjectArray1022 != null) {
									Class23_Sub9 class23_sub9 = new Class23_Sub9();
									class23_sub9.anObjectArray2274 = class64.anObjectArray1022;
									class23_sub9.aBoolean2262 = true;
									class23_sub9.anInt2258 = -i_9_ + Class102.anInt1701;
									class23_sub9.aClass64_2263 = class64;
									class23_sub9.anInt2264 = -i_8_ + Class23_Sub4_Sub14.anInt3126;
									Class71_Sub2_Sub1.aClass89_4470.method1439(-123, class23_sub9);
								}
								if (!class64.aBoolean1125 && bool_17_) {
									class64.aBoolean1125 = true;
									if (class64.anObjectArray1036 != null) {
										Class23_Sub9 class23_sub9 = new Class23_Sub9();
										class23_sub9.anInt2264 = -i_8_ + Class23_Sub4_Sub14.anInt3126;
										class23_sub9.anInt2258 = -i_9_ + Class102.anInt1701;
										class23_sub9.anObjectArray2274 = class64.anObjectArray1036;
										class23_sub9.aBoolean2262 = true;
										class23_sub9.aClass64_2263 = class64;
										Class71_Sub2_Sub1.aClass89_4470.method1439(-98, class23_sub9);
									}
								}
								if (class64.aBoolean1125 && bool_17_ && class64.anObjectArray1001 != null) {
									Class23_Sub9 class23_sub9 = new Class23_Sub9();
									class23_sub9.anObjectArray2274 = class64.anObjectArray1001;
									class23_sub9.anInt2258 = Class102.anInt1701 + -i_9_;
									class23_sub9.anInt2264 = Class23_Sub4_Sub14.anInt3126 - i_8_;
									class23_sub9.aClass64_2263 = class64;
									class23_sub9.aBoolean2262 = true;
									Class71_Sub2_Sub1.aClass89_4470.method1439(-125, class23_sub9);
								}
								if (class64.aBoolean1125 && !bool_17_) {
									class64.aBoolean1125 = false;
									if (class64.anObjectArray1073 != null) {
										Class23_Sub9 class23_sub9 = new Class23_Sub9();
										class23_sub9.anObjectArray2274 = class64.anObjectArray1073;
										class23_sub9.anInt2258 = -i_9_ + Class102.anInt1701;
										class23_sub9.anInt2264 = Class23_Sub4_Sub14.anInt3126 - i_8_;
										class23_sub9.aClass64_2263 = class64;
										class23_sub9.aBoolean2262 = true;
										Class17_Sub1.aClass89_1999.method1439(-112, class23_sub9);
									}
								}
								if (class64.anObjectArray997 != null) {
									Class23_Sub9 class23_sub9 = new Class23_Sub9();
									class23_sub9.aClass64_2263 = class64;
									class23_sub9.anObjectArray2274 = class64.anObjectArray997;
									Class10.aClass89_206.method1439(34, class23_sub9);
								}
								if (class64.anObjectArray1049 != null && (class64.anInt1039 ^ 0xffffffff) > (Class71.anInt1279 ^ 0xffffffff)) {
									if (class64.anIntArray1140 != null && Class71.anInt1279 - class64.anInt1039 <= 32) {
									while_54_:
										for (int i_20_ = class64.anInt1039; (i_20_ ^ 0xffffffff) > (Class71.anInt1279 ^ 0xffffffff); i_20_++) {
											int i_21_ = Class50.anIntArray780[i_20_ & 0x1f];
											for (int i_22_ = 0; (class64.anIntArray1140.length ^ 0xffffffff) < (i_22_ ^ 0xffffffff); i_22_++) {
												if (class64.anIntArray1140[i_22_] == i_21_) {
													Class23_Sub9 class23_sub9 = new Class23_Sub9();
													class23_sub9.aClass64_2263 = class64;
													class23_sub9.anObjectArray2274 = class64.anObjectArray1049;
													Class71_Sub2_Sub1.aClass89_4470.method1439(-97, class23_sub9);
													break while_54_;
												}
											}
										}
									} else {
										Class23_Sub9 class23_sub9 = new Class23_Sub9();
										class23_sub9.anObjectArray2274 = class64.anObjectArray1049;
										class23_sub9.aClass64_2263 = class64;
										Class71_Sub2_Sub1.aClass89_4470.method1439(-99, class23_sub9);
									}
									class64.anInt1039 = Class71.anInt1279;
								}
								if (class64.anObjectArray1035 != null && Class65.anInt1159 > class64.anInt1067) {
									if (class64.anIntArray1101 == null || -class64.anInt1067 + Class65.anInt1159 > 32) {
										Class23_Sub9 class23_sub9 = new Class23_Sub9();
										class23_sub9.anObjectArray2274 = class64.anObjectArray1035;
										class23_sub9.aClass64_2263 = class64;
										Class71_Sub2_Sub1.aClass89_4470.method1439(-102, class23_sub9);
									} else {
									while_55_:
										for (int i_23_ = class64.anInt1067; (Class65.anInt1159 ^ 0xffffffff) < (i_23_ ^ 0xffffffff); i_23_++) {
											int i_24_ = Class82.anIntArray1454[i_23_ & 0x1f];
											for (int i_25_ = 0; (class64.anIntArray1101.length ^ 0xffffffff) < (i_25_ ^ 0xffffffff); i_25_++) {
												if (class64.anIntArray1101[i_25_] == i_24_) {
													Class23_Sub9 class23_sub9 = new Class23_Sub9();
													class23_sub9.aClass64_2263 = class64;
													class23_sub9.anObjectArray2274 = class64.anObjectArray1035;
													Class71_Sub2_Sub1.aClass89_4470.method1439(88, class23_sub9);
													break while_55_;
												}
											}
										}
									}
									class64.anInt1067 = Class65.anInt1159;
								}
								if (class64.anObjectArray1032 != null && class64.anInt1094 < Class89.anInt1524) {
									if (class64.anIntArray1117 == null || -class64.anInt1094 + Class89.anInt1524 > 32) {
										Class23_Sub9 class23_sub9 = new Class23_Sub9();
										class23_sub9.aClass64_2263 = class64;
										class23_sub9.anObjectArray2274 = class64.anObjectArray1032;
										Class71_Sub2_Sub1.aClass89_4470.method1439(-126, class23_sub9);
									} else {
									while_56_:
										for (int i_26_ = class64.anInt1094; i_26_ < Class89.anInt1524; i_26_++) {
											int i_27_ = Class79.anIntArray1886[0x1f & i_26_];
											for (int i_28_ = 0; i_28_ < class64.anIntArray1117.length; i_28_++) {
												if (class64.anIntArray1117[i_28_] == i_27_) {
													Class23_Sub9 class23_sub9 = new Class23_Sub9();
													class23_sub9.anObjectArray2274 = class64.anObjectArray1032;
													class23_sub9.aClass64_2263 = class64;
													Class71_Sub2_Sub1.aClass89_4470.method1439(-110, class23_sub9);
													break while_56_;
												}
											}
										}
									}
									class64.anInt1094 = Class89.anInt1524;
								}
								if ((class64.anInt1043 ^ 0xffffffff) > (Class23_Sub26.anInt2473 ^ 0xffffffff) && class64.anObjectArray1065 != null) {
									Class23_Sub9 class23_sub9 = new Class23_Sub9();
									class23_sub9.aClass64_2263 = class64;
									class23_sub9.anObjectArray2274 = class64.anObjectArray1065;
									Class71_Sub2_Sub1.aClass89_4470.method1439(41, class23_sub9);
								}
								if ((class64.anInt1043 ^ 0xffffffff) > (Class75.anInt1372 ^ 0xffffffff) && class64.anObjectArray1104 != null) {
									Class23_Sub9 class23_sub9 = new Class23_Sub9();
									class23_sub9.anObjectArray2274 = class64.anObjectArray1104;
									class23_sub9.aClass64_2263 = class64;
									Class71_Sub2_Sub1.aClass89_4470.method1439(-113, class23_sub9);
								}
								if (class64.anInt1043 < Class88.anInt1504 && class64.anObjectArray1137 != null) {
									Class23_Sub9 class23_sub9 = new Class23_Sub9();
									class23_sub9.aClass64_2263 = class64;
									class23_sub9.anObjectArray2274 = class64.anObjectArray1137;
									Class71_Sub2_Sub1.aClass89_4470.method1439(-97, class23_sub9);
								}
								if (Class39.anInt606 > class64.anInt1043 && class64.anObjectArray1092 != null) {
									Class23_Sub9 class23_sub9 = new Class23_Sub9();
									class23_sub9.anObjectArray2274 = class64.anObjectArray1092;
									class23_sub9.aClass64_2263 = class64;
									Class71_Sub2_Sub1.aClass89_4470.method1439(-116, class23_sub9);
								}
								if (class64.anInt1043 < Class88.anInt1499 && class64.anObjectArray1096 != null) {
									Class23_Sub9 class23_sub9 = new Class23_Sub9();
									class23_sub9.anObjectArray2274 = class64.anObjectArray1096;
									class23_sub9.aClass64_2263 = class64;
									Class71_Sub2_Sub1.aClass89_4470.method1439(104, class23_sub9);
								}
								class64.anInt1043 = Class23_Sub10_Sub2.anInt3589;
								if (class64.anObjectArray1052 != null) {
									for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > (Class38_Sub7.anInt2649 ^ 0xffffffff); i_29_++) {
										Class23_Sub9 class23_sub9 = new Class23_Sub9();
										class23_sub9.aClass64_2263 = class64;
										class23_sub9.anInt2261 = Class23_Sub9.anIntArray2265[i_29_];
										class23_sub9.anInt2266 = Class17.anIntArray308[i_29_];
										class23_sub9.anObjectArray2274 = class64.anObjectArray1052;
										Class71_Sub2_Sub1.aClass89_4470.method1439(74, class23_sub9);
									}
								}
							}
						}
						if (!class64.aBoolean1017 && Class23_Sub4_Sub8.aClass64_3028 == null && Class51.aClass64_790 == null && !Class53.aBoolean840) {
							if ((class64.anInt1027 >= 0 || (class64.anInt1106 ^ 0xffffffff) != -1) && (i_10_ ^ 0xffffffff) >= (Class23_Sub4_Sub14.anInt3126 ^ 0xffffffff) && (Class102.anInt1701 ^ 0xffffffff) <= (i_11_ ^ 0xffffffff) && Class23_Sub4_Sub14.anInt3126 < i_12_ && i_13_ > Class102.anInt1701) {
								if ((class64.anInt1027 ^ 0xffffffff) <= -1) {
									Class42.aClass64_663 = class64s[class64.anInt1027];
								} else {
									Class42.aClass64_663 = class64;
								}
							}
							if (class64.anInt1003 == 8 && Class23_Sub4_Sub14.anInt3126 >= i_10_ && (i_11_ ^ 0xffffffff) >= (Class102.anInt1701 ^ 0xffffffff) && (i_12_ ^ 0xffffffff) < (Class23_Sub4_Sub14.anInt3126 ^ 0xffffffff) && (Class102.anInt1701 ^ 0xffffffff) > (i_13_ ^ 0xffffffff)) {
								Class92.aClass64_1567 = class64;
							}
							if ((class64.anInt999 ^ 0xffffffff) > (class64.anInt1088 ^ 0xffffffff)) {
								Class87_Sub3.method1419(class64, false, i_8_ + class64.anInt1128, class64.anInt999, Class23_Sub4_Sub14.anInt3126, i_9_, Class102.anInt1701, class64.anInt1088);
							}
						}
						if ((class64.anInt1003 ^ 0xffffffff) == -1) {
							method1144(class64.anInt1098, i_9_ - class64.anInt1083, i_12_, i_10_, class64s, i_13_, i_11_, 120, -class64.anInt1009 + i_8_);
							if (class64.aClass64Array1131 != null) {
								method1144(class64.anInt1098, -class64.anInt1083 + i_9_, i_12_, i_10_, class64.aClass64Array1131, i_13_, i_11_, 99, -class64.anInt1009 + i_8_);
							}
							Class23_Sub25 class23_sub25 = (Class23_Sub25) Class36.anOa565.a((byte) -76, (long) class64.anInt1098);
							if (class23_sub25 != null) {
								Class23_Sub4_Sub9.method299(i_12_, class23_sub25.anInt2456, i_8_, 100, i_10_, i_11_, i_9_, i_13_);
							}
						}
					}
				}
			}
		}
	}
	
	static final void method1145(int i, int i_30_, int i_31_) {
		Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_30_][i_31_];
		if (class23_sub1 != null) {
			class23_sub1.aClass69_2034 = null;
		}
	}
	
	static final Class23_Sub13_Sub10 method1146(int i, Class105 class105, boolean bool, int i_32_) {
		anInt726++;
		if (bool != true) {
			method1144(-64, -35, 29, 64, null, 24, -92, 108, 25);
		}
		if (!Class23_Sub4_Sub29.method385(class105, 0, i, i_32_)) {
			return null;
		}
		return Class23_Sub13_Sub22.method833(0);
	}
	
	static final Class23_Sub13_Sub10 method1147(boolean bool, int i, int i_33_, boolean bool_34_, int i_35_, boolean bool_36_, int i_37_, boolean bool_38_) {
		anInt727++;
		ItemDefinition class23_sub13_sub11 = Class23_Sub13_Sub24.method853(121, i_33_);
		if (i_37_ > 1 && class23_sub13_sub11.anIntArray3898 != null) {
			int i_39_ = -1;
			for (int i_40_ = 0; i_40_ < 10; i_40_++) {
				if ((class23_sub13_sub11.anIntArray3936[i_40_] ^ 0xffffffff) >= (i_37_ ^ 0xffffffff) && class23_sub13_sub11.anIntArray3936[i_40_] != 0) {
					i_39_ = class23_sub13_sub11.anIntArray3898[i_40_];
				}
			}
			if ((i_39_ ^ 0xffffffff) != 0) {
				class23_sub13_sub11 = Class23_Sub13_Sub24.method853(120, i_39_);
			}
		}
		Class38_Sub1_Sub1 class38_sub1_sub1 = class23_sub13_sub11.method737((byte) -104);
		if (class38_sub1_sub1 == null) {
			return null;
		}
		Class23_Sub13_Sub10 class23_sub13_sub10 = null;
		if ((class23_sub13_sub11.anInt3955 ^ 0xffffffff) == 0) {
			if (class23_sub13_sub11.anInt3915 != -1) {
				class23_sub13_sub10 = method1147(false, i, class23_sub13_sub11.lendId, false, i_35_, false, i_37_, true);
				if (class23_sub13_sub10 == null) {
					return null;
				}
			}
		} else {
			class23_sub13_sub10 = method1147(false, 1, class23_sub13_sub11.anInt3961, true, 0, false, 10, true);
			if (class23_sub13_sub10 == null) {
				return null;
			}
		}
		int[] is = Class20.anIntArray328;
		int i_41_ = Class20.anInt331;
		int i_42_ = Class20.anInt329;
		int[] is_43_ = new int[4];
		Class20.method217(is_43_);
		Class23_Sub13_Sub10_Sub1 class23_sub13_sub10_sub1 = new Class23_Sub13_Sub10_Sub1(36, 32);
		Class20.method202(class23_sub13_sub10_sub1.anIntArray4502, 36, 32);
		Class76.method1318();
		Class76.method1317(16, 16);
		int i_44_ = class23_sub13_sub11.modelZoom;
		if (!bool_34_) {
			if (i == 2) {
				i_44_ = (int) (1.04 * (double) i_44_);
			}
		} else {
			i_44_ = (int) (1.5 * (double) i_44_);
		}
		Class76.aBoolean1396 = bool_36_;
		int i_45_ = Class76.anIntArray1386[class23_sub13_sub11.modelRotation1] * i_44_ >> 16;
		int i_46_ = i_44_ * Class76.anIntArray1395[class23_sub13_sub11.modelRotation1] >> 16;
		class38_sub1_sub1.method1018(0, class23_sub13_sub11.modelRotation2, class23_sub13_sub11.anInt3897, class23_sub13_sub11.modelRotation1, class23_sub13_sub11.anInt3922, -(class38_sub1_sub1.method999() / 2) + i_45_ + class23_sub13_sub11.anInt3899, i_46_ - -class23_sub13_sub11.anInt3899);
		if (i >= 1) {
			class23_sub13_sub10_sub1.method708(1);
		}
		if (i >= 2) {
			class23_sub13_sub10_sub1.method708(16777215);
		}
		if (i_35_ != 0) {
			class23_sub13_sub10_sub1.method724(i_35_);
		}
		if (class23_sub13_sub11.anInt3915 != -1) {
			Class23_Sub13_Sub10_Sub1 class23_sub13_sub10_sub1_47_ = new Class23_Sub13_Sub10_Sub1(36, 32);
			Class20.method202(class23_sub13_sub10_sub1_47_.anIntArray4502, 36, 32);
			class23_sub13_sub10.method694(0, 0);
			class23_sub13_sub10_sub1.method694(0, 0);
			class23_sub13_sub10_sub1 = class23_sub13_sub10_sub1_47_;
			Object object = null;
		}
		Class20.method202(class23_sub13_sub10_sub1.anIntArray4502, 36, 32);
		if ((class23_sub13_sub11.anInt3955 ^ 0xffffffff) != 0) {
			class23_sub13_sub10.method694(0, 0);
		}
		if (bool && (class23_sub13_sub11.anInt3895 == 1 || i_37_ != 1) && (i_37_ ^ 0xffffffff) != 0) {
			Class54.aClass23_Sub13_Sub8_Sub1_Sub1_852.method650(Class91.method1451(i_37_, -19978), 0, 9, 16776960, 1);
		}
		Class20.method202(is, i_42_, i_41_);
		Class20.method218(is_43_);
		Class76.method1318();
		Class76.aBoolean1396 = true;
		return class23_sub13_sub10_sub1;
	}
	
	public static void method1148(int i) {
		aClass16_721 = null;
		aClass16_723 = null;
		aClass16_742 = null;
		aByteArrayArrayArray737 = null;
		aLongArray738 = null;
		anIntArray739 = null;
		anOa722 = null;
		aClass16_734 = null;
		if (i >= -55) {
			anInt741 = 78;
		}
	}
	
	static {
		aClass16_723 = aClass16_734;
		anOa722 = new oa(512);
		aLongArray738 = new long[256];
		anInt740 = 0;
		anInt741 = 0;
		aClass16_742 = Class38_Sub6.method1076((byte) 86, ":trade:");
		for (int i = 0; i < 256; i++) {
			long l = (long) i;
			for (int i_48_ = 0; i_48_ < 8; i_48_++) {
				if ((0x1L & l ^ 0xffffffffffffffffL) != -2L) {
					l >>>= 1;
				} else {
					l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
				}
			}
			aLongArray738[i] = l;
		}
	}
}

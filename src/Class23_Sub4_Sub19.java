/* Class23_Sub4_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class23_Sub4_Sub19 extends Class23_Sub4
{
	private static RSString aClass16_3200 = Class38_Sub6.method1076((byte) 86, "Connection lost)3");
	static RSString aClass16_3201 = aClass16_3200;
	private int anInt3202 = 1024;
	static int anInt3203;
	static int anInt3204;
	static int anInt3205;
	static int anInt3206;
	private int[] anIntArray3207;
	private int anInt3208;
	private int anInt3209;
	private int anInt3210 = 409;
	static int anInt3211;
	static int anInt3212;
	private int anInt3213;
	static int anInt3214;
	private int anInt3215;
	private int anInt3216;
	private int[][] anIntArrayArray3217;
	private int anInt3218;
	static RSString aClass16_3219;
	static RSString aClass16_3220 = Class38_Sub6.method1076((byte) 86, "und die Schaltfl-=che (WSpielkonto erstellen(W am");
	private int anInt3221;
	private int[][] anIntArrayArray3222;
	private int anInt3223;
	static int[] anIntArray3224;
	static int anInt3225;
	private int anInt3226;
	static int anInt3227;
	
	final int[] method260(int i, int i_0_) {
		if (i != 0) {
			anInt3202 = -28;
		}
		int[] is = aClass99_2115.method1500(i_0_, (byte) -114);
		anInt3227++;
		if (aClass99_2115.aBoolean1681) {
			int i_1_ = 0;
			int i_2_;
			for (i_2_ = Class23_Sub13_Sub16.anIntArray4049[i_0_] + anInt3218; (i_2_ ^ 0xffffffff) > -1; i_2_ += 4096) {
				/* empty */
			}
			for (/**/; i_2_ > 4096; i_2_ -= 4096) {
				/* empty */
			}
			for (/**/; (anInt3216 ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
				if (anIntArray3207[i_1_] > i_2_) {
					break;
				}
			}
			int i_3_ = -1 + i_1_;
			int i_4_ = anIntArray3207[i_1_];
			boolean bool = (i_1_ & 0x1) == 0;
			int i_5_ = anIntArray3207[-1 + i_1_];
			if ((i_2_ ^ 0xffffffff) < (anInt3221 + i_5_ ^ 0xffffffff) && i_2_ < i_4_ + -anInt3221) {
				for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_6_++) {
					int i_7_ = 0;
					int i_8_ = bool ? anInt3226 : -anInt3226;
					int i_9_;
					for (i_9_ = Class61.anIntArray967[i_6_] - -(anInt3215 * i_8_ >> 12); i_9_ < 0; i_9_ += 4096) {
						/* empty */
					}
					for (/**/; i_9_ > 4096; i_9_ -= 4096) {
						/* empty */
					}
					for (/**/; i_7_ < anInt3213; i_7_++) {
						if ((i_9_ ^ 0xffffffff) > (anIntArrayArray3222[i_3_][i_7_] ^ 0xffffffff)) {
							break;
						}
					}
					int i_10_ = anIntArrayArray3222[i_3_][i_7_];
					int i_11_ = i_7_ - 1;
					int i_12_ = anIntArrayArray3222[i_3_][i_11_];
					if ((i_9_ ^ 0xffffffff) < (anInt3221 + i_12_ ^ 0xffffffff) && (i_10_ + -anInt3221 ^ 0xffffffff) < (i_9_ ^ 0xffffffff)) {
						is[i_6_] = anIntArrayArray3217[i_3_][i_11_];
					} else {
						is[i_6_] = 0;
					}
				}
			} else {
				Class3.method53(is, 0, Class23_Sub4_Sub33.anInt3428, 0);
			}
		}
		return is;
	}
	
	static final void method341(int i, int i_13_, int i_14_, boolean bool, int i_15_, Class105 class105, int i_16_) {
		Class59.anInt931 = i_14_;
		if (i_13_ == 13910) {
			Class23_Sub9.anInt2257 = i_16_;
			Class23_Sub13_Sub5.anInt3720 = i_15_;
			Class87_Sub4.anInt2837 = i;
			Class46.anInt708 = 1;
			Class87.aClass105_1496 = class105;
			Class23_Sub4_Sub7.aBoolean3018 = bool;
			anInt3212++;
		}
	}
	
	static final void method342(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_) {
		anInt3203++;
		if ((i_21_ ^ 0xffffffff) != (Class23_Sub4_Sub23.anInt3279 ^ 0xffffffff) || Class64.anInt1138 != i_20_ || Class23_Sub4_Sub7.anInt3025 != i && Class7.aBoolean170) {
			Class64.anInt1138 = i_20_;
			Class23_Sub4_Sub23.anInt3279 = i_21_;
			Class23_Sub4_Sub7.anInt3025 = i;
			if (i_18_ != 31362) {
				aClass16_3219 = null;
			}
			if (!Class7.aBoolean170) {
				Class23_Sub4_Sub7.anInt3025 = 0;
			}
			Class103.method1521(25, 27172);
			Class23_Sub4_Sub29.method386(Class64.aClass16_1139, true, false);
			int i_22_ = Class42.anInt662;
			int i_23_ = Class58.anInt903;
			Class58.anInt903 = 8 * i_20_ - 48;
			int i_24_ = Class58.anInt903 + -i_23_;
			i_23_ = Class58.anInt903;
			Class42.anInt662 = -48 + i_21_ * 8;
			int i_25_ = Class42.anInt662 + -i_22_;
			i_22_ = Class42.anInt662;
			for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > -32769; i_26_++) {
				Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[i_26_];
				if (class38_sub7_sub1 != null) {
					for (int i_27_ = 0; i_27_ < 10; i_27_++) {
						class38_sub7_sub1.anIntArray2663[i_27_] -= i_25_;
						class38_sub7_sub1.anIntArray2694[i_27_] -= i_24_;
					}
					class38_sub7_sub1.anInt2659 -= 128 * i_24_;
					class38_sub7_sub1.anInt2674 -= i_25_ * 128;
				}
			}
			for (int i_28_ = 0; i_28_ < 2048; i_28_++) {
				Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_28_];
				if (class38_sub7_sub2 != null) {
					for (int i_29_ = 0; i_29_ < 10; i_29_++) {
						class38_sub7_sub2.anIntArray2663[i_29_] -= i_25_;
						class38_sub7_sub2.anIntArray2694[i_29_] -= i_24_;
					}
					class38_sub7_sub2.anInt2674 -= i_25_ * 128;
					class38_sub7_sub2.anInt2659 -= 128 * i_24_;
				}
			}
			Class23_Sub13_Sub11.anInt3916 = i;
			int i_30_ = 0;
			int i_31_ = 104;
			Class105.aClass38_Sub7_Sub2_1812.method1085(i_17_, (byte) -122, false, i_19_);
			int i_32_ = 1;
			if (i_25_ < 0) {
				i_31_ = -1;
				i_30_ = 103;
				i_32_ = -1;
			}
			int i_33_ = 104;
			int i_34_ = 1;
			int i_35_ = 0;
			if ((i_24_ ^ 0xffffffff) > -1) {
				i_34_ = -1;
				i_35_ = 103;
				i_33_ = -1;
			}
			for (int i_36_ = i_30_; i_36_ != i_31_; i_36_ += i_32_) {
				for (int i_37_ = i_35_; i_37_ != i_33_; i_37_ += i_34_) {
					int i_38_ = i_36_ + i_25_;
					int i_39_ = i_24_ + i_37_;
					for (int i_40_ = 0; i_40_ < 4; i_40_++) {
						if (i_38_ >= 0 && i_39_ >= 0 && i_38_ < 104 && i_39_ < 104) {
							Class82.aClass89ArrayArrayArray1453[i_40_][i_36_][i_37_] = Class82.aClass89ArrayArrayArray1453[i_40_][i_38_][i_39_];
						} else {
							Class82.aClass89ArrayArrayArray1453[i_40_][i_36_][i_37_] = null;
						}
					}
				}
			}
			for (Class23_Sub23 class23_sub23 = (Class23_Sub23) Class8.aClass89_178.method1437(36); class23_sub23 != null; class23_sub23 = (Class23_Sub23) Class8.aClass89_178.method1431((byte) -89)) {
				class23_sub23.anInt2433 -= i_24_;
				class23_sub23.anInt2430 -= i_25_;
				if ((class23_sub23.anInt2430 ^ 0xffffffff) > -1 || class23_sub23.anInt2433 < 0 || class23_sub23.anInt2430 >= 104 || class23_sub23.anInt2433 >= 104) {
					class23_sub23.method228(0);
				}
			}
			Buffer.aBoolean2159 = false;
			Class71_Sub3.anInt2741 = 0;
			if (Class23_Sub13_Sub17.anInt4077 != 0) {
				Class23_Sub13_Sub18.anInt4078 -= i_24_;
				Class23_Sub13_Sub17.anInt4077 -= i_25_;
			}
			Class63.anInt994 = -1;
			Class23_Sub13_Sub17.aClass89_4066.method1435(i_18_ ^ 0x7acc);
			Class36.aClass89_562.method1435(36);
		}
	}
	
	final void method265(int i) {
		if (i != -21746) {
			method260(40, 69);
		}
		method344((byte) -102);
		anInt3225++;
	}
	
	final void method255(Buffer class23_sub5, int i, int i_41_) {
		anInt3211++;
		int i_42_ = i;
	while_53_:
		do {
		while_52_:
			do {
			while_51_:
				do {
				while_50_:
					do {
					while_49_:
						do {
						while_48_:
							do {
								do {
									if ((i_42_ ^ 0xffffffff) != -1) {
										if (i_42_ != 1) {
											if (i_42_ != 2) {
												if (i_42_ != 3) {
													if (i_42_ != 4) {
														if (i_42_ != 5) {
															if (i_42_ != 6) {
																if (i_42_ != 7) {
																	break while_53_;
																}
															} else {
																break while_51_;
															}
															break while_52_;
														}
													} else {
														break while_49_;
													}
													break while_50_;
												}
											} else {
												break;
											}
											break while_48_;
										}
									} else {
										anInt3213 = class23_sub5.readByte();
										break while_53_;
									}
									anInt3216 = class23_sub5.readByte();
									break while_53_;
								} while (false);
								anInt3210 = class23_sub5.readShortBE();
								break while_53_;
							} while (false);
							anInt3223 = class23_sub5.readShortBE();
							break while_53_;
						} while (false);
						anInt3226 = class23_sub5.readShortBE();
						break while_53_;
					} while (false);
					anInt3218 = class23_sub5.readShortBE();
					break while_53_;
				} while (false);
				anInt3208 = class23_sub5.readShortBE();
				break while_53_;
			} while (false);
			anInt3202 = class23_sub5.readShortBE();
		} while (false);
		if (i_41_ != 1000) {
			method344((byte) -42);
		}
	}
	
	static final boolean method343(byte b) {
		if (b != -37) {
			return true;
		}
		anInt3206++;
		if (Class46.anInt708 != 0) {
			return true;
		}
		return Class81.aClass23_Sub10_Sub2_1437.method570(-119);
	}
	
	public Class23_Sub4_Sub19() {
		super(0, true);
		anInt3208 = 81;
		anInt3223 = 204;
		anInt3218 = 0;
		anInt3213 = 4;
		anInt3216 = 8;
		anInt3226 = 1024;
	}
	
	private final void method344(byte b) {
		Random random = new Random((long) anInt3216);
		anInt3221 = anInt3208 / 2;
		anInt3215 = 4096 / anInt3213;
		anIntArray3207 = new int[anInt3216 - -1];
		anIntArray3207[0] = 0;
		anInt3204++;
		anIntArrayArray3222 = new int[anInt3216][1 + anInt3213];
		anInt3209 = 4096 / anInt3216;
		int i = anInt3209 / 2;
		int i_43_ = anInt3215 / 2;
		if (b == -102) {
			anIntArrayArray3217 = new int[anInt3216][anInt3213];
			for (int i_44_ = 0; (anInt3216 ^ 0xffffffff) < (i_44_ ^ 0xffffffff); i_44_++) {
				if (i_44_ > 0) {
					int i_45_ = anInt3209;
					int i_46_ = (Class23_Sub13_Sub9.method686(12402, random, 4096) - 2048) * anInt3223 >> 12;
					i_45_ += i * i_46_ >> 12;
					anIntArray3207[i_44_] = i_45_ + anIntArray3207[i_44_ - 1];
				}
				anIntArrayArray3222[i_44_][0] = 0;
				for (int i_47_ = 0; anInt3213 > i_47_; i_47_++) {
					if (i_47_ > 0) {
						int i_48_ = anInt3215;
						int i_49_ = (Class23_Sub13_Sub9.method686(b + 12504, random, 4096) - 2048) * anInt3210 >> 12;
						i_48_ += i_43_ * i_49_ >> 12;
						anIntArrayArray3222[i_44_][i_47_] = anIntArrayArray3222[i_44_][-1 + i_47_] + i_48_;
					}
					anIntArrayArray3217[i_44_][i_47_] = anInt3202 <= 0 ? 4096 : -Class23_Sub13_Sub9.method686(12402, random, anInt3202) + 4096;
				}
				anIntArrayArray3222[i_44_][anInt3213] = 4096;
			}
			anIntArray3207[anInt3216] = 4096;
		}
	}
	
	public static void method345(int i) {
		aClass16_3200 = null;
		anIntArray3224 = null;
		if (i >= -73) {
			method341(-20, -85, -61, true, -92, null, -92);
		}
		aClass16_3219 = null;
		aClass16_3220 = null;
		aClass16_3201 = null;
	}
	
	static {
		aClass16_3219 = Class38_Sub6.method1076((byte) 86, "m-Ochte mit Ihnen handeln)3");
	}
}

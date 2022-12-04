/* Class23_Sub4_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub18 extends Class23_Sub4
{
	static int anInt3181;
	private int anInt3182;
	static int[] anIntArray3183;
	static int anInt3184;
	static int anInt3185;
	private int[] anIntArray3186;
	private int anInt3187;
	static int anInt3188;
	static int anInt3189;
	static short[] aShortArray3190;
	static int anInt3191 = 0;
	private int anInt3192 = 0;
	static int anInt3193;
	private int[] anIntArray3194;
	static Class5 aClass5_3195;
	static int anInt3196;
	static int anInt3197;
	static byte[][][] aByteArrayArrayArray3198;
	static RSString aClass16_3199;
	
	static final void method336(int i) {
		if (i != -11211) {
			aClass5_3195 = null;
		}
		for (Class23_Sub8 class23_sub8 = (Class23_Sub8) Class105.aClass89_1767.method1437(0); class23_sub8 != null; class23_sub8 = (Class23_Sub8) Class105.aClass89_1767.method1431((byte) -89)) {
			if (class23_sub8.aClass23_Sub10_Sub1_2228 != null) {
				Class23_Sub7.aClass23_Sub10_Sub4_2201.method595(class23_sub8.aClass23_Sub10_Sub1_2228);
				class23_sub8.aClass23_Sub10_Sub1_2228 = null;
			}
			if (class23_sub8.aClass23_Sub10_Sub1_2232 != null) {
				Class23_Sub7.aClass23_Sub10_Sub4_2201.method595(class23_sub8.aClass23_Sub10_Sub1_2232);
				class23_sub8.aClass23_Sub10_Sub1_2232 = null;
			}
		}
		anInt3185++;
		Class105.aClass89_1767.method1435(101);
	}
	
	private final void method337(int i) {
		anIntArray3186 = new int[1 + anInt3187];
		anInt3193++;
		int i_0_ = 0;
		if (i != 22464) {
			aShortArray3190 = null;
		}
		anIntArray3194 = new int[anInt3187 + 1];
		int i_1_ = 4096 / anInt3187;
		int i_2_ = i_1_ * anInt3182 >> 12;
		for (int i_3_ = 0; anInt3187 > i_3_; i_3_++) {
			anIntArray3194[i_3_] = i_0_;
			anIntArray3186[i_3_] = i_0_ + i_2_;
			i_0_ += i_1_;
		}
		anIntArray3194[anInt3187] = 4096;
		anIntArray3186[anInt3187] = 4096 - -anIntArray3186[0];
	}
	
	public static void method338(byte b) {
		aClass5_3195 = null;
		aClass16_3199 = null;
		anIntArray3183 = null;
		aByteArrayArrayArray3198 = null;
		if (b > 9) {
			aShortArray3190 = null;
		}
	}
	
	static final void method339(int i, int i_4_, int i_5_, int i_6_) {
		anInt3189++;
		Class64 class64 = Class23_Sub13_Sub8_Sub1.method679(i_5_, i_6_, (byte) -27);
		if (class64 != null && class64.anObjectArray1026 != null) {
			Class23_Sub9 class23_sub9 = new Class23_Sub9();
			class23_sub9.anObjectArray2274 = class64.anObjectArray1026;
			class23_sub9.aClass64_2263 = class64;
			Class91.method1452(class23_sub9, (byte) -127);
		}
		Class71_Sub1.anInt2725 = i_4_;
		ObjectDefinition.aBoolean3792 = true;
		if (i == 5087) {
			Class7.anInt169 = i_5_;
			Class23_Sub13_Sub14.anInt4013 = i_6_;
			Class91.method1450((byte) 29, class64);
		}
	}
	
	public Class23_Sub4_Sub18() {
		super(0, true);
		anInt3182 = 2048;
		anInt3187 = 10;
	}
	
	final void method265(int i) {
		if (i != -21746) {
			aShortArray3190 = null;
		}
		anInt3197++;
		method337(22464);
	}
	
	static final void method340(int i) {
		synchronized (Class21.anObject338) {
			if (i < 99) {
				method336(-11);
			}
			if (Class23.anInt353 != 0) {
				Class23.anInt353 = 1;
				try {
					Class21.anObject338.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
		anInt3188++;
	}
	
	final int[] method260(int i, int i_7_) {
		if (i != 0) {
			anInt3187 = -71;
		}
		anInt3184++;
		int[] is = aClass99_2115.method1500(i_7_, (byte) -107);
		if (aClass99_2115.aBoolean1681) {
			int i_8_ = Class23_Sub13_Sub16.anIntArray4049[i_7_];
			if ((anInt3192 ^ 0xffffffff) == -1) {
				int i_9_ = 0;
				for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (anInt3187 ^ 0xffffffff); i_10_++) {
					if ((anIntArray3194[i_10_] ^ 0xffffffff) >= (i_8_ ^ 0xffffffff) && (anIntArray3194[1 + i_10_] ^ 0xffffffff) < (i_8_ ^ 0xffffffff)) {
						if ((i_8_ ^ 0xffffffff) > (anIntArray3186[i_10_] ^ 0xffffffff)) {
							i_9_ = 4096;
						}
						break;
					}
				}
				Class3.method53(is, 0, Class23_Sub4_Sub33.anInt3428, i_9_);
			} else {
				for (int i_11_ = 0; (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++) {
					int i_12_ = 0;
					int i_13_ = 0;
					int i_14_ = Class61.anIntArray967[i_11_];
					int i_15_ = anInt3192;
				while_46_:
					do {
						do {
							if (i_15_ != 1) {
								if (i_15_ != 2) {
									if (i_15_ == 3) {
										break;
									}
									break while_46_;
								}
							} else {
								i_12_ = i_14_;
								break while_46_;
							}
							i_12_ = 2048 + (i_8_ + (-4096 + i_14_) >> 1);
							break while_46_;
						} while (false);
						i_12_ = (i_14_ + -i_8_ >> 1) + 2048;
					} while (false);
					for (i_15_ = 0; i_15_ < anInt3187; i_15_++) {
						if (i_12_ >= anIntArray3194[i_15_] && (i_12_ ^ 0xffffffff) > (anIntArray3194[1 + i_15_] ^ 0xffffffff)) {
							if (anIntArray3186[i_15_] > i_12_) {
								i_13_ = 4096;
							}
							break;
						}
					}
					is[i_11_] = i_13_;
				}
			}
		}
		return is;
	}
	
	final void method255(Buffer class23_sub5, int i, int i_16_) {
		if (i_16_ == 1000) {
			int i_17_ = i;
		while_47_:
			do {
				do {
					if ((i_17_ ^ 0xffffffff) != -1) {
						if (i_17_ != 1) {
							if (i_17_ == 2) {
								break;
							}
							break while_47_;
						}
					} else {
						anInt3187 = class23_sub5.readUByte();
						break while_47_;
					}
					anInt3182 = class23_sub5.getUShortBE();
					break while_47_;
				} while (false);
				anInt3192 = class23_sub5.readUByte();
			} while (false);
			anInt3181++;
		}
	}
	
	static {
		aShortArray3190 = new short[] { 960, 957, -21568, -21571, 22464 };
		aClass5_3195 = new Class5(64);
		aClass16_3199 = Class38_Sub6.method1076((byte) 86, "Bitte warten Sie eine Minute");
	}
}

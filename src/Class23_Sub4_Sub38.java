/* Class23_Sub4_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub38 extends Class23_Sub4
{
	private static RSString aClass16_3499;
	static int anInt3500 = 0;
	static int anInt3501;
	static Class39[] aClass39Array3502 = new Class39[5000];
	static int anInt3503;
	static int anInt3504;
	static int anInt3505;
	static RSString aClass16_3506;
	private Class87[] aClass87Array3507;
	static int anInt3508;
	static RSString aClass16_3509;
	static int anInt3510;
	static int anInt3511;
	
	final int[] method260(int i, int i_0_) {
		anInt3511++;
		int[] is = aClass99_2115.method1500(i_0_, (byte) -125);
		if (aClass99_2115.aBoolean1681) {
			method421(aClass99_2115.method1499((byte) -78), (byte) 54);
		}
		if (i != 0) {
			method420(-2);
		}
		return is;
	}
	
	final int[][] method258(int i, byte b) {
		int[][] is = aClass103_2108.method1518(-29659, i);
		if (b != 9) {
			return null;
		}
		if (aClass103_2108.aBoolean1733) {
			int i_1_ = Class23_Sub4_Sub33.anInt3428;
			int i_2_ = Class102.anInt1706;
			int[][][] is_3_ = aClass103_2108.method1520(-47);
			int[][] is_4_ = new int[i_2_][i_1_];
			method421(is_4_, (byte) 76);
			for (int i_5_ = 0; (Class102.anInt1706 ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
				int[][] is_6_ = is_3_[i_5_];
				int[] is_7_ = is_6_[0];
				int[] is_8_ = is_4_[i_5_];
				int[] is_9_ = is_6_[2];
				int[] is_10_ = is_6_[1];
				for (int i_11_ = 0; i_11_ < Class23_Sub4_Sub33.anInt3428; i_11_++) {
					int i_12_ = is_8_[i_11_];
					is_9_[i_11_] = Class24.method919(i_12_, 255) << 4;
					is_10_[i_11_] = Class24.method919(i_12_, 65280) >> 4;
					is_7_[i_11_] = Class24.method919(i_12_, 16711680) >> 12;
				}
			}
		}
		anInt3504++;
		return is;
	}
	
	final void method255(Buffer class23_sub5, int i, int i_13_) {
		anInt3508++;
		if (i_13_ != 1000) {
			method255(null, -98, -99);
		}
		if (i == 0) {
			aClass87Array3507 = new Class87[class23_sub5.readByte()];
		while_168_:
			for (int i_14_ = 0; aClass87Array3507.length > i_14_; i_14_++) {
				int i_15_ = class23_sub5.readByte();
				int i_16_ = i_15_;
			while_166_:
				do {
					do {
						if ((i_16_ ^ 0xffffffff) != -1) {
							if (i_16_ != 1) {
								if (i_16_ != 2) {
									if (i_16_ != 3) {
										continue while_168_;
									}
								} else {
									break;
								}
								break while_166_;
							}
						} else {
							aClass87Array3507[i_14_] = Class87.method1407(class23_sub5, 0);
							continue while_168_;
						}
						aClass87Array3507[i_14_] = Class23_Sub13_Sub11.method743((byte) -65, class23_sub5);
						continue while_168_;
					} while (false);
					aClass87Array3507[i_14_] = Class73.method1312(class23_sub5, 23090);
					continue while_168_;
				} while (false);
				aClass87Array3507[i_14_] = RuntimeException_Sub1.method1588(class23_sub5, true);
			}
		} else if (i == 1) {
			aBoolean2117 = class23_sub5.readByte() == 1;
		}
	}
	
	public static void method420(int i) {
		if (i != 0) {
			method422(false, 34, (byte) -49, 97);
		}
		aClass16_3499 = null;
		aClass16_3509 = null;
		aClass16_3506 = null;
		aClass39Array3502 = null;
	}
	
	private final void method421(int[][] is, byte b) {
		anInt3505++;
		int i = Class23_Sub4_Sub33.anInt3428;
		int i_17_ = Class102.anInt1706;
		Class54.method1175(4, is);
		Class23_Sub24.method902(Class95.anInt1611, 0, Class23_Sub4_Sub1.anInt2892, 0, -10);
		if (b < 27) {
			method421(null, (byte) -128);
		}
		if (aClass87Array3507 != null) {
			for (int i_18_ = 0; (aClass87Array3507.length ^ 0xffffffff) < (i_18_ ^ 0xffffffff); i_18_++) {
				Class87 class87 = aClass87Array3507[i_18_];
				int i_19_ = class87.anInt1481;
				int i_20_ = class87.anInt1487;
				if (i_19_ < 0) {
					if ((i_20_ ^ 0xffffffff) <= -1) {
						class87.method1409(i, 127, i_17_);
					}
				} else if (i_20_ >= 0) {
					class87.method1408(i, i_17_, -124);
				} else {
					class87.method1406(1, i_17_, i);
				}
			}
		}
	}
	
	public Class23_Sub4_Sub38() {
		super(0, true);
	}
	
	static final void method422(boolean bool, int i, byte b, int i_21_) {
		int i_22_ = 88 % ((b - -24) / 59);
		anInt3503++;
		if (i < 8000 || i > 48000) {
			throw new IllegalArgumentException();
		}
		Class13.aBoolean257 = bool;
		Class32.anInt498 = i;
		Class64.anInt1030 = i_21_;
	}
	
	static {
		aClass16_3499 = Class38_Sub6.method1076((byte) 86, "Loading wordpack )2 ");
		anInt3501 = 0;
		aClass16_3509 = Class38_Sub6.method1076((byte) 86, "");
		aClass16_3506 = aClass16_3499;
		anInt3510 = 0;
	}
}

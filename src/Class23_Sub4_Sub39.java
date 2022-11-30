/* Class23_Sub4_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub39 extends Class23_Sub4
{
	static RSString aClass16_3512;
	static Class98 aClass98_3513;
	private int anInt3514;
	private int anInt3515 = 4096;
	static boolean aBoolean3516 = false;
	static int anInt3517;
	static int anInt3518;
	static int anInt3519 = 0;
	static Class27 aClass27_3520;
	static int anInt3521;
	private static RSString aClass16_3522 = Class38_Sub6.method1076((byte) 86, "Enter your username (V password)3");
	static int anInt3523;
	static int anInt3524;
	static Class105 aClass105_3525;
	static int anInt3526;
	
	static final void method423(int i, int i_0_, int i_1_, int i_2_, int i_3_, byte b, int i_4_, int i_5_) {
		int i_6_ = i_3_ + i_2_;
		int i_7_ = -i_2_ + i_4_;
		int i_8_ = i_2_ + i;
		int i_9_ = -i_2_ + i_5_;
		anInt3523++;
		for (int i_10_ = i; (i_10_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff); i_10_++)
			Class23_Sub13_Sub6.method632(i_4_, (byte) -30, i_0_, Class4.anIntArrayArray98[i_10_], i_3_);
		if (b < 18) {
			aClass98_3513 = null;
		}
		for (int i_11_ = i_5_; (i_9_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff); i_11_--)
			Class23_Sub13_Sub6.method632(i_4_, (byte) -30, i_0_, Class4.anIntArrayArray98[i_11_], i_3_);
		for (int i_12_ = i_8_; i_9_ >= i_12_; i_12_++) {
			int[] is = Class4.anIntArrayArray98[i_12_];
			Class23_Sub13_Sub6.method632(i_6_, (byte) -30, i_0_, is, i_3_);
			Class23_Sub13_Sub6.method632(i_7_, (byte) -30, i_1_, is, i_6_);
			Class23_Sub13_Sub6.method632(i_4_, (byte) -30, i_0_, is, i_7_);
		}
	}
	
	static final void method424(Class43_Sub1 class43_sub1, byte b) {
		anInt3518++;
		int i = 256;
		for (int i_13_ = 0; (Class87_Sub4.anIntArray2828.length ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++)
			Class87_Sub4.anIntArray2828[i_13_] = 0;
		int i_14_ = 0;
		if (b <= 25) {
			method423(10, 110, -6, -39, 108, (byte) -59, -76, -112);
		}
		for (/**/; i_14_ < 5000; i_14_++) {
			int i_15_ = (int) ((double) i * (Math.random() * 128.0));
			Class87_Sub4.anIntArray2828[i_15_] = (int) (256.0 * Math.random());
		}
		for (int i_16_ = 0; i_16_ < 20; i_16_++) {
			for (int i_17_ = 1; i_17_ < -1 + i; i_17_++) {
				for (int i_18_ = 1; i_18_ < 127; i_18_++) {
					int i_19_ = i_18_ + (i_17_ << 7);
					Class28.anIntArray425[i_19_] = (Class87_Sub4.anIntArray2828[i_19_ - 128] + (Class87_Sub4.anIntArray2828[-1 + i_19_] + Class87_Sub4.anIntArray2828[1 + i_19_]) + Class87_Sub4.anIntArray2828[128 + i_19_]) / 4;
				}
			}
			int[] is = Class87_Sub4.anIntArray2828;
			Class87_Sub4.anIntArray2828 = Class28.anIntArray425;
			Class28.anIntArray425 = is;
		}
		if (class43_sub1 != null) {
			int i_20_ = 0;
			for (int i_21_ = 0; class43_sub1.anInt671 > i_21_; i_21_++) {
				for (int i_22_ = 0; i_22_ < class43_sub1.anInt669; i_22_++) {
					if (class43_sub1.aByteArray2719[i_20_++] != 0) {
						int i_23_ = 16 + (i_22_ + class43_sub1.anInt670);
						int i_24_ = i_21_ + (16 + class43_sub1.anInt665);
						int i_25_ = i_23_ - -(i_24_ << 7);
						Class87_Sub4.anIntArray2828[i_25_] = 0;
					}
				}
			}
		}
	}
	
	public static void method425(byte b) {
		aClass105_3525 = null;
		aClass16_3512 = null;
		aClass98_3513 = null;
		aClass16_3522 = null;
		aClass27_3520 = null;
		if (b > -6) {
			aClass27_3520 = null;
		}
	}
	
	final int[][] method258(int i, byte b) {
		int[][] is = aClass103_2108.method1518(-29659, i);
		if (b != 9) {
			anInt3519 = 0;
		}
		if (aClass103_2108.aBoolean1733) {
			int[][] is_26_ = this.method256(0, (byte) -76, i);
			int[] is_27_ = is_26_[0];
			int[] is_28_ = is_26_[1];
			int[] is_29_ = is[1];
			int[] is_30_ = is[0];
			int[] is_31_ = is_26_[2];
			int[] is_32_ = is[2];
			for (int i_33_ = 0; (i_33_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_33_++) {
				int i_34_ = is_27_[i_33_];
				int i_35_ = is_28_[i_33_];
				int i_36_ = is_31_[i_33_];
				if (anInt3514 > i_34_) {
					is_30_[i_33_] = anInt3514;
				} else if ((i_34_ ^ 0xffffffff) >= (anInt3515 ^ 0xffffffff)) {
					is_30_[i_33_] = i_34_;
				} else {
					is_30_[i_33_] = anInt3515;
				}
				if (i_35_ < anInt3514) {
					is_29_[i_33_] = anInt3514;
				} else if (i_35_ <= anInt3515) {
					is_29_[i_33_] = i_35_;
				} else {
					is_29_[i_33_] = anInt3515;
				}
				if (anInt3514 <= i_36_) {
					if (anInt3515 >= i_36_) {
						is_32_[i_33_] = i_36_;
					} else {
						is_32_[i_33_] = anInt3515;
					}
				} else {
					is_32_[i_33_] = anInt3514;
				}
			}
		}
		anInt3517++;
		return is;
	}
	
	public Class23_Sub4_Sub39() {
		super(1, false);
		anInt3514 = 0;
	}
	
	final void method255(Buffer class23_sub5, int i, int i_37_) {
		anInt3521++;
		int i_38_ = i;
	while_169_:
		do {
			do {
				if (i_38_ != 0) {
					if (i_38_ != 1) {
						if (i_38_ == 2) {
							break;
						}
						break while_169_;
					}
				} else {
					anInt3514 = class23_sub5.readShortBE();
					break while_169_;
				}
				anInt3515 = class23_sub5.readShortBE();
				break while_169_;
			} while (false);
			aBoolean2117 = class23_sub5.readByte() == 1;
		} while (false);
		if (i_37_ != 1000) {
			aClass27_3520 = null;
		}
	}
	
	final int[] method260(int i, int i_39_) {
		if (i != 0) {
			aBoolean3516 = true;
		}
		anInt3526++;
		int[] is = aClass99_2115.method1500(i_39_, (byte) -111);
		if (aClass99_2115.aBoolean1681) {
			int[] is_40_ = this.method261(i_39_, 0, (byte) 18);
			for (int i_41_ = 0; i_41_ < Class23_Sub4_Sub33.anInt3428; i_41_++) {
				int i_42_ = is_40_[i_41_];
				if (i_42_ >= anInt3514) {
					if (anInt3515 >= i_42_) {
						is[i_41_] = i_42_;
					} else {
						is[i_41_] = anInt3515;
					}
				} else {
					is[i_41_] = anInt3514;
				}
			}
		}
		return is;
	}
	
	static {
		aClass16_3512 = aClass16_3522;
		aClass27_3520 = new Class27();
	}
}

/* Class23_Sub4_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub30 extends Class23_Sub4
{
	private static RSString aClass16_3376;
	static RSString aClass16_3377;
	static RSString aClass16_3378;
	static byte[][][] aByteArrayArrayArray3379;
	static boolean aBoolean3380 = false;
	static int anInt3381;
	static int anInt3382;
	static long[] aLongArray3383;
	static Class84 aClass84_3384;
	static byte[][][] aByteArrayArrayArray3385;
	static int anInt3386;
	
	final int[] method260(int i, int i_0_) {
		if (i != 0) {
			method391(null, 76, -55, 62, -57, -95);
		}
		anInt3381++;
		return Class61.anIntArray967;
	}
	
	static final void method391(Class38 class38, int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		boolean bool = true;
		int i_5_ = i_1_;
		int i_6_ = i_1_ + i_3_;
		int i_7_ = i_2_ - 1;
		int i_8_ = i_2_ + i_4_;
		for (int i_9_ = i; i_9_ <= i + 1; i_9_++) {
			if (i_9_ != Class23_Sub4_Sub18.anInt3196) {
				for (int i_10_ = i_5_; i_10_ <= i_6_; i_10_++) {
					if (i_10_ >= 0 && i_10_ < Class105.anInt1802) {
						for (int i_11_ = i_7_; i_11_ <= i_8_; i_11_++) {
							if (i_11_ >= 0 && i_11_ < client.anInt1974 && (!bool || i_10_ >= i_6_ || i_11_ >= i_8_ || i_11_ < i_2_ && i_10_ != i_1_)) {
								Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_9_][i_10_][i_11_];
								if (class23_sub1 != null) {
									int i_12_ = (Class17.anIntArrayArrayArray301[i_9_][i_10_][i_11_] + Class17.anIntArrayArrayArray301[i_9_][i_10_ + 1][i_11_] + Class17.anIntArrayArrayArray301[i_9_][i_10_][i_11_ + 1] + Class17.anIntArrayArrayArray301[i_9_][i_10_ + 1][i_11_ + 1]) / 4 - (Class17.anIntArrayArrayArray301[i][i_1_][i_2_] + Class17.anIntArrayArrayArray301[i][i_1_ + 1][i_2_] + Class17.anIntArrayArrayArray301[i][i_1_][i_2_ + 1] + Class17.anIntArrayArrayArray301[i][i_1_ + 1][i_2_ + 1]) / 4;
									Class83 class83 = class23_sub1.aClass83_2031;
									if (class83 != null) {
										if (class83.aClass38_1463.method998()) {
											class38.method992(class83.aClass38_1463, (i_10_ - i_1_) * 128 + (1 - i_3_) * 64, i_12_, (i_11_ - i_2_) * 128 + (1 - i_4_) * 64, bool);
										}
										if (class83.aClass38_1468 != null && class83.aClass38_1468.method998()) {
											class38.method992(class83.aClass38_1468, (i_10_ - i_1_) * 128 + (1 - i_3_) * 64, i_12_, (i_11_ - i_2_) * 128 + (1 - i_4_) * 64, bool);
										}
									}
									for (int i_13_ = 0; i_13_ < class23_sub1.anInt2029; i_13_++) {
										Class39 class39 = class23_sub1.aClass39Array2028[i_13_];
										if (class39 != null && class39.aClass38_615.method998() && (i_10_ == class39.anInt601 || i_10_ == i_5_) && (i_11_ == class39.anInt607 || i_11_ == i_7_)) {
											int i_14_ = class39.anInt613 - class39.anInt601 + 1;
											int i_15_ = class39.anInt599 - class39.anInt607 + 1;
											class38.method992(class39.aClass38_615, (class39.anInt601 - i_1_) * 128 + (i_14_ - i_3_) * 64, i_12_, (class39.anInt607 - i_2_) * 128 + (i_15_ - i_4_) * 64, bool);
										}
									}
								}
							}
						}
					}
				}
				i_5_--;
				bool = false;
			}
		}
	}
	
	public static void method392(boolean bool) {
		aClass84_3384 = null;
		aLongArray3383 = null;
		aClass16_3378 = null;
		if (bool != true) {
			method393(91, -23, 22, -123, -28);
		}
		aByteArrayArrayArray3385 = null;
		aClass16_3377 = null;
		aByteArrayArrayArray3379 = null;
		aClass16_3376 = null;
	}
	
	static final void method393(int i, int i_16_, int i_17_, int i_18_, int i_19_) {
		if ((i_17_ ^ 0xffffffff) <= (Class88.anInt1503 ^ 0xffffffff) && i_17_ <= Class23_Sub4_Sub33.anInt3435) {
			i_16_ = Class23_Sub4_Sub32.method405(49, Class23_Sub13_Sub6.anInt3728, i_16_, Class35.anInt554);
			i_18_ = Class23_Sub4_Sub32.method405(75, Class23_Sub13_Sub6.anInt3728, i_18_, Class35.anInt554);
			Class56.method1187(false, i_19_, i_18_, i_16_, i_17_);
		}
		anInt3382++;
		if (i != 1) {
			aClass16_3378 = null;
		}
	}
	
	public Class23_Sub4_Sub30() {
		super(0, true);
	}
	
	static {
		aByteArrayArrayArray3379 = new byte[4][104][104];
		aLongArray3383 = new long[100];
		aClass16_3376 = Class38_Sub6.method1076((byte) 86, "Ok");
		aClass16_3378 = Class38_Sub6.method1076((byte) 86, "null");
		aClass16_3377 = aClass16_3376;
	}
}

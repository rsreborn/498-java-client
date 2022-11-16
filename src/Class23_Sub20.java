/* Class23_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub20 extends Class23
{
	protected int anInt2394;
	static int anInt2395;
	static int anInt2396;
	static int anInt2397;
	static int anInt2398 = -1;
	static Class5 aClass5_2399 = new Class5(64);
	static int anInt2400 = (int) (33.0 * Math.random()) + -16;
	static int[] anIntArray2401 = { 1, 1, 1, 1 };
	static Class23_Sub13_Sub10_Sub1 aClass23_Sub13_Sub10_Sub1_2402;
	static int anInt2403;
	static RSString aClass16_2404 = Class38_Sub6.method1076((byte) 86, "M");
	
	public static void method885(int i) {
		aClass23_Sub13_Sub10_Sub1_2402 = null;
		if (i == 1) {
			aClass5_2399 = null;
			aClass16_2404 = null;
			anIntArray2401 = null;
		}
	}
	
	static final void method886(byte b) {
		int i = -2 % ((61 - b) / 33);
		anInt2403++;
		Class72.aClass89_1286 = new Class89();
	}
	
	static final int method887(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, byte b) {
		anInt2396++;
		if (b >= -81) {
			method887(-51, 24, -33, -14, 61, 88, (byte) 12);
		}
		i_4_ &= 0x3;
		if ((0x1 & i_0_) == 1) {
			int i_5_ = i_2_;
			i_2_ = i_3_;
			i_3_ = i_5_;
		}
		if ((i_4_ ^ 0xffffffff) == -1) {
			return i_1_;
		}
		if (i_4_ == 1) {
			return -i + 7 + (-i_2_ + 1);
		}
		if (i_4_ == 2) {
			return -i_3_ + (1 + -i_1_ + 7);
		}
		return i;
	}
	
	static final void method888(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		anInt2397++;
		int i_13_ = Class23_Sub4_Sub32.method405(117, Class88.anInt1503, i_12_, Class23_Sub4_Sub33.anInt3435);
		int i_14_ = Class23_Sub4_Sub32.method405(89, Class88.anInt1503, i_9_, Class23_Sub4_Sub33.anInt3435);
		int i_15_ = Class23_Sub4_Sub32.method405(86, Class23_Sub13_Sub6.anInt3728, i_8_, Class35.anInt554);
		int i_16_ = Class23_Sub4_Sub32.method405(110, Class23_Sub13_Sub6.anInt3728, i_6_, Class35.anInt554);
		int i_17_ = Class23_Sub4_Sub32.method405(72, Class88.anInt1503, i_12_ + i_11_, Class23_Sub4_Sub33.anInt3435);
		int i_18_ = Class23_Sub4_Sub32.method405(93, Class88.anInt1503, i_9_ - i_11_, Class23_Sub4_Sub33.anInt3435);
		for (int i_19_ = i_13_; (i_19_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff); i_19_++)
			Class23_Sub13_Sub6.method632(i_16_, (byte) -30, i, Class4.anIntArrayArray98[i_19_], i_15_);
		for (int i_20_ = i_14_; i_18_ < i_20_; i_20_--)
			Class23_Sub13_Sub6.method632(i_16_, (byte) -30, i, Class4.anIntArrayArray98[i_20_], i_15_);
		int i_21_ = Class23_Sub4_Sub32.method405(i_7_ + 79, Class23_Sub13_Sub6.anInt3728, i_8_ + i_11_, Class35.anInt554);
		int i_22_ = Class23_Sub4_Sub32.method405(81, Class23_Sub13_Sub6.anInt3728, i_6_ + -i_11_, Class35.anInt554);
		for (int i_23_ = i_17_; i_23_ <= i_18_; i_23_++) {
			int[] is = Class4.anIntArrayArray98[i_23_];
			Class23_Sub13_Sub6.method632(i_21_, (byte) -30, i, is, i_15_);
			Class23_Sub13_Sub6.method632(i_22_, (byte) -30, i_10_, is, i_21_);
			Class23_Sub13_Sub6.method632(i_16_, (byte) -30, i, is, i_22_);
		}
		if (i_7_ != 1) {
			aClass5_2399 = null;
		}
	}
	
	public Class23_Sub20() {
		/* empty */
	}
	
	Class23_Sub20(int i) {
		anInt2394 = i;
	}
}

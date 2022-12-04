/* Class23_Sub4_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub28 extends Class23_Sub4
{
	static int[][] anIntArrayArray3346 = new int[104][104];
	private int anInt3347 = 4;
	static Class9 aClass9_3348;
	static int anInt3349;
	static Class64[][] aClass64ArrayArray3350;
	private int anInt3351 = 4;
	static int anInt3352;
	static RSString aClass16_3353 = Class38_Sub6.method1076((byte) 86, " <col=ffffff>");
	static int anInt3354;
	
	final void method255(Buffer class23_sub5, int i, int i_0_) {
		if (i_0_ == 1000) {
			int i_1_ = i;
			do {
				if ((i_1_ ^ 0xffffffff) != -1) {
					if (i_1_ != 1) {
						break;
					}
				} else {
					anInt3347 = class23_sub5.readUByte();
					break;
				}
				anInt3351 = class23_sub5.readUByte();
			} while (false);
			anInt3354++;
		}
	}
	
	public Class23_Sub4_Sub28() {
		super(1, false);
	}
	
	final int[][] method258(int i, byte b) {
		anInt3349++;
		if (b != 9) {
			method382(-115);
		}
		int[][] is = aClass103_2108.method1518(b + -29668, i);
		if (aClass103_2108.aBoolean1733) {
			int i_2_ = Class23_Sub4_Sub33.anInt3428 / anInt3347;
			int i_3_ = Class102.anInt1706 / anInt3351;
			int[][] is_4_;
			if ((i_3_ ^ 0xffffffff) < -1) {
				int i_5_ = i % i_3_;
				is_4_ = this.method256(0, (byte) -120, Class102.anInt1706 * i_5_ / i_3_);
			} else {
				is_4_ = this.method256(0, (byte) -72, 0);
			}
			int[] is_6_ = is_4_[1];
			int[] is_7_ = is_4_[0];
			int[] is_8_ = is_4_[2];
			int[] is_9_ = is[0];
			int[] is_10_ = is[1];
			int[] is_11_ = is[2];
			for (int i_12_ = 0; i_12_ < Class23_Sub4_Sub33.anInt3428; i_12_++) {
				int i_13_;
				if ((i_2_ ^ 0xffffffff) < -1) {
					int i_14_ = i_12_ % i_2_;
					i_13_ = Class23_Sub4_Sub33.anInt3428 * i_14_ / i_2_;
				} else {
					i_13_ = 0;
				}
				is_9_[i_12_] = is_7_[i_13_];
				is_10_[i_12_] = is_6_[i_13_];
				is_11_[i_12_] = is_8_[i_13_];
			}
		}
		return is;
	}
	
	final int[] method260(int i, int i_15_) {
		if (i != 0) {
			anIntArrayArray3346 = null;
		}
		int[] is = aClass99_2115.method1500(i_15_, (byte) -122);
		anInt3352++;
		if (aClass99_2115.aBoolean1681) {
			int i_16_ = Class23_Sub4_Sub33.anInt3428 / anInt3347;
			int i_17_ = Class102.anInt1706 / anInt3351;
			int[] is_18_;
			if (i_17_ > 0) {
				int i_19_ = i_15_ % i_17_;
				is_18_ = this.method261(Class102.anInt1706 * i_19_ / i_17_, 0, (byte) 18);
			} else {
				is_18_ = this.method261(0, 0, (byte) 18);
			}
			for (int i_20_ = 0; Class23_Sub4_Sub33.anInt3428 > i_20_; i_20_++) {
				if ((i_16_ ^ 0xffffffff) >= -1) {
					is[i_20_] = is_18_[0];
				} else {
					int i_21_ = i_20_ % i_16_;
					is[i_20_] = is_18_[Class23_Sub4_Sub33.anInt3428 * i_21_ / i_16_];
				}
			}
		}
		return is;
	}
	
	public static void method382(int i) {
		aClass64ArrayArray3350 = null;
		aClass16_3353 = null;
		anIntArrayArray3346 = null;
		aClass9_3348 = null;
		if (i != 104) {
			method382(102);
		}
	}
}

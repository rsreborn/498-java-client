/* Class23_Sub4_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub33 extends Class23_Sub4
{
	static int anInt3425;
	static int anInt3426;
	static int[] anIntArray3427;
	static int anInt3428;
	private boolean aBoolean3429;
	private int anInt3430 = 4096;
	static int[] anIntArray3431;
	static int anInt3432;
	static int anInt3433;
	static RSString aClass16_3434 = Class38_Sub6.method1076((byte) 86, "Zu viele Verbindungen von Ihrer Adresse)3");
	static int anInt3435 = 100;
	static Class89 aClass89_3436 = new Class89();
	
	public static void method407(boolean bool) {
		aClass89_3436 = null;
		anIntArray3431 = null;
		anIntArray3427 = null;
		if (bool == false) {
			aClass16_3434 = null;
		}
	}
	
	static final void method408(byte b, int i) {
		Class75.anInt1381 = -1;
		Class8.anInt179 = i;
		Class75.anInt1381 = -1;
		Class61.method1198(15);
		anInt3426++;
		if (b > -38) {
			method407(false);
		}
	}
	
	final int[][] method258(int i, byte b) {
		anInt3433++;
		int[][] is = aClass103_2108.method1518(-29659, i);
		if (b != 9) {
			anInt3425 = 95;
		}
		if (aClass103_2108.aBoolean1733) {
			int[] is_0_ = this.method261(-1 + i & Class23_Sub4_Sub1.anInt2892, 0, (byte) 18);
			int[] is_1_ = this.method261(i, 0, (byte) 18);
			int[] is_2_ = this.method261(Class23_Sub4_Sub1.anInt2892 & 1 + i, 0, (byte) 18);
			int[] is_3_ = is[0];
			int[] is_4_ = is[1];
			int[] is_5_ = is[2];
			for (int i_6_ = 0; (anInt3428 ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
				int i_7_ = (is_2_[i_6_] - is_0_[i_6_]) * anInt3430;
				int i_8_ = (is_1_[Class95.anInt1611 & i_6_ - -1] - is_1_[Class95.anInt1611 & i_6_ - 1]) * anInt3430;
				int i_9_ = i_7_ >> 12;
				int i_10_ = i_8_ >> 12;
				int i_11_ = i_9_ * i_9_ >> 12;
				int i_12_ = i_10_ * i_10_ >> 12;
				int i_13_ = (int) (Math.sqrt((double) ((float) (4096 + (i_12_ + i_11_)) / 4096.0F)) * 4096.0);
				int i_14_;
				int i_15_;
				int i_16_;
				if (i_13_ != 0) {
					i_15_ = 16777216 / i_13_;
					i_16_ = i_8_ / i_13_;
					i_14_ = i_7_ / i_13_;
				} else {
					i_14_ = 0;
					i_15_ = 0;
					i_16_ = 0;
				}
				if (aBoolean3429) {
					i_16_ = 2048 - -(i_16_ >> 1);
					i_14_ = (i_14_ >> 1) + 2048;
					i_15_ = (i_15_ >> 1) + 2048;
				}
				is_3_[i_6_] = i_16_;
				is_4_[i_6_] = i_14_;
				is_5_[i_6_] = i_15_;
			}
		}
		return is;
	}
	
	public Class23_Sub4_Sub33() {
		super(1, false);
		aBoolean3429 = true;
	}
	
	final void method255(Buffer class23_sub5, int i, int i_17_) {
		anInt3432++;
		int i_18_ = i;
		do {
			if (i_18_ != 0) {
				if (i_18_ != 1) {
					break;
				}
			} else {
				anInt3430 = class23_sub5.method476((byte) -119);
				break;
			}
			aBoolean3429 = class23_sub5.method461(i_17_ ^ ~0x6b28761f) == 1;
		} while (false);
		if (i_17_ != 1000) {
			method255(null, 93, -59);
		}
	}
}

/* Class23_Sub4_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub34 extends Class23_Sub4
{
	static RSString aClass16_3437;
	private int anInt3438;
	private static RSString aClass16_3439;
	static RSString aClass16_3440;
	private int anInt3441 = 1024;
	static int anInt3442;
	static int anInt3443;
	static String aString3444;
	static RSString aClass16_3445;
	private int anInt3446 = 2048;
	static int anInt3447;
	static int anInt3448;
	static volatile int anInt3449 = -1;
	static RSString aClass16_3450;
	
	final int[][] method258(int i, byte b) {
		anInt3442++;
		int[][] is = aClass103_2108.method1518(-29659, i);
		if (aClass103_2108.aBoolean1733) {
			int[][] is_0_ = this.method256(0, (byte) -59, i);
			int[] is_1_ = is_0_[0];
			int[] is_2_ = is_0_[2];
			int[] is_3_ = is[0];
			int[] is_4_ = is[1];
			int[] is_5_ = is[2];
			int[] is_6_ = is_0_[1];
			for (int i_7_ = 0; (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
				is_3_[i_7_] = (is_1_[i_7_] * anInt3446 >> 12) + anInt3441;
				is_4_[i_7_] = anInt3441 - -(is_6_[i_7_] * anInt3446 >> 12);
				is_5_[i_7_] = anInt3441 + (is_2_[i_7_] * anInt3446 >> 12);
			}
		}
		if (b != 9) {
			method260(46, -76);
		}
		return is;
	}
	
	final void method255(Buffer class23_sub5, int i, int i_8_) {
		int i_9_ = i;
	while_132_:
		do {
			do {
				if ((i_9_ ^ 0xffffffff) != -1) {
					if (i_9_ != 1) {
						if (i_9_ == 2) {
							break;
						}
						break while_132_;
					}
				} else {
					anInt3441 = class23_sub5.readShortBE();
					break while_132_;
				}
				anInt3438 = class23_sub5.readShortBE();
				break while_132_;
			} while (false);
			aBoolean2117 = class23_sub5.readByte() == 1;
		} while (false);
		anInt3447++;
		if (i_8_ != 1000) {
			aClass16_3437 = null;
		}
	}
	
	final void method265(int i) {
		anInt3446 = anInt3438 - anInt3441;
		anInt3443++;
		if (i != -21746) {
			aString3444 = null;
		}
	}
	
	public Class23_Sub4_Sub34() {
		super(1, false);
		anInt3438 = 3072;
	}
	
	final int[] method260(int i, int i_10_) {
		if (i != 0) {
			aClass16_3437 = null;
		}
		int[] is = aClass99_2115.method1500(i_10_, (byte) -127);
		anInt3448++;
		if (aClass99_2115.aBoolean1681) {
			int[] is_11_ = this.method261(i_10_, 0, (byte) 18);
			for (int i_12_ = 0; i_12_ < Class23_Sub4_Sub33.anInt3428; i_12_++)
				is[i_12_] = anInt3441 + (anInt3446 * is_11_[i_12_] >> 12);
		}
		return is;
	}
	
	public static void method409(int i) {
		aClass16_3437 = null;
		aClass16_3439 = null;
		aString3444 = null;
		aClass16_3450 = null;
		aClass16_3445 = null;
		if (i != -9947) {
			aClass16_3440 = null;
		}
		aClass16_3440 = null;
	}
	
	static {
		aClass16_3439 = Class38_Sub6.method1076((byte) 86, "wave:");
		aClass16_3437 = aClass16_3439;
		aClass16_3445 = Class38_Sub6.method1076((byte) 86, "gleiten:");
		aClass16_3440 = aClass16_3439;
		aClass16_3450 = Class38_Sub6.method1076((byte) 86, "(U(Y");
	}
}

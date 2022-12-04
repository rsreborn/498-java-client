/* Class23_Sub4_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub4 extends Class23_Sub4
{
	static Class23_Sub18 aClass23_Sub18_2952;
	static RSString aClass16_2953 = Class38_Sub6.method1076((byte) 86, "<img=1>");
	static int[] anIntArray2954;
	static RSString aClass16_2955;
	private int anInt2956 = 4096;
	static int anInt2957;
	static int anInt2958;
	private int anInt2959 = 4096;
	static RSString aClass16_2960 = Class38_Sub6.method1076((byte) 86, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");
	private int anInt2961 = 4096;
	static int anInt2962;
	static RSString aClass16_2963;
	static RSString aClass16_2964;
	static Class64 aClass64_2965;
	private static RSString aClass16_2966;
	static int anInt2967;
	static boolean aBoolean2968;
	static double aDouble2969;
	
	public static void method284(boolean bool) {
		aClass23_Sub18_2952 = null;
		aClass16_2966 = null;
		aClass16_2960 = null;
		if (bool == true) {
			aClass16_2964 = null;
			aClass16_2955 = null;
			aClass16_2953 = null;
			anIntArray2954 = null;
			aClass16_2963 = null;
			aClass64_2965 = null;
		}
	}
	
	static final int method285(int i, int i_0_) {
		if (i != -21502) {
			aClass16_2966 = null;
		}
		anInt2957++;
		return i_0_ & 0xff;
	}
	
	final int[][] method258(int i, byte b) {
		anInt2962++;
		int[][] is = aClass103_2108.method1518(b + -29668, i);
		if (aClass103_2108.aBoolean1733) {
			int[][] is_1_ = this.method256(0, (byte) -82, i);
			int[] is_2_ = is[2];
			int[] is_3_ = is_1_[1];
			int[] is_4_ = is_1_[2];
			int[] is_5_ = is[0];
			int[] is_6_ = is[1];
			int[] is_7_ = is_1_[0];
			for (int i_8_ = 0; i_8_ < Class23_Sub4_Sub33.anInt3428; i_8_++) {
				int i_9_ = is_7_[i_8_];
				int i_10_ = is_4_[i_8_];
				int i_11_ = is_3_[i_8_];
				if (i_10_ != i_9_ || (i_11_ ^ 0xffffffff) != (i_10_ ^ 0xffffffff)) {
					is_5_[i_8_] = anInt2959;
					is_6_[i_8_] = anInt2956;
					is_2_[i_8_] = anInt2961;
				} else {
					is_5_[i_8_] = anInt2959 * i_9_ >> 12;
					is_6_[i_8_] = i_10_ * anInt2956 >> 12;
					is_2_[i_8_] = i_11_ * anInt2961 >> 12;
				}
			}
		}
		if (b != 9) {
			return null;
		}
		return is;
	}
	
	public Class23_Sub4_Sub4() {
		super(1, false);
	}
	
	final void method255(Buffer class23_sub5, int i, int i_12_) {
		int i_13_ = i;
	while_11_:
		do {
			do {
				if ((i_13_ ^ 0xffffffff) != -1) {
					if (i_13_ != 1) {
						if (i_13_ == 2) {
							break;
						}
						break while_11_;
					}
				} else {
					anInt2959 = class23_sub5.getUShortBE();
					break while_11_;
				}
				anInt2956 = class23_sub5.getUShortBE();
				break while_11_;
			} while (false);
			anInt2961 = class23_sub5.getUShortBE();
		} while (false);
		anInt2958++;
		if (i_12_ != 1000) {
			method285(102, -112);
		}
	}
	
	static {
		aClass16_2955 = null;
		anIntArray2954 = new int[4096];
		for (int i = 0; i < 4096; i++)
			anIntArray2954[i] = Class56.method1182(i, true);
		aClass16_2964 = Class38_Sub6.method1076((byte) 86, "::clientdrop");
		aClass16_2966 = Class38_Sub6.method1076((byte) 86, "Your ignore list is full)3 Max of 100 users)3");
		aClass16_2963 = aClass16_2966;
		anInt2967 = 0;
	}
}

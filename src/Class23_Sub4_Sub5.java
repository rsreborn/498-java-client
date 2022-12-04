/* Class23_Sub4_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub5 extends Class23_Sub4
{
	static int anInt2970;
	private int anInt2971 = 585;
	static Class5 aClass5_2972;
	static int anInt2973;
	static RSString aClass16_2974;
	private static RSString aClass16_2975 = Class38_Sub6.method1076((byte) 86, "Invalid username or password)3");
	static RSString aClass16_2976;
	static boolean aBoolean2977;
	
	public Class23_Sub4_Sub5() {
		super(0, true);
	}
	
	public static void method286(byte b) {
		aClass16_2976 = null;
		aClass16_2975 = null;
		if (b <= 88) {
			aBoolean2977 = false;
		}
		aClass16_2974 = null;
		aClass5_2972 = null;
	}
	
	final void method255(Buffer class23_sub5, int i, int i_0_) {
		anInt2970++;
		if (i_0_ != 1000) {
			method260(43, -76);
		}
		int i_1_ = i;
		if (i_1_ == 0) {
			anInt2971 = class23_sub5.getUShortBE();
		}
	}
	
	final int[] method260(int i, int i_2_) {
		anInt2973++;
		if (i != 0) {
			aClass16_2975 = null;
		}
		int[] is = aClass99_2115.method1500(i_2_, (byte) -112);
		if (aClass99_2115.aBoolean1681) {
			int i_3_ = Class23_Sub13_Sub16.anIntArray4049[i_2_];
			for (int i_4_ = 0; (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
				int i_5_ = Class61.anIntArray967[i_4_];
				if (i_5_ > anInt2971 && i_5_ < -anInt2971 + 4096 && (i_3_ ^ 0xffffffff) < (2048 - anInt2971 ^ 0xffffffff) && i_3_ < 2048 + anInt2971) {
					int i_6_ = 2048 + -i_5_;
					i_6_ = (i_6_ ^ 0xffffffff) <= -1 ? i_6_ : -i_6_;
					i_6_ <<= 12;
					i_6_ /= 2048 + -anInt2971;
					is[i_4_] = -i_6_ + 4096;
				} else if (2048 - anInt2971 < i_5_ && i_5_ < anInt2971 + 2048) {
					int i_7_ = i_3_ - 2048;
					i_7_ = i_7_ < 0 ? -i_7_ : i_7_;
					i_7_ -= anInt2971;
					i_7_ <<= 12;
					is[i_4_] = i_7_ / (2048 + -anInt2971);
				} else if (i_3_ < anInt2971 || i_3_ > 4096 - anInt2971) {
					int i_8_ = -2048 + i_5_;
					i_8_ = i_8_ >= 0 ? i_8_ : -i_8_;
					i_8_ -= anInt2971;
					i_8_ <<= 12;
					is[i_4_] = i_8_ / (-anInt2971 + 2048);
				} else if ((i_5_ ^ 0xffffffff) > (anInt2971 ^ 0xffffffff) || i_5_ > 4096 - anInt2971) {
					int i_9_ = 2048 - i_3_;
					i_9_ = i_9_ < 0 ? -i_9_ : i_9_;
					i_9_ <<= 12;
					i_9_ /= 2048 + -anInt2971;
					is[i_4_] = 4096 + -i_9_;
				} else {
					is[i_4_] = 0;
				}
			}
		}
		return is;
	}
	
	static {
		aClass16_2974 = aClass16_2975;
		aClass5_2972 = new Class5(64);
		aClass16_2976 = Class38_Sub6.method1076((byte) 86, "compass");
		aBoolean2977 = false;
	}
}

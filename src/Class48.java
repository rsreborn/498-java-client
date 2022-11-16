/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class48
{
	static int anInt743;
	static int anInt744 = 0;
	static RSString aClass16_745;
	static RSString aClass16_746;
	static RSString aClass16_747 = Class38_Sub6.method1076((byte) 86, "b12_full");
	private static RSString aClass16_748;
	static int anInt749;
	static int anInt750;
	static int anInt751;
	static short aShort752 = 256;
	
	static final void method1149(byte b, boolean bool) {
		if (b <= 27) {
			anInt744 = -87;
		}
		anInt750++;
		int i = 4;
		byte[][] bs = Class53.aByteArrayArray843;
		int i_0_ = bs.length;
		for (int i_1_ = 0; (i_0_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
			int i_2_ = 64 * (Class23_Sub13_Sub13.anIntArray3996[i_1_] >> 8) - Class42.anInt662;
			int i_3_ = (Class23_Sub13_Sub13.anIntArray3996[i_1_] & 0xff) * 64 - Class58.anInt903;
			byte[] bs_4_ = bs[i_1_];
			if (bs_4_ != null) {
				method1150((byte) -59);
				Class27.method929(Class4.aClass72Array85, bs_4_, 8 * (-6 + Class64.anInt1138), i_3_, -125, bool, (Class23_Sub4_Sub23.anInt3279 - 6) * 8, i_2_);
			}
		}
		for (int i_5_ = 0; i_0_ > i_5_; i_5_++) {
			int i_6_ = (Class23_Sub13_Sub13.anIntArray3996[i_5_] >> 8) * 64 - Class42.anInt662;
			int i_7_ = -Class58.anInt903 + (0xff & Class23_Sub13_Sub13.anIntArray3996[i_5_]) * 64;
			byte[] bs_8_ = bs[i_5_];
			if (bs_8_ == null && Class64.anInt1138 < 800) {
				method1150((byte) 121);
				for (int i_9_ = 0; i_9_ < i; i_9_++)
					Class35.method980(-1, 64, i_9_, 64, i_6_, i_7_);
			}
		}
	}
	
	static final void method1150(byte b) {
		anInt743++;
		if (Class97.aClass6_1646 != null) {
			Class97.aClass6_1646.method85((byte) -39);
		}
		int i = -77 % ((-8 - b) / 42);
		if (CacheFileChannel.aClass6_471 != null) {
			CacheFileChannel.aClass6_471.method85((byte) -39);
		}
	}
	
	public static void method1151(byte b) {
		if (b != 74) {
			anInt749 = 38;
		}
		aClass16_745 = null;
		aClass16_747 = null;
		aClass16_748 = null;
		aClass16_746 = null;
	}
	
	static {
		anInt751 = -1;
		aClass16_748 = Class38_Sub6.method1076((byte) 86, "shake:");
		anInt749 = 0;
		aClass16_745 = aClass16_748;
		aClass16_746 = aClass16_748;
	}
}

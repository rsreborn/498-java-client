/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class44
{
	static int[] anIntArray672;
	static RSString aClass16_673;
	static Class105 aClass105_674;
	static int anInt675;
	private static RSString aClass16_676 = Class38_Sub6.method1076((byte) 86, "This world is running a closed Beta)3");
	static int anInt677;
	static RSString aClass16_678;
	static short[][] aShortArrayArray679;
	static int anInt680;
	
	public static void method1126(int i) {
		aShortArrayArray679 = null;
		aClass16_676 = null;
		aClass105_674 = null;
		aClass16_673 = null;
		anIntArray672 = null;
		if (i != 21150) {
			method1128(126);
		}
		aClass16_678 = null;
	}
	
	static final void method1127(int i, int i_0_, int i_1_) {
		Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_0_][i_1_];
		if (class23_sub1 != null) {
			class23_sub1.aClass24_2038 = null;
		}
	}
	
	static final void method1128(int i) {
		anInt680++;
		if ((Class23_Sub4_Sub31.anInt3400 ^ 0xffffffff) < -1) {
			Class23_Sub4_Sub15.method326(true);
		} else {
			Class103.method1521(40, 27172);
			Class23_Sub13_Sub20.aClass34_4150 = Class23_Sub24.aClass34_2440;
			Class23_Sub24.aClass34_2440 = null;
			int i_2_ = 4 % ((i - 59) / 56);
		}
	}
	
	static final void method1129(int i, int i_3_, byte b) {
		anInt675++;
		Class89 class89 = Class82.aClass89ArrayArrayArray1453[Class23_Sub13_Sub11.anInt3916][i][i_3_];
		if (class89 == null) {
			CacheFileChannel.method949(Class23_Sub13_Sub11.anInt3916, i, i_3_);
		} else {
			int i_4_ = -99999999;
			Class23_Sub13_Sub1 class23_sub13_sub1 = (Class23_Sub13_Sub1) class89.method1437(65);
			Class23_Sub13_Sub1 class23_sub13_sub1_5_ = null;
			for (/**/; class23_sub13_sub1 != null; class23_sub13_sub1 = (Class23_Sub13_Sub1) class89.method1431((byte) -89)) {
				Class23_Sub13_Sub11 class23_sub13_sub11 = Class23_Sub13_Sub24.method853(123, class23_sub13_sub1.aClass38_Sub2_3668.anInt2495);
				int i_6_ = class23_sub13_sub11.anInt3953;
				if (class23_sub13_sub11.anInt3895 == 1) {
					i_6_ *= class23_sub13_sub1.aClass38_Sub2_3668.anInt2499 - -1;
				}
				if ((i_6_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff)) {
					class23_sub13_sub1_5_ = class23_sub13_sub1;
					i_4_ = i_6_;
				}
			}
			if (class23_sub13_sub1_5_ == null) {
				CacheFileChannel.method949(Class23_Sub13_Sub11.anInt3916, i, i_3_);
			} else {
				if (b <= 112) {
					anIntArray672 = null;
				}
				class89.method1434(class23_sub13_sub1_5_, -1);
				class23_sub13_sub1 = (Class23_Sub13_Sub1) class89.method1437(-122);
				Class38_Sub2 class38_sub2 = null;
				Class38_Sub2 class38_sub2_7_ = null;
				for (/**/; class23_sub13_sub1 != null; class23_sub13_sub1 = (Class23_Sub13_Sub1) class89.method1431((byte) -89)) {
					Class38_Sub2 class38_sub2_8_ = class23_sub13_sub1.aClass38_Sub2_3668;
					if ((class38_sub2_8_.anInt2495 ^ 0xffffffff) != (class23_sub13_sub1_5_.aClass38_Sub2_3668.anInt2495 ^ 0xffffffff)) {
						if (class38_sub2 == null) {
							class38_sub2 = class38_sub2_8_;
						}
						if ((class38_sub2.anInt2495 ^ 0xffffffff) != (class38_sub2_8_.anInt2495 ^ 0xffffffff) && class38_sub2_7_ == null) {
							class38_sub2_7_ = class38_sub2_8_;
						}
					}
				}
				long l = (long) (1610612736 + ((i_3_ << 7) + i));
				Class39.method1103(Class23_Sub13_Sub11.anInt3916, i, i_3_, Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, 64 + i * 128, 64 + 128 * i_3_, (byte) -52), class23_sub13_sub1_5_.aClass38_Sub2_3668, l, class38_sub2, class38_sub2_7_);
			}
		}
	}
	
	static {
		aClass16_673 = Class38_Sub6.method1076((byte) 86, "Hidden)2");
		aClass16_678 = aClass16_676;
		anIntArray672 = new int[] { 2, 2, 4, 2, 1, 8, 4 };
	}
}

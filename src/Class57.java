/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class57
{
	static int anInt897;
	static RSString aClass16_898;
	private static RSString aClass16_899;
	static RSString aClass16_900 = Class38_Sub6.method1076((byte) 86, ":tradereq:");
	static int anInt901 = 0;
	static int anInt902;
	
	static final void method1189(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		if ((i_4_ ^ 0xffffffff) <= (Class23_Sub13_Sub6.anInt3728 ^ 0xffffffff) && (Class35.anInt554 ^ 0xffffffff) <= (i_4_ ^ 0xffffffff) && Class23_Sub13_Sub6.anInt3728 <= i_7_ && (i_7_ ^ 0xffffffff) >= (Class35.anInt554 ^ 0xffffffff) && i_8_ >= Class23_Sub13_Sub6.anInt3728 && Class35.anInt554 >= i_8_ && Class23_Sub13_Sub6.anInt3728 <= i_5_ && Class35.anInt554 >= i_5_ && (Class88.anInt1503 ^ 0xffffffff) >= (i_6_ ^ 0xffffffff) && (i_6_ ^ 0xffffffff) >= (Class23_Sub4_Sub33.anInt3435 ^ 0xffffffff) && i >= Class88.anInt1503 && Class23_Sub4_Sub33.anInt3435 >= i && i_0_ >= Class88.anInt1503 && (i_0_ ^ 0xffffffff) >= (Class23_Sub4_Sub33.anInt3435 ^ 0xffffffff) && (Class88.anInt1503 ^ 0xffffffff) >= (i_1_ ^ 0xffffffff) && (i_1_ ^ 0xffffffff) >= (Class23_Sub4_Sub33.anInt3435 ^ 0xffffffff)) {
			Class23_Sub13_Sub4.method620(i_1_, i_0_, i_3_, i_8_, i_7_, i_6_, i_4_, i_5_, (byte) -124, i);
		} else {
			Class78_Sub2.method1351(i_0_, i_7_, i, i_6_, (byte) 91, i_3_, i_1_, i_5_, i_4_, i_8_);
		}
		if (i_2_ == -2) {
			anInt902++;
		}
	}
	
	public static void method1190(byte b) {
		aClass16_898 = null;
		if (b != 107) {
			method1190((byte) -109);
		}
		aClass16_899 = null;
		aClass16_900 = null;
	}
	
	static final void method1191(int i, Class38_Sub7_Sub1 class38_sub7_sub1, int i_9_, int i_10_) {
		if (i_10_ == -1) {
			anInt897++;
			if ((class38_sub7_sub1.anInt2693 ^ 0xffffffff) == (i ^ 0xffffffff) && i != -1) {
				Class23_Sub13_Sub22 class23_sub13_sub22 = Class7.method90(i, (byte) 81);
				int i_11_ = class23_sub13_sub22.anInt4228;
				if (i_11_ == 1) {
					class38_sub7_sub1.anInt2709 = 0;
					class38_sub7_sub1.anInt2643 = 0;
					class38_sub7_sub1.anInt2706 = i_9_;
					class38_sub7_sub1.anInt2664 = 0;
					Class21.method223(false, class38_sub7_sub1.anInt2709, class38_sub7_sub1.anInt2674, (byte) 75, class38_sub7_sub1.anInt2659, class23_sub13_sub22);
				}
				if (i_11_ == 2) {
					class38_sub7_sub1.anInt2643 = 0;
				}
			} else if (i == -1 || class38_sub7_sub1.anInt2693 == -1 || (Class7.method90(i, (byte) 74).anInt4217 ^ 0xffffffff) <= (Class7.method90(class38_sub7_sub1.anInt2693, (byte) 119).anInt4217 ^ 0xffffffff)) {
				class38_sub7_sub1.anInt2693 = i;
				class38_sub7_sub1.anInt2706 = i_9_;
				class38_sub7_sub1.anInt2640 = class38_sub7_sub1.anInt2660;
				class38_sub7_sub1.anInt2643 = 0;
				class38_sub7_sub1.anInt2709 = 0;
				class38_sub7_sub1.anInt2664 = 0;
				if ((class38_sub7_sub1.anInt2693 ^ 0xffffffff) != 0) {
					Class21.method223(false, class38_sub7_sub1.anInt2709, class38_sub7_sub1.anInt2674, (byte) 120, class38_sub7_sub1.anInt2659, Class7.method90(class38_sub7_sub1.anInt2693, (byte) 76));
				}
			}
		}
	}
	
	static {
		aClass16_899 = Class38_Sub6.method1076((byte) 86, "You have only just left another world)3");
		aClass16_898 = aClass16_899;
	}
}

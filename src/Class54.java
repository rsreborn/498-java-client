/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class54
{
	static RSString aClass16_850 = Class38_Sub6.method1076((byte) 86, "p11_full");
	static int anInt851;
	static Class23_Sub13_Sub8_Sub1_Sub1 aClass23_Sub13_Sub8_Sub1_Sub1_852;
	static Class105_Sub1[] aClass105_Sub1Array853;
	static int anInt854;
	static int anInt855;
	static RSString aClass16_856;
	static int[] anIntArray857 = new int[1000];
	static int[] anIntArray858;
	static boolean[] aBooleanArray859;
	static RSString aClass16_860;
	static int[][][] anIntArrayArrayArray861;
	static int anInt862;
	
	static final void method1174(int i, int i_0_, int i_1_) {
		Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_0_][i_1_];
		if (class23_sub1 != null) {
			class23_sub1.aClass83_2031 = null;
		}
	}
	
	static final void method1175(int i, int[][] is) {
		if (i != 4) {
			method1174(-31, 113, 86);
		}
		anInt855++;
		Class4.anIntArrayArray98 = is;
	}
	
	public static void method1176(byte b) {
		int i = -6 % ((b - 1) / 45);
		anIntArray857 = null;
		aClass16_860 = null;
		aClass23_Sub13_Sub8_Sub1_Sub1_852 = null;
		anIntArray858 = null;
		aBooleanArray859 = null;
		aClass16_850 = null;
		anIntArrayArrayArray861 = null;
		aClass16_856 = null;
		aClass105_Sub1Array853 = null;
	}
	
	static final void method1177(int i, int i_2_, int i_3_, int i_4_, int i_5_, Class38_Sub7 class38_sub7, int i_6_) {
		if (i_2_ == 0) {
			anInt854++;
			Class74.method1314(i, i_6_, i_3_, class38_sub7.anInt2674, i_5_, -16734, i_4_, class38_sub7.anInt2659);
		}
	}
	
	static final RSString method1178(int i, Class64 class64, RSString class16) {
		if (i != 12445) {
			return null;
		}
		anInt851++;
		if ((class16.method173(41, Class105_Sub1.aClass16_2867) ^ 0xffffffff) != 0) {
			for (;;) {
				int i_7_ = class16.method173(i ^ 0x30b8, Class27.aClass16_413);
				if ((i_7_ ^ 0xffffffff) == 0) {
					break;
				}
				class16 = Class23_Sub4_Sub14.method322(new RSString[] { class16.method148(i_7_, 0, true), Class35.method981((byte) 103, Class17_Sub1.method192(-26, 0, class64)), class16.method138((byte) 71, i_7_ - -2) }, -26);
			}
			for (;;) {
				int i_8_ = class16.method173(45, Class74.aClass16_1360);
				if (i_8_ == -1) {
					break;
				}
				class16 = Class23_Sub4_Sub14.method322(new RSString[] { class16.method148(i_8_, 0, true), Class35.method981((byte) 103, Class17_Sub1.method192(i ^ ~0x3084, 1, class64)), class16.method138((byte) 67, i_8_ - -2) }, -22);
			}
			for (;;) {
				int i_9_ = class16.method173(66, RSString.aClass16_1946);
				if ((i_9_ ^ 0xffffffff) == 0) {
					break;
				}
				class16 = Class23_Sub4_Sub14.method322(new RSString[] { class16.method148(i_9_, 0, true), Class35.method981((byte) 103, Class17_Sub1.method192(i + -12471, 2, class64)), class16.method138((byte) 88, 2 + i_9_) }, -25);
			}
			for (;;) {
				int i_10_ = class16.method173(119, Class23_Sub4_Sub20.aClass16_3237);
				if (i_10_ == -1) {
					break;
				}
				class16 = Class23_Sub4_Sub14.method322(new RSString[] { class16.method148(i_10_, 0, true), Class35.method981((byte) 103, Class17_Sub1.method192(-26, 3, class64)), class16.method138((byte) 120, i_10_ + 2) }, i + -12454);
			}
			for (;;) {
				int i_11_ = class16.method173(54, Class49.aClass16_753);
				if ((i_11_ ^ 0xffffffff) == 0) {
					break;
				}
				class16 = Class23_Sub4_Sub14.method322(new RSString[] { class16.method148(i_11_, 0, true), Class35.method981((byte) 103, Class17_Sub1.method192(-26, 4, class64)), class16.method138((byte) 98, i_11_ - -2) }, i ^ ~0x30f5);
			}
			for (;;) {
				int i_12_ = class16.method173(120, Class23_Sub13_Sub15.aClass16_4035);
				if (i_12_ == -1) {
					break;
				}
				RSString class16_13_ = Class23_Sub4_Sub38.aClass16_3509;
				if (Class23_Sub13_Sub11.aClass60_3944 != null) {
					class16_13_ = Class78_Sub2.method1354(i ^ 0x3062, Class23_Sub13_Sub11.aClass60_3944.anInt952);
					try {
						if (Class23_Sub13_Sub11.aClass60_3944.anObject955 != null) {
							byte[] bs = ((String) Class23_Sub13_Sub11.aClass60_3944.anObject955).getBytes("ISO-8859-1");
							class16_13_ = Class46.method1139(bs, 0, bs.length, 0);
						}
					} catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
						/* empty */
					}
				}
				class16 = Class23_Sub4_Sub14.method322(new RSString[] { class16.method148(i_12_, 0, true), class16_13_, class16.method138((byte) 109, i_12_ - -4) }, i ^ ~0x30c3);
			}
		}
		return class16;
	}
	
	static {
		aClass105_Sub1Array853 = new Class105_Sub1[256];
		anIntArray858 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
		aClass16_856 = Class38_Sub6.method1076((byte) 86, "::tele 0)1");
		aClass16_860 = Class38_Sub6.method1076((byte) 86, "mod_icons");
	}
}

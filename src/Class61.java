/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class61
{
	static int anInt956;
	static int anInt957;
	static Class105 aClass105_958;
	static Class64 aClass64_959;
	static RSString aClass16_960;
	static RSString aClass16_961;
	static Class84 aClass84_962;
	static int anInt963;
	static int anInt964;
	static int anInt965;
	static RSString aClass16_966 = Class38_Sub6.method1076((byte) 86, "Bitte benutzen Sie eine andere Welt)3");
	static int[] anIntArray967;
	private static RSString aClass16_968;
	private static RSString aClass16_969;
	static RSString aClass16_970 = Class38_Sub6.method1076((byte) 86, "Mitglieder)2Welt");
	
	static final void method1197(boolean bool, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		Class71_Sub2.aClass43Array2739[0].method1119(i_0_, i_3_);
		anInt957++;
		Class71_Sub2.aClass43Array2739[1].method1119(i_0_, -16 + (i + i_3_));
		int i_4_ = i * (i - 32) / i_1_;
		if (i_4_ < 8) {
			i_4_ = 8;
		}
		int i_5_ = i_2_ * (-32 + i - i_4_) / (i_1_ - i);
		if (bool != true) {
			aClass105_958 = null;
		}
		Class20.method222(i_0_, i_3_ - -16, 16, -32 + i, Class23_Sub1.anInt2012);
		Class20.method222(i_0_, i_5_ + 16 + i_3_, 16, i_4_, Class106.anInt1827);
		Class20.method211(i_0_, i_5_ + 16 + i_3_, i_4_, Class23_Sub4_Sub25.anInt3309);
		Class20.method211(1 + i_0_, i_3_ + (16 - -i_5_), i_4_, Class23_Sub4_Sub25.anInt3309);
		Class20.method207(i_0_, 16 + i_3_ + i_5_, 16, Class23_Sub4_Sub25.anInt3309);
		Class20.method207(i_0_, i_5_ + i_3_ - -17, 16, Class23_Sub4_Sub25.anInt3309);
		Class20.method211(15 + i_0_, i_5_ + i_3_ + 16, i_4_, Class23_Sub13_Sub8_Sub1.anInt4487);
		Class20.method211(i_0_ - -14, 17 + i_3_ + i_5_, i_4_ - 1, Class23_Sub13_Sub8_Sub1.anInt4487);
		Class20.method207(i_0_, i_4_ + i_5_ + (15 + i_3_), 16, Class23_Sub13_Sub8_Sub1.anInt4487);
		Class20.method207(1 + i_0_, i_4_ + (i_5_ + 14 + i_3_), 15, Class23_Sub13_Sub8_Sub1.anInt4487);
	}
	
	static final void method1198(int i) {
		int i_6_ = -(int) ((double) Class23_Sub13_Sub12.aClass64_3967.anInt1128 / Class107.aDouble1838) + Canvas_Sub1.anInt55;
		anInt964++;
		if (i == 15) {
			int i_7_ = Canvas_Sub1.anInt55 + (int) ((double) Class23_Sub13_Sub12.aClass64_3967.anInt1128 / Class107.aDouble1838);
			int i_8_ = -(int) ((double) Class23_Sub13_Sub12.aClass64_3967.anInt999 / Class107.aDouble1838) + Class8.anInt179;
			if (i_6_ < 0) {
				Canvas_Sub1.anInt55 = (int) ((double) Class23_Sub13_Sub12.aClass64_3967.anInt1128 / Class107.aDouble1838);
				Class68.anInt1203 = -1;
				Class75.anInt1381 = -1;
			}
			int i_9_ = (int) ((double) Class23_Sub13_Sub12.aClass64_3967.anInt999 / Class107.aDouble1838) + Class8.anInt179;
			if ((Class70.anInt1238 ^ 0xffffffff) > (i_7_ ^ 0xffffffff)) {
				Canvas_Sub1.anInt55 = -(int) ((double) Class23_Sub13_Sub12.aClass64_3967.anInt1128 / Class107.aDouble1838) + Class70.anInt1238;
				Class75.anInt1381 = -1;
				Class68.anInt1203 = -1;
			}
			if ((i_8_ ^ 0xffffffff) > -1) {
				Class68.anInt1203 = -1;
				Class8.anInt179 = (int) ((double) Class23_Sub13_Sub12.aClass64_3967.anInt999 / Class107.aDouble1838);
				Class75.anInt1381 = -1;
			}
			if (i_9_ > Class38_Sub7.anInt2697) {
				Class75.anInt1381 = -1;
				Class8.anInt179 = -(int) ((double) Class23_Sub13_Sub12.aClass64_3967.anInt999 / Class107.aDouble1838) + Class38_Sub7.anInt2697;
				Class68.anInt1203 = -1;
			}
		}
	}
	
	static final void method1199(int i, boolean bool, RSString class16) {
		Class30.anInt473++;
		Class23_Sub7.outBuffer.method486(68, 2976);
		anInt965++;
		Class23_Sub7.outBuffer.writeByte(i);
		Class23_Sub7.outBuffer.method454(class16.method184(114), 1650435232);
		if (bool != false) {
			method1200((byte) -59);
		}
	}
	
	public static void method1200(byte b) {
		aClass16_969 = null;
		aClass16_968 = null;
		aClass105_958 = null;
		aClass16_970 = null;
		int i = 63 / ((-9 - b) / 58);
		aClass16_961 = null;
		aClass84_962 = null;
		aClass64_959 = null;
		aClass16_966 = null;
		anIntArray967 = null;
		aClass16_960 = null;
	}
	
	static {
		aClass16_969 = Class38_Sub6.method1076((byte) 86, "Connecting to update server");
		aClass16_960 = aClass16_969;
		aClass16_968 = Class38_Sub6.method1076((byte) 86, "Loaded wordpack");
		aClass16_961 = aClass16_968;
	}
}

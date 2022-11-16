/* Class38_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class38_Sub5 extends Class38
{
	private double aDouble2568;
	private int anInt2569;
	protected double aDouble2570;
	private static RSString aClass16_2571;
	private int anInt2572 = 0;
	protected double aDouble2573;
	private int anInt2574;
	protected double aDouble2575;
	static int anInt2576;
	private double aDouble2577;
	private int anInt2578 = 0;
	static int anInt2579;
	protected int anInt2580;
	private int anInt2581;
	protected int anInt2582;
	private int anInt2583;
	static RSString aClass16_2584;
	static int anInt2585;
	protected int anInt2586;
	protected int anInt2587;
	static int anInt2588;
	static RSString aClass16_2589;
	private double aDouble2590;
	static int anInt2591;
	private double aDouble2592;
	protected int anInt2593;
	private Class23_Sub13_Sub22 aClass23_Sub13_Sub22_2594;
	private double aDouble2595;
	private int anInt2596;
	static int[] anIntArray2597 = new int[5];
	private int anInt2598;
	private boolean aBoolean2599;
	private int anInt2600;
	static int anInt2601;
	private int anInt2602 = -32768;
	static short[] aShortArray2603 = new short[500];
	static int anInt2604;
	protected int anInt2605;
	static int anInt2606;
	
	static final void method1068(byte b, RSString class16) {
		Class23_Sub21 class23_sub21 = Class71_Sub1.method1269(class16, (byte) 79);
		anInt2588++;
		if (class23_sub21 != null) {
			Class75.anInt1381 = Class29.anInt445 - -Class38_Sub7.anInt2697 + -class23_sub21.anInt2415;
			Class68.anInt1203 = -Class102.anInt1702 + class23_sub21.anInt2412;
			int i = -111 % ((b - -20) / 54);
			int i_0_ = Class68.anInt1203 + -(int) ((double) Class23_Sub13_Sub12.aClass64_3967.anInt1128 / Class107.aDouble1838);
			int i_1_ = Class68.anInt1203 + (int) ((double) Class23_Sub13_Sub12.aClass64_3967.anInt1128 / Class107.aDouble1838);
			if (i_0_ < 0) {
				Class68.anInt1203 = (int) ((double) Class23_Sub13_Sub12.aClass64_3967.anInt1128 / Class107.aDouble1838);
			}
			if ((i_1_ ^ 0xffffffff) < (Class70.anInt1238 ^ 0xffffffff)) {
				Class68.anInt1203 = -(int) ((double) Class23_Sub13_Sub12.aClass64_3967.anInt1128 / Class107.aDouble1838) + Class70.anInt1238;
			}
			int i_2_ = -(int) ((double) Class23_Sub13_Sub12.aClass64_3967.anInt999 / Class107.aDouble1838) + Class75.anInt1381;
			int i_3_ = Class75.anInt1381 - -(int) ((double) Class23_Sub13_Sub12.aClass64_3967.anInt999 / Class107.aDouble1838);
			if (i_2_ < 0) {
				Class75.anInt1381 = (int) ((double) Class23_Sub13_Sub12.aClass64_3967.anInt999 / Class107.aDouble1838);
			}
			if (Class38_Sub7.anInt2697 < i_3_) {
				Class75.anInt1381 = Class38_Sub7.anInt2697 - (int) ((double) Class23_Sub13_Sub12.aClass64_3967.anInt999 / Class107.aDouble1838);
			}
		}
	}
	
	final void method1069(int i, int i_4_, int i_5_, int i_6_, int i_7_) {
		if (!aBoolean2599) {
			double d = (double) (-anInt2600 + i_4_);
			double d_8_ = (double) (i_5_ + -anInt2569);
			double d_9_ = Math.sqrt(d * d + d_8_ * d_8_);
			aDouble2573 = (double) anInt2581;
			aDouble2570 = (double) anInt2569 + d_8_ * (double) anInt2583 / d_9_;
			aDouble2575 = (double) anInt2583 * d / d_9_ + (double) anInt2600;
		}
		anInt2585++;
		double d = (double) (-i + (1 + anInt2586));
		aDouble2577 = (-aDouble2570 + (double) i_5_) / d;
		aDouble2590 = ((double) i_4_ - aDouble2575) / d;
		if (i_7_ != -18499) {
			method1074(-50, false);
		}
		aDouble2595 = Math.sqrt(aDouble2577 * aDouble2577 + aDouble2590 * aDouble2590);
		if (!aBoolean2599) {
			aDouble2592 = -aDouble2595 * Math.tan(0.02454369 * (double) anInt2574);
		}
		aDouble2568 = (-(d * aDouble2592) + (-aDouble2573 + (double) i_6_)) * 2.0 / (d * d);
	}
	
	final void method995(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, long l) {
		Class38_Sub1 class38_sub1 = method1070(36);
		anInt2606++;
		if (class38_sub1 != null) {
			class38_sub1.method995(i, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_, l);
			anInt2602 = class38_sub1.method999();
		}
	}
	
	final int method999() {
		anInt2601++;
		return anInt2602;
	}
	
	private final Class38_Sub1 method1070(int i) {
		Class23_Sub13_Sub17 class23_sub13_sub17 = Class23_Sub13_Sub21.method827(anInt2598, (byte) -118);
		anInt2591++;
		Class38_Sub1 class38_sub1 = class23_sub13_sub17.method787(anInt2578, (byte) 95);
		if (class38_sub1 == null) {
			return null;
		}
		int i_17_ = -9 % ((i - -11) / 38);
		class38_sub1.method1019(anInt2596);
		return class38_sub1;
	}
	
	static final int method1071(int i, int i_18_) {
		if (i >= -90) {
			aClass16_2571 = null;
		}
		anInt2576++;
		return 0xff & i_18_;
	}
	
	final void method1072(int i, int i_19_) {
		aDouble2575 += (double) i * aDouble2590;
		aDouble2573 += aDouble2592 * (double) i + (double) i * (aDouble2568 * 0.5) * (double) i;
		aBoolean2599 = true;
		aDouble2592 += aDouble2568 * (double) i;
		aDouble2570 += aDouble2577 * (double) i;
		anInt2587 = (int) (Math.atan2(aDouble2577, aDouble2590) * 325.949) + 1024 & 0x7ff;
		anInt2596 = (int) (Math.atan2(aDouble2592, aDouble2595) * 325.949) & 0x7ff;
		if (i_19_ == 12891) {
			if (aClass23_Sub13_Sub22_2594 != null) {
				anInt2572 += i;
				while (anInt2572 > aClass23_Sub13_Sub22_2594.anIntArray4204[anInt2578]) {
					anInt2572 -= aClass23_Sub13_Sub22_2594.anIntArray4204[anInt2578];
					anInt2578++;
					if (aClass23_Sub13_Sub22_2594.anIntArray4203.length <= anInt2578) {
						anInt2578 -= aClass23_Sub13_Sub22_2594.anInt4223;
						if ((anInt2578 ^ 0xffffffff) > -1 || (aClass23_Sub13_Sub22_2594.anIntArray4203.length ^ 0xffffffff) >= (anInt2578 ^ 0xffffffff)) {
							anInt2578 = 0;
						}
					}
				}
			}
			anInt2604++;
		}
	}
	
	public static void method1073(byte b) {
		aClass16_2571 = null;
		if (b != -113) {
			method1073((byte) -112);
		}
		aShortArray2603 = null;
		anIntArray2597 = null;
		aClass16_2584 = null;
		aClass16_2589 = null;
	}
	
	static final void method1074(int i, boolean bool) {
		anInt2579++;
		byte[][] bs = Class23_Sub8.aByteArrayArray2235;
		int i_20_ = Class53.aByteArrayArray843.length;
		if (i != 21601) {
			method1068((byte) 59, null);
		}
		for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > (i_20_ ^ 0xffffffff); i_21_++) {
			byte[] bs_22_ = bs[i_21_];
			if (bs_22_ != null) {
				int i_23_ = -Class58.anInt903 + (Class23_Sub13_Sub13.anIntArray3996[i_21_] & 0xff) * 64;
				int i_24_ = -Class42.anInt662 + (Class23_Sub13_Sub13.anIntArray3996[i_21_] >> 8) * 64;
				Class48.method1150((byte) -107);
				Class23_Sub13_Sub12.method748(i_23_, Class4.aClass72Array85, i_24_, (byte) -103, bool, bs_22_);
			}
		}
	}
	
	Class38_Sub5(int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_) {
		aBoolean2599 = false;
		aBoolean2599 = false;
		anInt2574 = i_31_;
		anInt2600 = i_27_;
		anInt2598 = i;
		anInt2605 = i_25_;
		anInt2581 = i_28_;
		anInt2582 = i_33_;
		anInt2580 = i_29_;
		anInt2569 = i_26_;
		anInt2583 = i_32_;
		anInt2586 = i_30_;
		anInt2593 = i_34_;
		int i_35_ = Class23_Sub13_Sub21.method827(anInt2598, (byte) -114).anInt4059;
		if (i_35_ != -1) {
			aClass23_Sub13_Sub22_2594 = Class7.method90(i_35_, (byte) 70);
		} else {
			aClass23_Sub13_Sub22_2594 = null;
		}
	}
	
	static {
		aClass16_2571 = Class38_Sub6.method1076((byte) 86, "Please contact customer support)3");
		aClass16_2589 = Class38_Sub6.method1076((byte) 86, "rot:");
		aClass16_2584 = aClass16_2571;
	}
}

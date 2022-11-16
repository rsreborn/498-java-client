/* Class38_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class38_Sub2 extends Class38
{
	static boolean aBoolean2490;
	static int anInt2491;
	static int anInt2492;
	static int anInt2493;
	private int anInt2494 = -32768;
	protected int anInt2495;
	static int anInt2496;
	static short[][] aShortArrayArray2497 = { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };
	static int anInt2498;
	protected int anInt2499;
	static int anInt2500;
	static int anInt2501;
	static int[] anIntArray2502 = new int[500];
	static int anInt2503 = 0;
	
	final int method999() {
		anInt2491++;
		return anInt2494;
	}
	
	static final void method1034(int i, boolean bool, RSString[] class16s, int i_0_, short[] ses) {
		if (bool != false) {
			method1036((byte) 96, null);
		}
		anInt2496++;
		if ((i_0_ ^ 0xffffffff) < (i ^ 0xffffffff)) {
			int i_1_ = (i_0_ + i) / 2;
			int i_2_ = i;
			RSString class16 = class16s[i_1_];
			class16s[i_1_] = class16s[i_0_];
			class16s[i_0_] = class16;
			short s = ses[i_1_];
			ses[i_1_] = ses[i_0_];
			ses[i_0_] = s;
			for (int i_3_ = i; (i_3_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff); i_3_++) {
				if (class16 == null || class16s[i_3_] != null && (class16s[i_3_].method151(!bool, class16) ^ 0xffffffff) > (i_3_ & 0x1 ^ 0xffffffff)) {
					RSString class16_4_ = class16s[i_3_];
					class16s[i_3_] = class16s[i_2_];
					class16s[i_2_] = class16_4_;
					short s_5_ = ses[i_3_];
					ses[i_3_] = ses[i_2_];
					ses[i_2_++] = s_5_;
				}
			}
			class16s[i_0_] = class16s[i_2_];
			class16s[i_2_] = class16;
			ses[i_0_] = ses[i_2_];
			ses[i_2_] = s;
			method1034(i, false, class16s, -1 + i_2_, ses);
			method1034(1 + i_2_, bool, class16s, i_0_, ses);
		}
	}
	
	final void method995(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, long l) {
		anInt2500++;
		Class38_Sub1 class38_sub1 = Class23_Sub13_Sub24.method853(-75, anInt2495).method741(-17838, 0, anInt2499, null);
		if (class38_sub1 != null) {
			class38_sub1.method995(i, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, l);
			anInt2494 = class38_sub1.method999();
		}
	}
	
	public static void method1035(int i) {
		anIntArray2502 = null;
		aShortArrayArray2497 = null;
		if (i <= 83) {
			method1036((byte) -25, null);
		}
	}
	
	static final void method1036(byte b, byte[] bs) {
		anInt2501++;
		int i = 0;
		if (b == 120) {
			while (bs.length > i) {
				int i_13_ = -Class102.anInt1702 + (bs[i++] & 0xff) * 64;
				int i_14_ = (0xff & bs[i++]) * 64 + -Class29.anInt445;
				if ((i_13_ ^ 0xffffffff) < -1 && i_14_ > 0 && Class70.anInt1238 > i_13_ - -64 && (Class38_Sub7.anInt2697 ^ 0xffffffff) < (i_14_ + 64 ^ 0xffffffff)) {
					int i_15_ = i_13_ >> 6;
					int i_16_ = -1 + (Class38_Sub7.anInt2697 + -i_14_) >> 6;
					for (int i_17_ = 0; i_17_ < 64; i_17_++) {
						for (int i_18_ = -64; i_18_ < 0; i_18_++) {
							byte b_19_ = bs[i++];
							if ((b_19_ ^ 0xffffffff) != -1) {
								if (Class23_Sub4_Sub35.aByteArrayArrayArray3457[i_15_][i_16_] == null) {
									Class23_Sub4_Sub35.aByteArrayArrayArray3457[i_15_][i_16_] = new byte[4096];
								}
								Class23_Sub4_Sub35.aByteArrayArrayArray3457[i_15_][i_16_][(-(1 - -i_18_) << 6) - -i_17_] = b_19_;
								byte b_20_ = bs[i++];
								if (Class47.aByteArrayArrayArray737[i_15_][i_16_] == null) {
									Class47.aByteArrayArrayArray737[i_15_][i_16_] = new byte[4096];
								}
								Class47.aByteArrayArrayArray737[i_15_][i_16_][(-(i_18_ + 1) << 6) - -i_17_] = b_20_;
							}
						}
					}
				} else {
					for (int i_21_ = -4096; i_21_ < 0; i_21_++) {
						int i_22_ = bs[i++];
						if (i_22_ != 0) {
							i++;
						}
					}
				}
			}
		}
	}
	
	static final Class23_Sub13_Sub7 method1037(int i, int i_23_) {
		anInt2492++;
		Class23_Sub13_Sub7 class23_sub13_sub7 = (Class23_Sub13_Sub7) Class26.aClass5_395.method62(-33, (long) i);
		if (class23_sub13_sub7 != null) {
			return class23_sub13_sub7;
		}
		byte[] bs = Class23_Sub13_Sub4.aClass105_3717.method1544(Class38_Sub5.method1071(i_23_ ^ 0x525e, i), i_23_ + 21035, Class23_Sub13_Sub12.method744(1782395528, i));
		class23_sub13_sub7 = new Class23_Sub13_Sub7();
		class23_sub13_sub7.anInt3791 = i;
		if (bs != null) {
			class23_sub13_sub7.method641(new Buffer(bs), 1);
		}
		class23_sub13_sub7.method643(-92);
		if (class23_sub13_sub7.aBoolean3758) {
			class23_sub13_sub7.anInt3806 = 0;
			class23_sub13_sub7.aBoolean3763 = false;
		}
		if (!Class38_Sub7_Sub1.aBoolean4372 && class23_sub13_sub7.aBoolean3759) {
			class23_sub13_sub7.aClass16Array3800 = null;
		}
		Class26.aClass5_395.method67((long) i, class23_sub13_sub7, true);
		if (i_23_ != -21035) {
			return null;
		}
		return class23_sub13_sub7;
	}
	
	Class38_Sub2() {
		/* empty */
	}
}

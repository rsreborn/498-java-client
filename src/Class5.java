/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class5
{
	private static RSString aClass16_102 = Class38_Sub6.method1076((byte) 86, "Type");
	private Class23_Sub13 aClass23_Sub13_103 = new Class23_Sub13();
	static int anInt104;
	static int anInt105;
	static int anInt106;
	static int anInt107;
	static RSString aClass16_108;
	static int anInt109;
	static int anInt110;
	static RSString aClass16_111;
	static int anInt112;
	static RSString aClass16_113;
	static RSString aClass16_114 = aClass16_102;
	static int anInt115;
	static RSString aClass16_116;
	static int anInt117;
	static Class105_Sub1 aClass105_Sub1_118;
	private static RSString aClass16_119;
	static int anInt120;
	private Class27 aClass27_121 = new Class27();
	private int anInt122;
	private oa anOa123;
	static int anInt124;
	private int anInt125;
	
	final Class23_Sub13 method62(int i, long l) {
		anInt124++;
		Class23_Sub13 class23_sub13 = (Class23_Sub13) anOa123.a((byte) 114, l);
		int i_0_ = 78 % ((66 - i) / 50);
		if (class23_sub13 != null) {
			aClass27_121.method931(class23_sub13, (byte) 65);
		}
		return class23_sub13;
	}
	
	static final void method63(Class64 class64, int i, int i_1_, int i_2_, int i_3_, Class23_Sub13_Sub10 class23_sub13_sub10, int i_4_) {
		anInt115++;
		if (class23_sub13_sub10 != null) {
			int i_5_ = 0x7ff & Class35.anInt550 + Class23_Sub4_Sub16.anInt3162;
			int i_6_ = 10 + Math.max(class64.anInt1128 / 2, class64.anInt999 / 2);
			int i_7_ = i_3_ * i_3_ + i_1_ * i_1_;
			if (i_7_ <= i_6_ * i_6_) {
				int i_8_ = Class76.anIntArray1386[i_5_];
				if (i_2_ != 90) {
					method64(26);
				}
				int i_9_ = Class76.anIntArray1395[i_5_];
				i_8_ = i_8_ * 256 / (256 + Class38_Sub7_Sub2.anInt4410);
				i_9_ = 256 * i_9_ / (Class38_Sub7_Sub2.anInt4410 - -256);
				int i_10_ = i_3_ * i_9_ + i_8_ * i_1_ >> 16;
				int i_11_ = i_9_ * i_1_ + -(i_8_ * i_3_) >> 16;
				((Class23_Sub13_Sub10_Sub1) class23_sub13_sub10).method721(i_4_ + class64.anInt1128 / 2 + i_10_ + -(class23_sub13_sub10.anInt3879 / 2), -(class23_sub13_sub10.anInt3885 / 2) + i - -(class64.anInt999 / 2) + -i_11_, class64.anIntArray1064, class64.anIntArray1109);
			}
		}
	}
	
	public static void method64(int i) {
		if (i >= -48) {
			method63(null, 5, 14, -11, -5, null, -25);
		}
		aClass16_116 = null;
		aClass16_114 = null;
		aClass16_113 = null;
		aClass16_102 = null;
		aClass16_108 = null;
		aClass105_Sub1_118 = null;
		aClass16_119 = null;
		aClass16_111 = null;
	}
	
	final Class23 method65(int i) {
		if (i != -1) {
			anInt122 = -120;
		}
		anInt105++;
		return anOa123.a(true);
	}
	
	static final boolean method66(int i, int i_12_, int i_13_, int i_14_, boolean bool, boolean bool_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_) {
		anInt110++;
		if (bool_15_ != false) {
			method64(95);
		}
		if (Class105.aClass38_Sub7_Sub2_1812.anInt2668 != 2) {
			if (Class105.aClass38_Sub7_Sub2_1812.anInt2668 > 2) {
				return Class88.method1430(i_13_, i_16_, -29517, i_20_, i_18_, Class105.aClass38_Sub7_Sub2_1812.anInt2668, i, i_12_, i_14_, i_19_, i_21_, bool, i_17_);
			}
		} else {
			return Class23_Sub10_Sub3.method587(i_17_, i_12_, i_20_, i_18_, i_16_, bool, 83, i_19_, i_14_, i_21_, i_13_, i);
		}
		return Class35.method982(i_16_, i_14_, i_20_, i_13_, bool, i_18_, i_21_, i_17_, false, i_19_, i, i_12_);
	}
	
	final void method67(long l, Class23_Sub13 class23_sub13, boolean bool) {
		if (bool == true) {
			if ((anInt125 ^ 0xffffffff) == -1) {
				Class23_Sub13 class23_sub13_22_ = aClass27_121.method930(-91);
				class23_sub13_22_.method228(0);
				class23_sub13_22_.method601(!bool);
				if (aClass23_Sub13_103 == class23_sub13_22_) {
					class23_sub13_22_ = aClass27_121.method930(-91);
					class23_sub13_22_.method228(0);
					class23_sub13_22_.method601(false);
				}
			} else {
				anInt125--;
			}
			anInt112++;
			anOa123.a(class23_sub13, (byte) -14, l);
			aClass27_121.method931(class23_sub13, (byte) 93);
		}
	}
	
	final void method68(int i) {
		for (;;) {
			Class23_Sub13 class23_sub13 = aClass27_121.method930(-127);
			if (class23_sub13 == null) {
				break;
			}
			class23_sub13.method228(0);
			class23_sub13.method601(false);
		}
		if (i != 0) {
			aClass23_Sub13_103 = null;
		}
		anInt107++;
		anInt125 = anInt122;
	}
	
	final Class23 method69(int i) {
		if (i < 97) {
			aClass16_113 = null;
		}
		anInt117++;
		return anOa123.a((byte) -25);
	}
	
	final void method70(long l, int i) {
		anInt120++;
		if (i != 2047) {
			method65(-106);
		}
		Class23_Sub13 class23_sub13 = (Class23_Sub13) anOa123.a((byte) 109, l);
		if (class23_sub13 != null) {
			class23_sub13.method228(0);
			class23_sub13.method601(false);
			anInt125++;
		}
	}
	
	Class5(int i) {
		anInt125 = i;
		anInt122 = i;
		int i_23_;
		for (i_23_ = 1; (i_23_ + i_23_ ^ 0xffffffff) > (i ^ 0xffffffff); i_23_ += i_23_) {
			/* empty */
		}
		anOa123 = new oa(i_23_);
	}
	
	static {
		aClass16_113 = Class38_Sub6.method1076((byte) 86, "(R");
		aClass16_116 = Class38_Sub6.method1076((byte) 86, "labels)3dat");
		aClass16_108 = Class38_Sub6.method1076((byte) 86, "Welt");
		aClass16_119 = Class38_Sub6.method1076((byte) 86, "Too many connections from your address)3");
		aClass16_111 = aClass16_119;
	}
}

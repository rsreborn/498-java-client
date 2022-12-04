/* Class23_Sub4_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub21 extends Class23_Sub4
{
	static int anInt3240;
	private static RSString aClass16_3241;
	static int anInt3242;
	static int anInt3243;
	static RSString aClass16_3244;
	private static RSString aClass16_3245;
	static int anInt3246;
	static int anInt3247;
	static RSString aClass16_3248 = Class38_Sub6.method1076((byte) 86, " )2> <col=ffff00>");
	private int anInt3249 = 0;
	private int anInt3250;
	static int anInt3251;
	private int anInt3252;
	static RSString aClass16_3253;
	private int anInt3254 = 0;
	static RSString aClass16_3255;
	
	static final void method350(int i, RSString class16) {
		anInt3251++;
		Class23_Sub8.aClass16_2248 = class16;
		if (i != -314128180) {
			aClass16_3253 = null;
		}
		Class23_Sub4_Sub22.method355((byte) -94);
	}
	
	static final void method351(Class64 class64, boolean bool) {
		int i = class64.anInt1129 == 0 ? class64.anInt1128 : class64.anInt1129;
		anInt3242++;
		int i_0_ = (class64.anInt1088 ^ 0xffffffff) != -1 ? class64.anInt1088 : class64.anInt999;
		Class23_Sub4_Sub31.method399(Class23_Sub4_Sub28.aClass64ArrayArray3350[class64.anInt1098 >> 16], i_0_, i, class64.anInt1098, bool);
		if (class64.aClass64Array1131 != null) {
			Class23_Sub4_Sub31.method399(class64.aClass64Array1131, i_0_, i, class64.anInt1098, bool);
		}
		Class23_Sub25 class23_sub25 = (Class23_Sub25) Class36.anOa565.a((byte) -28, (long) class64.anInt1098);
		if (class23_sub25 != null) {
			Class27.method932(i, 84, i_0_, class23_sub25.anInt2456);
		}
	}
	
	final int[] method260(int i, int i_1_) {
		anInt3243++;
		if (i != 0) {
			anInt3249 = 41;
		}
		int[] is = aClass99_2115.method1500(i_1_, (byte) -121);
		if (aClass99_2115.aBoolean1681) {
			for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_2_++) {
				int i_3_ = anInt3254 + (Class61.anIntArray967[i_2_] << 12) / anInt3250;
				int i_4_ = (Class23_Sub13_Sub16.anIntArray4049[i_1_] << 12) / anInt3250 - -anInt3249;
				int i_5_ = i_3_;
				int i_6_ = i_4_;
				int i_7_ = i_3_;
				int i_8_ = i_3_ * i_3_ >> 12;
				int i_9_ = i_4_;
				int i_10_ = 0;
				for (int i_11_ = i_4_ * i_4_ >> 12; i_11_ + i_8_ < 16384 && i_10_ < anInt3252; i_8_ = i_5_ * i_5_ >> 12) {
					i_9_ = i_6_ + 2 * (i_9_ * i_5_ >> 12);
					i_10_++;
					i_5_ = i_7_ + (i_8_ - i_11_);
					i_11_ = i_9_ * i_9_ >> 12;
				}
				is[i_2_] = (i_10_ ^ 0xffffffff) <= (anInt3252 + -1 ^ 0xffffffff) ? 0 : (i_10_ << 12) / anInt3252;
			}
		}
		return is;
	}
	
	public Class23_Sub4_Sub21() {
		super(0, true);
		anInt3252 = 20;
		anInt3250 = 1365;
	}
	
	public static void method352(int i) {
		aClass16_3253 = null;
		aClass16_3245 = null;
		aClass16_3244 = null;
		int i_12_ = -10 / ((i - 43) / 58);
		aClass16_3248 = null;
		aClass16_3255 = null;
		aClass16_3241 = null;
	}
	
	final void method255(Buffer class23_sub5, int i, int i_13_) {
		int i_14_ = i;
	while_58_:
		do {
		while_57_:
			do {
				do {
					if ((i_14_ ^ 0xffffffff) != -1) {
						if (i_14_ != 1) {
							if (i_14_ != 2) {
								if (i_14_ != 3) {
									break while_58_;
								}
							} else {
								break;
							}
							break while_57_;
						}
					} else {
						anInt3250 = class23_sub5.getUShortBE();
						break while_58_;
					}
					anInt3252 = class23_sub5.getUShortBE();
					break while_58_;
				} while (false);
				anInt3254 = class23_sub5.getUShortBE();
				break while_58_;
			} while (false);
			anInt3249 = class23_sub5.getUShortBE();
		} while (false);
		anInt3246++;
		if (i_13_ != 1000) {
			aClass16_3241 = null;
		}
	}
	
	static final void method353(byte b) {
		if (b != 69) {
			aClass16_3244 = null;
		}
		Class87_Sub2.aClass81_2798.method1369((byte) -29);
		anInt3247++;
	}
	
	static {
		aClass16_3241 = Class38_Sub6.method1076((byte) 86, "We suspect someone knows your password)3");
		anInt3240 = 50;
		aClass16_3245 = Class38_Sub6.method1076((byte) 86, "flash2:");
		aClass16_3255 = aClass16_3241;
		aClass16_3253 = aClass16_3245;
		aClass16_3244 = aClass16_3245;
	}
}

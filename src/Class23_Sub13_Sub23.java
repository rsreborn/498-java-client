/* Class23_Sub13_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub13_Sub23 extends Class23_Sub13
{
	static RSString aClass16_4231 = Class38_Sub6.method1076((byte) 86, "0(U");
	private static RSString aClass16_4232;
	private static RSString aClass16_4233;
	protected int anInt4234;
	protected oa[] anOaArray4235;
	protected int[] anIntArray4236;
	protected RSString[] aClass16Array4237;
	private static RSString aClass16_4238;
	private static RSString aClass16_4239 = Class38_Sub6.method1076((byte) 86, "Jan");
	private static RSString aClass16_4240;
	protected int anInt4241;
	private static RSString aClass16_4242;
	static byte[][] aByteArrayArray4243;
	static Class5 aClass5_4244;
	static Class43_Sub1[] aClass43_Sub1Array4245;
	protected int anInt4246;
	protected int anInt4247;
	static Interface2 anInterface2_4248;
	private static RSString aClass16_4249;
	private static RSString aClass16_4250;
	protected RSString aClass16_4251;
	static RSString[] aClass16Array4252;
	protected int[] anIntArray4253;
	private static RSString aClass16_4254;
	private static RSString aClass16_4255;
	static Class105 aClass105_4256;
	static Class64 aClass64_4257;
	private static RSString aClass16_4258;
	static int[] anIntArray4259;
	private static RSString aClass16_4260;
	static int anInt4261;
	static boolean aBoolean4262;
	
	static final void method844(Class39 class39) {
		for (int i = class39.anInt601; i <= class39.anInt613; i++) {
			for (int i_0_ = class39.anInt607; i_0_ <= class39.anInt599; i_0_++) {
				Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[class39.anInt598][i][i_0_];
				if (class23_sub1 != null) {
					for (int i_1_ = 0; i_1_ < class23_sub1.anInt2029; i_1_++) {
						if (class23_sub1.aClass39Array2028[i_1_] == class39) {
							class23_sub1.anInt2029--;
							for (int i_2_ = i_1_; i_2_ < class23_sub1.anInt2029; i_2_++) {
								class23_sub1.aClass39Array2028[i_2_] = class23_sub1.aClass39Array2028[i_2_ + 1];
								class23_sub1.anIntArray2024[i_2_] = class23_sub1.anIntArray2024[i_2_ + 1];
							}
							class23_sub1.aClass39Array2028[class23_sub1.anInt2029] = null;
							break;
						}
					}
					class23_sub1.anInt2040 = 0;
					for (int i_3_ = 0; i_3_ < class23_sub1.anInt2029; i_3_++)
						class23_sub1.anInt2040 |= class23_sub1.anIntArray2024[i_3_];
				}
			}
		}
	}
	
	public static void method845(int i) {
		aClass16_4240 = null;
		aClass16_4250 = null;
		aClass43_Sub1Array4245 = null;
		aClass16_4233 = null;
		aClass16_4249 = null;
		aClass64_4257 = null;
		aClass16_4260 = null;
		aClass16_4232 = null;
		aClass16Array4252 = null;
		aClass16_4254 = null;
		aByteArrayArray4243 = null;
		aClass105_4256 = null;
		aClass16_4231 = null;
		anInterface2_4248 = null;
		aClass16_4239 = null;
		aClass5_4244 = null;
		aClass16_4258 = null;
		int i_4_ = 109 / ((-29 - i) / 43);
		aClass16_4238 = null;
		aClass16_4242 = null;
		aClass16_4255 = null;
		anIntArray4259 = null;
	}
	
	static final boolean method846(int i, int i_5_, int i_6_) {
		for (int i_7_ = 0; i_7_ < Class23_Sub4_Sub4.anInt2967; i_7_++) {
			Class59 class59 = Class23_Sub13_Sub1.aClass59Array3670[i_7_];
			if (class59.anInt932 == 1) {
				int i_8_ = class59.anInt947 - i;
				if (i_8_ > 0) {
					int i_9_ = class59.anInt944 + (class59.anInt939 * i_8_ >> 8);
					int i_10_ = class59.anInt930 + (class59.anInt921 * i_8_ >> 8);
					int i_11_ = class59.anInt927 + (class59.anInt949 * i_8_ >> 8);
					int i_12_ = class59.anInt922 + (class59.anInt943 * i_8_ >> 8);
					if (i_6_ >= i_9_ && i_6_ <= i_10_ && i_5_ >= i_11_ && i_5_ <= i_12_) {
						return true;
					}
				}
			} else if (class59.anInt932 == 2) {
				int i_13_ = i - class59.anInt947;
				if (i_13_ > 0) {
					int i_14_ = class59.anInt944 + (class59.anInt939 * i_13_ >> 8);
					int i_15_ = class59.anInt930 + (class59.anInt921 * i_13_ >> 8);
					int i_16_ = class59.anInt927 + (class59.anInt949 * i_13_ >> 8);
					int i_17_ = class59.anInt922 + (class59.anInt943 * i_13_ >> 8);
					if (i_6_ >= i_14_ && i_6_ <= i_15_ && i_5_ >= i_16_ && i_5_ <= i_17_) {
						return true;
					}
				}
			} else if (class59.anInt932 == 3) {
				int i_18_ = class59.anInt944 - i_6_;
				if (i_18_ > 0) {
					int i_19_ = class59.anInt947 + (class59.anInt938 * i_18_ >> 8);
					int i_20_ = class59.anInt929 + (class59.anInt942 * i_18_ >> 8);
					int i_21_ = class59.anInt927 + (class59.anInt949 * i_18_ >> 8);
					int i_22_ = class59.anInt922 + (class59.anInt943 * i_18_ >> 8);
					if (i >= i_19_ && i <= i_20_ && i_5_ >= i_21_ && i_5_ <= i_22_) {
						return true;
					}
				}
			} else if (class59.anInt932 == 4) {
				int i_23_ = i_6_ - class59.anInt944;
				if (i_23_ > 0) {
					int i_24_ = class59.anInt947 + (class59.anInt938 * i_23_ >> 8);
					int i_25_ = class59.anInt929 + (class59.anInt942 * i_23_ >> 8);
					int i_26_ = class59.anInt927 + (class59.anInt949 * i_23_ >> 8);
					int i_27_ = class59.anInt922 + (class59.anInt943 * i_23_ >> 8);
					if (i >= i_24_ && i <= i_25_ && i_5_ >= i_26_ && i_5_ <= i_27_) {
						return true;
					}
				}
			} else if (class59.anInt932 == 5) {
				int i_28_ = i_5_ - class59.anInt927;
				if (i_28_ > 0) {
					int i_29_ = class59.anInt947 + (class59.anInt938 * i_28_ >> 8);
					int i_30_ = class59.anInt929 + (class59.anInt942 * i_28_ >> 8);
					int i_31_ = class59.anInt944 + (class59.anInt939 * i_28_ >> 8);
					int i_32_ = class59.anInt930 + (class59.anInt921 * i_28_ >> 8);
					if (i >= i_29_ && i <= i_30_ && i_6_ >= i_31_ && i_6_ <= i_32_) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	static final int method847(int i, int i_33_) {
		anInt4261++;
		if (i >= 65 && i <= 90 || i >= 192 && i <= 222 && i != 215) {
			return i - -32;
		}
		if (i_33_ != 192) {
			return -10;
		}
		if (i == 159) {
			return 255;
		}
		if (i == 140) {
			return 156;
		}
		return i;
	}
	
	static {
		aClass16_4238 = Class38_Sub6.method1076((byte) 86, "Nov");
		aClass16_4232 = Class38_Sub6.method1076((byte) 86, "Feb");
		aClass16_4254 = Class38_Sub6.method1076((byte) 86, "Dec");
		aClass16_4242 = Class38_Sub6.method1076((byte) 86, "May");
		aClass16_4240 = Class38_Sub6.method1076((byte) 86, "Jul");
		anInterface2_4248 = null;
		aClass16_4249 = Class38_Sub6.method1076((byte) 86, "Apr");
		aClass16_4250 = Class38_Sub6.method1076((byte) 86, "Sep");
		aClass16_4258 = Class38_Sub6.method1076((byte) 86, "Jun");
		aClass16_4233 = Class38_Sub6.method1076((byte) 86, "Aug");
		aClass16_4255 = Class38_Sub6.method1076((byte) 86, "Oct");
		aClass16_4260 = Class38_Sub6.method1076((byte) 86, "Mar");
		anIntArray4259 = new int[] { 1, 2, 4, 8 };
		aClass16Array4252 = new RSString[] { aClass16_4239, aClass16_4232, aClass16_4260, aClass16_4249, aClass16_4242, aClass16_4258, aClass16_4240, aClass16_4233, aClass16_4250, aClass16_4255, aClass16_4238, aClass16_4254 };
		aClass5_4244 = new Class5(64);
		aBoolean4262 = false;
	}
}

/* Class38_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class38_Sub1 extends Class38
{
	protected boolean aBoolean2489 = false;
	
	abstract int method1001();
	
	abstract void method1002(int i, int i_0_, int i_1_);
	
	abstract void method1003(Class23_Sub13_Sub16 class23_sub13_sub16, int i, Class23_Sub13_Sub16 class23_sub13_sub16_2_, int i_3_, int[] is, boolean bool);
	
	abstract void method1004(int i);
	
	abstract int method999();
	
	abstract Class38_Sub1 method1005(boolean bool, boolean bool_4_);
	
	abstract void method1006();
	
	abstract void method1007();
	
	abstract void method1008(int i);
	
	abstract void method1009();
	
	abstract int method1010();
	
	final void method1011(int[][] is, int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		boolean bool = false;
		boolean bool_9_ = false;
		boolean bool_10_ = false;
		int i_11_ = -i_7_ / 2;
		int i_12_ = -i_8_ / 2;
		int i_13_ = method1017(is, i + i_11_, i_6_ + i_12_);
		int i_14_ = i_7_ / 2;
		int i_15_ = -i_8_ / 2;
		int i_16_ = method1017(is, i + i_14_, i_6_ + i_15_);
		int i_17_ = -i_7_ / 2;
		int i_18_ = i_8_ / 2;
		int i_19_ = method1017(is, i + i_17_, i_6_ + i_18_);
		int i_20_ = i_7_ / 2;
		int i_21_ = i_8_ / 2;
		int i_22_ = method1017(is, i + i_20_, i_6_ + i_21_);
		int i_23_ = i_13_ < i_16_ ? i_13_ : i_16_;
		int i_24_ = i_19_ < i_22_ ? i_19_ : i_22_;
		int i_25_ = i_16_ < i_22_ ? i_16_ : i_22_;
		int i_26_ = i_13_ < i_19_ ? i_13_ : i_19_;
		int i_27_ = (int) (Math.atan2((double) (i_23_ - i_24_), (double) i_8_) * 325.95) & 0x7ff;
		if (i_27_ != 0) {
			method1019(i_27_);
		}
		int i_28_ = (int) (Math.atan2((double) (i_26_ - i_25_), (double) i_7_) * 325.95) & 0x7ff;
		if (i_28_ != 0) {
			method1008(i_28_);
		}
		int i_29_ = i_13_ + i_22_;
		if (i_16_ + i_19_ < i_29_) {
			i_29_ = i_16_ + i_19_;
		}
		i_29_ = (i_29_ >> 1) - i_5_;
		if (i_29_ != 0) {
			method1013(0, i_29_, 0);
		}
	}
	
	abstract int method1012();
	
	abstract void method1013(int i, int i_30_, int i_31_);
	
	abstract int method1014();
	
	abstract Class38_Sub1 method1015(boolean bool, boolean bool_32_);
	
	abstract int method1016();
	
	private static final int method1017(int[][] is, int i, int i_33_) {
		int i_34_ = i >> 7;
		int i_35_ = i_33_ >> 7;
		if (i_34_ < 0 || i_35_ < 0 || i_34_ >= is.length || i_35_ >= is[0].length) {
			return 0;
		}
		int i_36_ = i & 0x7f;
		int i_37_ = i_33_ & 0x7f;
		int i_38_ = is[i_34_][i_35_] * (128 - i_36_) + is[i_34_ + 1][i_35_] * i_36_ >> 7;
		int i_39_ = is[i_34_][i_35_ + 1] * (128 - i_36_) + is[i_34_ + 1][i_35_ + 1] * i_36_ >> 7;
		return i_38_ * (128 - i_37_) + i_39_ * i_37_ >> 7;
	}
	
	abstract void method995(int i, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, long l);
	
	abstract void method1018(int i, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_);
	
	abstract void method1019(int i);
	
	public Class38_Sub1() {
		/* empty */
	}
	
	abstract void method1020(Class23_Sub13_Sub16 class23_sub13_sub16, int i, boolean bool);
}

/* Class23_Sub13_Sub8_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub13_Sub8_Sub1_Sub1 extends Class23_Sub13_Sub8_Sub1
{
	final void method663(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		int i_5_ = i_0_ + i_1_ * Class20.anInt329;
		int i_6_ = Class20.anInt329 - i_2_;
		int i_7_ = 0;
		int i_8_ = 0;
		if (i_1_ < Class20.anInt332) {
			int i_9_ = Class20.anInt332 - i_1_;
			i_3_ -= i_9_;
			i_1_ = Class20.anInt332;
			i_8_ += i_9_ * i_2_;
			i_5_ += i_9_ * Class20.anInt329;
		}
		if (i_1_ + i_3_ > Class20.anInt334) {
			i_3_ -= i_1_ + i_3_ - Class20.anInt334;
		}
		if (i_0_ < Class20.anInt333) {
			int i_10_ = Class20.anInt333 - i_0_;
			i_2_ -= i_10_;
			i_0_ = Class20.anInt333;
			i_8_ += i_10_;
			i_5_ += i_10_;
			i_7_ += i_10_;
			i_6_ += i_10_;
		}
		if (i_0_ + i_2_ > Class20.anInt330) {
			int i_11_ = i_0_ + i_2_ - Class20.anInt330;
			i_2_ -= i_11_;
			i_7_ += i_11_;
			i_6_ += i_11_;
		}
		if (i_2_ > 0 && i_3_ > 0) {
			Class68.method1250(-116, i_7_, Class20.anIntArray328, i_8_, i_5_, i_6_, i_3_, i_4_, aByteArrayArray4497[i], i_2_);
		}
	}
	
	Class23_Sub13_Sub8_Sub1_Sub1(byte[] bs) {
		super(bs);
	}
	
	final void method660(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
		int i_18_ = i_12_ + i_13_ * Class20.anInt329;
		int i_19_ = Class20.anInt329 - i_14_;
		int i_20_ = 0;
		int i_21_ = 0;
		if (i_13_ < Class20.anInt332) {
			int i_22_ = Class20.anInt332 - i_13_;
			i_15_ -= i_22_;
			i_13_ = Class20.anInt332;
			i_21_ += i_22_ * i_14_;
			i_18_ += i_22_ * Class20.anInt329;
		}
		if (i_13_ + i_15_ > Class20.anInt334) {
			i_15_ -= i_13_ + i_15_ - Class20.anInt334;
		}
		if (i_12_ < Class20.anInt333) {
			int i_23_ = Class20.anInt333 - i_12_;
			i_14_ -= i_23_;
			i_12_ = Class20.anInt333;
			i_21_ += i_23_;
			i_18_ += i_23_;
			i_20_ += i_23_;
			i_19_ += i_23_;
		}
		if (i_12_ + i_14_ > Class20.anInt330) {
			int i_24_ = i_12_ + i_14_ - Class20.anInt330;
			i_14_ -= i_24_;
			i_20_ += i_24_;
			i_19_ += i_24_;
		}
		if (i_14_ > 0 && i_15_ > 0) {
			Class71_Sub2_Sub1.method1281((byte) -16, i_17_, i_19_, i_18_, i_14_, i_16_, i_21_, Class20.anIntArray328, i_15_, i_20_, aByteArrayArray4497[i]);
		}
	}
	
	Class23_Sub13_Sub8_Sub1_Sub1(byte[] bs, int[] is, int[] is_25_, int[] is_26_, int[] is_27_, byte[][] bs_28_) {
		super(bs, is, is_25_, is_26_, is_27_, bs_28_);
	}
}

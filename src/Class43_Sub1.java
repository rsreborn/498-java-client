/* Class43_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class43_Sub1 extends Class43
{
	protected byte[] aByteArray2719;
	private int[] anIntArray2720;
	
	private static final void method1120(int[] is, byte[] bs, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		int i_9_ = i;
		for (int i_10_ = -i_5_; i_10_ < 0; i_10_++) {
			int i_11_ = (i_1_ >> 16) * i_8_;
			for (int i_12_ = -i_4_; i_12_ < 0; i_12_++) {
				int i_13_ = bs[(i >> 16) + i_11_];
				if (i_13_ != 0) {
					is[i_2_++] = is_0_[i_13_ & 0xff];
				} else {
					i_2_++;
				}
				i += i_6_;
			}
			i_1_ += i_7_;
			i = i_9_;
			i_2_ += i_3_;
		}
	}
	
	private static final void method1121(int[] is, byte[] bs, int[] is_14_, int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_) {
		int i_21_ = 256 - i_20_;
		for (int i_22_ = -i_17_; i_22_ < 0; i_22_++) {
			for (int i_23_ = -i_16_; i_23_ < 0; i_23_++) {
				int i_24_ = bs[i++];
				if (i_24_ != 0) {
					i_24_ = is_14_[i_24_ & 0xff];
					int i_25_ = is[i_15_];
					is[i_15_++] = ((i_24_ & 0xff00ff) * i_20_ + (i_25_ & 0xff00ff) * i_21_ & ~0xff00ff) + ((i_24_ & 0xff00) * i_20_ + (i_25_ & 0xff00) * i_21_ & 0xff0000) >> 8;
				} else {
					i_15_++;
				}
			}
			i_15_ += i_18_;
			i += i_19_;
		}
	}
	
	final void method1122(int i, int i_26_, int i_27_, int i_28_) {
		int i_29_ = anInt669;
		int i_30_ = anInt671;
		int i_31_ = 0;
		int i_32_ = 0;
		int i_33_ = anInt668;
		int i_34_ = anInt667;
		int i_35_ = (i_33_ << 16) / i_27_;
		int i_36_ = (i_34_ << 16) / i_28_;
		if (anInt670 > 0) {
			int i_37_ = ((anInt670 << 16) + i_35_ - 1) / i_35_;
			i += i_37_;
			i_31_ += i_37_ * i_35_ - (anInt670 << 16);
		}
		if (anInt665 > 0) {
			int i_38_ = ((anInt665 << 16) + i_36_ - 1) / i_36_;
			i_26_ += i_38_;
			i_32_ += i_38_ * i_36_ - (anInt665 << 16);
		}
		if (i_29_ < i_33_) {
			i_27_ = ((i_29_ << 16) - i_31_ + i_35_ - 1) / i_35_;
		}
		if (i_30_ < i_34_) {
			i_28_ = ((i_30_ << 16) - i_32_ + i_36_ - 1) / i_36_;
		}
		int i_39_ = i + i_26_ * Class20.anInt329;
		int i_40_ = Class20.anInt329 - i_27_;
		if (i_26_ + i_28_ > Class20.anInt334) {
			i_28_ -= i_26_ + i_28_ - Class20.anInt334;
		}
		if (i_26_ < Class20.anInt332) {
			int i_41_ = Class20.anInt332 - i_26_;
			i_28_ -= i_41_;
			i_39_ += i_41_ * Class20.anInt329;
			i_32_ += i_36_ * i_41_;
		}
		if (i + i_27_ > Class20.anInt330) {
			int i_42_ = i + i_27_ - Class20.anInt330;
			i_27_ -= i_42_;
			i_40_ += i_42_;
		}
		if (i < Class20.anInt333) {
			int i_43_ = Class20.anInt333 - i;
			i_27_ -= i_43_;
			i_39_ += i_43_;
			i_31_ += i_35_ * i_43_;
			i_40_ += i_43_;
		}
		method1120(Class20.anIntArray328, aByteArray2719, anIntArray2720, i_31_, i_32_, i_39_, i_40_, i_27_, i_28_, i_35_, i_36_, i_29_);
	}
	
	final void method1123() {
		if (anInt669 != anInt668 || anInt671 != anInt667) {
			byte[] bs = new byte[anInt668 * anInt667];
			int i = 0;
			for (int i_44_ = 0; i_44_ < anInt671; i_44_++) {
				for (int i_45_ = 0; i_45_ < anInt669; i_45_++)
					bs[i_45_ + anInt670 + (i_44_ + anInt665) * anInt668] = aByteArray2719[i++];
			}
			aByteArray2719 = bs;
			anInt669 = anInt668;
			anInt671 = anInt667;
			anInt670 = 0;
			anInt665 = 0;
		}
	}
	
	final void method1124(int i, int i_46_, int i_47_) {
		for (int i_48_ = 0; i_48_ < anIntArray2720.length; i_48_++) {
			int i_49_ = anIntArray2720[i_48_] >> 16 & 0xff;
			i_49_ += i;
			if (i_49_ < 0) {
				i_49_ = 0;
			} else if (i_49_ > 255) {
				i_49_ = 255;
			}
			int i_50_ = anIntArray2720[i_48_] >> 8 & 0xff;
			i_50_ += i_46_;
			if (i_50_ < 0) {
				i_50_ = 0;
			} else if (i_50_ > 255) {
				i_50_ = 255;
			}
			int i_51_ = anIntArray2720[i_48_] & 0xff;
			i_51_ += i_47_;
			if (i_51_ < 0) {
				i_51_ = 0;
			} else if (i_51_ > 255) {
				i_51_ = 255;
			}
			anIntArray2720[i_48_] = (i_49_ << 16) + (i_50_ << 8) + i_51_;
		}
	}
	
	final void method1117(int i, int i_52_, int i_53_) {
		i += anInt670;
		i_52_ += anInt665;
		int i_54_ = i + i_52_ * Class20.anInt329;
		int i_55_ = 0;
		int i_56_ = anInt671;
		int i_57_ = anInt669;
		int i_58_ = Class20.anInt329 - i_57_;
		int i_59_ = 0;
		if (i_52_ < Class20.anInt332) {
			int i_60_ = Class20.anInt332 - i_52_;
			i_56_ -= i_60_;
			i_52_ = Class20.anInt332;
			i_55_ += i_60_ * i_57_;
			i_54_ += i_60_ * Class20.anInt329;
		}
		if (i_52_ + i_56_ > Class20.anInt334) {
			i_56_ -= i_52_ + i_56_ - Class20.anInt334;
		}
		if (i < Class20.anInt333) {
			int i_61_ = Class20.anInt333 - i;
			i_57_ -= i_61_;
			i = Class20.anInt333;
			i_55_ += i_61_;
			i_54_ += i_61_;
			i_59_ += i_61_;
			i_58_ += i_61_;
		}
		if (i + i_57_ > Class20.anInt330) {
			int i_62_ = i + i_57_ - Class20.anInt330;
			i_57_ -= i_62_;
			i_59_ += i_62_;
			i_58_ += i_62_;
		}
		if (i_57_ > 0 && i_56_ > 0) {
			method1121(Class20.anIntArray328, aByteArray2719, anIntArray2720, i_55_, i_54_, i_57_, i_56_, i_58_, i_59_, i_53_);
		}
	}
	
	private static final void method1125(int[] is, byte[] bs, int[] is_63_, int i, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_) {
		int i_70_ = -(i_66_ >> 2);
		i_66_ = -(i_66_ & 0x3);
		for (int i_71_ = -i_67_; i_71_ < 0; i_71_++) {
			for (int i_72_ = i_70_; i_72_ < 0; i_72_++) {
				i = bs[i_64_++];
				if (i != 0) {
					is[i_65_++] = is_63_[i & 0xff];
				} else {
					i_65_++;
				}
				i = bs[i_64_++];
				if (i != 0) {
					is[i_65_++] = is_63_[i & 0xff];
				} else {
					i_65_++;
				}
				i = bs[i_64_++];
				if (i != 0) {
					is[i_65_++] = is_63_[i & 0xff];
				} else {
					i_65_++;
				}
				i = bs[i_64_++];
				if (i != 0) {
					is[i_65_++] = is_63_[i & 0xff];
				} else {
					i_65_++;
				}
			}
			for (int i_73_ = i_66_; i_73_ < 0; i_73_++) {
				i = bs[i_64_++];
				if (i != 0) {
					is[i_65_++] = is_63_[i & 0xff];
				} else {
					i_65_++;
				}
			}
			i_65_ += i_68_;
			i_64_ += i_69_;
		}
	}
	
	final void method1119(int i, int i_74_) {
		i += anInt670;
		i_74_ += anInt665;
		int i_75_ = i + i_74_ * Class20.anInt329;
		int i_76_ = 0;
		int i_77_ = anInt671;
		int i_78_ = anInt669;
		int i_79_ = Class20.anInt329 - i_78_;
		int i_80_ = 0;
		if (i_74_ < Class20.anInt332) {
			int i_81_ = Class20.anInt332 - i_74_;
			i_77_ -= i_81_;
			i_74_ = Class20.anInt332;
			i_76_ += i_81_ * i_78_;
			i_75_ += i_81_ * Class20.anInt329;
		}
		if (i_74_ + i_77_ > Class20.anInt334) {
			i_77_ -= i_74_ + i_77_ - Class20.anInt334;
		}
		if (i < Class20.anInt333) {
			int i_82_ = Class20.anInt333 - i;
			i_78_ -= i_82_;
			i = Class20.anInt333;
			i_76_ += i_82_;
			i_75_ += i_82_;
			i_80_ += i_82_;
			i_79_ += i_82_;
		}
		if (i + i_78_ > Class20.anInt330) {
			int i_83_ = i + i_78_ - Class20.anInt330;
			i_78_ -= i_83_;
			i_80_ += i_83_;
			i_79_ += i_83_;
		}
		if (i_78_ > 0 && i_77_ > 0) {
			method1125(Class20.anIntArray328, aByteArray2719, anIntArray2720, 0, i_76_, i_75_, i_78_, i_77_, i_79_, i_80_);
		}
	}
	
	Class43_Sub1(int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, byte[] bs, int[] is) {
		anInt668 = i;
		anInt667 = i_84_;
		anInt670 = i_85_;
		anInt665 = i_86_;
		anInt669 = i_87_;
		anInt671 = i_88_;
		aByteArray2719 = bs;
		anIntArray2720 = is;
	}
}

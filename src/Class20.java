/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class20
{
	static int[] anIntArray328;
	static int anInt329;
	static int anInt330;
	static int anInt331;
	static int anInt332;
	static int anInt333 = 0;
	static int anInt334;
	
	static final void method200() {
		anInt333 = 0;
		anInt332 = 0;
		anInt330 = anInt329;
		anInt334 = anInt331;
	}
	
	static final void method201(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		if (i_3_ != 0) {
			if (i_3_ == 256) {
				method205(i, i_0_, i_1_, i_2_);
			} else {
				if (i_1_ < 0) {
					i_1_ = -i_1_;
				}
				int i_4_ = 256 - i_3_;
				int i_5_ = (i_2_ >> 16 & 0xff) * i_3_;
				int i_6_ = (i_2_ >> 8 & 0xff) * i_3_;
				int i_7_ = (i_2_ & 0xff) * i_3_;
				int i_8_ = i_0_ - i_1_;
				if (i_8_ < anInt332) {
					i_8_ = anInt332;
				}
				int i_9_ = i_0_ + i_1_ + 1;
				if (i_9_ > anInt334) {
					i_9_ = anInt334;
				}
				int i_10_ = i_8_;
				int i_11_ = i_1_ * i_1_;
				int i_12_ = 0;
				int i_13_ = i_0_ - i_10_;
				int i_14_ = i_13_ * i_13_;
				int i_15_ = i_14_ - i_13_;
				if (i_0_ > i_9_) {
					i_0_ = i_9_;
				}
				while (i_10_ < i_0_) {
					for (/**/; i_15_ <= i_11_ || i_14_ <= i_11_; i_15_ += i_12_++ + i_12_)
						i_14_ += i_12_ + i_12_;
					int i_16_ = i - i_12_ + 1;
					if (i_16_ < anInt333) {
						i_16_ = anInt333;
					}
					int i_17_ = i + i_12_;
					if (i_17_ > anInt330) {
						i_17_ = anInt330;
					}
					int i_18_ = i_16_ + i_10_ * anInt329;
					for (int i_19_ = i_16_; i_19_ < i_17_; i_19_++) {
						int i_20_ = (anIntArray328[i_18_] >> 16 & 0xff) * i_4_;
						int i_21_ = (anIntArray328[i_18_] >> 8 & 0xff) * i_4_;
						int i_22_ = (anIntArray328[i_18_] & 0xff) * i_4_;
						int i_23_ = (i_5_ + i_20_ >> 8 << 16) + (i_6_ + i_21_ >> 8 << 8) + (i_7_ + i_22_ >> 8);
						anIntArray328[i_18_++] = i_23_;
					}
					i_10_++;
					i_14_ -= i_13_-- + i_13_;
					i_15_ -= i_13_ + i_13_;
				}
				i_12_ = i_1_;
				i_13_ = -i_13_;
				i_15_ = i_13_ * i_13_ + i_11_;
				i_14_ = i_15_ - i_12_;
				i_15_ -= i_13_;
				while (i_10_ < i_9_) {
					for (/**/; i_15_ > i_11_ && i_14_ > i_11_; i_14_ -= i_12_ + i_12_)
						i_15_ -= i_12_-- + i_12_;
					int i_24_ = i - i_12_;
					if (i_24_ < anInt333) {
						i_24_ = anInt333;
					}
					int i_25_ = i + i_12_;
					if (i_25_ > anInt330 - 1) {
						i_25_ = anInt330 - 1;
					}
					int i_26_ = i_24_ + i_10_ * anInt329;
					for (int i_27_ = i_24_; i_27_ <= i_25_; i_27_++) {
						int i_28_ = (anIntArray328[i_26_] >> 16 & 0xff) * i_4_;
						int i_29_ = (anIntArray328[i_26_] >> 8 & 0xff) * i_4_;
						int i_30_ = (anIntArray328[i_26_] & 0xff) * i_4_;
						int i_31_ = (i_5_ + i_28_ >> 8 << 16) + (i_6_ + i_29_ >> 8 << 8) + (i_7_ + i_30_ >> 8);
						anIntArray328[i_26_++] = i_31_;
					}
					i_10_++;
					i_15_ += i_13_ + i_13_;
					i_14_ += i_13_++ + i_13_;
				}
			}
		}
	}
	
	static final void method202(int[] is, int i, int i_32_) {
		anIntArray328 = is;
		anInt329 = i;
		anInt331 = i_32_;
		method210(0, 0, i, i_32_);
	}
	
	static final void method203(int i, int i_33_, int i_34_, int i_35_, int i_36_) {
		i_34_ -= i;
		i_35_ -= i_33_;
		if (i_35_ == 0) {
			if (i_34_ >= 0) {
				method207(i, i_33_, i_34_ + 1, i_36_);
			} else {
				method207(i + i_34_, i_33_, -i_34_ + 1, i_36_);
			}
		} else if (i_34_ == 0) {
			if (i_35_ >= 0) {
				method211(i, i_33_, i_35_ + 1, i_36_);
			} else {
				method211(i, i_33_ + i_35_, -i_35_ + 1, i_36_);
			}
		} else {
			if (i_34_ + i_35_ < 0) {
				i += i_34_;
				i_34_ = -i_34_;
				i_33_ += i_35_;
				i_35_ = -i_35_;
			}
			if (i_34_ > i_35_) {
				i_33_ <<= 16;
				i_33_ += 32768;
				i_35_ <<= 16;
				int i_37_ = (int) Math.floor((double) i_35_ / (double) i_34_ + 0.5);
				i_34_ += i;
				if (i < anInt333) {
					i_33_ += i_37_ * (anInt333 - i);
					i = anInt333;
				}
				if (i_34_ >= anInt330) {
					i_34_ = anInt330 - 1;
				}
				for (/**/; i <= i_34_; i++) {
					int i_38_ = i_33_ >> 16;
					if (i_38_ >= anInt332 && i_38_ < anInt334) {
						anIntArray328[i + i_38_ * anInt329] = i_36_;
					}
					i_33_ += i_37_;
				}
			} else {
				i <<= 16;
				i += 32768;
				i_34_ <<= 16;
				int i_39_ = (int) Math.floor((double) i_34_ / (double) i_35_ + 0.5);
				i_35_ += i_33_;
				if (i_33_ < anInt332) {
					i += i_39_ * (anInt332 - i_33_);
					i_33_ = anInt332;
				}
				if (i_35_ >= anInt334) {
					i_35_ = anInt334 - 1;
				}
				for (/**/; i_33_ <= i_35_; i_33_++) {
					int i_40_ = i >> 16;
					if (i_40_ >= anInt333 && i_40_ < anInt330) {
						anIntArray328[i_40_ + i_33_ * anInt329] = i_36_;
					}
					i += i_39_;
				}
			}
		}
	}
	
	static final void method204(int i, int i_41_, int i_42_, int i_43_) {
		if (anInt333 < i) {
			anInt333 = i;
		}
		if (anInt332 < i_41_) {
			anInt332 = i_41_;
		}
		if (anInt330 > i_42_) {
			anInt330 = i_42_;
		}
		if (anInt334 > i_43_) {
			anInt334 = i_43_;
		}
	}
	
	private static final void method205(int i, int i_44_, int i_45_, int i_46_) {
		if (i_45_ == 0) {
			method206(i, i_44_, i_46_);
		} else {
			if (i_45_ < 0) {
				i_45_ = -i_45_;
			}
			int i_47_ = i_44_ - i_45_;
			if (i_47_ < anInt332) {
				i_47_ = anInt332;
			}
			int i_48_ = i_44_ + i_45_ + 1;
			if (i_48_ > anInt334) {
				i_48_ = anInt334;
			}
			int i_49_ = i_47_;
			int i_50_ = i_45_ * i_45_;
			int i_51_ = 0;
			int i_52_ = i_44_ - i_49_;
			int i_53_ = i_52_ * i_52_;
			int i_54_ = i_53_ - i_52_;
			if (i_44_ > i_48_) {
				i_44_ = i_48_;
			}
			while (i_49_ < i_44_) {
				for (/**/; i_54_ <= i_50_ || i_53_ <= i_50_; i_54_ += i_51_++ + i_51_)
					i_53_ += i_51_ + i_51_;
				int i_55_ = i - i_51_ + 1;
				if (i_55_ < anInt333) {
					i_55_ = anInt333;
				}
				int i_56_ = i + i_51_;
				if (i_56_ > anInt330) {
					i_56_ = anInt330;
				}
				int i_57_ = i_55_ + i_49_ * anInt329;
				for (int i_58_ = i_55_; i_58_ < i_56_; i_58_++)
					anIntArray328[i_57_++] = i_46_;
				i_49_++;
				i_53_ -= i_52_-- + i_52_;
				i_54_ -= i_52_ + i_52_;
			}
			i_51_ = i_45_;
			i_52_ = i_49_ - i_44_;
			i_54_ = i_52_ * i_52_ + i_50_;
			i_53_ = i_54_ - i_51_;
			i_54_ -= i_52_;
			while (i_49_ < i_48_) {
				for (/**/; i_54_ > i_50_ && i_53_ > i_50_; i_53_ -= i_51_ + i_51_)
					i_54_ -= i_51_-- + i_51_;
				int i_59_ = i - i_51_;
				if (i_59_ < anInt333) {
					i_59_ = anInt333;
				}
				int i_60_ = i + i_51_;
				if (i_60_ > anInt330 - 1) {
					i_60_ = anInt330 - 1;
				}
				int i_61_ = i_59_ + i_49_ * anInt329;
				for (int i_62_ = i_59_; i_62_ <= i_60_; i_62_++)
					anIntArray328[i_61_++] = i_46_;
				i_49_++;
				i_54_ += i_52_ + i_52_;
				i_53_ += i_52_++ + i_52_;
			}
		}
	}
	
	private static final void method206(int i, int i_63_, int i_64_) {
		if (i >= anInt333 && i_63_ >= anInt332 && i < anInt330 && i_63_ < anInt334) {
			anIntArray328[i + i_63_ * anInt329] = i_64_;
		}
	}
	
	static final void method207(int i, int i_65_, int i_66_, int i_67_) {
		if (i_65_ >= anInt332 && i_65_ < anInt334) {
			if (i < anInt333) {
				i_66_ -= anInt333 - i;
				i = anInt333;
			}
			if (i + i_66_ > anInt330) {
				i_66_ = anInt330 - i;
			}
			int i_68_ = i + i_65_ * anInt329;
			for (int i_69_ = 0; i_69_ < i_66_; i_69_++)
				anIntArray328[i_68_ + i_69_] = i_67_;
		}
	}
	
	static final void method208(int i, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_) {
		int i_75_ = 0;
		int i_76_ = 65536 / i_72_;
		if (i < anInt333) {
			i_71_ -= anInt333 - i;
			i = anInt333;
		}
		if (i_70_ < anInt332) {
			i_75_ += (anInt332 - i_70_) * i_76_;
			i_72_ -= anInt332 - i_70_;
			i_70_ = anInt332;
		}
		if (i + i_71_ > anInt330) {
			i_71_ = anInt330 - i;
		}
		if (i_70_ + i_72_ > anInt334) {
			i_72_ = anInt334 - i_70_;
		}
		int i_77_ = anInt329 - i_71_;
		int i_78_ = i + i_70_ * anInt329;
		for (int i_79_ = -i_72_; i_79_ < 0; i_79_++) {
			int i_80_ = 65536 - i_75_ >> 8;
			int i_81_ = i_75_ >> 8;
			int i_82_ = ((i_73_ & 0xff00ff) * i_80_ + (i_74_ & 0xff00ff) * i_81_ & ~0xff00ff) + ((i_73_ & 0xff00) * i_80_ + (i_74_ & 0xff00) * i_81_ & 0xff0000) >>> 8;
			for (int i_83_ = -i_71_; i_83_ < 0; i_83_++)
				anIntArray328[i_78_++] = i_82_;
			i_78_ += i_77_;
			i_75_ += i_76_;
		}
	}
	
	static final void method209(int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_) {
		int i_89_ = i_85_ - i;
		int i_90_ = i_86_ - i_84_;
		int i_91_ = i_89_ >= 0 ? i_89_ : -i_89_;
		int i_92_ = i_90_ >= 0 ? i_90_ : -i_90_;
		int i_93_ = i_91_;
		if (i_93_ < i_92_) {
			i_93_ = i_92_;
		}
		if (i_93_ != 0) {
			int i_94_ = (i_89_ << 16) / i_93_;
			int i_95_ = (i_90_ << 16) / i_93_;
			if (i_95_ <= i_94_) {
				i_94_ = -i_94_;
			} else {
				i_95_ = -i_95_;
			}
			int i_96_ = i_88_ * i_95_ >> 17;
			int i_97_ = i_88_ * i_95_ + 1 >> 17;
			int i_98_ = i_88_ * i_94_ >> 17;
			int i_99_ = i_88_ * i_94_ + 1 >> 17;
			i -= Class76.method1330();
			i_84_ -= Class76.method1331();
			int i_100_ = i + i_96_;
			int i_101_ = i - i_97_;
			int i_102_ = i + i_89_ - i_97_;
			int i_103_ = i + i_89_ + i_96_;
			int i_104_ = i_84_ + i_98_;
			int i_105_ = i_84_ - i_99_;
			int i_106_ = i_84_ + i_90_ - i_99_;
			int i_107_ = i_84_ + i_90_ + i_98_;
			Class76.method1322(i_100_, i_101_, i_102_);
			Class76.method1321(i_104_, i_105_, i_106_, i_100_, i_101_, i_102_, i_87_);
			Class76.method1322(i_100_, i_102_, i_103_);
			Class76.method1321(i_104_, i_106_, i_107_, i_100_, i_102_, i_103_, i_87_);
		}
	}
	
	static final void method210(int i, int i_108_, int i_109_, int i_110_) {
		if (i < 0) {
			i = 0;
		}
		if (i_108_ < 0) {
			i_108_ = 0;
		}
		if (i_109_ > anInt329) {
			i_109_ = anInt329;
		}
		if (i_110_ > anInt331) {
			i_110_ = anInt331;
		}
		anInt333 = i;
		anInt332 = i_108_;
		anInt330 = i_109_;
		anInt334 = i_110_;
	}
	
	static final void method211(int i, int i_111_, int i_112_, int i_113_) {
		if (i >= anInt333 && i < anInt330) {
			if (i_111_ < anInt332) {
				i_112_ -= anInt332 - i_111_;
				i_111_ = anInt332;
			}
			if (i_111_ + i_112_ > anInt334) {
				i_112_ = anInt334 - i_111_;
			}
			int i_114_ = i + i_111_ * anInt329;
			for (int i_115_ = 0; i_115_ < i_112_; i_115_++)
				anIntArray328[i_114_ + i_115_ * anInt329] = i_113_;
		}
	}
	
	static final void method212(int i, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_) {
		if (i < anInt333) {
			i_117_ -= anInt333 - i;
			i = anInt333;
		}
		if (i_116_ < anInt332) {
			i_118_ -= anInt332 - i_116_;
			i_116_ = anInt332;
		}
		if (i + i_117_ > anInt330) {
			i_117_ = anInt330 - i;
		}
		if (i_116_ + i_118_ > anInt334) {
			i_118_ = anInt334 - i_116_;
		}
		i_119_ = ((i_119_ & 0xff00ff) * i_120_ >> 8 & 0xff00ff) + ((i_119_ & 0xff00) * i_120_ >> 8 & 0xff00);
		int i_121_ = 256 - i_120_;
		int i_122_ = anInt329 - i_117_;
		int i_123_ = i + i_116_ * anInt329;
		for (int i_124_ = 0; i_124_ < i_118_; i_124_++) {
			for (int i_125_ = -i_117_; i_125_ < 0; i_125_++) {
				int i_126_ = anIntArray328[i_123_];
				i_126_ = ((i_126_ & 0xff00ff) * i_121_ >> 8 & 0xff00ff) + ((i_126_ & 0xff00) * i_121_ >> 8 & 0xff00);
				anIntArray328[i_123_++] = i_119_ + i_126_;
			}
			i_123_ += i_122_;
		}
	}
	
	static final void method213(int i, int i_127_, int i_128_, int i_129_, int i_130_, int i_131_) {
		method220(i, i_127_, i_128_, i_130_, i_131_);
		method220(i, i_127_ + i_129_ - 1, i_128_, i_130_, i_131_);
		if (i_129_ >= 3) {
			method214(i, i_127_ + 1, i_129_ - 2, i_130_, i_131_);
			method214(i + i_128_ - 1, i_127_ + 1, i_129_ - 2, i_130_, i_131_);
		}
	}
	
	private static final void method214(int i, int i_132_, int i_133_, int i_134_, int i_135_) {
		if (i >= anInt333 && i < anInt330) {
			if (i_132_ < anInt332) {
				i_133_ -= anInt332 - i_132_;
				i_132_ = anInt332;
			}
			if (i_132_ + i_133_ > anInt334) {
				i_133_ = anInt334 - i_132_;
			}
			int i_136_ = 256 - i_135_;
			int i_137_ = (i_134_ >> 16 & 0xff) * i_135_;
			int i_138_ = (i_134_ >> 8 & 0xff) * i_135_;
			int i_139_ = (i_134_ & 0xff) * i_135_;
			int i_140_ = i + i_132_ * anInt329;
			for (int i_141_ = 0; i_141_ < i_133_; i_141_++) {
				int i_142_ = (anIntArray328[i_140_] >> 16 & 0xff) * i_136_;
				int i_143_ = (anIntArray328[i_140_] >> 8 & 0xff) * i_136_;
				int i_144_ = (anIntArray328[i_140_] & 0xff) * i_136_;
				int i_145_ = (i_137_ + i_142_ >> 8 << 16) + (i_138_ + i_143_ >> 8 << 8) + (i_139_ + i_144_ >> 8);
				anIntArray328[i_140_] = i_145_;
				i_140_ += anInt329;
			}
		}
	}
	
	static final void method215(int i, int i_146_, int i_147_, int i_148_, int i_149_) {
		method207(i, i_146_, i_147_, i_149_);
		method207(i, i_146_ + i_148_ - 1, i_147_, i_149_);
		method211(i, i_146_, i_148_, i_149_);
		method211(i + i_147_ - 1, i_146_, i_148_, i_149_);
	}
	
	static final void method216(int i, int i_150_, int i_151_, int[] is, int[] is_152_) {
		int i_153_ = i + i_150_ * anInt329;
		for (i_150_ = 0; i_150_ < is.length; i_150_++) {
			int i_154_ = i_153_ + is[i_150_];
			for (i = -is_152_[i_150_]; i < 0; i++)
				anIntArray328[i_154_++] = i_151_;
			i_153_ += anInt329;
		}
	}
	
	static final void method217(int[] is) {
		is[0] = anInt333;
		is[1] = anInt332;
		is[2] = anInt330;
		is[3] = anInt334;
	}
	
	static final void method218(int[] is) {
		anInt333 = is[0];
		anInt332 = is[1];
		anInt330 = is[2];
		anInt334 = is[3];
	}
	
	static final void method219() {
		int i = 0;
		int i_155_ = anInt329 * anInt331 - 7;
		while (i < i_155_) {
			anIntArray328[i++] = 0;
			anIntArray328[i++] = 0;
			anIntArray328[i++] = 0;
			anIntArray328[i++] = 0;
			anIntArray328[i++] = 0;
			anIntArray328[i++] = 0;
			anIntArray328[i++] = 0;
			anIntArray328[i++] = 0;
		}
		i_155_ += 7;
		while (i < i_155_)
			anIntArray328[i++] = 0;
	}
	
	private static final void method220(int i, int i_156_, int i_157_, int i_158_, int i_159_) {
		if (i_156_ >= anInt332 && i_156_ < anInt334) {
			if (i < anInt333) {
				i_157_ -= anInt333 - i;
				i = anInt333;
			}
			if (i + i_157_ > anInt330) {
				i_157_ = anInt330 - i;
			}
			int i_160_ = 256 - i_159_;
			int i_161_ = (i_158_ >> 16 & 0xff) * i_159_;
			int i_162_ = (i_158_ >> 8 & 0xff) * i_159_;
			int i_163_ = (i_158_ & 0xff) * i_159_;
			int i_164_ = i + i_156_ * anInt329;
			for (int i_165_ = 0; i_165_ < i_157_; i_165_++) {
				int i_166_ = (anIntArray328[i_164_] >> 16 & 0xff) * i_160_;
				int i_167_ = (anIntArray328[i_164_] >> 8 & 0xff) * i_160_;
				int i_168_ = (anIntArray328[i_164_] & 0xff) * i_160_;
				int i_169_ = (i_161_ + i_166_ >> 8 << 16) + (i_162_ + i_167_ >> 8 << 8) + (i_163_ + i_168_ >> 8);
				anIntArray328[i_164_++] = i_169_;
			}
		}
	}
	
	public static void method221() {
		anIntArray328 = null;
	}
	
	static final void method222(int i, int i_170_, int i_171_, int i_172_, int i_173_) {
		if (i < anInt333) {
			i_171_ -= anInt333 - i;
			i = anInt333;
		}
		if (i_170_ < anInt332) {
			i_172_ -= anInt332 - i_170_;
			i_170_ = anInt332;
		}
		if (i + i_171_ > anInt330) {
			i_171_ = anInt330 - i;
		}
		if (i_170_ + i_172_ > anInt334) {
			i_172_ = anInt334 - i_170_;
		}
		int i_174_ = anInt329 - i_171_;
		int i_175_ = i + i_170_ * anInt329;
		for (int i_176_ = -i_172_; i_176_ < 0; i_176_++) {
			for (int i_177_ = -i_171_; i_177_ < 0; i_177_++)
				anIntArray328[i_175_++] = i_173_;
			i_175_ += i_174_;
		}
	}
	
	static {
		anInt332 = 0;
		anInt330 = 0;
		anInt334 = 0;
	}
}

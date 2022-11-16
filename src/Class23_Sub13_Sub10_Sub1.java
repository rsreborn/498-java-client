/* Class23_Sub13_Sub10_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Class23_Sub13_Sub10_Sub1 extends Class23_Sub13_Sub10
{
	protected int[] anIntArray4502;
	
	final void method698(int i, int i_0_, int i_1_, int i_2_) {
		if (i_1_ > 0 && i_2_ > 0) {
			int i_3_ = anInt3873;
			int i_4_ = anInt3869;
			int i_5_ = 0;
			int i_6_ = 0;
			int i_7_ = anInt3879;
			int i_8_ = anInt3885;
			int i_9_ = (i_7_ << 16) / i_1_;
			int i_10_ = (i_8_ << 16) / i_2_;
			if (anInt3877 > 0) {
				int i_11_ = ((anInt3877 << 16) + i_9_ - 1) / i_9_;
				i += i_11_;
				i_5_ += i_11_ * i_9_ - (anInt3877 << 16);
			}
			if (anInt3870 > 0) {
				int i_12_ = ((anInt3870 << 16) + i_10_ - 1) / i_10_;
				i_0_ += i_12_;
				i_6_ += i_12_ * i_10_ - (anInt3870 << 16);
			}
			if (i_3_ < i_7_) {
				i_1_ = ((i_3_ << 16) - i_5_ + i_9_ - 1) / i_9_;
			}
			if (i_4_ < i_8_) {
				i_2_ = ((i_4_ << 16) - i_6_ + i_10_ - 1) / i_10_;
			}
			int i_13_ = i + i_0_ * Class20.anInt329;
			int i_14_ = Class20.anInt329 - i_1_;
			if (i_0_ + i_2_ > Class20.anInt334) {
				i_2_ -= i_0_ + i_2_ - Class20.anInt334;
			}
			if (i_0_ < Class20.anInt332) {
				int i_15_ = Class20.anInt332 - i_0_;
				i_2_ -= i_15_;
				i_13_ += i_15_ * Class20.anInt329;
				i_6_ += i_10_ * i_15_;
			}
			if (i + i_1_ > Class20.anInt330) {
				int i_16_ = i + i_1_ - Class20.anInt330;
				i_1_ -= i_16_;
				i_14_ += i_16_;
			}
			if (i < Class20.anInt333) {
				int i_17_ = Class20.anInt333 - i;
				i_1_ -= i_17_;
				i_13_ += i_17_;
				i_5_ += i_9_ * i_17_;
				i_14_ += i_17_;
			}
			method718(Class20.anIntArray328, anIntArray4502, 0, i_5_, i_6_, i_13_, i_14_, i_1_, i_2_, i_9_, i_10_, i_3_);
		}
	}
	
	final void method706(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, double d, int i_23_) {
		try {
			int i_24_ = -i_19_ / 2;
			int i_25_ = -i_20_ / 2;
			int i_26_ = (int) (Math.sin(d) * 65536.0);
			int i_27_ = (int) (Math.cos(d) * 65536.0);
			i_26_ = i_26_ * i_23_ >> 8;
			i_27_ = i_27_ * i_23_ >> 8;
			int i_28_ = (i_21_ << 16) + (i_25_ * i_26_ + i_24_ * i_27_);
			int i_29_ = (i_22_ << 16) + (i_25_ * i_27_ - i_24_ * i_26_);
			int i_30_ = i + i_18_ * Class20.anInt329;
			for (i_18_ = 0; i_18_ < i_20_; i_18_++) {
				int i_31_ = i_30_;
				int i_32_ = i_28_;
				int i_33_ = i_29_;
				for (i = -i_19_; i < 0; i++) {
					int i_34_ = anIntArray4502[(i_32_ >> 16) + (i_33_ >> 16) * anInt3873];
					if (i_34_ != 0) {
						Class20.anIntArray328[i_31_++] = i_34_;
					} else {
						i_31_++;
					}
					i_32_ += i_27_;
					i_33_ -= i_26_;
				}
				i_28_ += i_26_;
				i_29_ += i_27_;
				i_30_ += Class20.anInt329;
			}
		} catch (Exception exception) {
			/* empty */
		}
	}
	
	final Class23_Sub13_Sub10_Sub1 method707() {
		Class23_Sub13_Sub10_Sub1 class23_sub13_sub10_sub1_35_ = new Class23_Sub13_Sub10_Sub1(anInt3873, anInt3869);
		class23_sub13_sub10_sub1_35_.anInt3879 = anInt3879;
		class23_sub13_sub10_sub1_35_.anInt3885 = anInt3885;
		class23_sub13_sub10_sub1_35_.anInt3877 = anInt3879 - anInt3873 - anInt3877;
		class23_sub13_sub10_sub1_35_.anInt3870 = anInt3870;
		for (int i = 0; i < anInt3869; i++) {
			for (int i_36_ = 0; i_36_ < anInt3873; i_36_++)
				class23_sub13_sub10_sub1_35_.anIntArray4502[i * anInt3873 + i_36_] = anIntArray4502[i * anInt3873 + anInt3873 - 1 - i_36_];
		}
		return class23_sub13_sub10_sub1_35_;
	}
	
	final void method708(int i) {
		int[] is = new int[anInt3873 * anInt3869];
		int i_37_ = 0;
		for (int i_38_ = 0; i_38_ < anInt3869; i_38_++) {
			for (int i_39_ = 0; i_39_ < anInt3873; i_39_++) {
				int i_40_ = anIntArray4502[i_37_];
				if (i_40_ == 0) {
					if (i_39_ > 0 && anIntArray4502[i_37_ - 1] != 0) {
						i_40_ = i;
					} else if (i_38_ > 0 && anIntArray4502[i_37_ - anInt3873] != 0) {
						i_40_ = i;
					} else if (i_39_ < anInt3873 - 1 && anIntArray4502[i_37_ + 1] != 0) {
						i_40_ = i;
					} else if (i_38_ < anInt3869 - 1 && anIntArray4502[i_37_ + anInt3873] != 0) {
						i_40_ = i;
					}
				}
				is[i_37_++] = i_40_;
			}
		}
		anIntArray4502 = is;
	}
	
	final void method694(int i, int i_41_) {
		i += anInt3877;
		i_41_ += anInt3870;
		int i_42_ = i + i_41_ * Class20.anInt329;
		int i_43_ = 0;
		int i_44_ = anInt3869;
		int i_45_ = anInt3873;
		int i_46_ = Class20.anInt329 - i_45_;
		int i_47_ = 0;
		if (i_41_ < Class20.anInt332) {
			int i_48_ = Class20.anInt332 - i_41_;
			i_44_ -= i_48_;
			i_41_ = Class20.anInt332;
			i_43_ += i_48_ * i_45_;
			i_42_ += i_48_ * Class20.anInt329;
		}
		if (i_41_ + i_44_ > Class20.anInt334) {
			i_44_ -= i_41_ + i_44_ - Class20.anInt334;
		}
		if (i < Class20.anInt333) {
			int i_49_ = Class20.anInt333 - i;
			i_45_ -= i_49_;
			i = Class20.anInt333;
			i_43_ += i_49_;
			i_42_ += i_49_;
			i_47_ += i_49_;
			i_46_ += i_49_;
		}
		if (i + i_45_ > Class20.anInt330) {
			int i_50_ = i + i_45_ - Class20.anInt330;
			i_45_ -= i_50_;
			i_47_ += i_50_;
			i_46_ += i_50_;
		}
		if (i_45_ > 0 && i_44_ > 0) {
			method711(Class20.anIntArray328, anIntArray4502, 0, i_43_, i_42_, i_45_, i_44_, i_46_, i_47_);
		}
	}
	
	final void method709(int i) {
		if (anInt3873 != anInt3879 || anInt3869 != anInt3885) {
			int i_51_ = i;
			if (i_51_ > anInt3877) {
				i_51_ = anInt3877;
			}
			int i_52_ = i;
			if (i_52_ + anInt3877 + anInt3873 > anInt3879) {
				i_52_ = anInt3879 - anInt3877 - anInt3873;
			}
			int i_53_ = i;
			if (i_53_ > anInt3870) {
				i_53_ = anInt3870;
			}
			int i_54_ = i;
			if (i_54_ + anInt3870 + anInt3869 > anInt3885) {
				i_54_ = anInt3885 - anInt3870 - anInt3869;
			}
			int i_55_ = anInt3873 + i_51_ + i_52_;
			int i_56_ = anInt3869 + i_53_ + i_54_;
			int[] is = new int[i_55_ * i_56_];
			for (int i_57_ = 0; i_57_ < anInt3869; i_57_++) {
				for (int i_58_ = 0; i_58_ < anInt3873; i_58_++)
					is[(i_57_ + i_53_) * i_55_ + (i_58_ + i_51_)] = anIntArray4502[i_57_ * anInt3873 + i_58_];
			}
			anIntArray4502 = is;
			anInt3873 = i_55_;
			anInt3869 = i_56_;
			anInt3877 -= i_51_;
			anInt3870 -= i_53_;
		}
	}
	
	final void method699(int i, int i_59_, int i_60_, int i_61_) {
		if (i_60_ == 256) {
			method694(i, i_59_);
		} else {
			i += anInt3877;
			i_59_ += anInt3870;
			int i_62_ = i + i_59_ * Class20.anInt329;
			int i_63_ = 0;
			int i_64_ = anInt3869;
			int i_65_ = anInt3873;
			int i_66_ = Class20.anInt329 - i_65_;
			int i_67_ = 0;
			if (i_59_ < Class20.anInt332) {
				int i_68_ = Class20.anInt332 - i_59_;
				i_64_ -= i_68_;
				i_59_ = Class20.anInt332;
				i_63_ += i_68_ * i_65_;
				i_62_ += i_68_ * Class20.anInt329;
			}
			if (i_59_ + i_64_ > Class20.anInt334) {
				i_64_ -= i_59_ + i_64_ - Class20.anInt334;
			}
			if (i < Class20.anInt333) {
				int i_69_ = Class20.anInt333 - i;
				i_65_ -= i_69_;
				i = Class20.anInt333;
				i_63_ += i_69_;
				i_62_ += i_69_;
				i_67_ += i_69_;
				i_66_ += i_69_;
			}
			if (i + i_65_ > Class20.anInt330) {
				int i_70_ = i + i_65_ - Class20.anInt330;
				i_65_ -= i_70_;
				i_67_ += i_70_;
				i_66_ += i_70_;
			}
			if (i_65_ > 0 && i_64_ > 0) {
				method715(Class20.anIntArray328, anIntArray4502, 0, i_63_, i_62_, i_65_, i_64_, i_66_, i_67_, i_60_, i_61_);
			}
		}
	}
	
	final void method701(int i, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_) {
		if (i_75_ != 0) {
			i -= anInt3877 << 4;
			i_71_ -= anInt3870 << 4;
			double d = (double) (i_74_ & 0xffff) * 9.587379924285257E-5;
			int i_76_ = (int) Math.floor(Math.sin(d) * (double) i_75_ + 0.5);
			int i_77_ = (int) Math.floor(Math.cos(d) * (double) i_75_ + 0.5);
			int i_78_ = -i * i_77_ + -i_71_ * i_76_;
			int i_79_ = i * i_76_ + -i_71_ * i_77_;
			int i_80_ = ((anInt3873 << 4) - i) * i_77_ + -i_71_ * i_76_;
			int i_81_ = -((anInt3873 << 4) - i) * i_76_ + -i_71_ * i_77_;
			int i_82_ = -i * i_77_ + ((anInt3869 << 4) - i_71_) * i_76_;
			int i_83_ = i * i_76_ + ((anInt3869 << 4) - i_71_) * i_77_;
			int i_84_ = ((anInt3873 << 4) - i) * i_77_ + ((anInt3869 << 4) - i_71_) * i_76_;
			int i_85_ = -((anInt3873 << 4) - i) * i_76_ + ((anInt3869 << 4) - i_71_) * i_77_;
			int i_86_;
			int i_87_;
			if (i_78_ < i_80_) {
				i_86_ = i_78_;
				i_87_ = i_80_;
			} else {
				i_86_ = i_80_;
				i_87_ = i_78_;
			}
			if (i_82_ < i_86_) {
				i_86_ = i_82_;
			}
			if (i_84_ < i_86_) {
				i_86_ = i_84_;
			}
			if (i_82_ > i_87_) {
				i_87_ = i_82_;
			}
			if (i_84_ > i_87_) {
				i_87_ = i_84_;
			}
			int i_88_;
			int i_89_;
			if (i_79_ < i_81_) {
				i_88_ = i_79_;
				i_89_ = i_81_;
			} else {
				i_88_ = i_81_;
				i_89_ = i_79_;
			}
			if (i_83_ < i_88_) {
				i_88_ = i_83_;
			}
			if (i_85_ < i_88_) {
				i_88_ = i_85_;
			}
			if (i_83_ > i_89_) {
				i_89_ = i_83_;
			}
			if (i_85_ > i_89_) {
				i_89_ = i_85_;
			}
			i_86_ >>= 12;
			i_87_ = i_87_ + 4095 >> 12;
			i_88_ >>= 12;
			i_89_ = i_89_ + 4095 >> 12;
			i_86_ += i_72_;
			i_87_ += i_72_;
			i_88_ += i_73_;
			i_89_ += i_73_;
			i_86_ >>= 4;
			i_87_ = i_87_ + 15 >> 4;
			i_88_ >>= 4;
			i_89_ = i_89_ + 15 >> 4;
			if (i_86_ < Class20.anInt333) {
				i_86_ = Class20.anInt333;
			}
			if (i_87_ > Class20.anInt330) {
				i_87_ = Class20.anInt330;
			}
			if (i_88_ < Class20.anInt332) {
				i_88_ = Class20.anInt332;
			}
			if (i_89_ > Class20.anInt334) {
				i_89_ = Class20.anInt334;
			}
			i_87_ = i_86_ - i_87_;
			if (i_87_ < 0) {
				i_89_ = i_88_ - i_89_;
				if (i_89_ < 0) {
					int i_90_ = i_88_ * Class20.anInt329 + i_86_;
					double d_91_ = 1.6777216E7 / (double) i_75_;
					int i_92_ = (int) Math.floor(Math.sin(d) * d_91_ + 0.5);
					int i_93_ = (int) Math.floor(Math.cos(d) * d_91_ + 0.5);
					int i_94_ = (i_86_ << 4) + 8 - i_72_;
					int i_95_ = (i_88_ << 4) + 8 - i_73_;
					int i_96_ = (i << 8) - (i_95_ * i_92_ >> 4);
					int i_97_ = (i_71_ << 8) + (i_95_ * i_93_ >> 4);
					if (i_93_ == 0) {
						if (i_92_ == 0) {
							int i_98_ = i_89_;
							while (i_98_ < 0) {
								int i_99_ = i_90_;
								int i_100_ = i_96_;
								int i_101_ = i_97_;
								int i_102_ = i_87_;
								if (i_100_ >= 0 && i_101_ >= 0 && i_100_ - (anInt3873 << 12) < 0 && i_101_ - (anInt3869 << 12) < 0) {
									for (/**/; i_102_ < 0; i_102_++) {
										int i_103_ = anIntArray4502[(i_101_ >> 12) * anInt3873 + (i_100_ >> 12)];
										if (i_103_ != 0) {
											Class20.anIntArray328[i_99_++] = i_103_;
										} else {
											i_99_++;
										}
									}
								}
								i_98_++;
								i_90_ += Class20.anInt329;
							}
						} else if (i_92_ < 0) {
							int i_104_ = i_89_;
							while (i_104_ < 0) {
								int i_105_ = i_90_;
								int i_106_ = i_96_;
								int i_107_ = i_97_ + (i_94_ * i_92_ >> 4);
								int i_108_ = i_87_;
								if (i_106_ >= 0 && i_106_ - (anInt3873 << 12) < 0) {
									int i_109_;
									if ((i_109_ = i_107_ - (anInt3869 << 12)) >= 0) {
										i_109_ = (i_92_ - i_109_) / i_92_;
										i_108_ += i_109_;
										i_107_ += i_92_ * i_109_;
										i_105_ += i_109_;
									}
									if ((i_109_ = (i_107_ - i_92_) / i_92_) > i_108_) {
										i_108_ = i_109_;
									}
									for (/**/; i_108_ < 0; i_108_++) {
										int i_110_ = anIntArray4502[(i_107_ >> 12) * anInt3873 + (i_106_ >> 12)];
										if (i_110_ != 0) {
											Class20.anIntArray328[i_105_++] = i_110_;
										} else {
											i_105_++;
										}
										i_107_ += i_92_;
									}
								}
								i_104_++;
								i_96_ -= i_92_;
								i_90_ += Class20.anInt329;
							}
						} else {
							int i_111_ = i_89_;
							while (i_111_ < 0) {
								int i_112_ = i_90_;
								int i_113_ = i_96_;
								int i_114_ = i_97_ + (i_94_ * i_92_ >> 4);
								int i_115_ = i_87_;
								if (i_113_ >= 0 && i_113_ - (anInt3873 << 12) < 0) {
									if (i_114_ < 0) {
										int i_116_ = (i_92_ - 1 - i_114_) / i_92_;
										i_115_ += i_116_;
										i_114_ += i_92_ * i_116_;
										i_112_ += i_116_;
									}
									int i_117_;
									if ((i_117_ = (1 + i_114_ - (anInt3869 << 12) - i_92_) / i_92_) > i_115_) {
										i_115_ = i_117_;
									}
									for (/**/; i_115_ < 0; i_115_++) {
										int i_118_ = anIntArray4502[(i_114_ >> 12) * anInt3873 + (i_113_ >> 12)];
										if (i_118_ != 0) {
											Class20.anIntArray328[i_112_++] = i_118_;
										} else {
											i_112_++;
										}
										i_114_ += i_92_;
									}
								}
								i_111_++;
								i_96_ -= i_92_;
								i_90_ += Class20.anInt329;
							}
						}
					} else if (i_93_ < 0) {
						if (i_92_ == 0) {
							int i_119_ = i_89_;
							while (i_119_ < 0) {
								int i_120_ = i_90_;
								int i_121_ = i_96_ + (i_94_ * i_93_ >> 4);
								int i_122_ = i_97_;
								int i_123_ = i_87_;
								if (i_122_ >= 0 && i_122_ - (anInt3869 << 12) < 0) {
									int i_124_;
									if ((i_124_ = i_121_ - (anInt3873 << 12)) >= 0) {
										i_124_ = (i_93_ - i_124_) / i_93_;
										i_123_ += i_124_;
										i_121_ += i_93_ * i_124_;
										i_120_ += i_124_;
									}
									if ((i_124_ = (i_121_ - i_93_) / i_93_) > i_123_) {
										i_123_ = i_124_;
									}
									for (/**/; i_123_ < 0; i_123_++) {
										int i_125_ = anIntArray4502[(i_122_ >> 12) * anInt3873 + (i_121_ >> 12)];
										if (i_125_ != 0) {
											Class20.anIntArray328[i_120_++] = i_125_;
										} else {
											i_120_++;
										}
										i_121_ += i_93_;
									}
								}
								i_119_++;
								i_97_ += i_93_;
								i_90_ += Class20.anInt329;
							}
						} else if (i_92_ < 0) {
							int i_126_ = i_89_;
							while (i_126_ < 0) {
								int i_127_ = i_90_;
								int i_128_ = i_96_ + (i_94_ * i_93_ >> 4);
								int i_129_ = i_97_ + (i_94_ * i_92_ >> 4);
								int i_130_ = i_87_;
								int i_131_;
								if ((i_131_ = i_128_ - (anInt3873 << 12)) >= 0) {
									i_131_ = (i_93_ - i_131_) / i_93_;
									i_130_ += i_131_;
									i_128_ += i_93_ * i_131_;
									i_129_ += i_92_ * i_131_;
									i_127_ += i_131_;
								}
								if ((i_131_ = (i_128_ - i_93_) / i_93_) > i_130_) {
									i_130_ = i_131_;
								}
								if ((i_131_ = i_129_ - (anInt3869 << 12)) >= 0) {
									i_131_ = (i_92_ - i_131_) / i_92_;
									i_130_ += i_131_;
									i_128_ += i_93_ * i_131_;
									i_129_ += i_92_ * i_131_;
									i_127_ += i_131_;
								}
								if ((i_131_ = (i_129_ - i_92_) / i_92_) > i_130_) {
									i_130_ = i_131_;
								}
								for (/**/; i_130_ < 0; i_130_++) {
									int i_132_ = anIntArray4502[(i_129_ >> 12) * anInt3873 + (i_128_ >> 12)];
									if (i_132_ != 0) {
										Class20.anIntArray328[i_127_++] = i_132_;
									} else {
										i_127_++;
									}
									i_128_ += i_93_;
									i_129_ += i_92_;
								}
								i_126_++;
								i_96_ -= i_92_;
								i_97_ += i_93_;
								i_90_ += Class20.anInt329;
							}
						} else {
							int i_133_ = i_89_;
							while (i_133_ < 0) {
								int i_134_ = i_90_;
								int i_135_ = i_96_ + (i_94_ * i_93_ >> 4);
								int i_136_ = i_97_ + (i_94_ * i_92_ >> 4);
								int i_137_ = i_87_;
								int i_138_;
								if ((i_138_ = i_135_ - (anInt3873 << 12)) >= 0) {
									i_138_ = (i_93_ - i_138_) / i_93_;
									i_137_ += i_138_;
									i_135_ += i_93_ * i_138_;
									i_136_ += i_92_ * i_138_;
									i_134_ += i_138_;
								}
								if ((i_138_ = (i_135_ - i_93_) / i_93_) > i_137_) {
									i_137_ = i_138_;
								}
								if (i_136_ < 0) {
									i_138_ = (i_92_ - 1 - i_136_) / i_92_;
									i_137_ += i_138_;
									i_135_ += i_93_ * i_138_;
									i_136_ += i_92_ * i_138_;
									i_134_ += i_138_;
								}
								if ((i_138_ = (1 + i_136_ - (anInt3869 << 12) - i_92_) / i_92_) > i_137_) {
									i_137_ = i_138_;
								}
								for (/**/; i_137_ < 0; i_137_++) {
									int i_139_ = anIntArray4502[(i_136_ >> 12) * anInt3873 + (i_135_ >> 12)];
									if (i_139_ != 0) {
										Class20.anIntArray328[i_134_++] = i_139_;
									} else {
										i_134_++;
									}
									i_135_ += i_93_;
									i_136_ += i_92_;
								}
								i_133_++;
								i_96_ -= i_92_;
								i_97_ += i_93_;
								i_90_ += Class20.anInt329;
							}
						}
					} else if (i_92_ == 0) {
						int i_140_ = i_89_;
						while (i_140_ < 0) {
							int i_141_ = i_90_;
							int i_142_ = i_96_ + (i_94_ * i_93_ >> 4);
							int i_143_ = i_97_;
							int i_144_ = i_87_;
							if (i_143_ >= 0 && i_143_ - (anInt3869 << 12) < 0) {
								if (i_142_ < 0) {
									int i_145_ = (i_93_ - 1 - i_142_) / i_93_;
									i_144_ += i_145_;
									i_142_ += i_93_ * i_145_;
									i_141_ += i_145_;
								}
								int i_146_;
								if ((i_146_ = (1 + i_142_ - (anInt3873 << 12) - i_93_) / i_93_) > i_144_) {
									i_144_ = i_146_;
								}
								for (/**/; i_144_ < 0; i_144_++) {
									int i_147_ = anIntArray4502[(i_143_ >> 12) * anInt3873 + (i_142_ >> 12)];
									if (i_147_ != 0) {
										Class20.anIntArray328[i_141_++] = i_147_;
									} else {
										i_141_++;
									}
									i_142_ += i_93_;
								}
							}
							i_140_++;
							i_97_ += i_93_;
							i_90_ += Class20.anInt329;
						}
					} else if (i_92_ < 0) {
						int i_148_ = i_89_;
						while (i_148_ < 0) {
							int i_149_ = i_90_;
							int i_150_ = i_96_ + (i_94_ * i_93_ >> 4);
							int i_151_ = i_97_ + (i_94_ * i_92_ >> 4);
							int i_152_ = i_87_;
							if (i_150_ < 0) {
								int i_153_ = (i_93_ - 1 - i_150_) / i_93_;
								i_152_ += i_153_;
								i_150_ += i_93_ * i_153_;
								i_151_ += i_92_ * i_153_;
								i_149_ += i_153_;
							}
							int i_154_;
							if ((i_154_ = (1 + i_150_ - (anInt3873 << 12) - i_93_) / i_93_) > i_152_) {
								i_152_ = i_154_;
							}
							if ((i_154_ = i_151_ - (anInt3869 << 12)) >= 0) {
								i_154_ = (i_92_ - i_154_) / i_92_;
								i_152_ += i_154_;
								i_150_ += i_93_ * i_154_;
								i_151_ += i_92_ * i_154_;
								i_149_ += i_154_;
							}
							if ((i_154_ = (i_151_ - i_92_) / i_92_) > i_152_) {
								i_152_ = i_154_;
							}
							for (/**/; i_152_ < 0; i_152_++) {
								int i_155_ = anIntArray4502[(i_151_ >> 12) * anInt3873 + (i_150_ >> 12)];
								if (i_155_ != 0) {
									Class20.anIntArray328[i_149_++] = i_155_;
								} else {
									i_149_++;
								}
								i_150_ += i_93_;
								i_151_ += i_92_;
							}
							i_148_++;
							i_96_ -= i_92_;
							i_97_ += i_93_;
							i_90_ += Class20.anInt329;
						}
					} else {
						int i_156_ = i_89_;
						while (i_156_ < 0) {
							int i_157_ = i_90_;
							int i_158_ = i_96_ + (i_94_ * i_93_ >> 4);
							int i_159_ = i_97_ + (i_94_ * i_92_ >> 4);
							int i_160_ = i_87_;
							if (i_158_ < 0) {
								int i_161_ = (i_93_ - 1 - i_158_) / i_93_;
								i_160_ += i_161_;
								i_158_ += i_93_ * i_161_;
								i_159_ += i_92_ * i_161_;
								i_157_ += i_161_;
							}
							int i_162_;
							if ((i_162_ = (1 + i_158_ - (anInt3873 << 12) - i_93_) / i_93_) > i_160_) {
								i_160_ = i_162_;
							}
							if (i_159_ < 0) {
								i_162_ = (i_92_ - 1 - i_159_) / i_92_;
								i_160_ += i_162_;
								i_158_ += i_93_ * i_162_;
								i_159_ += i_92_ * i_162_;
								i_157_ += i_162_;
							}
							if ((i_162_ = (1 + i_159_ - (anInt3869 << 12) - i_92_) / i_92_) > i_160_) {
								i_160_ = i_162_;
							}
							for (/**/; i_160_ < 0; i_160_++) {
								int i_163_ = anIntArray4502[(i_159_ >> 12) * anInt3873 + (i_158_ >> 12)];
								if (i_163_ != 0) {
									Class20.anIntArray328[i_157_++] = i_163_;
								} else {
									i_157_++;
								}
								i_158_ += i_93_;
								i_159_ += i_92_;
							}
							i_156_++;
							i_96_ -= i_92_;
							i_97_ += i_93_;
							i_90_ += Class20.anInt329;
						}
					}
				}
			}
		}
	}
	
	final void method710() {
		int[] is = new int[anInt3873 * anInt3869];
		int i = 0;
		for (int i_164_ = anInt3869 - 1; i_164_ >= 0; i_164_--) {
			for (int i_165_ = 0; i_165_ < anInt3873; i_165_++)
				is[i++] = anIntArray4502[i_165_ + i_164_ * anInt3873];
		}
		anIntArray4502 = is;
		anInt3870 = anInt3885 - anInt3869 - anInt3870;
	}
	
	private static final void method711(int[] is, int[] is_166_, int i, int i_167_, int i_168_, int i_169_, int i_170_, int i_171_, int i_172_) {
		int i_173_ = -(i_169_ >> 2);
		i_169_ = -(i_169_ & 0x3);
		for (int i_174_ = -i_170_; i_174_ < 0; i_174_++) {
			for (int i_175_ = i_173_; i_175_ < 0; i_175_++) {
				i = is_166_[i_167_++];
				if (i != 0) {
					is[i_168_++] = i;
				} else {
					i_168_++;
				}
				i = is_166_[i_167_++];
				if (i != 0) {
					is[i_168_++] = i;
				} else {
					i_168_++;
				}
				i = is_166_[i_167_++];
				if (i != 0) {
					is[i_168_++] = i;
				} else {
					i_168_++;
				}
				i = is_166_[i_167_++];
				if (i != 0) {
					is[i_168_++] = i;
				} else {
					i_168_++;
				}
			}
			for (int i_176_ = i_169_; i_176_ < 0; i_176_++) {
				i = is_166_[i_167_++];
				if (i != 0) {
					is[i_168_++] = i;
				} else {
					i_168_++;
				}
			}
			i_168_ += i_171_;
			i_167_ += i_172_;
		}
	}
	
	private static final void method712(int[] is, int[] is_177_, int i, int i_178_, int i_179_, int i_180_, int i_181_, int i_182_, int i_183_, int i_184_) {
		int i_185_ = 256 - i_184_;
		for (int i_186_ = -i_181_; i_186_ < 0; i_186_++) {
			for (int i_187_ = -i_180_; i_187_ < 0; i_187_++) {
				i = is_177_[i_178_++];
				if (i != 0) {
					int i_188_ = is[i_179_];
					is[i_179_++] = ((i & 0xff00ff) * i_184_ + (i_188_ & 0xff00ff) * i_185_ & ~0xff00ff) + ((i & 0xff00) * i_184_ + (i_188_ & 0xff00) * i_185_ & 0xff0000) >> 8;
				} else {
					i_179_++;
				}
			}
			i_179_ += i_182_;
			i_178_ += i_183_;
		}
	}
	
	final void method713(int i, int i_189_, int i_190_, int i_191_, int i_192_, int i_193_, int i_194_, int i_195_, int[] is, int[] is_196_) {
		try {
			int i_197_ = -i_190_ / 2;
			int i_198_ = -i_191_ / 2;
			int i_199_ = (int) (Math.sin((double) i_194_ / 326.11) * 65536.0);
			int i_200_ = (int) (Math.cos((double) i_194_ / 326.11) * 65536.0);
			i_199_ = i_199_ * i_195_ >> 8;
			i_200_ = i_200_ * i_195_ >> 8;
			int i_201_ = (i_192_ << 16) + (i_198_ * i_199_ + i_197_ * i_200_);
			int i_202_ = (i_193_ << 16) + (i_198_ * i_200_ - i_197_ * i_199_);
			int i_203_ = i + i_189_ * Class20.anInt329;
			for (i_189_ = 0; i_189_ < i_191_; i_189_++) {
				int i_204_ = is[i_189_];
				int i_205_ = i_203_ + i_204_;
				int i_206_ = i_201_ + i_200_ * i_204_;
				int i_207_ = i_202_ - i_199_ * i_204_;
				for (i = -is_196_[i_189_]; i < 0; i++) {
					int i_208_ = anIntArray4502[(i_206_ >> 16) + (i_207_ >> 16) * anInt3873];
					if (i_208_ != 0) {
						Class20.anIntArray328[i_205_++] = i_208_;
					} else {
						i_205_++;
					}
					i_206_ += i_200_;
					i_207_ -= i_199_;
				}
				i_201_ += i_199_;
				i_202_ += i_200_;
				i_203_ += Class20.anInt329;
			}
		} catch (Exception exception) {
			/* empty */
		}
	}
	
	final void method714() {
		int[] is = new int[anInt3873 * anInt3869];
		int i = 0;
		for (int i_209_ = 0; i_209_ < anInt3869; i_209_++) {
			for (int i_210_ = anInt3873 - 1; i_210_ >= 0; i_210_--)
				is[i++] = anIntArray4502[i_210_ + i_209_ * anInt3873];
		}
		anIntArray4502 = is;
		anInt3877 = anInt3879 - anInt3873 - anInt3877;
	}
	
	private static final void method715(int[] is, int[] is_211_, int i, int i_212_, int i_213_, int i_214_, int i_215_, int i_216_, int i_217_, int i_218_, int i_219_) {
		int i_220_ = 256 - i_218_;
		int i_221_ = (i_219_ & 0xff00ff) * i_220_ & ~0xff00ff;
		int i_222_ = (i_219_ & 0xff00) * i_220_ & 0xff0000;
		i_219_ = (i_221_ | i_222_) >>> 8;
		for (int i_223_ = -i_215_; i_223_ < 0; i_223_++) {
			for (int i_224_ = -i_214_; i_224_ < 0; i_224_++) {
				i = is_211_[i_212_++];
				if (i != 0) {
					i_221_ = (i & 0xff00ff) * i_218_ & ~0xff00ff;
					i_222_ = (i & 0xff00) * i_218_ & 0xff0000;
					is[i_213_++] = ((i_221_ | i_222_) >>> 8) + i_219_;
				} else {
					i_213_++;
				}
			}
			i_213_ += i_216_;
			i_212_ += i_217_;
		}
	}
	
	final void method696(int i, int i_225_, int i_226_) {
		i += anInt3877;
		i_225_ += anInt3870;
		int i_227_ = i + i_225_ * Class20.anInt329;
		int i_228_ = 0;
		int i_229_ = anInt3869;
		int i_230_ = anInt3873;
		int i_231_ = Class20.anInt329 - i_230_;
		int i_232_ = 0;
		if (i_225_ < Class20.anInt332) {
			int i_233_ = Class20.anInt332 - i_225_;
			i_229_ -= i_233_;
			i_225_ = Class20.anInt332;
			i_228_ += i_233_ * i_230_;
			i_227_ += i_233_ * Class20.anInt329;
		}
		if (i_225_ + i_229_ > Class20.anInt334) {
			i_229_ -= i_225_ + i_229_ - Class20.anInt334;
		}
		if (i < Class20.anInt333) {
			int i_234_ = Class20.anInt333 - i;
			i_230_ -= i_234_;
			i = Class20.anInt333;
			i_228_ += i_234_;
			i_227_ += i_234_;
			i_232_ += i_234_;
			i_231_ += i_234_;
		}
		if (i + i_230_ > Class20.anInt330) {
			int i_235_ = i + i_230_ - Class20.anInt330;
			i_230_ -= i_235_;
			i_232_ += i_235_;
			i_231_ += i_235_;
		}
		if (i_230_ > 0 && i_229_ > 0) {
			method712(Class20.anIntArray328, anIntArray4502, 0, i_228_, i_227_, i_230_, i_229_, i_231_, i_232_, i_226_);
		}
	}
	
	private static final void method716(int[] is, int[] is_236_, int i, int i_237_, int i_238_, int i_239_, int i_240_, int i_241_) {
		for (int i_242_ = -i_239_; i_242_ < 0; i_242_++) {
			int i_243_ = i_237_ + i_238_ - 3;
			while (i_237_ < i_243_) {
				is[i_237_++] = is_236_[i++];
				is[i_237_++] = is_236_[i++];
				is[i_237_++] = is_236_[i++];
				is[i_237_++] = is_236_[i++];
			}
			i_243_ += 3;
			while (i_237_ < i_243_)
				is[i_237_++] = is_236_[i++];
			i_237_ += i_240_;
			i += i_241_;
		}
	}
	
	final void method717() {
		if (anInt3873 != anInt3879 || anInt3869 != anInt3885) {
			int[] is = new int[anInt3879 * anInt3885];
			for (int i = 0; i < anInt3869; i++) {
				for (int i_244_ = 0; i_244_ < anInt3873; i_244_++)
					is[(i + anInt3870) * anInt3879 + (i_244_ + anInt3877)] = anIntArray4502[i * anInt3873 + i_244_];
			}
			anIntArray4502 = is;
			anInt3873 = anInt3879;
			anInt3869 = anInt3885;
			anInt3877 = 0;
			anInt3870 = 0;
		}
	}
	
	private static final void method718(int[] is, int[] is_245_, int i, int i_246_, int i_247_, int i_248_, int i_249_, int i_250_, int i_251_, int i_252_, int i_253_, int i_254_) {
		int i_255_ = i_246_;
		for (int i_256_ = -i_251_; i_256_ < 0; i_256_++) {
			int i_257_ = (i_247_ >> 16) * i_254_;
			for (int i_258_ = -i_250_; i_258_ < 0; i_258_++) {
				i = is_245_[(i_246_ >> 16) + i_257_];
				if (i != 0) {
					is[i_248_++] = i;
				} else {
					i_248_++;
				}
				i_246_ += i_252_;
			}
			i_247_ += i_253_;
			i_246_ = i_255_;
			i_248_ += i_249_;
		}
	}
	
	final void method719(int i, int i_259_, int i_260_) {
		for (int i_261_ = 0; i_261_ < anIntArray4502.length; i_261_++) {
			int i_262_ = anIntArray4502[i_261_];
			if (i_262_ != 0) {
				int i_263_ = i_262_ >> 16 & 0xff;
				i_263_ += i;
				if (i_263_ < 1) {
					i_263_ = 1;
				} else if (i_263_ > 255) {
					i_263_ = 255;
				}
				int i_264_ = i_262_ >> 8 & 0xff;
				i_264_ += i_259_;
				if (i_264_ < 1) {
					i_264_ = 1;
				} else if (i_264_ > 255) {
					i_264_ = 255;
				}
				int i_265_ = i_262_ & 0xff;
				i_265_ += i_260_;
				if (i_265_ < 1) {
					i_265_ = 1;
				} else if (i_265_ > 255) {
					i_265_ = 255;
				}
				anIntArray4502[i_261_] = (i_263_ << 16) + (i_264_ << 8) + i_265_;
			}
		}
	}
	
	private static final void method720(int[] is, int[] is_266_, int i, int i_267_, int i_268_, int i_269_, int i_270_, int i_271_, int i_272_, int i_273_, int i_274_, int i_275_, int i_276_) {
		int i_277_ = 256 - i_276_;
		int i_278_ = i_267_;
		for (int i_279_ = -i_272_; i_279_ < 0; i_279_++) {
			int i_280_ = (i_268_ >> 16) * i_275_;
			for (int i_281_ = -i_271_; i_281_ < 0; i_281_++) {
				i = is_266_[(i_267_ >> 16) + i_280_];
				if (i != 0) {
					int i_282_ = is[i_269_];
					is[i_269_++] = ((i & 0xff00ff) * i_276_ + (i_282_ & 0xff00ff) * i_277_ & ~0xff00ff) + ((i & 0xff00) * i_276_ + (i_282_ & 0xff00) * i_277_ & 0xff0000) >> 8;
				} else {
					i_269_++;
				}
				i_267_ += i_273_;
			}
			i_268_ += i_274_;
			i_267_ = i_278_;
			i_269_ += i_270_;
		}
	}
	
	final void method721(int i, int i_283_, int[] is, int[] is_284_) {
		if (Class20.anInt334 - Class20.anInt332 != is.length) {
			throw new IllegalStateException();
		}
		i += anInt3877;
		i_283_ += anInt3870;
		int i_285_ = 0;
		int i_286_ = anInt3869;
		int i_287_ = anInt3873;
		int i_288_ = Class20.anInt329 - i_287_;
		int i_289_ = 0;
		int i_290_ = i + i_283_ * Class20.anInt329;
		if (i_283_ < Class20.anInt332) {
			int i_291_ = Class20.anInt332 - i_283_;
			i_286_ -= i_291_;
			i_283_ = Class20.anInt332;
			i_285_ += i_291_ * i_287_;
			i_290_ += i_291_ * Class20.anInt329;
		}
		if (i_283_ + i_286_ > Class20.anInt334) {
			i_286_ -= i_283_ + i_286_ - Class20.anInt334;
		}
		if (i < Class20.anInt333) {
			int i_292_ = Class20.anInt333 - i;
			i_287_ -= i_292_;
			i = Class20.anInt333;
			i_285_ += i_292_;
			i_290_ += i_292_;
			i_289_ += i_292_;
			i_288_ += i_292_;
		}
		if (i + i_287_ > Class20.anInt330) {
			int i_293_ = i + i_287_ - Class20.anInt330;
			i_287_ -= i_293_;
			i_289_ += i_293_;
			i_288_ += i_293_;
		}
		if (i_287_ > 0 && i_286_ > 0) {
			int i_294_ = i - Class20.anInt333;
			int i_295_ = i_283_ - Class20.anInt332;
			for (int i_296_ = i_295_; i_296_ < i_295_ + i_286_; i_296_++) {
				int i_297_ = is[i_296_];
				int i_298_ = is_284_[i_296_];
				int i_299_ = i_287_;
				if (i_294_ > i_297_) {
					int i_300_ = i_294_ - i_297_;
					if (i_300_ >= i_298_) {
						i_285_ += i_287_ + i_289_;
						i_290_ += i_287_ + i_288_;
						continue;
					}
					i_298_ -= i_300_;
				} else {
					int i_301_ = i_297_ - i_294_;
					if (i_301_ >= i_287_) {
						i_285_ += i_287_ + i_289_;
						i_290_ += i_287_ + i_288_;
						continue;
					}
					i_285_ += i_301_;
					i_299_ -= i_301_;
					i_290_ += i_301_;
				}
				int i_302_ = 0;
				if (i_299_ < i_298_) {
					i_298_ = i_299_;
				} else {
					i_302_ = i_299_ - i_298_;
				}
				for (int i_303_ = -i_298_; i_303_ < 0; i_303_++) {
					int i_304_ = anIntArray4502[i_285_++];
					if (i_304_ != 0) {
						Class20.anIntArray328[i_290_++] = i_304_;
					} else {
						i_290_++;
					}
				}
				i_285_ += i_302_ + i_289_;
				i_290_ += i_302_ + i_288_;
			}
		}
	}
	
	final void method705(int i, int i_305_) {
		i += anInt3877;
		i_305_ += anInt3870;
		int i_306_ = i + i_305_ * Class20.anInt329;
		int i_307_ = 0;
		int i_308_ = anInt3869;
		int i_309_ = anInt3873;
		int i_310_ = Class20.anInt329 - i_309_;
		int i_311_ = 0;
		if (i_305_ < Class20.anInt332) {
			int i_312_ = Class20.anInt332 - i_305_;
			i_308_ -= i_312_;
			i_305_ = Class20.anInt332;
			i_307_ += i_312_ * i_309_;
			i_306_ += i_312_ * Class20.anInt329;
		}
		if (i_305_ + i_308_ > Class20.anInt334) {
			i_308_ -= i_305_ + i_308_ - Class20.anInt334;
		}
		if (i < Class20.anInt333) {
			int i_313_ = Class20.anInt333 - i;
			i_309_ -= i_313_;
			i = Class20.anInt333;
			i_307_ += i_313_;
			i_306_ += i_313_;
			i_311_ += i_313_;
			i_310_ += i_313_;
		}
		if (i + i_309_ > Class20.anInt330) {
			int i_314_ = i + i_309_ - Class20.anInt330;
			i_309_ -= i_314_;
			i_311_ += i_314_;
			i_310_ += i_314_;
		}
		if (i_309_ > 0 && i_308_ > 0) {
			method716(Class20.anIntArray328, anIntArray4502, i_307_, i_306_, i_309_, i_308_, i_310_, i_311_);
		}
	}
	
	final void method695(int i, int i_315_, int i_316_, int i_317_, int i_318_) {
		if (i_316_ > 0 && i_317_ > 0) {
			int i_319_ = anInt3873;
			int i_320_ = anInt3869;
			int i_321_ = 0;
			int i_322_ = 0;
			int i_323_ = anInt3879;
			int i_324_ = anInt3885;
			int i_325_ = (i_323_ << 16) / i_316_;
			int i_326_ = (i_324_ << 16) / i_317_;
			if (anInt3877 > 0) {
				int i_327_ = ((anInt3877 << 16) + i_325_ - 1) / i_325_;
				i += i_327_;
				i_321_ += i_327_ * i_325_ - (anInt3877 << 16);
			}
			if (anInt3870 > 0) {
				int i_328_ = ((anInt3870 << 16) + i_326_ - 1) / i_326_;
				i_315_ += i_328_;
				i_322_ += i_328_ * i_326_ - (anInt3870 << 16);
			}
			if (i_319_ < i_323_) {
				i_316_ = ((i_319_ << 16) - i_321_ + i_325_ - 1) / i_325_;
			}
			if (i_320_ < i_324_) {
				i_317_ = ((i_320_ << 16) - i_322_ + i_326_ - 1) / i_326_;
			}
			int i_329_ = i + i_315_ * Class20.anInt329;
			int i_330_ = Class20.anInt329 - i_316_;
			if (i_315_ + i_317_ > Class20.anInt334) {
				i_317_ -= i_315_ + i_317_ - Class20.anInt334;
			}
			if (i_315_ < Class20.anInt332) {
				int i_331_ = Class20.anInt332 - i_315_;
				i_317_ -= i_331_;
				i_329_ += i_331_ * Class20.anInt329;
				i_322_ += i_326_ * i_331_;
			}
			if (i + i_316_ > Class20.anInt330) {
				int i_332_ = i + i_316_ - Class20.anInt330;
				i_316_ -= i_332_;
				i_330_ += i_332_;
			}
			if (i < Class20.anInt333) {
				int i_333_ = Class20.anInt333 - i;
				i_316_ -= i_333_;
				i_329_ += i_333_;
				i_321_ += i_325_ * i_333_;
				i_330_ += i_333_;
			}
			method720(Class20.anIntArray328, anIntArray4502, 0, i_321_, i_322_, i_329_, i_330_, i_316_, i_317_, i_325_, i_326_, i_319_, i_318_);
		}
	}
	
	final void method722(int i, int i_334_, int i_335_, int i_336_, int i_337_, int i_338_, int i_339_, int i_340_, int[] is, int[] is_341_) {
		try {
			int i_342_ = -i_335_ / 2;
			int i_343_ = -i_336_ / 2;
			int i_344_ = (int) (Math.sin((double) i_339_ / 326.11) * 65536.0);
			int i_345_ = (int) (Math.cos((double) i_339_ / 326.11) * 65536.0);
			i_344_ = i_344_ * i_340_ >> 8;
			i_345_ = i_345_ * i_340_ >> 8;
			int i_346_ = (i_337_ << 16) + (i_343_ * i_344_ + i_342_ * i_345_);
			int i_347_ = (i_338_ << 16) + (i_343_ * i_345_ - i_342_ * i_344_);
			int i_348_ = i + i_334_ * Class20.anInt329;
			for (i_334_ = 0; i_334_ < i_336_; i_334_++) {
				int i_349_ = is[i_334_];
				int i_350_ = i_348_ + i_349_;
				int i_351_ = i_346_ + i_345_ * i_349_;
				int i_352_ = i_347_ - i_344_ * i_349_;
				for (i = -is_341_[i_334_]; i < 0; i++) {
					Class20.anIntArray328[i_350_++] = anIntArray4502[(i_351_ >> 16) + (i_352_ >> 16) * anInt3873];
					i_351_ += i_345_;
					i_352_ -= i_344_;
				}
				i_346_ += i_344_;
				i_347_ += i_345_;
				i_348_ += Class20.anInt329;
			}
		} catch (Exception exception) {
			/* empty */
		}
	}
	
	final void method723() {
		Class20.method202(anIntArray4502, anInt3873, anInt3869);
	}
	
	final void method724(int i) {
		for (int i_353_ = anInt3869 - 1; i_353_ > 0; i_353_--) {
			int i_354_ = i_353_ * anInt3873;
			for (int i_355_ = anInt3873 - 1; i_355_ > 0; i_355_--) {
				if (anIntArray4502[i_355_ + i_354_] == 0 && anIntArray4502[i_355_ + i_354_ - 1 - anInt3873] != 0) {
					anIntArray4502[i_355_ + i_354_] = i;
				}
			}
		}
	}
	
	Class23_Sub13_Sub10_Sub1(int i, int i_356_, int i_357_, int i_358_, int i_359_, int i_360_, int[] is) {
		anInt3879 = i;
		anInt3885 = i_356_;
		anInt3877 = i_357_;
		anInt3870 = i_358_;
		anInt3873 = i_359_;
		anInt3869 = i_360_;
		anIntArray4502 = is;
	}
	
	Class23_Sub13_Sub10_Sub1(int i, int i_361_) {
		anIntArray4502 = new int[i * i_361_];
		anInt3873 = anInt3879 = i;
		anInt3869 = anInt3885 = i_361_;
		anInt3877 = anInt3870 = 0;
	}
	
	Class23_Sub13_Sub10_Sub1(byte[] bs, Component component) {
		try {
			Image image = Toolkit.getDefaultToolkit().createImage(bs);
			MediaTracker mediatracker = new MediaTracker(component);
			mediatracker.addImage(image, 0);
			mediatracker.waitForAll();
			anInt3873 = image.getWidth(component);
			anInt3869 = image.getHeight(component);
			anInt3879 = anInt3873;
			anInt3885 = anInt3869;
			anInt3877 = 0;
			anInt3870 = 0;
			anIntArray4502 = new int[anInt3873 * anInt3869];
			PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt3873, anInt3869, anIntArray4502, 0, anInt3873);
			pixelgrabber.grabPixels();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}
}

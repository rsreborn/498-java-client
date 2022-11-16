/* Class23_Sub13_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

abstract class Class23_Sub13_Sub8 extends Class23_Sub13
{
	private static int anInt3807;
	private static RSString aClass16_3808;
	private int anInt3809;
	private static RSString aClass16_3810;
	protected int anInt3811 = 0;
	private static RSString aClass16_3812;
	private byte[] aByteArray3813;
	private static RSString aClass16_3814 = Class38_Sub6.method1076((byte) 86, "times");
	private static int anInt3815;
	private static RSString aClass16_3816;
	private static int anInt3817;
	private static RSString aClass16_3818;
	private int anInt3819;
	private static RSString aClass16_3820;
	private static RSString aClass16_3821;
	private Class43[] aClass43Array3822;
	private static RSString[] aClass16Array3823;
	private static RSString aClass16_3824;
	private int[] anIntArray3825;
	private static RSString aClass16_3826;
	private static int anInt3827;
	private static int anInt3828;
	private static int anInt3829;
	private static RSString aClass16_3830;
	private int[] anIntArray3831;
	private static RSString aClass16_3832;
	private int[] anIntArray3833;
	private static int anInt3834;
	private static int anInt3835;
	private int[] anIntArray3836;
	private static RSString aClass16_3837;
	private static RSString aClass16_3838;
	private static int anInt3839;
	private static RSString aClass16_3840;
	private static RSString aClass16_3841;
	private static RSString aClass16_3842;
	private static RSString aClass16_3843;
	private static RSString aClass16_3844;
	private static RSString aClass16_3845;
	private int[] anIntArray3846;
	private int[] anIntArray3847;
	private static RSString aClass16_3848;
	private static RSString aClass16_3849;
	private static RSString aClass16_3850;
	private static int anInt3851;
	
	final int method648(RSString class16, int i, int i_0_, int i_1_, int i_2_, Random random, int i_3_) {
		if (class16 == null) {
			return 0;
		}
		random.setSeed((long) i_3_);
		method658(i_1_, i_2_, 192 + (random.nextInt() & 0x1f));
		int[] is = new int[class16.anInt1896];
		int i_4_ = 0;
		for (int i_5_ = 0; i_5_ < class16.anInt1896; i_5_++) {
			is[i_5_] = i_4_;
			if ((random.nextInt() & 0x3) == 0) {
				i_4_++;
			}
		}
		method651(class16, i, i_0_, is, null);
		return i_4_;
	}
	
	final int method649(RSString class16) {
		if (class16 == null) {
			return 0;
		}
		int i = -1;
		int i_6_ = -1;
		int i_7_ = 0;
		for (int i_8_ = 0; i_8_ < class16.anInt1896; i_8_++) {
			int i_9_ = class16.aByteArray1906[i_8_] & 0xff;
			if (i_9_ == 60) {
				i = i_8_;
			} else {
				if (i_9_ == 62 && i != -1) {
					RSString class16_10_ = class16.method148(i_8_, i + 1, true);
					i = -1;
					if (class16_10_.method183(aClass16_3842, (byte) -49)) {
						i_9_ = 60;
					} else if (class16_10_.method183(aClass16_3821, (byte) -49)) {
						i_9_ = 62;
					} else if (class16_10_.method183(aClass16_3848, (byte) -49)) {
						i_9_ = 160;
					} else if (class16_10_.method183(aClass16_3812, (byte) -49)) {
						i_9_ = 173;
					} else if (class16_10_.method183(aClass16_3814, (byte) -49)) {
						i_9_ = 215;
					} else if (class16_10_.method183(aClass16_3838, (byte) -49)) {
						i_9_ = 128;
					} else if (class16_10_.method183(aClass16_3840, (byte) -49)) {
						i_9_ = 169;
					} else if (class16_10_.method183(aClass16_3818, (byte) -49)) {
						i_9_ = 174;
					} else {
						if (class16_10_.method176(aClass16_3824, (byte) -69)) {
							try {
								int i_11_ = class16_10_.method138((byte) 72, 4).method142(true);
								i_7_ += aClass43Array3822[i_11_].anInt668;
								i_6_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (i == -1) {
					i_7_ += anIntArray3831[i_9_];
					if (aByteArray3813 != null && i_6_ != -1) {
						i_7_ += aByteArray3813[(i_6_ << 8) + i_9_];
					}
					i_6_ = i_9_;
				}
			}
		}
		return i_7_;
	}
	
	final void method650(RSString class16, int i, int i_12_, int i_13_, int i_14_) {
		if (class16 != null) {
			method672(i_13_, i_14_);
			method664(class16, i, i_12_);
		}
	}
	
	private final void method651(RSString class16, int i, int i_15_, int[] is, int[] is_16_) {
		i_15_ -= anInt3811;
		int i_17_ = -1;
		int i_18_ = -1;
		int i_19_ = 0;
		for (int i_20_ = 0; i_20_ < class16.anInt1896; i_20_++) {
			int i_21_ = class16.aByteArray1906[i_20_] & 0xff;
			if (i_21_ == 60) {
				i_17_ = i_20_;
			} else {
				if (i_21_ == 62 && i_17_ != -1) {
					RSString class16_22_ = class16.method148(i_20_, i_17_ + 1, true);
					i_17_ = -1;
					if (class16_22_.method183(aClass16_3842, (byte) -49)) {
						i_21_ = 60;
					} else if (class16_22_.method183(aClass16_3821, (byte) -49)) {
						i_21_ = 62;
					} else if (class16_22_.method183(aClass16_3848, (byte) -49)) {
						i_21_ = 160;
					} else if (class16_22_.method183(aClass16_3812, (byte) -49)) {
						i_21_ = 173;
					} else if (class16_22_.method183(aClass16_3814, (byte) -49)) {
						i_21_ = 215;
					} else if (class16_22_.method183(aClass16_3838, (byte) -49)) {
						i_21_ = 128;
					} else if (class16_22_.method183(aClass16_3840, (byte) -49)) {
						i_21_ = 169;
					} else if (class16_22_.method183(aClass16_3818, (byte) -49)) {
						i_21_ = 174;
					} else {
						if (class16_22_.method176(aClass16_3824, (byte) -105)) {
							try {
								int i_23_;
								if (is != null) {
									i_23_ = is[i_19_];
								} else {
									i_23_ = 0;
								}
								int i_24_;
								if (is_16_ != null) {
									i_24_ = is_16_[i_19_];
								} else {
									i_24_ = 0;
								}
								i_19_++;
								int i_25_ = class16_22_.method138((byte) 102, 4).method142(true);
								Class43 class43 = aClass43Array3822[i_25_];
								int i_26_ = anIntArray3833 != null ? anIntArray3833[i_25_] : class43.anInt667;
								if (anInt3807 == 256) {
									class43.method1119(i + i_23_, i_15_ + anInt3811 - i_26_ + i_24_);
								} else {
									class43.method1117(i + i_23_, i_15_ + anInt3811 - i_26_ + i_24_, anInt3807);
								}
								i += class43.anInt668;
								i_18_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else {
							method675(class16_22_);
						}
						continue;
					}
				}
				if (i_17_ == -1) {
					if (aByteArray3813 != null && i_18_ != -1) {
						i += aByteArray3813[(i_18_ << 8) + i_21_];
					}
					int i_27_ = anIntArray3836[i_21_];
					int i_28_ = anIntArray3825[i_21_];
					int i_29_;
					if (is != null) {
						i_29_ = is[i_19_];
					} else {
						i_29_ = 0;
					}
					int i_30_;
					if (is_16_ != null) {
						i_30_ = is_16_[i_19_];
					} else {
						i_30_ = 0;
					}
					i_19_++;
					if (i_21_ != 32) {
						if (anInt3807 == 256) {
							if (anInt3829 != -1) {
								method662(i_21_, i + anIntArray3847[i_21_] + 1 + i_29_, i_15_ + anIntArray3846[i_21_] + 1 + i_30_, i_27_, i_28_, anInt3829);
							}
							method663(i_21_, i + anIntArray3847[i_21_] + i_29_, i_15_ + anIntArray3846[i_21_] + i_30_, i_27_, i_28_, anInt3834);
						} else {
							if (anInt3829 != -1) {
								method673(i_21_, i + anIntArray3847[i_21_] + 1 + i_29_, i_15_ + anIntArray3846[i_21_] + 1 + i_30_, i_27_, i_28_, anInt3829, anInt3807);
							}
							method660(i_21_, i + anIntArray3847[i_21_] + i_29_, i_15_ + anIntArray3846[i_21_] + i_30_, i_27_, i_28_, anInt3834, anInt3807);
						}
					} else if (anInt3839 > 0) {
						anInt3817 += anInt3839;
						i += anInt3817 >> 8;
						anInt3817 &= 0xff;
					}
					int i_31_ = anIntArray3831[i_21_];
					if (anInt3815 != -1) {
						Class20.method207(i, i_15_ + (int) ((double) anInt3811 * 0.7), i_31_, anInt3815);
					}
					if (anInt3827 != -1) {
						Class20.method207(i, i_15_ + anInt3811, i_31_, anInt3827);
					}
					i += i_31_;
					i_18_ = i_21_;
				}
			}
		}
	}
	
	public static void method652() {
		aClass16_3842 = null;
		aClass16_3821 = null;
		aClass16_3848 = null;
		aClass16_3812 = null;
		aClass16_3814 = null;
		aClass16_3838 = null;
		aClass16_3840 = null;
		aClass16_3818 = null;
		aClass16_3824 = null;
		aClass16_3843 = null;
		aClass16_3820 = null;
		aClass16_3837 = null;
		aClass16_3844 = null;
		aClass16_3830 = null;
		aClass16_3841 = null;
		aClass16_3850 = null;
		aClass16_3832 = null;
		aClass16_3810 = null;
		aClass16_3849 = null;
		aClass16_3845 = null;
		aClass16_3816 = null;
		aClass16_3808 = null;
		aClass16_3826 = null;
		aClass16Array3823 = null;
	}
	
	private static final int method653(byte[][] bs, byte[][] bs_32_, int[] is, int[] is_33_, int[] is_34_, int i, int i_35_) {
		int i_36_ = is[i];
		int i_37_ = i_36_ + is_34_[i];
		int i_38_ = is[i_35_];
		int i_39_ = i_38_ + is_34_[i_35_];
		int i_40_ = i_36_;
		if (i_38_ > i_36_) {
			i_40_ = i_38_;
		}
		int i_41_ = i_37_;
		if (i_39_ < i_37_) {
			i_41_ = i_39_;
		}
		int i_42_ = is_33_[i];
		if (is_33_[i_35_] < i_42_) {
			i_42_ = is_33_[i_35_];
		}
		byte[] bs_43_ = bs_32_[i];
		byte[] bs_44_ = bs[i_35_];
		int i_45_ = i_40_ - i_36_;
		int i_46_ = i_40_ - i_38_;
		for (int i_47_ = i_40_; i_47_ < i_41_; i_47_++) {
			int i_48_ = bs_43_[i_45_++] + bs_44_[i_46_++];
			if (i_48_ < i_42_) {
				i_42_ = i_48_;
			}
		}
		return -i_42_;
	}
	
	private final void method654(byte[] bs) {
		anIntArray3831 = new int[256];
		if (bs.length == 257) {
			for (int i = 0; i < anIntArray3831.length; i++)
				anIntArray3831[i] = bs[i] & 0xff;
			anInt3811 = bs[256] & 0xff;
		} else {
			int i = 0;
			for (int i_49_ = 0; i_49_ < 256; i_49_++)
				anIntArray3831[i_49_] = bs[i++] & 0xff;
			int[] is = new int[256];
			int[] is_50_ = new int[256];
			for (int i_51_ = 0; i_51_ < 256; i_51_++)
				is[i_51_] = bs[i++] & 0xff;
			for (int i_52_ = 0; i_52_ < 256; i_52_++)
				is_50_[i_52_] = bs[i++] & 0xff;
			byte[][] bs_53_ = new byte[256][];
			for (int i_54_ = 0; i_54_ < 256; i_54_++) {
				bs_53_[i_54_] = new byte[is[i_54_]];
				byte b = 0;
				for (int i_55_ = 0; i_55_ < bs_53_[i_54_].length; i_55_++) {
					b += bs[i++];
					bs_53_[i_54_][i_55_] = b;
				}
			}
			byte[][] bs_56_ = new byte[256][];
			for (int i_57_ = 0; i_57_ < 256; i_57_++) {
				bs_56_[i_57_] = new byte[is[i_57_]];
				byte b = 0;
				for (int i_58_ = 0; i_58_ < bs_56_[i_57_].length; i_58_++) {
					b += bs[i++];
					bs_56_[i_57_][i_58_] = b;
				}
			}
			aByteArray3813 = new byte[65536];
			for (int i_59_ = 0; i_59_ < 256; i_59_++) {
				if (i_59_ != 32 && i_59_ != 160) {
					for (int i_60_ = 0; i_60_ < 256; i_60_++) {
						if (i_60_ != 32 && i_60_ != 160) {
							aByteArray3813[(i_59_ << 8) + i_60_] = (byte) method653(bs_53_, bs_56_, is_50_, anIntArray3831, is, i_59_, i_60_);
						}
					}
				}
			}
			anInt3811 = is_50_[32] + is[32];
		}
	}
	
	final void method655(RSString class16, int i, int i_61_, int i_62_, int i_63_, int i_64_) {
		if (class16 != null) {
			method672(i_62_, i_63_);
			int[] is = new int[class16.anInt1896];
			int[] is_65_ = new int[class16.anInt1896];
			for (int i_66_ = 0; i_66_ < class16.anInt1896; i_66_++) {
				is[i_66_] = (int) (Math.sin((double) i_66_ / 5.0 + (double) i_64_ / 5.0) * 5.0);
				is_65_[i_66_] = (int) (Math.sin((double) i_66_ / 3.0 + (double) i_64_ / 5.0) * 5.0);
			}
			method651(class16, i - method649(class16) / 2, i_61_, is, is_65_);
		}
	}
	
	private final void method656(RSString class16, int i) {
		int i_67_ = 0;
		boolean bool = false;
		for (int i_68_ = 0; i_68_ < class16.method171(); i_68_++) {
			int i_69_ = class16.method166((byte) 123, i_68_);
			if (i_69_ == 60) {
				bool = true;
			} else if (i_69_ == 62) {
				bool = false;
			} else if (!bool && i_69_ == 32) {
				i_67_++;
			}
		}
		if (i_67_ > 0) {
			anInt3839 = (i - method649(class16) << 8) / i_67_;
		}
	}
	
	final void method657(RSString class16, int i, int i_70_, int i_71_, int i_72_, int i_73_) {
		if (class16 != null) {
			method672(i_71_, i_72_);
			int[] is = new int[class16.anInt1896];
			for (int i_74_ = 0; i_74_ < class16.anInt1896; i_74_++)
				is[i_74_] = (int) (Math.sin((double) i_74_ / 2.0 + (double) i_73_ / 5.0) * 5.0);
			method651(class16, i - method649(class16) / 2, i_70_, null, is);
		}
	}
	
	private final void method658(int i, int i_75_, int i_76_) {
		anInt3815 = -1;
		anInt3827 = -1;
		anInt3829 = anInt3828 = i_75_;
		anInt3834 = anInt3835 = i;
		anInt3807 = anInt3851 = i_76_;
		anInt3839 = 0;
		anInt3817 = 0;
	}
	
	private final int method659(int i) {
		return anIntArray3831[i & 0xff];
	}
	
	abstract void method660(int i, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_);
	
	final void method661(Class43[] class43s, int[] is) {
		if (is != null && is.length != class43s.length) {
			throw new IllegalArgumentException();
		}
		aClass43Array3822 = class43s;
		anIntArray3833 = is;
	}
	
	abstract void method662(int i, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_);
	
	abstract void method663(int i, int i_88_, int i_89_, int i_90_, int i_91_, int i_92_);
	
	private final void method664(RSString class16, int i, int i_93_) {
		i_93_ -= anInt3811;
		int i_94_ = -1;
		int i_95_ = -1;
		for (int i_96_ = 0; i_96_ < class16.anInt1896; i_96_++) {
			int i_97_ = class16.aByteArray1906[i_96_] & 0xff;
			if (i_97_ == 60) {
				i_94_ = i_96_;
			} else {
				if (i_97_ == 62 && i_94_ != -1) {
					RSString class16_98_ = class16.method148(i_96_, i_94_ + 1, true);
					i_94_ = -1;
					if (class16_98_.method183(aClass16_3842, (byte) -49)) {
						i_97_ = 60;
					} else if (class16_98_.method183(aClass16_3821, (byte) -49)) {
						i_97_ = 62;
					} else if (class16_98_.method183(aClass16_3848, (byte) -49)) {
						i_97_ = 160;
					} else if (class16_98_.method183(aClass16_3812, (byte) -49)) {
						i_97_ = 173;
					} else if (class16_98_.method183(aClass16_3814, (byte) -49)) {
						i_97_ = 215;
					} else if (class16_98_.method183(aClass16_3838, (byte) -49)) {
						i_97_ = 128;
					} else if (class16_98_.method183(aClass16_3840, (byte) -49)) {
						i_97_ = 169;
					} else if (class16_98_.method183(aClass16_3818, (byte) -49)) {
						i_97_ = 174;
					} else {
						if (class16_98_.method176(aClass16_3824, (byte) -66)) {
							try {
								int i_99_ = class16_98_.method138((byte) 67, 4).method142(true);
								Class43 class43 = aClass43Array3822[i_99_];
								int i_100_ = anIntArray3833 != null ? anIntArray3833[i_99_] : class43.anInt667;
								if (anInt3807 == 256) {
									class43.method1119(i, i_93_ + anInt3811 - i_100_);
								} else {
									class43.method1117(i, i_93_ + anInt3811 - i_100_, anInt3807);
								}
								i += class43.anInt668;
								i_95_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else {
							method675(class16_98_);
						}
						continue;
					}
				}
				if (i_94_ == -1) {
					if (aByteArray3813 != null && i_95_ != -1) {
						i += aByteArray3813[(i_95_ << 8) + i_97_];
					}
					int i_101_ = anIntArray3836[i_97_];
					int i_102_ = anIntArray3825[i_97_];
					if (i_97_ != 32) {
						if (anInt3807 == 256) {
							if (anInt3829 != -1) {
								method662(i_97_, i + anIntArray3847[i_97_] + 1, i_93_ + anIntArray3846[i_97_] + 1, i_101_, i_102_, anInt3829);
							}
							method663(i_97_, i + anIntArray3847[i_97_], i_93_ + anIntArray3846[i_97_], i_101_, i_102_, anInt3834);
						} else {
							if (anInt3829 != -1) {
								method673(i_97_, i + anIntArray3847[i_97_] + 1, i_93_ + anIntArray3846[i_97_] + 1, i_101_, i_102_, anInt3829, anInt3807);
							}
							method660(i_97_, i + anIntArray3847[i_97_], i_93_ + anIntArray3846[i_97_], i_101_, i_102_, anInt3834, anInt3807);
						}
					} else if (anInt3839 > 0) {
						anInt3817 += anInt3839;
						i += anInt3817 >> 8;
						anInt3817 &= 0xff;
					}
					int i_103_ = anIntArray3831[i_97_];
					if (anInt3815 != -1) {
						Class20.method207(i, i_93_ + (int) ((double) anInt3811 * 0.7), i_103_, anInt3815);
					}
					if (anInt3827 != -1) {
						Class20.method207(i, i_93_ + anInt3811 + 1, i_103_, anInt3827);
					}
					i += i_103_;
					i_95_ = i_97_;
				}
			}
		}
	}
	
	final int method665(RSString class16, int i, int i_104_, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_, int i_111_) {
		return method676(class16, i, i_104_, i_105_, i_106_, i_107_, i_108_, 256, i_109_, i_110_, i_111_);
	}
	
	final void method666(RSString class16, int i, int i_112_, int i_113_, int i_114_) {
		if (class16 != null) {
			method672(i_113_, i_114_);
			method664(class16, i - method649(class16) / 2, i_112_);
		}
	}
	
	final int method667(RSString class16, int i) {
		int i_115_ = method671(class16, new int[] { i }, aClass16Array3823);
		int i_116_ = 0;
		for (int i_117_ = 0; i_117_ < i_115_; i_117_++) {
			int i_118_ = method649(aClass16Array3823[i_117_]);
			if (i_118_ > i_116_) {
				i_116_ = i_118_;
			}
		}
		return i_116_;
	}
	
	final void method668(RSString class16, int i, int i_119_, int i_120_, int i_121_) {
		if (class16 != null) {
			method672(i_120_, i_121_);
			method664(class16, i - method649(class16), i_119_);
		}
	}
	
	final int method669(RSString class16, int i) {
		return method671(class16, new int[] { i }, aClass16Array3823);
	}
	
	final void method670(RSString class16, int i, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_) {
		if (class16 != null) {
			method672(i_123_, i_124_);
			double d = 7.0 - (double) i_126_ / 8.0;
			if (d < 0.0) {
				d = 0.0;
			}
			int[] is = new int[class16.anInt1896];
			for (int i_127_ = 0; i_127_ < class16.anInt1896; i_127_++)
				is[i_127_] = (int) (Math.sin((double) i_127_ / 1.5 + (double) i_125_) * d);
			method651(class16, i - method649(class16) / 2, i_122_, null, is);
		}
	}
	
	private final int method671(RSString class16, int[] is, RSString[] class16s) {
		if (class16 == null) {
			return 0;
		}
		int i = 0;
		int i_128_ = 0;
		RSString class16_129_ = Class38_Sub6.method1075(100, 0);
		int i_130_ = -1;
		int i_131_ = 0;
		int i_132_ = 0;
		int i_133_ = -1;
		int i_134_ = -1;
		int i_135_ = 0;
		int i_136_ = class16.method171();
		for (int i_137_ = 0; i_137_ < i_136_; i_137_++) {
			int i_138_ = class16.method166((byte) 106, i_137_);
			if (i_138_ == 60) {
				i_133_ = i_137_;
			} else {
				if (i_138_ == 62 && i_133_ != -1) {
					RSString class16_139_ = class16.method148(i_137_, i_133_ + 1, true);
					i_133_ = -1;
					class16_129_.method156(60, -68);
					class16_129_.method157(class16_139_, (byte) 113);
					class16_129_.method156(62, -100);
					if (class16_139_.method183(aClass16_3843, (byte) -49)) {
						class16s[i_135_++] = class16_129_.method148(class16_129_.method171(), i_128_, true);
						i_128_ = class16_129_.method171();
						i = 0;
						i_130_ = -1;
						i_134_ = -1;
					} else if (class16_139_.method183(aClass16_3842, (byte) -49)) {
						i += method659(60);
						if (aByteArray3813 != null && i_134_ != -1) {
							i += aByteArray3813[(i_134_ << 8) + 60];
						}
						i_134_ = 60;
					} else if (class16_139_.method183(aClass16_3821, (byte) -49)) {
						i += method659(62);
						if (aByteArray3813 != null && i_134_ != -1) {
							i += aByteArray3813[(i_134_ << 8) + 62];
						}
						i_134_ = 62;
					} else if (class16_139_.method183(aClass16_3848, (byte) -49)) {
						i += method659(160);
						if (aByteArray3813 != null && i_134_ != -1) {
							i += aByteArray3813[(i_134_ << 8) + 160];
						}
						i_134_ = 160;
					} else if (class16_139_.method183(aClass16_3812, (byte) -49)) {
						i += method659(173);
						if (aByteArray3813 != null && i_134_ != -1) {
							i += aByteArray3813[(i_134_ << 8) + 173];
						}
						i_134_ = 173;
					} else if (class16_139_.method183(aClass16_3814, (byte) -49)) {
						i += method659(215);
						if (aByteArray3813 != null && i_134_ != -1) {
							i += aByteArray3813[(i_134_ << 8) + 215];
						}
						i_134_ = 215;
					} else if (class16_139_.method183(aClass16_3838, (byte) -49)) {
						i += method659(128);
						if (aByteArray3813 != null && i_134_ != -1) {
							i += aByteArray3813[(i_134_ << 8) + 128];
						}
						i_134_ = 128;
					} else if (class16_139_.method183(aClass16_3840, (byte) -49)) {
						i += method659(169);
						if (aByteArray3813 != null && i_134_ != -1) {
							i += aByteArray3813[(i_134_ << 8) + 169];
						}
						i_134_ = 169;
					} else if (class16_139_.method183(aClass16_3818, (byte) -49)) {
						i += method659(174);
						if (aByteArray3813 != null && i_134_ != -1) {
							i += aByteArray3813[(i_134_ << 8) + 174];
						}
						i_134_ = 174;
					} else if (class16_139_.method176(aClass16_3824, (byte) -106)) {
						try {
							int i_140_ = class16_139_.method138((byte) 67, 4).method142(true);
							i += aClass43Array3822[i_140_].anInt668;
							i_134_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
					}
					i_138_ = -1;
				}
				if (i_133_ == -1) {
					if (i_138_ != -1) {
						class16_129_.method156(i_138_, -33);
						i += method659(i_138_);
						if (aByteArray3813 != null && i_134_ != -1) {
							i += aByteArray3813[(i_134_ << 8) + i_138_];
						}
						i_134_ = i_138_;
					}
					if (i_138_ == 32) {
						i_130_ = class16_129_.method171();
						i_131_ = i;
						i_132_ = 1;
					}
					if (is != null && i > is[i_135_ < is.length ? i_135_ : is.length - 1] && i_130_ >= 0) {
						class16s[i_135_++] = class16_129_.method148(i_130_ - i_132_, i_128_, true);
						i_128_ = i_130_;
						i_130_ = -1;
						i -= i_131_;
						i_134_ = -1;
					}
					if (i_138_ == 45) {
						i_130_ = class16_129_.method171();
						i_131_ = i;
						i_132_ = 0;
					}
				}
			}
		}
		if (class16_129_.method171() > i_128_) {
			class16s[i_135_++] = class16_129_.method148(class16_129_.method171(), i_128_, true);
		}
		return i_135_;
	}
	
	private final void method672(int i, int i_141_) {
		anInt3815 = -1;
		anInt3827 = -1;
		anInt3829 = anInt3828 = i_141_;
		anInt3834 = anInt3835 = i;
		anInt3807 = anInt3851 = 256;
		anInt3839 = 0;
		anInt3817 = 0;
	}
	
	abstract void method673(int i, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_);
	
	static final RSString method674(RSString class16) {
		int i = class16.method171();
		int i_148_ = 0;
		for (int i_149_ = 0; i_149_ < i; i_149_++) {
			byte b = class16.aByteArray1906[i_149_];
			if (b == 60 || b == 62) {
				i_148_ += 3;
			}
		}
		RSString class16_150_ = new RSString();
		class16_150_.anInt1896 = i + i_148_;
		class16_150_.aByteArray1906 = new byte[class16_150_.anInt1896];
		int i_151_ = 0;
		for (int i_152_ = 0; i_152_ < i; i_152_++) {
			byte b = class16.aByteArray1906[i_152_];
			if (b == 60) {
				class16_150_.aByteArray1906[i_151_++] = (byte) 60;
				class16_150_.aByteArray1906[i_151_++] = (byte) 108;
				class16_150_.aByteArray1906[i_151_++] = (byte) 116;
				class16_150_.aByteArray1906[i_151_++] = (byte) 62;
			} else if (b == 62) {
				class16_150_.aByteArray1906[i_151_++] = (byte) 60;
				class16_150_.aByteArray1906[i_151_++] = (byte) 103;
				class16_150_.aByteArray1906[i_151_++] = (byte) 116;
				class16_150_.aByteArray1906[i_151_++] = (byte) 62;
			} else {
				class16_150_.aByteArray1906[i_151_++] = b;
			}
		}
		return class16_150_;
	}
	
	private final void method675(RSString class16) {
		do {
			try {
				if (class16.method176(aClass16_3820, (byte) -84)) {
					anInt3834 = class16.method138((byte) 69, 4).method159((byte) -22, 16);
				} else if (class16.method183(aClass16_3837, (byte) -49)) {
					anInt3834 = anInt3835;
				} else if (class16.method176(aClass16_3844, (byte) -90)) {
					anInt3807 = class16.method138((byte) 87, 6).method142(true);
				} else if (class16.method183(aClass16_3830, (byte) -49)) {
					anInt3807 = anInt3851;
				} else if (class16.method176(aClass16_3816, (byte) -69)) {
					anInt3815 = class16.method138((byte) 77, 4).method159((byte) -22, 16);
				} else if (class16.method183(aClass16_3808, (byte) -49)) {
					anInt3815 = 8388608;
				} else if (class16.method183(aClass16_3826, (byte) -49)) {
					anInt3815 = -1;
				} else if (class16.method176(aClass16_3841, (byte) -83)) {
					anInt3827 = class16.method138((byte) 121, 2).method159((byte) -22, 16);
				} else if (class16.method183(aClass16_3850, (byte) -49)) {
					anInt3827 = 0;
				} else if (class16.method183(aClass16_3832, (byte) -49)) {
					anInt3827 = -1;
				} else if (class16.method176(aClass16_3810, (byte) -95)) {
					anInt3829 = class16.method138((byte) 94, 5).method159((byte) -22, 16);
				} else if (class16.method183(aClass16_3849, (byte) -49)) {
					anInt3829 = 0;
				} else if (class16.method183(aClass16_3845, (byte) -49)) {
					anInt3829 = anInt3828;
				} else {
					if (!class16.method183(aClass16_3843, (byte) -49)) {
						break;
					}
					method658(anInt3835, anInt3828, anInt3851);
				}
			} catch (Exception exception) {
				break;
			}
			break;
		} while (false);
	}
	
	private final int method676(RSString class16, int i, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_, int i_161_) {
		if (class16 == null) {
			return 0;
		}
		method658(i_156_, i_157_, i_158_);
		if (i_161_ == 0) {
			i_161_ = anInt3811;
		}
		int[] is = { i_154_ };
		if (i_155_ < anInt3819 + anInt3809 + i_161_ && i_155_ < i_161_ + i_161_) {
			is = null;
		}
		int i_162_ = method671(class16, is, aClass16Array3823);
		if (i_160_ == 3 && i_162_ == 1) {
			i_160_ = 1;
		}
		int i_163_;
		if (i_160_ == 0) {
			i_163_ = i_153_ + anInt3819;
		} else if (i_160_ == 1) {
			i_163_ = i_153_ + anInt3819 + (i_155_ - anInt3819 - anInt3809 - (i_162_ - 1) * i_161_) / 2;
		} else if (i_160_ == 2) {
			i_163_ = i_153_ + i_155_ - anInt3809 - (i_162_ - 1) * i_161_;
		} else {
			int i_164_ = (i_155_ - anInt3819 - anInt3809 - (i_162_ - 1) * i_161_) / (i_162_ + 1);
			if (i_164_ < 0) {
				i_164_ = 0;
			}
			i_163_ = i_153_ + anInt3819 + i_164_;
			i_161_ += i_164_;
		}
		for (int i_165_ = 0; i_165_ < i_162_; i_165_++) {
			if (i_159_ == 0) {
				method664(aClass16Array3823[i_165_], i, i_163_);
			} else if (i_159_ == 1) {
				method664(aClass16Array3823[i_165_], i + (i_154_ - method649(aClass16Array3823[i_165_])) / 2, i_163_);
			} else if (i_159_ == 2) {
				method664(aClass16Array3823[i_165_], i + i_154_ - method649(aClass16Array3823[i_165_]), i_163_);
			} else if (i_165_ == i_162_ - 1) {
				method664(aClass16Array3823[i_165_], i, i_163_);
			} else {
				method656(aClass16Array3823[i_165_], i_154_);
				method664(aClass16Array3823[i_165_], i, i_163_);
				anInt3839 = 0;
			}
			i_163_ += i_161_;
		}
		return i_162_;
	}
	
	Class23_Sub13_Sub8(byte[] bs, int[] is, int[] is_166_, int[] is_167_, int[] is_168_) {
		anIntArray3847 = is;
		anIntArray3846 = is_166_;
		anIntArray3836 = is_167_;
		anIntArray3825 = is_168_;
		method654(bs);
		int i = 2147483647;
		int i_169_ = -2147483648;
		for (int i_170_ = 0; i_170_ < 256; i_170_++) {
			if (anIntArray3846[i_170_] < i && anIntArray3825[i_170_] != 0) {
				i = anIntArray3846[i_170_];
			}
			if (anIntArray3846[i_170_] + anIntArray3825[i_170_] > i_169_) {
				i_169_ = anIntArray3846[i_170_] + anIntArray3825[i_170_];
			}
		}
		anInt3819 = anInt3811 - i;
		anInt3809 = i_169_ - anInt3811;
	}
	
	Class23_Sub13_Sub8(byte[] bs) {
		method654(bs);
	}
	
	static {
		aClass16_3808 = Class38_Sub6.method1076((byte) 86, "str");
		aClass16_3812 = Class38_Sub6.method1076((byte) 86, "shy");
		aClass16_3810 = Class38_Sub6.method1076((byte) 86, "shad=");
		aClass16_3820 = Class38_Sub6.method1076((byte) 86, "col=");
		aClass16_3824 = Class38_Sub6.method1076((byte) 86, "img=");
		aClass16_3818 = Class38_Sub6.method1076((byte) 86, "reg");
		anInt3815 = -1;
		aClass16Array3823 = new RSString[100];
		anInt3827 = -1;
		aClass16_3837 = Class38_Sub6.method1076((byte) 86, ")4col");
		aClass16_3821 = Class38_Sub6.method1076((byte) 86, "gt");
		anInt3829 = -1;
		anInt3835 = 0;
		anInt3828 = -1;
		aClass16_3842 = Class38_Sub6.method1076((byte) 86, "lt");
		aClass16_3832 = Class38_Sub6.method1076((byte) 86, ")4u");
		anInt3807 = 256;
		aClass16_3840 = Class38_Sub6.method1076((byte) 86, "copy");
		aClass16_3816 = Class38_Sub6.method1076((byte) 86, "str=");
		anInt3839 = 0;
		anInt3834 = 0;
		aClass16_3843 = Class38_Sub6.method1076((byte) 86, "br");
		anInt3817 = 0;
		aClass16_3830 = Class38_Sub6.method1076((byte) 86, ")4trans");
		aClass16_3845 = Class38_Sub6.method1076((byte) 86, ")4shad");
		aClass16_3841 = Class38_Sub6.method1076((byte) 86, "u=");
		aClass16_3844 = Class38_Sub6.method1076((byte) 86, "trans=");
		aClass16_3838 = Class38_Sub6.method1076((byte) 86, "euro");
		aClass16_3826 = Class38_Sub6.method1076((byte) 86, ")4str");
		aClass16_3848 = Class38_Sub6.method1076((byte) 86, "nbsp");
		aClass16_3849 = Class38_Sub6.method1076((byte) 86, "shad");
		aClass16_3850 = Class38_Sub6.method1076((byte) 86, "u");
		anInt3851 = 256;
	}
}

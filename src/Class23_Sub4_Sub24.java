/* Class23_Sub4_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class23_Sub4_Sub24 extends Class23_Sub4
{
	static int anInt3291 = 2;
	static int anInt3292;
	static int anInt3293;
	static RSString aClass16_3294 = Class38_Sub6.method1076((byte) 86, "Mem:");
	static int anInt3295;
	static RSString aClass16_3296 = Class38_Sub6.method1076((byte) 86, "Ihr Charakter)2Profil wird in:");
	static int anInt3297;
	static int anInt3298;
	static int anInt3299;
	static int anInt3300;
	static int anInt3301;
	
	static final void method368(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		anInt3301++;
		int i_8_ = i_6_ - i_0_;
		int i_9_ = (-i + i_7_ << 16) / i_8_;
		if ((i_6_ ^ 0xffffffff) > (Class38_Sub7.anInt2697 ^ 0xffffffff)) {
			i_8_++;
		}
		int i_10_ = i_4_ + -i_3_;
		int i_11_ = (-i_5_ + i_1_ << 16) / i_10_;
		if (i_4_ < ISAACCipher.anInt1238) {
			i_10_++;
		}
		for (int i_12_ = 0; i_12_ < i_10_; i_12_++) {
			int i_13_ = i_12_ * i_11_ >> 16;
			int i_14_ = i_11_ * (1 + i_12_) >> 16;
			int i_15_ = -i_13_ + i_14_;
			if ((i_15_ ^ 0xffffffff) < -1) {
				int i_16_ = i_3_ + i_12_ >> 6;
				i_14_ += i_5_;
				i_13_ += i_5_;
				byte[][] bs = Class55.aByteArrayArrayArray879[i_16_];
				byte[][] bs_17_ = ObjectDefinition.aByteArrayArrayArray3750[i_16_];
				byte[][] bs_18_ = Class23_Sub4_Sub35.aByteArrayArrayArray3457[i_16_];
				int[][] is = Class102.anIntArrayArrayArray1713[i_16_];
				byte[][] bs_19_ = Class47.aByteArrayArrayArray737[i_16_];
				byte[][] bs_20_ = Class83.aByteArrayArrayArray1458[i_16_];
				for (int i_21_ = 0; i_21_ < i_8_; i_21_++) {
					int i_22_ = i_9_ * i_21_ >> 16;
					int i_23_ = i_9_ * (i_21_ + 1) >> 16;
					int i_24_ = -i_22_ + i_23_;
					if ((i_24_ ^ 0xffffffff) < -1) {
						i_23_ += i;
						i_22_ += i;
						int i_25_ = 0x3f & i_0_ + i_21_;
						int i_26_ = i_12_ + i_3_ & 0x3f;
						int i_27_ = i_21_ - -i_0_ >> 6;
						int i_28_ = (i_25_ << 6) - -i_26_;
						int i_29_;
						if (is[i_27_] != null) {
							i_29_ = is[i_27_][i_28_];
						} else {
							int i_30_ = i_12_ - -i_3_ & 0x4;
							int i_31_ = i_21_ - -i_0_ & 0x4;
							if ((i_30_ >= 2 || i_31_ <= 2) && (i_30_ <= 2 || i_31_ >= 2)) {
								i_29_ = Class23_Sub4_Sub6.anIntArray2979[1 + Class17.anInt305];
							} else {
								i_29_ = 4936552;
							}
						}
						int i_32_ = bs[i_27_] != null ? Class23_Sub4_Sub6.anIntArray2979[0xff & bs[i_27_][i_28_]] : 0;
						int i_33_ = bs_18_[i_27_] == null ? 0 : Class23_Sub4_Sub6.anIntArray2979[bs_18_[i_27_][i_28_] & 0xff];
						if (i_32_ == 0 && (i_33_ ^ 0xffffffff) == -1) {
							Class20.method222(i_13_, i_22_, i_15_, i_24_, i_29_);
						} else {
							if ((i_32_ ^ 0xffffffff) != -1) {
								if ((i_32_ ^ 0xffffffff) == 0) {
									i_32_ = 1;
								}
								int i_34_ = bs_17_[i_27_] == null ? (int) 0 : bs_17_[i_27_][i_28_];
								int i_35_ = i_34_ & 0xfc;
								if (i_35_ == 0 || i_15_ <= 1 || i_24_ <= 1) {
									Class20.method222(i_13_, i_22_, i_15_, i_24_, i_32_);
								} else {
									Class23_Sub13_Sub19.method804(0x3 & i_34_, i_22_, 124, i_13_, i_32_, i_24_, i_29_, Class20.anIntArray328, i_35_ >> 2, i_15_, true);
								}
							}
							if (i_33_ != 0) {
								int i_36_ = bs_19_[i_27_][i_28_];
								if (i_33_ == -1) {
									i_33_ = i_29_;
								}
								int i_37_ = 0xfc & i_36_;
								if (i_37_ == 0 || i_15_ <= 1 || i_24_ <= 1) {
									Class20.method222(i_13_, i_22_, i_15_, i_24_, i_33_);
								}
								Class23_Sub13_Sub19.method804(i_36_ & 0x3, i_22_, i_2_ ^ 0x63, i_13_, i_33_, i_24_, 0, Class20.anIntArray328, i_37_ >> 2, i_15_, (i_32_ ^ 0xffffffff) == -1);
							}
						}
						if (bs_20_[i_27_] != null) {
							int i_38_ = bs_20_[i_27_][i_28_] & 0xff;
							if ((i_38_ ^ 0xffffffff) != -1) {
								int i_39_;
								if (i_24_ == 1) {
									i_39_ = i_22_;
								} else {
									i_39_ = i_23_ - 1;
								}
								int i_40_ = 13421772;
								if (i_38_ >= 5 && i_38_ <= 8 || i_38_ >= 13 && i_38_ <= 16 || i_38_ >= 21 && i_38_ <= 24 || i_38_ == 27 || i_38_ == 28) {
									i_40_ = 13369344;
									i_38_ -= 4;
								}
								int i_41_;
								if (i_15_ == 1) {
									i_41_ = i_13_;
								} else {
									i_41_ = i_14_ + -1;
								}
								if (i_38_ == 1) {
									Class20.method211(i_13_, i_22_, i_24_, i_40_);
								} else if (i_38_ == 2) {
									Class20.method207(i_13_, i_22_, i_15_, i_40_);
								} else if (i_38_ != 3) {
									if (i_38_ != 4) {
										if (i_38_ == 9) {
											Class20.method211(i_13_, i_22_, i_24_, 16777215);
											Class20.method207(i_13_, i_22_, i_15_, i_40_);
										} else if (i_38_ == 10) {
											Class20.method211(i_41_, i_22_, i_24_, 16777215);
											Class20.method207(i_13_, i_22_, i_15_, i_40_);
										} else if (i_38_ != 11) {
											if (i_38_ == 12) {
												Class20.method211(i_13_, i_22_, i_24_, 16777215);
												Class20.method207(i_13_, i_39_, i_15_, i_40_);
											} else if (i_38_ != 17) {
												if (i_38_ != 18) {
													if (i_38_ == 19) {
														Class20.method207(i_41_, i_39_, 1, i_40_);
													} else if (i_38_ == 20) {
														Class20.method207(i_13_, i_39_, 1, i_40_);
													} else if (i_38_ != 25) {
														if (i_38_ == 26) {
															for (int i_42_ = 0; i_42_ < i_24_; i_42_++)
																Class20.method207(i_13_ - -i_42_, i_42_ + i_22_, 1, i_40_);
														}
													} else {
														for (int i_43_ = 0; (i_24_ ^ 0xffffffff) < (i_43_ ^ 0xffffffff); i_43_++)
															Class20.method207(i_43_ + i_13_, i_39_ - i_43_, 1, i_40_);
													}
												} else {
													Class20.method207(i_41_, i_22_, 1, i_40_);
												}
											} else {
												Class20.method207(i_13_, i_22_, 1, i_40_);
											}
										} else {
											Class20.method211(i_41_, i_22_, i_24_, 16777215);
											Class20.method207(i_13_, i_39_, i_15_, i_40_);
										}
									} else {
										Class20.method207(i_13_, i_39_, i_15_, i_40_);
									}
								} else {
									Class20.method211(i_41_, i_22_, i_24_, i_40_);
								}
							}
						}
					}
				}
			}
		}
		if (i_2_ != 1) {
			method371(null, false, -89, 66);
		}
		for (int i_44_ = 0; (i_44_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff); i_44_++) {
			int i_45_ = i_11_ * (i_44_ - -1) >> 16;
			int i_46_ = i_44_ * i_11_ >> 16;
			int i_47_ = i_45_ + -i_46_;
			if (i_47_ > 0) {
				i_46_ += i_5_;
				byte[][] bs = Class32.aByteArrayArrayArray506[i_44_ + i_3_ >> 6];
				i_45_ += i_5_;
				for (int i_48_ = 0; i_48_ < i_8_; i_48_++) {
					int i_49_ = i_48_ * i_9_ >> 16;
					int i_50_ = (i_48_ - -1) * i_9_ >> 16;
					int i_51_ = i_50_ - i_49_;
					if ((i_51_ ^ 0xffffffff) < -1) {
						int i_52_ = i_0_ + i_48_ >> 6;
						i_49_ += i;
						int i_53_ = (i_44_ + i_3_ & 0x3f) + ((0x3f & i_0_ + i_48_) << 6);
						i_50_ += i;
						if (bs[i_52_] != null) {
							int i_54_ = bs[i_52_][i_53_] & 0xff;
							if (i_54_ != 0) {
								if (i_54_ == 47 || i_54_ == 53) {
									Class23_Sub13_Sub23.aClass43_Sub1Array4245[-1 + i_54_].method1122(i_46_, i_49_, 2 * i_47_ - -1, 1 + 2 * i_51_);
								} else {
									Class23_Sub13_Sub23.aClass43_Sub1Array4245[i_54_ + -1].method1122(-(i_47_ / 2) + i_46_, -(i_51_ / 2) + i_49_, 2 * i_47_, i_51_ * 2);
								}
							}
						}
					}
				}
			}
		}
	}
	
	final int[] method260(int i, int i_55_) {
		anInt3297++;
		int[] is = aClass99_2115.method1500(i_55_, (byte) -109);
		if (i != 0) {
			method370(null, true, 100);
		}
		if (aClass99_2115.aBoolean1681) {
			int[] is_56_ = this.method261(i_55_, 0, (byte) 18);
			int[] is_57_ = this.method261(i_55_, 1, (byte) 18);
			int[] is_58_ = this.method261(i_55_, 2, (byte) 18);
			for (int i_59_ = 0; (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) < (i_59_ ^ 0xffffffff); i_59_++) {
				int i_60_ = is_58_[i_59_];
				if (i_60_ == 4096) {
					is[i_59_] = is_56_[i_59_];
				} else if (i_60_ == 0) {
					is[i_59_] = is_57_[i_59_];
				} else {
					is[i_59_] = is_57_[i_59_] * (-i_60_ + 4096) + is_56_[i_59_] * i_60_ >> 12;
				}
			}
		}
		return is;
	}
	
	static final void method369(int i) {
		if (i <= -109) {
			Class23_Sub13_Sub6.aClass5_3729.method68(0);
			anInt3295++;
		}
	}
	
	public Class23_Sub4_Sub24() {
		super(3, false);
	}
	
	final int[][] method258(int i, byte b) {
		int[][] is = aClass103_2108.method1518(-29659, i);
		if (aClass103_2108.aBoolean1733) {
			int[] is_61_ = this.method261(i, 2, (byte) 18);
			int[][] is_62_ = this.method256(0, (byte) -60, i);
			int[][] is_63_ = this.method256(1, (byte) -121, i);
			int[] is_64_ = is[0];
			int[] is_65_ = is[1];
			int[] is_66_ = is[2];
			int[] is_67_ = is_62_[0];
			int[] is_68_ = is_62_[1];
			int[] is_69_ = is_63_[0];
			int[] is_70_ = is_62_[2];
			int[] is_71_ = is_63_[1];
			int[] is_72_ = is_63_[2];
			for (int i_73_ = 0; (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) < (i_73_ ^ 0xffffffff); i_73_++) {
				int i_74_ = is_61_[i_73_];
				if (i_74_ == 4096) {
					is_64_[i_73_] = is_67_[i_73_];
					is_65_[i_73_] = is_68_[i_73_];
					is_66_[i_73_] = is_70_[i_73_];
				} else if ((i_74_ ^ 0xffffffff) == -1) {
					is_64_[i_73_] = is_69_[i_73_];
					is_65_[i_73_] = is_71_[i_73_];
					is_66_[i_73_] = is_72_[i_73_];
				} else {
					int i_75_ = -i_74_ + 4096;
					is_64_[i_73_] = is_67_[i_73_] * i_74_ - -(i_75_ * is_69_[i_73_]) >> 12;
					is_65_[i_73_] = is_68_[i_73_] * i_74_ - -(i_75_ * is_71_[i_73_]) >> 12;
					is_66_[i_73_] = i_75_ * is_72_[i_73_] + i_74_ * is_70_[i_73_] >> 12;
				}
			}
		}
		anInt3298++;
		if (b != 9) {
			method369(-28);
		}
		return is;
	}
	
	static final Class43_Sub1[] method370(Class105 class105, boolean bool, int i) {
		if (bool != false) {
			return null;
		}
		anInt3293++;
		if (!Applet_Sub1.method32(class105, i, 3)) {
			return null;
		}
		return Class23_Sub4.method263(111);
	}
	
	static final Class78 method371(Component component, boolean bool, int i, int i_76_) {
		anInt3299++;
		try {
			Class var_class = Class.forName("Class78_Sub1");
			Class78 class78 = (Class78) var_class.newInstance();
			class78.method1346(component, i_76_, i, 0);
			if (bool != false) {
				method371(null, true, -113, -46);
			}
			return class78;
		} catch (Throwable throwable) {
			Class78_Sub2 class78_sub2 = new Class78_Sub2();
			class78_sub2.method1346(component, i_76_, i, 0);
			return class78_sub2;
		}
	}
	
	final void method255(Buffer class23_sub5, int i, int i_77_) {
		if (i == 0) {
			aBoolean2117 = class23_sub5.readUByte() == 1;
		}
		anInt3292++;
		if (i_77_ != 1000) {
			anInt3291 = 6;
		}
	}
	
	public static void method372(int i) {
		aClass16_3294 = null;
		if (i != 5864) {
			aClass16_3294 = null;
		}
		aClass16_3296 = null;
	}
}

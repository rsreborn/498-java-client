/* Class23_Sub13_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class23_Sub13_Sub19 extends Class23_Sub13
{
	protected int anInt4105;
	protected boolean aBoolean4106;
	private int anInt4107;
	private boolean aBoolean4108;
	private float aFloat4109;
	static Random aRandom4110;
	static int anInt4111;
	private int[] anIntArray4112;
	static RSString aClass16_4113 = Class38_Sub6.method1076((byte) 86, "Benutzeroberfl-=che geladen)3");
	static int anInt4114;
	static int anInt4115;
	static int anInt4116;
	static RSString aClass16_4117;
	static Class105_Sub1 aClass105_Sub1_4118;
	private int anInt4119;
	static int anInt4120;
	protected int anInt4121;
	private Class1 aClass1_4122;
	static int anInt4123;
	static int anInt4124;
	protected boolean aBoolean4125 = false;
	static int anInt4126;
	static int anInt4127;
	static int anInt4128;
	protected boolean aBoolean4129;
	static int anInt4130;
	static int anInt4131;
	static Class64 aClass64_4132 = null;
	private int anInt4133;
	private boolean aBoolean4134;
	static Class90[] aClass90Array4135;
	static int anInt4136;
	
	public static void method802(int i) {
		aClass16_4117 = null;
		aClass64_4132 = null;
		aClass16_4113 = null;
		aClass90Array4135 = null;
		aRandom4110 = null;
		int i_0_ = 39 / ((-51 - i) / 53);
		aClass105_Sub1_4118 = null;
	}
	
	static final void method803(byte b) {
		int i = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 115, 8);
		if ((Class23_Sub4_Sub11.anInt3067 ^ 0xffffffff) < (i ^ 0xffffffff)) {
			for (int i_1_ = i; (i_1_ ^ 0xffffffff) > (Class23_Sub4_Sub11.anInt3067 ^ 0xffffffff); i_1_++)
				Class54.anIntArray857[Class23_Sub4_Sub10.anInt3061++] = Class23_Sub13_Sub3.anIntArray3700[i_1_];
		}
		anInt4128++;
		if (i > Class23_Sub4_Sub11.anInt3067) {
			throw new RuntimeException("gppov1");
		}
		Class23_Sub4_Sub11.anInt3067 = 0;
		for (int i_2_ = 0; i > i_2_; i_2_++) {
			int i_3_ = Class23_Sub13_Sub3.anIntArray3700[i_2_];
			Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_3_];
			int i_4_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 120, 1);
			if ((i_4_ ^ 0xffffffff) == -1) {
				Class23_Sub13_Sub3.anIntArray3700[Class23_Sub4_Sub11.anInt3067++] = i_3_;
				class38_sub7_sub2.anInt2698 = Class89.anInt1511;
			} else {
				int i_5_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 125, 2);
				if (i_5_ == 0) {
					Class23_Sub13_Sub3.anIntArray3700[Class23_Sub4_Sub11.anInt3067++] = i_3_;
					class38_sub7_sub2.anInt2698 = Class89.anInt1511;
					Class94.anIntArray1603[Class23_Sub2.anInt2048++] = i_3_;
				} else if (i_5_ == 1) {
					Class23_Sub13_Sub3.anIntArray3700[Class23_Sub4_Sub11.anInt3067++] = i_3_;
					class38_sub7_sub2.anInt2698 = Class89.anInt1511;
					int i_6_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 116, 3);
					class38_sub7_sub2.method1084(i_6_, false, -30438);
					int i_7_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 123, 1);
					if (i_7_ == 1) {
						Class94.anIntArray1603[Class23_Sub2.anInt2048++] = i_3_;
					}
				} else if (i_5_ == 2) {
					Class23_Sub13_Sub3.anIntArray3700[Class23_Sub4_Sub11.anInt3067++] = i_3_;
					class38_sub7_sub2.anInt2698 = Class89.anInt1511;
					int i_8_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 123, 3);
					class38_sub7_sub2.method1084(i_8_, true, b + -30427);
					int i_9_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 114, 3);
					class38_sub7_sub2.method1084(i_9_, true, -30438);
					int i_10_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 123, 1);
					if (i_10_ == 1) {
						Class94.anIntArray1603[Class23_Sub2.anInt2048++] = i_3_;
					}
				} else if (i_5_ == 3) {
					Class54.anIntArray857[Class23_Sub4_Sub10.anInt3061++] = i_3_;
				}
			}
		}
		if (b != -11) {
			anInt4136 = 3;
		}
	}
	
	static final void method804(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int[] is, int i_17_, int i_18_, boolean bool) {
		if (Class20.anInt333 > i_13_) {
			i_18_ -= -i_13_ + Class20.anInt333;
			i_13_ = Class20.anInt333;
		}
		if ((i_11_ ^ 0xffffffff) > (Class20.anInt332 ^ 0xffffffff)) {
			i_15_ -= Class20.anInt332 + -i_11_;
			i_11_ = Class20.anInt332;
		}
		if (i_17_ == 9) {
			i_17_ = 1;
			i = 0x3 & i + 1;
		}
		if (i_17_ == 10) {
			i_17_ = 1;
			i = 3 + i & 0x3;
		}
		if (i_17_ == 11) {
			i = 0x3 & i + 3;
			i_17_ = 8;
		}
		if (Class20.anInt334 < i_15_ + i_11_) {
			i_15_ = Class20.anInt334 + -i_11_;
		}
		if ((i_18_ + i_13_ ^ 0xffffffff) < (Class20.anInt330 ^ 0xffffffff)) {
			i_18_ = -i_13_ + Class20.anInt330;
		}
		int i_19_ = 90 / ((i_12_ - 47) / 48);
		anInt4130++;
		int i_20_ = i_13_ + i_11_ * Class20.anInt329;
		int i_21_ = -i_18_ + Class20.anInt329;
		if (i_17_ == 1) {
			if (i == 0) {
				for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff); i_22_++) {
					for (int i_23_ = 0; i_18_ > i_23_; i_23_++) {
						if (i_23_ > i_22_) {
							if (bool) {
								is[i_20_] = i_16_;
							}
						} else {
							is[i_20_] = i_14_;
						}
						i_20_++;
					}
					i_20_ += i_21_;
				}
			} else if (i == 1) {
				for (int i_24_ = i_15_ + -1; i_24_ >= 0; i_24_--) {
					for (int i_25_ = 0; (i_18_ ^ 0xffffffff) < (i_25_ ^ 0xffffffff); i_25_++) {
						if ((i_24_ ^ 0xffffffff) > (i_25_ ^ 0xffffffff)) {
							if (bool) {
								is[i_20_] = i_16_;
							}
						} else {
							is[i_20_] = i_14_;
						}
						i_20_++;
					}
					i_20_ += i_21_;
				}
			} else if (i == 2) {
				for (int i_26_ = 0; i_26_ < i_15_; i_26_++) {
					for (int i_27_ = 0; (i_27_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff); i_27_++) {
						if (i_27_ < i_26_) {
							if (bool) {
								is[i_20_] = i_16_;
							}
						} else {
							is[i_20_] = i_14_;
						}
						i_20_++;
					}
					i_20_ += i_21_;
				}
			} else if (i == 3) {
				for (int i_28_ = -1 + i_15_; (i_28_ ^ 0xffffffff) <= -1; i_28_--) {
					for (int i_29_ = 0; i_29_ < i_18_; i_29_++) {
						if ((i_29_ ^ 0xffffffff) <= (i_28_ ^ 0xffffffff)) {
							is[i_20_] = i_14_;
						} else if (bool) {
							is[i_20_] = i_16_;
						}
						i_20_++;
					}
					i_20_ += i_21_;
				}
			}
		} else if (i_17_ == 2) {
			if (i == 0) {
				for (int i_30_ = i_15_ + -1; i_30_ >= 0; i_30_--) {
					for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff); i_31_++) {
						if (i_30_ >> 1 >= i_31_) {
							is[i_20_] = i_14_;
						} else if (bool) {
							is[i_20_] = i_16_;
						}
						i_20_++;
					}
					i_20_ += i_21_;
				}
			} else if (i == 1) {
				for (int i_32_ = 0; (i_15_ ^ 0xffffffff) < (i_32_ ^ 0xffffffff); i_32_++) {
					for (int i_33_ = 0; i_33_ < i_18_; i_33_++) {
						if ((i_33_ ^ 0xffffffff) <= (i_32_ << 1 ^ 0xffffffff)) {
							is[i_20_] = i_14_;
						} else if (bool) {
							is[i_20_] = i_16_;
						}
						i_20_++;
					}
					i_20_ += i_21_;
				}
			} else if (i == 2) {
				for (int i_34_ = 0; (i_15_ ^ 0xffffffff) < (i_34_ ^ 0xffffffff); i_34_++) {
					for (int i_35_ = -1 + i_18_; (i_35_ ^ 0xffffffff) <= -1; i_35_--) {
						if (i_34_ >> 1 >= i_35_) {
							is[i_20_] = i_14_;
						} else if (bool) {
							is[i_20_] = i_16_;
						}
						i_20_++;
					}
					i_20_ += i_21_;
				}
			} else if (i == 3) {
				for (int i_36_ = i_15_ - 1; (i_36_ ^ 0xffffffff) <= -1; i_36_--) {
					for (int i_37_ = -1 + i_18_; i_37_ >= 0; i_37_--) {
						if (i_36_ << 1 > i_37_) {
							if (bool) {
								is[i_20_] = i_16_;
							}
						} else {
							is[i_20_] = i_14_;
						}
						i_20_++;
					}
					i_20_ += i_21_;
				}
			}
		} else if (i_17_ == 3) {
			if (i == 0) {
				for (int i_38_ = i_15_ - 1; i_38_ >= 0; i_38_--) {
					for (int i_39_ = -1 + i_18_; (i_39_ ^ 0xffffffff) <= -1; i_39_--) {
						if (i_38_ >> 1 >= i_39_) {
							is[i_20_] = i_14_;
						} else if (bool) {
							is[i_20_] = i_16_;
						}
						i_20_++;
					}
					i_20_ += i_21_;
				}
			} else if (i == 1) {
				for (int i_40_ = i_15_ - 1; (i_40_ ^ 0xffffffff) <= -1; i_40_--) {
					for (int i_41_ = 0; (i_18_ ^ 0xffffffff) < (i_41_ ^ 0xffffffff); i_41_++) {
						if (i_40_ << 1 <= i_41_) {
							is[i_20_] = i_14_;
						} else if (bool) {
							is[i_20_] = i_16_;
						}
						i_20_++;
					}
					i_20_ += i_21_;
				}
			} else if (i == 2) {
				for (int i_42_ = 0; (i_15_ ^ 0xffffffff) < (i_42_ ^ 0xffffffff); i_42_++) {
					for (int i_43_ = 0; (i_18_ ^ 0xffffffff) < (i_43_ ^ 0xffffffff); i_43_++) {
						if ((i_42_ >> 1 ^ 0xffffffff) <= (i_43_ ^ 0xffffffff)) {
							is[i_20_] = i_14_;
						} else if (bool) {
							is[i_20_] = i_16_;
						}
						i_20_++;
					}
					i_20_ += i_21_;
				}
			} else if (i == 3) {
				for (int i_44_ = 0; i_15_ > i_44_; i_44_++) {
					for (int i_45_ = i_18_ + -1; i_45_ >= 0; i_45_--) {
						if ((i_45_ ^ 0xffffffff) > (i_44_ << 1 ^ 0xffffffff)) {
							if (bool) {
								is[i_20_] = i_16_;
							}
						} else {
							is[i_20_] = i_14_;
						}
						i_20_++;
					}
					i_20_ += i_21_;
				}
			}
		} else if (i_17_ == 4) {
			if ((i ^ 0xffffffff) == -1) {
				for (int i_46_ = -1 + i_15_; i_46_ >= 0; i_46_--) {
					for (int i_47_ = 0; i_18_ > i_47_; i_47_++) {
						if (i_46_ >> 1 > i_47_) {
							if (bool) {
								is[i_20_] = i_16_;
							}
						} else {
							is[i_20_] = i_14_;
						}
						i_20_++;
					}
					i_20_ += i_21_;
				}
			} else if (i == 1) {
				for (int i_48_ = 0; i_15_ > i_48_; i_48_++) {
					for (int i_49_ = 0; (i_18_ ^ 0xffffffff) < (i_49_ ^ 0xffffffff); i_49_++) {
						if (i_49_ <= i_48_ << 1) {
							is[i_20_] = i_14_;
						} else if (bool) {
							is[i_20_] = i_16_;
						}
						i_20_++;
					}
					i_20_ += i_21_;
				}
			} else if (i == 2) {
				for (int i_50_ = 0; (i_50_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff); i_50_++) {
					for (int i_51_ = i_18_ + -1; i_51_ >= 0; i_51_--) {
						if (i_51_ >= i_50_ >> 1) {
							is[i_20_] = i_14_;
						} else if (bool) {
							is[i_20_] = i_16_;
						}
						i_20_++;
					}
					i_20_ += i_21_;
				}
			} else if (i == 3) {
				for (int i_52_ = -1 + i_15_; i_52_ >= 0; i_52_--) {
					for (int i_53_ = i_18_ - 1; i_53_ >= 0; i_53_--) {
						if ((i_52_ << 1 ^ 0xffffffff) > (i_53_ ^ 0xffffffff)) {
							if (bool) {
								is[i_20_] = i_16_;
							}
						} else {
							is[i_20_] = i_14_;
						}
						i_20_++;
					}
					i_20_ += i_21_;
				}
			}
		} else if (i_17_ == 5) {
			if ((i ^ 0xffffffff) == -1) {
				for (int i_54_ = i_15_ - 1; i_54_ >= 0; i_54_--) {
					for (int i_55_ = -1 + i_18_; (i_55_ ^ 0xffffffff) <= -1; i_55_--) {
						if (i_54_ >> 1 <= i_55_) {
							is[i_20_] = i_14_;
						} else if (bool) {
							is[i_20_] = i_16_;
						}
						i_20_++;
					}
					i_20_ += i_21_;
				}
			} else if (i == 1) {
				for (int i_56_ = i_15_ - 1; (i_56_ ^ 0xffffffff) <= -1; i_56_--) {
					for (int i_57_ = 0; i_18_ > i_57_; i_57_++) {
						if ((i_56_ << 1 ^ 0xffffffff) > (i_57_ ^ 0xffffffff)) {
							if (bool) {
								is[i_20_] = i_16_;
							}
						} else {
							is[i_20_] = i_14_;
						}
						i_20_++;
					}
					i_20_ += i_21_;
				}
			} else if (i == 2) {
				for (int i_58_ = 0; i_15_ > i_58_; i_58_++) {
					for (int i_59_ = 0; i_18_ > i_59_; i_59_++) {
						if (i_58_ >> 1 <= i_59_) {
							is[i_20_] = i_14_;
						} else if (bool) {
							is[i_20_] = i_16_;
						}
						i_20_++;
					}
					i_20_ += i_21_;
				}
			} else if (i == 3) {
				for (int i_60_ = 0; (i_15_ ^ 0xffffffff) < (i_60_ ^ 0xffffffff); i_60_++) {
					for (int i_61_ = i_18_ - 1; i_61_ >= 0; i_61_--) {
						if (i_60_ << 1 < i_61_) {
							if (bool) {
								is[i_20_] = i_16_;
							}
						} else {
							is[i_20_] = i_14_;
						}
						i_20_++;
					}
					i_20_ += i_21_;
				}
			}
		} else {
			if (i_17_ == 6) {
				if ((i ^ 0xffffffff) == -1) {
					for (int i_62_ = 0; i_15_ > i_62_; i_62_++) {
						for (int i_63_ = 0; i_63_ < i_18_; i_63_++) {
							if (i_63_ > i_18_ / 2) {
								if (bool) {
									is[i_20_] = i_16_;
								}
							} else {
								is[i_20_] = i_14_;
							}
							i_20_++;
						}
						i_20_ += i_21_;
					}
					return;
				}
				if (i == 1) {
					for (int i_64_ = 0; i_15_ > i_64_; i_64_++) {
						for (int i_65_ = 0; (i_65_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff); i_65_++) {
							if ((i_15_ / 2 ^ 0xffffffff) <= (i_64_ ^ 0xffffffff)) {
								is[i_20_] = i_14_;
							} else if (bool) {
								is[i_20_] = i_16_;
							}
							i_20_++;
						}
						i_20_ += i_21_;
					}
					return;
				}
				if (i == 2) {
					for (int i_66_ = 0; (i_15_ ^ 0xffffffff) < (i_66_ ^ 0xffffffff); i_66_++) {
						for (int i_67_ = 0; i_67_ < i_18_; i_67_++) {
							if (i_18_ / 2 <= i_67_) {
								is[i_20_] = i_14_;
							} else if (bool) {
								is[i_20_] = i_16_;
							}
							i_20_++;
						}
						i_20_ += i_21_;
					}
					return;
				}
				if (i == 3) {
					for (int i_68_ = 0; i_68_ < i_15_; i_68_++) {
						for (int i_69_ = 0; i_18_ > i_69_; i_69_++) {
							if ((i_68_ ^ 0xffffffff) <= (i_15_ / 2 ^ 0xffffffff)) {
								is[i_20_] = i_14_;
							} else if (bool) {
								is[i_20_] = i_16_;
							}
							i_20_++;
						}
						i_20_ += i_21_;
					}
					return;
				}
			}
			if (i_17_ == 7) {
				if ((i ^ 0xffffffff) == -1) {
					for (int i_70_ = 0; (i_15_ ^ 0xffffffff) < (i_70_ ^ 0xffffffff); i_70_++) {
						for (int i_71_ = 0; (i_71_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff); i_71_++) {
							if (i_71_ <= -(i_15_ / 2) + i_70_) {
								is[i_20_] = i_14_;
							} else if (bool) {
								is[i_20_] = i_16_;
							}
							i_20_++;
						}
						i_20_ += i_21_;
					}
					return;
				}
				if (i == 1) {
					for (int i_72_ = -1 + i_15_; i_72_ >= 0; i_72_--) {
						for (int i_73_ = 0; (i_73_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff); i_73_++) {
							if (i_73_ <= i_72_ + -(i_15_ / 2)) {
								is[i_20_] = i_14_;
							} else if (bool) {
								is[i_20_] = i_16_;
							}
							i_20_++;
						}
						i_20_ += i_21_;
					}
					return;
				}
				if (i == 2) {
					for (int i_74_ = i_15_ + -1; (i_74_ ^ 0xffffffff) <= -1; i_74_--) {
						for (int i_75_ = i_18_ - 1; (i_75_ ^ 0xffffffff) <= -1; i_75_--) {
							if ((-(i_15_ / 2) + i_74_ ^ 0xffffffff) <= (i_75_ ^ 0xffffffff)) {
								is[i_20_] = i_14_;
							} else if (bool) {
								is[i_20_] = i_16_;
							}
							i_20_++;
						}
						i_20_ += i_21_;
					}
					return;
				}
				if (i == 3) {
					for (int i_76_ = 0; (i_76_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff); i_76_++) {
						for (int i_77_ = i_18_ + -1; (i_77_ ^ 0xffffffff) <= -1; i_77_--) {
							if (i_76_ - i_15_ / 2 >= i_77_) {
								is[i_20_] = i_14_;
							} else if (bool) {
								is[i_20_] = i_16_;
							}
							i_20_++;
						}
						i_20_ += i_21_;
					}
					return;
				}
			}
			if (i_17_ == 8) {
				if (i == 0) {
					for (int i_78_ = 0; i_78_ < i_15_; i_78_++) {
						for (int i_79_ = 0; i_18_ > i_79_; i_79_++) {
							if ((i_79_ ^ 0xffffffff) <= (i_78_ + -(i_15_ / 2) ^ 0xffffffff)) {
								is[i_20_] = i_14_;
							} else if (bool) {
								is[i_20_] = i_16_;
							}
							i_20_++;
						}
						i_20_ += i_21_;
					}
				} else if (i == 1) {
					for (int i_80_ = -1 + i_15_; i_80_ >= 0; i_80_--) {
						for (int i_81_ = 0; i_81_ < i_18_; i_81_++) {
							if (i_81_ < i_80_ + -(i_15_ / 2)) {
								if (bool) {
									is[i_20_] = i_16_;
								}
							} else {
								is[i_20_] = i_14_;
							}
							i_20_++;
						}
						i_20_ += i_21_;
					}
				} else if (i == 2) {
					for (int i_82_ = i_15_ - 1; i_82_ >= 0; i_82_--) {
						for (int i_83_ = -1 + i_18_; i_83_ >= 0; i_83_--) {
							if ((-(i_15_ / 2) + i_82_ ^ 0xffffffff) < (i_83_ ^ 0xffffffff)) {
								if (bool) {
									is[i_20_] = i_16_;
								}
							} else {
								is[i_20_] = i_14_;
							}
							i_20_++;
						}
						i_20_ += i_21_;
					}
				} else if (i == 3) {
					for (int i_84_ = 0; i_15_ > i_84_; i_84_++) {
						for (int i_85_ = -1 + i_18_; (i_85_ ^ 0xffffffff) <= -1; i_85_--) {
							if (i_84_ - i_15_ / 2 <= i_85_) {
								is[i_20_] = i_14_;
							} else if (bool) {
								is[i_20_] = i_16_;
							}
							i_20_++;
						}
						i_20_ += i_21_;
					}
				}
			}
		}
	}
	
	protected final void finalize() throws Throwable {
		anInt4116++;
		super.finalize();
	}
	
	final int[] method805(int i, Class105 class105, int i_86_, Interface1 interface1) {
		if (i <= 115) {
			return null;
		}
		anInt4111++;
		if (!aClass1_4122.method45(interface1, class105, 0)) {
			return null;
		}
		int i_87_ = (anInt4121 ^ 0xffffffff) < (i_86_ ^ 0xffffffff) ? i_86_ : anInt4121;
		return aClass1_4122.method46(false, i_87_, class105, i_87_, aBoolean4108, interface1, (byte) -124, 1.0);
	}
	
	final void method806(int i, byte b) {
		if (b != 69) {
			method806(-21, (byte) -112);
		}
		anInt4115++;
		if (anIntArray4112 != null) {
			if ((anInt4107 ^ 0xffffffff) != -1 || anInt4133 != 0) {
				if (Class81.anIntArray1424 == null || (Class81.anIntArray1424.length ^ 0xffffffff) > (anIntArray4112.length ^ 0xffffffff)) {
					Class81.anIntArray1424 = new int[anIntArray4112.length];
				}
				int i_88_ = anIntArray4112.length == 4096 ? 64 : 128;
				int i_89_ = anInt4133 * i;
				int i_90_ = anIntArray4112.length;
				int i_91_ = -1 + i_88_;
				int i_92_ = i_88_ * (i * anInt4107);
				int i_93_ = i_90_ + -1;
				for (int i_94_ = 0; (i_90_ ^ 0xffffffff) < (i_94_ ^ 0xffffffff); i_94_ += i_88_) {
					int i_95_ = i_93_ & i_92_ + i_94_;
					for (int i_96_ = 0; (i_88_ ^ 0xffffffff) < (i_96_ ^ 0xffffffff); i_96_++) {
						int i_97_ = i_94_ - -i_96_;
						int i_98_ = (i_89_ + i_96_ & i_91_) + i_95_;
						Class81.anIntArray1424[i_97_] = anIntArray4112[i_98_];
					}
				}
				int[] is = anIntArray4112;
				anIntArray4112 = Class81.anIntArray1424;
				Class81.anIntArray1424 = is;
			}
		}
	}
	
	static final int method807(int i, byte b) {
		if (b > -112) {
			method812(-116L, (short) -51, -39, null, -58, null, -96);
		}
		anInt4114++;
		return i >>> 7;
	}
	
	final boolean method808(byte b, Class105 class105, Interface1 interface1) {
		if (b != -88) {
			method809(false);
		}
		anInt4127++;
		return aClass1_4122.method45(interface1, class105, 0);
	}
	
	static final void method809(boolean bool) {
		if (bool != false) {
			method809(false);
		}
		anInt4126++;
		while (Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method488(1693770787, Class23_Sub4_Sub2.anInt2925) >= 27) {
			int i = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 110, 15);
			if ((i ^ 0xffffffff) == -32768) {
				break;
			}
			boolean bool_99_ = false;
			if (Class31.aClass38_Sub7_Sub1Array483[i] == null) {
				bool_99_ = true;
				Class31.aClass38_Sub7_Sub1Array483[i] = new Class38_Sub7_Sub1();
			}
			Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[i];
			Class23_Sub4_Sub17.anIntArray3170[Class23_Sub4_Sub18.anInt3191++] = i;
			class38_sub7_sub1.anInt2698 = Class89.anInt1511;
			int i_100_ = Class23_Sub4_Sub13.anIntArray3097[Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 118, 3)];
			if (bool_99_) {
				class38_sub7_sub1.anInt2682 = class38_sub7_sub1.anInt2680 = i_100_;
			}
			int i_101_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 121, 1);
			int i_102_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 125, 1);
			if (i_102_ == 1) {
				Class94.anIntArray1603[Class23_Sub2.anInt2048++] = i;
			}
			class38_sub7_sub1.aClass23_Sub13_Sub20_4373 = Class25.method922(bool, Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 126, 14));
			int i_103_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 112, 5);
			int i_104_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 115, 5);
			class38_sub7_sub1.anInt2668 = class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4173;
			class38_sub7_sub1.anInt2700 = class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4170;
			if (i_103_ > 15) {
				i_103_ -= 32;
			}
			class38_sub7_sub1.anInt2678 = class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4143;
			class38_sub7_sub1.anInt2630 = class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4152;
			class38_sub7_sub1.anInt2653 = class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4162;
			if (class38_sub7_sub1.anInt2630 == 0) {
				class38_sub7_sub1.anInt2680 = 0;
			}
			class38_sub7_sub1.anInt2641 = class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4142;
			class38_sub7_sub1.anInt2691 = class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4181;
			class38_sub7_sub1.anInt2635 = class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4144;
			if (i_104_ > 15) {
				i_104_ -= 32;
			}
			class38_sub7_sub1.anInt2655 = class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4148;
			class38_sub7_sub1.method1085(Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0] + i_103_, (byte) -109, i_101_ == 1, i_104_ + Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0]);
		}
		Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method485(-65);
	}
	
	final int[] method810(int i, float f, Interface1 interface1, Class105 class105, int i_105_) {
		anInt4120++;
		if (i <= 115) {
			return null;
		}
		if (anIntArray4112 == null || f != aFloat4109) {
			if (!aClass1_4122.method45(interface1, class105, 0)) {
				return null;
			}
			int i_106_ = i_105_ < anInt4121 ? i_105_ : anInt4121;
			anIntArray4112 = aClass1_4122.method46(true, i_106_, class105, i_106_, aBoolean4108, interface1, (byte) -110, (double) f);
			aFloat4109 = f;
			if (aBoolean4134) {
				int[] is = new int[i_106_];
				int[] is_107_ = new int[i_106_];
				int[] is_108_ = new int[i_106_];
				int[] is_109_ = new int[i_106_ * i_106_];
				int i_110_ = i_106_;
				int i_112_;
				int i_111_ = i_112_ = i_110_;
				int i_113_ = -1 + i_110_;
				int i_114_ = i_106_;
				int i_115_ = i_114_ - 1;
				int i_116_ = i_110_ * i_114_;
				for (int i_117_ = 2; i_117_ >= 0; i_117_--) {
					for (int i_118_ = i_113_; i_118_ >= 0; i_118_--) {
						int i_119_ = anIntArray4112[--i_112_];
						is[i_118_] += Class24.method919(255, i_119_ >> 16);
						is_107_[i_118_] += Class24.method919(i_119_ >> 8, 255);
						is_108_[i_118_] += Class24.method919(255, i_119_);
					}
					if (i_112_ == 0) {
						i_112_ = i_116_;
					}
				}
				int i_120_ = i_116_;
				for (int i_121_ = i_115_; i_121_ >= 0; i_121_--) {
					int i_122_ = 1;
					int i_124_;
					int i_125_;
					int i_123_ = i_124_ = i_125_ = 0;
					int i_126_ = 1;
					for (int i_127_ = 2; (i_127_ ^ 0xffffffff) <= -1; i_127_--) {
						i_126_--;
						i_124_ += is_108_[i_126_];
						i_123_ += is[i_126_];
						i_125_ += is_107_[i_126_];
						if (i_126_ == 0) {
							i_126_ = i_110_;
						}
					}
					for (int i_128_ = i_113_; (i_128_ ^ 0xffffffff) <= -1; i_128_--) {
						int i_129_ = i_123_ / 9;
						i_122_--;
						i_126_--;
						int i_130_ = i_124_ / 9;
						int i_131_ = i_125_ / 9;
						is_109_[--i_120_] = Class65.method1230(Class65.method1230(i_131_ << 8, i_129_ << 16), i_130_);
						i_123_ += is[i_126_] + -is[i_122_];
						i_125_ += -is_107_[i_122_] + is_107_[i_126_];
						i_124_ += is_108_[i_126_] - is_108_[i_122_];
						if ((i_126_ ^ 0xffffffff) == -1) {
							i_126_ = i_110_;
						}
						if (i_122_ == 0) {
							i_122_ = i_110_;
						}
					}
					for (int i_132_ = i_113_; i_132_ >= 0; i_132_--) {
						int i_133_ = anIntArray4112[--i_111_];
						int i_134_ = anIntArray4112[--i_112_];
						is[i_132_] += Class24.method919(i_134_ >> 16, 255) - Class24.method919(i_133_ >> 16, 255);
						is_107_[i_132_] += (Class24.method919(i_134_, 65363) >> 8) + -(Class24.method919(65311, i_133_) >> 8);
						is_108_[i_132_] += -Class24.method919(255, i_133_) + Class24.method919(i_134_, 255);
					}
					if ((i_112_ ^ 0xffffffff) == -1) {
						i_112_ = i_116_;
					}
					if (i_111_ == 0) {
						i_111_ = i_116_;
					}
				}
				anIntArray4112 = is_109_;
			}
		}
		return anIntArray4112;
	}
	
	static final boolean method811(int i, int i_135_, int i_136_, int i_137_) {
		if (!Class19.method199(i, i_135_, i_136_)) {
			return false;
		}
		int i_138_ = i_135_ << 7;
		int i_139_ = i_136_ << 7;
		if (Class23_Sub13_Sub23.method846(i_138_ + 1, Class17.anIntArrayArrayArray301[i][i_135_][i_136_] + i_137_, i_139_ + 1) && Class23_Sub13_Sub23.method846(i_138_ + 128 - 1, Class17.anIntArrayArrayArray301[i][i_135_ + 1][i_136_] + i_137_, i_139_ + 1) && Class23_Sub13_Sub23.method846(i_138_ + 128 - 1, Class17.anIntArrayArrayArray301[i][i_135_ + 1][i_136_ + 1] + i_137_, i_139_ + 128 - 1) && Class23_Sub13_Sub23.method846(i_138_ + 1, Class17.anIntArrayArrayArray301[i][i_135_][i_136_ + 1] + i_137_, i_139_ + 128 - 1)) {
			return true;
		}
		return false;
	}
	
	static final void method812(long l, short s, int i, RSString class16, int i_140_, RSString class16_141_, int i_142_) {
		anInt4124++;
		if (!Class53.aBoolean840) {
			if (i_140_ > Class23_Sub13_Sub9.anInt3863) {
				Class23_Sub13_Sub26.aClass16Array4307[Class23_Sub13_Sub9.anInt3863] = class16_141_;
				Class98.aClass16Array1655[Class23_Sub13_Sub9.anInt3863] = class16;
				Class38_Sub5.aShortArray2603[Class23_Sub13_Sub9.anInt3863] = s;
				Class82.aLongArray1456[Class23_Sub13_Sub9.anInt3863] = l;
				Class38_Sub2.anIntArray2502[Class23_Sub13_Sub9.anInt3863] = i;
				Class23_Sub4_Sub31.anIntArray3399[Class23_Sub13_Sub9.anInt3863] = i_142_;
				Class23_Sub13_Sub9.anInt3863++;
			}
		}
	}
	
	Class23_Sub13_Sub19(Buffer class23_sub5) {
		aClass1_4122 = new Class1(class23_sub5);
		int i = class23_sub5.method461(-1797813752);
		aBoolean4106 = (i & 0x2) != 0;
		int i_143_ = (i & 0x1f) >> 3;
		aBoolean4129 = (i & 0x1) != 0;
		int i_144_ = class23_sub5.method461(-1797813752);
		anInt4121 = 1 << 1 + (0x7 & i_144_);
		aBoolean4108 = (i_144_ & 0x80) != 0;
		aBoolean4134 = (i_144_ & 0x8) != 0;
		anInt4105 = class23_sub5.method476((byte) -103);
		anInt4119 = class23_sub5.method461(-1797813752);
		if (anInt4119 == 255) {
			anInt4119 = 256;
		}
		anInt4133 = class23_sub5.method452(-16933672);
		anInt4107 = class23_sub5.method452(-16933672);
		class23_sub5.method461(-1797813752);
		class23_sub5.method461(-1797813752);
		class23_sub5.method461(-1797813752);
	}
	
	Class23_Sub13_Sub19() {
		aClass1_4122 = new Class1();
		aBoolean4129 = true;
		anInt4121 = 64;
	}
	
	static {
		anInt4123 = 0;
		aClass16_4117 = Class38_Sub6.method1076((byte) 86, "Einloggen");
		aRandom4110 = new Random();
		anInt4136 = 0;
		aClass90Array4135 = new Class90[6];
	}
}

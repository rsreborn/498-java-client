/* Class23_Sub4_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.lang.reflect.Method;
import java.util.Random;

public class Class23_Sub4_Sub13 extends Class23_Sub4
{
	static int anInt3095;
	private int anInt3096 = 0;
	static int[] anIntArray3097;
	static int anInt3098 = 0;
	static int anInt3099;
	private int anInt3100;
	private int anInt3101 = 2048;
	static RSString aClass16_3102;
	private int anInt3103 = 1024;
	private int anInt3104;
	static int anInt3105;
	static int anInt3106;
	static int anInt3107;
	static RSString aClass16_3108 = Class38_Sub6.method1076((byte) 86, "Bitte versuchen Sie es in ");
	private int anInt3109 = 1024;
	private int anInt3110 = 1024;
	private int anInt3111;
	private int anInt3112;
	static int anInt3113;
	static int anInt3114;
	static RSString aClass16_3115;
	static Class105_Sub1 aClass105_Sub1_3116;
	private int anInt3117;
	
	static final void method315(byte b, Component component) {
		anInt3114++;
		Method method = Class9.aMethod196;
		if (method != null) {
			try {
				method.invoke(component, new Object[] { Boolean.FALSE });
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		component.addKeyListener(Class39.aClass32_609);
		if (b < 101) {
			method319(-116);
		}
		component.addFocusListener(Class39.aClass32_609);
	}
	
	final void method255(Buffer class23_sub5, int i, int i_0_) {
		int i_1_ = i;
	while_40_:
		do {
		while_39_:
			do {
			while_38_:
				do {
				while_37_:
					do {
					while_36_:
						do {
						while_35_:
							do {
							while_34_:
								do {
									do {
										if ((i_1_ ^ 0xffffffff) != -1) {
											if (i_1_ != 1) {
												if (i_1_ != 2) {
													if (i_1_ != 3) {
														if (i_1_ != 4) {
															if (i_1_ != 5) {
																if (i_1_ != 6) {
																	if (i_1_ != 7) {
																		if (i_1_ == 8) {
																			break while_39_;
																		}
																		break while_40_;
																	}
																} else {
																	break while_37_;
																}
																break while_38_;
															}
														} else {
															break while_35_;
														}
														break while_36_;
													}
												} else {
													break;
												}
												break while_34_;
											}
										} else {
											anInt3117 = class23_sub5.readUByte();
											break while_40_;
										}
										anInt3109 = class23_sub5.getUShortBE();
										break while_40_;
									} while (false);
									anInt3101 = class23_sub5.getUShortBE();
									break while_40_;
								} while (false);
								anInt3111 = class23_sub5.getUShortBE();
								break while_40_;
							} while (false);
							anInt3100 = class23_sub5.getUShortBE();
							break while_40_;
						} while (false);
						anInt3110 = class23_sub5.getUShortBE();
						break while_40_;
					} while (false);
					anInt3096 = class23_sub5.readUByte();
					break while_40_;
				} while (false);
				anInt3103 = class23_sub5.getUShortBE();
				break while_40_;
			} while (false);
			anInt3104 = class23_sub5.getUShortBE();
		} while (false);
		if (i_0_ != 1000) {
			anInt3117 = -28;
		}
		anInt3095++;
	}
	
	static final void parsePlayerMovement(int i) {
		Class23_Sub13_Sub4.inBuffer.method487(i ^ i);
		int i_2_ = Class23_Sub13_Sub4.inBuffer.method489((byte) 113, 1);
		anInt3105++;
		if (i_2_ != 0) {
			int i_3_ = Class23_Sub13_Sub4.inBuffer.method489((byte) 121, 2);
			if (i_3_ == 0) {
				Class94.anIntArray1603[Class23_Sub2.anInt2048++] = 2047;
			} else if (i_3_ == 1) {
				int i_4_ = Class23_Sub13_Sub4.inBuffer.method489((byte) 124, 3);
				Class105.aClass38_Sub7_Sub2_1812.method1084(i_4_, false, -30438);
				int i_5_ = Class23_Sub13_Sub4.inBuffer.method489((byte) 124, 1);
				if (i_5_ == 1) {
					Class94.anIntArray1603[Class23_Sub2.anInt2048++] = 2047;
				}
			} else if (i_3_ == 2) {
				int i_6_ = Class23_Sub13_Sub4.inBuffer.method489((byte) 112, 3);
				Class105.aClass38_Sub7_Sub2_1812.method1084(i_6_, true, -30438);
				int i_7_ = Class23_Sub13_Sub4.inBuffer.method489((byte) 110, 3);
				Class105.aClass38_Sub7_Sub2_1812.method1084(i_7_, true, -30438);
				int i_8_ = Class23_Sub13_Sub4.inBuffer.method489((byte) 114, 1);
				if (i_8_ == 1) {
					Class94.anIntArray1603[Class23_Sub2.anInt2048++] = 2047;
				}
			} else if (i_3_ == 3) {
				int i_9_ = Class23_Sub13_Sub4.inBuffer.method489((byte) 117, 1);
				int i_10_ = Class23_Sub13_Sub4.inBuffer.method489((byte) 123, 7);
				int i_11_ = Class23_Sub13_Sub4.inBuffer.method489((byte) 115, 1);
				if (i_11_ == 1) {
					Class94.anIntArray1603[Class23_Sub2.anInt2048++] = 2047;
				}
				ItemDefinition.anInt3916 = Class23_Sub13_Sub4.inBuffer.method489((byte) 122, 2);
				int i_12_ = Class23_Sub13_Sub4.inBuffer.method489((byte) 125, 7);
				Class105.aClass38_Sub7_Sub2_1812.method1085(i_10_, (byte) -126, i_9_ == 1, i_12_);
			}
		}
	}
	
	static final Class43[] method317(int i) {
		anInt3099++;
		Class43[] class43s = new Class43[Class23_Sub4_Sub20.anInt3229];
		for (int i_13_ = 0; (Class23_Sub4_Sub20.anInt3229 ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++)
			class43s[i_13_] = new Class43_Sub1(Class23_Sub12.anInt2301, Class23_Sub13_Sub15.anInt4033, Class23_Sub23.anIntArray2417[i_13_], Class23_Sub13_Sub2.anIntArray3679[i_13_], Class79.anIntArray1875[i_13_], Class105.anIntArray1766[i_13_], Class23_Sub13_Sub23.aByteArrayArray4243[i_13_], Class23_Sub4_Sub1.anIntArray2890);
		if (i != -16037) {
			aClass16_3102 = null;
		}
		Class23_Sub13_Sub9.method684(true);
		return class43s;
	}
	
	private final void method318(int i, int[][] is, byte b, Random random, int i_14_, int i_15_, int i_16_) {
		int i_17_ = anInt3104 > 0 ? -Class23_Sub13_Sub9.method686(b + 12483, random, anInt3104) + 4096 : 4096;
		int i_18_ = anInt3103 * anInt3112 >> 12;
		if (b != -81) {
			anInt3098 = 122;
		}
		anInt3113++;
		int i_19_ = anInt3112 - ((i_18_ ^ 0xffffffff) < -1 ? Class23_Sub13_Sub9.method686(12402, random, i_18_) : 0);
		if (i >= Class23_Sub4_Sub33.anInt3428) {
			i -= Class23_Sub4_Sub33.anInt3428;
		}
		if ((i_19_ ^ 0xffffffff) < -1) {
			if ((i_16_ ^ 0xffffffff) < -1 && i_14_ > 0) {
				int i_20_ = i_14_ / 2;
				int i_21_ = i_19_ <= i_20_ ? i_19_ : i_20_;
				int i_22_ = -(2 * i_21_) + i_14_;
				int i_23_ = i + i_21_;
				int i_24_ = i_16_ / 2;
				int i_25_ = i_24_ >= i_19_ ? i_19_ : i_24_;
				for (int i_26_ = 0; i_26_ < i_16_; i_26_++) {
					int[] is_27_ = is[i_26_ - -i_15_];
					if ((i_25_ ^ 0xffffffff) < (i_26_ ^ 0xffffffff)) {
						int i_28_ = i_26_ * i_17_ / i_25_;
						if ((anInt3096 ^ 0xffffffff) != -1) {
							for (int i_29_ = 0; (i_21_ ^ 0xffffffff) < (i_29_ ^ 0xffffffff); i_29_++) {
								int i_30_ = i_17_ * i_29_ / i_21_;
								is_27_[Class24.method919(i - -i_29_, Class95.anInt1611)] = is_27_[Class24.method919(Class95.anInt1611, -1 + (i_14_ + (i - i_29_)))] = (i_28_ ^ 0xffffffff) >= (i_30_ ^ 0xffffffff) ? i_28_ : i_30_;
							}
						} else {
							for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > (i_21_ ^ 0xffffffff); i_31_++) {
								int i_32_ = i_17_ * i_31_ / i_21_;
								is_27_[Class24.method919(Class95.anInt1611, i_31_ + i)] = is_27_[Class24.method919(i_14_ + (i + -i_31_ - 1), Class95.anInt1611)] = i_28_ * i_32_ >> 12;
							}
						}
						if ((Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) <= (i_23_ - -i_22_ ^ 0xffffffff)) {
							Class3.method53(is_27_, i_23_, i_22_, i_28_);
						} else {
							int i_33_ = -i_23_ + Class23_Sub4_Sub33.anInt3428;
							Class3.method53(is_27_, i_23_, i_33_, i_28_);
							Class3.method53(is_27_, 0, i_22_ - i_33_, i_28_);
						}
					} else {
						int i_34_ = i_16_ - i_26_ + -1;
						if ((i_34_ ^ 0xffffffff) > (i_25_ ^ 0xffffffff)) {
							int i_35_ = i_34_ * i_17_ / i_25_;
							if ((anInt3096 ^ 0xffffffff) != -1) {
								for (int i_36_ = 0; i_36_ < i_21_; i_36_++) {
									int i_37_ = i_36_ * i_17_ / i_21_;
									is_27_[Class24.method919(i + i_36_, Class95.anInt1611)] = is_27_[Class24.method919(Class95.anInt1611, i - (-i_14_ - (-i_36_ - 1)))] = (i_37_ ^ 0xffffffff) <= (i_35_ ^ 0xffffffff) ? i_35_ : i_37_;
								}
							} else {
								for (int i_38_ = 0; (i_21_ ^ 0xffffffff) < (i_38_ ^ 0xffffffff); i_38_++) {
									int i_39_ = i_38_ * i_17_ / i_21_;
									is_27_[Class24.method919(i + i_38_, Class95.anInt1611)] = is_27_[Class24.method919(Class95.anInt1611, -1 + i - -i_14_ - i_38_)] = i_35_ * i_39_ >> 12;
								}
							}
							if ((i_23_ - -i_22_ ^ 0xffffffff) >= (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff)) {
								Class3.method53(is_27_, i_23_, i_22_, i_35_);
							} else {
								int i_40_ = -i_23_ + Class23_Sub4_Sub33.anInt3428;
								Class3.method53(is_27_, i_23_, i_40_, i_35_);
								Class3.method53(is_27_, 0, i_22_ - i_40_, i_35_);
							}
						} else {
							for (int i_41_ = 0; i_21_ > i_41_; i_41_++)
								is_27_[Class24.method919(i_41_ + i, Class95.anInt1611)] = is_27_[Class24.method919(Class95.anInt1611, -1 + (-i_41_ + i) - -i_14_)] = i_17_ * i_41_ / i_21_;
							if ((Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) > (i_23_ + i_22_ ^ 0xffffffff)) {
								int i_42_ = -i_23_ + Class23_Sub4_Sub33.anInt3428;
								Class3.method53(is_27_, i_23_, i_42_, i_17_);
								Class3.method53(is_27_, 0, i_22_ + -i_42_, i_17_);
							} else {
								Class3.method53(is_27_, i_23_, i_22_, i_17_);
							}
						}
					}
				}
			}
		} else if ((i - -i_14_ ^ 0xffffffff) < (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff)) {
			int i_43_ = -i + Class23_Sub4_Sub33.anInt3428;
			for (int i_44_ = 0; i_44_ < i_16_; i_44_++) {
				int[] is_45_ = is[i_44_ + i_15_];
				Class3.method53(is_45_, i, i_43_, i_17_);
				Class3.method53(is_45_, 0, i_14_ + -i_43_, i_17_);
			}
		} else {
			for (int i_46_ = 0; i_16_ > i_46_; i_46_++)
				Class3.method53(is[i_15_ + i_46_], i, i_14_, i_17_);
		}
	}
	
	final int[] method260(int i, int i_47_) {
		anInt3106++;
		int[] is = aClass99_2115.method1500(i_47_, (byte) -126);
		if (aClass99_2115.aBoolean1681) {
			int[][] is_48_ = aClass99_2115.method1499((byte) -33);
			int i_49_ = 0;
			int i_50_ = 0;
			int i_51_ = 0;
			int i_52_ = 0;
			int i_53_ = 0;
			boolean bool = true;
			boolean bool_54_ = true;
			int i_55_ = 0;
			int i_56_ = Class23_Sub4_Sub33.anInt3428 * anInt3109 >> 12;
			int i_57_ = Class23_Sub4_Sub33.anInt3428 * anInt3101 >> 12;
			int i_58_ = 0;
			int i_59_ = anInt3111 * Class102.anInt1706 >> 12;
			int i_60_ = Class102.anInt1706 * anInt3100 >> 12;
			if (i_60_ <= 1) {
				return is_48_[i_47_];
			}
			anInt3112 = Class23_Sub4_Sub33.anInt3428 / 8 * anInt3110 >> 12;
			int i_61_ = Class23_Sub4_Sub33.anInt3428 / i_56_ + 1;
			int[][] is_62_ = new int[i_61_][3];
			Random random = new Random((long) anInt3117);
			int[][] is_63_ = new int[i_61_][3];
			for (;;) {
				int i_64_ = i_56_ - -Class23_Sub13_Sub9.method686(12402, random, i_57_ + -i_56_);
				int i_65_ = i_59_ + Class23_Sub13_Sub9.method686(i + 12402, random, -i_59_ + i_60_);
				int i_66_ = i_64_ + i_51_;
				if (Class23_Sub4_Sub33.anInt3428 < i_66_) {
					i_66_ = Class23_Sub4_Sub33.anInt3428;
					i_64_ = -i_51_ + Class23_Sub4_Sub33.anInt3428;
				}
				int i_67_;
				if (!bool) {
					int i_68_ = i_50_;
					int[] is_69_ = is_63_[i_50_];
					int i_70_ = 0;
					i_67_ = is_69_[2];
					int i_71_ = i_49_ + i_66_;
					if ((i_71_ ^ 0xffffffff) > -1) {
						i_71_ += Class23_Sub4_Sub33.anInt3428;
					}
					if ((i_71_ ^ 0xffffffff) < (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff)) {
						i_71_ -= Class23_Sub4_Sub33.anInt3428;
					}
					for (;;) {
						int[] is_72_ = is_63_[i_68_];
						if ((i_71_ ^ 0xffffffff) <= (is_72_[0] ^ 0xffffffff) && (is_72_[1] ^ 0xffffffff) <= (i_71_ ^ 0xffffffff)) {
							break;
						}
						i_70_++;
						if ((i_55_ ^ 0xffffffff) >= (++i_68_ ^ 0xffffffff)) {
							i_68_ = 0;
						}
					}
					if (i_50_ != i_68_) {
						int i_73_ = i_51_ + i_49_;
						if (i_73_ < 0) {
							i_73_ += Class23_Sub4_Sub33.anInt3428;
						}
						if ((Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) > (i_73_ ^ 0xffffffff)) {
							i_73_ -= Class23_Sub4_Sub33.anInt3428;
						}
						for (int i_74_ = 1; i_74_ <= i_70_; i_74_++) {
							int[] is_75_ = is_63_[(i_50_ + i_74_) % i_55_];
							i_67_ = Math.max(i_67_, is_75_[2]);
						}
						for (int i_76_ = 0; (i_70_ ^ 0xffffffff) <= (i_76_ ^ 0xffffffff); i_76_++) {
							int[] is_77_ = is_63_[(i_76_ + i_50_) % i_55_];
							int i_78_ = is_77_[2];
							if (i_78_ != i_67_) {
								int i_79_ = is_77_[0];
								int i_80_ = is_77_[1];
								int i_81_;
								int i_82_;
								if ((i_71_ ^ 0xffffffff) >= (i_73_ ^ 0xffffffff)) {
									if (i_79_ != 0) {
										i_81_ = Math.max(i_73_, i_79_);
										i_82_ = Class23_Sub4_Sub33.anInt3428;
									} else {
										i_81_ = 0;
										i_82_ = Math.min(i_71_, i_80_);
									}
								} else {
									i_81_ = Math.max(i_73_, i_79_);
									i_82_ = Math.min(i_71_, i_80_);
								}
								method318(i_52_ + i_81_, is_48_, (byte) -81, random, i_82_ + -i_81_, i_78_, i_67_ - i_78_);
							}
						}
					}
					i_50_ = i_68_;
				} else {
					i_67_ = 0;
				}
				if ((i_65_ + i_67_ ^ 0xffffffff) < (Class102.anInt1706 ^ 0xffffffff)) {
					i_65_ = Class102.anInt1706 - i_67_;
				} else {
					bool_54_ = false;
				}
				if ((i_66_ ^ 0xffffffff) != (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff)) {
					int[] is_83_ = is_62_[i_58_++];
					is_83_[0] = i_51_;
					is_83_[1] = i_66_;
					is_83_[2] = i_67_ - -i_65_;
					method318(i_51_ + i_53_, is_48_, (byte) -81, random, i_64_, i_67_, i_65_);
					i_51_ = i_66_;
				} else {
					method318(i_53_ + i_51_, is_48_, (byte) -81, random, i_64_, i_67_, i_65_);
					if (bool_54_) {
						break;
					}
					bool = false;
					bool_54_ = true;
					i_52_ = i_53_;
					i_50_ = 0;
					int[][] is_84_ = is_63_;
					is_63_ = is_62_;
					int[] is_85_ = is_62_[i_58_++];
					i_55_ = i_58_;
					is_85_[0] = i_51_;
					i_51_ = 0;
					is_62_ = is_84_;
					is_85_[2] = i_67_ - -i_65_;
					is_85_[1] = i_66_;
					i_58_ = 0;
					i_53_ = Class23_Sub13_Sub9.method686(i + 12402, random, Class23_Sub4_Sub33.anInt3428);
					i_49_ = i_53_ - i_52_;
					int i_86_ = i_49_;
					if (i_86_ < 0) {
						i_86_ += Class23_Sub4_Sub33.anInt3428;
					}
					if (Class23_Sub4_Sub33.anInt3428 < i_86_) {
						i_86_ -= Class23_Sub4_Sub33.anInt3428;
					}
					for (;;) {
						int[] is_87_ = is_63_[i_50_];
						if (is_87_[0] <= i_86_ && (i_86_ ^ 0xffffffff) >= (is_87_[1] ^ 0xffffffff)) {
							break;
						}
						if (++i_50_ >= i_55_) {
							i_50_ = 0;
						}
					}
				}
			}
		}
		if (i != 0) {
			anInt3100 = -42;
		}
		return is;
	}
	
	public static void method319(int i) {
		anIntArray3097 = null;
		aClass16_3102 = null;
		if (i != 0) {
			aClass16_3108 = null;
		}
		aClass16_3115 = null;
		aClass16_3108 = null;
		aClass105_Sub1_3116 = null;
	}
	
	final void method265(int i) {
		if (i != -21746) {
			anInt3117 = -62;
		}
		anInt3107++;
	}
	
	public Class23_Sub4_Sub13() {
		super(0, true);
		anInt3104 = 1024;
		anInt3100 = 819;
		anInt3111 = 409;
		anInt3117 = 0;
	}
	
	static {
		anIntArray3097 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
		aClass16_3102 = Class38_Sub6.method1076((byte) 86, "Unerwartete Antwort vom Anmelde)2Server)3");
		aClass16_3115 = Class38_Sub6.method1076((byte) 86, "3D)2Softwarebibliothek gestartet)3");
	}
}

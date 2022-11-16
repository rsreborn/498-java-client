/* Class23_Sub4_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub36 extends Class23_Sub4
{
	static Class50[] aClass50Array3463 = new Class50[50];
	static int anInt3464;
	static int anInt3465;
	static int anInt3466;
	private int anInt3467 = 6;
	static int anInt3468;
	static Class81 aClass81_3469;
	static int anInt3470 = 0;
	static int anInt3471;
	static int anInt3472;
	
	public static void method412(int i) {
		if (i != -22323) {
			method412(-112);
		}
		aClass50Array3463 = null;
		aClass81_3469 = null;
	}
	
	final void method255(Buffer class23_sub5, int i, int i_0_) {
		int i_1_ = i;
		do {
			if ((i_1_ ^ 0xffffffff) != -1) {
				if (i_1_ != 1) {
					break;
				}
			} else {
				anInt3467 = class23_sub5.method461(-1797813752);
				break;
			}
			aBoolean2117 = class23_sub5.method461(-1797813752) == 1;
		} while (false);
		if (i_0_ == 1000) {
			anInt3468++;
		}
	}
	
	static final int method413(int i, byte b, int i_2_, int i_3_) {
		i &= 0x3;
		anInt3464++;
		if (i == 0) {
			return i_2_;
		}
		if (i == 1) {
			return 7 + -i_3_;
		}
		if (i == 2) {
			return -i_2_ + 7;
		}
		if (b < 63) {
			method414();
		}
		return i_3_;
	}
	
	final int[] method260(int i, int i_4_) {
		if (i != 0) {
			aClass50Array3463 = null;
		}
		int[] is = aClass99_2115.method1500(i_4_, (byte) -108);
		anInt3471++;
	while_142_:
		do {
			if (aClass99_2115.aBoolean1681) {
				int[] is_5_ = this.method261(i_4_, 0, (byte) 18);
				int[] is_6_ = this.method261(i_4_, 1, (byte) 18);
				int i_7_ = anInt3467;
			while_141_:
				do {
				while_140_:
					do {
					while_139_:
						do {
						while_138_:
							do {
							while_137_:
								do {
								while_136_:
									do {
									while_135_:
										do {
										while_134_:
											do {
											while_133_:
												do {
													do {
														if (i_7_ != 1) {
															if (i_7_ != 2) {
																if (i_7_ != 3) {
																	if (i_7_ != 4) {
																		if (i_7_ != 5) {
																			if (i_7_ != 6) {
																				if (i_7_ != 7) {
																					if (i_7_ != 8) {
																						if (i_7_ != 9) {
																							if (i_7_ != 10) {
																								if (i_7_ != 11) {
																									if (i_7_ != 12) {
																										break while_142_;
																									}
																								} else {
																									break while_140_;
																								}
																								break while_141_;
																							}
																						} else {
																							break while_138_;
																						}
																						break while_139_;
																					}
																				} else {
																					break while_136_;
																				}
																				break while_137_;
																			}
																		} else {
																			break while_134_;
																		}
																		break while_135_;
																	}
																} else {
																	break;
																}
																break while_133_;
															}
														} else {
															for (i_7_ = 0; i_7_ < Class23_Sub4_Sub33.anInt3428; i_7_++)
																is[i_7_] = is_6_[i_7_] + is_5_[i_7_];
															break while_142_;
														}
														for (i_7_ = 0; (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++)
															is[i_7_] = -is_6_[i_7_] + is_5_[i_7_];
														break while_142_;
													} while (false);
													for (i_7_ = 0; (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++)
														is[i_7_] = is_5_[i_7_] * is_6_[i_7_] >> 12;
													break while_142_;
												} while (false);
												for (i_7_ = 0; (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
													int i_8_ = is_6_[i_7_];
													is[i_7_] = i_8_ != 0 ? (is_5_[i_7_] << 12) / i_8_ : 4096;
												}
												break while_142_;
											} while (false);
											for (i_7_ = 0; (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++)
												is[i_7_] = 4096 - ((-is_5_[i_7_] + 4096) * (4096 + -is_6_[i_7_]) >> 12);
											break while_142_;
										} while (false);
										for (i_7_ = 0; (i_7_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_7_++) {
											int i_9_ = is_6_[i_7_];
											is[i_7_] = i_9_ < 2048 ? is_5_[i_7_] * i_9_ >> 11 : -((-is_5_[i_7_] + 4096) * (-i_9_ + 4096) >> 11) + 4096;
										}
										break while_142_;
									} while (false);
									for (i_7_ = 0; i_7_ < Class23_Sub4_Sub33.anInt3428; i_7_++) {
										int i_10_ = is_5_[i_7_];
										is[i_7_] = i_10_ != 4096 ? (is_6_[i_7_] << 12) / (-i_10_ + 4096) : 4096;
									}
									break while_142_;
								} while (false);
								for (i_7_ = 0; Class23_Sub4_Sub33.anInt3428 > i_7_; i_7_++) {
									int i_11_ = is_5_[i_7_];
									is[i_7_] = (i_11_ ^ 0xffffffff) == -1 ? 0 : -((4096 + -is_6_[i_7_] << 12) / i_11_) + 4096;
								}
								break while_142_;
							} while (false);
							for (i_7_ = 0; Class23_Sub4_Sub33.anInt3428 > i_7_; i_7_++) {
								int i_12_ = is_6_[i_7_];
								int i_13_ = is_5_[i_7_];
								is[i_7_] = i_12_ > i_13_ ? i_13_ : i_12_;
							}
							break while_142_;
						} while (false);
						for (i_7_ = 0; i_7_ < Class23_Sub4_Sub33.anInt3428; i_7_++) {
							int i_14_ = is_5_[i_7_];
							int i_15_ = is_6_[i_7_];
							is[i_7_] = (i_14_ ^ 0xffffffff) >= (i_15_ ^ 0xffffffff) ? i_15_ : i_14_;
						}
						break while_142_;
					} while (false);
					for (i_7_ = 0; (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
						int i_16_ = is_6_[i_7_];
						int i_17_ = is_5_[i_7_];
						is[i_7_] = (i_16_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff) ? i_17_ - i_16_ : -i_17_ + i_16_;
					}
					break while_142_;
				} while (false);
				for (i_7_ = 0; Class23_Sub4_Sub33.anInt3428 > i_7_; i_7_++) {
					int i_18_ = is_5_[i_7_];
					int i_19_ = is_6_[i_7_];
					is[i_7_] = i_19_ + i_18_ + -(i_19_ * i_18_ >> 11);
				}
			}
		} while (false);
		return is;
	}
	
	final int[][] method258(int i, byte b) {
		int[][] is = aClass103_2108.method1518(b + -29668, i);
		anInt3465++;
		if (b != 9) {
			method258(-20, (byte) -109);
		}
	while_152_:
		do {
			if (aClass103_2108.aBoolean1733) {
				int[][] is_20_ = this.method256(0, (byte) -73, i);
				int[][] is_21_ = this.method256(1, (byte) -75, i);
				int[] is_22_ = is[0];
				int[] is_23_ = is[2];
				int[] is_24_ = is_20_[0];
				int[] is_25_ = is_21_[0];
				int[] is_26_ = is_21_[1];
				int[] is_27_ = is[1];
				int[] is_28_ = is_20_[2];
				int[] is_29_ = is_21_[2];
				int[] is_30_ = is_20_[1];
				int i_31_ = anInt3467;
			while_151_:
				do {
				while_150_:
					do {
					while_149_:
						do {
						while_148_:
							do {
							while_147_:
								do {
								while_146_:
									do {
									while_145_:
										do {
										while_144_:
											do {
											while_143_:
												do {
													do {
														if (i_31_ != 1) {
															if (i_31_ != 2) {
																if (i_31_ != 3) {
																	if (i_31_ != 4) {
																		if (i_31_ != 5) {
																			if (i_31_ != 6) {
																				if (i_31_ != 7) {
																					if (i_31_ != 8) {
																						if (i_31_ != 9) {
																							if (i_31_ != 10) {
																								if (i_31_ != 11) {
																									if (i_31_ != 12) {
																										break while_152_;
																									}
																								} else {
																									break while_150_;
																								}
																								break while_151_;
																							}
																						} else {
																							break while_148_;
																						}
																						break while_149_;
																					}
																				} else {
																					break while_146_;
																				}
																				break while_147_;
																			}
																		} else {
																			break while_144_;
																		}
																		break while_145_;
																	}
																} else {
																	break;
																}
																break while_143_;
															}
														} else {
															for (i_31_ = 0; (i_31_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_31_++) {
																is_22_[i_31_] = is_24_[i_31_] - -is_25_[i_31_];
																is_27_[i_31_] = is_26_[i_31_] + is_30_[i_31_];
																is_23_[i_31_] = is_28_[i_31_] - -is_29_[i_31_];
															}
															break while_152_;
														}
														for (i_31_ = 0; (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) < (i_31_ ^ 0xffffffff); i_31_++) {
															is_22_[i_31_] = -is_25_[i_31_] + is_24_[i_31_];
															is_27_[i_31_] = is_30_[i_31_] - is_26_[i_31_];
															is_23_[i_31_] = -is_29_[i_31_] + is_28_[i_31_];
														}
														break while_152_;
													} while (false);
													for (i_31_ = 0; (i_31_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_31_++) {
														is_22_[i_31_] = is_24_[i_31_] * is_25_[i_31_] >> 12;
														is_27_[i_31_] = is_26_[i_31_] * is_30_[i_31_] >> 12;
														is_23_[i_31_] = is_28_[i_31_] * is_29_[i_31_] >> 12;
													}
													break while_152_;
												} while (false);
												for (i_31_ = 0; (i_31_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_31_++) {
													int i_32_ = is_29_[i_31_];
													int i_33_ = is_26_[i_31_];
													int i_34_ = is_25_[i_31_];
													is_22_[i_31_] = i_34_ == 0 ? 4096 : (is_24_[i_31_] << 12) / i_34_;
													is_27_[i_31_] = i_33_ == 0 ? 4096 : (is_30_[i_31_] << 12) / i_33_;
													is_23_[i_31_] = i_32_ == 0 ? 4096 : (is_28_[i_31_] << 12) / i_32_;
												}
												break while_152_;
											} while (false);
											for (i_31_ = 0; (i_31_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_31_++) {
												is_22_[i_31_] = -((-is_25_[i_31_] + 4096) * (-is_24_[i_31_] + 4096) >> 12) + 4096;
												is_27_[i_31_] = -((-is_26_[i_31_] + 4096) * (4096 + -is_30_[i_31_]) >> 12) + 4096;
												is_23_[i_31_] = -((-is_28_[i_31_] + 4096) * (4096 - is_29_[i_31_]) >> 12) + 4096;
											}
											break while_152_;
										} while (false);
										for (i_31_ = 0; (i_31_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_31_++) {
											int i_35_ = is_25_[i_31_];
											int i_36_ = is_29_[i_31_];
											int i_37_ = is_26_[i_31_];
											is_22_[i_31_] = i_35_ < 2048 ? is_24_[i_31_] * i_35_ >> 11 : -((4096 - is_24_[i_31_]) * (-i_35_ + 4096) >> 11) + 4096;
											is_27_[i_31_] = i_37_ >= 2048 ? 4096 + -((-is_30_[i_31_] + 4096) * (4096 - i_37_) >> 11) : is_30_[i_31_] * i_37_ >> 11;
											is_23_[i_31_] = i_36_ < 2048 ? i_36_ * is_28_[i_31_] >> 11 : 4096 - ((-is_28_[i_31_] + 4096) * (-i_36_ + 4096) >> 11);
										}
										break while_152_;
									} while (false);
									for (i_31_ = 0; i_31_ < Class23_Sub4_Sub33.anInt3428; i_31_++) {
										int i_38_ = is_28_[i_31_];
										int i_39_ = is_24_[i_31_];
										int i_40_ = is_30_[i_31_];
										is_22_[i_31_] = i_39_ != 4096 ? (is_25_[i_31_] << 12) / (4096 + -i_39_) : 4096;
										is_27_[i_31_] = i_40_ == 4096 ? 4096 : (is_26_[i_31_] << 12) / (-i_40_ + 4096);
										is_23_[i_31_] = i_38_ != 4096 ? (is_29_[i_31_] << 12) / (4096 - i_38_) : 4096;
									}
									break while_152_;
								} while (false);
								for (i_31_ = 0; i_31_ < Class23_Sub4_Sub33.anInt3428; i_31_++) {
									int i_41_ = is_24_[i_31_];
									int i_42_ = is_28_[i_31_];
									int i_43_ = is_30_[i_31_];
									is_22_[i_31_] = (i_41_ ^ 0xffffffff) == -1 ? 0 : 4096 + -((4096 - is_25_[i_31_] << 12) / i_41_);
									is_27_[i_31_] = i_43_ != 0 ? 4096 - (-is_26_[i_31_] + 4096 << 12) / i_43_ : 0;
									is_23_[i_31_] = (i_42_ ^ 0xffffffff) != -1 ? -((4096 + -is_29_[i_31_] << 12) / i_42_) + 4096 : 0;
								}
								break while_152_;
							} while (false);
							for (i_31_ = 0; Class23_Sub4_Sub33.anInt3428 > i_31_; i_31_++) {
								int i_44_ = is_28_[i_31_];
								int i_45_ = is_26_[i_31_];
								int i_46_ = is_30_[i_31_];
								int i_47_ = is_29_[i_31_];
								int i_48_ = is_24_[i_31_];
								int i_49_ = is_25_[i_31_];
								is_22_[i_31_] = (i_48_ ^ 0xffffffff) > (i_49_ ^ 0xffffffff) ? i_48_ : i_49_;
								is_27_[i_31_] = (i_46_ ^ 0xffffffff) > (i_45_ ^ 0xffffffff) ? i_46_ : i_45_;
								is_23_[i_31_] = (i_47_ ^ 0xffffffff) >= (i_44_ ^ 0xffffffff) ? i_47_ : i_44_;
							}
							break while_152_;
						} while (false);
						for (i_31_ = 0; (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff) < (i_31_ ^ 0xffffffff); i_31_++) {
							int i_50_ = is_30_[i_31_];
							int i_51_ = is_25_[i_31_];
							int i_52_ = is_28_[i_31_];
							int i_53_ = is_26_[i_31_];
							int i_54_ = is_29_[i_31_];
							int i_55_ = is_24_[i_31_];
							is_22_[i_31_] = (i_51_ ^ 0xffffffff) > (i_55_ ^ 0xffffffff) ? i_55_ : i_51_;
							is_27_[i_31_] = (i_53_ ^ 0xffffffff) <= (i_50_ ^ 0xffffffff) ? i_53_ : i_50_;
							is_23_[i_31_] = i_54_ >= i_52_ ? i_54_ : i_52_;
						}
						break while_152_;
					} while (false);
					for (i_31_ = 0; i_31_ < Class23_Sub4_Sub33.anInt3428; i_31_++) {
						int i_56_ = is_28_[i_31_];
						int i_57_ = is_30_[i_31_];
						int i_58_ = is_26_[i_31_];
						int i_59_ = is_29_[i_31_];
						int i_60_ = is_24_[i_31_];
						int i_61_ = is_25_[i_31_];
						is_22_[i_31_] = (i_60_ ^ 0xffffffff) >= (i_61_ ^ 0xffffffff) ? -i_60_ + i_61_ : i_60_ - i_61_;
						is_27_[i_31_] = (i_57_ ^ 0xffffffff) >= (i_58_ ^ 0xffffffff) ? i_58_ - i_57_ : -i_58_ + i_57_;
						is_23_[i_31_] = i_59_ < i_56_ ? i_56_ - i_59_ : -i_56_ + i_59_;
					}
					break while_152_;
				} while (false);
				for (i_31_ = 0; (i_31_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_31_++) {
					int i_62_ = is_24_[i_31_];
					int i_63_ = is_26_[i_31_];
					int i_64_ = is_28_[i_31_];
					int i_65_ = is_30_[i_31_];
					int i_66_ = is_25_[i_31_];
					int i_67_ = is_29_[i_31_];
					is_22_[i_31_] = -(i_66_ * i_62_ >> 11) + i_62_ - -i_66_;
					is_27_[i_31_] = -(i_63_ * i_65_ >> 11) + i_65_ + i_63_;
					is_23_[i_31_] = i_67_ + (i_64_ - (i_67_ * i_64_ >> 11));
				}
			}
		} while (false);
		return is;
	}
	
	public Class23_Sub4_Sub36() {
		super(2, false);
	}
	
	static final void method414() {
		for (int i = 0; i < Class23_Sub4.anInt2103; i++) {
			Class39 class39 = Class23_Sub4_Sub38.aClass39Array3502[i];
			Class23_Sub13_Sub23.method844(class39);
			Class23_Sub4_Sub38.aClass39Array3502[i] = null;
		}
		Class23_Sub4.anInt2103 = 0;
	}
	
	static final void method415(int i) {
		anInt3472++;
		if (i == 1 && Class23_Sub13_Sub7.aBoolean3792) {
			Class64 class64 = Class23_Sub13_Sub8_Sub1.method679(Class7.anInt169, Class23_Sub13_Sub14.anInt4013, (byte) -100);
			if (class64 != null && class64.anObjectArray1012 != null) {
				Class23_Sub9 class23_sub9 = new Class23_Sub9();
				class23_sub9.anObjectArray2274 = class64.anObjectArray1012;
				class23_sub9.aClass64_2263 = class64;
				Class91.method1452(class23_sub9, (byte) -105);
			}
			Class23_Sub13_Sub7.aBoolean3792 = false;
			Class91.method1450((byte) 29, class64);
		}
	}
	
	static {
		anInt3466 = 0;
		aClass81_3469 = new Class81(5);
	}
}

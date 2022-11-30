/* Class23_Sub13_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub13_Sub7 extends Class23_Sub13
{
	static RSString aClass16_3739 = Class38_Sub6.method1076((byte) 86, "sch-Utteln:");
	private int anInt3740;
	protected boolean aBoolean3741;
	private short[] aShortArray3742;
	protected int anInt3743;
	protected int anInt3744;
	static int anInt3745;
	protected int[] anIntArray3746;
	private int anInt3747 = -1;
	private int anInt3748;
	static int anInt3749;
	static byte[][][] aByteArrayArrayArray3750;
	protected int anInt3751;
	protected int anInt3752;
	static int anInt3753;
	protected int anInt3754;
	protected int anInt3755;
	private int anInt3756;
	static int anInt3757;
	protected boolean aBoolean3758;
	protected boolean aBoolean3759;
	private short[] aShortArray3760;
	private int anInt3761;
	static RSString aClass16_3762;
	protected boolean aBoolean3763;
	private byte[] aByteArray3764;
	static int anInt3765;
	private byte aByte3766;
	private int[] anIntArray3767;
	protected boolean aBoolean3768;
	static int anInt3769;
	static int anInt3770;
	protected boolean aBoolean3771;
	private short[] aShortArray3772;
	static int anInt3773;
	protected boolean aBoolean3774;
	static int anInt3775;
	protected int anInt3776;
	static int anInt3777;
	private int anInt3778;
	protected int anInt3779;
	static int anInt3780;
	static int anInt3781;
	protected int anInt3782;
	protected int anInt3783;
	static int anInt3784 = 0;
	protected boolean aBoolean3785;
	private int anInt3786;
	private int anInt3787;
	protected int anInt3788;
	private short aShort3789;
	protected int anInt3790;
	protected int anInt3791;
	static boolean aBoolean3792 = false;
	protected int anInt3793;
	static int anInt3794;
	private int anInt3795;
	private boolean aBoolean3796;
	protected RSString aClass16_3797;
	static int anInt3798;
	private int[] anIntArray3799;
	protected RSString[] aClass16Array3800;
	protected int[] anIntArray3801;
	private short[] aShortArray3802;
	private int anInt3803;
	private boolean aBoolean3804;
	private static RSString aClass16_3805;
	protected int anInt3806;
	
	private final void method634(Buffer class23_sub5, int i, boolean bool) {
		if (i == 1) {
			int i_0_ = class23_sub5.readByte();
			if ((i_0_ ^ 0xffffffff) < -1) {
				if (anIntArray3799 == null || Class23_Sub4_Sub37.aBoolean3498) {
					anIntArray3767 = new int[i_0_];
					anIntArray3799 = new int[i_0_];
					for (int i_1_ = 0; (i_0_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
						anIntArray3799[i_1_] = class23_sub5.readShortBE();
						anIntArray3767[i_1_] = class23_sub5.readByte();
					}
				} else {
					class23_sub5.position += i_0_ * 3;
				}
			}
		} else if (i == 2) {
			aClass16_3797 = class23_sub5.method426(2);
		} else if (i != 5) {
			if (i != 14) {
				if (i != 15) {
					if (i != 17) {
						if (i != 18) {
							if (i != 19) {
								if (i != 21) {
									if (i == 22) {
										aBoolean3804 = true;
									} else if (i != 23) {
										if (i != 24) {
											if (i != 27) {
												if (i != 28) {
													if (i == 29) {
														anInt3803 = class23_sub5.method452(-16933672);
													} else if (i == 39) {
														anInt3778 = 5 * class23_sub5.method452(-16933672);
													} else if (i >= 30 && i < 35) {
														aClass16Array3800[-30 + i] = class23_sub5.method426(2);
														if (aClass16Array3800[i + -30].method140(Class11.aClass16_220, 40)) {
															aClass16Array3800[i + -30] = null;
														}
													} else if (i == 40) {
														int i_2_ = class23_sub5.readByte();
														aShortArray3760 = new short[i_2_];
														aShortArray3772 = new short[i_2_];
														for (int i_3_ = 0; (i_2_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
															aShortArray3772[i_3_] = (short) class23_sub5.readShortBE();
															aShortArray3760[i_3_] = (short) class23_sub5.readShortBE();
														}
													} else if (i == 41) {
														int i_4_ = class23_sub5.readByte();
														aShortArray3802 = new short[i_4_];
														aShortArray3742 = new short[i_4_];
														for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_5_++) {
															aShortArray3742[i_5_] = (short) class23_sub5.readShortBE();
															aShortArray3802[i_5_] = (short) class23_sub5.readShortBE();
														}
													} else if (i == 42) {
														int i_6_ = class23_sub5.readByte();
														aByteArray3764 = new byte[i_6_];
														for (int i_7_ = 0; (i_6_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++)
															aByteArray3764[i_7_] = class23_sub5.method452(-16933672);
													} else if (i != 60) {
														if (i != 62) {
															if (i == 64) {
																aBoolean3774 = false;
															} else if (i == 65) {
																anInt3761 = class23_sub5.readShortBE();
															} else if (i == 66) {
																anInt3787 = class23_sub5.readShortBE();
															} else if (i == 67) {
																anInt3740 = class23_sub5.readShortBE();
															} else if (i == 68) {
																anInt3744 = class23_sub5.readShortBE();
															} else if (i != 69) {
																if (i != 70) {
																	if (i != 71) {
																		if (i == 72) {
																			anInt3748 = class23_sub5.method474(true);
																		} else if (i == 73) {
																			aBoolean3785 = true;
																		} else if (i == 74) {
																			aBoolean3758 = true;
																		} else if (i == 75) {
																			anInt3783 = class23_sub5.readByte();
																		} else if (i != 77 && i != 92) {
																			if (i == 78) {
																				anInt3743 = class23_sub5.readShortBE();
																				anInt3788 = class23_sub5.readByte();
																			} else if (i != 79) {
																				if (i != 81) {
																					if (i != 82 && i != 88) {
																						if (i == 89) {
																							aBoolean3768 = false;
																						} else if (i == 90) {
																							aBoolean3741 = true;
																						} else if (i != 91) {
																							if (i != 93) {
																								if (i == 94) {
																									aByte3766 = (byte) 4;
																								} else if (i == 95) {
																									aByte3766 = (byte) 5;
																								}
																							} else {
																								aByte3766 = (byte) 3;
																								aShort3789 = (short) class23_sub5.readShortBE();
																							}
																						} else {
																							aBoolean3759 = true;
																						}
																					}
																				} else {
																					aByte3766 = (byte) 2;
																					aShort3789 = (short) (class23_sub5.readByte() * 256);
																				}
																			} else {
																				anInt3755 = class23_sub5.readShortBE();
																				anInt3782 = class23_sub5.readShortBE();
																				anInt3788 = class23_sub5.readByte();
																				int i_8_ = class23_sub5.readByte();
																				anIntArray3801 = new int[i_8_];
																				for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff); i_9_++)
																					anIntArray3801[i_9_] = class23_sub5.readShortBE();
																			}
																		} else {
																			anInt3747 = class23_sub5.readShortBE();
																			if ((anInt3747 ^ 0xffffffff) == -65536) {
																				anInt3747 = -1;
																			}
																			anInt3786 = class23_sub5.readShortBE();
																			int i_10_ = -1;
																			if ((anInt3786 ^ 0xffffffff) == -65536) {
																				anInt3786 = -1;
																			}
																			if (i == 92) {
																				i_10_ = class23_sub5.readShortBE();
																				if (i_10_ == 65535) {
																					i_10_ = -1;
																				}
																			}
																			int i_11_ = class23_sub5.readByte();
																			anIntArray3746 = new int[i_11_ + 2];
																			for (int i_12_ = 0; (i_12_ ^ 0xffffffff) >= (i_11_ ^ 0xffffffff); i_12_++) {
																				anIntArray3746[i_12_] = class23_sub5.readShortBE();
																				if (anIntArray3746[i_12_] == 65535) {
																					anIntArray3746[i_12_] = -1;
																				}
																			}
																			anIntArray3746[i_11_ - -1] = i_10_;
																		}
																	} else {
																		anInt3795 = class23_sub5.method474(bool);
																	}
																} else {
																	anInt3756 = class23_sub5.method474(true);
																}
															} else {
																anInt3790 = class23_sub5.readByte();
															}
														} else {
															aBoolean3796 = true;
														}
													} else {
														anInt3751 = class23_sub5.readShortBE();
													}
												} else {
													anInt3779 = class23_sub5.readByte();
												}
											} else {
												anInt3806 = 1;
											}
										} else {
											anInt3776 = class23_sub5.readShortBE();
											if ((anInt3776 ^ 0xffffffff) == -65536) {
												anInt3776 = -1;
											}
										}
									} else {
										aBoolean3771 = true;
									}
								} else {
									aByte3766 = (byte) 1;
								}
							} else {
								anInt3793 = class23_sub5.readByte();
							}
						} else {
							aBoolean3763 = false;
						}
					} else {
						aBoolean3763 = false;
						anInt3806 = 0;
					}
				} else {
					anInt3754 = class23_sub5.readByte();
				}
			} else {
				anInt3752 = class23_sub5.readByte();
			}
		} else {
			int i_13_ = class23_sub5.readByte();
			if ((i_13_ ^ 0xffffffff) < -1) {
				if (anIntArray3799 != null && !Class23_Sub4_Sub37.aBoolean3498) {
					class23_sub5.position += 2 * i_13_;
				} else {
					anIntArray3799 = new int[i_13_];
					anIntArray3767 = null;
					for (int i_14_ = 0; i_13_ > i_14_; i_14_++)
						anIntArray3799[i_14_] = class23_sub5.readShortBE();
				}
			}
		}
		if (bool == true) {
			anInt3749++;
		}
	}
	
	static final void method635(boolean bool, int i, int[] is, int[] is_15_, int i_16_) {
		anInt3769++;
		int i_17_ = i;
		i--;
		if (i_17_ > 25) {
			i_17_ = 25;
		}
		int i_18_ = is[i];
		int i_19_ = is_15_[i];
		if (i_16_ == 0) {
			Class23_Sub1.anInt2035++;
			Class23_Sub7.outBuffer.method486(149, 2976);
			Class23_Sub7.outBuffer.method460((byte) 106, 3 + i_17_ - -i_17_);
		}
		if (i_16_ == 1) {
			Class74.anInt1331++;
			Class23_Sub7.outBuffer.method486(74, 2976);
			Class23_Sub7.outBuffer.method460((byte) 108, i_17_ + (i_17_ + 3 - -14));
		}
		if (i_16_ == 2) {
			Class29.anInt435++;
			Class23_Sub7.outBuffer.method486(177, 2976);
			Class23_Sub7.outBuffer.method460((byte) 120, 3 + i_17_ + i_17_);
		}
		Class23_Sub7.outBuffer.method427(Class58.anInt903 + i_18_, -1371695448);
		Class23_Sub7.outBuffer.method430(i_19_ + Class42.anInt662, 14982);
		Class23_Sub7.outBuffer.method428(Class23_Sub13_Sub8_Sub1.aBooleanArray4492[82] ? 1 : 0, -572365016);
		Class23_Sub13_Sub17.anInt4077 = is_15_[0];
		Class23_Sub13_Sub18.anInt4078 = is[0];
		if (bool != true) {
			aClass16_3762 = null;
		}
		for (int i_20_ = 1; i_20_ < i_17_; i_20_++) {
			i--;
			Class23_Sub7.outBuffer.method482((byte) 114, -i_19_ + is_15_[i]);
			Class23_Sub7.outBuffer.method482((byte) 62, -i_18_ + is[i]);
		}
	}
	
	final Class23_Sub13_Sub5 method636(boolean bool, int i, boolean bool_21_, int[][] is, int[][] is_22_, int i_23_, int i_24_, int i_25_, int i_26_) {
		anInt3773++;
		long l;
		if (anIntArray3767 == null) {
			l = (long) ((anInt3791 << 10) + i_25_);
		} else {
			l = (long) ((i << 3) + (anInt3791 << 10) - -i_25_);
		}
		boolean bool_27_;
		if (!bool_21_ || !aBoolean3804) {
			bool_27_ = false;
		} else {
			bool_27_ = true;
			l |= ~0x7fffffffffffffffL;
		}
		if (bool != false) {
			anInt3791 = 38;
		}
		Class38 class38 = Class90.aClass81_1545.method1366(l, (byte) 127);
		if (class38 == null) {
			Class38_Sub4 class38_sub4 = method639(0, i_25_, i);
			if (class38_sub4 == null) {
				RSString.aClass23_Sub13_Sub5_1901.aClass38_3723 = null;
				return RSString.aClass23_Sub13_Sub5_1901;
			}
			class38_sub4.method1063();
			if (!bool_27_) {
				class38 = new Class38_Sub1_Sub1(class38_sub4, 64 - -anInt3803, 5 * anInt3778 + 768, -50, -10, -50);
			} else {
				class38_sub4.aShort2524 = (short) (5 * anInt3778 + 768);
				class38 = class38_sub4;
				class38_sub4.aShort2555 = (short) (anInt3803 + 64);
				class38_sub4.method1066();
			}
			Class90.aClass81_1545.method1365(0, l, class38);
		}
		if (bool_27_) {
			class38 = ((Class38_Sub4) class38).method1051();
		}
		if (aByte3766 != 0) {
			if (!(class38 instanceof Class38_Sub1_Sub1)) {
				if (class38 instanceof Class38_Sub4) {
					class38 = ((Class38_Sub4) class38).method1040(aByte3766, aShort3789, is_22_, is, i_24_, i_26_, i_23_, true, false);
				}
			} else {
				class38 = ((Class38_Sub1_Sub1) class38).method1032(aByte3766, aShort3789, is_22_, is, i_24_, i_26_, i_23_, true);
			}
		}
		RSString.aClass23_Sub13_Sub5_1901.aClass38_3723 = class38;
		return RSString.aClass23_Sub13_Sub5_1901;
	}
	
	public static void method637(int i) {
		aClass16_3762 = null;
		aByteArrayArrayArray3750 = null;
		if (i > -81) {
			method635(false, 43, null, null, -14);
		}
		aClass16_3805 = null;
		aClass16_3739 = null;
	}
	
	static final boolean method638(int i, int i_28_) {
		if (i_28_ != 159) {
			aClass16_3739 = null;
		}
		anInt3757++;
		if (i < 32) {
			return false;
		}
		if (i == 127) {
			return false;
		}
		if (i >= 129 && i <= 159) {
			return false;
		}
		return true;
	}
	
	private final Class38_Sub4 method639(int i, int i_29_, int i_30_) {
		boolean bool = aBoolean3796;
		Class38_Sub4 class38_sub4 = null;
		anInt3777++;
		if (i_30_ == 2 && i_29_ > 3) {
			bool = !bool;
		}
		if (anIntArray3767 == null) {
			if (i_30_ != 10) {
				return null;
			}
			if (anIntArray3799 == null) {
				return null;
			}
			int i_31_ = anIntArray3799.length;
			for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
				int i_33_ = anIntArray3799[i_32_];
				if (bool) {
					i_33_ += 65536;
				}
				class38_sub4 = (Class38_Sub4) Class23_Sub4_Sub10.aClass81_3056.method1366((long) i_33_, (byte) 120);
				if (class38_sub4 == null) {
					class38_sub4 = Class38_Sub4.method1060(Class23_Sub4_Sub3.aClass105_2943, 0xffff & i_33_, 0);
					if (class38_sub4 == null) {
						return null;
					}
					if (bool) {
						class38_sub4.method1057();
					}
					Class23_Sub4_Sub10.aClass81_3056.method1365(0, (long) i_33_, class38_sub4);
				}
				if (i_31_ > 1) {
					Applet_Sub1.aClass38_Sub4Array28[i_32_] = class38_sub4;
				}
			}
			if (i_31_ > 1) {
				class38_sub4 = new Class38_Sub4(Applet_Sub1.aClass38_Sub4Array28, i_31_);
			}
		} else {
			int i_34_ = -1;
			for (int i_35_ = 0; (anIntArray3767.length ^ 0xffffffff) < (i_35_ ^ 0xffffffff); i_35_++) {
				if ((anIntArray3767[i_35_] ^ 0xffffffff) == (i_30_ ^ 0xffffffff)) {
					i_34_ = i_35_;
					break;
				}
			}
			if ((i_34_ ^ 0xffffffff) == 0) {
				return null;
			}
			int i_36_ = anIntArray3799[i_34_];
			if (bool) {
				i_36_ += 65536;
			}
			class38_sub4 = (Class38_Sub4) Class23_Sub4_Sub10.aClass81_3056.method1366((long) i_36_, (byte) 118);
			if (class38_sub4 == null) {
				class38_sub4 = Class38_Sub4.method1060(Class23_Sub4_Sub3.aClass105_2943, i_36_ & 0xffff, 0);
				if (class38_sub4 == null) {
					return null;
				}
				if (bool) {
					class38_sub4.method1057();
				}
				Class23_Sub4_Sub10.aClass81_3056.method1365(i, (long) i_36_, class38_sub4);
			}
		}
		boolean bool_37_;
		if (anInt3761 == 128 && anInt3787 == 128 && anInt3740 == 128) {
			bool_37_ = false;
		} else {
			bool_37_ = true;
		}
		boolean bool_38_;
		if (i == anInt3756 && (anInt3795 ^ 0xffffffff) == -1 && (anInt3748 ^ 0xffffffff) == -1) {
			bool_38_ = false;
		} else {
			bool_38_ = true;
		}
		Class38_Sub4 class38_sub4_39_ = new Class38_Sub4(class38_sub4, (i_29_ ^ 0xffffffff) == -1 && !bool_37_ && !bool_38_, aShortArray3772 == null, aShortArray3742 == null, true);
		if (i_30_ == 4 && i_29_ > 3) {
			class38_sub4_39_.method1049(256);
			class38_sub4_39_.method1042(45, 0, -45);
		}
		i_29_ &= 0x3;
		if (i_29_ == 1) {
			class38_sub4_39_.method1058();
		} else if (i_29_ != 2) {
			if (i_29_ == 3) {
				class38_sub4_39_.method1045();
			}
		} else {
			class38_sub4_39_.method1061();
		}
		if (aShortArray3772 != null) {
			for (int i_40_ = 0; (i_40_ ^ 0xffffffff) > (aShortArray3772.length ^ 0xffffffff); i_40_++) {
				if (aByteArray3764 != null && (i_40_ ^ 0xffffffff) > (aByteArray3764.length ^ 0xffffffff)) {
					class38_sub4_39_.method1065(aShortArray3772[i_40_], Class87_Sub4.aShortArray2851[aByteArray3764[i_40_] & 0xff]);
				} else {
					class38_sub4_39_.method1065(aShortArray3772[i_40_], aShortArray3760[i_40_]);
				}
			}
		}
		if (aShortArray3742 != null) {
			for (int i_41_ = 0; (i_41_ ^ 0xffffffff) > (aShortArray3742.length ^ 0xffffffff); i_41_++)
				class38_sub4_39_.method1043(aShortArray3742[i_41_], aShortArray3802[i_41_]);
		}
		if (bool_37_) {
			class38_sub4_39_.method1056(anInt3761, anInt3787, anInt3740);
		}
		if (bool_38_) {
			class38_sub4_39_.method1042(anInt3756, anInt3795, anInt3748);
		}
		return class38_sub4_39_;
	}
	
	static final void method640(byte b) {
		anInt3745++;
		Class23_Sub4_Sub9.aClass17_3041.method188(-34);
		for (int i = 0; i < 32; i++)
			Class23_Sub14.aLongArray2334[i] = 0L;
		for (int i = 0; i < 32; i++)
			Class27.aLongArray421[i] = 0L;
		if (b != -86) {
			method638(-44, 75);
		}
		Class23_Sub4_Sub22.anInt3267 = 0;
	}
	
	final void method641(Buffer class23_sub5, int i) {
		if (i != 1) {
			method643(-112);
		}
		for (;;) {
			int i_42_ = class23_sub5.readByte();
			if (i_42_ == 0) {
				break;
			}
			method634(class23_sub5, i_42_, true);
		}
		anInt3780++;
	}
	
	final boolean method642(int i) {
		anInt3798++;
		if (anIntArray3799 == null) {
			return true;
		}
		boolean bool = true;
		int i_43_ = 0;
		if (i != 10286) {
			method641(null, 18);
		}
		for (/**/; (anIntArray3799.length ^ 0xffffffff) < (i_43_ ^ 0xffffffff); i_43_++)
			bool &= Class23_Sub4_Sub3.aClass105_2943.method1562(-14250, 0xffff & anIntArray3799[i_43_], 0);
		return bool;
	}
	
	final void method643(int i) {
		if (anInt3793 == -1) {
			anInt3793 = 0;
			if (anIntArray3799 != null && (anIntArray3767 == null || anIntArray3767[0] == 10)) {
				anInt3793 = 1;
			}
			for (int i_44_ = 0; i_44_ < 5; i_44_++) {
				if (aClass16Array3800[i_44_] != null) {
					anInt3793 = 1;
					break;
				}
			}
		}
		anInt3765++;
		int i_45_ = 48 % ((-23 - i) / 55);
		if (anInt3783 == -1) {
			anInt3783 = anInt3806 == 0 ? 0 : 1;
		}
	}
	
	final Class23_Sub13_Sub5 method644(int[][] is, int i, int i_46_, int i_47_, int[][] is_48_, int i_49_, int i_50_, int i_51_, Class23_Sub13_Sub22 class23_sub13_sub22, byte b) {
		anInt3770++;
		long l;
		if (anIntArray3767 == null) {
			l = (long) (i_46_ + (anInt3791 << 10));
		} else {
			l = (long) ((anInt3791 << 10) - -(i_50_ << 3) - -i_46_);
		}
		Class38_Sub1_Sub1 class38_sub1_sub1 = (Class38_Sub1_Sub1) Class38.aClass81_581.method1366(l, (byte) 122);
		if (class38_sub1_sub1 == null) {
			Class38_Sub4 class38_sub4 = method639(0, i_46_, i_50_);
			if (class38_sub4 == null) {
				return null;
			}
			class38_sub1_sub1 = new Class38_Sub1_Sub1(class38_sub4, anInt3803 + 64, 768 + 5 * anInt3778, -50, -10, -50);
			Class38.aClass81_581.method1365(0, l, class38_sub1_sub1);
		}
		if (class23_sub13_sub22 != null) {
			class38_sub1_sub1 = (Class38_Sub1_Sub1) class23_sub13_sub22.method840(i_46_, i_47_, (byte) -15, class38_sub1_sub1);
		}
		if (aByte3766 != 0) {
			if (class23_sub13_sub22 == null) {
				class38_sub1_sub1 = (Class38_Sub1_Sub1) class38_sub1_sub1.method1015(true, true);
			}
			class38_sub1_sub1 = class38_sub1_sub1.method1032(aByte3766, aShort3789, is, is_48_, i, i_49_, i_51_, false);
		}
		RSString.aClass23_Sub13_Sub5_1901.aClass38_3723 = class38_sub1_sub1;
		if (b > -90) {
			method642(-74);
		}
		return RSString.aClass23_Sub13_Sub5_1901;
	}
	
	final boolean method645(int i) {
		anInt3753++;
		if (anIntArray3746 == null) {
			if ((anInt3743 ^ 0xffffffff) == 0 && anIntArray3801 == null) {
				return false;
			}
			return true;
		}
		if (i != -1) {
			return false;
		}
		for (int i_52_ = 0; (anIntArray3746.length ^ 0xffffffff) < (i_52_ ^ 0xffffffff); i_52_++) {
			if ((anIntArray3746[i_52_] ^ 0xffffffff) != 0) {
				Class23_Sub13_Sub7 class23_sub13_sub7_53_ = Class38_Sub2.method1037(anIntArray3746[i_52_], -21035);
				if (class23_sub13_sub7_53_.anInt3743 != -1 || class23_sub13_sub7_53_.anIntArray3801 != null) {
					return true;
				}
			}
		}
		return false;
	}
	
	final Class23_Sub13_Sub7 method646(int i) {
		anInt3794++;
		if (i != 176743434) {
			aBoolean3792 = true;
		}
		int i_54_ = -1;
		if ((anInt3747 ^ 0xffffffff) != 0) {
			i_54_ = Class103.method1517(i + -176743508, anInt3747);
		} else if ((anInt3786 ^ 0xffffffff) != 0) {
			i_54_ = Class23_Sub4_Sub26.anIntArray3323[anInt3786];
		}
		if (i_54_ < 0 || anIntArray3746.length + -1 <= i_54_ || (anIntArray3746[i_54_] ^ 0xffffffff) == 0) {
			int i_55_ = anIntArray3746[-1 + anIntArray3746.length];
			if (i_55_ != -1) {
				return Class38_Sub2.method1037(i_55_, -21035);
			}
			return null;
		}
		return Class38_Sub2.method1037(anIntArray3746[i_54_], -21035);
	}
	
	public Class23_Sub13_Sub7() {
		anInt3743 = -1;
		anInt3756 = 0;
		anInt3748 = 0;
		anInt3751 = -1;
		aBoolean3768 = true;
		aBoolean3763 = true;
		anInt3744 = -1;
		anInt3776 = -1;
		anInt3740 = 128;
		aBoolean3785 = false;
		aBoolean3774 = true;
		anInt3754 = 1;
		anInt3752 = 1;
		anInt3778 = 0;
		anInt3787 = 128;
		aShort3789 = (short) -1;
		aBoolean3758 = false;
		aClass16Array3800 = new RSString[5];
		aBoolean3771 = false;
		anInt3779 = 16;
		aBoolean3796 = false;
		anInt3786 = -1;
		anInt3793 = -1;
		anInt3795 = 0;
		aBoolean3759 = false;
		anInt3755 = 0;
		aClass16_3797 = Class23.aClass16_351;
		anInt3783 = -1;
		anInt3761 = 128;
		anInt3788 = 0;
		anInt3803 = 0;
		aBoolean3741 = false;
		anInt3782 = 0;
		anInt3806 = 2;
		aByte3766 = (byte) 0;
		aBoolean3804 = false;
		anInt3790 = 0;
	}
	
	final boolean method647(int i, int i_56_) {
		anInt3775++;
		if (i_56_ != 5836) {
			anInt3752 = 88;
		}
		if (anIntArray3767 != null) {
			for (int i_57_ = 0; (i_57_ ^ 0xffffffff) > (anIntArray3767.length ^ 0xffffffff); i_57_++) {
				if (anIntArray3767[i_57_] == i) {
					return Class23_Sub4_Sub3.aClass105_2943.method1562(-14250, 0xffff & anIntArray3799[i_57_], 0);
				}
			}
			return true;
		}
		if (anIntArray3799 == null) {
			return true;
		}
		if (i != 10) {
			return true;
		}
		boolean bool = true;
		for (int i_58_ = 0; anIntArray3799.length > i_58_; i_58_++)
			bool &= Class23_Sub4_Sub3.aClass105_2943.method1562(-14250, anIntArray3799[i_58_] & 0xffff, 0);
		return bool;
	}
	
	static {
		anInt3781 = 0;
		aClass16_3805 = Class38_Sub6.method1076((byte) 86, " ");
		aClass16_3762 = aClass16_3805;
	}
}

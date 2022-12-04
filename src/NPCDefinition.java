/* Class23_Sub13_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NPCDefinition extends Class23_Sub13
{
	static int anInt4137;
	private int[] anIntArray4138;
	private int anInt4139;
	private static RSString aClass16_4140 = Class38_Sub6.method1076((byte) 86, "Use");
	private int anInt4141;
	protected int anInt4142;
	protected int anInt4143;
	protected int anInt4144 = -1;
	protected short aShort4145;
	static int anInt4146;
	private int[] anIntArray4147;
	protected int anInt4148;
	static int anInt4149;
	static Class34 aClass34_4150;
	static int anInt4151;
	protected int anInt4152;
	protected int[] anIntArray4153;
	protected boolean aBoolean4154;
	private int anInt4155;
	static int anInt4156;
	private int anInt4157;
	private int anInt4158;
	protected int anInt4159;
	protected boolean aBoolean4160;
	private short[] aShortArray4161;
	protected int anInt4162;
	static RSString aClass16_4163;
	protected int anInt4164;
	private short[] aShortArray4165;
	protected int anInt4166;
	static int anInt4167;
	private short[] aShortArray4168;
	protected boolean aBoolean4169;
	protected int anInt4170;
	static int anInt4171;
	static int anInt4172 = 0;
	protected int anInt4173;
	static int anInt4174;
	static int anInt4175;
	private short[] aShortArray4176;
	static int anInt4177;
	protected boolean aBoolean4178;
	private int anInt4179;
	static int anInt4180;
	protected int anInt4181;
	protected RSString[] aClass16Array4182;
	protected short aShort4183;
	private byte[] aByteArray4184;
	protected RSString name;
	
	final NPCDefinition method813(int i) {
		anInt4175++;
		int i_0_ = -1;
		if (anInt4158 != -1) {
			i_0_ = Class103.method1517(i ^ ~0x2ef, anInt4158);
		} else if ((anInt4139 ^ 0xffffffff) != 0) {
			i_0_ = Class23_Sub4_Sub26.anIntArray3323[anInt4139];
		}
		if (i != 674) {
			method814(121, false);
		}
		if (i_0_ < 0 || (anIntArray4153.length + -1 ^ 0xffffffff) >= (i_0_ ^ 0xffffffff) || anIntArray4153[i_0_] == -1) {
			int i_1_ = anIntArray4153[-1 + anIntArray4153.length];
			if (i_1_ == -1) {
				return null;
			}
			return Class25.method922(false, i_1_);
		}
		return Class25.method922(false, anIntArray4153[i_0_]);
	}
	
	static final int method814(int i, boolean bool) {
		anInt4151++;
		if (Class23_Sub13_Sub15.anInt4036 == 1) {
			return 7;
		}
		int i_2_ = i;
	while_131_:
		do {
		while_130_:
			do {
			while_129_:
				do {
				while_128_:
					do {
						do {
							if (i_2_ != 77) {
								if (i_2_ != 38) {
									if (i_2_ != 16) {
										if (i_2_ != 161) {
											if (i_2_ != 191) {
												if (i_2_ != 69) {
													break while_131_;
												}
											} else {
												break while_129_;
											}
											break while_130_;
										}
									} else {
										break;
									}
									break while_128_;
								}
							} else {
								return 1;
							}
							return 2;
						} while (false);
						return 3;
					} while (false);
					return 4;
				} while (false);
				return 5;
			} while (false);
			return 6;
		} while (false);
		if (bool != true) {
			return -114;
		}
		return 0;
	}
	
	final Class38_Sub1 method815(Class23_Sub13_Sub22 class23_sub13_sub22, int i, int i_3_, int i_4_, Class23_Sub13_Sub22 class23_sub13_sub22_5_) {
		if (i != 4) {
			return null;
		}
		anInt4137++;
		if (anIntArray4153 != null) {
			NPCDefinition class23_sub13_sub20_6_ = method813(i ^ 0x2a6);
			if (class23_sub13_sub20_6_ == null) {
				return null;
			}
			return class23_sub13_sub20_6_.method815(class23_sub13_sub22, i, i_3_, i_4_, class23_sub13_sub22_5_);
		}
		Class38_Sub1 class38_sub1 = (Class38_Sub1) Class23_Sub5_Sub1.aClass81_3527.method1366((long) anInt4159, (byte) 99);
		if (class38_sub1 == null) {
			boolean bool = false;
			for (int i_7_ = 0; anIntArray4147.length > i_7_; i_7_++) {
				if (!Class23_Sub4_Sub11.aClass105_3072.method1562(i + -14254, anIntArray4147[i_7_], 0)) {
					bool = true;
				}
			}
			if (bool) {
				return null;
			}
			Class38_Sub4[] class38_sub4s = new Class38_Sub4[anIntArray4147.length];
			for (int i_8_ = 0; (anIntArray4147.length ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++)
				class38_sub4s[i_8_] = Class38_Sub4.method1060(Class23_Sub4_Sub11.aClass105_3072, anIntArray4147[i_8_], 0);
			Class38_Sub4 class38_sub4;
			if (class38_sub4s.length == 1) {
				class38_sub4 = class38_sub4s[0];
			} else {
				class38_sub4 = new Class38_Sub4(class38_sub4s, class38_sub4s.length);
			}
			if (aShortArray4176 != null) {
				for (int i_9_ = 0; (aShortArray4176.length ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
					if (aByteArray4184 == null || i_9_ >= aByteArray4184.length) {
						class38_sub4.method1065(aShortArray4176[i_9_], aShortArray4165[i_9_]);
					} else {
						class38_sub4.method1065(aShortArray4176[i_9_], Class23_Sub13_Sub17.aShortArray4072[0xff & aByteArray4184[i_9_]]);
					}
				}
			}
			if (aShortArray4161 != null) {
				for (int i_10_ = 0; (aShortArray4161.length ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++)
					class38_sub4.method1043(aShortArray4161[i_10_], aShortArray4168[i_10_]);
			}
			class38_sub1 = class38_sub4.method1064(anInt4179 + 64, anInt4155 + 850, -30, -50, -30);
			Class23_Sub5_Sub1.aClass81_3527.method1365(0, (long) anInt4159, class38_sub1);
		}
		Class38_Sub1 class38_sub1_11_;
		if (class23_sub13_sub22 == null || class23_sub13_sub22_5_ == null) {
			if (class23_sub13_sub22 != null) {
				class38_sub1_11_ = class23_sub13_sub22.method835(i_3_, (byte) -12, class38_sub1);
			} else if (class23_sub13_sub22_5_ != null) {
				class38_sub1_11_ = class23_sub13_sub22_5_.method835(i_4_, (byte) -12, class38_sub1);
			} else {
				class38_sub1_11_ = class38_sub1.method1015(true, true);
			}
		} else {
			class38_sub1_11_ = class23_sub13_sub22.method842(class23_sub13_sub22_5_, i_4_, class38_sub1, 106, i_3_);
		}
		if (anInt4141 != 128 || anInt4157 != 128) {
			class38_sub1_11_.method1002(anInt4141, anInt4157, anInt4141);
		}
		return class38_sub1_11_;
	}
	
	final void method816(int i, Buffer class23_sub5) {
		if (i != 13404) {
			method814(60, false);
		}
		anInt4167++;
		for (;;) {
			int i_12_ = class23_sub5.readUByte();
			if ((i_12_ ^ 0xffffffff) == -1) {
				break;
			}
			//TODO wesd
			method819(i_12_, false, class23_sub5);
		}
		System.out.println("NPC? "+name.toString()+", unknown1 = "+anInt4142);
	}
	
	static final Class23_Sub13_Sub10_Sub1[] method817(RSString class16, RSString class16_13_, Class105 class105, int i) {
		if (i != 24300) {
			return null;
		}
		int i_14_ = class105.method1540(74, class16);
		int i_15_ = class105.method1543(class16_13_, -97, i_14_);
		anInt4174++;
		return Class29.method945(i_15_, i_14_, class105, (byte) 114);
	}
	
	static final void method818(int i, int i_16_) {
		Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[0][i][i_16_];
		for (int i_17_ = 0; i_17_ < 3; i_17_++) {
			Class23_Sub1 class23_sub1_18_ = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_17_][i][i_16_] = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i_17_ + 1][i][i_16_];
			if (class23_sub1_18_ != null) {
				class23_sub1_18_.anInt2041--;
				for (int i_19_ = 0; i_19_ < class23_sub1_18_.anInt2029; i_19_++) {
					Class39 class39 = class23_sub1_18_.aClass39Array2028[i_19_];
					if ((class39.aLong603 >> 29 & 0x3L) == 2L && class39.anInt601 == i && class39.anInt607 == i_16_) {
						class39.anInt598--;
					}
				}
			}
		}
		if (Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[0][i][i_16_] == null) {
			Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[0][i][i_16_] = new Class23_Sub1(0, i, i_16_);
		}
		Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[0][i][i_16_].aClass23_Sub1_2022 = class23_sub1;
		Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[3][i][i_16_] = null;
	}
	
	private final void method819(int i, boolean bool, Buffer class23_sub5) {
		if (i == 1) {
			int i_20_ = class23_sub5.readUByte();
			anIntArray4147 = new int[i_20_];
			for (int i_21_ = 0; i_21_ < i_20_; i_21_++)
				anIntArray4147[i_21_] = class23_sub5.getUShortBE();
		} else if (i == 2) {
			name = class23_sub5.readString(2);
		} else if (i != 12) {
			if (i != 13) {
				if (i != 14) {
					if (i == 15) {
						anInt4162 = class23_sub5.getUShortBE();
					} else if (i != 16) {
						if (i != 17) {
							if (i >= 30 && i < 35) {
								aClass16Array4182[-30 + i] = class23_sub5.readString(2);
								if (aClass16Array4182[i + -30].method140(Class11.aClass16_220, 40)) {
									aClass16Array4182[-30 + i] = null;
								}
							} else if (i == 40) {
								int i_22_ = class23_sub5.readUByte();
								aShortArray4176 = new short[i_22_];
								aShortArray4165 = new short[i_22_];
								for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > (i_22_ ^ 0xffffffff); i_23_++) {
									aShortArray4176[i_23_] = (short) class23_sub5.getUShortBE();
									aShortArray4165[i_23_] = (short) class23_sub5.getUShortBE();
								}
							} else if (i != 41) {
								if (i != 42) {
									if (i == 60) {
										int i_24_ = class23_sub5.readUByte();
										anIntArray4138 = new int[i_24_];
										for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > (i_24_ ^ 0xffffffff); i_25_++)
											anIntArray4138[i_25_] = class23_sub5.getUShortBE();
									} else if (i == 93) {
										aBoolean4154 = false;
									} else if (i != 95) {
										if (i != 97) {
											if (i == 98) {
												anInt4157 = class23_sub5.getUShortBE();
											} else if (i != 99) {
												if (i != 100) {
													if (i == 101) {
														anInt4155 = class23_sub5.method452(-16933672) * 5;
													} else if (i != 102) {
														if (i != 103) {
															if (i == 106 || i == 118) {
																int i_26_ = -1;
																anInt4158 = class23_sub5.getUShortBE();
																if ((anInt4158 ^ 0xffffffff) == -65536) {
																	anInt4158 = -1;
																}
																anInt4139 = class23_sub5.getUShortBE();
																if (anInt4139 == 65535) {
																	anInt4139 = -1;
																}
																if (i == 118) {
																	i_26_ = class23_sub5.getUShortBE();
																	if ((i_26_ ^ 0xffffffff) == -65536) {
																		i_26_ = -1;
																	}
																}
																int i_27_ = class23_sub5.readUByte();
																anIntArray4153 = new int[2 + i_27_];
																for (int i_28_ = 0; i_27_ >= i_28_; i_28_++) {
																	anIntArray4153[i_28_] = class23_sub5.getUShortBE();
																	if ((anIntArray4153[i_28_] ^ 0xffffffff) == -65536) {
																		anIntArray4153[i_28_] = -1;
																	}
																}
																anIntArray4153[1 + i_27_] = i_26_;
															} else if (i != 107) {
																if (i != 109) {
																	if (i != 111) {
																		if (i == 113) {
																			class23_sub5.getUShortBE();
																			class23_sub5.getUShortBE();
																		} else if (i != 114) {
																			if (i == 115) {
																				aShort4183 = (short) (4 * class23_sub5.readUByte());
																				aShort4145 = (short) (class23_sub5.readUByte() * 4);
																			}
																		} else {
																			class23_sub5.method452(-16933672);
																			class23_sub5.method452(-16933672);
																		}
																	}
																} else {
																	aBoolean4178 = false;
																}
															} else {
																aBoolean4169 = false;
															}
														} else {
															anInt4152 = class23_sub5.getUShortBE();
														}
													} else {
														anInt4164 = class23_sub5.getUShortBE();
													}
												} else {
													anInt4179 = class23_sub5.method452(-16933672);
												}
											} else {
												aBoolean4160 = true;
											}
										} else {
											anInt4141 = class23_sub5.getUShortBE();
										}
									} else {
										anInt4166 = class23_sub5.getUShortBE();
									}
								} else {
									int i_29_ = class23_sub5.readUByte();
									aByteArray4184 = new byte[i_29_];
									for (int i_30_ = 0; i_30_ < i_29_; i_30_++)
										aByteArray4184[i_30_] = class23_sub5.method452(-16933672);
								}
							} else {
								int i_31_ = class23_sub5.readUByte();
								aShortArray4168 = new short[i_31_];
								aShortArray4161 = new short[i_31_];
								for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
									aShortArray4161[i_32_] = (short) class23_sub5.getUShortBE();
									aShortArray4168[i_32_] = (short) class23_sub5.getUShortBE();
								}
							}
						} else {
							anInt4142 = class23_sub5.getUShortBE();
							anInt4148 = class23_sub5.getUShortBE();
							anInt4170 = class23_sub5.getUShortBE();
							anInt4143 = class23_sub5.getUShortBE();
						}
					} else {
						anInt4181 = class23_sub5.getUShortBE();
					}
				} else {
					anInt4142 = class23_sub5.getUShortBE();
				}
			} else {
				anInt4144 = class23_sub5.getUShortBE();
			}
		} else {
			anInt4173 = class23_sub5.readUByte();
		}
		anInt4177++;
		if (bool != false) {
			anInt4159 = -126;
		}
	}
	
	final boolean method820(int i) {
		if (i != 0) {
			return true;
		}
		anInt4146++;
		if (anIntArray4153 == null) {
			return true;
		}
		int i_33_ = -1;
		if (anInt4158 == -1) {
			if (anInt4139 != -1) {
				i_33_ = Class23_Sub4_Sub26.anIntArray3323[anInt4139];
			}
		} else {
			i_33_ = Class103.method1517(-56, anInt4158);
		}
		if ((i_33_ ^ 0xffffffff) > -1 || (-1 + anIntArray4153.length ^ 0xffffffff) >= (i_33_ ^ 0xffffffff) || (anIntArray4153[i_33_] ^ 0xffffffff) == 0) {
			int i_34_ = anIntArray4153[anIntArray4153.length - 1];
			if ((i_34_ ^ 0xffffffff) == 0) {
				return false;
			}
			return true;
		}
		return true;
	}
	
	static final void method821(byte b) {
		anInt4180++;
		if (b == -60) {
			Class27.method932(Class51.anInt801, -122, Class23_Sub4_Sub19.anInt3205, Class69.anInt1218);
		}
	}
	
	public static void method822(int i) {
		aClass16_4163 = null;
		aClass16_4140 = null;
		aClass34_4150 = null;
		int i_35_ = -79 / ((i - -2) / 54);
	}
	
	static final int method823(int i, int i_36_) {
		anInt4171++;
		if (i_36_ != -1) {
			method821((byte) 113);
		}
		return i & 0x7f;
	}
	
	final Class38_Sub1 method824(int i, Class23_Sub13_Sub22 class23_sub13_sub22, int i_37_) {
		anInt4156++;
		if (anIntArray4153 != null) {
			NPCDefinition class23_sub13_sub20_38_ = method813(i_37_ ^ 0x2a2);
			if (class23_sub13_sub20_38_ == null) {
				return null;
			}
			return class23_sub13_sub20_38_.method824(i, class23_sub13_sub22, 0);
		}
		if (anIntArray4138 == null) {
			return null;
		}
		Class38_Sub1 class38_sub1 = (Class38_Sub1) Class23_Sub13_Sub24.aClass81_4267.method1366((long) anInt4159, (byte) 107);
		if (class38_sub1 == null) {
			boolean bool = false;
			for (int i_39_ = 0; (i_39_ ^ 0xffffffff) > (anIntArray4138.length ^ 0xffffffff); i_39_++) {
				if (!Class23_Sub4_Sub11.aClass105_3072.method1562(i_37_ + -14250, anIntArray4138[i_39_], 0)) {
					bool = true;
				}
			}
			if (bool) {
				return null;
			}
			Class38_Sub4[] class38_sub4s = new Class38_Sub4[anIntArray4138.length];
			for (int i_40_ = 0; i_40_ < anIntArray4138.length; i_40_++)
				class38_sub4s[i_40_] = Class38_Sub4.method1060(Class23_Sub4_Sub11.aClass105_3072, anIntArray4138[i_40_], 0);
			Class38_Sub4 class38_sub4;
			if (class38_sub4s.length != 1) {
				class38_sub4 = new Class38_Sub4(class38_sub4s, class38_sub4s.length);
			} else {
				class38_sub4 = class38_sub4s[0];
			}
			if (aShortArray4176 != null) {
				for (int i_41_ = 0; (aShortArray4176.length ^ 0xffffffff) < (i_41_ ^ 0xffffffff); i_41_++) {
					if (aByteArray4184 == null || aByteArray4184.length <= i_41_) {
						class38_sub4.method1065(aShortArray4176[i_41_], aShortArray4165[i_41_]);
					} else {
						class38_sub4.method1065(aShortArray4176[i_41_], Class23_Sub13_Sub17.aShortArray4072[aByteArray4184[i_41_] & 0xff]);
					}
				}
			}
			if (aShortArray4161 != null) {
				for (int i_42_ = 0; (i_42_ ^ 0xffffffff) > (aShortArray4161.length ^ 0xffffffff); i_42_++)
					class38_sub4.method1043(aShortArray4161[i_42_], aShortArray4168[i_42_]);
			}
			class38_sub1 = class38_sub4.method1064(64, 768, -50, -10, -50);
			Class23_Sub13_Sub24.aClass81_4267.method1365(0, (long) anInt4159, class38_sub1);
		}
		if (i_37_ != 0) {
			return null;
		}
		if (class23_sub13_sub22 != null) {
			class38_sub1 = class23_sub13_sub22.method839(class38_sub1, i, (byte) 99);
		}
		return class38_sub1;
	}
	
	final void method825(int i) {
		int i_43_ = 15 / ((i - -48) / 35);
		anInt4149++;
	}
	
	public NPCDefinition() {
		anInt4141 = 128;
		anInt4139 = -1;
		anInt4143 = -1;
		anInt4157 = 128;
		anInt4148 = -1;
		anInt4158 = -1;
		anInt4162 = -1;
		aBoolean4169 = true;
		anInt4166 = -1;
		anInt4164 = -1;
		aBoolean4154 = true;
		aBoolean4160 = false;
		aShort4145 = (short) 0;
		anInt4173 = 1;
		anInt4142 = -1;
		anInt4155 = 0;
		anInt4170 = -1;
		aBoolean4178 = true;
		aShort4183 = (short) 0;
		aClass16Array4182 = new RSString[5];
		anInt4179 = 0;
		anInt4181 = -1;
		anInt4152 = 32;
		name = Class94.aClass16_1601;
	}
	
	static {
		aClass16_4163 = aClass16_4140;
	}
}

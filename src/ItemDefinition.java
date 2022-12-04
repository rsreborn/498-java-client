/* Class23_Sub13_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

public class ItemDefinition extends Class23_Sub13
{
	protected int modelRotation1 = 0;
	private int anInt3892;
	static int anInt3893;
	protected int lendId = -1;
	protected int anInt3895 = 0;
	protected int modelZoom;
	protected int anInt3897;
	protected int[] anIntArray3898;
	protected int anInt3899;
	protected boolean isUnnoted;
	static int anInt3901;
	protected RSString name = Class23_Sub13_Sub25.aClass16_4288;
	static int anInt3903;
	static int anInt3904;
	private short[] aShortArray3905;
	protected int[][] anIntArrayArray3906;
	static int anInt3907;
	protected boolean isMembers;
	private int anInt3909;
	protected RSString[] aClass16Array3910;
	static int anInt3911;
	static int anInt3912;
	static int anInt3913;
	static RSString aClass16_3914;
	protected int anInt3915;
	static int anInt3916;
	private int anInt3917;
	private int anInt3918;
	private int anInt3919;
	private byte[] aByteArray3920;
	static int anInt3921;
	protected int anInt3922;
	private int anInt3923;
	private short[] aShortArray3924;
	private int anInt3925;
	protected int id;
	static int anInt3927;
	private int anInt3928;
	static int anInt3929;
	private int anInt3930;
	protected int anInt3931;
	private int anInt3932;
	private int interfaceModelId;
	private static RSString aClass16_3934 = Class38_Sub6.method1076((byte) 86, "Sorry invited players only)3");
	static int anInt3935;
	protected int[] anIntArray3936;
	static int anInt3937;
	private short[] aShortArray3938;
	protected int anInt3939;
	private int anInt3940;
	private short[] aShortArray3941;
	static RSString aClass16_3942 = aClass16_3934;
	protected int anInt3943;
	static Class60 aClass60_3944;
	protected RSString[] aClass16Array3945;
	private int anInt3946;
	protected int modelRotation2;
	private int anInt3948;
	static int anInt3949;
	static int anInt3950;
	private static RSString aClass16_3951 = Class38_Sub6.method1076((byte) 86, "Loading sprites )2 ");
	static int anInt3952;
	protected int value;
	static int anInt3954;
	protected int anInt3955;
	protected int anInt3956;
	private int anInt3957;
	static RSString aClass16_3958;
	private int anInt3959;
	static int anInt3960;
	protected int anInt3961;
	
	static final void method725(byte b) {
		anInt3921++;
		Class1.aClass5_58.method68(0);
		Class87_Sub2.aClass81_2798.method1369((byte) -125);
		Class23_Sub2.aClass5_2053.method68(0);
		if (b > -23) {
			method725((byte) -23);
		}
	}
	
	static final void method726(int i) {
		if (i != -20911) {
			method726(-19);
		}
		if (Class39.aClass32_609 != null) {
			synchronized (Class39.aClass32_609) {
				Class39.aClass32_609 = null;
			}
		}
		anInt3929++;
	}
	
	final void method727(int i, ItemDefinition class23_sub13_sub11_0_, ItemDefinition class23_sub13_sub11_1_) {
		modelRotation2 = class23_sub13_sub11_0_.modelRotation2;
		anInt3922 = class23_sub13_sub11_0_.anInt3922;
		modelZoom = class23_sub13_sub11_0_.modelZoom;
		aShortArray3924 = class23_sub13_sub11_0_.aShortArray3924;
		if (i < 37) {
			method732((byte) -86, false);
		}
		interfaceModelId = class23_sub13_sub11_0_.interfaceModelId;
		value = class23_sub13_sub11_1_.value;
		aShortArray3941 = class23_sub13_sub11_0_.aShortArray3941;
		anInt3895 = 1;
		anInt3897 = class23_sub13_sub11_0_.anInt3897;
		anInt3949++;
		name = class23_sub13_sub11_1_.name;
		aShortArray3905 = class23_sub13_sub11_0_.aShortArray3905;
		isMembers = class23_sub13_sub11_1_.isMembers;
		modelRotation1 = class23_sub13_sub11_0_.modelRotation1;
		anInt3899 = class23_sub13_sub11_0_.anInt3899;
		aShortArray3938 = class23_sub13_sub11_0_.aShortArray3938;
		aByteArray3920 = class23_sub13_sub11_0_.aByteArray3920;
	}
	
	final Class38_Sub4 method728(int i, boolean bool) {
		anInt3903++;
		int i_2_ = -32 / ((9 - i) / 45);
		int i_3_ = anInt3946;
		int i_4_ = anInt3892;
		if (bool) {
			i_4_ = anInt3930;
			i_3_ = anInt3948;
		}
		if ((i_3_ ^ 0xffffffff) == 0) {
			return null;
		}
		Class38_Sub4 class38_sub4 = Class38_Sub4.method1060(Class95.aClass105_1615, i_3_, 0);
		if ((i_4_ ^ 0xffffffff) != 0) {
			Class38_Sub4 class38_sub4_5_ = Class38_Sub4.method1060(Class95.aClass105_1615, i_4_, 0);
			Class38_Sub4[] class38_sub4s = { class38_sub4, class38_sub4_5_ };
			class38_sub4 = new Class38_Sub4(class38_sub4s, 2);
		}
		if (aShortArray3941 != null) {
			for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (aShortArray3941.length ^ 0xffffffff); i_6_++)
				class38_sub4.method1065(aShortArray3941[i_6_], aShortArray3938[i_6_]);
		}
		if (aShortArray3905 != null) {
			for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (aShortArray3905.length ^ 0xffffffff); i_7_++)
				class38_sub4.method1043(aShortArray3905[i_7_], aShortArray3924[i_7_]);
		}
		return class38_sub4;
	}
	
	static final RSString method729(byte b, long l) {
		Class79.aCalendar1881.setTime(new Date(l));
		anInt3907++;
		int i = Class79.aCalendar1881.get(7);
		if (b <= 4) {
			return null;
		}
		int i_8_ = Class79.aCalendar1881.get(5);
		int i_9_ = Class79.aCalendar1881.get(2);
		int i_10_ = Class79.aCalendar1881.get(1);
		int i_11_ = Class79.aCalendar1881.get(11);
		int i_12_ = Class79.aCalendar1881.get(12);
		int i_13_ = Class79.aCalendar1881.get(13);
		return Class23_Sub4_Sub14.method322(new RSString[] { Class67.aClass16Array1185[i + -1], Class59.aClass16_940, Class23_Sub4_Sub23.method360((byte) -9, i_8_ / 10), Class23_Sub4_Sub23.method360((byte) -9, i_8_ % 10), client.aClass16_1976, Class23_Sub13_Sub23.aClass16Array4252[i_9_], client.aClass16_1976, Class23_Sub4_Sub23.method360((byte) -9, i_10_), Class23_Sub4_Sub27.aClass16_3345, Class23_Sub4_Sub23.method360((byte) -9, i_11_ / 10), Class23_Sub4_Sub23.method360((byte) -9, i_11_ % 10), Class23_Sub13_Sub24.aClass16_4276, Class23_Sub4_Sub23.method360((byte) -9, i_12_ / 10), Class23_Sub4_Sub23.method360((byte) -9, i_12_ % 10), Class23_Sub13_Sub24.aClass16_4276, Class23_Sub4_Sub23.method360((byte) -9, i_13_ / 10), Class23_Sub4_Sub23.method360((byte) -9, i_13_ % 10), Class66.aClass16_1163 }, -106);
	}
	
	final boolean method730(int i, boolean bool) {
		anInt3935++;
		int i_14_ = anInt3925;
		int i_15_ = anInt3931;
		int i_16_ = anInt3919;
		if (bool) {
			i_14_ = anInt3932;
			i_16_ = anInt3923;
			i_15_ = anInt3939;
		}
		if ((i_15_ ^ 0xffffffff) == 0) {
			return true;
		}
		boolean bool_17_ = true;
		if (!Class95.aClass105_1615.method1562(-14250, i_15_, 0)) {
			bool_17_ = false;
		}
		if ((i_14_ ^ 0xffffffff) != 0 && !Class95.aClass105_1615.method1562(i + -4312, i_14_, 0)) {
			bool_17_ = false;
		}
		if (i != -9938) {
			return true;
		}
		if ((i_16_ ^ 0xffffffff) != 0 && !Class95.aClass105_1615.method1562(i ^ 0x1178, i_16_, 0)) {
			bool_17_ = false;
		}
		return bool_17_;
	}
	
	static final void method731(int i, int i_18_, int i_19_) {
		Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_18_][i_19_];
		if (class23_sub1 != null) {
			for (int i_20_ = 0; i_20_ < class23_sub1.anInt2029; i_20_++) {
				Class39 class39 = class23_sub1.aClass39Array2028[i_20_];
				if ((class39.aLong603 >> 29 & 0x3L) == 2L && class39.anInt601 == i_18_ && class39.anInt607 == i_19_) {
					Class23_Sub13_Sub23.method844(class39);
					break;
				}
			}
		}
	}
	
	final Class38_Sub4 method732(byte b, boolean bool) {
		int i = -11 % ((38 - b) / 57);
		anInt3954++;
		int i_21_ = anInt3931;
		int i_22_ = anInt3925;
		int i_23_ = anInt3919;
		if (bool) {
			i_21_ = anInt3939;
			i_22_ = anInt3932;
			i_23_ = anInt3923;
		}
		if (i_21_ == -1) {
			return null;
		}
		Class38_Sub4 class38_sub4 = Class38_Sub4.method1060(Class95.aClass105_1615, i_21_, 0);
		if (i_22_ != -1) {
			Class38_Sub4 class38_sub4_24_ = Class38_Sub4.method1060(Class95.aClass105_1615, i_22_, 0);
			if (i_23_ != -1) {
				Class38_Sub4 class38_sub4_25_ = Class38_Sub4.method1060(Class95.aClass105_1615, i_23_, 0);
				Class38_Sub4[] class38_sub4s = { class38_sub4, class38_sub4_24_, class38_sub4_25_ };
				class38_sub4 = new Class38_Sub4(class38_sub4s, 3);
			} else {
				Class38_Sub4[] class38_sub4s = { class38_sub4, class38_sub4_24_ };
				class38_sub4 = new Class38_Sub4(class38_sub4s, 2);
			}
		}
		if (!bool && (anInt3928 ^ 0xffffffff) != -1) {
			class38_sub4.method1042(0, anInt3928, 0);
		}
		if (bool && (anInt3917 ^ 0xffffffff) != -1) {
			class38_sub4.method1042(0, anInt3917, 0);
		}
		if (aShortArray3941 != null) {
			for (int i_26_ = 0; aShortArray3941.length > i_26_; i_26_++)
				class38_sub4.method1065(aShortArray3941[i_26_], aShortArray3938[i_26_]);
		}
		if (aShortArray3905 != null) {
			for (int i_27_ = 0; (i_27_ ^ 0xffffffff) > (aShortArray3905.length ^ 0xffffffff); i_27_++)
				class38_sub4.method1043(aShortArray3905[i_27_], aShortArray3924[i_27_]);
		}
		return class38_sub4;
	}
	
	final void method733(int i) {
		anInt3927++;
		if (i != -1025) {
			method739(true, -123);
		}
	}
	
	final void method734(Buffer class23_sub5, byte b) {
		int i = 122 % ((-27 - b) / 33);
		for (;;) {
			int i_28_ = class23_sub5.readUByte();
			if ((i_28_ ^ 0xffffffff) == -1) {
				break;
			}
			loadDefinition((byte) 111, i_28_, class23_sub5);
		}
		if (id == 4151 || id == 4152 || id == 11696 || id == 1093 || id == 1094 || id == 995) {
			System.out.println("id = "+ id +", name = "+name.toString() +", value = "+value+", isUnnoted = "
		+isUnnoted+", noteCounterpart? = "+anInt3922+", stackable? = "+(anInt3895 == 1 ? true : false));
		}

		anInt3904++;
	}
	
	final ItemDefinition method735(int i, int i_29_) {
		anInt3960++;
		if (anIntArray3898 != null && i_29_ > 1) {
			int i_30_ = -1;
			for (int i_31_ = 0; i_31_ < 10; i_31_++) {
				if ((anIntArray3936[i_31_] ^ 0xffffffff) >= (i_29_ ^ 0xffffffff) && anIntArray3936[i_31_] != 0) {
					i_30_ = anIntArray3898[i_31_];
				}
			}
			if ((i_30_ ^ 0xffffffff) != 0) {
				return Class23_Sub13_Sub24.method853(117, i_30_);
			}
		}
		if (i < 113) {
			return null;
		}
		return this;
	}
	
	private final void loadDefinition(byte b, int opcode, Buffer class23_sub5) {
		anInt3893++;
		if (opcode == 1) {
			interfaceModelId = class23_sub5.getUShortBE();
		} else if (opcode != 2) {
			if (opcode == 4) {
				modelZoom = class23_sub5.getUShortBE();
			} else if (opcode != 5) {
				if (opcode != 6) {
					if (opcode != 7) {
						if (opcode != 8) {
							if (opcode == 11) {
								anInt3895 = 1;
							} else if (opcode != 12) {
								if (opcode == 16) {
									isMembers = true;
								} else if (opcode == 23) {
									anInt3931 = class23_sub5.getUShortBE();
									anInt3928 = class23_sub5.readUByte();
								} else if (opcode != 24) {
									if (opcode != 25) {
										if (opcode == 26) {
											anInt3932 = class23_sub5.getUShortBE();
										} else if (opcode < 30 || opcode >= 35) {
											if (opcode >= 35 && opcode < 40) {
												aClass16Array3910[opcode + -35] = class23_sub5.readString(2);
											} else if (opcode != 40) {
												if (opcode != 41) {
													if (opcode != 42) {
														if (opcode != 65) {
															if (opcode != 78) {
																if (opcode == 79) {
																	anInt3923 = class23_sub5.getUShortBE();
																} else if (opcode != 90) {
																	if (opcode == 91) {
																		anInt3948 = class23_sub5.getUShortBE();
																	} else if (opcode == 92) {
																		anInt3892 = class23_sub5.getUShortBE();
																	} else if (opcode == 93) {
																		anInt3930 = class23_sub5.getUShortBE();
																	} else if (opcode != 95) {
																		if (opcode == 96) {
																			anInt3956 = class23_sub5.readUByte();
																		} else if (opcode != 97) {
																			if (opcode != 98) {
																				if (opcode < 100 || opcode >= 110) {
																					if (opcode != 110) {
																						if (opcode == 111) {
																							anInt3940 = class23_sub5.getUShortBE();
																						} else if (opcode == 112) {
																							anInt3959 = class23_sub5.getUShortBE();
																						} else if (opcode == 113) {
																							anInt3909 = class23_sub5.method452(-16933672);
																						} else if (opcode == 114) {
																							anInt3957 = 5 * class23_sub5.method452(-16933672);
																						} else if (opcode == 115) {
																							anInt3943 = class23_sub5.readUByte();
																						} else if (opcode != 121) {
																							if (opcode == 122) {
																								anInt3915 = class23_sub5.getUShortBE();
																							} else if (opcode == 124) {
																								if (anIntArrayArray3906 == null) {
																									anIntArrayArray3906 = new int[11][];
																								}
																								int i_32_ = class23_sub5.readUByte();
																								anIntArrayArray3906[i_32_] = new int[6];
																								for (int i_33_ = 0; i_33_ < 6; i_33_++)
																									anIntArrayArray3906[i_32_][i_33_] = class23_sub5.method474(true);
																							}
																						} else {
																							lendId = class23_sub5.getUShortBE();
																						}
																					} else {
																						anInt3918 = class23_sub5.getUShortBE();
																					}
																				} else {
																					if (anIntArray3898 == null) {
																						anIntArray3936 = new int[10];
																						anIntArray3898 = new int[10];
																					}
																					anIntArray3898[opcode + -100] = class23_sub5.getUShortBE();
																					anIntArray3936[-100 + opcode] = class23_sub5.getUShortBE();
																				}
																			} else {
																				anInt3955 = class23_sub5.getUShortBE();
																			}
																		} else {
																			anInt3961 = class23_sub5.getUShortBE();
																		}
																	} else {
																		anInt3897 = class23_sub5.getUShortBE();
																	}
																} else {
																	anInt3946 = class23_sub5.getUShortBE();
																}
															} else {
																anInt3919 = class23_sub5.getUShortBE();
															}
														} else {
															isUnnoted = true;
														}
													} else {
														int i_34_ = class23_sub5.readUByte();
														aByteArray3920 = new byte[i_34_];
														for (int i_35_ = 0; (i_35_ ^ 0xffffffff) > (i_34_ ^ 0xffffffff); i_35_++)
															aByteArray3920[i_35_] = class23_sub5.method452(Class104.method1531(b, -16933705));
													}
												} else {
													int i_36_ = class23_sub5.readUByte();
													aShortArray3905 = new short[i_36_];
													aShortArray3924 = new short[i_36_];
													for (int i_37_ = 0; (i_36_ ^ 0xffffffff) < (i_37_ ^ 0xffffffff); i_37_++) {
														aShortArray3905[i_37_] = (short) class23_sub5.getUShortBE();
														aShortArray3924[i_37_] = (short) class23_sub5.getUShortBE();
													}
												}
											} else {
												int i_38_ = class23_sub5.readUByte();
												aShortArray3938 = new short[i_38_];
												aShortArray3941 = new short[i_38_];
												for (int i_39_ = 0; (i_39_ ^ 0xffffffff) > (i_38_ ^ 0xffffffff); i_39_++) {
													aShortArray3941[i_39_] = (short) class23_sub5.getUShortBE();
													aShortArray3938[i_39_] = (short) class23_sub5.getUShortBE();
												}
											}
										} else {
											aClass16Array3945[-30 + opcode] = class23_sub5.readString(2);
											if (aClass16Array3945[opcode + -30].method140(Class11.aClass16_220, 40)) {
												aClass16Array3945[opcode - 30] = null;
											}
										}
									} else {
										anInt3939 = class23_sub5.getUShortBE();
										anInt3917 = class23_sub5.readUByte();
									}
								} else {
									anInt3925 = class23_sub5.getUShortBE();
								}
							} else {
								value = class23_sub5.readUIntBE();
							}
						} else {
							anInt3899 = class23_sub5.getUShortBE();
							if (anInt3899 > 32767) {
								anInt3899 -= 65536;
							}
						}
					} else {
						anInt3922 = class23_sub5.getUShortBE();
						if ((anInt3922 ^ 0xffffffff) < -32768) {
							anInt3922 -= 65536;
						}
					}
				} else {
					modelRotation2 = class23_sub5.getUShortBE();
				}
			} else {
				modelRotation1 = class23_sub5.getUShortBE();
			}
		} else {
			name = class23_sub5.readString(2);
		}
		if (b != 111) {
			anInt3915 = -35;
		}
	}
	
	final Class38_Sub1_Sub1 method737(byte b) {
		anInt3913++;
		Class38_Sub4 class38_sub4 = Class38_Sub4.method1060(Class95.aClass105_1615, interfaceModelId, 0);
		if (class38_sub4 == null) {
			return null;
		}
		if (aShortArray3941 != null) {
			for (int i = 0; (aShortArray3941.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				if (aByteArray3920 != null && (aByteArray3920.length ^ 0xffffffff) < (i ^ 0xffffffff)) {
					class38_sub4.method1065(aShortArray3941[i], Class17.aShortArray315[0xff & aByteArray3920[i]]);
				} else {
					class38_sub4.method1065(aShortArray3941[i], aShortArray3938[i]);
				}
			}
		}
		if (b >= -78) {
			method739(false, 23);
		}
		if (aShortArray3905 != null) {
			for (int i = 0; (i ^ 0xffffffff) > (aShortArray3905.length ^ 0xffffffff); i++)
				class38_sub4.method1043(aShortArray3905[i], aShortArray3924[i]);
		}
		Class38_Sub1_Sub1 class38_sub1_sub1 = class38_sub4.method1046(64 + anInt3909, 768 + anInt3957, -50, -10, -50);
		if (anInt3918 != 128 || anInt3940 != 128 || anInt3959 != 128) {
			class38_sub1_sub1.method1002(anInt3918, anInt3940, anInt3959);
		}
		return class38_sub1_sub1;
	}
	
	public static void method738(boolean bool) {
		aClass16_3942 = null;
		aClass16_3934 = null;
		aClass60_3944 = null;
		if (bool == true) {
			aClass16_3914 = null;
			aClass16_3951 = null;
			aClass16_3958 = null;
		}
	}
	
	final boolean method739(boolean bool, int i) {
		anInt3901++;
		int i_40_ = anInt3946;
		int i_41_ = -55 / ((i - -9) / 61);
		int i_42_ = anInt3892;
		if (bool) {
			i_40_ = anInt3948;
			i_42_ = anInt3930;
		}
		if ((i_40_ ^ 0xffffffff) == 0) {
			return true;
		}
		boolean bool_43_ = true;
		if (!Class95.aClass105_1615.method1562(-14250, i_40_, 0)) {
			bool_43_ = false;
		}
		if ((i_42_ ^ 0xffffffff) != 0 && !Class95.aClass105_1615.method1562(-14250, i_42_, 0)) {
			bool_43_ = false;
		}
		return bool_43_;
	}
	
	final void method740(ItemDefinition class23_sub13_sub11_44_, ItemDefinition class23_sub13_sub11_45_, byte b) {
		aByteArray3920 = class23_sub13_sub11_44_.aByteArray3920;
		anInt3930 = class23_sub13_sub11_45_.anInt3930;
		modelZoom = class23_sub13_sub11_44_.modelZoom;
		interfaceModelId = class23_sub13_sub11_44_.interfaceModelId;
		modelRotation1 = class23_sub13_sub11_44_.modelRotation1;
		modelRotation2 = class23_sub13_sub11_44_.modelRotation2;
		anInt3892 = class23_sub13_sub11_45_.anInt3892;
		anInt3932 = class23_sub13_sub11_45_.anInt3932;
		isMembers = class23_sub13_sub11_45_.isMembers;
		anInt3899 = class23_sub13_sub11_44_.anInt3899;
		anInt3925 = class23_sub13_sub11_45_.anInt3925;
		anInt3923 = class23_sub13_sub11_45_.anInt3923;
		anInt3939 = class23_sub13_sub11_45_.anInt3939;
		anInt3931 = class23_sub13_sub11_45_.anInt3931;
		aShortArray3938 = class23_sub13_sub11_44_.aShortArray3938;
		anInt3952++;
		aShortArray3941 = class23_sub13_sub11_44_.aShortArray3941;
		aClass16Array3910 = new RSString[5];
		anInt3948 = class23_sub13_sub11_45_.anInt3948;
		anInt3946 = class23_sub13_sub11_45_.anInt3946;
		anInt3943 = class23_sub13_sub11_45_.anInt3943;
		aClass16Array3945 = class23_sub13_sub11_45_.aClass16Array3945;
		aShortArray3905 = class23_sub13_sub11_44_.aShortArray3905;
		name = class23_sub13_sub11_45_.name;
		anInt3922 = class23_sub13_sub11_44_.anInt3922;
		anInt3919 = class23_sub13_sub11_45_.anInt3919;
		value = 0;
		aShortArray3924 = class23_sub13_sub11_44_.aShortArray3924;
		anInt3897 = class23_sub13_sub11_44_.anInt3897;
		if (class23_sub13_sub11_45_.aClass16Array3910 != null) {
			for (int i = 0; i < 4; i++)
				aClass16Array3910[i] = class23_sub13_sub11_45_.aClass16Array3910[i];
		}
		if (b != -22) {
			anInt3915 = 104;
		}
		aClass16Array3910[4] = Class23_Sub4_Sub37.aClass16_3475;
	}
	
	final Class38_Sub1 method741(int i, int i_46_, int i_47_, Class23_Sub13_Sub22 class23_sub13_sub22) {
		anInt3911++;
		if (i != -17838) {
			modelRotation1 = -115;
		}
		if (anIntArray3898 != null && i_47_ > 1) {
			int i_48_ = -1;
			for (int i_49_ = 0; i_49_ < 10; i_49_++) {
				if (anIntArray3936[i_49_] <= i_47_ && anIntArray3936[i_49_] != 0) {
					i_48_ = anIntArray3898[i_49_];
				}
			}
			if (i_48_ != -1) {
				return Class23_Sub13_Sub24.method853(-111, i_48_).method741(-17838, i_46_, 1, class23_sub13_sub22);
			}
		}
		Class38_Sub1 class38_sub1 = (Class38_Sub1) Class87_Sub2.aClass81_2798.method1366((long) id, (byte) 108);
		if (class38_sub1 == null) {
			Class38_Sub4 class38_sub4 = Class38_Sub4.method1060(Class95.aClass105_1615, interfaceModelId, 0);
			if (class38_sub4 == null) {
				return null;
			}
			if (aShortArray3941 != null) {
				for (int i_50_ = 0; aShortArray3941.length > i_50_; i_50_++) {
					if (aByteArray3920 == null || aByteArray3920.length <= i_50_) {
						class38_sub4.method1065(aShortArray3941[i_50_], aShortArray3938[i_50_]);
					} else {
						class38_sub4.method1065(aShortArray3941[i_50_], Class17.aShortArray315[aByteArray3920[i_50_] & 0xff]);
					}
				}
			}
			if (aShortArray3905 != null) {
				for (int i_51_ = 0; aShortArray3905.length > i_51_; i_51_++)
					class38_sub4.method1043(aShortArray3905[i_51_], aShortArray3924[i_51_]);
			}
			class38_sub1 = class38_sub4.method1064(64 - -anInt3909, 768 - -anInt3957, -50, -10, -50);
			if (anInt3918 != 128 || anInt3940 != 128 || anInt3959 != 128) {
				class38_sub1.method1002(anInt3918, anInt3940, anInt3959);
			}
			class38_sub1.aBoolean2489 = true;
			Class87_Sub2.aClass81_2798.method1365(0, (long) id, class38_sub1);
		}
		if (class23_sub13_sub22 != null) {
			class38_sub1 = class23_sub13_sub22.method839(class38_sub1, i_46_, (byte) 99);
		}
		return class38_sub1;
	}
	
	static final void method742(byte b) {
		anInt3950++;
		int i = 128 * Class23_Sub4_Sub22.anInt3262 + 64;
		int i_52_ = 128 * RSString.anInt1950 - -64;
		int i_53_ = Class23_Sub4_Sub22.method359(anInt3916, i_52_, i, (byte) 121) - Class28.anInt432;
		if (Class53.anInt838 < i) {
			Class53.anInt838 += Class42.anInt660 * (i - Class53.anInt838) / 1000 + Class59.anInt913;
			if ((Class53.anInt838 ^ 0xffffffff) < (i ^ 0xffffffff)) {
				Class53.anInt838 = i;
			}
		}
		if (Class23_Sub13_Sub1.anInt3673 < i_52_) {
			Class23_Sub13_Sub1.anInt3673 += Class42.anInt660 * (i_52_ - Class23_Sub13_Sub1.anInt3673) / 1000 + Class59.anInt913;
			if (i_52_ < Class23_Sub13_Sub1.anInt3673) {
				Class23_Sub13_Sub1.anInt3673 = i_52_;
			}
		}
		if ((i_52_ ^ 0xffffffff) > (Class23_Sub13_Sub1.anInt3673 ^ 0xffffffff)) {
			Class23_Sub13_Sub1.anInt3673 -= Class59.anInt913 - -(Class42.anInt660 * (-i_52_ + Class23_Sub13_Sub1.anInt3673) / 1000);
			if (Class23_Sub13_Sub1.anInt3673 < i_52_) {
				Class23_Sub13_Sub1.anInt3673 = i_52_;
			}
		}
		i_52_ = 64 + Class23_Sub13_Sub10.anInt3868 * 128;
		if (Class53.anInt838 > i) {
			Class53.anInt838 -= Class59.anInt913 + Class42.anInt660 * (-i + Class53.anInt838) / 1000;
			if ((Class53.anInt838 ^ 0xffffffff) > (i ^ 0xffffffff)) {
				Class53.anInt838 = i;
			}
		}
		if (i_53_ > Class23_Sub23.anInt2424) {
			Class23_Sub23.anInt2424 += Class59.anInt913 + Class42.anInt660 * (-Class23_Sub23.anInt2424 + i_53_) / 1000;
			if (Class23_Sub23.anInt2424 > i_53_) {
				Class23_Sub23.anInt2424 = i_53_;
			}
		}
		if (i_53_ < Class23_Sub23.anInt2424) {
			Class23_Sub23.anInt2424 -= Class59.anInt913 + Class42.anInt660 * (Class23_Sub23.anInt2424 - i_53_) / 1000;
			if ((i_53_ ^ 0xffffffff) < (Class23_Sub23.anInt2424 ^ 0xffffffff)) {
				Class23_Sub23.anInt2424 = i_53_;
			}
		}
		i = 128 * Class23_Sub13_Sub14.anInt4006 + 64;
		i_53_ = Class23_Sub4_Sub22.method359(anInt3916, i_52_, i, (byte) -52) - Class23_Sub4_Sub24.anInt3300;
		int i_54_ = i_52_ + -Class23_Sub13_Sub1.anInt3673;
		int i_55_ = i + -Class53.anInt838;
		int i_56_ = -Class23_Sub23.anInt2424 + i_53_;
		int i_57_ = (int) Math.sqrt((double) (i_55_ * i_55_ + i_54_ * i_54_));
		int i_58_ = 0x7ff & (int) (Math.atan2((double) i_56_, (double) i_57_) * 325.949);
		int i_59_ = (int) (Math.atan2((double) i_54_, (double) i_55_) * -325.949) & 0x7ff;
		if (i_58_ < 128) {
			i_58_ = 128;
		}
		int i_60_ = -Class10.anInt208 + i_59_;
		if (i_60_ > 1024) {
			i_60_ -= 2048;
		}
		if (i_58_ > 383) {
			i_58_ = 383;
		}
		if (b <= 87) {
			method731(-25, -37, -61);
		}
		if (Class23_Sub4_Sub17.anInt3178 < i_58_) {
			Class23_Sub4_Sub17.anInt3178 += Class23_Sub10_Sub2.anInt3625 + (-Class23_Sub4_Sub17.anInt3178 + i_58_) * Class23_Sub4_Sub31.anInt3396 / 1000;
			if ((Class23_Sub4_Sub17.anInt3178 ^ 0xffffffff) < (i_58_ ^ 0xffffffff)) {
				Class23_Sub4_Sub17.anInt3178 = i_58_;
			}
		}
		if (i_60_ < -1024) {
			i_60_ += 2048;
		}
		if ((i_60_ ^ 0xffffffff) < -1) {
			Class10.anInt208 += Class23_Sub10_Sub2.anInt3625 - -(i_60_ * Class23_Sub4_Sub31.anInt3396 / 1000);
			Class10.anInt208 &= 0x7ff;
		}
		if ((i_60_ ^ 0xffffffff) > -1) {
			Class10.anInt208 -= Class23_Sub10_Sub2.anInt3625 - -(-i_60_ * Class23_Sub4_Sub31.anInt3396 / 1000);
			Class10.anInt208 &= 0x7ff;
		}
		int i_61_ = -Class10.anInt208 + i_59_;
		if (i_58_ < Class23_Sub4_Sub17.anInt3178) {
			Class23_Sub4_Sub17.anInt3178 -= Class23_Sub10_Sub2.anInt3625 + Class23_Sub4_Sub31.anInt3396 * (-i_58_ + Class23_Sub4_Sub17.anInt3178) / 1000;
			if ((i_58_ ^ 0xffffffff) < (Class23_Sub4_Sub17.anInt3178 ^ 0xffffffff)) {
				Class23_Sub4_Sub17.anInt3178 = i_58_;
			}
		}
		if (i_61_ > 1024) {
			i_61_ -= 2048;
		}
		if (i_61_ < -1024) {
			i_61_ += 2048;
		}
		if (i_61_ < 0 && i_60_ > 0 || (i_61_ ^ 0xffffffff) < -1 && i_60_ < 0) {
			Class10.anInt208 = i_59_;
		}
	}
	
	static final Class87_Sub4 method743(byte b, Buffer class23_sub5) {
		if (b != -65) {
			return null;
		}
		anInt3937++;
		return new Class87_Sub4(class23_sub5.method474(true), class23_sub5.method474(true), class23_sub5.method474(true), class23_sub5.method474(true), class23_sub5.method474(true), class23_sub5.method474(true), class23_sub5.method474(true), class23_sub5.method474(true), class23_sub5.getTriByte(124), class23_sub5.readUByte());
	}
	
	public ItemDefinition() {
		anInt3892 = -1;
		anInt3915 = -1;
		anInt3899 = 0;
		anInt3918 = 128;
		isUnnoted = false;
		anInt3923 = -1;
		anInt3925 = -1;
		anInt3930 = -1;
		anInt3943 = 0;
		anInt3940 = 128;
		anInt3931 = -1;
		isMembers = false;
		anInt3946 = -1;
		anInt3909 = 0;
		anInt3948 = -1;
		aClass16Array3945 = new RSString[] { null, null, Class17.aClass16_307, null, null };
		modelZoom = 2000;
		anInt3919 = -1;
		anInt3939 = -1;
		aClass16Array3910 = new RSString[] { null, null, null, null, Class23_Sub13_Sub21.aClass16_4186 };
		anInt3922 = 0;
		anInt3917 = 0;
		modelRotation2 = 0;
		value = 1;
		anInt3897 = 0;
		anInt3955 = -1;
		anInt3932 = -1;
		anInt3928 = 0;
		anInt3956 = 0;
		anInt3957 = 0;
		anInt3961 = -1;
		anInt3959 = 128;
	}
	
	static {
		aClass16_3914 = aClass16_3951;
		aClass16_3958 = Class38_Sub6.method1076((byte) 86, ")3)3)3");
	}
}

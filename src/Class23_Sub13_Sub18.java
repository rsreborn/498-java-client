/* Class23_Sub13_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class23_Sub13_Sub18 extends Class23_Sub13
{
	static int anInt4078;
	private int[] anIntArray4079;
	static RSString aClass16_4080;
	static int anInt4081;
	static int anInt4082;
	static int anInt4083;
	static int anInt4084;
	static volatile boolean aBoolean4085 = true;
	static int anInt4086;
	private short[] aShortArray4087;
	static Class23_Sub1[][][] aClass23_Sub1ArrayArrayArray4088;
	static int anInt4089;
	static int anInt4090;
	private short[] aShortArray4091;
	private int[] anIntArray4092 = { -1, -1, -1, -1, -1 };
	static RSString aClass16_4093;
	static int anInt4094;
	static RSString aClass16_4095;
	protected boolean aBoolean4096;
	static RSString aClass16_4097;
	private short[] aShortArray4098;
	static int anInt4099;
	static RSString aClass16_4100;
	private short[] aShortArray4101;
	protected int anInt4102 = -1;
	static int anInt4103;
	private static RSString aClass16_4104;
	
	final Class38_Sub4 method792(int i) {
		anInt4103++;
		int i_0_ = 0;
		Class38_Sub4[] class38_sub4s = new Class38_Sub4[5];
		if (i >= -3) {
			anInt4078 = 20;
		}
		for (int i_1_ = 0; i_1_ < 5; i_1_++) {
			if (anIntArray4092[i_1_] != -1) {
				class38_sub4s[i_0_++] = Class38_Sub4.method1060(Class23_Sub13.aClass105_2312, anIntArray4092[i_1_], 0);
			}
		}
		Class38_Sub4 class38_sub4 = new Class38_Sub4(class38_sub4s, i_0_);
		if (aShortArray4101 != null) {
			for (int i_2_ = 0; i_2_ < aShortArray4101.length; i_2_++)
				class38_sub4.method1065(aShortArray4101[i_2_], aShortArray4087[i_2_]);
		}
		if (aShortArray4091 != null) {
			for (int i_3_ = 0; i_3_ < aShortArray4091.length; i_3_++)
				class38_sub4.method1043(aShortArray4091[i_3_], aShortArray4098[i_3_]);
		}
		return class38_sub4;
	}
	
	final void method793(int i, Buffer class23_sub5) {
		for (;;) {
			int i_4_ = class23_sub5.readUByte();
			if ((i_4_ ^ 0xffffffff) == -1) {
				break;
			}
			method798(i_4_, -27583, class23_sub5);
		}
		anInt4083++;
		int i_5_ = -19 % ((36 - i) / 57);
	}
	
	final boolean method794(boolean bool) {
		anInt4099++;
		if (anIntArray4079 == null) {
			return true;
		}
		boolean bool_6_ = bool;
		for (int i = 0; (anIntArray4079.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
			if (!Class23_Sub13.aClass105_2312.method1562(-14250, anIntArray4079[i], 0)) {
				bool_6_ = false;
			}
		}
		return bool_6_;
	}
	
	static final boolean method795(byte b) {
		anInt4086++;
		long l = Class94.method1466(22624);
		int i = (int) (l + -Class21.aLong337);
		if (i > 200) {
			i = 200;
		}
		Class64.anInt1077 += i;
		Class21.aLong337 = l;
		if (b > -82) {
			return true;
		}
		if (Class23_Sub13_Sub8_Sub1.anInt4501 == 0 && (Class4.anInt89 ^ 0xffffffff) == -1 && (Class68.anInt1190 ^ 0xffffffff) == -1 && (Buffer.anInt2166 ^ 0xffffffff) == -1) {
			return true;
		}
		if (Class23_Sub23.aClass34_2427 == null) {
			return false;
		}
		try {
			if (Class64.anInt1077 > 30000) {
				throw new IOException();
			}
			while (Class4.anInt89 < 20) {
				if ((Buffer.anInt2166 ^ 0xffffffff) >= -1) {
					break;
				}
				Class23_Sub13_Sub26 class23_sub13_sub26 = (Class23_Sub13_Sub26) Class8.anOa172.a((byte) -25);
				Buffer class23_sub5 = new Buffer(4);
				class23_sub5.writeByte(1);
				class23_sub5.putTriByte(-483923896, (int) class23_sub13_sub26.aLong358);
				Class23_Sub23.aClass34_2427.method977(30000, 4, 0, class23_sub5.payload);
				Class42.anOa649.a(class23_sub13_sub26, (byte) -14, class23_sub13_sub26.aLong358);
				Class4.anInt89++;
				Buffer.anInt2166--;
			}
			for (/**/; Class23_Sub13_Sub8_Sub1.anInt4501 < 20 && Class68.anInt1190 > 0; Class23_Sub13_Sub8_Sub1.anInt4501++) {
				Class23_Sub13_Sub26 class23_sub13_sub26 = (Class23_Sub13_Sub26) Class23_Sub4_Sub39.aClass27_3520.method933(128);
				Buffer class23_sub5 = new Buffer(4);
				class23_sub5.writeByte(0);
				class23_sub5.putTriByte(-483923896, (int) class23_sub13_sub26.aLong358);
				Class23_Sub23.aClass34_2427.method977(30000, 4, 0, class23_sub5.payload);
				class23_sub13_sub26.method601(false);
				Class87_Sub3.anOa2812.a(class23_sub13_sub26, (byte) -14, class23_sub13_sub26.aLong358);
				Class68.anInt1190--;
			}
			for (int i_7_ = 0; i_7_ < 100; i_7_++) {
				int i_8_ = Class23_Sub23.aClass34_2427.read(-46);
				if ((i_8_ ^ 0xffffffff) > -1) {
					throw new IOException();
				}
				if (i_8_ == 0) {
					break;
				}
				Class64.anInt1077 = 0;
				int i_9_ = 0;
				if (Class23_Sub4_Sub1.aClass23_Sub13_Sub26_2894 != null) {
					if (Class51.anInt799 == 0) {
						i_9_ = 1;
					}
				} else {
					i_9_ = 8;
				}
				if (i_9_ <= 0) {
					int i_10_ = Class23_Sub4_Sub9.aClass23_Sub5_3035.payload.length + -Class23_Sub4_Sub1.aClass23_Sub13_Sub26_2894.aByte4302;
					int i_11_ = -Class51.anInt799 + 512;
					if ((i_10_ - Class23_Sub4_Sub9.aClass23_Sub5_3035.pos ^ 0xffffffff) > (i_11_ ^ 0xffffffff)) {
						i_11_ = i_10_ + -Class23_Sub4_Sub9.aClass23_Sub5_3035.pos;
					}
					if (i_11_ > i_8_) {
						i_11_ = i_8_;
					}
					Class23_Sub23.aClass34_2427.method974(i_11_, 126, Class23_Sub4_Sub9.aClass23_Sub5_3035.pos, Class23_Sub4_Sub9.aClass23_Sub5_3035.payload);
					if (Class95.aByte1613 != 0) {
						for (int i_12_ = 0; i_11_ > i_12_; i_12_++)
							Class23_Sub4_Sub9.aClass23_Sub5_3035.payload[Class23_Sub4_Sub9.aClass23_Sub5_3035.pos - -i_12_] = (byte) Class104.method1531(Class23_Sub4_Sub9.aClass23_Sub5_3035.payload[Class23_Sub4_Sub9.aClass23_Sub5_3035.pos + i_12_], Class95.aByte1613);
					}
					Class23_Sub4_Sub9.aClass23_Sub5_3035.pos += i_11_;
					Class51.anInt799 += i_11_;
					if (i_10_ != Class23_Sub4_Sub9.aClass23_Sub5_3035.pos) {
						if (Class51.anInt799 != 512) {
							break;
						}
						Class51.anInt799 = 0;
					} else {
						if ((Class23_Sub4_Sub1.aClass23_Sub13_Sub26_2894.aLong358 ^ 0xffffffffffffffffL) == -16711936L) {
							Class89.aClass23_Sub5_1514 = Class23_Sub4_Sub9.aClass23_Sub5_3035;
							for (int i_13_ = 0; i_13_ < 256; i_13_++) {
								Class105_Sub1 class105_sub1 = Class54.aClass105_Sub1Array853[i_13_];
								if (class105_sub1 != null) {
									Class89.aClass23_Sub5_1514.pos = 5 + 8 * i_13_;
									int i_14_ = Class89.aClass23_Sub5_1514.readUIntBE();
									int i_15_ = Class89.aClass23_Sub5_1514.readUIntBE();
									class105_sub1.method1566(i_15_, 96, i_14_);
								}
							}
						} else {
							Class38_Sub7_Sub2.aCRC32_4397.reset();
							Class38_Sub7_Sub2.aCRC32_4397.update(Class23_Sub4_Sub9.aClass23_Sub5_3035.payload, 0, i_10_);
							int i_16_ = (int) Class38_Sub7_Sub2.aCRC32_4397.getValue();
							if (i_16_ != Class23_Sub4_Sub1.aClass23_Sub13_Sub26_2894.anInt4303) {
								try {
									Class23_Sub23.aClass34_2427.method976(false);
								} catch (Exception exception) {
									/* empty */
								}
								Class23_Sub23.aClass34_2427 = null;
								Class95.aByte1613 = (byte) (int) (255.0 * Math.random() + 1.0);
								Class23_Sub23.anInt2420++;
								return false;
							}
							Class23_Sub17.anInt2369 = 0;
							Class23_Sub23.anInt2420 = 0;
							Class23_Sub4_Sub1.aClass23_Sub13_Sub26_2894.aClass105_Sub1_4304.method1570((Class23_Sub4_Sub1.aClass23_Sub13_Sub26_2894.aLong358 & 0xff0000L ^ 0xffffffffffffffffL) == -16711681L, (int) (0xffffL & Class23_Sub4_Sub1.aClass23_Sub13_Sub26_2894.aLong358), true, Class23_Sub4_Sub4.aBoolean2968, Class23_Sub4_Sub9.aClass23_Sub5_3035.payload);
						}
						Class23_Sub4_Sub1.aClass23_Sub13_Sub26_2894.method228(0);
						if (Class23_Sub4_Sub4.aBoolean2968) {
							Class4.anInt89--;
						} else {
							Class23_Sub13_Sub8_Sub1.anInt4501--;
						}
						Class23_Sub4_Sub1.aClass23_Sub13_Sub26_2894 = null;
						Class51.anInt799 = 0;
						Class23_Sub4_Sub9.aClass23_Sub5_3035 = null;
					}
				} else {
					int i_17_ = -Class73.aClass23_Sub5_1324.pos + i_9_;
					if ((i_17_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff)) {
						i_17_ = i_8_;
					}
					Class23_Sub23.aClass34_2427.method974(i_17_, 125, Class73.aClass23_Sub5_1324.pos, Class73.aClass23_Sub5_1324.payload);
					if (Class95.aByte1613 != 0) {
						for (int i_18_ = 0; (i_17_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff); i_18_++)
							Class73.aClass23_Sub5_1324.payload[Class73.aClass23_Sub5_1324.pos + i_18_] = (byte) Class104.method1531(Class73.aClass23_Sub5_1324.payload[Class73.aClass23_Sub5_1324.pos + i_18_], Class95.aByte1613);
					}
					Class73.aClass23_Sub5_1324.pos += i_17_;
					if ((i_9_ ^ 0xffffffff) < (Class73.aClass23_Sub5_1324.pos ^ 0xffffffff)) {
						break;
					}
					if (Class23_Sub4_Sub1.aClass23_Sub13_Sub26_2894 == null) {
						Class73.aClass23_Sub5_1324.pos = 0;
						int i_19_ = Class73.aClass23_Sub5_1324.readUByte();
						//System.out.println("Cache = " + i_19_);
						int i_20_ = Class73.aClass23_Sub5_1324.getUShortBE();
						//System.out.println("File = " + i_20_);
						int i_21_ = Class73.aClass23_Sub5_1324.readUByte();
						long l_22_ = (long) ((i_19_ << 16) + i_20_);
						int i_23_ = Class73.aClass23_Sub5_1324.readUIntBE();
						Class23_Sub13_Sub26 class23_sub13_sub26 = (Class23_Sub13_Sub26) Class42.anOa649.a((byte) -120, l_22_);
						Class23_Sub4_Sub4.aBoolean2968 = true;
						if (class23_sub13_sub26 == null) {
							class23_sub13_sub26 = (Class23_Sub13_Sub26) Class87_Sub3.anOa2812.a((byte) 116, l_22_);
							Class23_Sub4_Sub4.aBoolean2968 = false;
						}
						if (class23_sub13_sub26 == null) {
							throw new IOException();
						}
						Class23_Sub4_Sub1.aClass23_Sub13_Sub26_2894 = class23_sub13_sub26;
						int i_24_ = i_21_ != 0 ? 9 : 5;
						Class23_Sub4_Sub9.aClass23_Sub5_3035 = new Buffer(i_23_ + (i_24_ - -Class23_Sub4_Sub1.aClass23_Sub13_Sub26_2894.aByte4302));
						Class23_Sub4_Sub9.aClass23_Sub5_3035.writeByte(i_21_);
						Class23_Sub4_Sub9.aClass23_Sub5_3035.putInt(i_23_, -1137894376);
						Class51.anInt799 = 8;
						Class73.aClass23_Sub5_1324.pos = 0;
					} else if ((Class51.anInt799 ^ 0xffffffff) == -1) {
						if ((Class73.aClass23_Sub5_1324.payload[0] ^ 0xffffffff) != 0) {
							Class23_Sub4_Sub1.aClass23_Sub13_Sub26_2894 = null;
						} else {
							Class51.anInt799 = 1;
							Class73.aClass23_Sub5_1324.pos = 0;
						}
					}
				}
			}
			return true;
		} catch (IOException ioexception) {
			try {
				Class23_Sub23.aClass34_2427.method976(false);
			} catch (Exception exception) {
				/* empty */
			}
			Class23_Sub23.aClass34_2427 = null;
			Class23_Sub17.anInt2369++;
			return false;
		}
	}
	
	final Class38_Sub4 method796(int i) {
		anInt4094++;
		if (anIntArray4079 == null) {
			return null;
		}
		Class38_Sub4[] class38_sub4s = new Class38_Sub4[anIntArray4079.length];
		for (int i_25_ = 0; anIntArray4079.length > i_25_; i_25_++)
			class38_sub4s[i_25_] = Class38_Sub4.method1060(Class23_Sub13.aClass105_2312, anIntArray4079[i_25_], 0);
		if (i != -6) {
			method798(-126, 1, null);
		}
		Class38_Sub4 class38_sub4;
		if (class38_sub4s.length == 1) {
			class38_sub4 = class38_sub4s[0];
		} else {
			class38_sub4 = new Class38_Sub4(class38_sub4s, class38_sub4s.length);
		}
		if (aShortArray4101 != null) {
			for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > (aShortArray4101.length ^ 0xffffffff); i_26_++)
				class38_sub4.method1065(aShortArray4101[i_26_], aShortArray4087[i_26_]);
		}
		if (aShortArray4091 != null) {
			for (int i_27_ = 0; (aShortArray4091.length ^ 0xffffffff) < (i_27_ ^ 0xffffffff); i_27_++)
				class38_sub4.method1043(aShortArray4091[i_27_], aShortArray4098[i_27_]);
		}
		return class38_sub4;
	}
	
	public static void method797(int i) {
		aClass16_4080 = null;
		aClass16_4104 = null;
		aClass16_4100 = null;
		aClass16_4097 = null;
		aClass16_4095 = null;
		aClass16_4093 = null;
		if (i == -1) {
			aClass23_Sub1ArrayArrayArray4088 = null;
		}
	}
	
	private final void method798(int i, int i_28_, Buffer class23_sub5) {
		if (i_28_ != -27583) {
			method801((byte) 26);
		}
		anInt4082++;
		if (i != 1) {
			if (i != 2) {
				if (i != 3) {
					if (i != 40) {
						if (i != 41) {
							if (i >= 60 && i < 70) {
								anIntArray4092[i - 60] = class23_sub5.getUShortBE();
							}
						} else {
							int i_29_ = class23_sub5.readUByte();
							aShortArray4098 = new short[i_29_];
							aShortArray4091 = new short[i_29_];
							for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > (i_29_ ^ 0xffffffff); i_30_++) {
								aShortArray4091[i_30_] = (short) class23_sub5.getUShortBE();
								aShortArray4098[i_30_] = (short) class23_sub5.getUShortBE();
							}
						}
					} else {
						int i_31_ = class23_sub5.readUByte();
						aShortArray4087 = new short[i_31_];
						aShortArray4101 = new short[i_31_];
						for (int i_32_ = 0; i_31_ > i_32_; i_32_++) {
							aShortArray4101[i_32_] = (short) class23_sub5.getUShortBE();
							aShortArray4087[i_32_] = (short) class23_sub5.getUShortBE();
						}
					}
				} else {
					aBoolean4096 = true;
				}
			} else {
				int i_33_ = class23_sub5.readUByte();
				anIntArray4079 = new int[i_33_];
				for (int i_34_ = 0; i_33_ > i_34_; i_34_++)
					anIntArray4079[i_34_] = class23_sub5.getUShortBE();
			}
		} else {
			anInt4102 = class23_sub5.readUByte();
		}
	}
	
	static final Class23_Sub13_Sub15 method799(int i, int i_35_) {
		anInt4090++;
		Class23_Sub13_Sub15 class23_sub13_sub15 = (Class23_Sub13_Sub15) Class23_Sub13_Sub23.aClass5_4244.method62(i_35_ + -1105, (long) i);
		if (class23_sub13_sub15 != null) {
			return class23_sub13_sub15;
		}
		if (i_35_ != 1221) {
			anInt4078 = 12;
		}
		byte[] bs;
		if ((i ^ 0xffffffff) > -32769) {
			bs = Class43.aClass105_664.method1544(i, 0, 0);
		} else {
			bs = Class23_Sub4_Sub39.aClass105_3525.method1544(0x7fff & i, i_35_ ^ 0x4c5, 0);
		}
		class23_sub13_sub15 = new Class23_Sub13_Sub15();
		if (bs != null) {
			class23_sub13_sub15.method775(3342, new Buffer(bs));
		}
		Class23_Sub13_Sub23.aClass5_4244.method67((long) i, class23_sub13_sub15, true);
		return class23_sub13_sub15;
	}
	
	static final RSString method800(int i, boolean bool) {
		if (bool != false) {
			return null;
		}
		anInt4089++;
		if ((Class98.aClass16Array1655[i].method171(-61) ^ 0xffffffff) >= -1) {
			return Class23_Sub13_Sub26.aClass16Array4307[i];
		}
		return Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub13_Sub26.aClass16Array4307[i], ObjectDefinition.aClass16_3762, Class98.aClass16Array1655[i] }, -110);
	}
	
	final boolean method801(byte b) {
		boolean bool = true;
		int i = 0;
		if (b != -8) {
			method798(55, -76, null);
		}
		for (/**/; i < 5; i++) {
			if (anIntArray4092[i] != -1 && !Class23_Sub13.aClass105_2312.method1562(-14250, anIntArray4092[i], 0)) {
				bool = false;
			}
		}
		anInt4081++;
		return bool;
	}
	
	public Class23_Sub13_Sub18() {
		aBoolean4096 = false;
	}
	
	static {
		anInt4078 = 0;
		aClass16_4100 = Class38_Sub6.method1076((byte) 86, "details)3dat");
		aClass16_4080 = Class38_Sub6.method1076((byte) 86, "::gc");
		aClass16_4093 = Class38_Sub6.method1076((byte) 86, "Clientscript error )2 check log for details");
		aClass16_4104 = Class38_Sub6.method1076((byte) 86, "Press (Wrecover a locked account(W on front page)3");
		aClass16_4097 = Class38_Sub6.method1076((byte) 86, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");
		aClass16_4095 = aClass16_4104;
	}
}

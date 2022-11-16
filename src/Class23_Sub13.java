/* Class23_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

class Class23_Sub13 extends Class23
{
	static RSString aClass16_2306;
	static Class84 aClass84_2307;
	private static RSString aClass16_2308;
	static int anInt2309 = 0;
	protected Class23_Sub13 aClass23_Sub13_2310;
	static RSString aClass16_2311 = Class38_Sub6.method1076((byte) 86, "sl_stars");
	static Class105 aClass105_2312;
	static RSString aClass16_2313 = Class38_Sub6.method1076((byte) 86, "Lade Schrifts-=tze )2 ");
	protected Class23_Sub13 aClass23_Sub13_2314;
	static int anInt2315;
	static int anInt2316;
	static boolean[] aBooleanArray2317;
	static int anInt2318;
	static int anInt2319;
	static int anInt2320;
	
	static final boolean method599(int i) throws IOException {
		anInt2318++;
		if (Class23_Sub24.aClass34_2440 == null) {
			return false;
		}
		int i_0_ = Class23_Sub24.aClass34_2440.method973(-80);
		if ((i_0_ ^ 0xffffffff) == -1) {
			return false;
		}
		if ((Class23_Sub13_Sub24.anInt4275 ^ 0xffffffff) == 0) {
			i_0_--;
			Class23_Sub24.aClass34_2440.method974(1, 121, 0, Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.payload);
			Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.position = 0;
			Class23_Sub13_Sub24.anInt4275 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method491((byte) 47);
			Class23_Sub4_Sub2.anInt2925 = Class55.anIntArray863[Class23_Sub13_Sub24.anInt4275];
		}
		if (Class23_Sub4_Sub2.anInt2925 == -1) {
			if (i_0_ <= 0) {
				return false;
			}
			Class23_Sub24.aClass34_2440.method974(1, i + -19935, 0, Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.payload);
			i_0_--;
			Class23_Sub4_Sub2.anInt2925 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.payload[0] & 0xff;
		}
		if ((Class23_Sub4_Sub2.anInt2925 ^ 0xffffffff) == 1) {
			if (i_0_ <= 1) {
				return false;
			}
			i_0_ -= 2;
			Class23_Sub24.aClass34_2440.method974(2, 113, 0, Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.payload);
			Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.position = 0;
			Class23_Sub4_Sub2.anInt2925 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -101);
		}
		if (i_0_ < Class23_Sub4_Sub2.anInt2925) {
			return false;
		}
		Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.position = 0;
		Class23_Sub24.aClass34_2440.method974(Class23_Sub4_Sub2.anInt2925, 105, 0, Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.payload);
		Class63.anInt992 = 0;
		Class25.anInt379 = Class25.anInt388;
		Class25.anInt388 = Class43.anInt666;
		Class43.anInt666 = Class23_Sub13_Sub24.anInt4275;
		if (Class23_Sub13_Sub24.anInt4275 == 225) {
			int i_1_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method472(-18);
			int i_2_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method456(2);
			Class64 class64 = Class23_Sub24.method905(i_1_, (byte) 111);
			if ((i_2_ ^ 0xffffffff) != (class64.anInt1006 ^ 0xffffffff) || i_2_ == -1) {
				class64.anInt1020 = 0;
				class64.anInt1006 = i_2_;
				class64.anInt1100 = 0;
				Class91.method1450((byte) 29, class64);
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 205) {
			client.method36((byte) 102);
			Class23_Sub13_Sub17.anInt4071 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(i ^ ~0x6b283bbb);
			Class88.anInt1499 = Class23_Sub10_Sub2.anInt3589;
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 139) {
			anInt2316 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method480((byte) 82) * 30;
			Class23_Sub13_Sub24.anInt4275 = -1;
			Class88.anInt1499 = Class23_Sub10_Sub2.anInt3589;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 192) {
			byte[] bs = new byte[Class23_Sub4_Sub2.anInt2925];
			Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method490(-122, Class23_Sub4_Sub2.anInt2925, 0, bs);
			Class23_Sub13_Sub22.method834(Class46.method1139(bs, 0, Class23_Sub4_Sub2.anInt2925, 0), (byte) -110);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 112) {
			int i_3_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(65280);
			int i_4_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -118);
			int i_5_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method465((byte) -128);
			int i_6_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(65280);
			if ((i_5_ >> 30 ^ 0xffffffff) == -1) {
				if ((i_5_ >> 29 ^ 0xffffffff) == -1) {
					if (i_5_ >> 28 != 0) {
						int i_7_ = i_5_ & 0xffff;
						Class38_Sub7_Sub2 class38_sub7_sub2;
						if ((i_7_ ^ 0xffffffff) == (Class23_Sub4_Sub10.anInt3049 ^ 0xffffffff)) {
							class38_sub7_sub2 = Class105.aClass38_Sub7_Sub2_1812;
						} else {
							class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_7_];
						}
						if (class38_sub7_sub2 != null) {
							class38_sub7_sub2.anInt2695 = 0;
							class38_sub7_sub2.anInt2647 = i_6_;
							class38_sub7_sub2.anInt2710 = i_3_;
							class38_sub7_sub2.anInt2661 = 0;
							class38_sub7_sub2.anInt2671 = Class89.anInt1511 - -i_4_;
							if ((Class89.anInt1511 ^ 0xffffffff) > (class38_sub7_sub2.anInt2671 ^ 0xffffffff)) {
								class38_sub7_sub2.anInt2695 = -1;
							}
							if ((class38_sub7_sub2.anInt2710 ^ 0xffffffff) == -65536) {
								class38_sub7_sub2.anInt2710 = -1;
							}
						}
					}
				} else {
					int i_8_ = 0xffff & i_5_;
					Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[i_8_];
					if (class38_sub7_sub1 != null) {
						class38_sub7_sub1.anInt2671 = i_4_ + Class89.anInt1511;
						class38_sub7_sub1.anInt2695 = 0;
						class38_sub7_sub1.anInt2710 = i_3_;
						if ((Class89.anInt1511 ^ 0xffffffff) > (class38_sub7_sub1.anInt2671 ^ 0xffffffff)) {
							class38_sub7_sub1.anInt2695 = -1;
						}
						class38_sub7_sub1.anInt2661 = 0;
						if ((class38_sub7_sub1.anInt2710 ^ 0xffffffff) == -65536) {
							class38_sub7_sub1.anInt2710 = -1;
						}
						class38_sub7_sub1.anInt2647 = i_6_;
					}
				}
			} else {
				int i_9_ = (0x398ba994 & i_5_) >> 28;
				int i_10_ = -Class58.anInt903 + (i_5_ & 0x3fff);
				int i_11_ = (i_5_ >> 14 & 0x3fff) + -Class42.anInt662;
				if (i_11_ >= 0 && (i_10_ ^ 0xffffffff) <= -1 && i_11_ < 104 && i_10_ < 104) {
					i_11_ = 128 * i_11_ - -64;
					i_10_ = 64 + i_10_ * 128;
					Class38_Sub6 class38_sub6 = new Class38_Sub6(i_3_, i_9_, i_11_, i_10_, Class23_Sub4_Sub22.method359(i_9_, i_11_, i_10_, (byte) -96) - i_6_, i_4_, Class89.anInt1511);
					Class23_Sub13_Sub17.aClass89_4066.method1439(69, new Class23_Sub13_Sub9(class38_sub6));
				}
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 125 || Class23_Sub13_Sub24.anInt4275 == 238 || Class23_Sub13_Sub24.anInt4275 == 198 || Class23_Sub13_Sub24.anInt4275 == 74 || Class23_Sub13_Sub24.anInt4275 == 16 || Class23_Sub13_Sub24.anInt4275 == 214 || Class23_Sub13_Sub24.anInt4275 == 188 || Class23_Sub13_Sub24.anInt4275 == 134 || Class23_Sub13_Sub24.anInt4275 == 138 || Class23_Sub13_Sub24.anInt4275 == 60 || Class23_Sub13_Sub24.anInt4275 == 77 || Class23_Sub13_Sub24.anInt4275 == 24) {
			Class35.method985(-89);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 10) {
			if (Class23_Sub4_Sub2.anInt2925 == 0) {
				Class23_Sub4_Sub7.aClass16_3022 = Class94.aClass16_1599;
			} else {
				Class23_Sub4_Sub7.aClass16_3022 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method426(2);
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 76) {
			int i_12_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(65280);
			int i_13_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method441(125);
			int i_14_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(65280);
			int i_15_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(65280);
			Class64 class64 = Class23_Sub24.method905(i_13_, (byte) 111);
			if ((i_12_ ^ 0xffffffff) != (class64.anInt1107 ^ 0xffffffff) || (i_15_ ^ 0xffffffff) != (class64.anInt1110 ^ 0xffffffff) || (i_14_ ^ 0xffffffff) != (class64.anInt1050 ^ 0xffffffff)) {
				class64.anInt1107 = i_12_;
				class64.anInt1110 = i_15_;
				class64.anInt1050 = i_14_;
				Class91.method1450((byte) 29, class64);
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 87) {
			Class71_Sub1_Sub1.method1274(i ^ 0x5152);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 229) {
			int i_16_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(65280);
			if ((i_16_ ^ 0xffffffff) == -65536) {
				i_16_ = -1;
			}
			int i_17_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method441(-112);
			int i_18_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method435((byte) 122);
			int i_19_ = (0x36caa3aa & i_17_) >> 28;
			int i_20_ = i_17_ >> 14 & 0x3fff;
			int i_21_ = i_18_ >> 2;
			int i_22_ = i_17_ & 0x3fff;
			int i_23_ = 0x3 & i_18_;
			i_22_ -= Class58.anInt903;
			i_20_ -= Class42.anInt662;
			int i_24_ = Class75.anIntArray1375[i_21_];
			Class23_Sub19.method879(90, i_24_, i_20_, i_22_, i_16_, i_21_, i_19_, i_23_);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 213) {
			long l = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method468(-90);
			Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method452(-16933672);
			long l_25_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method468(-107);
			long l_26_ = (long) Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -103);
			long l_27_ = (long) Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method471(116);
			long l_28_ = l_27_ + (l_26_ << 32);
			int i_29_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(i + -1797833796);
			int i_30_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -114);
			boolean bool = false;
		while_25_:
			do {
				for (int i_31_ = 0; i_31_ < 100; i_31_++) {
					if (l_28_ == Class29.aLongArray467[i_31_]) {
						bool = true;
						break while_25_;
					}
				}
				if (i_29_ <= 1) {
					for (int i_32_ = 0; (i_32_ ^ 0xffffffff) > (Class25.anInt383 ^ 0xffffffff); i_32_++) {
						if (Class23_Sub4_Sub30.aLongArray3383[i_32_] == l) {
							bool = true;
							break;
						}
					}
				}
			} while (false);
			if (!bool && Class23_Sub4_Sub39.anInt3519 == 0) {
				Class29.aLongArray467[Class47.anInt740] = l_28_;
				Class47.anInt740 = (Class47.anInt740 + 1) % 100;
				RSString class16 = Class38_Sub7_Sub1.method1094(i_30_, i + -20043).method752(Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711, i + -20044);
				if (i_29_ != 2 && i_29_ != 3) {
					if (i_29_ != 1) {
						Class89.method1433(20, i_30_, class16, Class83.method1376(i ^ ~0x4e4c, l_25_).method154((byte) 59), Class83.method1376(-1, l).method154((byte) 59), (byte) -103);
					} else {
						Class89.method1433(20, i_30_, class16, Class83.method1376(-1, l_25_).method154((byte) 59), Class23_Sub4_Sub14.method322(new RSString[] { Class33.aClass16_519, Class83.method1376(-1, l).method154((byte) 59) }, i ^ ~0x4e0c), (byte) -126);
					}
				} else {
					Class89.method1433(20, i_30_, class16, Class83.method1376(-1, l_25_).method154((byte) 59), Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub7.aClass16_2203, Class83.method1376(-1, l).method154((byte) 59) }, i + -20069), (byte) -115);
				}
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 34) {
			int i_33_ = Class23_Sub4_Sub2.anInt2925 + Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.position;
			int i_34_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -126);
			int i_35_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -128);
			if ((Class69.anInt1218 ^ 0xffffffff) != (i_34_ ^ 0xffffffff)) {
				Class69.anInt1218 = i_34_;
				Class6.method76(15532, Class69.anInt1218);
				Class23_Sub13_Sub20.method821((byte) -60);
				Class23_Sub4_Sub12.method313(Class69.anInt1218, true);
				for (int i_36_ = 0; i_36_ < 100; i_36_++)
					Class23_Sub4_Sub23_Sub1.aBooleanArray4478[i_36_] = true;
			}
			while (i_35_-- > 0) {
				int i_37_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method472(0);
				int i_38_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -117);
				int i_39_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
				Class23_Sub25 class23_sub25 = (Class23_Sub25) Class36.anOa565.a((byte) 109, (long) i_37_);
				if (class23_sub25 != null && (class23_sub25.anInt2456 ^ 0xffffffff) != (i_38_ ^ 0xffffffff)) {
					Applet_Sub1.method27(true, -28361, class23_sub25);
					class23_sub25 = null;
				}
				if (class23_sub25 == null) {
					class23_sub25 = oa.a(i_39_, i_38_, i_37_, i + -42046);
				}
				class23_sub25.aBoolean2462 = true;
			}
			for (Class23_Sub25 class23_sub25 = (Class23_Sub25) Class36.anOa565.a((byte) -25); class23_sub25 != null; class23_sub25 = (Class23_Sub25) Class36.anOa565.a(true)) {
				if (class23_sub25.aBoolean2462) {
					class23_sub25.aBoolean2462 = false;
				} else {
					Applet_Sub1.method27(true, -28361, class23_sub25);
				}
			}
			Class47.anOa722 = new oa(512);
			while (Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.position < i_33_) {
				int i_40_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method472(-83);
				int i_41_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -105);
				int i_42_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -120);
				int i_43_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method472(-88);
				for (int i_44_ = i_41_; (i_42_ ^ 0xffffffff) <= (i_44_ ^ 0xffffffff); i_44_++) {
					long l = (long) i_44_ + ((long) i_40_ << 32);
					Class47.anOa722.a(new Class23_Sub20(i_43_), (byte) -14, l);
				}
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 47) {
			Class23_Sub13_Sub17.anInt4077 = 0;
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 99) {
			int i_45_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method441(-39);
			RSString class16 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method426(2);
			Class64 class64 = Class23_Sub24.method905(i_45_, (byte) 111);
			if (!class16.method183(class64.aClass16_1070, (byte) -49)) {
				class64.aClass16_1070 = class16;
				Class91.method1450((byte) 29, class64);
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 52) {
			Class23_Sub4_Sub7.anInt3026 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			Class105.anInt1808 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method473(-124);
			while ((Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.position ^ 0xffffffff) > (Class23_Sub4_Sub2.anInt2925 ^ 0xffffffff)) {
				Class23_Sub13_Sub24.anInt4275 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(i + -1797833796);
				Class35.method985(66);
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 13) {
			Buffer.aBoolean2159 = true;
			Class23_Sub13_Sub10.anInt3868 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			Class23_Sub13_Sub14.anInt4006 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			Class23_Sub4_Sub24.anInt3300 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -98);
			Class23_Sub10_Sub2.anInt3625 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			Class23_Sub4_Sub31.anInt3396 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			if (Class23_Sub4_Sub31.anInt3396 >= 100) {
				int i_46_ = 64 + Class23_Sub13_Sub10.anInt3868 * 128;
				int i_47_ = Class23_Sub13_Sub14.anInt4006 * 128 - -64;
				int i_48_ = Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, i_46_, i_47_, (byte) -38) + -Class23_Sub4_Sub24.anInt3300;
				int i_49_ = -Class23_Sub13_Sub1.anInt3673 + i_46_;
				int i_50_ = i_47_ - Class53.anInt838;
				int i_51_ = i_48_ + -Class23_Sub23.anInt2424;
				int i_52_ = (int) Math.sqrt((double) (i_49_ * i_49_ + i_50_ * i_50_));
				Class23_Sub4_Sub17.anInt3178 = 0x7ff & (int) (325.949 * Math.atan2((double) i_51_, (double) i_52_));
				Class10.anInt208 = (int) (Math.atan2((double) i_49_, (double) i_50_) * -325.949) & 0x7ff;
				if (Class23_Sub4_Sub17.anInt3178 < 128) {
					Class23_Sub4_Sub17.anInt3178 = 128;
				}
				if (Class23_Sub4_Sub17.anInt3178 > 383) {
					Class23_Sub4_Sub17.anInt3178 = 383;
				}
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 248) {
			int i_53_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method441(i ^ ~0x4e10);
			int i_54_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -128);
			int i_55_ = i_54_ >> 5 & 0x1f;
			int i_56_ = 0x1f & i_54_ >> 10;
			int i_57_ = 0x1f & i_54_;
			int i_58_ = (i_57_ << 3) + (i_55_ << 11) + (i_56_ << 19);
			Class64 class64 = Class23_Sub24.method905(i_53_, (byte) 111);
			if ((i_58_ ^ 0xffffffff) != (class64.anInt1033 ^ 0xffffffff)) {
				class64.anInt1033 = i_58_;
				Class91.method1450((byte) 29, class64);
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 183) {
			long l = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method468(-114);
			Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method452(i + -16953716);
			long l_59_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method468(i ^ ~0x4e26);
			long l_60_ = (long) Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -122);
			long l_61_ = (long) Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method471(i + -19923);
			long l_62_ = (l_60_ << 32) + l_61_;
			int i_63_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			boolean bool = false;
		while_26_:
			do {
				for (int i_64_ = 0; i_64_ < 100; i_64_++) {
					if (l_62_ == Class29.aLongArray467[i_64_]) {
						bool = true;
						break while_26_;
					}
				}
				if (i_63_ <= 1) {
					if (Class67.anInt1176 == 1 || Class23_Sub4_Sub12.anInt3075 == 1) {
						bool = true;
					} else {
						for (int i_65_ = 0; (Class25.anInt383 ^ 0xffffffff) < (i_65_ ^ 0xffffffff); i_65_++) {
							if ((Class23_Sub4_Sub30.aLongArray3383[i_65_] ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
								bool = true;
								break;
							}
						}
					}
				}
			} while (false);
			if (!bool && Class23_Sub4_Sub39.anInt3519 == 0) {
				Class29.aLongArray467[Class47.anInt740] = l_62_;
				Class47.anInt740 = (1 + Class47.anInt740) % 100;
				RSString class16 = Class23_Sub13_Sub8.method674(Class23_Sub24.method900((byte) -80, Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711).method149(i ^ 0x4e4d));
				if (i_63_ != 2 && i_63_ != 3) {
					if (i_63_ == 1) {
						Class78.method1344(Class83.method1376(-1, l_59_).method154((byte) 59), class16, 9, Class23_Sub4_Sub14.method322(new RSString[] { Class33.aClass16_519, Class83.method1376(i + -20045, l).method154((byte) 59) }, i ^ ~0x4e7e), -1);
					} else {
						Class78.method1344(Class83.method1376(-1, l_59_).method154((byte) 59), class16, 9, Class83.method1376(-1, l).method154((byte) 59), -1);
					}
				} else {
					Class78.method1344(Class83.method1376(i + -20045, l_59_).method154((byte) 59), class16, 9, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub7.aClass16_2203, Class83.method1376(i + -20045, l).method154((byte) 59) }, -85), -1);
				}
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 239) {
			client.method36((byte) 102);
			int i_66_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method483(37);
			int i_67_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method458(i ^ 0x4e33);
			int i_68_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method435((byte) 79);
			Class51.anIntArray800[i_67_] = i_66_;
			Class105_Sub1.anIntArray2871[i_67_] = i_68_;
			Class23_Sub27.anIntArray2482[i_67_] = 1;
			for (int i_69_ = 0; i_69_ < 98; i_69_++) {
				if (i_66_ >= Class36.anIntArray567[i_69_]) {
					Class23_Sub27.anIntArray2482[i_67_] = i_69_ - -2;
				}
			}
			Class79.anIntArray1886[Class24.method919(Class89.anInt1524++, 31)] = i_67_;
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 246) {
			int i_70_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method433(-75);
			int i_71_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method442(125);
			oa.anIntArray1262[i_71_] = i_70_;
			if ((Class23_Sub4_Sub26.anIntArray3323[i_71_] ^ 0xffffffff) != (i_70_ ^ 0xffffffff)) {
				Class23_Sub4_Sub26.anIntArray3323[i_71_] = i_70_;
				Class71_Sub1_Sub1.method1276(16428, i_71_);
			}
			Class50.anIntArray780[Class24.method919(31, Class71.anInt1279++)] = i_71_;
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 228) {
			int i_72_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method442(123);
			int i_73_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(i ^ 0xb14c);
			Class23_Sub4_Sub37.anInt3492 = i_73_;
			Class35.anInt550 = i_72_;
			Class106.method1576((byte) 93);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 44) {
			Class23_Sub4_Sub31.method394(false, -101);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 58) {
			RSString class16 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method426(2);
			Object[] objects = new Object[class16.method171(i + -20105) - -1];
			for (int i_74_ = class16.method171(-61) + -1; (i_74_ ^ 0xffffffff) <= -1; i_74_--) {
				if (class16.method166((byte) 126, i_74_) == 115) {
					objects[1 + i_74_] = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method426(i + -20042);
				} else {
					objects[i_74_ + 1] = new Integer(Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method472(119));
				}
			}
			objects[0] = new Integer(Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method472(105));
			Class23_Sub9 class23_sub9 = new Class23_Sub9();
			class23_sub9.anObjectArray2274 = objects;
			Class91.method1452(class23_sub9, (byte) -103);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 114) {
			long l = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method468(-110);
			int i_75_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -110);
			byte b = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method452(-16933672);
			boolean bool = false;
			if ((~0x7fffffffffffffffL & l ^ 0xffffffffffffffffL) != -1L) {
				bool = true;
			}
			if (bool) {
				if (Class63.anInt986 == 0) {
					Class23_Sub13_Sub24.anInt4275 = -1;
					return true;
				}
				l &= 0x7fffffffffffffffL;
				boolean bool_76_ = false;
				int i_77_;
				for (i_77_ = 0; Class63.anInt986 > i_77_; i_77_++) {
					if ((Class68.aClass23_Sub19Array1186[i_77_].aLong358 ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL) && Class68.aClass23_Sub19Array1186[i_77_].anInt2376 == i_75_) {
						break;
					}
				}
				if ((i_77_ ^ 0xffffffff) > (Class63.anInt986 ^ 0xffffffff)) {
					for (/**/; i_77_ < Class63.anInt986 + -1; i_77_++)
						Class68.aClass23_Sub19Array1186[i_77_] = Class68.aClass23_Sub19Array1186[i_77_ - -1];
					Class63.anInt986--;
					Class68.aClass23_Sub19Array1186[Class63.anInt986] = null;
				}
			} else {
				RSString class16 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method426(2);
				Class23_Sub19 class23_sub19 = new Class23_Sub19();
				class23_sub19.aLong358 = l;
				class23_sub19.aClass16_2382 = Class83.method1376(-1, class23_sub19.aLong358);
				class23_sub19.aByte2391 = b;
				class23_sub19.aClass16_2379 = class16;
				class23_sub19.anInt2376 = i_75_;
				int i_78_;
				for (i_78_ = -1 + Class63.anInt986; (i_78_ ^ 0xffffffff) <= -1; i_78_--) {
					int i_79_ = Class68.aClass23_Sub19Array1186[i_78_].aClass16_2382.method151(true, class23_sub19.aClass16_2382);
					if (i_79_ == 0) {
						Class68.aClass23_Sub19Array1186[i_78_].anInt2376 = i_75_;
						Class68.aClass23_Sub19Array1186[i_78_].aByte2391 = b;
						Class68.aClass23_Sub19Array1186[i_78_].aClass16_2379 = class16;
						Class23_Sub13_Sub24.anInt4275 = -1;
						Class88.anInt1504 = Class23_Sub10_Sub2.anInt3589;
						if (l == Class88.aLong1501) {
							Class23_Sub4_Sub15.aByte3146 = b;
						}
						return true;
					}
					if (i_79_ < 0) {
						break;
					}
				}
				if (Class63.anInt986 >= Class68.aClass23_Sub19Array1186.length) {
					Class23_Sub13_Sub24.anInt4275 = -1;
					return true;
				}
				for (int i_80_ = -1 + Class63.anInt986; (i_80_ ^ 0xffffffff) < (i_78_ ^ 0xffffffff); i_80_--)
					Class68.aClass23_Sub19Array1186[i_80_ + 1] = Class68.aClass23_Sub19Array1186[i_80_];
				if (Class63.anInt986 == 0) {
					Class68.aClass23_Sub19Array1186 = new Class23_Sub19[100];
				}
				Class68.aClass23_Sub19Array1186[1 + i_78_] = class23_sub19;
				Class63.anInt986++;
				if (l == Class88.aLong1501) {
					Class23_Sub4_Sub15.aByte3146 = b;
				}
			}
			Class88.anInt1504 = Class23_Sub10_Sub2.anInt3589;
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 203) {
			Class23_Sub10_Sub2.aShort3603 = (short) Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(65280);
			if ((Class23_Sub10_Sub2.aShort3603 ^ 0xffffffff) >= -1) {
				Class23_Sub10_Sub2.aShort3603 = (short) 1;
			}
			Class23_Sub4_Sub35.aShort3456 = (short) Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(65280);
			if ((Class23_Sub4_Sub35.aShort3456 ^ 0xffffffff) < -1) {
				if ((Class23_Sub10_Sub2.aShort3598 ^ 0xffffffff) < (Class23_Sub4_Sub35.aShort3456 ^ 0xffffffff)) {
					Class23_Sub4_Sub35.aShort3456 = Class23_Sub10_Sub2.aShort3598;
				}
			} else {
				Class23_Sub4_Sub35.aShort3456 = (short) 32767;
			}
			Class23_Sub10_Sub2.aShort3598 = (short) Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(65280);
			if ((Class23_Sub10_Sub2.aShort3598 ^ 0xffffffff) >= -1) {
				Class23_Sub10_Sub2.aShort3598 = (short) 1;
			}
			Class38.aShort594 = (short) Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method442(123);
			Class23_Sub13_Sub24.anInt4275 = -1;
			if ((Class38.aShort594 ^ 0xffffffff) >= -1) {
				Class38.aShort594 = (short) 32767;
			} else if (Class23_Sub10_Sub2.aShort3603 > Class38.aShort594) {
				Class38.aShort594 = Class23_Sub10_Sub2.aShort3603;
			}
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 90) {
			Class105_Sub1.aClass16_2877 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method426(2);
			Class2.method51(Class105_Sub1.aClass16_2877, 0);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 197) {
			int i_81_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(65280);
			int i_82_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method441(115);
			Class64 class64 = Class23_Sub24.method905(i_82_, (byte) 111);
			if (class64 != null && class64.anInt1003 == 0) {
				if ((-class64.anInt999 + class64.anInt1088 ^ 0xffffffff) > (i_81_ ^ 0xffffffff)) {
					i_81_ = class64.anInt1088 + -class64.anInt999;
				}
				if ((i_81_ ^ 0xffffffff) > -1) {
					i_81_ = 0;
				}
				if ((i_81_ ^ 0xffffffff) != (class64.anInt1083 ^ 0xffffffff)) {
					class64.anInt1083 = i_81_;
					Class91.method1450((byte) 29, class64);
				}
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (i != 20044) {
			aClass16_2308 = null;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 150) {
			Class88.anInt1504 = Class23_Sub10_Sub2.anInt3589;
			long l = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method468(-108);
			if ((l ^ 0xffffffffffffffffL) == -1L) {
				Class23_Sub13_Sub24.anInt4275 = -1;
				Class68.aClass23_Sub19Array1186 = null;
				Class23_Sub4_Sub4.aClass16_2955 = null;
				Class23_Sub4_Sub7.aClass16_3007 = null;
				Class63.anInt986 = 0;
				return true;
			}
			long l_83_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method468(-99);
			Class23_Sub4_Sub7.aClass16_3007 = Class83.method1376(-1, l_83_);
			Class23_Sub4_Sub4.aClass16_2955 = Class83.method1376(i + -20045, l);
			Class23_Sub13_Sub24.aByte4280 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method452(-16933672);
			int i_84_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(i ^ ~0x6b283bbb);
			if (i_84_ == 255) {
				Class23_Sub13_Sub24.anInt4275 = -1;
				return true;
			}
			Class63.anInt986 = i_84_;
			Class23_Sub19[] class23_sub19s = new Class23_Sub19[100];
			for (int i_85_ = 0; (i_85_ ^ 0xffffffff) > (Class63.anInt986 ^ 0xffffffff); i_85_++) {
				class23_sub19s[i_85_] = new Class23_Sub19();
				class23_sub19s[i_85_].aLong358 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method468(-97);
				class23_sub19s[i_85_].aClass16_2382 = Class83.method1376(-1, class23_sub19s[i_85_].aLong358);
				class23_sub19s[i_85_].anInt2376 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -124);
				class23_sub19s[i_85_].aByte2391 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method452(i ^ ~0x1022d6b);
				class23_sub19s[i_85_].aClass16_2379 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method426(2);
				if (Class88.aLong1501 == class23_sub19s[i_85_].aLong358) {
					Class23_Sub4_Sub15.aByte3146 = class23_sub19s[i_85_].aByte2391;
				}
			}
			boolean bool = false;
			int i_86_ = Class63.anInt986;
			while ((i_86_ ^ 0xffffffff) < -1) {
				i_86_--;
				bool = true;
				for (int i_87_ = 0; i_87_ < i_86_; i_87_++) {
					if ((class23_sub19s[i_87_].aClass16_2382.method151(true, class23_sub19s[i_87_ + 1].aClass16_2382) ^ 0xffffffff) < -1) {
						bool = false;
						Class23_Sub19 class23_sub19 = class23_sub19s[i_87_];
						class23_sub19s[i_87_] = class23_sub19s[i_87_ - -1];
						class23_sub19s[i_87_ + 1] = class23_sub19;
					}
				}
				if (bool) {
					break;
				}
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			Class68.aClass23_Sub19Array1186 = class23_sub19s;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 75) {
			Class23_Sub13_Sub5.anInt3722 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(i + -1797833796);
			Class87_Sub3.anInt2820 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			Class38_Sub7_Sub1.anInt4368 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 39) {
			Buffer.aBoolean2159 = false;
			for (int i_88_ = 0; i_88_ < 5; i_88_++)
				Class23_Sub5_Sub1.aBooleanArray3531[i_88_] = false;
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 221) {
			for (int i_89_ = 0; (Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932.length ^ 0xffffffff) < (i_89_ ^ 0xffffffff); i_89_++) {
				if (Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_89_] != null) {
					Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_89_].anInt2693 = -1;
				}
			}
			for (int i_90_ = 0; (i_90_ ^ 0xffffffff) > (Class31.aClass38_Sub7_Sub1Array483.length ^ 0xffffffff); i_90_++) {
				if (Class31.aClass38_Sub7_Sub1Array483[i_90_] != null) {
					Class31.aClass38_Sub7_Sub1Array483[i_90_].anInt2693 = -1;
				}
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 202) {
			int i_91_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(i + 45236);
			int i_92_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method480((byte) 82);
			int i_93_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method483(56);
			Class64 class64 = Class23_Sub24.method905(i_93_, (byte) 111);
			Class23_Sub13_Sub24.anInt4275 = -1;
			class64.anInt1090 = (i_92_ << 16) - -i_91_;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 6) {
			int i_94_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method465((byte) -117);
			int i_95_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method458(126);
			int i_96_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(65280);
			Class23_Sub25 class23_sub25 = (Class23_Sub25) Class36.anOa565.a((byte) -33, (long) i_94_);
			if (class23_sub25 != null) {
				Applet_Sub1.method27(class23_sub25.anInt2456 != i_96_, i ^ ~0x2084, class23_sub25);
			}
			oa.a(i_95_, i_96_, i_94_, -22002);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 1) {
			Class106.anInt1819 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 102) {
			for (int i_97_ = 0; Class23_Sub4_Sub26.anIntArray3323.length > i_97_; i_97_++) {
				if ((Class23_Sub4_Sub26.anIntArray3323[i_97_] ^ 0xffffffff) != (oa.anIntArray1262[i_97_] ^ 0xffffffff)) {
					Class23_Sub4_Sub26.anIntArray3323[i_97_] = oa.anIntArray1262[i_97_];
					Class71_Sub1_Sub1.method1276(16428, i_97_);
					Class50.anIntArray780[Class24.method919(Class71.anInt1279++, 31)] = i_97_;
				}
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 81) {
			Class25.anInt383 = Class23_Sub4_Sub2.anInt2925 / 8;
			for (int i_98_ = 0; (i_98_ ^ 0xffffffff) > (Class25.anInt383 ^ 0xffffffff); i_98_++) {
				Class23_Sub4_Sub30.aLongArray3383[i_98_] = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method468(-120);
				Applet_Sub1.aClass16Array10[i_98_] = Class83.method1376(-1, Class23_Sub4_Sub30.aLongArray3383[i_98_]);
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			Class75.anInt1372 = Class23_Sub10_Sub2.anInt3589;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 33) {
			int i_99_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			if (Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(i + -1797833796) == 0) {
				Class23_Sub13_Sub19.aClass90Array4135[i_99_] = new Class90();
			} else {
				Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.position--;
				Class23_Sub13_Sub19.aClass90Array4135[i_99_] = new Class90(Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711);
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			Class39.anInt606 = Class23_Sub10_Sub2.anInt3589;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 104) {
			int i_100_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method472(125);
			int i_101_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -105);
			if ((i_100_ ^ 0xffffffff) > 69999) {
				i_101_ += 32768;
			}
			Class64 class64;
			if ((i_100_ ^ 0xffffffff) > -1) {
				class64 = null;
			} else {
				class64 = Class23_Sub24.method905(i_100_, (byte) 111);
			}
			if (class64 != null) {
				for (int i_102_ = 0; i_102_ < class64.anIntArray1028.length; i_102_++) {
					class64.anIntArray1028[i_102_] = 0;
					class64.anIntArray1147[i_102_] = 0;
				}
			}
			Class90.method1442(i_101_, 1);
			int i_103_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -128);
			for (int i_104_ = 0; (i_104_ ^ 0xffffffff) > (i_103_ ^ 0xffffffff); i_104_++) {
				int i_105_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method442(125);
				int i_106_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
				if (i_106_ == 255) {
					i_106_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method472(116);
				}
				if (class64 != null && (class64.anIntArray1028.length ^ 0xffffffff) < (i_104_ ^ 0xffffffff)) {
					class64.anIntArray1028[i_104_] = i_105_;
					class64.anIntArray1147[i_104_] = i_106_;
				}
				Class23_Sub4_Sub3.method282(i_104_, i_106_, i_105_ + -1, i_101_, -44);
			}
			if (class64 != null) {
				Class91.method1450((byte) 29, class64);
			}
			client.method36((byte) 102);
			Class82.anIntArray1454[Class24.method919(31, Class65.anInt1159++)] = Class24.method919(32767, i_101_);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 148) {
			if (Class69.anInt1218 != -1) {
				Class23_Sub13_Sub13.method757(Class69.anInt1218, 0, false);
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 67) {
			int i_107_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method442(123);
			int i_108_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method441(i + -20066);
			Class64 class64 = Class23_Sub24.method905(i_108_, (byte) 111);
			if (i_107_ == 65535) {
				i_107_ = -1;
			}
			if (class64.anInt1111 != 1 || (i_107_ ^ 0xffffffff) != (class64.anInt1091 ^ 0xffffffff)) {
				class64.anInt1091 = i_107_;
				class64.anInt1111 = 1;
				Class91.method1450((byte) 29, class64);
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 19) {
			int i_109_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method465((byte) -128);
			boolean bool = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752) == 1;
			Class64 class64 = Class23_Sub24.method905(i_109_, (byte) 111);
			if (!class64.aBoolean1135 == bool) {
				class64.aBoolean1135 = bool;
				Class91.method1450((byte) 29, class64);
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 92) {
			long l = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method468(-104);
			int i_110_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -127);
			RSString class16 = Class38_Sub7_Sub1.method1094(i_110_, 1).method752(Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711, 0);
			Class89.method1433(19, i_110_, class16, null, Class83.method1376(-1, l).method154((byte) 59), (byte) -108);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 174) {
			client.method36((byte) 102);
			Class36.anInt569 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method474(true);
			Class88.anInt1499 = Class23_Sub10_Sub2.anInt3589;
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 222) {
			int i_111_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -103);
			int i_112_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method458(127);
			if (i_112_ != 1) {
				if (i_112_ == 2) {
					Class23_Sub4_Sub22.method355((byte) -94);
					System.gc();
					Class103.method1521(25, i + 7128);
				}
			} else {
				Class23_Sub13_Sub1.method603();
				for (int i_113_ = 0; i_113_ < 4; i_113_++)
					Class4.aClass72Array85[i_113_].method1298(118);
				System.gc();
			}
			Class69.anInt1218 = i_111_;
			Class6.method76(15532, i_111_);
			Class23_Sub13_Sub20.method821((byte) -60);
			Class23_Sub4_Sub12.method313(Class69.anInt1218, true);
			for (int i_114_ = 0; i_114_ < 100; i_114_++)
				Class23_Sub4_Sub23_Sub1.aBooleanArray4478[i_114_] = true;
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 107) {
			int i_115_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			int i_116_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			int i_117_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			int i_118_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			int i_119_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -121);
			Class23_Sub5_Sub1.aBooleanArray3531[i_115_] = true;
			Class38_Sub5.anIntArray2597[i_115_] = i_116_;
			Class79.anIntArray1890[i_115_] = i_117_;
			Class78_Sub2.anIntArray2768[i_115_] = i_118_;
			Class23_Sub4_Sub14.anIntArray3128[i_115_] = i_119_;
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 50) {
			Class23_Sub13_Sub10.method700(i + -20044);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 182) {
			int i_120_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(i ^ ~0x6b283bbb);
			int i_121_ = i_120_ >> 6;
			Class10 class10 = new Class10();
			class10.anInt203 = 0x3f & i_120_;
			class10.anInt205 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			if ((class10.anInt205 ^ 0xffffffff) <= -1 && class10.anInt205 < Class23_Sub13_Sub4.aClass23_Sub13_Sub10Array3718.length) {
				if (class10.anInt203 == 1 || class10.anInt203 == 10) {
					class10.anInt209 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -101);
					Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.position += 3;
				} else if (class10.anInt203 >= 2 && class10.anInt203 <= 6) {
					if (class10.anInt203 == 2) {
						class10.anInt210 = 64;
						class10.anInt207 = 64;
					}
					if (class10.anInt203 == 3) {
						class10.anInt210 = 0;
						class10.anInt207 = 64;
					}
					if (class10.anInt203 == 4) {
						class10.anInt207 = 64;
						class10.anInt210 = 128;
					}
					if (class10.anInt203 == 5) {
						class10.anInt210 = 64;
						class10.anInt207 = 0;
					}
					if (class10.anInt203 == 6) {
						class10.anInt210 = 64;
						class10.anInt207 = 128;
					}
					class10.anInt203 = 2;
					class10.anInt211 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -123);
					class10.anInt212 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -109);
					class10.anInt204 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
				}
				class10.anInt213 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -110);
				if ((class10.anInt213 ^ 0xffffffff) == -65536) {
					class10.anInt213 = -1;
				}
				Class23_Sub27.aClass10Array2488[i_121_] = class10;
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 161) {
			for (int i_122_ = 0; (i_122_ ^ 0xffffffff) > (Class23_Sub10_Sub2.anInt3604 ^ 0xffffffff); i_122_++) {
				Class23_Sub13_Sub6 class23_sub13_sub6 = Class35.method978(-61, i_122_);
				if (class23_sub13_sub6 != null && (class23_sub13_sub6.anInt3725 ^ 0xffffffff) == -1) {
					oa.anIntArray1262[i_122_] = 0;
					Class23_Sub4_Sub26.anIntArray3323[i_122_] = 0;
				}
			}
			client.method36((byte) 102);
			Class71.anInt1279 += 32;
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 168) {
			int i_123_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(65280);
			int i_124_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method441(110);
			if (i_123_ == 65535) {
				i_123_ = -1;
			}
			int i_125_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method472(4);
			Class64 class64 = Class23_Sub24.method905(i_125_, (byte) 111);
			if (!class64.aBoolean1017) {
				if ((i_123_ ^ 0xffffffff) == 0) {
					Class23_Sub13_Sub24.anInt4275 = -1;
					class64.anInt1111 = 0;
					return true;
				}
				Class23_Sub13_Sub11 class23_sub13_sub11 = Class23_Sub13_Sub24.method853(-114, i_123_);
				class64.anInt1050 = 100 * class23_sub13_sub11.anInt3896 / i_124_;
				class64.anInt1110 = class23_sub13_sub11.anInt3947;
				class64.anInt1111 = 4;
				class64.anInt1091 = i_123_;
				class64.anInt1107 = class23_sub13_sub11.anInt3891;
				Class91.method1450((byte) 29, class64);
			} else {
				class64.anInt1134 = i_124_;
				class64.anInt1122 = i_123_;
				Class23_Sub13_Sub11 class23_sub13_sub11 = Class23_Sub13_Sub24.method853(-57, i_123_);
				class64.anInt1107 = class23_sub13_sub11.anInt3891;
				class64.anInt1015 = class23_sub13_sub11.anInt3922;
				class64.anInt1000 = class23_sub13_sub11.anInt3897;
				class64.anInt1074 = class23_sub13_sub11.anInt3899;
				class64.anInt1050 = class23_sub13_sub11.anInt3896;
				if ((class64.anInt1018 ^ 0xffffffff) < -1) {
					class64.anInt1050 = class64.anInt1050 * 32 / class64.anInt1018;
				} else if (class64.anInt1112 > 0) {
					class64.anInt1050 = class64.anInt1050 * 32 / class64.anInt1112;
				}
				class64.anInt1110 = class23_sub13_sub11.anInt3947;
				Class91.method1450((byte) 29, class64);
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 11) {
			long l = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method468(-89);
			RSString class16 = Class23_Sub13_Sub8.method674(Class23_Sub24.method900((byte) -80, Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711).method149(1));
			Class95.method1468(6, -1, class16, Class83.method1376(-1, l).method154((byte) 59));
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 233) {
			Class105.anInt1808 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			Class23_Sub4_Sub7.anInt3026 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method473(-122);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 96) {
			int i_126_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method472(-80);
			Class64 class64 = Class23_Sub24.method905(i_126_, (byte) 111);
			for (int i_127_ = 0; i_127_ < class64.anIntArray1028.length; i_127_++) {
				class64.anIntArray1028[i_127_] = -1;
				class64.anIntArray1028[i_127_] = 0;
			}
			Class91.method1450((byte) 29, class64);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 230) {
			Buffer.aBoolean2159 = true;
			RSString.anInt1950 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			Class23_Sub4_Sub22.anInt3262 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			Class28.anInt432 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -101);
			Class59.anInt913 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(i + -1797833796);
			Class42.anInt660 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(i ^ ~0x6b283bbb);
			if (Class42.anInt660 >= 100) {
				Class23_Sub13_Sub1.anInt3673 = 64 + RSString.anInt1950 * 128;
				Class53.anInt838 = 64 + 128 * Class23_Sub4_Sub22.anInt3262;
				Class23_Sub23.anInt2424 = Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, Class23_Sub13_Sub1.anInt3673, Class53.anInt838, (byte) -89) - Class28.anInt432;
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 124) {
			int i_128_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method442(126);
			int i_129_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method483(61);
			Class64 class64 = Class23_Sub24.method905(i_129_, (byte) 111);
			if ((i_128_ ^ 0xffffffff) == -65536) {
				i_128_ = -1;
			}
			if (class64.anInt1111 != 2 || i_128_ != class64.anInt1091) {
				class64.anInt1111 = 2;
				class64.anInt1091 = i_128_;
				Class91.method1450((byte) 29, class64);
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 207) {
			Class23_Sub4_Sub15.method326(true);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return false;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 160) {
			Class78.aShort1411 = (short) Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -103);
			if ((Class78.aShort1411 ^ 0xffffffff) >= -1) {
				Class78.aShort1411 = (short) 320;
			}
			Class48.aShort752 = (short) Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method442(i + -19917);
			Class23_Sub13_Sub24.anInt4275 = -1;
			if (Class48.aShort752 <= 0) {
				Class48.aShort752 = (short) 256;
			}
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 211) {
			Class71_Sub1_Sub1.method1271((byte) -126, Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 250) {
			int i_130_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method441(i + -20088);
			int i_131_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method442(i + -19919);
			oa.anIntArray1262[i_131_] = i_130_;
			if ((i_130_ ^ 0xffffffff) != (Class23_Sub4_Sub26.anIntArray3323[i_131_] ^ 0xffffffff)) {
				Class23_Sub4_Sub26.anIntArray3323[i_131_] = i_130_;
				Class71_Sub1_Sub1.method1276(16428, i_131_);
			}
			Class50.anIntArray780[Class24.method919(Class71.anInt1279++, 31)] = i_131_;
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 137) {
			Class23_Sub4_Sub13.anInt3098 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			Class23_Sub13_Sub24.anInt4275 = -1;
			Class75.anInt1372 = Class23_Sub10_Sub2.anInt3589;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 212) {
			int i_132_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -125);
			int i_133_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			if (i_132_ == 65535) {
				i_132_ = -1;
			}
			int i_134_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -120);
			Class24.method917(i_133_, i_134_, (byte) 65, i_132_);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 122) {
			int i_135_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method465((byte) -122);
			Class23_Sub13_Sub11.aClass60_3944 = Class23_Sub4_Sub3.aClass9_2939.method101(i + -20023, i_135_);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 82) {
			int i_136_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(65280);
			Class39.method1104(false, i_136_);
			Class82.anIntArray1454[Class24.method919(31, Class65.anInt1159++)] = Class24.method919(32767, i_136_);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 177) {
			Class23_Sub4_Sub31.method394(true, -103);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 191) {
			long l = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method468(-101);
			int i_137_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -108);
			int i_138_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			boolean bool = true;
			if (l < 0L) {
				bool = false;
				l &= 0x7fffffffffffffffL;
			}
			RSString class16 = Class23_Sub4_Sub38.aClass16_3509;
			if (i_137_ > 0) {
				class16 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method426(2);
			}
			RSString class16_139_ = Class83.method1376(-1, l).method154((byte) 59);
			for (int i_140_ = 0; (Class45.anInt696 ^ 0xffffffff) < (i_140_ ^ 0xffffffff); i_140_++) {
				if (Class68.aLongArray1187[i_140_] == l) {
					if (i_137_ != Class23_Sub10_Sub3.anIntArray3658[i_140_]) {
						Class23_Sub10_Sub3.anIntArray3658[i_140_] = i_137_;
						if (i_137_ > 0) {
							Class95.method1468(5, -1, Class23_Sub4_Sub14.method322(new RSString[] { class16_139_, Class28.aClass16_431 }, -57), Class23_Sub4_Sub38.aClass16_3509);
						}
						if (i_137_ == 0) {
							Class95.method1468(5, i + -20045, Class23_Sub4_Sub14.method322(new RSString[] { class16_139_, Class36.aClass16_566 }, i + -20053), Class23_Sub4_Sub38.aClass16_3509);
						}
					}
					class16_139_ = null;
					Class87_Sub3.aClass16Array2816[i_140_] = class16;
					Class11.anIntArray229[i_140_] = i_138_;
					Class104.aBooleanArray1741[i_140_] = bool;
					break;
				}
			}
			boolean bool_141_ = false;
			if (class16_139_ != null && Class45.anInt696 < 200) {
				Class68.aLongArray1187[Class45.anInt696] = l;
				Class23_Sub4_Sub14.aClass16Array3130[Class45.anInt696] = class16_139_;
				Class23_Sub10_Sub3.anIntArray3658[Class45.anInt696] = i_137_;
				Class87_Sub3.aClass16Array2816[Class45.anInt696] = class16;
				Class11.anIntArray229[Class45.anInt696] = i_138_;
				Class104.aBooleanArray1741[Class45.anInt696] = bool;
				Class45.anInt696++;
			}
			Class75.anInt1372 = Class23_Sub10_Sub2.anInt3589;
			int i_142_ = Class45.anInt696;
			while ((i_142_ ^ 0xffffffff) < -1) {
				i_142_--;
				bool_141_ = true;
				for (int i_143_ = 0; (i_143_ ^ 0xffffffff) > (i_142_ ^ 0xffffffff); i_143_++) {
					if ((Class23_Sub10_Sub3.anIntArray3658[i_143_] ^ 0xffffffff) != (Class19.anInt321 ^ 0xffffffff) && Class19.anInt321 == Class23_Sub10_Sub3.anIntArray3658[i_143_ - -1] || (Class23_Sub10_Sub3.anIntArray3658[i_143_] ^ 0xffffffff) == -1 && (Class23_Sub10_Sub3.anIntArray3658[i_143_ - -1] ^ 0xffffffff) != -1) {
						bool_141_ = false;
						int i_144_ = Class23_Sub10_Sub3.anIntArray3658[i_143_];
						Class23_Sub10_Sub3.anIntArray3658[i_143_] = Class23_Sub10_Sub3.anIntArray3658[i_143_ + 1];
						Class23_Sub10_Sub3.anIntArray3658[i_143_ - -1] = i_144_;
						RSString class16_145_ = Class87_Sub3.aClass16Array2816[i_143_];
						Class87_Sub3.aClass16Array2816[i_143_] = Class87_Sub3.aClass16Array2816[1 + i_143_];
						Class87_Sub3.aClass16Array2816[1 + i_143_] = class16_145_;
						RSString class16_146_ = Class23_Sub4_Sub14.aClass16Array3130[i_143_];
						Class23_Sub4_Sub14.aClass16Array3130[i_143_] = Class23_Sub4_Sub14.aClass16Array3130[1 + i_143_];
						Class23_Sub4_Sub14.aClass16Array3130[i_143_ - -1] = class16_146_;
						long l_147_ = Class68.aLongArray1187[i_143_];
						Class68.aLongArray1187[i_143_] = Class68.aLongArray1187[1 + i_143_];
						Class68.aLongArray1187[1 + i_143_] = l_147_;
						int i_148_ = Class11.anIntArray229[i_143_];
						Class11.anIntArray229[i_143_] = Class11.anIntArray229[i_143_ + 1];
						Class11.anIntArray229[i_143_ - -1] = i_148_;
						boolean bool_149_ = Class104.aBooleanArray1741[i_143_];
						Class104.aBooleanArray1741[i_143_] = Class104.aBooleanArray1741[1 + i_143_];
						Class104.aBooleanArray1741[1 + i_143_] = bool_149_;
					}
				}
				if (bool_141_) {
					break;
				}
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 247) {
			RSString class16 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method426(2);
			int i_150_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method458(126);
			int i_151_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method435((byte) 112);
			if (i_150_ >= 1 && i_150_ <= 8) {
				if (class16.method140(Class23_Sub4_Sub30.aClass16_3378, 40)) {
					class16 = null;
				}
				Class23_Sub23.aClass16Array2432[i_150_ - 1] = class16;
				aBooleanArray2317[i_150_ + -1] = (i_151_ ^ 0xffffffff) == -1;
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 89) {
			RSString class16 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method426(2);
			if (!class16.method162(Class57.aClass16_900, 0)) {
				if (!class16.method162(Class87_Sub1.aClass16_2780, 0)) {
					if (!class16.method162(RSString.aClass16_1952, 0)) {
						if (!class16.method162(Class72.aClass16_1294, 0)) {
							if (!class16.method162(Class47.aClass16_742, 0)) {
								if (!class16.method162(Canvas_Sub1.aClass16_47, 0)) {
									if (!class16.method162(Class23_Sub4_Sub23.aClass16_3275, 0)) {
										if (class16.method162(Class2.aClass16_78, 0)) {
											boolean bool = false;
											RSString class16_152_ = class16.method148(class16.method173(122, Class23_Sub13_Sub24.aClass16_4276), 0, true);
											long l = class16_152_.method184(-46);
											for (int i_153_ = 0; (i_153_ ^ 0xffffffff) > (Class25.anInt383 ^ 0xffffffff); i_153_++) {
												if (l == Class23_Sub4_Sub30.aLongArray3383[i_153_]) {
													bool = true;
													break;
												}
											}
											if (!bool && Class23_Sub4_Sub39.anInt3519 == 0) {
												Class95.method1468(15, -1, Class23_Sub4_Sub38.aClass16_3509, class16_152_);
											}
										} else if (!class16.method162(Class71_Sub1.aClass16_2728, 0)) {
											Class95.method1468(0, -1, class16, Class23_Sub4_Sub38.aClass16_3509);
										} else {
											RSString class16_154_ = class16.method148(class16.method173(109, Class23_Sub13_Sub24.aClass16_4276), 0, true);
											boolean bool = false;
											long l = class16_154_.method184(-27);
											for (int i_155_ = 0; (Class25.anInt383 ^ 0xffffffff) < (i_155_ ^ 0xffffffff); i_155_++) {
												if (l == Class23_Sub4_Sub30.aLongArray3383[i_155_]) {
													bool = true;
													break;
												}
											}
											if (!bool && Class23_Sub4_Sub39.anInt3519 == 0) {
												Class95.method1468(16, i ^ ~0x4e4c, Class23_Sub4_Sub38.aClass16_3509, class16_154_);
											}
										}
									} else {
										RSString class16_156_ = class16.method148(class16.method173(115, Class23_Sub13_Sub24.aClass16_4276), 0, true);
										long l = class16_156_.method184(i ^ ~0x4e60);
										boolean bool = false;
										for (int i_157_ = 0; Class25.anInt383 > i_157_; i_157_++) {
											if (Class23_Sub4_Sub30.aLongArray3383[i_157_] == l) {
												bool = true;
												break;
											}
										}
										if (!bool && Class23_Sub4_Sub39.anInt3519 == 0) {
											Class95.method1468(14, -1, Class23_Sub4_Sub38.aClass16_3509, class16_156_);
										}
									}
								} else {
									RSString class16_158_ = class16.method148(class16.method173(35, Canvas_Sub1.aClass16_47), 0, true);
									if (Class23_Sub4_Sub39.anInt3519 == 0) {
										Class95.method1468(13, -1, class16_158_, Class23_Sub4_Sub38.aClass16_3509);
									}
								}
							} else {
								RSString class16_159_ = class16.method148(class16.method173(91, Class47.aClass16_742), 0, true);
								if (Class23_Sub4_Sub39.anInt3519 == 0) {
									Class95.method1468(12, -1, class16_159_, Class23_Sub4_Sub38.aClass16_3509);
								}
							}
						} else {
							RSString class16_160_ = class16.method148(class16.method173(i + -19978, Class72.aClass16_1294), 0, true);
							Class95.method1468(11, -1, class16_160_, Class23_Sub4_Sub38.aClass16_3509);
						}
					} else {
						RSString class16_161_ = class16.method148(class16.method173(98, Class23_Sub13_Sub24.aClass16_4276), 0, true);
						long l = class16_161_.method184(78);
						boolean bool = false;
						for (int i_162_ = 0; Class25.anInt383 > i_162_; i_162_++) {
							if ((l ^ 0xffffffffffffffffL) == (Class23_Sub4_Sub30.aLongArray3383[i_162_] ^ 0xffffffffffffffffL)) {
								bool = true;
								break;
							}
						}
						if (!bool && (Class23_Sub4_Sub39.anInt3519 ^ 0xffffffff) == -1) {
							Class95.method1468(10, -1, Class23_Sub4_Sub38.aClass16_3509, class16_161_);
						}
					}
				} else {
					RSString class16_163_ = class16.method148(class16.method173(114, Class23_Sub13_Sub24.aClass16_4276), 0, true);
					long l = class16_163_.method184(i ^ 0x4e0b);
					boolean bool = false;
					for (int i_164_ = 0; (Class25.anInt383 ^ 0xffffffff) < (i_164_ ^ 0xffffffff); i_164_++) {
						if (l == Class23_Sub4_Sub30.aLongArray3383[i_164_]) {
							bool = true;
							break;
						}
					}
					if (!bool && (Class23_Sub4_Sub39.anInt3519 ^ 0xffffffff) == -1) {
						RSString class16_165_ = class16.method148(-9 + class16.method171(-61), class16.method173(71, Class23_Sub13_Sub24.aClass16_4276) - -1, true);
						Class95.method1468(8, i ^ ~0x4e4c, class16_165_, class16_163_);
					}
				}
			} else {
				RSString class16_166_ = class16.method148(class16.method173(125, Class23_Sub13_Sub24.aClass16_4276), 0, true);
				long l = class16_166_.method184(-113);
				boolean bool = false;
				for (int i_167_ = 0; (i_167_ ^ 0xffffffff) > (Class25.anInt383 ^ 0xffffffff); i_167_++) {
					if (l == Class23_Sub4_Sub30.aLongArray3383[i_167_]) {
						bool = true;
						break;
					}
				}
				if (!bool && Class23_Sub4_Sub39.anInt3519 == 0) {
					Class95.method1468(4, -1, Class23_Sub13_Sub14.aClass16_4009, class16_166_);
				}
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 232) {
			long l = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method468(-112);
			long l_168_ = (long) Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -113);
			long l_169_ = (long) Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method471(123);
			int i_170_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			boolean bool = false;
			long l_171_ = l_169_ + (l_168_ << 32);
		while_27_:
			do {
				for (int i_172_ = 0; i_172_ < 100; i_172_++) {
					if (Class29.aLongArray467[i_172_] == l_171_) {
						bool = true;
						break while_27_;
					}
				}
				if (i_170_ <= 1) {
					if (Class67.anInt1176 == 1 || Class23_Sub4_Sub12.anInt3075 == 1) {
						bool = true;
					} else {
						for (int i_173_ = 0; i_173_ < Class25.anInt383; i_173_++) {
							if ((Class23_Sub4_Sub30.aLongArray3383[i_173_] ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
								bool = true;
								break;
							}
						}
					}
				}
			} while (false);
			if (!bool && (Class23_Sub4_Sub39.anInt3519 ^ 0xffffffff) == -1) {
				Class29.aLongArray467[Class47.anInt740] = l_171_;
				Class47.anInt740 = (Class47.anInt740 + 1) % 100;
				RSString class16 = Class23_Sub13_Sub8.method674(Class23_Sub24.method900((byte) -80, Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711).method149(1));
				if (i_170_ != 2 && i_170_ != 3) {
					if (i_170_ != 1) {
						Class95.method1468(3, -1, class16, Class83.method1376(i ^ ~0x4e4c, l).method154((byte) 59));
					} else {
						Class95.method1468(7, -1, class16, Class23_Sub4_Sub14.method322(new RSString[] { Class33.aClass16_519, Class83.method1376(-1, l).method154((byte) 59) }, -39));
					}
				} else {
					Class95.method1468(7, -1, class16, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub7.aClass16_2203, Class83.method1376(-1, l).method154((byte) 59) }, -83));
				}
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 130) {
			long l = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method468(-121);
			long l_174_ = (long) Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -116);
			long l_175_ = (long) Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method471(i ^ 0x4e18);
			int i_176_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			int i_177_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -102);
			long l_178_ = (l_174_ << 32) + l_175_;
			boolean bool = false;
		while_28_:
			do {
				for (int i_179_ = 0; i_179_ < 100; i_179_++) {
					if (l_178_ == Class29.aLongArray467[i_179_]) {
						bool = true;
						break while_28_;
					}
				}
				if (i_176_ <= 1) {
					for (int i_180_ = 0; Class25.anInt383 > i_180_; i_180_++) {
						if (Class23_Sub4_Sub30.aLongArray3383[i_180_] == l) {
							bool = true;
							break;
						}
					}
				}
			} while (false);
			if (!bool && Class23_Sub4_Sub39.anInt3519 == 0) {
				Class29.aLongArray467[Class47.anInt740] = l_178_;
				Class47.anInt740 = (Class47.anInt740 + 1) % 100;
				RSString class16 = Class38_Sub7_Sub1.method1094(i_177_, 1).method752(Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711, 0);
				if (i_176_ != 2) {
					if (i_176_ != 1) {
						Class89.method1433(18, i_177_, class16, null, Class83.method1376(-1, l).method154((byte) 59), (byte) -103);
					} else {
						Class89.method1433(18, i_177_, class16, null, Class23_Sub4_Sub14.method322(new RSString[] { Class33.aClass16_519, Class83.method1376(-1, l).method154((byte) 59) }, -53), (byte) -106);
					}
				} else {
					Class89.method1433(18, i_177_, class16, null, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub7.aClass16_2203, Class83.method1376(i ^ ~0x4e4c, l).method154((byte) 59) }, -51), (byte) -101);
				}
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 167) {
			int i_181_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method472(-103);
			Class23_Sub25 class23_sub25 = (Class23_Sub25) Class36.anOa565.a((byte) -110, (long) i_181_);
			if (class23_sub25 != null) {
				Applet_Sub1.method27(true, -28361, class23_sub25);
			}
			if (Class23_Sub13_Sub14.aClass64_4007 != null) {
				Class91.method1450((byte) 29, Class23_Sub13_Sub14.aClass64_4007);
				Class23_Sub13_Sub14.aClass64_4007 = null;
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 103) {
			int i_182_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method435((byte) 105);
			int i_183_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method480((byte) 82);
			int i_184_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(65280);
			Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[i_184_];
			if (class38_sub7_sub1 != null) {
				Class57.method1191(i_183_, class38_sub7_sub1, i_182_, -1);
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 64) {
			int i_185_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method474(true);
			int i_186_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method472(124);
			int i_187_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method474(true);
			Class64 class64 = Class23_Sub24.method905(i_186_, (byte) 111);
			class64.aByte1151 = (byte) 0;
			class64.anInt1120 = class64.anInt1124 = i_187_;
			class64.anInt1126 = class64.anInt1097 = i_185_;
			class64.aByte1142 = (byte) 0;
			Class91.method1450((byte) 29, class64);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 147) {
			Class87.aShort1484 = (short) Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method442(125);
			if (Class87.aShort1484 <= 0) {
				Class87.aShort1484 = (short) 256;
			}
			Class23_Sub13_Sub12.aShort3971 = (short) Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(65280);
			if ((Class23_Sub13_Sub12.aShort3971 ^ 0xffffffff) >= -1) {
				Class23_Sub13_Sub12.aShort3971 = (short) 205;
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 126) {
			int i_188_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method465((byte) -124);
			Class64 class64 = Class23_Sub24.method905(i_188_, (byte) 111);
			class64.anInt1111 = 3;
			class64.anInt1091 = Class105.aClass38_Sub7_Sub2_1812.aClass51_4393.method1167(64);
			Class91.method1450((byte) 29, class64);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 110) {
			int i_189_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method458(125);
			int i_190_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(-1797813752);
			int i_191_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method435((byte) 125);
			Class23_Sub13_Sub11.anInt3916 = i_189_ >> 1;
			Class105.aClass38_Sub7_Sub2_1812.method1085(i_190_, (byte) 9, (i_189_ & 0x1) == 1, i_191_);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 159) {
			int i_192_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method472(-127);
			int i_193_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -123);
			if (i_192_ < -70000) {
				i_193_ += 32768;
			}
			Class64 class64;
			if (i_192_ >= 0) {
				class64 = Class23_Sub24.method905(i_192_, (byte) 111);
			} else {
				class64 = null;
			}
			while (Class23_Sub4_Sub2.anInt2925 > Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.position) {
				int i_194_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method432((byte) 55);
				int i_195_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -127);
				int i_196_ = 0;
				if ((i_195_ ^ 0xffffffff) != -1) {
					i_196_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method461(i ^ ~0x6b283bbb);
					if (i_196_ == 255) {
						i_196_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method472(123);
					}
				}
				if (class64 != null && (i_194_ ^ 0xffffffff) <= -1 && (class64.anIntArray1028.length ^ 0xffffffff) < (i_194_ ^ 0xffffffff)) {
					class64.anIntArray1028[i_194_] = i_195_;
					class64.anIntArray1147[i_194_] = i_196_;
				}
				Class23_Sub4_Sub3.method282(i_194_, i_196_, i_195_ - 1, i_193_, 68);
			}
			if (class64 != null) {
				Class91.method1450((byte) 29, class64);
			}
			client.method36((byte) 102);
			Class82.anIntArray1454[Class24.method919(31, Class65.anInt1159++)] = Class24.method919(32767, i_193_);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 146) {
			int i_197_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method472(104);
			int i_198_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method472(i + -19942);
			Class23_Sub25 class23_sub25 = (Class23_Sub25) Class36.anOa565.a((byte) -95, (long) i_197_);
			Class23_Sub25 class23_sub25_199_ = (Class23_Sub25) Class36.anOa565.a((byte) -96, (long) i_198_);
			if (class23_sub25_199_ != null) {
				Applet_Sub1.method27(class23_sub25 == null || class23_sub25.anInt2456 != class23_sub25_199_.anInt2456, -28361, class23_sub25_199_);
			}
			if (class23_sub25 != null) {
				class23_sub25.method228(0);
				Class36.anOa565.a(class23_sub25, (byte) -14, (long) i_198_);
			}
			Class64 class64 = Class23_Sub24.method905(i_197_, (byte) 111);
			if (class64 != null) {
				Class91.method1450((byte) 29, class64);
			}
			class64 = Class23_Sub24.method905(i_198_, (byte) 111);
			if (class64 != null) {
				Class91.method1450((byte) 29, class64);
			}
			if (Class69.anInt1218 != -1) {
				Class23_Sub13_Sub13.method757(Class69.anInt1218, 1, false);
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 118) {
			Class105.anInt1808 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method435((byte) 113);
			Class23_Sub4_Sub7.anInt3026 = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method435((byte) 112);
			for (int i_200_ = Class23_Sub4_Sub7.anInt3026; i_200_ < 8 + Class23_Sub4_Sub7.anInt3026; i_200_++) {
				for (int i_201_ = Class105.anInt1808; Class105.anInt1808 - -8 > i_201_; i_201_++) {
					if (Class82.aClass89ArrayArrayArray1453[Class23_Sub13_Sub11.anInt3916][i_200_][i_201_] != null) {
						Class82.aClass89ArrayArrayArray1453[Class23_Sub13_Sub11.anInt3916][i_200_][i_201_] = null;
						Class44.method1129(i_200_, i_201_, (byte) 119);
					}
				}
			}
			for (Class23_Sub23 class23_sub23 = (Class23_Sub23) Class8.aClass89_178.method1437(79); class23_sub23 != null; class23_sub23 = (Class23_Sub23) Class8.aClass89_178.method1431((byte) -89)) {
				if ((Class23_Sub4_Sub7.anInt3026 ^ 0xffffffff) >= (class23_sub23.anInt2430 ^ 0xffffffff) && class23_sub23.anInt2430 < Class23_Sub4_Sub7.anInt3026 - -8 && Class105.anInt1808 <= class23_sub23.anInt2433 && (Class105.anInt1808 - -8 ^ 0xffffffff) < (class23_sub23.anInt2433 ^ 0xffffffff) && Class23_Sub13_Sub11.anInt3916 == class23_sub23.anInt2423) {
					class23_sub23.anInt2437 = 0;
				}
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 7) {
			Class2.method50(Class23_Sub4_Sub2.anInt2925, Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711, 116, Class23_Sub4_Sub3.aClass9_2939);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 178) {
			int i_202_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method465((byte) -125);
			int i_203_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method472(i + -19933);
			int i_204_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method442(125);
			if ((i_204_ ^ 0xffffffff) == -65536) {
				i_204_ = -1;
			}
			int i_205_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method453(65280);
			if ((i_205_ ^ 0xffffffff) == -65536) {
				i_205_ = -1;
			}
			for (int i_206_ = i_204_; (i_206_ ^ 0xffffffff) >= (i_205_ ^ 0xffffffff); i_206_++) {
				long l = ((long) i_202_ << 32) + (long) i_206_;
				Class23 class23 = Class47.anOa722.a((byte) 116, l);
				if (class23 != null) {
					class23.method228(0);
				}
				Class47.anOa722.a(new Class23_Sub20(i_203_), (byte) -14, l);
			}
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 172) {
			int i_207_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method480((byte) 82);
			if ((i_207_ ^ 0xffffffff) == -65536) {
				i_207_ = -1;
			}
			Class23_Sub13_Sub2.method610(i_207_, (byte) 106);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		if (Class23_Sub13_Sub24.anInt4275 == 132) {
			int i_208_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method475(true);
			int i_209_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method476((byte) -104);
			if (i_209_ == 65535) {
				i_209_ = -1;
			}
			Class36.method990((byte) 106, i_208_, i_209_);
			Class23_Sub13_Sub24.anInt4275 = -1;
			return true;
		}
		Class26.method925(95, null, "T1 - " + Class23_Sub13_Sub24.anInt4275 + "," + Class25.anInt388 + "," + Class25.anInt379 + " - " + Class23_Sub4_Sub2.anInt2925);
		Class23_Sub4_Sub15.method326(true);
		return true;
	}
	
	public static void method600(int i) {
		aClass105_2312 = null;
		aClass16_2306 = null;
		aClass84_2307 = null;
		if (i != -1399) {
			anInt2316 = -29;
		}
		aClass16_2313 = null;
		aClass16_2311 = null;
		aBooleanArray2317 = null;
		aClass16_2308 = null;
	}
	
	final void method601(boolean bool) {
		if (bool == false) {
			anInt2315++;
			if (aClass23_Sub13_2314 != null) {
				aClass23_Sub13_2314.aClass23_Sub13_2310 = aClass23_Sub13_2310;
				aClass23_Sub13_2310.aClass23_Sub13_2314 = aClass23_Sub13_2314;
				aClass23_Sub13_2310 = null;
				aClass23_Sub13_2314 = null;
			}
		}
	}
	
	static final void method602(int i) {
		int i_210_ = 119 % ((48 - i) / 63);
		anInt2319++;
		Class38.aClass5_584.method68(0);
		Class23_Sub14.aClass81_2325.method1369((byte) 124);
	}
	
	public Class23_Sub13() {
		/* empty */
	}
	
	static {
		aClass16_2308 = Class38_Sub6.method1076((byte) 86, "go back to the main RuneScape webpage");
		anInt2316 = 0;
		aClass16_2306 = aClass16_2308;
		aBooleanArray2317 = new boolean[8];
	}
}

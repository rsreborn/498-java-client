/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;
import java.net.Socket;
import java.util.GregorianCalendar;

public class client extends Applet_Sub1
{
	static int anInt1954;
	static Class105 aClass105_1955;
	static int anInt1956;
	static int anInt1957;
	static int anInt1958;
	static int anInt1959;
	static int anInt1960;
	static RSString aClass16_1961 = Class38_Sub6.method1076((byte) 86, "m");
	static int anInt1962;
	static int anInt1963;
	static int anInt1964;
	static Class23_Sub15 aClass23_Sub15_1965 = new Class23_Sub15(0, 0);
	static int anInt1966;
	static int anInt1967;
	static int anInt1968;
	static int anInt1969;
	static int anInt1970;
	static Class23_Sub13_Sub10[] aClass23_Sub13_Sub10Array1971;
	private static RSString aClass16_1972;
	static int anInt1973;
	static int anInt1974;
	static RSString aClass16_1975 = Class38_Sub6.method1076((byte) 86, "(U0a )2 non)2existant gosub script)2num: ");
	static RSString aClass16_1976;
	static RSString aClass16_1977 = Class38_Sub6.method1076((byte) 86, "Lade Konfiguration )2 ");
	static Class23_Sub13_Sub8 aClass23_Sub13_Sub8_1978;
	static RSString aClass16_1979;
	
	public static final void main(String[] strings) {
		try {
			if (strings.length != 7) {
				Class23_Sub13_Sub6.method628(true);
			}
			Class19.anInt321 = Integer.parseInt(strings[0]);
			if (!strings[1].equals("live")) {
				if (!strings[1].equals("office")) {
					if (strings[1].equals("local")) {
						Class23_Sub8.anInt2250 = 2;
					} else {
						Class23_Sub13_Sub6.method628(true);
					}
				} else {
					Class23_Sub8.anInt2250 = 1;
				}
			} else {
				Class23_Sub8.anInt2250 = 0;
			}
			if (!strings[2].equals("live")) {
				if (strings[2].equals("rc")) {
					Class23_Sub4_Sub23.anInt3280 = 1;
				} else if (!strings[2].equals("wip")) {
					Class23_Sub13_Sub6.method628(true);
				} else {
					Class23_Sub4_Sub23.anInt3280 = 2;
				}
			} else {
				Class23_Sub4_Sub23.anInt3280 = 0;
			}
			if (!strings[3].equals("lowmem")) {
				if (!strings[3].equals("highmem")) {
					Class23_Sub13_Sub6.method628(true);
				} else {
					Class71_Sub2.method1278(true);
				}
			} else {
				Class23_Sub23.method898(112);
			}
			if (!strings[4].equals("free")) {
				if (!strings[4].equals("members")) {
					Class23_Sub13_Sub6.method628(true);
				} else {
					Class75.aBoolean1378 = true;
				}
			} else {
				Class75.aBoolean1378 = false;
			}
			if (strings[5].equals("english")) {
				Class23_Sub13_Sub15.anInt4036 = 0;
			} else if (strings[5].equals("german")) {
				Class90.method1446(-123);
				Class23_Sub13_Sub15.anInt4036 = 1;
			} else {
				Class23_Sub13_Sub6.method628(true);
			}
			if (strings[6].equals("game0")) {
				Class23_Sub4_Sub29.anInt3369 = 0;
			} else if (strings[6].equals("game1")) {
				Class23_Sub4_Sub29.anInt3369 = 1;
			} else {
				Class23_Sub13_Sub6.method628(true);
			}
			Class23_Sub13_Sub9.anInt3857 = 0;
			CacheArchive.aClass16_2877 = Class23_Sub4_Sub38.aClass16_3509;
			Class23_Sub4_Sub34.aString3444 = "127.0.0.1";
			client var_client = new client();
			var_client.method15(32 - -Class23_Sub4_Sub23.anInt3280, 498, 26, 765, "runescape", true, 503);
			Class23_Sub19.aFrame2385.setLocation(40, 40);
		} catch (Exception exception) {
			Class26.method925(95, exception, null);
		}
		anInt1966++;
	}
	
	private final void method34(boolean bool) {
		anInt1970++;
		if (Class49.anInt756 != 1000) {
			boolean bool_0_ = Class23_Sub13_Sub18.method795((byte) -98);
			if (!bool_0_) {
				method39(true);
			}
			if (bool != true) {
				method36((byte) -54);
			}
		}
	}
	
	final void method17(int i) {
		Class89.anInt1511++;
		if (i != 45) {
			aClass16_1979 = null;
		}
		anInt1968++;
		if (Class89.anInt1511 % 1000 == 1) {
			GregorianCalendar gregoriancalendar = new GregorianCalendar();
			Class98.anInt1650 = gregoriancalendar.get(11) * 600 - (-(gregoriancalendar.get(12) * 10) - gregoriancalendar.get(13) / 6);
			Class23_Sub13_Sub19.aRandom4110.setSeed((long) Class98.anInt1650);
		}
		method34(true);
		Class23_Sub21.method891(1);
		Class87_Sub3.method1417((byte) 114);
		Class48.method1150((byte) 92);
		Class23.method230((byte) 122);
		Class6.method84(true);
		if (Class23_Sub4_Sub17.aClass66_3176 != null) {
			int i_1_ = Class23_Sub4_Sub17.aClass66_3176.method1236(-68);
			Class48.anInt749 = i_1_;
		}
		if (Class49.anInt756 != 0) {
			if (Class49.anInt756 != 5) {
				if (Class49.anInt756 != 10) {
					if (Class49.anInt756 == 20) {
						oa.a(this, (byte) 101);
						Class42.method1115((byte) -1);
					} else if (Class49.anInt756 == 25) {
						Class87_Sub4.method1426(7566);
					}
				} else {
					oa.a(this, (byte) 101);
				}
			} else {
				oa.a(this, (byte) 101);
				method38(6);
				Class23_Sub13_Sub7.method640((byte) -86);
			}
		} else {
			method38(6);
			Class23_Sub13_Sub7.method640((byte) -86);
		}
		if (Class49.anInt756 == 30) {
			Class56.method1188(-1990505050);
		} else if (Class49.anInt756 == 40) {
			Class42.method1115((byte) -1);
		}
	}
	
	static final long method35(int i, int i_2_, int i_3_) {
		Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_2_][i_3_];
		if (class23_sub1 == null || class23_sub1.aClass83_2031 == null) {
			return 0L;
		}
		return class23_sub1.aClass83_2031.aLong1473;
	}
	
	final void method22(byte b) {
		anInt1962++;
		if (Class23_Sub4_Sub39.aClass98_3513 != null) {
			Class23_Sub4_Sub39.aClass98_3513.aBoolean1656 = false;
		}
		if (b != 20) {
			aClass23_Sub15_1965 = null;
		}
		Class23_Sub4_Sub39.aClass98_3513 = null;
		if (Class23_Sub24.aClass34_2440 != null) {
			Class23_Sub24.aClass34_2440.method976(false);
			Class23_Sub24.aClass34_2440 = null;
		}
		Class23_Sub4_Sub32.method402(Class71_Sub3.aCanvas2740, (byte) 34);
		CacheIndex.method123(-74, Class71_Sub3.aCanvas2740);
		if (Class23_Sub4_Sub17.aClass66_3176 != null) {
			Class23_Sub4_Sub17.aClass66_3176.method1238(Class71_Sub3.aCanvas2740, (byte) 124);
		}
		Class23_Sub13_Sub11.method726(b + -20931);
		Class38_Sub7_Sub1.method1093(100);
		Class23_Sub4_Sub17.aClass66_3176 = null;
		if (CacheFileChannel.aClass6_471 != null) {
			CacheFileChannel.aClass6_471.method72(0);
		}
		if (Class97.aClass6_1646 != null) {
			Class97.aClass6_1646.method72(0);
		}
		Class23_Sub4_Sub29.method388(-18065);
		Class23_Sub4_Sub18.method340(113);
		do {
			try {
				if (Class23_Sub4_Sub6.aClass29_2990 != null) {
					Class23_Sub4_Sub6.aClass29_2990.method954((byte) 69);
				}
				if (Class78.aClass29Array1410 != null) {
					for (int i = 0; Class78.aClass29Array1410.length > i; i++) {
						if (Class78.aClass29Array1410[i] != null) {
							Class78.aClass29Array1410[i].method954((byte) -30);
						}
					}
				}
				if (Class23_Sub24.aClass29_2439 != null) {
					Class23_Sub24.aClass29_2439.method954((byte) -115);
				}
				if (Class23_Sub7.aClass29_2196 == null) {
					break;
				}
				Class23_Sub7.aClass29_2196.method954((byte) -121);
			} catch (java.io.IOException ioexception) {
				break;
			}
			break;
		} while (false);
	}
	
	static final void method36(byte b) {
		for (Class23_Sub25 class23_sub25 = (Class23_Sub25) Class36.anOa565.a((byte) -25); class23_sub25 != null; class23_sub25 = (Class23_Sub25) Class36.anOa565.a(true)) {
			int i = class23_sub25.anInt2456;
			if (Class17.method189(-10924, i)) {
				boolean bool = true;
				Class64[] class64s = Class23_Sub4_Sub28.aClass64ArrayArray3350[i];
				for (int i_4_ = 0; (class64s.length ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
					if (class64s[i_4_] != null) {
						bool = class64s[i_4_].aBoolean1017;
						break;
					}
				}
				if (!bool) {
					int i_5_ = (int) class23_sub25.aLong358;
					Class64 class64 = Class23_Sub24.method905(i_5_, (byte) 111);
					if (class64 != null) {
						Class91.method1450((byte) 29, class64);
					}
				}
			}
		}
		anInt1969++;
		if (b != 102) {
			aClass23_Sub13_Sub8_1978 = null;
		}
	}
	
	final void method28(boolean bool) {
		anInt1957++;
		boolean bool_6_ = false;
		boolean bool_7_ = Class38_Sub7.method1087(false);
		if (bool_7_ && Class105.aBoolean1806 && CacheFileChannel.aClass6_471 != null) {
			CacheFileChannel.aClass6_471.method71(false);
		}
		if (Class23_Sub13_Sub18.aBoolean4085) {
			bool_6_ = true;
			Class23_Sub13_Sub18.aBoolean4085 = false;
		}
		if ((Class49.anInt756 ^ 0xffffffff) != -1) {
			if (Class49.anInt756 != 5 && Class49.anInt756 != 10 && Class49.anInt756 != 20) {
				if (Class49.anInt756 == 25) {
					if (Class23_Sub4_Sub25.anInt3311 == 1) {
						if (Class23_Sub13_Sub1.anInt3667 < Class23_Sub4_Sub17.anInt3179) {
							Class23_Sub13_Sub1.anInt3667 = Class23_Sub4_Sub17.anInt3179;
						}
						int i = 50 * (-Class23_Sub4_Sub17.anInt3179 + Class23_Sub13_Sub1.anInt3667) / Class23_Sub13_Sub1.anInt3667;
						Class23_Sub4_Sub29.method386(Class23_Sub4_Sub14.method322(new RSString[] { Class64.aClass16_1139, Class71_Sub2.aClass16_2735, Class23_Sub4_Sub23.method360((byte) -9, i), Class23_Sub4_Sub34.aClass16_3450 }, -35), false, false);
					} else if (Class23_Sub4_Sub25.anInt3311 == 2) {
						if (Class23_Sub4_Sub9.anInt3036 > Class23_Sub4_Sub10.anInt3055) {
							Class23_Sub4_Sub10.anInt3055 = Class23_Sub4_Sub9.anInt3036;
						}
						int i = 50 - -((-Class23_Sub4_Sub9.anInt3036 + Class23_Sub4_Sub10.anInt3055) * 50 / Class23_Sub4_Sub10.anInt3055);
						Class23_Sub4_Sub29.method386(Class23_Sub4_Sub14.method322(new RSString[] { Class64.aClass16_1139, Class71_Sub2.aClass16_2735, Class23_Sub4_Sub23.method360((byte) -9, i), Class23_Sub4_Sub34.aClass16_3450 }, -114), false, false);
					} else {
						Class23_Sub4_Sub29.method386(Class64.aClass16_1139, false, false);
					}
				} else if (Class49.anInt756 == 30) {
					Class23_Sub13_Sub10.method693(25602);
				} else if (Class49.anInt756 == 40) {
					Class23_Sub4_Sub29.method386(Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub19.aClass16_3201, Class14.aClass16_276, Class23_Sub4_Sub1.aClass16_2898 }, -32), false, false);
				}
			} else {
				Class23_Sub4_Sub6.method287(CacheIndex.aClass23_Sub13_Sub8_240, aClass23_Sub13_Sub8_1978, 112);
			}
		} else {
			Applet_Sub1.method29(null, 5000, Class71_Sub1_Sub1.anInt4415, bool_6_, Class23_Sub2.aClass16_2050);
		}
		if (bool != true) {
			anInt1974 = 125;
		}
		java.awt.Canvas canvas = Class71_Sub3.aCanvas2740;
		if (Class49.anInt756 == 30 && Class57.anInt901 == 0 && !bool_6_) {
			try {
				Graphics graphics = canvas.getGraphics();
				for (int i = 0; i < Class23_Sub4_Sub25.anInt3306; i++) {
					if (Class36.aBooleanArray571[i]) {
						Class23_Sub13_Sub25.aClass78_4290.method1345(Class24.anIntArray372[i], Class23_Sub4_Sub9.anIntArray3034[i], (byte) 103, Class23_Sub11.anIntArray2286[i], graphics, Class55.anIntArray865[i]);
						Class36.aBooleanArray571[i] = false;
					}
				}
			} catch (Exception exception) {
				canvas.repaint();
			}
		} else {
			do {
				if (Class49.anInt756 > 0) {
					try {
						Graphics graphics = canvas.getGraphics();
						Class23_Sub13_Sub25.aClass78_4290.method1342(3, graphics, 0, 0);
						for (int i = 0; i < Class23_Sub4_Sub25.anInt3306; i++)
							Class36.aBooleanArray571[i] = false;
					} catch (Exception exception) {
						canvas.repaint();
						break;
					}
					break;
				}
			} while (false);
		}
	}
	
	private final void method37(int i, byte b) {
		Class23_Sub4_Sub27.anInt3343 = 0;
		Class2.anInt74++;
		Buffer.aClass34_2132 = null;
		anInt1959++;
		if (Class23_Sub4_Sub27.anInt3328 == Class23_Sub13.anInt2320) {
			Class23_Sub4_Sub27.anInt3328 = Class38_Sub2.anInt2498;
		} else {
			Class23_Sub4_Sub27.anInt3328 = Class23_Sub13.anInt2320;
		}
		if (b < -7) {
			Class68.aClass60_1201 = null;
			if (Class2.anInt74 >= 2 && (i == 7 || i == 9)) {
				if (Class49.anInt756 > 5) {
					Class23_Sub4_Sub38.anInt3501 = 3000;
				} else {
					this.method33(91, "js5connect_full");
					Class49.anInt756 = 1000;
				}
			} else if (Class2.anInt74 >= 2 && i == 6) {
				this.method33(59, "js5connect_outofdate");
				Class49.anInt756 = 1000;
			} else if (Class2.anInt74 >= 4) {
				if (Class49.anInt756 <= 5) {
					this.method33(124, "js5connect");
					Class49.anInt756 = 1000;
				} else {
					Class23_Sub4_Sub38.anInt3501 = 3000;
				}
			}
		}
	}
	
	public final void init() {
		anInt1960++;
		if (this.method31(true)) {
			Class19.anInt321 = Integer.parseInt(this.getParameter("worldid"));
			Class23_Sub4_Sub23.anInt3280 = Integer.parseInt(this.getParameter("modewhat"));
			Class23_Sub8.anInt2250 = Integer.parseInt(this.getParameter("modewhere"));
			String string = this.getParameter("lowmem");
			if (string == null || !string.equals("1")) {
				Class71_Sub2.method1278(true);
			} else {
				Class23_Sub23.method898(112);
			}
			String string_8_ = this.getParameter("members");
			if (string_8_ != null && string_8_.equals("1")) {
				Class75.aBoolean1378 = true;
			} else {
				Class75.aBoolean1378 = false;
			}
			String string_9_ = this.getParameter("lang");
			if (string_9_ != null && string_9_.equals("1")) {
				Class90.method1446(-123);
				Class23_Sub13_Sub15.anInt4036 = 1;
			}
			String string_10_ = this.getParameter("game");
			if (string_10_ == null || !string_10_.equals("1")) {
				Class23_Sub4_Sub29.anInt3369 = 0;
			} else {
				Class23_Sub4_Sub29.anInt3369 = 1;
			}
			try {
				Class38_Sub7_Sub1.anInt4376 = Integer.parseInt(this.getParameter("js"));
				Class47.anInt741 = Integer.parseInt(this.getParameter("plug"));
				Class23_Sub13_Sub9.anInt3857 = Integer.parseInt(this.getParameter("affid"));
			} catch (Exception exception) {
				/* empty */
			}
			CacheArchive.aClass16_2877 = Class71_Sub1.aClass16_2730.method172(-15988, this);
			if (CacheArchive.aClass16_2877 == null) {
				CacheArchive.aClass16_2877 = Class23_Sub4_Sub38.aClass16_3509;
			}
			Class23_Sub4_Sub34.aString3444 = this.getCodeBase().getHost();
			this.method30(-16273, 498, Class23_Sub4_Sub23.anInt3280 + 32, 503, 765);
		}
	}
	
	private final void method38(int i) {
		anInt1956++;
		if ((Class70.anInt1227 ^ 0xffffffff) == -1) {
			Runtime runtime = Runtime.getRuntime();
			int i_11_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
			long l = Class94.method1466(22624);
			if ((Class69.aLong1212 ^ 0xffffffffffffffffL) == -1L) {
				Class69.aLong1212 = l;
			}
			if (i_11_ > 16384 && (-Class69.aLong1212 + l ^ 0xffffffffffffffffL) > -5001L) {
				if (-Class23_Sub4_Sub27.aLong3342 + l > 1000L) {
					System.gc();
					Class23_Sub4_Sub27.aLong3342 = l;
				}
				Class71_Sub1_Sub1.anInt4415 = 5;
				Class23_Sub2.aClass16_2050 = Class104.aClass16_1748;
			} else {
				Class71_Sub1_Sub1.anInt4415 = 5;
				Class70.anInt1227 = 10;
				Class23_Sub2.aClass16_2050 = Class23_Sub4_Sub29.aClass16_3362;
			}
		} else if (Class70.anInt1227 == 10) {
			Class23_Sub13_Sub16.method780(4, 104, 104, 25);
			for (int i_12_ = 0; i_12_ < 4; i_12_++)
				Class4.aClass72Array85[i_12_] = new Class72(104, 104);
			Class70.anInt1227 = 30;
			Class23_Sub2.aClass16_2050 = Class73.aClass16_1327;
			Class71_Sub1_Sub1.anInt4415 = 10;
		} else if (Class70.anInt1227 == 30) {
			Class23_Sub4_Sub7.aClass105_Sub1_3024 = Class71_Sub2_Sub1.loadArchive((byte) 127, 0, true, true, false);
			Class23_Sub4_Sub8.aClass105_Sub1_3031 = Class71_Sub2_Sub1.loadArchive((byte) 127, 1, true, true, false);
			Class23_Sub4_Sub26.aClass105_Sub1_3317 = Class71_Sub2_Sub1.loadArchive((byte) 127, 2, true, false, true);
			Class89.aClass105_Sub1_1509 = Class71_Sub2_Sub1.loadArchive((byte) 127, 3, true, true, false);
			Class30.aClass105_Sub1_475 = Class71_Sub2_Sub1.loadArchive((byte) 127, 4, true, true, false);
			Class38_Sub6.aClass105_Sub1_2613 = Class71_Sub2_Sub1.loadArchive((byte) 127, 5, true, true, true);
			CacheFileChannel.aClass105_Sub1_457 = Class71_Sub2_Sub1.loadArchive((byte) 127, 6, false, true, true);
			Class69.aClass105_Sub1_1211 = Class71_Sub2_Sub1.loadArchive((byte) 127, 7, true, true, false);
			Class92.aClass105_Sub1_1561 = Class71_Sub2_Sub1.loadArchive((byte) 127, 8, true, true, false);
			Class67.aClass105_Sub1_1181 = Class71_Sub2_Sub1.loadArchive((byte) 127, 9, true, false, true);
			Class23_Sub4_Sub27.aClass105_Sub1_3339 = Class71_Sub2_Sub1.loadArchive((byte) 127, 10, true, true, false);
			Class23_Sub1.aClass105_Sub1_2037 = Class71_Sub2_Sub1.loadArchive((byte) 127, 11, true, true, false);
			Class69.aClass105_Sub1_1214 = Class71_Sub2_Sub1.loadArchive((byte) 127, 12, true, true, false);
			Class23_Sub4_Sub23_Sub1.aClass105_Sub1_4477 = Class71_Sub2_Sub1.loadArchive((byte) 127, 13, true, false, true);
			oa.aClass105_Sub1_1247 = Class71_Sub2_Sub1.loadArchive((byte) 127, 14, false, true, false);
			Class23_Sub4_Sub37.aClass105_Sub1_3490 = Class71_Sub2_Sub1.loadArchive((byte) 127, 15, true, true, false);
			Class23_Sub13_Sub19.aClass105_Sub1_4118 = Class71_Sub2_Sub1.loadArchive((byte) 127, 16, true, true, false);
			CacheFileChannel.aClass105_Sub1_470 = Class71_Sub2_Sub1.loadArchive((byte) 127, 17, true, true, false);
			Class23_Sub13_Sub3.aClass105_Sub1_3699 = Class71_Sub2_Sub1.loadArchive((byte) 127, 18, true, true, false);
			Class23_Sub13_Sub17.aClass105_Sub1_4069 = Class71_Sub2_Sub1.loadArchive((byte) 127, 19, true, true, false);
			Class23_Sub4_Sub13.aClass105_Sub1_3116 = Class71_Sub2_Sub1.loadArchive((byte) 127, 20, true, true, false);
			Class38_Sub7_Sub2.aClass105_Sub1_4409 = Class71_Sub2_Sub1.loadArchive((byte) 127, 21, true, true, false);
			Class23_Sub17.aClass105_Sub1_2366 = Class71_Sub2_Sub1.loadArchive((byte) 127, 22, true, true, false);
			Class23_Sub4_Sub8.aClass105_Sub1_3030 = Class71_Sub2_Sub1.loadArchive((byte) 127, 23, true, true, true);
			Class23_Sub4_Sub25.aClass105_Sub1_3302 = Class71_Sub2_Sub1.loadArchive((byte) 127, 24, true, true, false);
			Class5.aClass105_Sub1_118 = Class71_Sub2_Sub1.loadArchive((byte) 127, 25, true, true, false);
			Class70.anInt1227 = 40;
			Class71_Sub1_Sub1.anInt4415 = 15;
			Class23_Sub2.aClass16_2050 = Class61.aClass16_960;
		} else if (Class70.anInt1227 == 40) {
			int i_13_ = 0;
			i_13_ += Class23_Sub4_Sub7.aClass105_Sub1_3024.method1571(31890) * 4 / 100;
			i_13_ += Class23_Sub4_Sub8.aClass105_Sub1_3031.method1571(31890) * 4 / 100;
			i_13_ += Class23_Sub4_Sub26.aClass105_Sub1_3317.method1571(31890) / 100;
			i_13_ += Class89.aClass105_Sub1_1509.method1571(31890) * 2 / 100;
			i_13_ += 6 * Class30.aClass105_Sub1_475.method1571(31890) / 100;
			i_13_ += 4 * Class38_Sub6.aClass105_Sub1_2613.method1571(i ^ 0x7c94) / 100;
			i_13_ += CacheFileChannel.aClass105_Sub1_457.method1571(31890) * 2 / 100;
			i_13_ += 51 * Class69.aClass105_Sub1_1211.method1571(i + 31884) / 100;
			i_13_ += 2 * Class92.aClass105_Sub1_1561.method1571(31890) / 100;
			i_13_ += 2 * Class67.aClass105_Sub1_1181.method1571(31890) / 100;
			i_13_ += 2 * Class23_Sub4_Sub27.aClass105_Sub1_3339.method1571(31890) / 100;
			i_13_ += 2 * Class23_Sub1.aClass105_Sub1_2037.method1571(31890) / 100;
			i_13_ += Class69.aClass105_Sub1_1214.method1571(31890) * 2 / 100;
			i_13_ += Class23_Sub4_Sub23_Sub1.aClass105_Sub1_4477.method1571(31890) * 2 / 100;
			i_13_ += oa.aClass105_Sub1_1247.method1571(31890) * 2 / 100;
			i_13_ += Class23_Sub4_Sub37.aClass105_Sub1_3490.method1571(31890) * 2 / 100;
			i_13_ += Class23_Sub13_Sub19.aClass105_Sub1_4118.method1571(31890) / 100;
			i_13_ += CacheFileChannel.aClass105_Sub1_470.method1571(31890) / 100;
			i_13_ += Class23_Sub13_Sub3.aClass105_Sub1_3699.method1571(i + 31884) / 100;
			i_13_ += Class23_Sub13_Sub17.aClass105_Sub1_4069.method1571(31890) / 100;
			i_13_ += Class23_Sub4_Sub13.aClass105_Sub1_3116.method1571(31890) / 100;
			i_13_ += Class38_Sub7_Sub2.aClass105_Sub1_4409.method1571(31890) / 100;
			i_13_ += Class23_Sub17.aClass105_Sub1_2366.method1571(31890) / 100;
			i_13_ += Class23_Sub4_Sub8.aClass105_Sub1_3030.method1571(i ^ 0x7c94) / 100;
			i_13_ += Class23_Sub4_Sub25.aClass105_Sub1_3302.method1571(31890) / 100;
			i_13_ += Class5.aClass105_Sub1_118.method1571(31890) / 100;
			if (i_13_ != 100) {
				if ((i_13_ ^ 0xffffffff) != -1) {
					Class23_Sub2.aClass16_2050 = Class23_Sub4_Sub14.method322(new RSString[] { Class39.aClass16_617, Class23_Sub4_Sub23.method360((byte) -9, i_13_), CacheArchive.aClass16_2867 }, -124);
				}
				Class71_Sub1_Sub1.anInt4415 = 20;
			} else {
				Class71_Sub1_Sub1.anInt4415 = 20;
				Class23_Sub2.aClass16_2050 = Class53.aClass16_836;
				Class23_Sub4_Sub31.method398(CacheFileChannel.aClass105_Sub1_457, Class23_Sub4_Sub27.aClass105_Sub1_3339, i + 110, Class92.aClass105_Sub1_1561);
				Class70.anInt1227 = 45;
			}
		} else if (Class70.anInt1227 == 45) {
			Class23_Sub4_Sub38.method422(!Class7.aBoolean170, 22050, (byte) 53, 2);
			Class23_Sub10_Sub2 class23_sub10_sub2 = new Class23_Sub10_Sub2();
			class23_sub10_sub2.method549((byte) -82, 9, 128);
			CacheFileChannel.aClass6_471 = Class87_Sub1.method1410(22050, 0, (byte) 43, Class23_Sub4_Sub3.aClass9_2939, Class71_Sub3.aCanvas2740);
			CacheFileChannel.aClass6_471.method78(class23_sub10_sub2, -15878);
			Class102.method1515(Class30.aClass105_Sub1_475, class23_sub10_sub2, oa.aClass105_Sub1_1247, -114, Class23_Sub4_Sub37.aClass105_Sub1_3490);
			Class97.aClass6_1646 = Class87_Sub1.method1410(2048, 1, (byte) 117, Class23_Sub4_Sub3.aClass9_2939, Class71_Sub3.aCanvas2740);
			Class23_Sub7.aClass23_Sub10_Sub4_2201 = new Class23_Sub10_Sub4();
			Class97.aClass6_1646.method78(Class23_Sub7.aClass23_Sub10_Sub4_2201, -15878);
			Class83.aClass45_1462 = new Class45(22050, Class32.anInt498);
			Class23_Sub2.aClass16_2050 = Class8.aClass16_176;
			Class70.anInt1227 = 50;
			Class71_Sub1_Sub1.anInt4415 = 30;
		} else if (Class70.anInt1227 == 50) {
			int i_14_ = 0;
			if (Class92.aClass105_Sub1_1561.method1560(Class54.aClass16_850, -1)) {
				i_14_++;
			}
			if (Class92.aClass105_Sub1_1561.method1560(Class33.aClass16_522, -1)) {
				i_14_++;
			}
			if (Class92.aClass105_Sub1_1561.method1560(Class48.aClass16_747, -1)) {
				i_14_++;
			}
			if (Class23_Sub4_Sub23_Sub1.aClass105_Sub1_4477.method1560(Class54.aClass16_850, -1)) {
				i_14_++;
			}
			if (Class23_Sub4_Sub23_Sub1.aClass105_Sub1_4477.method1560(Class33.aClass16_522, i ^ ~0x6)) {
				i_14_++;
			}
			if (Class23_Sub4_Sub23_Sub1.aClass105_Sub1_4477.method1560(Class48.aClass16_747, -1)) {
				i_14_++;
			}
			if (i_14_ < 6) {
				Class23_Sub2.aClass16_2050 = Class23_Sub4_Sub14.method322(new RSString[] { Class38_Sub7.aClass16_2703, Class23_Sub4_Sub23.method360((byte) -9, 100 * i_14_ / 6), CacheArchive.aClass16_2867 }, -100);
				Class71_Sub1_Sub1.anInt4415 = 35;
			} else {
				Class71_Sub1_Sub1.anInt4415 = 35;
				Class23_Sub2.aClass16_2050 = Class25.aClass16_392;
				Class70.anInt1227 = 60;
			}
		} else if (Class70.anInt1227 == 60) {
			int i_15_ = Class23_Sub14.method866(27118, Class92.aClass105_Sub1_1561, Class23_Sub4_Sub27.aClass105_Sub1_3339);
			int i_16_ = Class23_Sub8.method498((byte) -105);
			if ((i_15_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff)) {
				Class23_Sub2.aClass16_2050 = Class23_Sub4_Sub14.method322(new RSString[] { Class51.aClass16_804, Class23_Sub4_Sub23.method360((byte) -9, i_15_ * 100 / i_16_), CacheArchive.aClass16_2867 }, i ^ ~0x27);
				Class71_Sub1_Sub1.anInt4415 = 40;
			} else {
				Class70.anInt1227 = 65;
				Class71_Sub1_Sub1.anInt4415 = 40;
				Class23_Sub2.aClass16_2050 = Class23_Sub15.aClass16_2345;
			}
		} else if (Class70.anInt1227 == 65) {
			aClass23_Sub13_Sub8_1978 = Class68.method1251(Class23_Sub4_Sub23_Sub1.aClass105_Sub1_4477, Class23_Sub4_Sub38.aClass16_3509, Class92.aClass105_Sub1_1561, (byte) 92, Class54.aClass16_850);
			Class71_Sub1_Sub1.aClass23_Sub13_Sub8_Sub1_Sub1_4431 = (Class23_Sub13_Sub8_Sub1_Sub1) aClass23_Sub13_Sub8_1978;
			Class38_Sub7.aClass23_Sub13_Sub8_2637 = Class68.method1251(Class23_Sub4_Sub23_Sub1.aClass105_Sub1_4477, Class23_Sub4_Sub38.aClass16_3509, Class92.aClass105_Sub1_1561, (byte) 87, Class33.aClass16_522);
			CacheIndex.aClass23_Sub13_Sub8_240 = Class68.method1251(Class23_Sub4_Sub23_Sub1.aClass105_Sub1_4477, Class23_Sub4_Sub38.aClass16_3509, Class92.aClass105_Sub1_1561, (byte) 95, Class48.aClass16_747);
			Class71_Sub1_Sub1.anInt4415 = 45;
			Class23_Sub2.aClass16_2050 = CacheArchive.aClass16_2862;
			Class103.method1521(5, 27172);
			Class70.anInt1227 = 70;
		} else if (Class70.anInt1227 == 70) {
			Class23_Sub4_Sub26.aClass105_Sub1_3317.method1534((byte) -13);
			int i_17_ = 0;
			i_17_ += Class23_Sub4_Sub26.aClass105_Sub1_3317.method1550((byte) 123);
			Class23_Sub13_Sub19.aClass105_Sub1_4118.method1534((byte) -13);
			i_17_ += Class23_Sub13_Sub19.aClass105_Sub1_4118.method1550((byte) 125);
			CacheFileChannel.aClass105_Sub1_470.method1534((byte) -13);
			i_17_ += CacheFileChannel.aClass105_Sub1_470.method1550((byte) 124);
			Class23_Sub13_Sub3.aClass105_Sub1_3699.method1534((byte) -13);
			i_17_ += Class23_Sub13_Sub3.aClass105_Sub1_3699.method1550((byte) 126);
			Class23_Sub13_Sub17.aClass105_Sub1_4069.method1534((byte) -13);
			i_17_ += Class23_Sub13_Sub17.aClass105_Sub1_4069.method1550((byte) 127);
			Class23_Sub4_Sub13.aClass105_Sub1_3116.method1534((byte) -13);
			i_17_ += Class23_Sub4_Sub13.aClass105_Sub1_3116.method1550((byte) 124);
			Class38_Sub7_Sub2.aClass105_Sub1_4409.method1534((byte) -13);
			i_17_ += Class38_Sub7_Sub2.aClass105_Sub1_4409.method1550((byte) 126);
			Class23_Sub17.aClass105_Sub1_2366.method1534((byte) -13);
			i_17_ += Class23_Sub17.aClass105_Sub1_2366.method1550((byte) 125);
			Class23_Sub4_Sub25.aClass105_Sub1_3302.method1534((byte) -13);
			i_17_ += Class23_Sub4_Sub25.aClass105_Sub1_3302.method1550((byte) 123);
			Class5.aClass105_Sub1_118.method1534((byte) -13);
			i_17_ += Class5.aClass105_Sub1_118.method1550((byte) 125);
			if (i_17_ < 1000) {
				Class23_Sub2.aClass16_2050 = Class23_Sub4_Sub14.method322(new RSString[] { Class72.aClass16_1311, Class23_Sub4_Sub23.method360((byte) -9, i_17_ / 10), CacheArchive.aClass16_2867 }, -114);
				Class71_Sub1_Sub1.anInt4415 = 50;
			} else {
				Class23_Sub13_Sub15.method771(Class23_Sub4_Sub26.aClass105_Sub1_3317, (byte) 110);
				Class23_Sub10_Sub2.method562((byte) -123, Class23_Sub4_Sub26.aClass105_Sub1_3317);
				Class23_Sub1.method233((byte) -109, Class23_Sub4_Sub26.aClass105_Sub1_3317, Class69.aClass105_Sub1_1211);
				Class97.method1489(Class23_Sub13_Sub19.aClass105_Sub1_4118, Class7.aBoolean170, Class69.aClass105_Sub1_1211, (byte) -57, Class75.aBoolean1378);
				Class14.method130(Class69.aClass105_Sub1_1211, Class23_Sub13_Sub3.aClass105_Sub1_3699, false);
				Class105.method1557(Class75.aBoolean1378, (byte) 119, Class71_Sub1_Sub1.aClass23_Sub13_Sub8_Sub1_Sub1_4431, Class69.aClass105_Sub1_1211, Class23_Sub13_Sub17.aClass105_Sub1_4069);
				Class23_Sub4.method267(Class23_Sub4_Sub8.aClass105_Sub1_3031, Class23_Sub4_Sub7.aClass105_Sub1_3024, 1024, Class23_Sub4_Sub13.aClass105_Sub1_3116);
				Class78.method1350(Class69.aClass105_Sub1_1211, Class38_Sub7_Sub2.aClass105_Sub1_4409, 1949);
				Class87_Sub4.method1422(Class23_Sub17.aClass105_Sub1_2366, (byte) 111);
				Class23_Sub4_Sub25.method373(Class23_Sub4_Sub26.aClass105_Sub1_3317, -128);
				Class23_Sub13_Sub8_Sub1.method677(Class23_Sub4_Sub23_Sub1.aClass105_Sub1_4477, Class69.aClass105_Sub1_1211, false, Class92.aClass105_Sub1_1561, Class89.aClass105_Sub1_1509);
				Class23_Sub13_Sub16.method784(Class23_Sub4_Sub26.aClass105_Sub1_3317, 125);
				Class23_Sub15.method867(CacheFileChannel.aClass105_Sub1_470, 0);
				Class30.method957((byte) 83, Class23_Sub4_Sub25.aClass105_Sub1_3302, new Class79(), Class5.aClass105_Sub1_118);
				CacheFileChannel.method952(Class5.aClass105_Sub1_118, Class23_Sub4_Sub25.aClass105_Sub1_3302, 75);
				Class71_Sub1_Sub1.anInt4415 = 50;
				Class23_Sub2.aClass16_2050 = Class23_Sub4_Sub2.aClass16_2929;
				Class23_Sub4_Sub3.method283((byte) -118);
				Class70.anInt1227 = 80;
			}
		} else if (Class70.anInt1227 == 80) {
			int i_18_ = 0;
			if (Class23_Sub1.aClass23_Sub13_Sub10_2016 == null) {
				Class23_Sub13_Sub10_Sub1 class23_sub13_sub10_sub1 = Class23_Sub13_Sub10.method692(Class92.aClass105_Sub1_1561, 126, Class23_Sub4_Sub38.aClass16_3509, Class23_Sub4_Sub5.aClass16_2976);
				if (class23_sub13_sub10_sub1 != null) {
					class23_sub13_sub10_sub1.method717();
					Class23_Sub1.aClass23_Sub13_Sub10_2016 = class23_sub13_sub10_sub1;
				}
			} else {
				i_18_++;
			}
			if (Class23_Sub13_Sub23.aClass43_Sub1Array4245 == null) {
				Class23_Sub13_Sub23.aClass43_Sub1Array4245 = Class107.method1582(Class23_Sub16.aClass16_2358, Class92.aClass105_Sub1_1561, (byte) -81, Class23_Sub4_Sub38.aClass16_3509);
			} else {
				i_18_++;
			}
			if (Class23.aClass23_Sub13_Sub10_Sub1Array350 != null) {
				i_18_++;
			} else {
				Class23.aClass23_Sub13_Sub10_Sub1Array350 = Class23_Sub13_Sub20.method817(Class23_Sub4_Sub2.aClass16_2917, Class23_Sub4_Sub38.aClass16_3509, Class92.aClass105_Sub1_1561, i + 24294);
			}
			if (Class78_Sub2.aClass23_Sub13_Sub10Array2765 != null) {
				i_18_++;
			} else {
				Class78_Sub2.aClass23_Sub13_Sub10Array2765 = Class99.method1496(Applet_Sub1.aClass16_43, true, Class23_Sub4_Sub38.aClass16_3509, Class92.aClass105_Sub1_1561);
			}
			if (Class23_Sub25.aClass23_Sub13_Sub10Array2460 != null) {
				i_18_++;
			} else {
				Class23_Sub25.aClass23_Sub13_Sub10Array2460 = Class99.method1496(Class23_Sub13_Sub9.aClass16_3864, true, Class23_Sub4_Sub38.aClass16_3509, Class92.aClass105_Sub1_1561);
			}
			if (Class106.aClass23_Sub13_Sub10Array1829 == null) {
				Class106.aClass23_Sub13_Sub10Array1829 = Class99.method1496(Class74.aClass16_1355, true, Class23_Sub4_Sub38.aClass16_3509, Class92.aClass105_Sub1_1561);
			} else {
				i_18_++;
			}
			if (Class23_Sub13_Sub4.aClass23_Sub13_Sub10Array3718 != null) {
				i_18_++;
			} else {
				Class23_Sub13_Sub4.aClass23_Sub13_Sub10Array3718 = Class99.method1496(Class69.aClass16_1215, true, Class23_Sub4_Sub38.aClass16_3509, Class92.aClass105_Sub1_1561);
			}
			if (Class23_Sub1.aClass23_Sub13_Sub10Array2009 != null) {
				i_18_++;
			} else {
				Class23_Sub1.aClass23_Sub13_Sub10Array2009 = Class99.method1496(Class23_Sub4_Sub37.aClass16_3482, true, Class23_Sub4_Sub38.aClass16_3509, Class92.aClass105_Sub1_1561);
			}
			if (Class23_Sub14.aClass23_Sub13_Sub10Array2332 != null) {
				i_18_++;
			} else {
				Class23_Sub13_Sub10_Sub1[] class23_sub13_sub10_sub1s = Class23_Sub13_Sub20.method817(Class23_Sub25.aClass16_2464, Class23_Sub4_Sub38.aClass16_3509, Class92.aClass105_Sub1_1561, 24300);
				if (class23_sub13_sub10_sub1s != null) {
					for (int i_19_ = 0; (class23_sub13_sub10_sub1s.length ^ 0xffffffff) < (i_19_ ^ 0xffffffff); i_19_++)
						class23_sub13_sub10_sub1s[i_19_].method717();
					Class23_Sub14.aClass23_Sub13_Sub10Array2332 = class23_sub13_sub10_sub1s;
				}
			}
			if (Class23_Sub13_Sub8_Sub1.aClass23_Sub13_Sub10_4494 != null) {
				i_18_++;
			} else {
				Class23_Sub13_Sub8_Sub1.aClass23_Sub13_Sub10_4494 = Class71_Sub1.method1268(Class92.aClass105_Sub1_1561, Class98.aClass16_1651, -95, Class23_Sub4_Sub38.aClass16_3509);
			}
			if (Class71_Sub1.aClass23_Sub13_Sub10Array2723 == null) {
				Class71_Sub1.aClass23_Sub13_Sub10Array2723 = Class99.method1496(Class23_Sub4_Sub2.aClass16_2916, true, Class23_Sub4_Sub38.aClass16_3509, Class92.aClass105_Sub1_1561);
			} else {
				i_18_++;
			}
			if (aClass23_Sub13_Sub10Array1971 != null) {
				i_18_++;
			} else {
				aClass23_Sub13_Sub10Array1971 = Class99.method1496(Class17.aClass16_314, true, Class23_Sub4_Sub38.aClass16_3509, Class92.aClass105_Sub1_1561);
			}
			if (Class71_Sub2.aClass43Array2739 == null) {
				Class71_Sub2.aClass43Array2739 = Class23_Sub4_Sub7.method291(Class23_Sub4_Sub6.aClass16_2991, Class92.aClass105_Sub1_1561, Class23_Sub4_Sub38.aClass16_3509, true);
			} else {
				i_18_++;
			}
			if (Class23_Sub4_Sub1.aClass43Array2881 != null) {
				i_18_++;
			} else {
				Class23_Sub4_Sub1.aClass43Array2881 = Class23_Sub4_Sub7.method291(Class54.aClass16_860, Class92.aClass105_Sub1_1561, Class23_Sub4_Sub38.aClass16_3509, true);
			}
			if (++i_18_ < 15) {
				Class23_Sub2.aClass16_2050 = Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub13_Sub11.aClass16_3914, Class23_Sub4_Sub23.method360((byte) -9, i_18_ * 100 / 15), CacheArchive.aClass16_2867 }, -37);
				Class71_Sub1_Sub1.anInt4415 = 60;
			} else {
				aClass23_Sub13_Sub8_1978.method661(Class23_Sub4_Sub1.aClass43Array2881, null);
				int i_20_ = -10 + (int) (21.0 * Math.random());
				int i_21_ = (int) (21.0 * Math.random()) - 10;
				int i_22_ = (int) (Math.random() * 21.0) - 10;
				Class38_Sub7.aClass23_Sub13_Sub8_2637.method661(Class23_Sub4_Sub1.aClass43Array2881, null);
				int i_23_ = -20 + (int) (Math.random() * 41.0);
				CacheIndex.aClass23_Sub13_Sub8_240.method661(Class23_Sub4_Sub1.aClass43Array2881, null);
				for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > (Class23.aClass23_Sub13_Sub10_Sub1Array350.length ^ 0xffffffff); i_24_++)
					Class23.aClass23_Sub13_Sub10_Sub1Array350[i_24_].method719(i_21_ - -i_23_, i_23_ + i_20_, i_22_ + i_23_);
				Class23_Sub13_Sub23.aClass43_Sub1Array4245[0].method1124(i_23_ + i_21_, i_23_ + i_20_, i_23_ + i_22_);
				Class71_Sub1_Sub1.anInt4415 = 60;
				Class70.anInt1227 = 90;
				Class23_Sub2.aClass16_2050 = Class87.aClass16_1482;
				Class23_Sub10_Sub2.aClass23_Sub13_Sub10Array3609 = Class23.aClass23_Sub13_Sub10_Sub1Array350;
			}
		} else if (i == 6) {
			if (Class70.anInt1227 == 90) {
				if (!Class67.aClass105_Sub1_1181.method1534((byte) -13)) {
					Class23_Sub2.aClass16_2050 = Class23_Sub4_Sub14.method322(new RSString[] { Class50.aClass16_771, Class23_Sub4_Sub23.method360((byte) -9, Class67.aClass105_Sub1_1181.method1550((byte) 123)), CacheArchive.aClass16_2867 }, i + -117);
					Class71_Sub1_Sub1.anInt4415 = 70;
				} else {
					Class86 class86 = new Class86(Class67.aClass105_Sub1_1181, Class92.aClass105_Sub1_1561, 20, Class7.aBoolean170 ? 64 : 128);
					Class76.method1328(class86);
					Class76.method1326(0.7F);
					Class70.anInt1227 = 110;
					Class71_Sub1_Sub1.anInt4415 = 70;
					Class23_Sub2.aClass16_2050 = Class23_Sub13_Sub21.aClass16_4200;
				}
			} else if (Class70.anInt1227 == 110) {
				Class23_Sub4_Sub39.aClass98_3513 = new Class98();
				Class23_Sub4_Sub3.aClass9_2939.method104(10, Class23_Sub4_Sub39.aClass98_3513, (byte) 72);
				Class70.anInt1227 = 120;
				Class23_Sub2.aClass16_2050 = Class47.aClass16_723;
				Class71_Sub1_Sub1.anInt4415 = 75;
			} else if (Class70.anInt1227 == 120) {
				if (!Class23_Sub4_Sub27.aClass105_Sub1_3339.method1565(-76, Canvas_Sub1.aClass16_45, Class23_Sub4_Sub38.aClass16_3509)) {
					Class23_Sub2.aClass16_2050 = Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub38.aClass16_3506, Class23_Sub13_Sub23.aClass16_4231 }, i + -117);
					Class71_Sub1_Sub1.anInt4415 = 80;
				} else {
					Class106 class106 = new Class106(Class23_Sub4_Sub27.aClass105_Sub1_3339.method1536(Canvas_Sub1.aClass16_45, Class23_Sub4_Sub38.aClass16_3509, 86));
					Class23_Sub25.method906(i + 53, class106);
					Class23_Sub2.aClass16_2050 = Class61.aClass16_961;
					Class70.anInt1227 = 130;
					Class71_Sub1_Sub1.anInt4415 = 80;
				}
			} else if (Class70.anInt1227 == 130) {
				if (!Class89.aClass105_Sub1_1509.method1534((byte) -13)) {
					Class23_Sub2.aClass16_2050 = Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub32.aClass16_3424, Class23_Sub4_Sub23.method360((byte) -9, 4 * Class89.aClass105_Sub1_1509.method1550((byte) 125) / 5), CacheArchive.aClass16_2867 }, -116);
					Class71_Sub1_Sub1.anInt4415 = 85;
				} else if (!Class69.aClass105_Sub1_1214.method1534((byte) -13)) {
					Class23_Sub2.aClass16_2050 = Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub32.aClass16_3424, Class23_Sub4_Sub23.method360((byte) -9, Class69.aClass105_Sub1_1214.method1550((byte) 126) / 6 + 80), CacheArchive.aClass16_2867 }, -103);
					Class71_Sub1_Sub1.anInt4415 = 85;
				} else if (!Class23_Sub4_Sub23_Sub1.aClass105_Sub1_4477.method1534((byte) -13)) {
					Class23_Sub2.aClass16_2050 = Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub32.aClass16_3424, Class23_Sub4_Sub23.method360((byte) -9, 96 - -(Class23_Sub4_Sub23_Sub1.aClass105_Sub1_4477.method1550((byte) 127) / 20)), CacheArchive.aClass16_2867 }, -118);
					Class71_Sub1_Sub1.anInt4415 = 85;
				} else {
					Class70.anInt1227 = 140;
					Class71_Sub1_Sub1.anInt4415 = 100;
					Class23_Sub2.aClass16_2050 = Class45.aClass16_699;
				}
			} else if (Class70.anInt1227 == 140) {
				Class38_Sub6.aClass105_Sub1_2613.method1559(false, true, (byte) 54);
				CacheFileChannel.aClass105_Sub1_457.method1559(true, true, (byte) 37);
				Class92.aClass105_Sub1_1561.method1559(true, true, (byte) 28);
				Class23_Sub4_Sub23_Sub1.aClass105_Sub1_4477.method1559(true, true, (byte) 22);
				Class23_Sub4_Sub27.aClass105_Sub1_3339.method1559(true, true, (byte) 88);
				Class103.method1521(10, 27172);
			}
		}
	}
	
	final void method21(byte b) {
		anInt1954++;
		Class23_Sub13.anInt2320 = (Class23_Sub8.anInt2250 ^ 0xffffffff) != -1 ? Class19.anInt321 + 40000 : 43594;
		if (Class23_Sub4_Sub29.anInt3369 != 1) {
			Class42.aShortArray655 = Class31.aShortArray489;
			Class68.aShortArrayArray1189 = Class38_Sub2.aShortArrayArray2497;
			Class23_Sub4_Sub32.aShortArray3417 = Class63.aShortArray983;
			Class44.aShortArrayArray679 = RuntimeException_Sub1.aShortArrayArray1851;
		} else {
			Class68.aShortArrayArray1189 = Class65.aShortArrayArray1158;
			Class23_Sub4_Sub32.aShortArray3417 = Class23_Sub4_Sub18.aShortArray3190;
			Class44.aShortArrayArray679 = Class71.aShortArrayArray1269;
			Class42.aShortArray655 = Class99.aShortArray1667;
		}
		Class23_Sub4_Sub27.anInt3328 = Class23_Sub13.anInt2320;
		Class74.aShortArray1339 = Class87_Sub4.aShortArray2851 = Class23_Sub13_Sub17.aShortArray4072 = Class17.aShortArray315 = new short[256];
		Class38_Sub2.anInt2498 = (Class23_Sub8.anInt2250 ^ 0xffffffff) == -1 ? 443 : 50000 + Class19.anInt321;
		Class23_Sub4_Sub14.method323((byte) 103);
		Class23_Sub4_Sub13.method315((byte) 127, Class71_Sub3.aCanvas2740);
		Class45.method1136(95, Class71_Sub3.aCanvas2740);
		int i = -77 / ((b - 77) / 44);
		Class23_Sub4_Sub17.aClass66_3176 = Class38_Sub7_Sub2.method1097(0);
		if (Class23_Sub4_Sub17.aClass66_3176 != null) {
			Class23_Sub4_Sub17.aClass66_3176.method1240(13474, Class71_Sub3.aCanvas2740);
		}
		Class87_Sub2.anInt2794 = Class9.anInt190;
		try {
			if (Class23_Sub4_Sub3.aClass9_2939.aClass62_186 != null) {
				Class23_Sub4_Sub6.aClass29_2990 = new CacheFileChannel(Class23_Sub4_Sub3.aClass9_2939.aClass62_186, 5200, 0);
				for (int i_25_ = 0; i_25_ < 26; i_25_++)
					Class78.aClass29Array1410[i_25_] = new CacheFileChannel(Class23_Sub4_Sub3.aClass9_2939.aClass62Array191[i_25_], 6000, 0);
				Class23_Sub24.aClass29_2439 = new CacheFileChannel(Class23_Sub4_Sub3.aClass9_2939.aClass62_197, 6000, 0);
				Class73.aClass13_1318 = new CacheIndex(255, Class23_Sub4_Sub6.aClass29_2990, Class23_Sub24.aClass29_2439, 500000);
				Class23_Sub7.aClass29_2196 = new CacheFileChannel(Class23_Sub4_Sub3.aClass9_2939.aClass62_182, 24, 0);
				Class23_Sub4_Sub3.aClass9_2939.aClass62_186 = null;
				Class23_Sub4_Sub3.aClass9_2939.aClass62Array191 = null;
				Class23_Sub4_Sub3.aClass9_2939.aClass62_182 = null;
				Class23_Sub4_Sub3.aClass9_2939.aClass62_197 = null;
			}
		} catch (java.io.IOException ioexception) {
			Class23_Sub4_Sub6.aClass29_2990 = null;
			Class23_Sub24.aClass29_2439 = null;
			Class23_Sub7.aClass29_2196 = null;
			Class73.aClass13_1318 = null;
		}
		if ((Class23_Sub8.anInt2250 ^ 0xffffffff) != -1) {
			Class82.aBoolean1442 = true;
		}
		Class23_Sub19.aClass16_2393 = Class102.aClass16_1709;
	}
	
	private final void method39(boolean bool) {
		anInt1963++;
		if (Class23_Sub23.anInt2420 >= 4) {
			this.method33(-126, "js5crc");
			Class49.anInt756 = 1000;
		} else {
			if (Class23_Sub17.anInt2369 >= 4) {
				if (Class49.anInt756 <= 5) {
					this.method33(-88, "js5io");
					Class49.anInt756 = 1000;
					return;
				}
				Class23_Sub17.anInt2369 = 3;
				Class23_Sub4_Sub38.anInt3501 = 3000;
			}
			if (Class23_Sub4_Sub38.anInt3501-- <= 0) {
				do {
					try {
						if ((Class23_Sub4_Sub27.anInt3343 ^ 0xffffffff) == -1) {
							Class68.aClass60_1201 = Class23_Sub4_Sub3.aClass9_2939.method105(Class23_Sub4_Sub34.aString3444, Class23_Sub4_Sub27.anInt3328, 126);
							Class23_Sub4_Sub27.anInt3343++;
						}
						if (Class23_Sub4_Sub27.anInt3343 == 1) {
							if (Class68.aClass60_1201.anInt951 == 2) {
								method37(-1, (byte) -64);
								break;
							}
							if (Class68.aClass60_1201.anInt951 == 1) {
								Class23_Sub4_Sub27.anInt3343++;
							}
						}
						if (Class23_Sub4_Sub27.anInt3343 == 2) {
							Buffer.aClass34_2132 = new Class34((Socket) Class68.aClass60_1201.anObject955, Class23_Sub4_Sub3.aClass9_2939);
							Buffer class23_sub5 = new Buffer(5);
							class23_sub5.writeByte(15);
							class23_sub5.writeIntBE(498);
							Buffer.aClass34_2132.method977(30000, 5, 0, class23_sub5.payload);
							Class23_Sub4_Sub27.anInt3343++;
							Class23_Sub13_Sub21.aLong4191 = Class94.method1466(22624);
						}
						if (Class23_Sub4_Sub27.anInt3343 == 3) {
							if (Class49.anInt756 > 5 && Buffer.aClass34_2132.method973(-80) <= 0) {
								if ((Class94.method1466(22624) + -Class23_Sub13_Sub21.aLong4191 ^ 0xffffffffffffffffL) < -30001L) {
									method37(-2, (byte) -42);
									break;
								}
							} else {
								int i = Buffer.aClass34_2132.method971((byte) 10);
								if (i != 0) {
									method37(i, (byte) -123);
									break;
								}
								Class23_Sub4_Sub27.anInt3343++;
							}
						}
						if (Class23_Sub4_Sub27.anInt3343 == 4) {
							Class38_Sub7_Sub1.method1095(Buffer.aClass34_2132, 0, Class49.anInt756 > 20);
							Buffer.aClass34_2132 = null;
							Class68.aClass60_1201 = null;
							Class2.anInt74 = 0;
							Class23_Sub4_Sub27.anInt3343 = 0;
						}
						if (bool == true) {
							break;
						}
						aClass23_Sub15_1965 = null;
					} catch (java.io.IOException ioexception) {
						method37(-3, (byte) -37);
						break;
					}
					break;
				} while (false);
			}
		}
	}
	
	static final void method40(Class23_Sub10 class23_sub10, boolean bool) {
		if (class23_sub10.aClass23_Sub6_2278 != null) {
			class23_sub10.aClass23_Sub6_2278.anInt2193 = 0;
		}
		anInt1967++;
		class23_sub10.aBoolean2276 = false;
		if (bool == true) {
			for (Class23_Sub10 class23_sub10_26_ = class23_sub10.method503(); class23_sub10_26_ != null; class23_sub10_26_ = class23_sub10.method502())
				method40(class23_sub10_26_, true);
		}
	}
	
	public static void method41(byte b) {
		aClass105_1955 = null;
		aClass16_1977 = null;
		aClass16_1972 = null;
		aClass23_Sub15_1965 = null;
		aClass23_Sub13_Sub10Array1971 = null;
		aClass23_Sub13_Sub8_1978 = null;
		aClass16_1961 = null;
		aClass16_1975 = null;
		aClass16_1976 = null;
		aClass16_1979 = null;
		if (b <= 48) {
			method40(null, false);
		}
	}
	
	final void method16(byte b) {
		anInt1964++;
		method41((byte) 101);
		RSString.method180((byte) 89);
		Applet_Sub1.method20(false);
		Class17.method187(true);
		Class78.method1349(-78);
		Class98.method1493(-95);
		Class10.method110((byte) 125);
		Buffer.method455(-81);
		Class34.method972((byte) 25);
		CacheArchive.method1567(false);
		CacheFileChannel.method943((byte) -86);
		CacheIndex.method118(b + -152);
		Class38_Sub7_Sub1.method1091(2047);
		Class23_Sub5_Sub1.method484(false);
		Class23_Sub13_Sub8.method652();
		Class72.method1300(0);
		Class23_Sub13_Sub10.method702(3);
		Class43.method1118(true);
		Class64.method1219(-21558);
		Class38_Sub7_Sub2.method1099(-1803925744);
		Class89.method1432(-1);
		oa.b(46);
		Class66.method1239(b ^ 0x3b);
		Class23_Sub19.method880(0);
		Class90.method1444(-20234);
		Class6.method75(b + -15731);
		Class45.method1131(true);
		Class51.method1161(-121);
		Class23_Sub13_Sub22.method841(b ^ ~0x5085);
		Class38_Sub7.method1089(-3);
		Class23_Sub23.method895(109);
		Class23_Sub13_Sub20.method822(b ^ ~0x6);
		Class23_Sub25.method908(117);
		Class23.method229((byte) -11);
		Class70.method1260(-31834);
		Class95.method1469(b + 586448393);
		Class81.method1371(-1);
		Class44.method1126(21150);
		RuntimeException_Sub1.method1590(8404);
		Class65.method1233(false);
		Class28.method938(85);
		Class23_Sub1.method236(b + 199);
		Class39.method1102(b ^ 0x38);
		Class59.method1194(2048);
		Class38.method996(128);
		Class83.method1378((byte) -36);
		Class24.method916(b ^ 0x38);
		Class69.method1256(-1686910681);
		Class104.method1527(false);
		Class52.method1170();
		Class2.method48(32);
		Class75.method1316(0);
		Class23_Sub13_Sub7.method637(-125);
		Class23_Sub13.method600(-1399);
		Class105.method1553(-1);
		Class5.method64(b + -152);
		Class38_Sub4.method1044();
		Class23_Sub13_Sub5.method626(-66);
		Class23_Sub13_Sub11.method738(true);
		Class38_Sub1_Sub1.method1028();
		Class32.method965(-7897);
		Class11.method111((byte) 51);
		Class94.method1465((byte) -100);
		Class73.method1310(b ^ 0x30);
		Class7.method91(-119);
		Class4.method59(-122);
		Class23_Sub10_Sub2.method577((byte) -90);
		Class14.method126(49);
		Class49.method1154(-107);
		Class53.method1172(true);
		Class82.method1374(32);
		Class33.method969((byte) 88);
		Class25.method920((byte) 61);
		Class27.method935(0);
		Class23_Sub13_Sub26.method859(false);
		Class68.method1255(0);
		Class102.method1514(-107);
		Class23_Sub7.method494(-1);
		Class96.method1472();
		Class23_Sub10_Sub3.method588(-125);
		Class23_Sub2.method237((byte) 120);
		Class57.method1190((byte) 107);
		Class36.method988((byte) 87);
		Class23_Sub13_Sub4.method622(-2903);
		Class58.method1193(17);
		Class23_Sub13_Sub24.method848((byte) -117);
		Class23_Sub13_Sub18.method797(-1);
		Class23_Sub13_Sub16.method781((byte) -83);
		Class23_Sub13_Sub17.method790(0);
		Class23_Sub13_Sub14.method768((byte) 24);
		Class23_Sub13_Sub6.method630((byte) -87);
		Class23_Sub13_Sub21.method831(128);
		Class23_Sub13_Sub13.method763(b ^ 0x38);
		Class23_Sub13_Sub12.method754(-4);
		Class79.method1360(true);
		Class23_Sub13_Sub15.method769(b + -56);
		Class20.method221();
		Class86.method1401(false);
		Class23_Sub13_Sub19.method802(54);
		Class76.method1332();
		Class106.method1574(true);
		Class21.method225(36);
		Class100.method1505((byte) -127);
		Class19.method197(-13488);
		Class23_Sub17.method873(false);
		Class97.method1491(0);
		Class48.method1151((byte) 74);
		Class84.method1385();
		Class23_Sub8.method499((byte) -3);
		Class23_Sub13_Sub23.method845(-89);
		Class67.method1245((byte) 67);
		Class23_Sub9.method500((byte) -14);
		Class26.method924(-119);
		Class50.method1155(63);
		Class42.method1113(15380);
		Class93.method1464();
		Class31.method961((byte) -128);
		Class30.method959(b + -54);
		Class38_Sub5.method1073((byte) -113);
		Class38_Sub6.method1077((byte) 123);
		Class23_Sub20.method885(b + -55);
		Class38_Sub2.method1035(b + 35);
		Class38_Sub3.method1039(b ^ ~0x3e41a6e6);
		Class54.method1176((byte) -124);
		Class55.method1179(-24181);
		Class61.method1200((byte) 53);
		Class23_Sub26.method911(true);
		Class91.method1456(-30192);
		Canvas_Sub1.method42(1000);
		Class107.method1583((byte) -126);
		Class17_Sub1.method191((byte) -80);
		Class78_Sub2.method1357(b ^ 0x72);
		Class40.method1108(b + 53);
		Class92.method1459((byte) -73);
		Class63.method1214(-75);
		Class23_Sub13_Sub8_Sub1.method680(70);
		Class6_Sub1.method88();
		Class12.method112();
		Class8.method97(124);
		Class15.method136();
		Class46.method1140((byte) 39);
		Class85.method1396();
		Class74.method1315(false);
		Class23_Sub12.method598((byte) 49);
		Class23_Sub14.method862((byte) -93);
		Class23_Sub16.method871(100);
		Class47.method1148(-109);
		Class23_Sub3.method244();
		Class101.method1513();
		Class1.method44(-96);
		Class23_Sub4.method257(true);
		Class23_Sub27.method913(20);
		Class35.method983(b ^ ~0x4853);
		Class88.method1429(75);
		Class56.method1183((byte) 125);
		Class23_Sub4_Sub20.method348((byte) 59);
		Class103.method1523(118);
		Class99.method1501(-117);
		Class23_Sub4_Sub23.method362(10);
		Class23_Sub4_Sub31.method397(true);
		Class23_Sub4_Sub35.method410((byte) 67);
		Class23_Sub4_Sub30.method392(true);
		Class23_Sub4_Sub9.method297((byte) 74);
		Class23_Sub4_Sub19.method345(b ^ ~0x77);
		Class23_Sub4_Sub17.method335(true);
		Class23_Sub4_Sub39.method425((byte) -22);
		Class23_Sub4_Sub36.method412(-22323);
		Class23_Sub4_Sub29.method383(69);
		Class23_Sub4_Sub25.method374(-2);
		Class23_Sub4_Sub10.method304(b + 4040);
		Class23_Sub4_Sub4.method284(true);
		Class23_Sub4_Sub27.method381(true);
		Class23_Sub4_Sub11.method308((byte) -95);
		Class23_Sub4_Sub5.method286((byte) 104);
		Class23_Sub4_Sub37.method416((byte) -23);
		Class23_Sub4_Sub22.method357(111);
		Class23_Sub4_Sub1.method272((byte) 49);
		Class23_Sub4_Sub23_Sub1.method363(-29876505);
		Class23_Sub4_Sub3.method280(0);
		Class23_Sub4_Sub28.method382(104);
		Class23_Sub4_Sub24.method372(5864);
		Class23_Sub4_Sub26.method377(false);
		Class23_Sub4_Sub8.method296(b ^ 0x39);
		Class23_Sub4_Sub16.method331(17);
		Class23_Sub4_Sub32.method403(-98);
		if (b == 56) {
			Class23_Sub4_Sub18.method338((byte) 93);
			Class23_Sub4_Sub13.method319(0);
			Class23_Sub4_Sub38.method420(0);
			Class23_Sub4_Sub34.method409(b + -10003);
			Class23_Sub4_Sub21.method352(-43);
			Class23_Sub4_Sub14.method324(true);
			Class23_Sub4_Sub33.method407(false);
			Class23_Sub4_Sub12.method312(6);
			Class23_Sub4_Sub6.method288(-31116);
			Class23_Sub4_Sub7.method290(6094);
			Class23_Sub4_Sub2.method279((byte) 2);
			Class71_Sub2.method1277(b ^ 0x7265);
			Class71.method1266((byte) -28);
			Class71_Sub2_Sub1.method1286((byte) 62);
			Class71_Sub3.method1289(-789436973);
			Class71_Sub1_Sub1.method1275((byte) 84);
			Class71_Sub1.method1270(false);
			Class23_Sub13_Sub1.method604(128);
			Class23_Sub13_Sub3.method615(11);
			Class23_Sub13_Sub9.method687(true);
			Class23_Sub13_Sub25.method856((byte) -113);
			Class23_Sub11.method596(true);
			Class23_Sub21.method889(2);
			Class23_Sub13_Sub2.method607(true);
			Class23_Sub24.method899((byte) -104);
			Class23_Sub15.method868(-111);
			Class87.method1404(-13896);
			Class87_Sub3.method1420(-118);
			Class87_Sub4.method1428((byte) 65);
			Class87_Sub2.method1412((byte) 64);
			Class87_Sub1.method1411((byte) 107);
		}
	}
	
	static {
		anInt1973 = 0;
		aClass16_1976 = Class38_Sub6.method1076((byte) 86, ")2");
		aClass16_1972 = Class38_Sub6.method1076((byte) 86, " more options");
		aClass16_1979 = aClass16_1972;
	}
}

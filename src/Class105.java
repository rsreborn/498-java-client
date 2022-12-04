/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class105
{
	protected int[] anIntArray1754;
	static int anInt1755;
	static int anInt1756;
	static int anInt1757;
	private int[] anIntArray1758;
	private int anInt1759;
	static int anInt1760;
	static int anInt1761;
	static int anInt1762;
	static int anInt1763;
	static int anInt1764;
	private boolean aBoolean1765;
	static int[] anIntArray1766;
	static Class89 aClass89_1767 = new Class89();
	static int anInt1768;
	static int anInt1769;
	static int anInt1770;
	private int[] anIntArray1771;
	static int anInt1772;
	static int anInt1773;
	private Class68[] aClass68Array1774;
	static int anInt1775;
	private int[] anIntArray1776;
	static int anInt1777;
	static int anInt1778;
	private Class68 aClass68_1779;
	private int[][] anIntArrayArray1780;
	protected int[] anIntArray1781;
	static int anInt1782;
	static int anInt1783;
	static int anInt1784;
	private Object[][] anObjectArrayArray1785;
	protected Object[] anObjectArray1786;
	protected int[] anIntArray1787;
	private int[][] anIntArrayArray1788;
	static int anInt1789;
	static int anInt1790;
	static int anInt1791;
	static int anInt1792;
	static int anInt1793;
	static int anInt1794;
	static int anInt1795;
	static int anInt1796;
	static int anInt1797;
	static int anInt1798;
	protected int anInt1799;
	static int anInt1800;
	private boolean aBoolean1801;
	static int anInt1802;
	static RSString aClass16_1803;
	static int anInt1804;
	private static RSString aClass16_1805 = Class38_Sub6.method1076((byte) 86, "cyan:");
	static boolean aBoolean1806 = false;
	static int anInt1807;
	static int anInt1808;
	static RSString aClass16_1809;
	static RSString aClass16_1810;
	static int anInt1811;
	static Class38_Sub7_Sub2 aClass38_Sub7_Sub2_1812;
	static int anInt1813;
	static int anInt1814;
	
	final byte[] method1532(int i, int i_0_) {
		anInt1768++;
		if (anIntArray1771.length == 1) {
			return method1544(i, 0, 0);
		}
		if (!method1564(i, -1)) {
			return null;
		}
		if (anIntArray1771[i] == 1) {
			return method1544(0, 0, i);
		}
		if (i_0_ != 18808) {
			method1559(false, false, (byte) 91);
		}
		throw new RuntimeException();
	}
	
	private final boolean method1533(byte b, int i, int i_1_) {
		int i_2_ = -70 % ((b - -33) / 63);
		anInt1814++;
		if ((i ^ 0xffffffff) > -1 || i_1_ < 0 || (i ^ 0xffffffff) <= (anIntArray1771.length ^ 0xffffffff) || (anIntArray1771[i] ^ 0xffffffff) >= (i_1_ ^ 0xffffffff)) {
			if (Class26.aBoolean394) {
				throw new IllegalArgumentException(String.valueOf(i) + "," + i_1_);
			}
			return false;
		}
		return true;
	}
	
	final boolean method1534(byte b) {
		anInt1800++;
		boolean bool = true;
		for (int i = 0; i < anIntArray1758.length; i++) {
			int i_3_ = anIntArray1758[i];
			if (anObjectArray1786[i_3_] == null) {
				method1552(false, i_3_);
				if (anObjectArray1786[i_3_] == null) {
					bool = false;
				}
			}
		}
		if (b != -13) {
			anObjectArray1786 = null;
		}
		return bool;
	}
	
	final void method1535(int i, RSString class16) {
		anInt1755++;
		class16 = class16.method152(i ^ ~0x30);
		int i_4_ = aClass68_1779.method1248(64, class16.method146(255));
		if (i != -1) {
			method1533((byte) -43, 41, 65);
		}
		method1547(i_4_, (byte) 65);
	}
	
	final byte[] method1536(RSString class16, RSString class16_5_, int i) {
		anInt1783++;
		class16 = class16.method152(48);
		class16_5_ = class16_5_.method152(48);
		int i_6_ = aClass68_1779.method1248(84, class16.method146(255));
		if (!method1564(i_6_, -1)) {
			return null;
		}
		if (i <= 59) {
			aClass16_1809 = null;
		}
		int i_7_ = aClass68Array1774[i_6_].method1248(121, class16_5_.method146(255));
		return method1544(i_7_, 0, i_6_);
	}
	
	final int[] method1537(int i, boolean bool) {
		anInt1797++;
		if (!method1564(i, -1)) {
			return null;
		}
		if (bool != false) {
			anIntArrayArray1788 = null;
		}
		int[] is = anIntArrayArray1780[i];
		if (is == null) {
			is = new int[anIntArray1754[i]];
			for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_8_++)
				is[i_8_] = i_8_;
		}
		return is;
	}
	
	static final void method1538(int i, Class38_Sub7 class38_sub7) {
		if (i != 1) {
			aClass16_1803 = null;
		}
		anInt1756++;
		class38_sub7.aBoolean2645 = false;
		if (class38_sub7.anInt2634 != -1) {
			Class23_Sub13_Sub22 class23_sub13_sub22 = Class7.method90(class38_sub7.anInt2634, (byte) 79);
			if (class23_sub13_sub22 != null && class23_sub13_sub22.anIntArray4203 != null) {
				class38_sub7.anInt2631++;
				if (class38_sub7.anInt2642 < class23_sub13_sub22.anIntArray4203.length && (class38_sub7.anInt2631 ^ 0xffffffff) < (class23_sub13_sub22.anIntArray4204[class38_sub7.anInt2642] ^ 0xffffffff)) {
					class38_sub7.anInt2642++;
					class38_sub7.anInt2631 = 1;
					Class21.method223(aClass38_Sub7_Sub2_1812 == class38_sub7, class38_sub7.anInt2642, class38_sub7.anInt2674, (byte) 64, class38_sub7.anInt2659, class23_sub13_sub22);
				}
				if (class38_sub7.anInt2642 >= class23_sub13_sub22.anIntArray4203.length) {
					class38_sub7.anInt2642 = 0;
					class38_sub7.anInt2631 = 0;
					Class21.method223(class38_sub7 == aClass38_Sub7_Sub2_1812, class38_sub7.anInt2642, class38_sub7.anInt2674, (byte) 113, class38_sub7.anInt2659, class23_sub13_sub22);
				}
			} else {
				class38_sub7.anInt2634 = -1;
			}
		}
		if ((class38_sub7.anInt2710 ^ 0xffffffff) != 0 && (class38_sub7.anInt2671 ^ 0xffffffff) >= (Class89.anInt1511 ^ 0xffffffff)) {
			if ((class38_sub7.anInt2695 ^ 0xffffffff) > -1) {
				class38_sub7.anInt2695 = 0;
			}
			int i_9_ = Class23_Sub13_Sub21.method827(class38_sub7.anInt2710, (byte) -123).anInt4059;
			if ((i_9_ ^ 0xffffffff) != 0) {
				Class23_Sub13_Sub22 class23_sub13_sub22 = Class7.method90(i_9_, (byte) 98);
				if (class23_sub13_sub22 == null || class23_sub13_sub22.anIntArray4203 == null) {
					class38_sub7.anInt2710 = -1;
				} else {
					class38_sub7.anInt2661++;
					if ((class23_sub13_sub22.anIntArray4203.length ^ 0xffffffff) < (class38_sub7.anInt2695 ^ 0xffffffff) && class38_sub7.anInt2661 > class23_sub13_sub22.anIntArray4204[class38_sub7.anInt2695]) {
						class38_sub7.anInt2661 = 1;
						class38_sub7.anInt2695++;
						Class21.method223(aClass38_Sub7_Sub2_1812 == class38_sub7, class38_sub7.anInt2695, class38_sub7.anInt2674, (byte) 80, class38_sub7.anInt2659, class23_sub13_sub22);
					}
					if ((class23_sub13_sub22.anIntArray4203.length ^ 0xffffffff) >= (class38_sub7.anInt2695 ^ 0xffffffff)) {
						class38_sub7.anInt2710 = -1;
					}
				}
			} else {
				class38_sub7.anInt2710 = -1;
			}
		}
		if ((class38_sub7.anInt2693 ^ 0xffffffff) != 0 && class38_sub7.anInt2706 <= 1) {
			Class23_Sub13_Sub22 class23_sub13_sub22 = Class7.method90(class38_sub7.anInt2693, (byte) 122);
			if (class23_sub13_sub22.anInt4227 == 1 && class38_sub7.anInt2640 > 0 && class38_sub7.anInt2684 <= Class89.anInt1511 && Class89.anInt1511 > class38_sub7.anInt2716) {
				class38_sub7.anInt2706 = 1;
				return;
			}
		}
		if ((class38_sub7.anInt2693 ^ 0xffffffff) != 0 && class38_sub7.anInt2706 == 0) {
			Class23_Sub13_Sub22 class23_sub13_sub22 = Class7.method90(class38_sub7.anInt2693, (byte) 101);
			if (class23_sub13_sub22 == null || class23_sub13_sub22.anIntArray4203 == null) {
				class38_sub7.anInt2693 = -1;
			} else {
				class38_sub7.anInt2664++;
				if (class23_sub13_sub22.anIntArray4203.length > class38_sub7.anInt2709 && class38_sub7.anInt2664 > class23_sub13_sub22.anIntArray4204[class38_sub7.anInt2709]) {
					class38_sub7.anInt2664 = 1;
					class38_sub7.anInt2709++;
					Class21.method223(aClass38_Sub7_Sub2_1812 == class38_sub7, class38_sub7.anInt2709, class38_sub7.anInt2674, (byte) 81, class38_sub7.anInt2659, class23_sub13_sub22);
				}
				if (class38_sub7.anInt2709 >= class23_sub13_sub22.anIntArray4203.length) {
					class38_sub7.anInt2709 -= class23_sub13_sub22.anInt4223;
					class38_sub7.anInt2643++;
					if (class23_sub13_sub22.anInt4218 <= class38_sub7.anInt2643) {
						class38_sub7.anInt2693 = -1;
					} else if ((class38_sub7.anInt2709 ^ 0xffffffff) > -1 || class38_sub7.anInt2709 >= class23_sub13_sub22.anIntArray4203.length) {
						class38_sub7.anInt2693 = -1;
					} else {
						Class21.method223(class38_sub7 == aClass38_Sub7_Sub2_1812, class38_sub7.anInt2709, class38_sub7.anInt2674, (byte) 59, class38_sub7.anInt2659, class23_sub13_sub22);
					}
				}
				class38_sub7.aBoolean2645 = class23_sub13_sub22.aBoolean4230;
			}
		}
		if ((class38_sub7.anInt2706 ^ 0xffffffff) < -1) {
			class38_sub7.anInt2706--;
		}
	}
	
	int method1539(int i, int i_10_) {
		if (i_10_ != -13574) {
			anIntArray1766 = null;
		}
		anInt1791++;
		if (!method1564(i, -1)) {
			return 0;
		}
		if (anObjectArray1786[i] == null) {
			return 0;
		}
		return 100;
	}
	
	final int method1540(int i, RSString class16) {
		class16 = class16.method152(48);
		int i_11_ = aClass68_1779.method1248(68, class16.method146(255));
		anInt1813++;
		if (!method1564(i_11_, -1)) {
			return -1;
		}
		if (i <= 67) {
			method1532(-122, 73);
		}
		return i_11_;
	}
	
	final int method1541(RSString class16, int i) {
		class16 = class16.method152(48);
		if (i <= 38) {
			method1545((byte) -61, 2L);
		}
		anInt1769++;
		int i_12_ = aClass68_1779.method1248(10, class16.method146(255));
		return method1539(i_12_, -13574);
	}
	
	final void method1542(int i, int i_13_) {
		anInt1773++;
		if (method1564(i_13_, -1)) {
			anObjectArrayArray1785[i_13_] = null;
			if (i != 1) {
				aClass89_1767 = null;
			}
		}
	}
	
	final int method1543(RSString class16, int i, int i_14_) {
		anInt1760++;
		if (!method1564(i_14_, -1)) {
			return -1;
		}
		if (i > -79) {
			aClass16_1805 = null;
		}
		class16 = class16.method152(48);
		int i_15_ = aClass68Array1774[i_14_].method1248(109, class16.method146(255));
		if (!method1533((byte) -104, i_14_, i_15_)) {
			return -1;
		}
		return i_15_;
	}
	
	final byte[] method1544(int i, int i_16_, int i_17_) {
		if (i_16_ != 0) {
			return null;
		}
		anInt1764++;
		return method1546(i_17_, i_16_ ^ ~0x79, i, null);
	}
	
	static final void method1545(byte b, long l) {
		anInt1804++;
		if ((l ^ 0xffffffffffffffffL) < -1L) {
			if (b > -65) {
				method1545((byte) -54, -99L);
			}
			if (l % 10L == 0L) {
				Class49.method1153((byte) -93, -1L + l);
				Class49.method1153((byte) -79, 1L);
			} else {
				Class49.method1153((byte) -77, l);
			}
		}
	}
	
	final byte[] method1546(int i, int i_18_, int i_19_, int[] is) {
		anInt1763++;
		if (!method1533((byte) 122, i, i_19_)) {
			return null;
		}
		if (i_18_ >= -118) {
			aClass16_1805 = null;
		}
		if (anObjectArrayArray1785[i] == null || anObjectArrayArray1785[i][i_19_] == null) {
			boolean bool = method1563(-2, is, i);
			if (!bool) {
				method1552(false, i);
				bool = method1563(-2, is, i);
				if (!bool) {
					return null;
				}
			}
		}
		byte[] bs = Class73.method1311(-116, false, anObjectArrayArray1785[i][i_19_]);
		if (aBoolean1801) {
			anObjectArrayArray1785[i][i_19_] = null;
			if (anIntArray1771[i] == 1) {
				anObjectArrayArray1785[i] = null;
			}
		}
		return bs;
	}
	
	void method1547(int i, byte b) {
		anInt1789++;
		if (b <= 64) {
			anInt1811 = 62;
		}
	}
	
	final void method1548(int i) {
		anInt1796++;
		int i_20_ = 0;
		if (i == -25035) {
			for (/**/; (i_20_ ^ 0xffffffff) > (anObjectArrayArray1785.length ^ 0xffffffff); i_20_++)
				anObjectArrayArray1785[i_20_] = null;
		}
	}
	
	final boolean method1549(int i, int i_21_) {
		anInt1770++;
		if (anIntArray1771.length == 1) {
			return method1562(-14250, 0, i_21_);
		}
		if (i != -13114) {
			return false;
		}
		if (!method1564(i_21_, i ^ 0x3339)) {
			return false;
		}
		if (anIntArray1771[i_21_] == 1) {
			return method1562(-14250, i_21_, 0);
		}
		throw new RuntimeException();
	}
	
	final int method1550(byte b) {
		if (b < 122) {
			anIntArray1754 = null;
		}
		anInt1761++;
		int i = 0;
		int i_22_ = 0;
		for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > (anObjectArray1786.length ^ 0xffffffff); i_23_++) {
			if ((anIntArray1754[i_23_] ^ 0xffffffff) < -1) {
				i_22_ += method1539(i_23_, -13574);
				i += 100;
			}
		}
		if (i == 0) {
			return 100;
		}
		int i_24_ = 100 * i_22_ / i;
		return i_24_;
	}
	
	final void method1551(byte b, byte[] bs) {
		anInt1762++;
		anInt1799 = Class23_Sub27.method912(bs.length, bs, 25);
		Buffer class23_sub5 = new Buffer(Class69.method1258(b ^ ~0x61, bs));
		int i = class23_sub5.readUByte();
		if (i != 5 && i != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + i);
		}
		if (i >= 6) {
			class23_sub5.readUIntBE();
		}
		int i_25_ = 0;
		int i_26_ = class23_sub5.readUByte();
		int i_27_ = -1;
		anInt1759 = class23_sub5.getUShortBE();
		anIntArray1758 = new int[anInt1759];
		for (int i_28_ = 0; anInt1759 > i_28_; i_28_++) {
			anIntArray1758[i_28_] = i_25_ += class23_sub5.getUShortBE();
			if (i_27_ < anIntArray1758[i_28_]) {
				i_27_ = anIntArray1758[i_28_];
			}
		}
		anObjectArrayArray1785 = new Object[i_27_ - -1][];
		anIntArrayArray1780 = new int[i_27_ + 1][];
		anIntArray1787 = new int[i_27_ - -1];
		anIntArray1771 = new int[i_27_ + 1];
		anIntArray1781 = new int[1 + i_27_];
		anObjectArray1786 = new Object[1 + i_27_];
		anIntArray1754 = new int[1 + i_27_];
		if (i_26_ != 0) {
			anIntArray1776 = new int[1 + i_27_];
			for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > (1 + i_27_ ^ 0xffffffff); i_29_++)
				anIntArray1776[i_29_] = -1;
			for (int i_30_ = 0; (anInt1759 ^ 0xffffffff) < (i_30_ ^ 0xffffffff); i_30_++)
				anIntArray1776[anIntArray1758[i_30_]] = class23_sub5.readUIntBE();
			aClass68_1779 = new Class68(anIntArray1776);
		}
		for (int i_31_ = 0; (anInt1759 ^ 0xffffffff) < (i_31_ ^ 0xffffffff); i_31_++)
			anIntArray1781[anIntArray1758[i_31_]] = class23_sub5.readUIntBE();
		for (int i_32_ = 0; i_32_ < anInt1759; i_32_++)
			anIntArray1787[anIntArray1758[i_32_]] = class23_sub5.readUIntBE();
		if (b != -98) {
			method1551((byte) 74, null);
		}
		for (int i_33_ = 0; anInt1759 > i_33_; i_33_++)
			anIntArray1754[anIntArray1758[i_33_]] = class23_sub5.getUShortBE();
		for (int i_34_ = 0; (i_34_ ^ 0xffffffff) > (anInt1759 ^ 0xffffffff); i_34_++) {
			i_25_ = 0;
			int i_35_ = anIntArray1758[i_34_];
			int i_36_ = anIntArray1754[i_35_];
			int i_37_ = -1;
			anIntArrayArray1780[i_35_] = new int[i_36_];
			for (int i_38_ = 0; i_36_ > i_38_; i_38_++) {
				int i_39_ = anIntArrayArray1780[i_35_][i_38_] = i_25_ += class23_sub5.getUShortBE();
				if ((i_39_ ^ 0xffffffff) < (i_37_ ^ 0xffffffff)) {
					i_37_ = i_39_;
				}
			}
			anIntArray1771[i_35_] = i_37_ - -1;
			if ((i_36_ ^ 0xffffffff) == (1 + i_37_ ^ 0xffffffff)) {
				anIntArrayArray1780[i_35_] = null;
			}
		}
		if ((i_26_ ^ 0xffffffff) != -1) {
			anIntArrayArray1788 = new int[1 + i_27_][];
			aClass68Array1774 = new Class68[i_27_ - -1];
			for (int i_40_ = 0; (anInt1759 ^ 0xffffffff) < (i_40_ ^ 0xffffffff); i_40_++) {
				int i_41_ = anIntArray1758[i_40_];
				int i_42_ = anIntArray1754[i_41_];
				anIntArrayArray1788[i_41_] = new int[anIntArray1771[i_41_]];
				for (int i_43_ = 0; (i_43_ ^ 0xffffffff) > (anIntArray1771[i_41_] ^ 0xffffffff); i_43_++)
					anIntArrayArray1788[i_41_][i_43_] = -1;
				for (int i_44_ = 0; i_44_ < i_42_; i_44_++) {
					int i_45_;
					if (anIntArrayArray1780[i_41_] != null) {
						i_45_ = anIntArrayArray1780[i_41_][i_44_];
					} else {
						i_45_ = i_44_;
					}
					anIntArrayArray1788[i_41_][i_45_] = class23_sub5.readUIntBE();
				}
				aClass68Array1774[i_41_] = new Class68(anIntArrayArray1788[i_41_]);
			}
		}
	}
	
	void method1552(boolean bool, int i) {
		if (bool != false) {
			method1551((byte) -102, null);
		}
		anInt1757++;
	}
	
	public static void method1553(int i) {
		aClass89_1767 = null;
		if (i != -1) {
			aClass16_1809 = null;
		}
		aClass16_1803 = null;
		anIntArray1766 = null;
		aClass16_1810 = null;
		aClass16_1805 = null;
		aClass16_1809 = null;
		aClass38_Sub7_Sub2_1812 = null;
	}
	
	final boolean method1554(byte b, int i) {
		anInt1792++;
		if (!method1564(i, -1)) {
			return false;
		}
		if (anObjectArray1786[i] != null) {
			return true;
		}
		method1552(false, i);
		int i_46_ = -127 / ((b - -73) / 43);
		if (anObjectArray1786[i] != null) {
			return true;
		}
		return false;
	}
	
	final byte[] method1555(int i, int i_47_, int i_48_) {
		anInt1772++;
		if (!method1533((byte) 56, i_48_, i)) {
			return null;
		}
		if (anObjectArrayArray1785[i_48_] == null || anObjectArrayArray1785[i_48_][i] == null) {
			boolean bool = method1563(-2, null, i_48_);
			if (!bool) {
				method1552(false, i_48_);
				bool = method1563(-2, null, i_48_);
				if (!bool) {
					return null;
				}
			}
		}
		if (i_47_ != 15059) {
			return null;
		}
		byte[] bs = Class73.method1311(-86, false, anObjectArrayArray1785[i_48_][i]);
		return bs;
	}
	
	final int method1556(int i) {
		int i_49_ = 31 % ((i - 54) / 46);
		anInt1793++;
		return anIntArray1771.length;
	}
	
	static final void method1557(boolean bool, byte b, Class23_Sub13_Sub8_Sub1_Sub1 class23_sub13_sub8_sub1_sub1, Class105 class105, Class105 class105_50_) {
		Class95.aClass105_1615 = class105;
		anInt1784++;
		Class23_Sub4_Sub27.aBoolean3341 = bool;
		Class39.aClass105_620 = class105_50_;
		int i = Class39.aClass105_620.method1556(-119) - 1;
		Class30.anInt477 = 256 * i - -Class39.aClass105_620.method1558(26143, i);
		if (b == 119) {
			Class54.aClass23_Sub13_Sub8_Sub1_Sub1_852 = class23_sub13_sub8_sub1_sub1;
		}
	}
	
	final int method1558(int i, int i_51_) {
		anInt1795++;
		if (!method1564(i_51_, -1)) {
			return 0;
		}
		if (i != 26143) {
			anIntArrayArray1780 = null;
		}
		return anIntArray1771[i_51_];
	}
	
	final void method1559(boolean bool, boolean bool_52_, byte b) {
		if (bool) {
			anIntArray1776 = null;
			aClass68_1779 = null;
		}
		if (bool_52_) {
			aClass68Array1774 = null;
			anIntArrayArray1788 = null;
		}
		anInt1778++;
		if (b <= 4) {
			anIntArrayArray1788 = null;
		}
	}
	
	final boolean method1560(RSString class16, int i) {
		int i_53_ = method1540(82, Class39.aClass16_619);
		anInt1775++;
		if (i_53_ != i) {
			return method1565(i + -80, Class39.aClass16_619, class16);
		}
		return method1565(-45, class16, Class39.aClass16_619);
	}
	
	final boolean method1561(int i, RSString class16) {
		class16 = class16.method152(48);
		int i_54_ = aClass68_1779.method1248(119, class16.method146(255));
		if (i > -52) {
			return true;
		}
		anInt1807++;
		return method1554((byte) -121, i_54_);
	}
	
	final boolean method1562(int i, int i_55_, int i_56_) {
		anInt1782++;
		if (i != -14250) {
			aBoolean1806 = false;
		}
		if (!method1533((byte) 52, i_55_, i_56_)) {
			return false;
		}
		if (anObjectArrayArray1785[i_55_] != null && anObjectArrayArray1785[i_55_][i_56_] != null) {
			return true;
		}
		if (anObjectArray1786[i_55_] != null) {
			return true;
		}
		method1552(false, i_55_);
		if (anObjectArray1786[i_55_] != null) {
			return true;
		}
		return false;
	}
	
	private final boolean method1563(int i, int[] is, int i_57_) {
		anInt1798++;
		if (!method1564(i_57_, i ^ 0x1)) {
			return false;
		}
		if (anObjectArray1786[i_57_] == null) {
			return false;
		}
		int i_58_ = anIntArray1754[i_57_];
		int[] is_59_ = anIntArrayArray1780[i_57_];
		if (anObjectArrayArray1785[i_57_] == null) {
			anObjectArrayArray1785[i_57_] = new Object[anIntArray1771[i_57_]];
		}
		Object[] objects = anObjectArrayArray1785[i_57_];
		boolean bool = true;
		for (int i_60_ = 0; (i_58_ ^ 0xffffffff) < (i_60_ ^ 0xffffffff); i_60_++) {
			int i_61_;
			if (is_59_ != null) {
				i_61_ = is_59_[i_60_];
			} else {
				i_61_ = i_60_;
			}
			if (objects[i_61_] == null) {
				bool = false;
				break;
			}
		}
		if (bool) {
			return true;
		}
		byte[] bs;
		if (is == null || is[0] == 0 && is[1] == 0 && (is[2] ^ 0xffffffff) == -1 && is[3] == 0) {
			bs = Class73.method1311(i ^ 0x77, false, anObjectArray1786[i_57_]);
		} else {
			bs = Class73.method1311(-120, true, anObjectArray1786[i_57_]);
			Buffer class23_sub5 = new Buffer(bs);
			class23_sub5.method469(5, class23_sub5.payload.length, (byte) 75, is);
		}
		byte[] bs_62_ = Class69.method1258(0, bs);
		if (aBoolean1765) {
			anObjectArray1786[i_57_] = null;
		}
		if (i > (i_58_ ^ 0xffffffff)) {
			int[] is_63_ = new int[i_58_];
			int i_64_ = bs_62_.length;
			int i_65_ = 0xff & bs_62_[--i_64_];
			Buffer class23_sub5 = new Buffer(bs_62_);
			i_64_ -= 4 * (i_65_ * i_58_);
			class23_sub5.pos = i_64_;
			for (int i_66_ = 0; (i_66_ ^ 0xffffffff) > (i_65_ ^ 0xffffffff); i_66_++) {
				int i_67_ = 0;
				for (int i_68_ = 0; (i_58_ ^ 0xffffffff) < (i_68_ ^ 0xffffffff); i_68_++) {
					i_67_ += class23_sub5.readUIntBE();
					is_63_[i_68_] += i_67_;
				}
			}
			byte[][] bs_69_ = new byte[i_58_][];
			for (int i_70_ = 0; i_70_ < i_58_; i_70_++) {
				bs_69_[i_70_] = new byte[is_63_[i_70_]];
				is_63_[i_70_] = 0;
			}
			int i_71_ = 0;
			class23_sub5.pos = i_64_;
			for (int i_72_ = 0; (i_65_ ^ 0xffffffff) < (i_72_ ^ 0xffffffff); i_72_++) {
				int i_73_ = 0;
				for (int i_74_ = 0; i_58_ > i_74_; i_74_++) {
					i_73_ += class23_sub5.readUIntBE();
					Class3.method56(bs_62_, i_71_, bs_69_[i_74_], is_63_[i_74_], i_73_);
					i_71_ += i_73_;
					is_63_[i_74_] += i_73_;
				}
			}
			for (int i_75_ = 0; i_75_ < i_58_; i_75_++) {
				int i_76_;
				if (is_59_ == null) {
					i_76_ = i_75_;
				} else {
					i_76_ = is_59_[i_75_];
				}
				if (aBoolean1801) {
					objects[i_76_] = bs_69_[i_75_];
				} else {
					objects[i_76_] = Class23_Sub13_Sub12.method746(bs_69_[i_75_], true, false);
				}
			}
		} else {
			int i_77_;
			if (is_59_ == null) {
				i_77_ = 0;
			} else {
				i_77_ = is_59_[0];
			}
			if (aBoolean1801) {
				objects[i_77_] = bs_62_;
			} else {
				objects[i_77_] = Class23_Sub13_Sub12.method746(bs_62_, true, false);
			}
		}
		return true;
	}
	
	final boolean method1564(int i, int i_78_) {
		anInt1790++;
		if ((i ^ 0xffffffff) > i_78_ || (i ^ 0xffffffff) <= (anIntArray1771.length ^ 0xffffffff) || anIntArray1771[i] == 0) {
			if (Class26.aBoolean394) {
				throw new IllegalArgumentException(Integer.toString(i));
			}
			return false;
		}
		return true;
	}
	
	final boolean method1565(int i, RSString class16, RSString class16_79_) {
		class16 = class16.method152(48);
		anInt1794++;
		class16_79_ = class16_79_.method152(48);
		int i_80_ = aClass68_1779.method1248(107, class16.method146(255));
		if (!method1564(i_80_, -1)) {
			return false;
		}
		int i_81_ = aClass68Array1774[i_80_].method1248(43, class16_79_.method146(255));
		int i_82_ = 48 / ((16 - i) / 55);
		return method1562(-14250, i_80_, i_81_);
	}
	
	Class105(boolean bool, boolean bool_83_) {
		aBoolean1765 = bool;
		aBoolean1801 = bool_83_;
	}
	
	static {
		aClass16_1803 = aClass16_1805;
		aClass16_1810 = Class38_Sub6.method1076((byte) 86, "(Y<)4col>");
		anInt1811 = 0;
		aClass16_1809 = aClass16_1805;
	}
}

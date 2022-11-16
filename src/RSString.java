/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.net.MalformedURLException;
import java.net.URL;

public class RSString implements Interface4
{
	static int anInt1891;
	static int anInt1892;
	static int anInt1893;
	static int anInt1894;
	static int anInt1895;
	protected int anInt1896;
	static int anInt1897;
	static int anInt1898;
	static int anInt1899;
	static int anInt1900;
	static Class23_Sub13_Sub5 aClass23_Sub13_Sub5_1901 = new Class23_Sub13_Sub5();
	static int anInt1902;
	private boolean aBoolean1903 = true;
	static int anInt1904;
	static int anInt1905;
	protected byte[] aByteArray1906;
	static int anInt1907;
	static int anInt1908;
	static int anInt1909;
	static int anInt1910;
	static int anInt1911;
	static int anInt1912;
	static int anInt1913;
	static int anInt1914;
	static int anInt1915;
	private int anInt1916;
	static int anInt1917;
	static int anInt1918;
	static int anInt1919;
	static int anInt1920;
	static int anInt1921;
	static int anInt1922;
	static int anInt1923;
	static int anInt1924;
	static int anInt1925;
	static int anInt1926;
	static int anInt1927;
	static int anInt1928;
	static int anInt1929;
	static int anInt1930;
	static int anInt1931;
	static int anInt1932;
	static int anInt1933;
	static int anInt1934;
	static int anInt1935;
	static int anInt1936;
	static int anInt1937;
	static int anInt1938;
	static int anInt1939;
	static int anInt1940;
	static int anInt1941;
	static int anInt1942;
	static int anInt1943;
	static int anInt1944;
	static int anInt1945;
	static RSString aClass16_1946 = Class38_Sub6.method1076((byte) 86, "(U3");
	static Class105 aClass105_1947;
	private static RSString aClass16_1948 = Class38_Sub6.method1076((byte) 86, "Login");
	static RSString aClass16_1949 = aClass16_1948;
	static int anInt1950;
	static Class89 aClass89_1951 = new Class89();
	static RSString aClass16_1952 = Class38_Sub6.method1076((byte) 86, ":assistreq:");
	/*synthetic*/ static Class aClass1953;
	
	final int method137(int i, int i_0_, int i_1_, byte[] bs, int i_2_) {
		if (i_2_ != 2514) {
			return -119;
		}
		anInt1920++;
		Class3.method56(aByteArray1906, i, bs, i_0_, -i + i_1_);
		return -i + i_1_;
	}
	
	final RSString method138(byte b, int i) {
		anInt1918++;
		if (b < 64) {
			method147(true);
		}
		return method148(anInt1896, i, true);
	}
	
	static final void method139(byte b) {
		anInt1904++;
		Class91.method1450(b, Class23_Sub4_Sub8.aClass64_3028);
		Class17.anInt304++;
		if (!Class23_Sub4_Sub39.aBoolean3516 || !Class72.aBoolean1310) {
			if (Class17.anInt304 > 1) {
				Class23_Sub4_Sub8.aClass64_3028 = null;
			}
		} else {
			int i = Class102.anInt1701;
			i -= Class23_Sub13_Sub15.anInt4034;
			if (i < Class64.anInt1082) {
				i = Class64.anInt1082;
			}
			int i_3_ = Class23_Sub4_Sub14.anInt3126;
			if ((Class23_Sub4_Sub8.aClass64_3028.anInt999 + i ^ 0xffffffff) < (Class64.anInt1082 + Class64.aClass64_1102.anInt999 ^ 0xffffffff)) {
				i = -Class23_Sub4_Sub8.aClass64_3028.anInt999 + Class64.anInt1082 + Class64.aClass64_1102.anInt999;
			}
			int i_4_ = i + -Class102.anInt1712;
			i_3_ -= Class23_Sub4_Sub10.anInt3059;
			int i_5_ = Class23_Sub4_Sub8.aClass64_3028.anInt1041;
			if ((i_3_ ^ 0xffffffff) > (Class48.anInt751 ^ 0xffffffff)) {
				i_3_ = Class48.anInt751;
			}
			if (i_3_ + Class23_Sub4_Sub8.aClass64_3028.anInt1128 > Class48.anInt751 - -Class64.aClass64_1102.anInt1128) {
				i_3_ = -Class23_Sub4_Sub8.aClass64_3028.anInt1128 + (Class64.aClass64_1102.anInt1128 + Class48.anInt751);
			}
			int i_6_ = i_3_ - Class23_Sub4_Sub7.anInt3027;
			if (Class23_Sub4_Sub8.aClass64_3028.anInt1024 < Class17.anInt304 && (i_5_ < i_6_ || i_6_ < -i_5_ || i_5_ < i_4_ || i_4_ < -i_5_)) {
				Class17_Sub1.aBoolean2003 = true;
			}
			int i_7_ = Class64.aClass64_1102.anInt1009 + -Class48.anInt751 + i_3_;
			int i_8_ = -Class64.anInt1082 + i - -Class64.aClass64_1102.anInt1083;
			if (Class23_Sub4_Sub8.aClass64_3028.anObjectArray1053 != null && Class17_Sub1.aBoolean2003) {
				Class23_Sub9 class23_sub9 = new Class23_Sub9();
				class23_sub9.aClass64_2263 = Class23_Sub4_Sub8.aClass64_3028;
				class23_sub9.anObjectArray2274 = Class23_Sub4_Sub8.aClass64_3028.anObjectArray1053;
				class23_sub9.anInt2258 = i_8_;
				class23_sub9.anInt2264 = i_7_;
				Class91.method1452(class23_sub9, (byte) -113);
			}
			if ((Class8.anInt175 ^ 0xffffffff) == -1) {
				if (!Class17_Sub1.aBoolean2003) {
					if ((Class95.anInt1612 == 1 || Class87_Sub4.method1425((byte) 126, -1 + Class23_Sub13_Sub9.anInt3863)) && Class23_Sub13_Sub9.anInt3863 > 2) {
						Class36.method986(false);
					} else if ((Class23_Sub13_Sub9.anInt3863 ^ 0xffffffff) < -1) {
						Class71_Sub1_Sub1.method1272((byte) -82, Class23_Sub13_Sub9.anInt3863 + -1);
					}
				} else {
					if (Class23_Sub4_Sub8.aClass64_3028.anObjectArray1066 != null) {
						Class23_Sub9 class23_sub9 = new Class23_Sub9();
						class23_sub9.aClass64_2255 = Class23_Sub13_Sub19.aClass64_4132;
						class23_sub9.anObjectArray2274 = Class23_Sub4_Sub8.aClass64_3028.anObjectArray1066;
						class23_sub9.aClass64_2263 = Class23_Sub4_Sub8.aClass64_3028;
						class23_sub9.anInt2258 = i_8_;
						class23_sub9.anInt2264 = i_7_;
						Class91.method1452(class23_sub9, (byte) -104);
					}
					if (Class23_Sub13_Sub19.aClass64_4132 != null && Class23_Sub4_Sub3.method281((byte) 116, Class23_Sub4_Sub8.aClass64_3028) != null) {
						Class23_Sub7.outBuffer.method486(234, 2976);
						Class23_Sub13_Sub22.anInt4220++;
						Class23_Sub7.outBuffer.method443(Class23_Sub13_Sub19.aClass64_4132.anInt1005, (byte) 51);
						Class23_Sub7.outBuffer.method445(Class23_Sub4_Sub8.aClass64_3028.anInt1098, (byte) 66);
						Class23_Sub7.outBuffer.method481(Class23_Sub13_Sub19.aClass64_4132.anInt1098, (byte) -67);
						Class23_Sub7.outBuffer.method463(-38, Class23_Sub4_Sub8.aClass64_3028.anInt1005);
					}
				}
				Class23_Sub4_Sub8.aClass64_3028 = null;
			}
		}
	}
	
	final boolean method140(RSString class16_9_, int i) {
		anInt1929++;
		if (class16_9_ == null) {
			return false;
		}
		if (class16_9_.anInt1896 != anInt1896) {
			return false;
		}
		for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (anInt1896 ^ 0xffffffff); i_10_++) {
			byte b = class16_9_.aByteArray1906[i_10_];
			if (b >= 65 && b <= 90 || b >= -64 && b <= -34 && b != -41) {
				b += 32;
			}
			byte b_11_ = aByteArray1906[i_10_];
			if (b_11_ >= 65 && b_11_ <= 90 || b_11_ >= -64 && b_11_ <= -34 && b_11_ != -41) {
				b_11_ += 32;
			}
			if ((b_11_ ^ 0xffffffff) != (b ^ 0xffffffff)) {
				return false;
			}
		}
		if (i != 40) {
			method152(-110);
		}
		return true;
	}
	
	final int method141(FontMetrics fontmetrics, int i) {
		anInt1907++;
		if (i != -32) {
			aClass16_1949 = null;
		}
		String string;
		try {
			string = new String(aByteArray1906, 0, anInt1896, "ISO-8859-1");
		} catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
			string = new String(aByteArray1906, 0, anInt1896);
		}
		return fontmetrics.stringWidth(string);
	}
	
	final int method142(boolean bool) {
		anInt1892++;
		if (bool != true) {
			aClass89_1951 = null;
		}
		return method159((byte) -22, 10);
	}
	
	final void method143(int i, Applet applet) throws Throwable {
		anInt1943++;
		String string = new String(aByteArray1906, i, anInt1896);
		Class80.method1364(string, -29116, applet);
	}
	
	static final int method144(int i, int i_12_, int i_13_, int i_14_) {
		anInt1899++;
		if ((Class23_Sub4_Sub30.aByteArrayArrayArray3379[i_14_][i_13_][i] & 0x8) != 0) {
			return 0;
		}
		if ((i_14_ ^ 0xffffffff) < -1 && (0x2 & Class23_Sub4_Sub30.aByteArrayArrayArray3379[1][i_13_][i] ^ 0xffffffff) != -1) {
			return i_14_ + -1;
		}
		if (i_12_ <= 19) {
			return -95;
		}
		return i_14_;
	}
	
	final RSString method145(byte b) {
		anInt1933++;
		if (b != -107) {
			return null;
		}
		RSString class16_15_ = Class83.method1376(-1, method184(-98));
		if (class16_15_ != null) {
			return class16_15_;
		}
		return Class98.aClass16_1652;
	}
	
	final int method146(int i) {
		if (i != 255) {
			aClass16_1946 = null;
		}
		anInt1914++;
		int i_16_ = 0;
		for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > (anInt1896 ^ 0xffffffff); i_17_++)
			i_16_ = (aByteArray1906[i_17_] & 0xff) + -i_16_ + (i_16_ << 5);
		return i_16_;
	}
	
	final byte[] method147(boolean bool) {
		anInt1934++;
		byte[] bs = new byte[anInt1896];
		Class3.method56(aByteArray1906, 0, bs, 0, anInt1896);
		if (bool != true) {
			aClass89_1951 = null;
		}
		return bs;
	}
	
	final RSString method148(int i, int i_18_, boolean bool) {
		if (bool != true) {
			method170(true);
		}
		anInt1925++;
		RSString class16_19_ = new RSString();
		class16_19_.anInt1896 = i + -i_18_;
		class16_19_.aByteArray1906 = new byte[-i_18_ + i];
		Class3.method56(aByteArray1906, i_18_, class16_19_.aByteArray1906, 0, class16_19_.anInt1896);
		return class16_19_;
	}
	
	final RSString method149(int i) {
		anInt1915++;
		RSString class16_20_ = new RSString();
		class16_20_.anInt1896 = anInt1896;
		if (i != 1) {
			return null;
		}
		class16_20_.aByteArray1906 = new byte[anInt1896];
		int i_21_ = 2;
		for (int i_22_ = 0; (anInt1896 ^ 0xffffffff) < (i_22_ ^ 0xffffffff); i_22_++) {
			byte b = aByteArray1906[i_22_];
			if (b >= 97 && b <= 122 || b >= -32 && b <= -2 && b != -9) {
				if (i_21_ == 2) {
					b -= 32;
				}
				i_21_ = 0;
			} else if (b >= 65 && b <= 90 || b >= -64 && b <= -34 && b != -41) {
				if (i_21_ == 0) {
					b += 32;
				}
				i_21_ = 0;
			} else if (b != 46 && b != 33 && b != 63) {
				if (b == 32) {
					if (i_21_ != 2) {
						i_21_ = 1;
					}
				} else {
					i_21_ = 1;
				}
			} else {
				i_21_ = 2;
			}
			class16_20_.aByteArray1906[i_22_] = b;
		}
		return class16_20_;
	}
	
	final boolean method150(RSString class16_23_, int i) {
		anInt1938++;
		if ((class16_23_.anInt1896 ^ 0xffffffff) < (anInt1896 ^ 0xffffffff)) {
			return false;
		}
		if (i != -22215) {
			method183(null, (byte) -79);
		}
		for (int i_24_ = 0; class16_23_.anInt1896 > i_24_; i_24_++) {
			byte b = class16_23_.aByteArray1906[i_24_];
			byte b_25_ = aByteArray1906[i_24_];
			if (b >= 65 && b <= 90 || b >= -64 && b <= -34 && b != -41) {
				b += 32;
			}
			if (b_25_ >= 65 && b_25_ <= 90 || b_25_ >= -64 && b_25_ <= -34 && b_25_ != -41) {
				b_25_ += 32;
			}
			if ((b_25_ ^ 0xffffffff) != (b ^ 0xffffffff)) {
				return false;
			}
		}
		return true;
	}
	
	final int method151(boolean bool, RSString class16_26_) {
		int i;
		if ((anInt1896 ^ 0xffffffff) >= (class16_26_.anInt1896 ^ 0xffffffff)) {
			i = anInt1896;
		} else {
			i = class16_26_.anInt1896;
		}
		anInt1911++;
		if (bool != true) {
			method161(-111, -51, null);
		}
		for (int i_27_ = 0; (i_27_ ^ 0xffffffff) > (i ^ 0xffffffff); i_27_++) {
			if ((aByteArray1906[i_27_] & 0xff) < (class16_26_.aByteArray1906[i_27_] & 0xff)) {
				return -1;
			}
			if ((class16_26_.aByteArray1906[i_27_] & 0xff) < (aByteArray1906[i_27_] & 0xff)) {
				return 1;
			}
		}
		if ((class16_26_.anInt1896 ^ 0xffffffff) < (anInt1896 ^ 0xffffffff)) {
			return -1;
		}
		if ((anInt1896 ^ 0xffffffff) < (class16_26_.anInt1896 ^ 0xffffffff)) {
			return 1;
		}
		return 0;
	}
	
	final RSString method152(int i) {
		if (i != 48) {
			method138((byte) -9, -22);
		}
		RSString class16_28_ = new RSString();
		anInt1913++;
		class16_28_.anInt1896 = anInt1896;
		class16_28_.aByteArray1906 = new byte[anInt1896];
		for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > (anInt1896 ^ 0xffffffff); i_29_++) {
			byte b = aByteArray1906[i_29_];
			if (b >= 65 && b <= 90 || b >= -64 && b <= -34 && b != -41) {
				b += 32;
			}
			class16_28_.aByteArray1906[i_29_] = b;
		}
		return class16_28_;
	}
	
	final URL method153(byte b) throws MalformedURLException {
		int i = -54 % ((-22 - b) / 47);
		anInt1917++;
		return new URL(new String(aByteArray1906, 0, anInt1896));
	}
	
	final RSString method154(byte b) {
		RSString class16_30_ = new RSString();
		anInt1940++;
		class16_30_.anInt1896 = anInt1896;
		boolean bool = true;
		class16_30_.aByteArray1906 = new byte[anInt1896];
		for (int i = 0; i < anInt1896; i++) {
			byte b_31_ = aByteArray1906[i];
			if (b_31_ == 95) {
				class16_30_.aByteArray1906[i] = (byte) 32;
				bool = true;
			} else if (b_31_ >= 97 && b_31_ <= 122 && bool) {
				class16_30_.aByteArray1906[i] = (byte) (-32 + b_31_);
				bool = false;
			} else {
				bool = false;
				class16_30_.aByteArray1906[i] = b_31_;
			}
		}
		if (b != 59) {
			method162(null, 26);
		}
		return class16_30_;
	}
	
	final RSString method155(byte b) {
		anInt1942++;
		RSString class16_32_ = new RSString();
		if (b != 59) {
			method176(null, (byte) 26);
		}
		class16_32_.anInt1896 = anInt1896;
		class16_32_.aByteArray1906 = new byte[anInt1896];
		for (int i = 0; (anInt1896 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
			class16_32_.aByteArray1906[i] = (byte) 42;
		return class16_32_;
	}
	
	final RSString method156(int i, int i_33_) {
		anInt1939++;
		if (i <= 0 || i > 255) {
			throw new IllegalArgumentException("invalid char:" + i);
		}
		if (!aBoolean1903) {
			throw new IllegalArgumentException();
		}
		anInt1916 = 0;
		if (aByteArray1906.length == anInt1896) {
			int i_34_;
			for (i_34_ = 1; (anInt1896 ^ 0xffffffff) <= (i_34_ ^ 0xffffffff); i_34_ += i_34_) {
				/* empty */
			}
			byte[] bs = new byte[i_34_];
			Class3.method56(aByteArray1906, 0, bs, 0, anInt1896);
			aByteArray1906 = bs;
		}
		if (i_33_ > -8) {
			return null;
		}
		aByteArray1906[anInt1896++] = (byte) i;
		return this;
	}
	
	final RSString method157(RSString class16_35_, byte b) {
		anInt1891++;
		if (!aBoolean1903) {
			throw new IllegalArgumentException();
		}
		if (b <= 94) {
			anInt1950 = -105;
		}
		anInt1916 = 0;
		if (aByteArray1906.length < anInt1896 - -class16_35_.anInt1896) {
			int i;
			for (i = 1; anInt1896 + class16_35_.anInt1896 > i; i += i) {
				/* empty */
			}
			byte[] bs = new byte[i];
			Class3.method56(aByteArray1906, 0, bs, 0, anInt1896);
			aByteArray1906 = bs;
		}
		Class3.method56(class16_35_.aByteArray1906, 0, aByteArray1906, anInt1896, class16_35_.anInt1896);
		anInt1896 += class16_35_.anInt1896;
		return this;
	}
	
	final void method158(int i) {
		String string;
		try {
			if (i >= -103) {
				aClass16_1952 = null;
			}
			string = new String(aByteArray1906, 0, anInt1896, "ISO-8859-1");
		} catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
			string = new String(aByteArray1906, 0, anInt1896);
		}
		anInt1928++;
		System.out.println(string);
	}
	
	final int method159(byte b, int i) {
		if (b != -22) {
			method142(false);
		}
		anInt1937++;
		if (i < 1 || i > 36) {
			i = 10;
		}
		boolean bool = false;
		boolean bool_36_ = false;
		int i_37_ = 0;
		for (int i_38_ = 0; i_38_ < anInt1896; i_38_++) {
			int i_39_ = 0xff & aByteArray1906[i_38_];
			if ((i_38_ ^ 0xffffffff) == -1) {
				if (i_39_ == 45) {
					bool = true;
					continue;
				}
				if (i_39_ == 43) {
					continue;
				}
			}
			if (i_39_ < 48 || i_39_ > 57) {
				if (i_39_ >= 65 && i_39_ <= 90) {
					i_39_ -= 55;
				} else if (i_39_ >= 97 && i_39_ <= 122) {
					i_39_ -= 87;
				} else {
					throw new NumberFormatException();
				}
			} else {
				i_39_ -= 48;
			}
			if (i <= i_39_) {
				throw new NumberFormatException();
			}
			if (bool) {
				i_39_ = -i_39_;
			}
			int i_40_ = i_39_ + i_37_ * i;
			if (i_37_ != i_40_ / i) {
				throw new NumberFormatException();
			}
			i_37_ = i_40_;
			bool_36_ = true;
		}
		if (!bool_36_) {
			throw new NumberFormatException();
		}
		return i_37_;
	}
	
	static final RuntimeException_Sub1 method160(Throwable throwable, String string) {
		anInt1923++;
		RuntimeException_Sub1 runtimeexception_sub1;
		if (throwable instanceof RuntimeException_Sub1) {
			runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			runtimeexception_sub1.aString1850 += ' ' + (String) string;
		} else {
			runtimeexception_sub1 = new RuntimeException_Sub1(throwable, string);
		}
		return runtimeexception_sub1;
	}
	
	final int method161(int i, int i_41_, RSString class16_42_) {
		anInt1932++;
		int[] is = new int[class16_42_.anInt1896];
		int[] is_43_ = new int[256];
		int[] is_44_ = new int[class16_42_.anInt1896];
		for (int i_45_ = 0; is_43_.length > i_45_; i_45_++)
			is_43_[i_45_] = class16_42_.anInt1896;
		for (int i_46_ = 1; (class16_42_.anInt1896 ^ 0xffffffff) <= (i_46_ ^ 0xffffffff); i_46_++) {
			is[i_46_ + -1] = -i_46_ + (class16_42_.anInt1896 << 1);
			is_43_[Class24.method919(255, class16_42_.aByteArray1906[-1 + i_46_])] = class16_42_.anInt1896 + -i_46_;
		}
		int i_47_ = class16_42_.anInt1896 + 1;
		int i_48_ = class16_42_.anInt1896;
		while ((i_48_ ^ 0xffffffff) < -1) {
			is_44_[-1 + i_48_] = i_47_;
			for (/**/; i_47_ <= class16_42_.anInt1896 && class16_42_.aByteArray1906[-1 + i_47_] != class16_42_.aByteArray1906[i_48_ - 1]; i_47_ = is_44_[-1 + i_47_]) {
				if ((-i_48_ + class16_42_.anInt1896 ^ 0xffffffff) >= (is[i_47_ + -1] ^ 0xffffffff)) {
					is[-1 + i_47_] = class16_42_.anInt1896 - i_48_;
				}
			}
			i_48_--;
			i_47_--;
		}
		int i_49_ = 1;
		int i_50_ = i_47_;
		i_47_ = -i_50_ + class16_42_.anInt1896 + 1;
		int i_51_ = 0;
		for (int i_52_ = 1; i_52_ <= i_47_; i_52_++) {
			is_44_[i_52_ + -1] = i_51_;
			for (/**/; i_51_ >= 1 && (class16_42_.aByteArray1906[-1 + i_52_] ^ 0xffffffff) != (class16_42_.aByteArray1906[i_51_ - 1] ^ 0xffffffff); i_51_ = is_44_[i_51_ + -1]) {
				/* empty */
			}
			i_51_++;
		}
		if (i > -5) {
			return 78;
		}
		while (i_50_ < class16_42_.anInt1896) {
			for (int i_53_ = i_49_; (i_53_ ^ 0xffffffff) >= (i_50_ ^ 0xffffffff); i_53_++) {
				if ((-i_53_ + class16_42_.anInt1896 - -i_50_ ^ 0xffffffff) >= (is[-1 + i_53_] ^ 0xffffffff)) {
					is[i_53_ + -1] = -i_53_ + i_50_ + class16_42_.anInt1896;
				}
			}
			i_49_ = i_50_ - -1;
			i_50_ = i_47_ + i_50_ + -is_44_[i_47_ - 1];
			i_47_ = is_44_[-1 + i_47_];
		}
		int i_54_;
		for (int i_55_ = -1 + class16_42_.anInt1896 + i_41_; i_55_ < anInt1896; i_55_ += Math.max(is_43_[aByteArray1906[i_55_] & 0xff], is[i_54_])) {
			for (i_54_ = -1 + class16_42_.anInt1896; (i_54_ ^ 0xffffffff) <= -1 && class16_42_.aByteArray1906[i_54_] == aByteArray1906[i_55_]; i_54_--)
				i_55_--;
			if (i_54_ == -1) {
				return 1 + i_55_;
			}
		}
		return -1;
	}
	
	final boolean method162(RSString class16_56_, int i) {
		anInt1941++;
		if (anInt1896 < class16_56_.anInt1896) {
			return false;
		}
		int i_57_ = -class16_56_.anInt1896 + anInt1896;
		for (int i_58_ = i; i_58_ < class16_56_.anInt1896; i_58_++) {
			if ((class16_56_.aByteArray1906[i_58_] ^ 0xffffffff) != (aByteArray1906[i_57_ + i_58_] ^ 0xffffffff)) {
				return false;
			}
		}
		return true;
	}
	
	private final boolean method163(int i, int i_59_) {
		if (i < 1 || i > 36) {
			i = 10;
		}
		int i_60_ = 40 / ((i_59_ - 59) / 46);
		anInt1912++;
		boolean bool = false;
		boolean bool_61_ = false;
		int i_62_ = 0;
		for (int i_63_ = 0; (anInt1896 ^ 0xffffffff) < (i_63_ ^ 0xffffffff); i_63_++) {
			int i_64_ = 0xff & aByteArray1906[i_63_];
			if (i_63_ == 0) {
				if (i_64_ == 45) {
					bool_61_ = true;
					continue;
				}
				if (i_64_ == 43) {
					continue;
				}
			}
			if (i_64_ >= 48 && i_64_ <= 57) {
				i_64_ -= 48;
			} else if (i_64_ < 65 || i_64_ > 90) {
				if (i_64_ >= 97 && i_64_ <= 122) {
					i_64_ -= 87;
				} else {
					return false;
				}
			} else {
				i_64_ -= 55;
			}
			if ((i ^ 0xffffffff) >= (i_64_ ^ 0xffffffff)) {
				return false;
			}
			if (bool_61_) {
				i_64_ = -i_64_;
			}
			int i_65_ = i_64_ + i * i_62_;
			if (i_65_ / i != i_62_) {
				return false;
			}
			bool = true;
			i_62_ = i_65_;
		}
		return bool;
	}
	
	final void method164(int i, int i_66_, Graphics graphics, int i_67_) {
		anInt1910++;
		String string;
		try {
			string = new String(aByteArray1906, 0, anInt1896, "ISO-8859-1");
		} catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
			string = new String(aByteArray1906, 0, anInt1896);
		}
		graphics.drawString(string, i_67_, i);
		if (i_66_ != 22218) {
			aClass23_Sub13_Sub5_1901 = null;
		}
	}
	
	final RSString method165(int i, int i_68_) {
		anInt1909++;
		if ((i_68_ ^ 0xffffffff) >= -1 || i_68_ > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		RSString class16_69_ = new RSString();
		class16_69_.aByteArray1906 = new byte[1 + anInt1896];
		class16_69_.anInt1896 = anInt1896 - -1;
		Class3.method56(aByteArray1906, 0, class16_69_.aByteArray1906, 0, anInt1896);
		int i_70_ = 21 % ((i - -69) / 39);
		class16_69_.aByteArray1906[anInt1896] = (byte) i_68_;
		return class16_69_;
	}
	
	final int method166(byte b, int i) {
		if (b <= 87) {
			method140(null, -12);
		}
		anInt1898++;
		return 0xff & aByteArray1906[i];
	}
	
	RSString() {
		/* empty */
	}
	
	final int method167(RSString class16_71_, int i) {
		anInt1930++;
		int i_72_;
		if (class16_71_.anInt1896 < anInt1896) {
			i_72_ = class16_71_.anInt1896;
		} else {
			i_72_ = anInt1896;
		}
		if (i != -224) {
			aClass16_1946 = null;
		}
		for (int i_73_ = 0; (i_73_ ^ 0xffffffff) > (i_72_ ^ 0xffffffff); i_73_++) {
			if ((Class23_Sub10_Sub2.anIntArray3634[aByteArray1906[i_73_] & 0xff] ^ 0xffffffff) > (Class23_Sub10_Sub2.anIntArray3634[0xff & class16_71_.aByteArray1906[i_73_]] ^ 0xffffffff)) {
				return -1;
			}
			if ((Class23_Sub10_Sub2.anIntArray3634[class16_71_.aByteArray1906[i_73_] & 0xff] ^ 0xffffffff) > (Class23_Sub10_Sub2.anIntArray3634[aByteArray1906[i_73_] & 0xff] ^ 0xffffffff)) {
				return 1;
			}
		}
		if ((class16_71_.anInt1896 ^ 0xffffffff) < (anInt1896 ^ 0xffffffff)) {
			return -1;
		}
		if ((class16_71_.anInt1896 ^ 0xffffffff) > (anInt1896 ^ 0xffffffff)) {
			return 1;
		}
		return 0;
	}
	
	final RSString[] method168(boolean bool, int i) {
		anInt1902++;
		int i_74_ = 0;
		int i_75_ = 0;
		if (bool != false) {
			aClass16_1949 = null;
		}
		for (/**/; (anInt1896 ^ 0xffffffff) < (i_75_ ^ 0xffffffff); i_75_++) {
			if (aByteArray1906[i_75_] == i) {
				i_74_++;
			}
		}
		RSString[] class16s = new RSString[i_74_ + 1];
		if ((i_74_ ^ 0xffffffff) == -1) {
			class16s[0] = this;
			return class16s;
		}
		int i_76_ = 0;
		int i_77_ = 0;
		for (int i_78_ = 0; (i_78_ ^ 0xffffffff) > (i_74_ ^ 0xffffffff); i_78_++) {
			int i_79_;
			for (i_79_ = 0; aByteArray1906[i_77_ + i_79_] != i; i_79_++) {
				/* empty */
			}
			class16s[i_76_++] = method148(i_77_ - -i_79_, i_77_, !bool);
			i_77_ += i_79_ + 1;
		}
		class16s[i_74_] = method148(anInt1896, i_77_, !bool);
		return class16s;
	}
	
	final RSString method169(int i) {
		anInt1905++;
		int i_80_ = 0;
		int i_81_ = anInt1896;
		for (/**/; anInt1896 > i_80_; i_80_++) {
			if ((aByteArray1906[i_80_] < 0 || aByteArray1906[i_80_] > 32) && (0xff & aByteArray1906[i_80_]) != 160) {
				break;
			}
		}
		for (/**/; i_80_ < i_81_ && (aByteArray1906[-1 + i_81_] >= 0 && aByteArray1906[i_81_ - 1] <= 32 || (0xff & aByteArray1906[i_81_ + -1]) == 160); i_81_--) {
			/* empty */
		}
		if (i_80_ == 0 && (anInt1896 ^ 0xffffffff) == (i_81_ ^ 0xffffffff)) {
			return this;
		}
		if (i <= 37) {
			method171(-27);
		}
		RSString class16_82_ = new RSString();
		class16_82_.anInt1896 = i_81_ + -i_80_;
		class16_82_.aByteArray1906 = new byte[class16_82_.anInt1896];
		for (int i_83_ = 0; (i_83_ ^ 0xffffffff) > (class16_82_.anInt1896 ^ 0xffffffff); i_83_++)
			class16_82_.aByteArray1906[i_83_] = aByteArray1906[i_80_ + i_83_];
		return class16_82_;
	}
	
	final boolean method170(boolean bool) {
		if (bool != false) {
			aClass23_Sub13_Sub5_1901 = null;
		}
		anInt1900++;
		return method163(10, -59);
	}
	
	final int method171(int i) {
		anInt1926++;
		if (i != -61) {
			method171(7);
		}
		return anInt1896;
	}
	
	final RSString method172(int i, Applet applet) {
		anInt1922++;
		String string = new String(aByteArray1906, 0, anInt1896);
		if (i != -15988) {
			method160(null, null);
		}
		String string_84_ = applet.getParameter(string);
		if (string_84_ == null) {
			return null;
		}
		return Class23_Sub1.method235(string_84_, (byte) -94);
	}
	
	final int method173(int i, RSString class16_85_) {
		if (i < 14) {
			aClass23_Sub13_Sub5_1901 = null;
		}
		anInt1921++;
		return method161(-108, 0, class16_85_);
	}
	
	private final long method174(int i) {
		if (i != 17005) {
			aByteArray1906 = null;
		}
		anInt1894++;
		long l = 0L;
		for (int i_86_ = 0; i_86_ < anInt1896; i_86_++)
			l = (long) (0xff & aByteArray1906[i_86_]) + (-l + (l << 5));
		return l;
	}
	
	final RSString method175(int i) {
		long l = method174(17005);
		anInt1944++;
		synchronized (aClass1953 == null ? aClass1953 = method185("RSString") : aClass1953) {
			if (Class36.anOa572 == null) {
				Class36.anOa572 = new oa(4096);
			} else {
				for (Class23_Sub26 class23_sub26 = (Class23_Sub26) Class36.anOa572.a((byte) 108, l); class23_sub26 != null; class23_sub26 = (Class23_Sub26) Class36.anOa572.a((int) -27)) {
					if (method183(class23_sub26.aClass16_2472, (byte) -49)) {
						return class23_sub26.aClass16_2472;
					}
				}
			}
			Class23_Sub26 class23_sub26 = new Class23_Sub26();
			class23_sub26.aClass16_2472 = this;
			aBoolean1903 = false;
			Class36.anOa572.a(class23_sub26, (byte) -14, l);
		}
		if (i <= 87) {
			aClass16_1952 = null;
		}
		return this;
	}
	
	final boolean method176(RSString class16_87_, byte b) {
		if (b >= -59) {
			return true;
		}
		anInt1893++;
		if ((class16_87_.anInt1896 ^ 0xffffffff) < (anInt1896 ^ 0xffffffff)) {
			return false;
		}
		for (int i = 0; class16_87_.anInt1896 > i; i++) {
			if ((aByteArray1906[i] ^ 0xffffffff) != (class16_87_.aByteArray1906[i] ^ 0xffffffff)) {
				return false;
			}
		}
		return true;
	}
	
	final RSString method177(int i, int i_88_, int i_89_) {
		anInt1908++;
		byte b = (byte) i_88_;
		byte b_90_ = (byte) i;
		RSString class16_91_ = new RSString();
		class16_91_.anInt1896 = anInt1896;
		class16_91_.aByteArray1906 = new byte[anInt1896];
		for (int i_92_ = i_89_; i_92_ < anInt1896; i_92_++) {
			byte b_93_ = aByteArray1906[i_92_];
			if ((b_93_ ^ 0xffffffff) == (b ^ 0xffffffff)) {
				class16_91_.aByteArray1906[i_92_] = b_90_;
			} else {
				class16_91_.aByteArray1906[i_92_] = b_93_;
			}
		}
		return class16_91_;
	}
	
	public final int hashCode() {
		anInt1924++;
		return method146(255);
	}
	
	final RSString method178(byte b) {
		anInt1945++;
		if (!aBoolean1903) {
			throw new IllegalArgumentException();
		}
		anInt1916 = 0;
		if (anInt1896 != aByteArray1906.length) {
			byte[] bs = new byte[anInt1896];
			Class3.method56(aByteArray1906, 0, bs, 0, anInt1896);
			aByteArray1906 = bs;
		}
		if (b != -11) {
			return null;
		}
		return this;
	}
	
	public final boolean equals(Object object) {
		anInt1897++;
		if (object instanceof RSString) {
			return method183((RSString) object, (byte) -49);
		}
		throw new IllegalArgumentException();
	}
	
	final int method179(byte b, int i, int i_94_) {
		anInt1936++;
		byte b_95_ = (byte) i_94_;
		for (int i_96_ = i; i_96_ < anInt1896; i_96_++) {
			if (aByteArray1906[i_96_] == b_95_) {
				return i_96_;
			}
		}
		int i_97_ = -74 / ((b - 75) / 48);
		return -1;
	}
	
	public static void method180(byte b) {
		aClass23_Sub13_Sub5_1901 = null;
		aClass16_1946 = null;
		aClass16_1949 = null;
		aClass89_1951 = null;
		if (b > 78) {
			aClass16_1948 = null;
			aClass16_1952 = null;
			aClass105_1947 = null;
		}
	}
	
	final URL method181(URL url, int i) throws MalformedURLException {
		anInt1931++;
		if (i > -19) {
			return null;
		}
		return new URL(url, new String(aByteArray1906, 0, anInt1896));
	}
	
	static final int method182(int i) {
		anInt1919++;
		if (i != -157) {
			return -8;
		}
		return Class39.anInt605;
	}
	
	final boolean method183(RSString class16_98_, byte b) {
		anInt1895++;
		if (class16_98_ == null) {
			return false;
		}
		if (b != -49) {
			equals(null);
		}
		if ((anInt1896 ^ 0xffffffff) != (class16_98_.anInt1896 ^ 0xffffffff)) {
			return false;
		}
		if (!aBoolean1903 || !class16_98_.aBoolean1903) {
			if ((anInt1916 ^ 0xffffffff) == -1) {
				anInt1916 = method146(b ^ ~0xcf);
				if (anInt1916 == 0) {
					anInt1916 = 1;
				}
			}
			if ((class16_98_.anInt1916 ^ 0xffffffff) == -1) {
				class16_98_.anInt1916 = class16_98_.method146(255);
				if ((class16_98_.anInt1916 ^ 0xffffffff) == -1) {
					class16_98_.anInt1916 = 1;
				}
			}
			if ((class16_98_.anInt1916 ^ 0xffffffff) != (anInt1916 ^ 0xffffffff)) {
				return false;
			}
		}
		for (int i = 0; i < anInt1896; i++) {
			if ((class16_98_.aByteArray1906[i] ^ 0xffffffff) != (aByteArray1906[i] ^ 0xffffffff)) {
				return false;
			}
		}
		return true;
	}
	
	final long method184(int i) {
		anInt1927++;
		int i_99_ = 121 % ((i - 17) / 39);
		long l = 0L;
		for (int i_100_ = 0; i_100_ < anInt1896; i_100_++) {
			if (i_100_ >= 12) {
				break;
			}
			l *= 37L;
			int i_101_ = aByteArray1906[i_100_];
			if (i_101_ >= 65 && i_101_ <= 90) {
				l += (long) (-65 + i_101_ + 1);
			} else if (i_101_ >= 97 && i_101_ <= 122) {
				l += (long) (-97 + (1 + i_101_));
			} else if (i_101_ >= 48 && i_101_ <= 57) {
				l += (long) (-21 - -i_101_);
			}
		}
		for (/**/; l % 37L == 0L && (l ^ 0xffffffffffffffffL) != -1L; l /= 37L) {
			/* empty */
		}
		return l;
	}
	
	public final String toString() {
		anInt1935++;
		throw new RuntimeException();
	}
	
	/*synthetic*/ static Class method185(String string) {
		Class var_class;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
		}
		return var_class;
	}
}

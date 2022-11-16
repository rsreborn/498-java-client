/* Class103 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Class103
{
	private int anInt1715;
	private int[][][] anIntArrayArrayArray1716;
	private int anInt1717 = -1;
	static int anInt1718;
	private int anInt1719 = 0;
	static RSString aClass16_1720 = Class38_Sub6.method1076((byte) 86, "Spieler");
	private int anInt1721;
	static int anInt1722;
	private Class23_Sub24[] aClass23_Sub24Array1723;
	static int anInt1724 = 0;
	static RSString aClass16_1725;
	static RSString aClass16_1726;
	static int anInt1727;
	static int anInt1728 = 0;
	static int anInt1729;
	static int anInt1730;
	private Class89 aClass89_1731 = new Class89();
	static int anInt1732;
	protected boolean aBoolean1733 = false;
	
	static final int method1517(int i, int i_0_) {
		if (i > -40) {
			anInt1728 = -97;
		}
		anInt1718++;
		Class23_Sub13_Sub14 class23_sub13_sub14 = Class23_Sub13_Sub8_Sub1.method681(i_0_, false);
		int i_1_ = class23_sub13_sub14.anInt4015;
		int i_2_ = class23_sub13_sub14.anInt4010;
		int i_3_ = Class23_Sub4_Sub20.anIntArray3235[i_2_ + -i_1_];
		int i_4_ = class23_sub13_sub14.anInt4011;
		return i_3_ & Class23_Sub4_Sub26.anIntArray3323[i_4_] >> i_1_;
	}
	
	final int[][] method1518(int i, int i_5_) {
		anInt1722++;
		if (i != -29659) {
			anInt1721 = 64;
		}
		if ((anInt1721 ^ 0xffffffff) == (anInt1715 ^ 0xffffffff)) {
			aBoolean1733 = aClass23_Sub24Array1723[i_5_] == null;
			aClass23_Sub24Array1723[i_5_] = Class23_Sub4_Sub16.aClass23_Sub24_3152;
			return anIntArrayArrayArray1716[i_5_];
		}
		if (anInt1721 == 1) {
			aBoolean1733 = anInt1717 != i_5_;
			anInt1717 = i_5_;
			return anIntArrayArrayArray1716[0];
		}
		Class23_Sub24 class23_sub24 = aClass23_Sub24Array1723[i_5_];
		if (class23_sub24 != null) {
			aBoolean1733 = false;
		} else {
			aBoolean1733 = true;
			if ((anInt1721 ^ 0xffffffff) >= (anInt1719 ^ 0xffffffff)) {
				Class23_Sub24 class23_sub24_6_ = (Class23_Sub24) aClass89_1731.method1440(14);
				class23_sub24 = new Class23_Sub24(i_5_, class23_sub24_6_.anInt2444);
				aClass23_Sub24Array1723[class23_sub24_6_.anInt2452] = null;
				class23_sub24_6_.method228(i ^ ~0x73da);
			} else {
				class23_sub24 = new Class23_Sub24(i_5_, anInt1719);
				anInt1719++;
			}
			aClass23_Sub24Array1723[i_5_] = class23_sub24;
		}
		aClass89_1731.method1434(class23_sub24, -1);
		return anIntArrayArrayArray1716[class23_sub24.anInt2444];
	}
	
	final void method1519(int i) {
		for (int i_7_ = 0; (anInt1721 ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
			anIntArrayArrayArray1716[i_7_][0] = null;
			anIntArrayArrayArray1716[i_7_][1] = null;
			anIntArrayArrayArray1716[i_7_][2] = null;
			anIntArrayArrayArray1716[i_7_] = null;
		}
		aClass23_Sub24Array1723 = null;
		anIntArrayArrayArray1716 = null;
		int i_8_ = 119 % ((i - -2) / 55);
		aClass89_1731.method1435(26);
		aClass89_1731 = null;
		anInt1727++;
	}
	
	final int[][][] method1520(int i) {
		anInt1730++;
		if (anInt1715 != anInt1721) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (int i_9_ = 0; anInt1721 > i_9_; i_9_++)
			aClass23_Sub24Array1723[i_9_] = Class23_Sub4_Sub16.aClass23_Sub24_3152;
		int i_10_ = -114 % ((70 - i) / 47);
		return anIntArrayArrayArray1716;
	}
	
	static final void method1521(int i, int i_11_) {
		anInt1729++;
		if (Class49.anInt756 != i) {
			if ((Class49.anInt756 ^ 0xffffffff) == -1) {
				Class30.method958((byte) 11);
			}
			if (i_11_ != 27172) {
				aClass16_1726 = null;
			}
			if (i == 20 || i == 40) {
				Buffer.anInt2127 = 0;
				Class23_Sub13_Sub7.anInt3781 = 0;
				Class105_Sub1.anInt2854 = 0;
			}
			if (i != 20 && i != 40 && Class23_Sub13_Sub20.aClass34_4150 != null) {
				Class23_Sub13_Sub20.aClass34_4150.method976(false);
				Class23_Sub13_Sub20.aClass34_4150 = null;
			}
			if (Class49.anInt756 == 25) {
				Class23_Sub4_Sub17.anInt3179 = 0;
				Class23_Sub4_Sub25.anInt3311 = 0;
				Class23_Sub13_Sub1.anInt3667 = 1;
				Class23_Sub4_Sub9.anInt3036 = 0;
				Class23_Sub4_Sub10.anInt3055 = 1;
			}
			if (i == 5 || i == 10 || i == 20) {
				Class23_Sub4_Sub32.method401(Class23_Sub4_Sub27.aClass105_Sub1_3339, Class92.aClass105_Sub1_1561, Class71_Sub3.aCanvas2740, -128);
			} else {
				Class23_Sub12.method597(2);
			}
			Class49.anInt756 = i;
		}
	}
	
	static final String method1522(byte b, Throwable throwable) throws IOException {
		anInt1732++;
		String string;
		if (!(throwable instanceof RuntimeException_Sub1)) {
			string = "";
		} else {
			RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			string = runtimeexception_sub1.aString1850 + " | ";
			throwable = runtimeexception_sub1.aThrowable1848;
		}
		StringWriter stringwriter = new StringWriter();
		PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		int i = -43 / ((-11 - b) / 36);
		String string_12_ = stringwriter.toString();
		BufferedReader bufferedreader = new BufferedReader(new StringReader(string_12_));
		String string_13_ = bufferedreader.readLine();
		for (;;) {
			String string_14_ = bufferedreader.readLine();
			if (string_14_ == null) {
				break;
			}
			int i_15_ = string_14_.indexOf('(');
			int i_16_ = string_14_.indexOf(')', 1 + i_15_);
			if ((i_15_ ^ 0xffffffff) <= -1 && i_16_ >= 0) {
				String string_17_ = string_14_.substring(1 + i_15_, i_16_);
				int i_18_ = string_17_.indexOf(".java:");
				if (i_18_ >= 0) {
					string_17_ = string_17_.substring(0, i_18_) + string_17_.substring(i_18_ - -5);
					string += string_17_ + ' ';
					continue;
				}
				string_14_ = string_14_.substring(0, i_15_);
			}
			string_14_ = string_14_.trim();
			string_14_ = string_14_.substring(string_14_.lastIndexOf(' ') + 1);
			string_14_ = string_14_.substring(string_14_.lastIndexOf('\t') - -1);
			string += string_14_ + ' ';
		}
		string += "| " + (String) string_13_;
		return string;
	}
	
	public static void method1523(int i) {
		if (i >= 72) {
			aClass16_1726 = null;
			aClass16_1720 = null;
			aClass16_1725 = null;
		}
	}
	
	Class103(int i, int i_19_, int i_20_) {
		anInt1715 = i_19_;
		anInt1721 = i;
		aClass23_Sub24Array1723 = new Class23_Sub24[anInt1715];
		anIntArrayArrayArray1716 = new int[anInt1721][3][i_20_];
	}
	
	static {
		aClass16_1725 = Class38_Sub6.method1076((byte) 86, " loggt sich aus)3");
		aClass16_1726 = Class38_Sub6.method1076((byte) 86, " <col=00ff80>");
	}
}

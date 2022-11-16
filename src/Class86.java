/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class86 implements Interface1
{
	private Class105 aClass105_1855;
	static int anInt1856;
	static int anInt1857;
	static RSString aClass16_1858;
	static int anInt1859;
	static int anInt1860;
	static RSString aClass16_1861;
	static RSString aClass16_1862;
	static int anInt1863;
	static int anInt1864;
	static int anInt1865;
	private Class5 aClass5_1866;
	static boolean aBoolean1867 = false;
	static int anInt1868;
	private Class105 aClass105_1869;
	private int anInt1870 = 128;
	private static RSString aClass16_1871;
	static int anInt1872;
	private int anInt1873 = 50;
	static int anInt1874;
	
	public final boolean method7(int i, boolean bool) {
		anInt1868++;
		if (anInt1870 == 64 || method1402((byte) -100, i).anInt4121 == 64) {
			return true;
		}
		if (bool != false) {
			return true;
		}
		return false;
	}
	
	public final int[] method1(int i, int i_0_) {
		anInt1856++;
		if (i != 1) {
			anInt1870 = 107;
		}
		Class23_Sub13_Sub19 class23_sub13_sub19 = method1402((byte) 69, i_0_);
		return class23_sub13_sub19.method805(i + 122, aClass105_1869, anInt1870, this);
	}
	
	public final boolean method2(int i, int i_1_) {
		if (i > -3) {
			method1402((byte) -101, -92);
		}
		anInt1860++;
		return method1402((byte) -122, i_1_).aBoolean4106;
	}
	
	public final int method4(int i, byte b) {
		anInt1857++;
		if (b != 50) {
			return -59;
		}
		return method1402((byte) -83, i).anInt4105;
	}
	
	final void method1399(int i) {
		aClass5_1866 = new Class5(anInt1873);
		if (i == 1) {
			anInt1864++;
		}
	}
	
	final void method1400(int i, boolean bool) {
		anInt1863++;
		for (Class23_Sub13_Sub19 class23_sub13_sub19 = (Class23_Sub13_Sub19) aClass5_1866.method69(111); class23_sub13_sub19 != null; class23_sub13_sub19 = (Class23_Sub13_Sub19) aClass5_1866.method65(-1)) {
			if (class23_sub13_sub19.aBoolean4125) {
				class23_sub13_sub19.method806(i, (byte) 69);
				class23_sub13_sub19.aBoolean4125 = false;
			}
		}
		if (bool != true) {
			aClass5_1866 = null;
		}
	}
	
	public final int[] method6(int i, float f, int i_2_) {
		anInt1874++;
		if (i != 64) {
			return null;
		}
		Class23_Sub13_Sub19 class23_sub13_sub19 = method1402((byte) 51, i_2_);
		class23_sub13_sub19.aBoolean4125 = true;
		return class23_sub13_sub19.method810(124, f, this, aClass105_1869, anInt1870);
	}
	
	public static void method1401(boolean bool) {
		if (bool == false) {
			aClass16_1861 = null;
			aClass16_1871 = null;
			aClass16_1862 = null;
			aClass16_1858 = null;
		}
	}
	
	public final boolean method3(int i, boolean bool) {
		anInt1865++;
		if (bool != false) {
			return false;
		}
		return method1402((byte) 59, i).aBoolean4129;
	}
	
	public final boolean method5(int i, int i_3_) {
		anInt1872++;
		if (i_3_ < 59) {
			method5(-124, 57);
		}
		return method1402((byte) 85, i).method808((byte) -88, aClass105_1869, this);
	}
	
	private final Class23_Sub13_Sub19 method1402(byte b, int i) {
		anInt1859++;
		Class23_Sub13_Sub19 class23_sub13_sub19 = (Class23_Sub13_Sub19) aClass5_1866.method62(-106, (long) i);
		if (class23_sub13_sub19 != null) {
			return class23_sub13_sub19;
		}
		int i_4_ = -90 % ((-29 - b) / 50);
		byte[] bs = aClass105_1855.method1544(i, 0, 0);
		if (bs == null) {
			return Class38_Sub7_Sub2.method1096(-1);
		}
		Buffer class23_sub5 = new Buffer(bs);
		class23_sub13_sub19 = new Class23_Sub13_Sub19(class23_sub5);
		aClass5_1866.method67((long) i, class23_sub13_sub19, true);
		return class23_sub13_sub19;
	}
	
	Class86(Class105 class105, Class105 class105_5_, int i, int i_6_) {
		anInt1870 = i_6_;
		aClass105_1869 = class105_5_;
		aClass105_1855 = class105;
		anInt1873 = i;
		aClass5_1866 = new Class5(anInt1873);
	}
	
	static {
		aClass16_1861 = Class38_Sub6.method1076((byte) 86, " zuerst von Ihrer Ignorieren)2Liste(Q");
		aClass16_1871 = Class38_Sub6.method1076((byte) 86, "glow1:");
		aClass16_1858 = aClass16_1871;
		aClass16_1862 = aClass16_1871;
	}
}

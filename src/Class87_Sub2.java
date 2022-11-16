/* Class87_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class87_Sub2 extends Class87
{
	static int anInt2791;
	private final int anInt2792;
	private final int anInt2793;
	static int anInt2794;
	private static RSString aClass16_2795 = Class38_Sub6.method1076((byte) 86, "The server is being updated)3");
	private final int anInt2796;
	static int anInt2797;
	static Class81 aClass81_2798;
	static int anInt2799;
	private final int anInt2800;
	static Class105 aClass105_2801;
	static int anInt2802;
	static int anInt2803;
	static RSString aClass16_2804;
	static RSString aClass16_2805 = Class38_Sub6.method1076((byte) 86, "<col=00ffff>");
	static int anInt2806;
	
	public static void method1412(byte b) {
		aClass16_2804 = null;
		aClass81_2798 = null;
		aClass16_2805 = null;
		if (b != 64) {
			aClass16_2795 = null;
		}
		aClass16_2795 = null;
		aClass105_2801 = null;
	}
	
	static final RSString method1413(RSString class16, byte b) {
		anInt2791++;
		Class23_Sub21 class23_sub21 = Class71_Sub1.method1269(class16, (byte) 79);
		if (class23_sub21 == null) {
			return Class31.aClass16_486;
		}
		if (b <= 74) {
			aClass16_2804 = null;
		}
		return class23_sub21.aClass16_2411;
	}
	
	static final Class23_Sub13_Sub16 method1414(int i, byte b) {
		anInt2799++;
		if (b > -4) {
			method1412((byte) 42);
		}
		Class23_Sub13_Sub16 class23_sub13_sub16 = (Class23_Sub13_Sub16) Class67.aClass5_1173.method62(-3, (long) i);
		if (class23_sub13_sub16 != null) {
			return class23_sub13_sub16;
		}
		class23_sub13_sub16 = Class68.method1253((byte) 123, i, Class23_Sub4_Sub27.aClass105_3340, false, Class40.aClass105_630);
		if (class23_sub13_sub16 != null) {
			Class67.aClass5_1173.method67((long) i, class23_sub13_sub16, true);
		}
		return class23_sub13_sub16;
	}
	
	final void method1408(int i, int i_0_, int i_1_) {
		anInt2802++;
		if (i_1_ >= -101) {
			method1409(-80, 75, -40);
		}
		int i_2_ = anInt2800 * i >> 12;
		int i_3_ = i * anInt2793 >> 12;
		int i_4_ = anInt2792 * i_0_ >> 12;
		int i_5_ = anInt2796 * i_0_ >> 12;
		Class23_Sub4_Sub7.method294(anInt1494, i_3_, anInt1481, i_2_, anInt1487, 2048, i_4_, i_5_);
	}
	
	static final int method1415(int i, byte b) {
		if (b <= 49) {
			aClass16_2795 = null;
		}
		anInt2806++;
		return i >>> 7;
	}
	
	final void method1409(int i, int i_6_, int i_7_) {
		anInt2803++;
		int i_8_ = anInt2793 * i >> 12;
		int i_9_ = anInt2796 * i_7_ >> 12;
		int i_10_ = anInt2792 * i_7_ >> 12;
		int i_11_ = anInt2800 * i >> 12;
		if (i_6_ >= 31) {
			Class107.method1581(anInt1487, i_11_, (byte) -40, i_8_, i_9_, i_10_, anInt1494);
		}
	}
	
	Class87_Sub2(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
		super(i_15_, i_16_, i_17_);
		anInt2800 = i_13_;
		anInt2792 = i_12_;
		anInt2793 = i;
		anInt2796 = i_14_;
	}
	
	final void method1406(int i, int i_18_, int i_19_) {
		int i_20_ = i_19_ * anInt2793 >> 12;
		int i_21_ = anInt2800 * i_19_ >> 12;
		int i_22_ = anInt2792 * i_18_ >> 12;
		int i_23_ = anInt2796 * i_18_ >> 12;
		if (i != 1) {
			aClass16_2805 = null;
		}
		anInt2797++;
		Class78_Sub2.method1358(i_22_, i_23_, i_20_, (byte) 111, i_21_, anInt1481);
	}
	
	static {
		aClass16_2804 = aClass16_2795;
		aClass81_2798 = new Class81(50);
	}
}

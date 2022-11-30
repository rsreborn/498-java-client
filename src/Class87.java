/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.ActionEvent;

abstract class Class87
{
	protected int anInt1481;
	static RSString aClass16_1482;
	private static RSString aClass16_1483 = Class38_Sub6.method1076((byte) 86, "Loaded sprites");
	static short aShort1484;
	static int anInt1485;
	static int anInt1486;
	protected int anInt1487;
	static Class5 aClass5_1488;
	static long aLong1489;
	static int anInt1490;
	static int[][] anIntArrayArray1491 = { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
	static int anInt1492;
	static RSString aClass16_1493 = Class38_Sub6.method1076((byte) 86, "Konfig geladen)3");
	protected int anInt1494;
	static int anInt1495;
	static Class105 aClass105_1496;
	
	static final int method1403(int i, int i_0_, byte b, int i_1_) {
		anInt1486++;
		int i_2_ = i_1_ / i_0_;
		int i_3_ = i / i_0_;
		int i_4_ = -1 + i_0_ & i;
		int i_5_ = i_0_ + -1 & i_1_;
		if (b > -17) {
			method1405(null, 86, null);
		}
		int i_6_ = Class23_Sub15.method870(4, i_2_, i_3_);
		int i_7_ = Class23_Sub15.method870(4, i_2_, 1 + i_3_);
		int i_8_ = Class23_Sub15.method870(4, 1 + i_2_, i_3_);
		int i_9_ = Class23_Sub15.method870(4, 1 + i_2_, 1 + i_3_);
		int i_10_ = Class24.method918(i_4_, i_7_, i_6_, 0, i_0_);
		int i_11_ = Class24.method918(i_4_, i_9_, i_8_, 0, i_0_);
		return Class24.method918(i_5_, i_11_, i_10_, 0, i_0_);
	}
	
	public static void method1404(int i) {
		aClass16_1493 = null;
		if (i != -13896) {
			method1404(74);
		}
		aClass5_1488 = null;
		anIntArrayArray1491 = null;
		aClass16_1483 = null;
		aClass16_1482 = null;
		aClass105_1496 = null;
	}
	
	static final void method1405(Object object, int i, Class9 class9) {
		anInt1485++;
		if (class9.anEventQueue189 != null) {
			for (int i_12_ = i; i_12_ < 50 && class9.anEventQueue189.peekEvent() != null; i_12_++)
				Class105.method1545((byte) -84, 1L);
			if (object != null) {
				class9.anEventQueue189.postEvent(new ActionEvent(object, 1001, "dummy"));
			}
		}
	}
	
	abstract void method1406(int i, int i_13_, int i_14_);
	
	static final Class87_Sub3 method1407(Buffer class23_sub5, int i) {
		anInt1492++;
		if (i != 0) {
			return null;
		}
		return new Class87_Sub3(class23_sub5.method474(true), class23_sub5.method474(true), class23_sub5.method474(true), class23_sub5.method474(true), class23_sub5.method471(103), class23_sub5.readByte());
	}
	
	abstract void method1408(int i, int i_15_, int i_16_);
	
	abstract void method1409(int i, int i_17_, int i_18_);
	
	Class87(int i, int i_19_, int i_20_) {
		anInt1487 = i_19_;
		anInt1481 = i;
		anInt1494 = i_20_;
	}
	
	static {
		aLong1489 = 0L;
		aClass16_1482 = aClass16_1483;
		aShort1484 = (short) 256;
		aClass5_1488 = new Class5(64);
	}
}

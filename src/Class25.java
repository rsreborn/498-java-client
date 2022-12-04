/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class25
{
	static int anInt379;
	static Class105 aClass105_380;
	static int anInt381;
	static int[] anIntArray382 = { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
	static int anInt383 = 0;
	static int anInt384;
	private static RSString aClass16_385 = Class38_Sub6.method1076((byte) 86, "Loaded fonts");
	static RSString aClass16_386 = Class38_Sub6.method1076((byte) 86, "auf einer freien Welt zu spielen)3");
	static int anInt387;
	static int anInt388 = 0;
	static int anInt389;
	static int anInt390;
	static int anInt391;
	static RSString aClass16_392;
	
	public static void method920(byte b) {
		aClass16_392 = null;
		int i = -11 % ((-90 - b) / 36);
		aClass16_385 = null;
		aClass105_380 = null;
		aClass16_386 = null;
		anIntArray382 = null;
	}
	
	static final boolean method921(int i, byte b) {
		int i_0_ = -104 % ((b - 22) / 49);
		anInt389++;
		if ((-i & i ^ 0xffffffff) != (i ^ 0xffffffff)) {
			return false;
		}
		return true;
	}
	
	static final NPCDefinition method922(boolean bool, int i) {
		anInt384++;
		NPCDefinition class23_sub13_sub20 = (NPCDefinition) Class1.aClass5_64.method62(-99, (long) i);
		if (class23_sub13_sub20 != null) {
			return class23_sub13_sub20;
		}
		if (bool != false) {
			method923(-70, 102);
		}
		byte[] bs = Class23_Sub13_Sub21.aClass105_4193.method1544(NPCDefinition.method823(i, -1), 0, Class23_Sub13_Sub19.method807(i, (byte) -125));
		class23_sub13_sub20 = new NPCDefinition();
		class23_sub13_sub20.anInt4159 = i;
		if (bs != null) {
			class23_sub13_sub20.method816(13404, new Buffer(bs));
		}
		class23_sub13_sub20.method825(3);
		Class1.aClass5_64.method67((long) i, class23_sub13_sub20, !bool);
		return class23_sub13_sub20;
	}
	
	static final int method923(int i, int i_1_) {
		anInt391++;
		if (i_1_ != 255) {
			return -100;
		}
		return i & 0xff;
	}
	
	static {
		anInt379 = 0;
		aClass16_392 = aClass16_385;
	}
}

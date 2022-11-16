/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class73
{
	static int anInt1315;
	static Class89 aClass89_1316;
	static int anInt1317;
	static CacheIndex aClass13_1318;
	static int anInt1319 = 0;
	private static RSString aClass16_1320;
	static int anInt1321;
	static RSString aClass16_1322;
	static RSString aClass16_1323;
	static Buffer aClass23_Sub5_1324;
	static int anInt1325;
	static RSString aClass16_1326;
	static RSString aClass16_1327;
	
	public static void method1310(int i) {
		aClass16_1322 = null;
		aClass13_1318 = null;
		aClass16_1323 = null;
		aClass16_1326 = null;
		aClass16_1327 = null;
		aClass89_1316 = null;
		if (i != 8) {
			aClass16_1320 = null;
		}
		aClass23_Sub5_1324 = null;
		aClass16_1320 = null;
	}
	
	static final byte[] method1311(int i, boolean bool, Object object) {
		anInt1317++;
		if (object == null) {
			return null;
		}
		if (object instanceof byte[]) {
			byte[] bs = (byte[]) object;
			if (bool) {
				return Class23_Sub24.method904(bs, (byte) 118);
			}
			return bs;
		}
		if (object instanceof Class63) {
			Class63 class63 = (Class63) object;
			return class63.method1210(0);
		}
		if (i >= -45) {
			aClass89_1316 = null;
		}
		throw new IllegalArgumentException();
	}
	
	static final Class87_Sub2 method1312(Buffer class23_sub5, int i) {
		anInt1315++;
		if (i != 23090) {
			return null;
		}
		return new Class87_Sub2(class23_sub5.method474(true), class23_sub5.method474(true), class23_sub5.method474(true), class23_sub5.method474(true), class23_sub5.method471(62), class23_sub5.method471(56), class23_sub5.method461(-1797813752));
	}
	
	static {
		aClass89_1316 = new Class89();
		aClass16_1320 = Class38_Sub6.method1076((byte) 86, "Created gameworld");
		aClass16_1322 = Class38_Sub6.method1076((byte) 86, "null");
		anInt1325 = 1;
		aClass16_1323 = Class38_Sub6.method1076((byte) 86, "sich mit einer anderen Welt zu verbinden)3");
		aClass16_1327 = aClass16_1320;
		aClass16_1326 = Class38_Sub6.method1076((byte) 86, "60 Sekunden noch einmal)3)3)3");
		aClass23_Sub5_1324 = new Buffer(8);
	}
}

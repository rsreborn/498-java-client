/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.Inflater;

public class Class102
{
	static int anInt1701 = 0;
	static int anInt1702;
	static int anInt1703;
	static int[] anIntArray1704;
	private Inflater anInflater1705;
	static int anInt1706;
	static int anInt1707;
	private static RSString aClass16_1708 = Class38_Sub6.method1076((byte) 86, "RuneScape is loading )2 please wait)3)3)3");
	static RSString aClass16_1709;
	static int[] anIntArray1710;
	static RSString aClass16_1711;
	static int anInt1712;
	static int[][][] anIntArrayArrayArray1713;
	static RSString aClass16_1714;
	
	public static void method1514(int i) {
		aClass16_1714 = null;
		aClass16_1708 = null;
		if (i >= -87) {
			method1514(84);
		}
		anIntArray1710 = null;
		aClass16_1709 = null;
		anIntArrayArrayArray1713 = null;
		aClass16_1711 = null;
		anIntArray1704 = null;
	}
	
	static final boolean method1515(Class105 class105, Class23_Sub10_Sub2 class23_sub10_sub2, Class105 class105_0_, int i, Class105 class105_1_) {
		if (i >= -52) {
			aClass16_1709 = null;
		}
		client.aClass105_1955 = class105_0_;
		Class81.aClass23_Sub10_Sub2_1437 = class23_sub10_sub2;
		Class23_Sub11.aClass105_2287 = class105_1_;
		anInt1707++;
		Class44.aClass105_674 = class105;
		return true;
	}
	
	final void method1516(byte[] bs, boolean bool, Buffer class23_sub5) {
		anInt1703++;
		if (class23_sub5.payload[class23_sub5.pos] != 31 || class23_sub5.payload[1 + class23_sub5.pos] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (anInflater1705 == null) {
			anInflater1705 = new Inflater(true);
		}
		if (bool != false) {
			method1515(null, null, null, -9, null);
		}
		try {
			anInflater1705.setInput(class23_sub5.payload, class23_sub5.pos + 10, -10 + (-class23_sub5.pos - 8 + class23_sub5.payload.length));
			anInflater1705.inflate(bs);
		} catch (Exception exception) {
			anInflater1705.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		anInflater1705.reset();
	}
	
	public Class102() {
		this(-1, 1000000, 1000000);
	}
	
	private Class102(int i, int i_2_, int i_3_) {
		/* empty */
	}
	
	static {
		anIntArray1704 = new int[1000];
		aClass16_1709 = aClass16_1708;
		aClass16_1711 = Class38_Sub6.method1076((byte) 86, "Hidden)2use");
		anInt1712 = -1;
		aClass16_1714 = Class38_Sub6.method1076((byte) 86, "leuchten3:");
	}
}

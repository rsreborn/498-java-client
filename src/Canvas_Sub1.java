/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public class Canvas_Sub1 extends Canvas
{
	static RSString aClass16_45 = Class38_Sub6.method1076((byte) 86, "huffman");
	static int anInt46;
	static RSString aClass16_47 = Class38_Sub6.method1076((byte) 86, ":assist:");
	private Component aComponent48;
	static RSString aClass16_49 = Class38_Sub6.method1076((byte) 86, "Cabbage");
	static int anInt50;
	static int anInt51;
	static RSString aClass16_52 = Class38_Sub6.method1076((byte) 86, "Regeln versto-8en hat)3");
	static int anInt53;
	static byte[][] aByteArrayArray54 = new byte[1000][];
	static int anInt55;
	
	public static void method42(int i) {
		aClass16_52 = null;
		aClass16_49 = null;
		aByteArrayArray54 = null;
		if (i != 1000) {
			aByteArrayArray54 = null;
		}
		aClass16_47 = null;
		aClass16_45 = null;
	}
	
	public final void update(Graphics graphics) {
		anInt46++;
		aComponent48.update(graphics);
	}
	
	static final int method43(byte b, int i, int i_0_) {
		anInt53++;
		if (b != -18) {
			aClass16_49 = null;
		}
		Class23_Sub17 class23_sub17 = (Class23_Sub17) Class23_Sub4_Sub7.anOa2997.a((byte) -50, (long) i_0_);
		if (class23_sub17 == null) {
			return 0;
		}
		if ((i ^ 0xffffffff) > -1 || class23_sub17.anIntArray2364.length <= i) {
			return 0;
		}
		return class23_sub17.anIntArray2364[i];
	}
	
	Canvas_Sub1(Component component) {
		aComponent48 = component;
	}
	
	public final void paint(Graphics graphics) {
		anInt50++;
		aComponent48.paint(graphics);
	}
}
